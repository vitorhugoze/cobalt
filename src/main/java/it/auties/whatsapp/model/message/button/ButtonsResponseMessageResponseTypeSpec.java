package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.ButtonsResponseMessage.ResponseType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ButtonsResponseMessageResponseTypeSpec {
    private static final Map<Integer, ResponseType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ResponseType.UNKNOWN);
        VALUES.put(1, ResponseType.SELECTED_DISPLAY_TEXT);
    }

    public static Integer encode(ResponseType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ResponseType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ResponseType decode(int protoEnumIndex, ResponseType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ResponseType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
