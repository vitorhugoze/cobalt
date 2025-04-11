package it.auties.whatsapp.model.signal.message;

import it.auties.whatsapp.model.signal.message.SignalMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignalMessageSpec {
    public static byte[] encode(SignalMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignalMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var ephemeralPublicKey = protoInputObject.ephemeralPublicKey();
        if (ephemeralPublicKey != null) {
            var ephemeralPublicKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ephemeralPublicKey);
            if (ephemeralPublicKey0 != null) {
                protoOutputStream.writeBytes(1, ephemeralPublicKey0);
            }
        }
        var counter = protoInputObject.counter();
        if (counter != null) {
            protoOutputStream.writeUInt32(2, counter);
        }
        var previousCounter = protoInputObject.previousCounter();
        if (previousCounter != null) {
            protoOutputStream.writeUInt32(3, previousCounter);
        }
        var ciphertext = protoInputObject.ciphertext();
        if (ciphertext != null) {
            var ciphertext0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ciphertext);
            if (ciphertext0 != null) {
                protoOutputStream.writeBytes(4, ciphertext0);
            }
        }
    }

    public static SignalMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignalMessage decode(ProtobufInputStream protoInputStream) {
        byte[] ephemeralPublicKey = null;
        java.lang.Integer counter = null;
        java.lang.Integer previousCounter = null;
        byte[] ciphertext = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> ephemeralPublicKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> counter = protoInputStream.readInt32();
                case 3 -> previousCounter = protoInputStream.readInt32();
                case 4 -> ciphertext = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.message.SignalMessage(ephemeralPublicKey, counter, previousCounter, ciphertext);
    }

    public static int sizeOf(SignalMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var ephemeralPublicKey = protoInputObject.ephemeralPublicKey();
        if (ephemeralPublicKey != null) {
            var ephemeralPublicKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ephemeralPublicKey);
            if (ephemeralPublicKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(ephemeralPublicKey0);
            }
        }
        var counter = protoInputObject.counter();
        if (counter != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(counter);
        }
        var previousCounter = protoInputObject.previousCounter();
        if (previousCounter != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(previousCounter);
        }
        var ciphertext = protoInputObject.ciphertext();
        if (ciphertext != null) {
            var ciphertext0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ciphertext);
            if (ciphertext0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(ciphertext0);
            }
        }
        return protoOutputSize;
    }

}
