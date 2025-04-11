package it.auties.whatsapp.model.signal.keypair;

import it.auties.whatsapp.model.signal.keypair.SignalPreKeyPair;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignalPreKeyPairSpec {
    public static byte[] encode(SignalPreKeyPair protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignalPreKeyPair protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        protoOutputStream.writeInt32(1, id);
        var publicKey = protoInputObject.publicKey();
        if (publicKey != null) {
            var publicKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(publicKey);
            if (publicKey0 != null) {
                protoOutputStream.writeBytes(2, publicKey0);
            }
        }
        var privateKey = protoInputObject.privateKey();
        if (privateKey != null) {
            var privateKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(privateKey);
            if (privateKey0 != null) {
                protoOutputStream.writeBytes(3, privateKey0);
            }
        }
    }

    public static SignalPreKeyPair decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignalPreKeyPair decode(ProtobufInputStream protoInputStream) {
        int id = 0;
        byte[] publicKey = null;
        byte[] privateKey = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = protoInputStream.readInt32();
                case 2 -> publicKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> privateKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.keypair.SignalPreKeyPair(id, publicKey, privateKey);
    }

    public static int sizeOf(SignalPreKeyPair protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(id);
        var publicKey = protoInputObject.publicKey();
        if (publicKey != null) {
            var publicKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(publicKey);
            if (publicKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(publicKey0);
            }
        }
        var privateKey = protoInputObject.privateKey();
        if (privateKey != null) {
            var privateKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(privateKey);
            if (privateKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(privateKey0);
            }
        }
        return protoOutputSize;
    }

}
