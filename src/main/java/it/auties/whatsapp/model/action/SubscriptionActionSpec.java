package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.SubscriptionAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SubscriptionActionSpec {
    public static byte[] encode(SubscriptionAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SubscriptionAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var deactivated = protoInputObject.deactivated();
        protoOutputStream.writeBool(1, deactivated);
        var autoRenewing = protoInputObject.autoRenewing();
        protoOutputStream.writeBool(2, autoRenewing);
        var expirationDateSeconds = protoInputObject.expirationDateSeconds();
        protoOutputStream.writeInt64(3, expirationDateSeconds);
    }

    public static SubscriptionAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SubscriptionAction decode(ProtobufInputStream protoInputStream) {
        boolean deactivated = false;
        boolean autoRenewing = false;
        long expirationDateSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> deactivated = protoInputStream.readBool();
                case 2 -> autoRenewing = protoInputStream.readBool();
                case 3 -> expirationDateSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.SubscriptionAction(deactivated, autoRenewing, expirationDateSeconds);
    }

    public static int sizeOf(SubscriptionAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var deactivated = protoInputObject.deactivated();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var autoRenewing = protoInputObject.autoRenewing();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += 1;
        var expirationDateSeconds = protoInputObject.expirationDateSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(expirationDateSeconds);
        return protoOutputSize;
    }

}
