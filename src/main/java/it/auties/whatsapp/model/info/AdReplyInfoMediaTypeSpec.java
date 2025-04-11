package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.AdReplyInfo.MediaType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class AdReplyInfoMediaTypeSpec {
    private static final Map<Integer, MediaType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, MediaType.NONE);
        VALUES.put(1, MediaType.IMAGE);
        VALUES.put(2, MediaType.VIDEO);
    }

    public static Integer encode(MediaType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static MediaType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static MediaType decode(int protoEnumIndex, MediaType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(MediaType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
