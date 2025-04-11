package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class TextMessageInviteLinkGroupTypeSpec {
    private static final Map<Integer, InviteLinkGroupType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, InviteLinkGroupType.DEFAULT);
        VALUES.put(1, InviteLinkGroupType.PARENT);
        VALUES.put(2, InviteLinkGroupType.SUB);
        VALUES.put(3, InviteLinkGroupType.DEFAULT_SUB);
    }

    public static Integer encode(InviteLinkGroupType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static InviteLinkGroupType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static InviteLinkGroupType decode(int protoEnumIndex, InviteLinkGroupType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(InviteLinkGroupType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
