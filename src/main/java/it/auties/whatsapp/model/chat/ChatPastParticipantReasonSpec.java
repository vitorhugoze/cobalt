package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.ChatPastParticipant.Reason;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ChatPastParticipantReasonSpec {
    private static final Map<Integer, Reason> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Reason.LEFT);
        VALUES.put(1, Reason.REMOVED);
    }

    public static Integer encode(Reason protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Reason decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Reason decode(int protoEnumIndex, Reason defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Reason protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
