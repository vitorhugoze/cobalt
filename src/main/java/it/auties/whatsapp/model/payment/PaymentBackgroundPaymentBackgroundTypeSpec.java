package it.auties.whatsapp.model.payment;

import it.auties.whatsapp.model.payment.PaymentBackground.PaymentBackgroundType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentBackgroundPaymentBackgroundTypeSpec {
    private static final Map<Integer, PaymentBackgroundType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PaymentBackgroundType.UNKNOWN);
        VALUES.put(1, PaymentBackgroundType.DEFAULT);
    }

    public static Integer encode(PaymentBackgroundType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PaymentBackgroundType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PaymentBackgroundType decode(int protoEnumIndex, PaymentBackgroundType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PaymentBackgroundType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
