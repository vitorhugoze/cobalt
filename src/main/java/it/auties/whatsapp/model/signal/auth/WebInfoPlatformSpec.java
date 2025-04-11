package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.WebInfo.Platform;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class WebInfoPlatformSpec {
    private static final Map<Integer, Platform> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Platform.WEB_BROWSER);
        VALUES.put(1, Platform.APP_STORE);
        VALUES.put(2, Platform.WIN_STORE);
        VALUES.put(3, Platform.DARWIN);
        VALUES.put(4, Platform.WIN32);
    }

    public static Integer encode(Platform protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Platform decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Platform decode(int protoEnumIndex, Platform defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Platform protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
