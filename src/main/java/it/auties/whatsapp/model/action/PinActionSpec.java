package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.PinAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PinActionSpec {
    public static byte[] encode(PinAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PinAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var pinned = protoInputObject.pinned();
        protoOutputStream.writeBool(1, pinned);
    }

    public static PinAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PinAction decode(ProtobufInputStream protoInputStream) {
        boolean pinned = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> pinned = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.PinAction(pinned);
    }

    public static int sizeOf(PinAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var pinned = protoInputObject.pinned();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
