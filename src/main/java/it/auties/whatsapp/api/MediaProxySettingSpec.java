package it.auties.whatsapp.api;

import it.auties.whatsapp.api.MediaProxySetting;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class MediaProxySettingSpec {
    private static final Map<Integer, MediaProxySetting> VALUES = new HashMap<>();
    static {
        VALUES.put(0, MediaProxySetting.NONE);
        VALUES.put(1, MediaProxySetting.DOWNLOADS);
        VALUES.put(2, MediaProxySetting.UPLOADS);
        VALUES.put(3, MediaProxySetting.ALL);
    }

    public static Integer encode(MediaProxySetting protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static MediaProxySetting decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static MediaProxySetting decode(int protoEnumIndex, MediaProxySetting defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(MediaProxySetting protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
