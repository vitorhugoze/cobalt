package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.PaymentInviteMessage.ServiceType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentInviteMessageServiceTypeSpec {
    private static final Map<Integer, ServiceType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ServiceType.UNKNOWN);
        VALUES.put(1, ServiceType.FACEBOOK_PAY);
        VALUES.put(2, ServiceType.NOVI);
        VALUES.put(3, ServiceType.UPI);
    }

    public static Integer encode(ServiceType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ServiceType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ServiceType decode(int protoEnumIndex, ServiceType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ServiceType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
