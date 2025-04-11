package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.CompanionProperties.PlatformType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class CompanionPropertiesPlatformTypeSpec {
    private static final Map<Integer, PlatformType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PlatformType.UNKNOWN);
        VALUES.put(1, PlatformType.CHROME);
        VALUES.put(2, PlatformType.FIREFOX);
        VALUES.put(3, PlatformType.IE);
        VALUES.put(4, PlatformType.OPERA);
        VALUES.put(5, PlatformType.SAFARI);
        VALUES.put(6, PlatformType.EDGE);
        VALUES.put(7, PlatformType.DESKTOP);
        VALUES.put(8, PlatformType.IPAD);
        VALUES.put(9, PlatformType.ANDROID_TABLET);
        VALUES.put(10, PlatformType.OHANA);
        VALUES.put(11, PlatformType.ALOHA);
        VALUES.put(12, PlatformType.CATALINA);
        VALUES.put(13, PlatformType.TCL_TV);
        VALUES.put(14, PlatformType.IOS_PHONE);
        VALUES.put(15, PlatformType.IOS_CATALYST);
        VALUES.put(16, PlatformType.ANDROID_PHONE);
        VALUES.put(17, PlatformType.ANDROID_AMBIGUOUS);
        VALUES.put(18, PlatformType.WEAR_OS);
        VALUES.put(19, PlatformType.AR_WRIST);
        VALUES.put(20, PlatformType.AR_DEVICE);
        VALUES.put(21, PlatformType.UWP);
        VALUES.put(22, PlatformType.VR);
    }

    public static Integer encode(PlatformType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PlatformType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PlatformType decode(int protoEnumIndex, PlatformType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PlatformType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
