package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.SendPaymentMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SendPaymentMessageSpec {
    public static byte[] encode(SendPaymentMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SendPaymentMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var noteMessage = protoInputObject.noteMessage();
        if (noteMessage != null) {
            var noteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(noteMessage);
            if (noteMessage0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(noteMessage0));
                it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(noteMessage0, protoOutputStream);
            }
        }
        var requestMessageKey = protoInputObject.requestMessageKey();
        if (requestMessageKey != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(requestMessageKey));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(requestMessageKey, protoOutputStream);
        }
        var background = protoInputObject.background();
        if (background != null) {
            var background0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(background);
            if (background0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.payment.PaymentBackgroundSpec.sizeOf(background0));
                it.auties.whatsapp.model.payment.PaymentBackgroundSpec.encode(background0, protoOutputStream);
            }
        }
    }

    public static SendPaymentMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SendPaymentMessage decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.message.model.MessageContainer> noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.message.model.ChatMessageKey requestMessageKey = null;
        java.util.Optional<it.auties.whatsapp.model.payment.PaymentBackground> background = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 2 -> noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> requestMessageKey = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> background = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.payment.PaymentBackgroundSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.payment.SendPaymentMessage(noteMessage, requestMessageKey, background);
    }

    public static int sizeOf(SendPaymentMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var noteMessage = protoInputObject.noteMessage();
        if (noteMessage != null) {
            var noteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(noteMessage);
            if (noteMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var noteMessageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(noteMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(noteMessageSerializedSize);
                protoOutputSize += noteMessageSerializedSize;
            }
        }
        var requestMessageKey = protoInputObject.requestMessageKey();
        if (requestMessageKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var requestMessageKeySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(requestMessageKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(requestMessageKeySerializedSize);
            protoOutputSize += requestMessageKeySerializedSize;
        }
        var background = protoInputObject.background();
        if (background != null) {
            var background0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(background);
            if (background0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var backgroundSerializedSize = it.auties.whatsapp.model.payment.PaymentBackgroundSpec.sizeOf(background0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(backgroundSerializedSize);
                protoOutputSize += backgroundSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
