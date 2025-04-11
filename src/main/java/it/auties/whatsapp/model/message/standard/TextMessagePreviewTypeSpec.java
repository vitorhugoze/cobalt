package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.TextMessage.PreviewType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class TextMessagePreviewTypeSpec {
    private static final Map<Integer, PreviewType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PreviewType.NONE);
        VALUES.put(1, PreviewType.VIDEO);
    }

    public static Integer encode(PreviewType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PreviewType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PreviewType decode(int protoEnumIndex, PreviewType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PreviewType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
