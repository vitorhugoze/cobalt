package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.HistorySync.Type;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class HistorySyncTypeSpec {
    private static final Map<Integer, Type> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Type.INITIAL_BOOTSTRAP);
        VALUES.put(1, Type.INITIAL_STATUS_V3);
        VALUES.put(2, Type.FULL);
        VALUES.put(3, Type.RECENT);
        VALUES.put(4, Type.PUSH_NAME);
        VALUES.put(5, Type.NON_BLOCKING_DATA);
    }

    public static Integer encode(Type protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Type decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Type decode(int protoEnumIndex, Type defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Type protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
