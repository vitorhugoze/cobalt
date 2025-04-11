package it.auties.whatsapp.model.media;

import it.auties.whatsapp.model.media.MediaVisibility;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class MediaVisibilitySpec {
    private static final Map<Integer, MediaVisibility> VALUES = new HashMap<>();
    static {
        VALUES.put(0, MediaVisibility.DEFAULT);
        VALUES.put(1, MediaVisibility.OFF);
        VALUES.put(2, MediaVisibility.ON);
    }

    public static Integer encode(MediaVisibility protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static MediaVisibility decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static MediaVisibility decode(int protoEnumIndex, MediaVisibility defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(MediaVisibility protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
