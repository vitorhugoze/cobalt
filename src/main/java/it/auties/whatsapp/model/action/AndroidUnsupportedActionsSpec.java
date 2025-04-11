package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.AndroidUnsupportedActions;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AndroidUnsupportedActionsSpec {
    public static byte[] encode(AndroidUnsupportedActions protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AndroidUnsupportedActions protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var allowed = protoInputObject.allowed();
        protoOutputStream.writeBool(1, allowed);
    }

    public static AndroidUnsupportedActions decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AndroidUnsupportedActions decode(ProtobufInputStream protoInputStream) {
        boolean allowed = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> allowed = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.AndroidUnsupportedActions(allowed);
    }

    public static int sizeOf(AndroidUnsupportedActions protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var allowed = protoInputObject.allowed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
