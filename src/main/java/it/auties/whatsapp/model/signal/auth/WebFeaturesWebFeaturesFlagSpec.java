package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class WebFeaturesWebFeaturesFlagSpec {
    private static final Map<Integer, WebFeaturesFlag> VALUES = new HashMap<>();
    static {
        VALUES.put(0, WebFeaturesFlag.NOT_STARTED);
        VALUES.put(1, WebFeaturesFlag.FORCE_UPGRADE);
        VALUES.put(2, WebFeaturesFlag.DEVELOPMENT);
        VALUES.put(3, WebFeaturesFlag.PRODUCTION);
    }

    public static Integer encode(WebFeaturesFlag protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static WebFeaturesFlag decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static WebFeaturesFlag decode(int protoEnumIndex, WebFeaturesFlag defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(WebFeaturesFlag protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
