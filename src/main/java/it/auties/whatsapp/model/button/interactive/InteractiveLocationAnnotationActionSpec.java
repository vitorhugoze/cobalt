package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation.Action;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class InteractiveLocationAnnotationActionSpec {
    private static final Map<Integer, Action> VALUES = new HashMap<>();
    static {
        VALUES.put(0, Action.UNKNOWN);
        VALUES.put(2, Action.LOCATION);
    }

    public static Integer encode(Action protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static Action decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static Action decode(int protoEnumIndex, Action defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(Action protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
