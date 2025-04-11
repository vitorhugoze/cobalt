package it.auties.whatsapp.model.message.server;

import it.auties.whatsapp.model.message.server.ProtocolMessage.Type;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ProtocolMessageTypeSpec {
    private static final Map<Integer, Type> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Type.REVOKE);
        VALUES.put(3, Type.EPHEMERAL_SETTING);
        VALUES.put(4, Type.EPHEMERAL_SYNC_RESPONSE);
        VALUES.put(5, Type.HISTORY_SYNC_NOTIFICATION);
        VALUES.put(6, Type.APP_STATE_SYNC_KEY_SHARE);
        VALUES.put(7, Type.APP_STATE_SYNC_KEY_REQUEST);
        VALUES.put(8, Type.MESSAGE_BACK_FILL_REQUEST);
        VALUES.put(9, Type.INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC);
        VALUES.put(10, Type.EXCEPTION_NOTIFICATION);
        VALUES.put(11, Type.SHARE_PHONE_NUMBER);
        VALUES.put(14, Type.MESSAGE_EDIT);
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
