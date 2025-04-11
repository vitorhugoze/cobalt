package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.BusinessAccountLinkInfo.AccountType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class BusinessAccountLinkInfoAccountTypeSpec {
    private static final Map<Integer, AccountType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, AccountType.ENTERPRISE);
        VALUES.put(1, AccountType.PAGE);
    }

    public static Integer encode(AccountType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static AccountType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static AccountType decode(int protoEnumIndex, AccountType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(AccountType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
