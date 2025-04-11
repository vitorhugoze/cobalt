package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.PaymentInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PaymentInfoSpec {
    public static byte[] encode(PaymentInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PaymentInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var currencyDeprecated = protoInputObject.currencyDeprecated();
        if (currencyDeprecated != null) {
            var currencyDeprecated0 = it.auties.whatsapp.model.info.PaymentInfoCurrencySpec.encode(currencyDeprecated);
            protoOutputStream.writeInt32(1, currencyDeprecated0);
        }
        var amount1000 = protoInputObject.amount1000();
        protoOutputStream.writeUInt64(2, amount1000);
        var receiverJid = protoInputObject.receiverJid();
        if (receiverJid != null) {
            var receiverJid0 = receiverJid.toString();
            if (receiverJid0 != null) {
                var receiverJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(receiverJid0);
                if (receiverJid1 != null) {
                    protoOutputStream.writeString(3, receiverJid1);
                }
            }
        }
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.info.PaymentInfoStatusSpec.encode(status);
            protoOutputStream.writeInt32(4, status0);
        }
        var transactionTimestampSeconds = protoInputObject.transactionTimestampSeconds();
        protoOutputStream.writeUInt64(5, transactionTimestampSeconds);
        var requestMessageKey = protoInputObject.requestMessageKey();
        if (requestMessageKey != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(requestMessageKey));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(requestMessageKey, protoOutputStream);
        }
        var expiryTimestampSeconds = protoInputObject.expiryTimestampSeconds();
        protoOutputStream.writeUInt64(7, expiryTimestampSeconds);
        var futureProofed = protoInputObject.futureProofed();
        protoOutputStream.writeBool(8, futureProofed);
        var currency = protoInputObject.currency();
        if (currency != null) {
            var currency0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currency);
            if (currency0 != null) {
                protoOutputStream.writeString(9, currency0);
            }
        }
        var transactionStatus = protoInputObject.transactionStatus();
        if (transactionStatus != null) {
            var transactionStatus0 = it.auties.whatsapp.model.info.PaymentInfoTransactionStatusSpec.encode(transactionStatus);
            protoOutputStream.writeInt32(10, transactionStatus0);
        }
        var useNoviFormat = protoInputObject.useNoviFormat();
        protoOutputStream.writeBool(11, useNoviFormat);
        var primaryAmount = protoInputObject.primaryAmount();
        if (primaryAmount != null) {
            protoOutputStream.writeMessage(12, it.auties.whatsapp.model.payment.PaymentMoneySpec.sizeOf(primaryAmount));
            it.auties.whatsapp.model.payment.PaymentMoneySpec.encode(primaryAmount, protoOutputStream);
        }
        var exchangeAmount = protoInputObject.exchangeAmount();
        if (exchangeAmount != null) {
            protoOutputStream.writeMessage(13, it.auties.whatsapp.model.payment.PaymentMoneySpec.sizeOf(exchangeAmount));
            it.auties.whatsapp.model.payment.PaymentMoneySpec.encode(exchangeAmount, protoOutputStream);
        }
    }

    public static PaymentInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PaymentInfo decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.info.PaymentInfo.Currency currencyDeprecated = null;
        long amount1000 = 0l;
        it.auties.whatsapp.model.jid.Jid receiverJid = null;
        it.auties.whatsapp.model.info.PaymentInfo.Status status = null;
        long transactionTimestampSeconds = 0l;
        it.auties.whatsapp.model.message.model.ChatMessageKey requestMessageKey = null;
        long expiryTimestampSeconds = 0l;
        boolean futureProofed = false;
        java.lang.String currency = null;
        it.auties.whatsapp.model.info.PaymentInfo.TransactionStatus transactionStatus = null;
        boolean useNoviFormat = false;
        it.auties.whatsapp.model.payment.PaymentMoney primaryAmount = null;
        it.auties.whatsapp.model.payment.PaymentMoney exchangeAmount = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> currencyDeprecated = it.auties.whatsapp.model.info.PaymentInfoCurrencySpec.decode(protoInputStream.readInt32());
                case 2 -> amount1000 = protoInputStream.readInt64();
                case 3 -> receiverJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> status = it.auties.whatsapp.model.info.PaymentInfoStatusSpec.decode(protoInputStream.readInt32());
                case 5 -> transactionTimestampSeconds = protoInputStream.readInt64();
                case 6 -> requestMessageKey = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> expiryTimestampSeconds = protoInputStream.readInt64();
                case 8 -> futureProofed = protoInputStream.readBool();
                case 9 -> currency = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 10 -> transactionStatus = it.auties.whatsapp.model.info.PaymentInfoTransactionStatusSpec.decode(protoInputStream.readInt32());
                case 11 -> useNoviFormat = protoInputStream.readBool();
                case 12 -> primaryAmount = it.auties.whatsapp.model.payment.PaymentMoneySpec.decode(protoInputStream.readLengthDelimited());
                case 13 -> exchangeAmount = it.auties.whatsapp.model.payment.PaymentMoneySpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.PaymentInfo(currencyDeprecated, amount1000, receiverJid, status, transactionTimestampSeconds, requestMessageKey, expiryTimestampSeconds, futureProofed, currency, transactionStatus, useNoviFormat, primaryAmount, exchangeAmount);
    }

    public static int sizeOf(PaymentInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var currencyDeprecated = protoInputObject.currencyDeprecated();
        if (currencyDeprecated != null) {
            var currencyDeprecated0 = it.auties.whatsapp.model.info.PaymentInfoCurrencySpec.encode(currencyDeprecated);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(currencyDeprecated0);
        }
        var amount1000 = protoInputObject.amount1000();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(amount1000);
        var receiverJid = protoInputObject.receiverJid();
        if (receiverJid != null) {
            var receiverJid0 = receiverJid.toString();
            if (receiverJid0 != null) {
                var receiverJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(receiverJid0);
                if (receiverJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(receiverJid1);
                }
            }
        }
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.info.PaymentInfoStatusSpec.encode(status);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(status0);
        }
        var transactionTimestampSeconds = protoInputObject.transactionTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(transactionTimestampSeconds);
        var requestMessageKey = protoInputObject.requestMessageKey();
        if (requestMessageKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var requestMessageKeySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(requestMessageKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(requestMessageKeySerializedSize);
            protoOutputSize += requestMessageKeySerializedSize;
        }
        var expiryTimestampSeconds = protoInputObject.expiryTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(expiryTimestampSeconds);
        var futureProofed = protoInputObject.futureProofed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += 1;
        var currency = protoInputObject.currency();
        if (currency != null) {
            var currency0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currency);
            if (currency0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(currency0);
            }
        }
        var transactionStatus = protoInputObject.transactionStatus();
        if (transactionStatus != null) {
            var transactionStatus0 = it.auties.whatsapp.model.info.PaymentInfoTransactionStatusSpec.encode(transactionStatus);
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(transactionStatus0);
        }
        var useNoviFormat = protoInputObject.useNoviFormat();
        protoOutputSize += ProtobufOutputStream.getFieldSize(11, 0);
        protoOutputSize += 1;
        var primaryAmount = protoInputObject.primaryAmount();
        if (primaryAmount != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
            var primaryAmountSerializedSize = it.auties.whatsapp.model.payment.PaymentMoneySpec.sizeOf(primaryAmount);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(primaryAmountSerializedSize);
            protoOutputSize += primaryAmountSerializedSize;
        }
        var exchangeAmount = protoInputObject.exchangeAmount();
        if (exchangeAmount != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
            var exchangeAmountSerializedSize = it.auties.whatsapp.model.payment.PaymentMoneySpec.sizeOf(exchangeAmount);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(exchangeAmountSerializedSize);
            protoOutputSize += exchangeAmountSerializedSize;
        }
        return protoOutputSize;
    }

}
