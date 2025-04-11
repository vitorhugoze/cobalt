package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.PaymentInfo.Currency;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentInfoCurrencySpec {
    private static final Map<Integer, Currency> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Currency.UNKNOWN_CURRENCY);
        VALUES.put(1, Currency.INR);
    }

    public static Integer encode(Currency protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Currency decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Currency decode(int protoEnumIndex, Currency defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Currency protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
