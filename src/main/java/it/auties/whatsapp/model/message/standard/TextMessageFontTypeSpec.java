package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.TextMessage.FontType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class TextMessageFontTypeSpec {
    private static final Map<Integer, FontType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, FontType.SANS_SERIF);
        VALUES.put(1, FontType.SERIF);
        VALUES.put(2, FontType.NORICAN_REGULAR);
        VALUES.put(3, FontType.BRYNDAN_WRITE);
        VALUES.put(4, FontType.BEBASNEUE_REGULAR);
        VALUES.put(5, FontType.OSWALD_HEAVY);
    }

    public static Integer encode(FontType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static FontType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static FontType decode(int protoEnumIndex, FontType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(FontType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
