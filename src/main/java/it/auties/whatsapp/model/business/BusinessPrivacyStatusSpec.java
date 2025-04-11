package it.auties.whatsapp.model.business;

import it.auties.whatsapp.model.business.BusinessPrivacyStatus;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class BusinessPrivacyStatusSpec {
    private static final Map<Integer, BusinessPrivacyStatus> VALUES = new HashMap<>();
    static {
        VALUES.put(0, BusinessPrivacyStatus.E2EE);
        VALUES.put(1, BusinessPrivacyStatus.BSP);
        VALUES.put(2, BusinessPrivacyStatus.FACEBOOK);
        VALUES.put(3, BusinessPrivacyStatus.BSP_AND_FB);
    }

    public static Integer encode(BusinessPrivacyStatus protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static BusinessPrivacyStatus decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static BusinessPrivacyStatus decode(int protoEnumIndex, BusinessPrivacyStatus defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(BusinessPrivacyStatus protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
