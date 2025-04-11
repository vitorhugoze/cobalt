package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.PaymentOrderMessage.PaymentOrderSurface;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentOrderMessagePaymentOrderSurfaceSpec {
    private static final Map<Integer, PaymentOrderSurface> VALUES = new HashMap<>();
    static {
        VALUES.put(1, PaymentOrderSurface.CATALOG);
    }

    public static Integer encode(PaymentOrderSurface protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PaymentOrderSurface decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PaymentOrderSurface decode(int protoEnumIndex, PaymentOrderSurface defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PaymentOrderSurface protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
