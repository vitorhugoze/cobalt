package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.RequestPaymentMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class RequestPaymentMessageSpec {
    public static byte[] encode(RequestPaymentMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(RequestPaymentMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var currency = protoInputObject.currency();
        if (currency != null) {
            var currency0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currency);
            if (currency0 != null) {
                protoOutputStream.writeString(1, currency0);
            }
        }
        var amount1000 = protoInputObject.amount1000();
        protoOutputStream.writeUInt64(2, amount1000);
        var requestFrom = protoInputObject.requestFrom();
        if (requestFrom != null) {
            var requestFrom0 = requestFrom.toString();
            if (requestFrom0 != null) {
                var requestFrom1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(requestFrom0);
                if (requestFrom1 != null) {
                    protoOutputStream.writeString(3, requestFrom1);
                }
            }
        }
        var noteMessage = protoInputObject.noteMessage();
        if (noteMessage != null) {
            var noteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(noteMessage);
            if (noteMessage0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(noteMessage0));
                it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(noteMessage0, protoOutputStream);
            }
        }
        var expiryTimestampSeconds = protoInputObject.expiryTimestampSeconds();
        protoOutputStream.writeUInt64(5, expiryTimestampSeconds);
        var amount = protoInputObject.amount();
        if (amount != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.payment.PaymentMoneySpec.sizeOf(amount));
            it.auties.whatsapp.model.payment.PaymentMoneySpec.encode(amount, protoOutputStream);
        }
        var background = protoInputObject.background();
        if (background != null) {
            var background0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(background);
            if (background0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.payment.PaymentBackgroundSpec.sizeOf(background0));
                it.auties.whatsapp.model.payment.PaymentBackgroundSpec.encode(background0, protoOutputStream);
            }
        }
    }

    public static RequestPaymentMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static RequestPaymentMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String currency = null;
        long amount1000 = 0l;
        it.auties.whatsapp.model.jid.Jid requestFrom = null;
        java.util.Optional<it.auties.whatsapp.model.message.model.MessageContainer> noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        long expiryTimestampSeconds = 0l;
        it.auties.whatsapp.model.payment.PaymentMoney amount = null;
        java.util.Optional<it.auties.whatsapp.model.payment.PaymentBackground> background = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> currency = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> amount1000 = protoInputStream.readInt64();
                case 3 -> requestFrom = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> expiryTimestampSeconds = protoInputStream.readInt64();
                case 6 -> amount = it.auties.whatsapp.model.payment.PaymentMoneySpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> background = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.payment.PaymentBackgroundSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.payment.RequestPaymentMessage(currency, amount1000, requestFrom, noteMessage, expiryTimestampSeconds, amount, background);
    }

    public static int sizeOf(RequestPaymentMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var currency = protoInputObject.currency();
        if (currency != null) {
            var currency0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currency);
            if (currency0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(currency0);
            }
        }
        var amount1000 = protoInputObject.amount1000();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(amount1000);
        var requestFrom = protoInputObject.requestFrom();
        if (requestFrom != null) {
            var requestFrom0 = requestFrom.toString();
            if (requestFrom0 != null) {
                var requestFrom1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(requestFrom0);
                if (requestFrom1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(requestFrom1);
                }
            }
        }
        var noteMessage = protoInputObject.noteMessage();
        if (noteMessage != null) {
            var noteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(noteMessage);
            if (noteMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var noteMessageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(noteMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(noteMessageSerializedSize);
                protoOutputSize += noteMessageSerializedSize;
            }
        }
        var expiryTimestampSeconds = protoInputObject.expiryTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(expiryTimestampSeconds);
        var amount = protoInputObject.amount();
        if (amount != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var amountSerializedSize = it.auties.whatsapp.model.payment.PaymentMoneySpec.sizeOf(amount);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(amountSerializedSize);
            protoOutputSize += amountSerializedSize;
        }
        var background = protoInputObject.background();
        if (background != null) {
            var background0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(background);
            if (background0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var backgroundSerializedSize = it.auties.whatsapp.model.payment.PaymentBackgroundSpec.sizeOf(background0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(backgroundSerializedSize);
                protoOutputSize += backgroundSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
