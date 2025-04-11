package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.ChatDisappear.Initiator;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ChatDisappearInitiatorSpec {
    private static final Map<Integer, Initiator> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Initiator.CHANGED_IN_CHAT);
        VALUES.put(1, Initiator.INITIATED_BY_ME);
        VALUES.put(2, Initiator.INITIATED_BY_OTHER);
    }

    public static Integer encode(Initiator protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Initiator decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Initiator decode(int protoEnumIndex, Initiator defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Initiator protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
