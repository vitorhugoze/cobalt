package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.NuxAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NuxActionSpec {
    public static byte[] encode(NuxAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NuxAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var acknowledged = protoInputObject.acknowledged();
        protoOutputStream.writeBool(1, acknowledged);
    }

    public static NuxAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NuxAction decode(ProtobufInputStream protoInputStream) {
        boolean acknowledged = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> acknowledged = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.NuxAction(acknowledged);
    }

    public static int sizeOf(NuxAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var acknowledged = protoInputObject.acknowledged();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
