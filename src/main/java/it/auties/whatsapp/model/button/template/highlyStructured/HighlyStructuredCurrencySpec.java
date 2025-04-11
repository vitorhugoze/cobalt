package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredCurrencySpec {
    public static byte[] encode(HighlyStructuredCurrency protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredCurrency protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var currencyCode = protoInputObject.currencyCode();
        if (currencyCode != null) {
            var currencyCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currencyCode);
            if (currencyCode0 != null) {
                protoOutputStream.writeString(1, currencyCode0);
            }
        }
        var amount1000 = protoInputObject.amount1000();
        protoOutputStream.writeInt64(2, amount1000);
    }

    public static HighlyStructuredCurrency decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredCurrency decode(ProtobufInputStream protoInputStream) {
        java.lang.String currencyCode = null;
        long amount1000 = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> currencyCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> amount1000 = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency(currencyCode, amount1000);
    }

    public static int sizeOf(HighlyStructuredCurrency protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var currencyCode = protoInputObject.currencyCode();
        if (currencyCode != null) {
            var currencyCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currencyCode);
            if (currencyCode0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(currencyCode0);
            }
        }
        var amount1000 = protoInputObject.amount1000();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(amount1000);
        return protoOutputSize;
    }

}
