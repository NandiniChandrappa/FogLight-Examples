package com.ociweb.iot.valveManifold.schema;

import com.ociweb.pronghorn.pipe.FieldReferenceOffsetManager;
import com.ociweb.pronghorn.pipe.MessageSchema;
import com.ociweb.pronghorn.pipe.Pipe;
import com.ociweb.pronghorn.pipe.PipeReader;
import com.ociweb.pronghorn.pipe.PipeWriter;

public class ValveSchema extends MessageSchema<ValveSchema> {

    public final static FieldReferenceOffsetManager FROM = new FieldReferenceOffsetManager(
            new int[]{0xc0400003, 0x80000000, 0x80000001, 0xc0200003, 0xc0400003, 0x80000000, 0x80000002, 0xc0200003, 0xc0400003, 0x80000000, 0x80000003, 0xc0200003, 0xc0400003, 0x80000000, 0x80000004, 0xc0200003, 0xc0400003, 0x80000000, 0x80000005, 0xc0200003, 0xc0400003, 0x80000000, 0x80000006, 0xc0200003, 0xc0400003, 0x80000000, 0x88000007, 0xc0200003, 0xc0400003, 0x80000000, 0x80000008, 0xc0200003, 0xc0400003, 0x80000000, 0xa8000000, 0xc0200003, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400002, 0x80000000, 0xc0200002, 0xc0400003, 0x80000000, 0x80000009, 0xc0200003},
            (short) 0,
            new String[]{"ValveSerialNumber", "Station", "ValveSerialNumber", null, "LifeCycleCount", "Station",
                    "LifeCycleCount", null, "SupplyPressure", "Station", "SupplyPressure", null, "DurationOfLast1_4Signal",
                    "Station", "DurationOfLast1_4Signal", null, "DurationOfLast1_2Signal", "Station", "DurationOfLast1_2Signal",
                    null, "EqualizationAveragePressure", "Station", "EqualizationAveragePressure", null, "EqualizationPressureRate",
                    "Station", "EqualizationPressureRate", null, "ResidualOfDynamicAnalysis", "Station", "ResidualOfDynamicAnalysis",
                    null, "PartNumber", "Station", "PartNumber", null, "ValveFault/False", "Station", null, "ValveFault/True",
                    "Station", null, "PressureFault/Low", "Station", null, "PressureFault/None", "Station",
                    null, "PressureFault/High", "Station", null, "LeakFault/False", "Station", null, "LeakFault/True",
                    "Station", null, "PressurePoint", "Station", "PressurePoint", null},
            new long[]{311, 1, 11, 0, 312, 1, 12, 0, 313, 1, 13, 0, 314, 1, 14, 0, 315, 1, 15, 0, 316, 1, 16, 0, 317, 1, 17, 0, 318, 1, 18, 0, 330, 1, 30, 0, 340, 1, 0, 341, 1, 0, 350, 1, 0, 351, 1, 0, 352, 1, 0, 360, 1, 0, 361, 1, 0, 319, 1, 19, 0},
            new String[]{"global", null, null, null, "global", null, null, null, "global", null, null, null, "global",
                    null, null, null, "global", null, null, null, "global", null, null, null, "global", null, null,
                    null, "global", null, null, null, "global", null, null, null, "global", null, null, "global",
                    null, null, "global", null, null, "global", null, null, "global", null, null, "global", null,
                    null, "global", null, null, "global", null, null, null},
            "ValveSchema.xml",
            new long[]{2, 2, 0},
            new int[]{2, 2, 0});

    protected ValveSchema() {
        super(FROM);
    }

    public static final ValveSchema instance = new ValveSchema();

