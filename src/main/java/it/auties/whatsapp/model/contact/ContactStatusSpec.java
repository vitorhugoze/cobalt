package it.auties.whatsapp.model.contact;

import it.auties.whatsapp.model.contact.ContactStatus;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ContactStatusSpec {
    private static final Map<Integer, ContactStatus> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ContactStatus.AVAILABLE);
        VALUES.put(1, ContactStatus.UNAVAILABLE);
        VALUES.put(2, ContactStatus.COMPOSING);
        VALUES.put(3, ContactStatus.RECORDING);
    }

    public static Integer encode(ContactStatus protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ContactStatus decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ContactStatus decode(int protoEnumIndex, ContactStatus defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ContactStatus protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
