package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.MessageStatus;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class MessageStatusSpec {
    private static final Map<Integer, MessageStatus> VALUES = new HashMap<>();
    static {
        VALUES.put(0, MessageStatus.ERROR);
        VALUES.put(1, MessageStatus.PENDING);
        VALUES.put(2, MessageStatus.SERVER_ACK);
        VALUES.put(3, MessageStatus.DELIVERED);
        VALUES.put(4, MessageStatus.READ);
        VALUES.put(5, MessageStatus.PLAYED);
    }

    public static Integer encode(MessageStatus protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static MessageStatus decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static MessageStatus decode(int protoEnumIndex, MessageStatus defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(MessageStatus protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
