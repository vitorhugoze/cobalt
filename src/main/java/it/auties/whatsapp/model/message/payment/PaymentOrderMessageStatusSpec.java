package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.PaymentOrderMessage.Status;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentOrderMessageStatusSpec {
    private static final Map<Integer, Status> VALUES = new HashMap<>();
    static {
        VALUES.put(1, Status.INQUIRY);
    }

    public static Integer encode(Status protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Status decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Status decode(int protoEnumIndex, Status defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Status protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
