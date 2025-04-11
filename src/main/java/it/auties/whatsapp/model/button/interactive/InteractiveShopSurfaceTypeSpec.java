package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveShop.SurfaceType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class InteractiveShopSurfaceTypeSpec {
    private static final Map<Integer, SurfaceType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, SurfaceType.UNKNOWN_SURFACE);
        VALUES.put(1, SurfaceType.FACEBOOK);
        VALUES.put(2, SurfaceType.INSTAGRAM);
        VALUES.put(3, SurfaceType.WHATSAPP);
    }

    public static Integer encode(SurfaceType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static SurfaceType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static SurfaceType decode(int protoEnumIndex, SurfaceType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(SurfaceType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
