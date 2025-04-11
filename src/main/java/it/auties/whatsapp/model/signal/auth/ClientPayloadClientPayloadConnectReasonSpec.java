package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectReason;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ClientPayloadClientPayloadConnectReasonSpec {
    private static final Map<Integer, ClientPayloadConnectReason> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ClientPayloadConnectReason.PUSH);
        VALUES.put(1, ClientPayloadConnectReason.USER_ACTIVATED);
        VALUES.put(2, ClientPayloadConnectReason.SCHEDULED);
        VALUES.put(3, ClientPayloadConnectReason.ERROR_RECONNECT);
        VALUES.put(4, ClientPayloadConnectReason.NETWORK_SWITCH);
        VALUES.put(5, ClientPayloadConnectReason.PING_RECONNECT);
    }

    public static Integer encode(ClientPayloadConnectReason protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ClientPayloadConnectReason decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ClientPayloadConnectReason decode(int protoEnumIndex, ClientPayloadConnectReason defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ClientPayloadConnectReason protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
