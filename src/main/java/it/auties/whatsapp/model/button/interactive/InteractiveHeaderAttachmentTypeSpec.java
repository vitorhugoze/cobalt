package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveHeaderAttachment.Type;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class InteractiveHeaderAttachmentTypeSpec {
    private static final Map<Integer, Type> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Type.NONE);
        VALUES.put(3, Type.DOCUMENT);
        VALUES.put(4, Type.IMAGE);
        VALUES.put(6, Type.THUMBNAIL);
        VALUES.put(7, Type.VIDEO);
    }

    public static Integer encode(Type protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Type decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Type decode(int protoEnumIndex, Type defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Type protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
