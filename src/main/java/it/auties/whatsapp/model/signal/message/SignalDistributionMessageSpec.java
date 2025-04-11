package it.auties.whatsapp.model.signal.message;

import it.auties.whatsapp.model.signal.message.SignalDistributionMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignalDistributionMessageSpec {
    public static byte[] encode(SignalDistributionMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignalDistributionMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            protoOutputStream.writeUInt32(1, id);
        }
        var iteration = protoInputObject.iteration();
        if (iteration != null) {
            protoOutputStream.writeUInt32(2, iteration);
        }
        var chainKey = protoInputObject.chainKey();
        if (chainKey != null) {
            var chainKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chainKey);
            if (chainKey0 != null) {
                protoOutputStream.writeBytes(3, chainKey0);
            }
        }
        var signingKey = protoInputObject.signingKey();
        if (signingKey != null) {
            var signingKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signingKey);
            if (signingKey0 != null) {
                protoOutputStream.writeBytes(4, signingKey0);
            }
        }
    }

    public static SignalDistributionMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignalDistributionMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer id = null;
        java.lang.Integer iteration = null;
        byte[] chainKey = null;
        byte[] signingKey = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = protoInputStream.readInt32();
                case 2 -> iteration = protoInputStream.readInt32();
                case 3 -> chainKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> signingKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.message.SignalDistributionMessage(id, iteration, chainKey, signingKey);
    }

    public static int sizeOf(SignalDistributionMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(id);
        }
        var iteration = protoInputObject.iteration();
        if (iteration != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(iteration);
        }
        var chainKey = protoInputObject.chainKey();
        if (chainKey != null) {
            var chainKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chainKey);
            if (chainKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(chainKey0);
            }
        }
        var signingKey = protoInputObject.signingKey();
        if (signingKey != null) {
            var signingKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signingKey);
            if (signingKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(signingKey0);
            }
        }
        return protoOutputSize;
    }

}
