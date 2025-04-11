package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.VideoOrGifMessage.Attribution;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class VideoOrGifMessageAttributionSpec {
    private static final Map<Integer, Attribution> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Attribution.NONE);
        VALUES.put(1, Attribution.GIPHY);
        VALUES.put(2, Attribution.TENOR);
    }

    public static Integer encode(Attribution protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Attribution decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Attribution decode(int protoEnumIndex, Attribution defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Attribution protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
