package it.auties.whatsapp.model.signal.keypair;

import it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignalSignedKeyPairSpec {
    public static byte[] encode(SignalSignedKeyPair protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignalSignedKeyPair protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        protoOutputStream.writeInt32(1, id);
        var keyPair = protoInputObject.keyPair();
        if (keyPair != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(keyPair));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(keyPair, protoOutputStream);
        }
        var signature = protoInputObject.signature();
        if (signature != null) {
            var signature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signature);
            if (signature0 != null) {
                protoOutputStream.writeBytes(3, signature0);
            }
        }
    }

    public static SignalSignedKeyPair decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignalSignedKeyPair decode(ProtobufInputStream protoInputStream) {
        int id = 0;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair keyPair = null;
        byte[] signature = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = protoInputStream.readInt32();
                case 2 -> keyPair = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> signature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair(id, keyPair, signature);
    }

    public static int sizeOf(SignalSignedKeyPair protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(id);
        var keyPair = protoInputObject.keyPair();
        if (keyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var keyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(keyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keyPairSerializedSize);
            protoOutputSize += keyPairSerializedSize;
        }
        var signature = protoInputObject.signature();
        if (signature != null) {
            var signature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signature);
            if (signature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(signature0);
            }
        }
        return protoOutputSize;
    }

}
