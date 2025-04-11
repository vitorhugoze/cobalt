package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.BusinessIdentityInfo.ActorsType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class BusinessIdentityInfoActorsTypeSpec {
    private static final Map<Integer, ActorsType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ActorsType.SELF);
        VALUES.put(1, ActorsType.BSP);
    }

    public static Integer encode(ActorsType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ActorsType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ActorsType decode(int protoEnumIndex, ActorsType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ActorsType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
