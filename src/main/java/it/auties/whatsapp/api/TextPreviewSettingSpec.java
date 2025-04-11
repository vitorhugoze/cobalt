package it.auties.whatsapp.api;

import it.auties.whatsapp.api.TextPreviewSetting;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class TextPreviewSettingSpec {
    private static final Map<Integer, TextPreviewSetting> VALUES = new HashMap<>();
    static {
        VALUES.put(0, TextPreviewSetting.ENABLED_WITH_INFERENCE);
        VALUES.put(1, TextPreviewSetting.ENABLED);
        VALUES.put(2, TextPreviewSetting.DISABLED);
    }

    public static Integer encode(TextPreviewSetting protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static TextPreviewSetting decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static TextPreviewSetting decode(int protoEnumIndex, TextPreviewSetting defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(TextPreviewSetting protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
