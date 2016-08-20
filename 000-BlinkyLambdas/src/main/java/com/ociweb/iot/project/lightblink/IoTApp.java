/**
 * blinkerChannel is a CommandChannel created to transport data. 
 * Data is published to the channel. When  the blinkerChannel is
 * subscribed to the channel, the published data can also be accessed 
 * by playload.writeInt()from the channel.
 * <p>
 * Lambda expressions are introduced in Java 8 to facilitate functional 
 * programming. A Lambda expression is usually written using syntax 
 * (argument) -> (body). 
 * <p>
 * The writeInt( 1==value ? 0 : 1 ).publish() allows the data to alternate
 * between 0 and 1
 */


package com.ociweb.iot.project.lightblink;

import static com.ociweb.iot.grove.GroveTwig.LED;

import com.ociweb.iot.maker.CommandChannel;
import com.ociweb.iot.maker.DeviceRuntime;
import com.ociweb.iot.maker.Hardware;
import com.ociweb.iot.maker.IoTSetup;
import com.ociweb.iot.maker.Port;

import static com.ociweb.iot.maker.Port.*;

public class IoTApp implements IoTSetup {
    
    private static final String TOPIC = "light";
    private static final int PAUSE = 500;
    
    public static final Port LED_PORT = D4;
           
    public static void main( String[] args) {
        DeviceRuntime.run(new IoTApp());
    }    
    
    @Override
    public void declareConnections(Hardware c) {
        c.connect(LED, D4);
    }

    @Override
    public void declareBehavior(DeviceRuntime runtime) {
        
        final CommandChannel blinkerChannel = runtime.newCommandChannel();        
        runtime.addPubSubListener((topic,payload)->{           
		    int value = payload.readInt();
		    blinkerChannel.setValueAndBlock(LED_PORT, value, PAUSE);               
		    blinkerChannel.openTopic(TOPIC).writeInt( 1==value ? 0 : 1 ).publish();
		    
		}).addSubscription(TOPIC); 
                
        final CommandChannel startupChannel = runtime.newCommandChannel(); 
        runtime.addStartupListener(
                ()->{
                    startupChannel.openTopic(TOPIC).writeInt( 1 ).publish();
                });        
    }  
}
