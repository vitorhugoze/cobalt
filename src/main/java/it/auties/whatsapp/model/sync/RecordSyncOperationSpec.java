package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.RecordSync.Operation;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class RecordSyncOperationSpec {
    private static final Map<Integer, Operation> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Operation.SET);
        VALUES.put(1, Operation.REMOVE);
    }

    public static Integer encode(Operation protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Operation decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Operation decode(int protoEnumIndex, Operation defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Operation protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
