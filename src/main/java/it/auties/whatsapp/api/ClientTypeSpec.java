package it.auties.whatsapp.api;

import it.auties.whatsapp.api.ClientType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ClientTypeSpec {
    private static final Map<Integer, ClientType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ClientType.WEB);
        VALUES.put(1, ClientType.MOBILE);
    }

    public static Integer encode(ClientType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ClientType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ClientType decode(int protoEnumIndex, ClientType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ClientType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
