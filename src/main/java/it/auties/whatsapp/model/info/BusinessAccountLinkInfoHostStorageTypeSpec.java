package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.BusinessAccountLinkInfo.HostStorageType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class BusinessAccountLinkInfoHostStorageTypeSpec {
    private static final Map<Integer, HostStorageType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, HostStorageType.ON_PREMISE);
        VALUES.put(1, HostStorageType.FACEBOOK);
    }

    public static Integer encode(HostStorageType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static HostStorageType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static HostStorageType decode(int protoEnumIndex, HostStorageType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(HostStorageType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
