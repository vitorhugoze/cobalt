package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.ListResponseMessage.Type;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ListResponseMessageTypeSpec {
    private static final Map<Integer, Type> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Type.UNKNOWN);
        VALUES.put(1, Type.SINGLE_SELECT);
        VALUES.put(2, Type.PRODUCT_LIST);
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
