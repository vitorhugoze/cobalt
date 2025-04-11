package it.auties.whatsapp.model.signal.sender;

import it.auties.whatsapp.model.signal.sender.SenderMessageKey;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderMessageKeySpec {
    public static byte[] encode(SenderMessageKey protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderMessageKey protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var iteration = protoInputObject.iteration();
        protoOutputStream.writeInt32(1, iteration);
        var seed = protoInputObject.seed();
        if (seed != null) {
            var seed0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(seed);
            if (seed0 != null) {
                protoOutputStream.writeBytes(2, seed0);
            }
        }
        var iv = protoInputObject.iv();
        if (iv != null) {
            var iv0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(iv);
            if (iv0 != null) {
                protoOutputStream.writeBytes(3, iv0);
            }
        }
        var cipherKey = protoInputObject.cipherKey();
        if (cipherKey != null) {
            var cipherKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(cipherKey);
            if (cipherKey0 != null) {
                protoOutputStream.writeBytes(4, cipherKey0);
            }
        }
    }

    public static SenderMessageKey decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderMessageKey decode(ProtobufInputStream protoInputStream) {
        int iteration = 0;
        byte[] seed = null;
        byte[] iv = null;
        byte[] cipherKey = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> iteration = protoInputStream.readInt32();
                case 2 -> seed = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> iv = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> cipherKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.sender.SenderMessageKey(iteration, seed, iv, cipherKey);
    }

    public static int sizeOf(SenderMessageKey protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var iteration = protoInputObject.iteration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(iteration);
        var seed = protoInputObject.seed();
        if (seed != null) {
            var seed0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(seed);
            if (seed0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(seed0);
            }
        }
        var iv = protoInputObject.iv();
        if (iv != null) {
            var iv0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(iv);
            if (iv0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(iv0);
            }
        }
        var cipherKey = protoInputObject.cipherKey();
        if (cipherKey != null) {
            var cipherKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(cipherKey);
            if (cipherKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(cipherKey0);
            }
        }
        return protoOutputSize;
    }

}
