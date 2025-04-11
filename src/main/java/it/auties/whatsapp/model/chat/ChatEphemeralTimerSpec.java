package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.ChatEphemeralTimer;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ChatEphemeralTimerSpec {
    private static final Map<Integer, ChatEphemeralTimer> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ChatEphemeralTimer.OFF);
        VALUES.put(1, ChatEphemeralTimer.ONE_DAY);
        VALUES.put(2, ChatEphemeralTimer.ONE_WEEK);
        VALUES.put(3, ChatEphemeralTimer.THREE_MONTHS);
    }

    public static Integer encode(ChatEphemeralTimer protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ChatEphemeralTimer decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ChatEphemeralTimer decode(int protoEnumIndex, ChatEphemeralTimer defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ChatEphemeralTimer protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
