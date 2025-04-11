package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.KeepInChatType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class KeepInChatTypeSpec {
    private static final Map<Integer, KeepInChatType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, KeepInChatType.UNKNOWN);
        VALUES.put(1, KeepInChatType.KEEP_FOR_ALL);
        VALUES.put(2, KeepInChatType.UNDO_KEEP_FOR_ALL);
    }

    public static Integer encode(KeepInChatType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static KeepInChatType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static KeepInChatType decode(int protoEnumIndex, KeepInChatType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(KeepInChatType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
