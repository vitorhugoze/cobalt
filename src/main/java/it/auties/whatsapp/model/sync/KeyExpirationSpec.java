package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.KeyExpiration;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class KeyExpirationSpec {
    public static byte[] encode(KeyExpiration protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(KeyExpiration protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var expiredKeyEpoch = protoInputObject.expiredKeyEpoch();
        if (expiredKeyEpoch != null) {
            protoOutputStream.writeInt32(1, expiredKeyEpoch);
        }
    }

    public static KeyExpiration decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static KeyExpiration decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer expiredKeyEpoch = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> expiredKeyEpoch = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.KeyExpiration(expiredKeyEpoch);
    }

    public static int sizeOf(KeyExpiration protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var expiredKeyEpoch = protoInputObject.expiredKeyEpoch();
        if (expiredKeyEpoch != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(expiredKeyEpoch);
        }
        return protoOutputSize;
    }

}
