package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.BusinessIdentityInfo.VerifiedLevel;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class BusinessIdentityInfoVerifiedLevelSpec {
    private static final Map<Integer, VerifiedLevel> VALUES = new HashMap<>();
    static {
        VALUES.put(0, VerifiedLevel.UNKNOWN);
        VALUES.put(1, VerifiedLevel.LOW);
        VALUES.put(2, VerifiedLevel.HIGH);
    }

    public static Integer encode(VerifiedLevel protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static VerifiedLevel decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static VerifiedLevel decode(int protoEnumIndex, VerifiedLevel defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(VerifiedLevel protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