    public static final int MSG_VALVESERIALNUMBER_311 = 0x00000000;
    public static final int MSG_VALVESERIALNUMBER_311_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_VALVESERIALNUMBER_311_FIELD_VALVESERIALNUMBER_11 = 0x00000002;
    public static final int MSG_LIFECYCLECOUNT_312 = 0x00000004;
    public static final int MSG_LIFECYCLECOUNT_312_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_LIFECYCLECOUNT_312_FIELD_LIFECYCLECOUNT_12 = 0x00000002;
    public static final int MSG_SUPPLYPRESSURE_313 = 0x00000008;
    public static final int MSG_SUPPLYPRESSURE_313_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_SUPPLYPRESSURE_313_FIELD_SUPPLYPRESSURE_13 = 0x00000002;
    public static final int MSG_DURATIONOFLAST1_4SIGNAL_314 = 0x0000000c;
    public static final int MSG_DURATIONOFLAST1_4SIGNAL_314_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_DURATIONOFLAST1_4SIGNAL_314_FIELD_DURATIONOFLAST1_4SIGNAL_14 = 0x00000002;
    public static final int MSG_DURATIONOFLAST1_2SIGNAL_315 = 0x00000010;
    public static final int MSG_DURATIONOFLAST1_2SIGNAL_315_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_DURATIONOFLAST1_2SIGNAL_315_FIELD_DURATIONOFLAST1_2SIGNAL_15 = 0x00000002;
    public static final int MSG_EQUALIZATIONAVERAGEPRESSURE_316 = 0x00000014;
    public static final int MSG_EQUALIZATIONAVERAGEPRESSURE_316_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_EQUALIZATIONAVERAGEPRESSURE_316_FIELD_EQUALIZATIONAVERAGEPRESSURE_16 = 0x00000002;
    public static final int MSG_EQUALIZATIONPRESSURERATE_317 = 0x00000018;
    public static final int MSG_EQUALIZATIONPRESSURERATE_317_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_EQUALIZATIONPRESSURERATE_317_FIELD_EQUALIZATIONPRESSURERATE_17 = 0x00400002;
    public static final int MSG_RESIDUALOFDYNAMICANALYSIS_318 = 0x0000001c;
    public static final int MSG_RESIDUALOFDYNAMICANALYSIS_318_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_RESIDUALOFDYNAMICANALYSIS_318_FIELD_RESIDUALOFDYNAMICANALYSIS_18 = 0x00000002;
    public static final int MSG_PARTNUMBER_330 = 0x00000020;
    public static final int MSG_PARTNUMBER_330_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_PARTNUMBER_330_FIELD_PARTNUMBER_30 = 0x01400002;
    public static final int MSG_VALVEFAULT_FALSE_340 = 0x00000024;
    public static final int MSG_VALVEFAULT_FALSE_340_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_VALVEFAULT_TRUE_341 = 0x00000027;
    public static final int MSG_VALVEFAULT_TRUE_341_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_PRESSUREFAULT_LOW_350 = 0x0000002a;
    public static final int MSG_PRESSUREFAULT_LOW_350_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_PRESSUREFAULT_NONE_351 = 0x0000002d;
    public static final int MSG_PRESSUREFAULT_NONE_351_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_PRESSUREFAULT_HIGH_352 = 0x00000030;
    public static final int MSG_PRESSUREFAULT_HIGH_352_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_LEAKFAULT_FALSE_360 = 0x00000033;
    public static final int MSG_LEAKFAULT_FALSE_360_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_LEAKFAULT_TRUE_361 = 0x00000036;
    public static final int MSG_LEAKFAULT_TRUE_361_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_PRESSUREPOINT_319 = 0x00000039;
    public static final int MSG_PRESSUREPOINT_319_FIELD_STATION_1 = 0x00000001;
    public static final int MSG_PRESSUREPOINT_319_FIELD_PRESSUREPOINT_19 = 0x00000002;


