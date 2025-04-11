package it.auties.whatsapp.model.privacy;

import it.auties.whatsapp.model.privacy.PrivacySettingValue;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PrivacySettingValueSpec {
    private static final Map<Integer, PrivacySettingValue> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PrivacySettingValue.EVERYONE);
        VALUES.put(1, PrivacySettingValue.CONTACTS);
        VALUES.put(2, PrivacySettingValue.CONTACTS_EXCEPT);
        VALUES.put(3, PrivacySettingValue.NOBODY);
        VALUES.put(4, PrivacySettingValue.MATCH_LAST_SEEN);
    }

    public static Integer encode(PrivacySettingValue protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PrivacySettingValue decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PrivacySettingValue decode(int protoEnumIndex, PrivacySettingValue defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PrivacySettingValue protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
