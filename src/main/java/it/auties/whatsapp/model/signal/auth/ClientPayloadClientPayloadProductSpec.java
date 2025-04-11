package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadProduct;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ClientPayloadClientPayloadProductSpec {
    private static final Map<Integer, ClientPayloadProduct> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ClientPayloadProduct.WHATSAPP);
        VALUES.put(1, ClientPayloadProduct.MESSENGER);
    }

    public static Integer encode(ClientPayloadProduct protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ClientPayloadProduct decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ClientPayloadProduct decode(int protoEnumIndex, ClientPayloadProduct defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ClientPayloadProduct protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