    public static void consume(Pipe<ValveSchema> input) {
        while (PipeReader.tryReadFragment(input)) {
            int msgIdx = PipeReader.getMsgIdx(input);
            switch (msgIdx) {
                case MSG_VALVESERIALNUMBER_311:
                    consumeValveSerialNumber(input);
                    break;
                case MSG_LIFECYCLECOUNT_312:
                    consumeLifeCycleCount(input);
                    break;
                case MSG_SUPPLYPRESSURE_313:
                    consumeSupplyPressure(input);
                    break;
                case MSG_DURATIONOFLAST1_4SIGNAL_314:
                    consumeDurationOfLast1_4Signal(input);
                    break;
                case MSG_DURATIONOFLAST1_2SIGNAL_315:
                    consumeDurationOfLast1_2Signal(input);
                    break;
                case MSG_EQUALIZATIONAVERAGEPRESSURE_316:
                    consumeEqualizationAveragePressure(input);
                    break;
                case MSG_EQUALIZATIONPRESSURERATE_317:
                    consumeEqualizationPressureRate(input);
                    break;
                case MSG_RESIDUALOFDYNAMICANALYSIS_318:
                    consumeResidualOfDynamicAnalysis(input);
                    break;
                case MSG_PARTNUMBER_330:
                    consumePartNumber(input);
                    break;
                case MSG_VALVEFAULT_FALSE_340:
                    consumeValveFault_False(input);
                    break;
                case MSG_VALVEFAULT_TRUE_341:
                    consumeValveFault_True(input);
                    break;
                case MSG_PRESSUREFAULT_LOW_350:
                    consumePressureFault_Low(input);
                    break;
                case MSG_PRESSUREFAULT_NONE_351:
                    consumePressureFault_None(input);
                    break;
                case MSG_PRESSUREFAULT_HIGH_352:
                    consumePressureFault_High(input);
                    break;
                case MSG_LEAKFAULT_FALSE_360:
                    consumeLeakFault_False(input);
                    break;
                case MSG_LEAKFAULT_TRUE_361:
                    consumeLeakFault_True(input);
                    break;
                case MSG_PRESSUREPOINT_319:
                    consumePressurePoint(input);
                    break;
                case -1:
                    //requestShutdown();
                    break;
            }
            PipeReader.releaseReadLock(input);
        }
    }

