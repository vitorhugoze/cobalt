package it.auties.whatsapp.model.payment;

import it.auties.whatsapp.model.payment.PaymentMoney;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PaymentMoneySpec {
    public static byte[] encode(PaymentMoney protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PaymentMoney protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var money = protoInputObject.money();
        protoOutputStream.writeInt64(1, money);
        var offset = protoInputObject.offset();
        protoOutputStream.writeUInt32(2, offset);
        var currencyCode = protoInputObject.currencyCode();
        if (currencyCode != null) {
            var currencyCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currencyCode);
            if (currencyCode0 != null) {
                protoOutputStream.writeString(3, currencyCode0);
            }
        }
    }

    public static PaymentMoney decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PaymentMoney decode(ProtobufInputStream protoInputStream) {
        long money = 0l;
        int offset = 0;
        java.lang.String currencyCode = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> money = protoInputStream.readInt64();
                case 2 -> offset = protoInputStream.readInt32();
                case 3 -> currencyCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.payment.PaymentMoney(money, offset, currencyCode);
    }

    public static int sizeOf(PaymentMoney protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var money = protoInputObject.money();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(money);
        var offset = protoInputObject.offset();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(offset);
        var currencyCode = protoInputObject.currencyCode();
        if (currencyCode != null) {
            var currencyCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currencyCode);
            if (currencyCode0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(currencyCode0);
            }
        }
        return protoOutputSize;
    }

}
