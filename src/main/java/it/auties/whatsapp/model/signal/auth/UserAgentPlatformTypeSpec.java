package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class UserAgentPlatformTypeSpec {
    private static final Map<Integer, PlatformType> VALUES = new HashMap<>();
    static {
        VALUES.put(999, PlatformType.UNKNOWN);
        VALUES.put(0, PlatformType.ANDROID);
        VALUES.put(1, PlatformType.IOS);
        VALUES.put(10, PlatformType.ANDROID_BUSINESS);
        VALUES.put(11, PlatformType.KAIOS);
        VALUES.put(12, PlatformType.IOS_BUSINESS);
        VALUES.put(13, PlatformType.WINDOWS);
        VALUES.put(24, PlatformType.MACOS);
        VALUES.put(14, PlatformType.WEB);
    }

    public static Integer encode(PlatformType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PlatformType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PlatformType decode(int protoEnumIndex, PlatformType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PlatformType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
