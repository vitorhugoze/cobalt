package it.auties.whatsapp.model.signal.message;

import it.auties.whatsapp.model.signal.message.SenderKeyMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderKeyMessageSpec {
    public static byte[] encode(SenderKeyMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderKeyMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var cipherText = protoInputObject.cipherText();
        if (cipherText != null) {
            var cipherText0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(cipherText);
            if (cipherText0 != null) {
                protoOutputStream.writeBytes(3, cipherText0);
            }
        }
    }

    public static SenderKeyMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderKeyMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer id = null;
        java.lang.Integer iteration = null;
        byte[] cipherText = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = protoInputStream.readInt32();
                case 2 -> iteration = protoInputStream.readInt32();
                case 3 -> cipherText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.message.SenderKeyMessage(id, iteration, cipherText);
    }

    public static int sizeOf(SenderKeyMessage protoInputObject) {
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
        var cipherText = protoInputObject.cipherText();
        if (cipherText != null) {
            var cipherText0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(cipherText);
            if (cipherText0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(cipherText0);
            }
        }
        return protoOutputSize;
    }

}
