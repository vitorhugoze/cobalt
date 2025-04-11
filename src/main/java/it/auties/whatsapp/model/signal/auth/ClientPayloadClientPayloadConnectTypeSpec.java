package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ClientPayloadClientPayloadConnectTypeSpec {
    private static final Map<Integer, ClientPayloadConnectType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ClientPayloadConnectType.CELLULAR_UNKNOWN);
        VALUES.put(1, ClientPayloadConnectType.WIFI_UNKNOWN);
        VALUES.put(100, ClientPayloadConnectType.CELLULAR_EDGE);
        VALUES.put(101, ClientPayloadConnectType.CELLULAR_IDEN);
        VALUES.put(102, ClientPayloadConnectType.CELLULAR_UMTS);
        VALUES.put(103, ClientPayloadConnectType.CELLULAR_EVDO);
        VALUES.put(104, ClientPayloadConnectType.CELLULAR_GPRS);
        VALUES.put(105, ClientPayloadConnectType.CELLULAR_HSDPA);
        VALUES.put(106, ClientPayloadConnectType.CELLULAR_HSUPA);
        VALUES.put(107, ClientPayloadConnectType.CELLULAR_HSPA);
        VALUES.put(108, ClientPayloadConnectType.CELLULAR_CDMA);
        VALUES.put(109, ClientPayloadConnectType.CELLULAR_1XRTT);
        VALUES.put(110, ClientPayloadConnectType.CELLULAR_EHRPD);
        VALUES.put(111, ClientPayloadConnectType.CELLULAR_LTE);
        VALUES.put(112, ClientPayloadConnectType.CELLULAR_HSPAP);
    }

    public static Integer encode(ClientPayloadConnectType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ClientPayloadConnectType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ClientPayloadConnectType decode(int protoEnumIndex, ClientPayloadConnectType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ClientPayloadConnectType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
