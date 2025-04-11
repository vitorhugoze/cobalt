package it.auties.whatsapp.model.call;

import it.auties.whatsapp.model.call.CallStatus;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class CallStatusSpec {
    private static final Map<Integer, CallStatus> VALUES = new HashMap<>();
    static {
        VALUES.put(0, CallStatus.RINGING);
        VALUES.put(1, CallStatus.ACCEPTED);
        VALUES.put(2, CallStatus.REJECTED);
        VALUES.put(3, CallStatus.TIMED_OUT);
    }

    public static Integer encode(CallStatus protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static CallStatus decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static CallStatus decode(int protoEnumIndex, CallStatus defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(CallStatus protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
