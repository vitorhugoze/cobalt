package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.PaymentInfo.Status;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentInfoStatusSpec {
    private static final Map<Integer, Status> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Status.UNKNOWN_STATUS);
        VALUES.put(1, Status.PROCESSING);
        VALUES.put(2, Status.SENT);
        VALUES.put(3, Status.NEED_TO_ACCEPT);
        VALUES.put(4, Status.COMPLETE);
        VALUES.put(5, Status.COULD_NOT_COMPLETE);
        VALUES.put(6, Status.REFUNDED);
        VALUES.put(7, Status.EXPIRED);
        VALUES.put(8, Status.REJECTED);
        VALUES.put(9, Status.CANCELLED);
        VALUES.put(10, Status.WAITING_FOR_PAYER);
        VALUES.put(11, Status.WAITING);
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
