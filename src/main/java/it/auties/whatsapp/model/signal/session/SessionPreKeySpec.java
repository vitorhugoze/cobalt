package it.auties.whatsapp.model.signal.session;

import it.auties.whatsapp.model.signal.session.SessionPreKey;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SessionPreKeySpec {
    public static byte[] encode(SessionPreKey protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SessionPreKey protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var preKeyId = protoInputObject.preKeyId();
        if (preKeyId != null) {
            protoOutputStream.writeInt32(1, preKeyId);
        }
        var baseKey = protoInputObject.baseKey();
        if (baseKey != null) {
            var baseKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(baseKey);
            if (baseKey0 != null) {
                protoOutputStream.writeBytes(2, baseKey0);
            }
        }
        var signedKeyId = protoInputObject.signedKeyId();
        protoOutputStream.writeInt32(3, signedKeyId);
    }

    public static SessionPreKey decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SessionPreKey decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer preKeyId = null;
        byte[] baseKey = null;
        int signedKeyId = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> preKeyId = protoInputStream.readInt32();
                case 2 -> baseKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> signedKeyId = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.session.SessionPreKey(preKeyId, baseKey, signedKeyId);
    }

    public static int sizeOf(SessionPreKey protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var preKeyId = protoInputObject.preKeyId();
        if (preKeyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(preKeyId);
        }
        var baseKey = protoInputObject.baseKey();
        if (baseKey != null) {
            var baseKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(baseKey);
            if (baseKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(baseKey0);
            }
        }
        var signedKeyId = protoInputObject.signedKeyId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(signedKeyId);
        return protoOutputSize;
    }

}