    public static void consumeValveSerialNumber(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_VALVESERIALNUMBER_311_FIELD_STATION_1);
        int fieldValveSerialNumber = PipeReader.readInt(input, MSG_VALVESERIALNUMBER_311_FIELD_VALVESERIALNUMBER_11);
    }

    public static void consumeLifeCycleCount(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_LIFECYCLECOUNT_312_FIELD_STATION_1);
        int fieldLifeCycleCount = PipeReader.readInt(input, MSG_LIFECYCLECOUNT_312_FIELD_LIFECYCLECOUNT_12);
    }

    public static void consumeSupplyPressure(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_SUPPLYPRESSURE_313_FIELD_STATION_1);
        int fieldSupplyPressure = PipeReader.readInt(input, MSG_SUPPLYPRESSURE_313_FIELD_SUPPLYPRESSURE_13);
    }

    public static void consumeDurationOfLast1_4Signal(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_DURATIONOFLAST1_4SIGNAL_314_FIELD_STATION_1);
        int fieldDurationOfLast1_4Signal = PipeReader.readInt(input, MSG_DURATIONOFLAST1_4SIGNAL_314_FIELD_DURATIONOFLAST1_4SIGNAL_14);
    }

    public static void consumeDurationOfLast1_2Signal(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_DURATIONOFLAST1_2SIGNAL_315_FIELD_STATION_1);
        int fieldDurationOfLast1_2Signal = PipeReader.readInt(input, MSG_DURATIONOFLAST1_2SIGNAL_315_FIELD_DURATIONOFLAST1_2SIGNAL_15);
    }

    public static void consumeEqualizationAveragePressure(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_EQUALIZATIONAVERAGEPRESSURE_316_FIELD_STATION_1);
        int fieldEqualizationAveragePressure = PipeReader.readInt(input, MSG_EQUALIZATIONAVERAGEPRESSURE_316_FIELD_EQUALIZATIONAVERAGEPRESSURE_16);
    }

    public static void consumeEqualizationPressureRate(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_EQUALIZATIONPRESSURERATE_317_FIELD_STATION_1);
        int fieldEqualizationPressureRate = PipeReader.readInt(input, MSG_EQUALIZATIONPRESSURERATE_317_FIELD_EQUALIZATIONPRESSURERATE_17);
    }

    public static void consumeResidualOfDynamicAnalysis(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_RESIDUALOFDYNAMICANALYSIS_318_FIELD_STATION_1);
        int fieldResidualOfDynamicAnalysis = PipeReader.readInt(input, MSG_RESIDUALOFDYNAMICANALYSIS_318_FIELD_RESIDUALOFDYNAMICANALYSIS_18);
    }

    public static void consumePartNumber(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_PARTNUMBER_330_FIELD_STATION_1);
        StringBuilder fieldPartNumber = PipeReader.readUTF8(input, MSG_PARTNUMBER_330_FIELD_PARTNUMBER_30, new StringBuilder(PipeReader.readBytesLength(input, MSG_PARTNUMBER_330_FIELD_PARTNUMBER_30)));
    }

    public static void consumeValveFault_False(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_VALVEFAULT_FALSE_340_FIELD_STATION_1);
    }

    public static void consumeValveFault_True(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_VALVEFAULT_TRUE_341_FIELD_STATION_1);
    }

    public static void consumePressureFault_Low(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_PRESSUREFAULT_LOW_350_FIELD_STATION_1);
    }

    public static void consumePressureFault_None(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_PRESSUREFAULT_NONE_351_FIELD_STATION_1);
    }

    public static void consumePressureFault_High(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_PRESSUREFAULT_HIGH_352_FIELD_STATION_1);
    }

    public static void consumeLeakFault_False(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_LEAKFAULT_FALSE_360_FIELD_STATION_1);
    }

    public static void consumeLeakFault_True(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_LEAKFAULT_TRUE_361_FIELD_STATION_1);
    }

    public static void consumePressurePoint(Pipe<ValveSchema> input) {
        int fieldStation = PipeReader.readInt(input, MSG_PRESSUREPOINT_319_FIELD_STATION_1);
        int fieldPressurePoint = PipeReader.readInt(input, MSG_PRESSUREPOINT_319_FIELD_PRESSUREPOINT_19);
    }

    public static void publishValveSerialNumber(Pipe<ValveSchema> output, int fieldStation, int fieldValveSerialNumber) {
        PipeWriter.presumeWriteFragment(output, MSG_VALVESERIALNUMBER_311);
        PipeWriter.writeInt(output, MSG_VALVESERIALNUMBER_311_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_VALVESERIALNUMBER_311_FIELD_VALVESERIALNUMBER_11, fieldValveSerialNumber);
        PipeWriter.publishWrites(output);
    }

    public static void publishLifeCycleCount(Pipe<ValveSchema> output, int fieldStation, int fieldLifeCycleCount) {
        PipeWriter.presumeWriteFragment(output, MSG_LIFECYCLECOUNT_312);
        PipeWriter.writeInt(output, MSG_LIFECYCLECOUNT_312_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_LIFECYCLECOUNT_312_FIELD_LIFECYCLECOUNT_12, fieldLifeCycleCount);
        PipeWriter.publishWrites(output);
    }

    public static void publishSupplyPressure(Pipe<ValveSchema> output, int fieldStation, int fieldSupplyPressure) {
        PipeWriter.presumeWriteFragment(output, MSG_SUPPLYPRESSURE_313);
        PipeWriter.writeInt(output, MSG_SUPPLYPRESSURE_313_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_SUPPLYPRESSURE_313_FIELD_SUPPLYPRESSURE_13, fieldSupplyPressure);
        PipeWriter.publishWrites(output);
    }

    public static void publishDurationOfLast1_4Signal(Pipe<ValveSchema> output, int fieldStation, int fieldDurationOfLast1_4Signal) {
        PipeWriter.presumeWriteFragment(output, MSG_DURATIONOFLAST1_4SIGNAL_314);
        PipeWriter.writeInt(output, MSG_DURATIONOFLAST1_4SIGNAL_314_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_DURATIONOFLAST1_4SIGNAL_314_FIELD_DURATIONOFLAST1_4SIGNAL_14, fieldDurationOfLast1_4Signal);
        PipeWriter.publishWrites(output);
    }

    public static void publishDurationOfLast1_2Signal(Pipe<ValveSchema> output, int fieldStation, int fieldDurationOfLast1_2Signal) {
        PipeWriter.presumeWriteFragment(output, MSG_DURATIONOFLAST1_2SIGNAL_315);
        PipeWriter.writeInt(output, MSG_DURATIONOFLAST1_2SIGNAL_315_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_DURATIONOFLAST1_2SIGNAL_315_FIELD_DURATIONOFLAST1_2SIGNAL_15, fieldDurationOfLast1_2Signal);
        PipeWriter.publishWrites(output);
    }

    public static void publishEqualizationAveragePressure(Pipe<ValveSchema> output, int fieldStation, int fieldEqualizationAveragePressure) {
        PipeWriter.presumeWriteFragment(output, MSG_EQUALIZATIONAVERAGEPRESSURE_316);
        PipeWriter.writeInt(output, MSG_EQUALIZATIONAVERAGEPRESSURE_316_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_EQUALIZATIONAVERAGEPRESSURE_316_FIELD_EQUALIZATIONAVERAGEPRESSURE_16, fieldEqualizationAveragePressure);
        PipeWriter.publishWrites(output);
    }

    public static void publishEqualizationPressureRate(Pipe<ValveSchema> output, int fieldStation, int fieldEqualizationPressureRate) {
        PipeWriter.presumeWriteFragment(output, MSG_EQUALIZATIONPRESSURERATE_317);
        PipeWriter.writeInt(output, MSG_EQUALIZATIONPRESSURERATE_317_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_EQUALIZATIONPRESSURERATE_317_FIELD_EQUALIZATIONPRESSURERATE_17, fieldEqualizationPressureRate);
        PipeWriter.publishWrites(output);
    }

    public static void publishResidualOfDynamicAnalysis(Pipe<ValveSchema> output, int fieldStation, int fieldResidualOfDynamicAnalysis) {
        PipeWriter.presumeWriteFragment(output, MSG_RESIDUALOFDYNAMICANALYSIS_318);
        PipeWriter.writeInt(output, MSG_RESIDUALOFDYNAMICANALYSIS_318_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_RESIDUALOFDYNAMICANALYSIS_318_FIELD_RESIDUALOFDYNAMICANALYSIS_18, fieldResidualOfDynamicAnalysis);
        PipeWriter.publishWrites(output);
    }

    public static void publishPartNumber(Pipe<ValveSchema> output, int fieldStation, CharSequence fieldPartNumber) {
        PipeWriter.presumeWriteFragment(output, MSG_PARTNUMBER_330);
        PipeWriter.writeInt(output, MSG_PARTNUMBER_330_FIELD_STATION_1, fieldStation);
        PipeWriter.writeUTF8(output, MSG_PARTNUMBER_330_FIELD_PARTNUMBER_30, fieldPartNumber);
        PipeWriter.publishWrites(output);
    }

    public static void publishValveFault_False(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_VALVEFAULT_FALSE_340);
        PipeWriter.writeInt(output, MSG_VALVEFAULT_FALSE_340_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishValveFault_True(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_VALVEFAULT_TRUE_341);
        PipeWriter.writeInt(output, MSG_VALVEFAULT_TRUE_341_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishPressureFault_Low(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_PRESSUREFAULT_LOW_350);
        PipeWriter.writeInt(output, MSG_PRESSUREFAULT_LOW_350_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishPressureFault_None(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_PRESSUREFAULT_NONE_351);
        PipeWriter.writeInt(output, MSG_PRESSUREFAULT_NONE_351_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishPressureFault_High(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_PRESSUREFAULT_HIGH_352);
        PipeWriter.writeInt(output, MSG_PRESSUREFAULT_HIGH_352_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishLeakFault_False(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_LEAKFAULT_FALSE_360);
        PipeWriter.writeInt(output, MSG_LEAKFAULT_FALSE_360_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishLeakFault_True(Pipe<ValveSchema> output, int fieldStation) {
        PipeWriter.presumeWriteFragment(output, MSG_LEAKFAULT_TRUE_361);
        PipeWriter.writeInt(output, MSG_LEAKFAULT_TRUE_361_FIELD_STATION_1, fieldStation);
        PipeWriter.publishWrites(output);
    }

    public static void publishPressurePoint(Pipe<ValveSchema> output, int fieldStation, int fieldPressurePoint) {
        PipeWriter.presumeWriteFragment(output, MSG_PRESSUREPOINT_319);
        PipeWriter.writeInt(output, MSG_PRESSUREPOINT_319_FIELD_STATION_1, fieldStation);
        PipeWriter.writeInt(output, MSG_PRESSUREPOINT_319_FIELD_PRESSUREPOINT_19, fieldPressurePoint);
        PipeWriter.publishWrites(output);
    }
}