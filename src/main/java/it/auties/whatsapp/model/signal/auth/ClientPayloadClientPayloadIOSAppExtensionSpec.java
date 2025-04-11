package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadIOSAppExtension;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ClientPayloadClientPayloadIOSAppExtensionSpec {
    private static final Map<Integer, ClientPayloadIOSAppExtension> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ClientPayloadIOSAppExtension.SHARE_EXTENSION);
        VALUES.put(1, ClientPayloadIOSAppExtension.SERVICE_EXTENSION);
        VALUES.put(2, ClientPayloadIOSAppExtension.INTENTS_EXTENSION);
    }

    public static Integer encode(ClientPayloadIOSAppExtension protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ClientPayloadIOSAppExtension decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ClientPayloadIOSAppExtension decode(int protoEnumIndex, ClientPayloadIOSAppExtension defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ClientPayloadIOSAppExtension protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
