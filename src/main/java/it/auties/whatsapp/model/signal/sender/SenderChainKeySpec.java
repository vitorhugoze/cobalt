package it.auties.whatsapp.model.signal.sender;

import it.auties.whatsapp.model.signal.sender.SenderChainKey;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderChainKeySpec {
    public static byte[] encode(SenderChainKey protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderChainKey protoInputObject, ProtobufOutputStream protoOutputStream) {
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
    }

    public static SenderChainKey decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderChainKey decode(ProtobufInputStream protoInputStream) {
        int iteration = 0;
        byte[] seed = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> iteration = protoInputStream.readInt32();
                case 2 -> seed = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.sender.SenderChainKey(iteration, seed);
    }

    public static int sizeOf(SenderChainKey protoInputObject) {
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
        return protoOutputSize;
    }

}
