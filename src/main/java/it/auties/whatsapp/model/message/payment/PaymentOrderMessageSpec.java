package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.PaymentOrderMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PaymentOrderMessageSpec {
    public static byte[] encode(PaymentOrderMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PaymentOrderMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputStream.writeBytes(2, thumbnail1);
                }
            }
        }
        var itemCount = protoInputObject.itemCount();
        protoOutputStream.writeUInt32(3, itemCount);
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.message.payment.PaymentOrderMessageStatusSpec.encode(status);
            protoOutputStream.writeInt32(4, status0);
        }
        var surface = protoInputObject.surface();
        if (surface != null) {
            var surface0 = it.auties.whatsapp.model.message.payment.PaymentOrderMessagePaymentOrderSurfaceSpec.encode(surface);
            protoOutputStream.writeInt32(5, surface0);
        }
        var message = protoInputObject.message();
        if (message != null) {
            var message0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(message);
            if (message0 != null) {
                var message1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(message0);
                if (message1 != null) {
                    protoOutputStream.writeString(6, message1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputStream.writeString(7, title1);
                }
            }
        }
        var sellerId = protoInputObject.sellerId();
        if (sellerId != null) {
            var sellerId0 = sellerId.toString();
            if (sellerId0 != null) {
                var sellerId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sellerId0);
                if (sellerId1 != null) {
                    protoOutputStream.writeString(8, sellerId1);
                }
            }
        }
        var token = protoInputObject.token();
        if (token != null) {
            var token0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(token);
            if (token0 != null) {
                protoOutputStream.writeString(9, token0);
            }
        }
        var amount = protoInputObject.amount();
        protoOutputStream.writeUInt64(10, amount);
        var currency = protoInputObject.currency();
        if (currency != null) {
            var currency0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currency);
            if (currency0 != null) {
                protoOutputStream.writeString(11, currency0);
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(17, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
    }

    public static PaymentOrderMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PaymentOrderMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        byte[] thumbnail = null;
        int itemCount = 0;
        it.auties.whatsapp.model.message.payment.PaymentOrderMessage.Status status = null;
        it.auties.whatsapp.model.message.payment.PaymentOrderMessage.PaymentOrderSurface surface = null;
        java.lang.String message = null;
        java.lang.String title = null;
        it.auties.whatsapp.model.jid.Jid sellerId = null;
        java.lang.String token = null;
        long amount = 0l;
        java.lang.String currency = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> itemCount = protoInputStream.readInt32();
                case 4 -> status = it.auties.whatsapp.model.message.payment.PaymentOrderMessageStatusSpec.decode(protoInputStream.readInt32());
                case 5 -> surface = it.auties.whatsapp.model.message.payment.PaymentOrderMessagePaymentOrderSurfaceSpec.decode(protoInputStream.readInt32());
                case 6 -> message = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> sellerId = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 9 -> token = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 10 -> amount = protoInputStream.readInt64();
                case 11 -> currency = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.payment.PaymentOrderMessage(id, thumbnail, itemCount, status, surface, message, title, sellerId, token, amount, currency, contextInfo);
    }

    public static int sizeOf(PaymentOrderMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail1);
                }
            }
        }
        var itemCount = protoInputObject.itemCount();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(itemCount);
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.message.payment.PaymentOrderMessageStatusSpec.encode(status);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(status0);
        }
        var surface = protoInputObject.surface();
        if (surface != null) {
            var surface0 = it.auties.whatsapp.model.message.payment.PaymentOrderMessagePaymentOrderSurfaceSpec.encode(surface);
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(surface0);
        }
        var message = protoInputObject.message();
        if (message != null) {
            var message0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(message);
            if (message0 != null) {
                var message1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(message0);
                if (message1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(message1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(title1);
                }
            }
        }
        var sellerId = protoInputObject.sellerId();
        if (sellerId != null) {
            var sellerId0 = sellerId.toString();
            if (sellerId0 != null) {
                var sellerId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sellerId0);
                if (sellerId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(sellerId1);
                }
            }
        }
        var token = protoInputObject.token();
        if (token != null) {
            var token0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(token);
            if (token0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(token0);
            }
        }
        var amount = protoInputObject.amount();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(amount);
        var currency = protoInputObject.currency();
        if (currency != null) {
            var currency0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currency);
            if (currency0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(currency0);
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
