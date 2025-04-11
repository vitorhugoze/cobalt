package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.GroupRole;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class GroupRoleSpec {
    private static final Map<Integer, GroupRole> VALUES = new HashMap<>();
    static {
        VALUES.put(0, GroupRole.USER);
        VALUES.put(1, GroupRole.ADMIN);
        VALUES.put(2, GroupRole.FOUNDER);
    }

    public static Integer encode(GroupRole protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static GroupRole decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static GroupRole decode(int protoEnumIndex, GroupRole defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(GroupRole protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
