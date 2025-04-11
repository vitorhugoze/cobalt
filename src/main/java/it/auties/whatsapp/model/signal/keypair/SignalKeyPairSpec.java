package it.auties.whatsapp.model.signal.keypair;

import it.auties.whatsapp.model.signal.keypair.SignalKeyPair;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignalKeyPairSpec {
    public static byte[] encode(SignalKeyPair protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignalKeyPair protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var publicKey = protoInputObject.publicKey();
        if (publicKey != null) {
            var publicKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(publicKey);
            if (publicKey0 != null) {
                protoOutputStream.writeBytes(1, publicKey0);
            }
        }
        var privateKey = protoInputObject.privateKey();
        if (privateKey != null) {
            var privateKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(privateKey);
            if (privateKey0 != null) {
                protoOutputStream.writeBytes(2, privateKey0);
            }
        }
    }

    public static SignalKeyPair decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignalKeyPair decode(ProtobufInputStream protoInputStream) {
        byte[] publicKey = null;
        byte[] privateKey = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> publicKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> privateKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.keypair.SignalKeyPair(publicKey, privateKey);
    }

    public static int sizeOf(SignalKeyPair protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var publicKey = protoInputObject.publicKey();
        if (publicKey != null) {
            var publicKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(publicKey);
            if (publicKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(publicKey0);
            }
        }
        var privateKey = protoInputObject.privateKey();
        if (privateKey != null) {
            var privateKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(privateKey);
            if (privateKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(privateKey0);
            }
        }
        return protoOutputSize;
    }

}
