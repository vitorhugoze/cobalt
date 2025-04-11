package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.PatchType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PatchTypeSpec {
    private static final Map<Integer, PatchType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PatchType.CRITICAL_BLOCK);
        VALUES.put(1, PatchType.CRITICAL_UNBLOCK_LOW);
        VALUES.put(2, PatchType.REGULAR_HIGH);
        VALUES.put(3, PatchType.REGULAR_LOW);
        VALUES.put(4, PatchType.REGULAR);
    }

    public static Integer encode(PatchType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PatchType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PatchType decode(int protoEnumIndex, PatchType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PatchType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
