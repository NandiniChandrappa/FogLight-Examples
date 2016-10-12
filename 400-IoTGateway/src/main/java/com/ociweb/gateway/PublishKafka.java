package com.ociweb.gateway;

import java.util.Properties;
import java.util.List;
import java.util.ArrayList;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ociweb.iot.maker.DeviceRuntime;
import com.ociweb.iot.maker.PayloadReader;
import com.ociweb.iot.maker.PubSubListener;
import com.ociweb.pronghorn.util.Appendables;

public class PublishKafka implements PubSubListener {

	private static final Logger logger = LoggerFactory.getLogger(PublishKafka.class);
	private final Properties properties=new Properties();
	private final String kafkaTopic = new String("open24");
	private final long MILLISECONDS_PER_SECOND = 1000;

	public PublishKafka(DeviceRuntime runtime, String kafkaURI) {
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaURI);
		properties.put(ProducerConfig.ACKS_CONFIG, "all");
		properties.put(ProducerConfig.BLOCK_ON_BUFFER_FULL_CONFIG, "true");
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
	}

	private String createPriceMessage(long epochSeconds, String fuelName, int priceInCents){
		// price.{{ station_no }} {{ timestamp }} {{ value }} station={{ station_no } type={{ regular | premium | diesel}}
		StringBuilder builder = new StringBuilder();
		builder.append("price.1 ");
		builder.append(Long.toString(epochSeconds));
		builder.append(" ");
		builder.append(priceInCents);
		builder.append(" station=1 type=");
		builder.append(fuelName);
		return builder.toString();
	}

	private String createVolumeMessage(long epochSeconds, String fuelName, int totalUnits){
		// volume.{{ station_no }} {{ timestamp }} {{ value }} pump={{ pump_no }} type={{ regular | premium | diesel }}
		StringBuilder builder = new StringBuilder();
		builder.append("volume.1 ");
		builder.append(Long.toString(epochSeconds));
		builder.append(" ");
		builder.append(totalUnits);
		builder.append(" pump=1 type=");
		builder.append(fuelName);
		return builder.toString();
	}

	private String createLevelMessage(long epochSeconds, int volumCM2, String fuelName){

		// level.{{ station_no }} {{ timestamp }} {{ value }} station={{ station_no }} type={{ regular | premium | diesel }}
		StringBuilder builder = new StringBuilder();
		builder.append("level.1 ");
		builder.append(Long.toString(epochSeconds));
		builder.append(" ");
		builder.append(volumCM2);
		builder.append(" station=1 type=");
		builder.append(fuelName);
		return builder.toString();
	}

	@Override
	public void message(CharSequence topic, PayloadReader payload) {

		String sensorTopic = payload.readUTF();

		CharSequence[] topicSubArray = Appendables.split(sensorTopic, '/');
		//[0] will be the root
		//[1] will be the name of the station
		//[2] will be the type of message either pump or tank

		List<String> values = new ArrayList<>();

		if ("total".equals(topicSubArray[2])) { //purchase total

			long epochSeconds = payload.readLong()/MILLISECONDS_PER_SECOND;
			String fuelName   = payload.readUTF();
			int priceInCents  = payload.readInt(); // dollers * 100 or pennies
			int totalUnits    = payload.readInt(); // units * 100

			values.add(createPriceMessage(epochSeconds, fuelName, priceInCents));
			values.add(createVolumeMessage(epochSeconds, fuelName, totalUnits));
		}

		if ("tank".equals(topicSubArray[2])) {

			long epochSeconds = payload.readLong()/MILLISECONDS_PER_SECOND;
			int volumCM2 = payload.readInt();
			String fuelName = payload.readUTF();

			values.add(createLevelMessage(epochSeconds, volumCM2, fuelName));
		}

		KafkaProducer<String,String> producer = null;
		try {
			producer = new KafkaProducer<String,String>(properties);
			for(String value:values){
				System.out.println("got MQTT topic:" + sensorTopic + " kafkaTopic:" + kafkaTopic + " payload:" + value);
				producer.send(new ProducerRecord<String,String>(kafkaTopic, kafkaTopic, value));
			}
		} catch (Throwable e) {
			//logger.warn("unable to send to kafka.",e);
	    } finally {
		    if (null!=producer) {
		    	producer.close();
		    }
	    }
	}

}