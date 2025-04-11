package it.auties.whatsapp.model.privacy;

import it.auties.whatsapp.model.privacy.PrivacySettingType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PrivacySettingTypeSpec {
    private static final Map<Integer, PrivacySettingType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PrivacySettingType.LAST_SEEN);
        VALUES.put(1, PrivacySettingType.ONLINE);
        VALUES.put(2, PrivacySettingType.PROFILE_PIC);
        VALUES.put(3, PrivacySettingType.STATUS);
        VALUES.put(4, PrivacySettingType.ADD_ME_TO_GROUPS);
        VALUES.put(5, PrivacySettingType.READ_RECEIPTS);
        VALUES.put(6, PrivacySettingType.CALL_ADD);
    }

    public static Integer encode(PrivacySettingType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PrivacySettingType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PrivacySettingType decode(int protoEnumIndex, PrivacySettingType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PrivacySettingType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
