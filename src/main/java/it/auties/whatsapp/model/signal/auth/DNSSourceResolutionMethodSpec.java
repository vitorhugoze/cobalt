package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.DNSSource.ResolutionMethod;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class DNSSourceResolutionMethodSpec {
    private static final Map<Integer, ResolutionMethod> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ResolutionMethod.SYSTEM);
        VALUES.put(1, ResolutionMethod.GOOGLE);
        VALUES.put(2, ResolutionMethod.HARDCODED);
        VALUES.put(3, ResolutionMethod.OVERRIDE);
        VALUES.put(4, ResolutionMethod.FALLBACK);
    }

    public static Integer encode(ResolutionMethod protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ResolutionMethod decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ResolutionMethod decode(int protoEnumIndex, ResolutionMethod defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ResolutionMethod protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
