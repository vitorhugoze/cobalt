package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.TimeFormatAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class TimeFormatActionSpec {
    public static byte[] encode(TimeFormatAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(TimeFormatAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var twentyFourHourFormatEnabled = protoInputObject.twentyFourHourFormatEnabled();
        protoOutputStream.writeBool(1, twentyFourHourFormatEnabled);
    }

    public static TimeFormatAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static TimeFormatAction decode(ProtobufInputStream protoInputStream) {
        boolean twentyFourHourFormatEnabled = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> twentyFourHourFormatEnabled = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.TimeFormatAction(twentyFourHourFormatEnabled);
    }

    public static int sizeOf(TimeFormatAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var twentyFourHourFormatEnabled = protoInputObject.twentyFourHourFormatEnabled();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
