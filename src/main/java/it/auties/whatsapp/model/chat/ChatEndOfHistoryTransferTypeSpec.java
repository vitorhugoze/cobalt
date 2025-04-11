package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.Chat.EndOfHistoryTransferType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ChatEndOfHistoryTransferTypeSpec {
    private static final Map<Integer, EndOfHistoryTransferType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, EndOfHistoryTransferType.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY);
        VALUES.put(1, EndOfHistoryTransferType.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY);
    }

    public static Integer encode(EndOfHistoryTransferType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static EndOfHistoryTransferType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static EndOfHistoryTransferType decode(int protoEnumIndex, EndOfHistoryTransferType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(EndOfHistoryTransferType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
