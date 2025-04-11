package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeclinePaymentRequestMessageSpec {
    public static byte[] encode(DeclinePaymentRequestMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeclinePaymentRequestMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
    }

    public static DeclinePaymentRequestMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeclinePaymentRequestMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage(key);
    }

    public static int sizeOf(DeclinePaymentRequestMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var keySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keySerializedSize);
            protoOutputSize += keySerializedSize;
        }
        return protoOutputSize;
    }

}
