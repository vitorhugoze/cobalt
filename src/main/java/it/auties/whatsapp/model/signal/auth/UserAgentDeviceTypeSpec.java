package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.UserAgent.DeviceType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class UserAgentDeviceTypeSpec {
    private static final Map<Integer, DeviceType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, DeviceType.PHONE);
        VALUES.put(1, DeviceType.TABLET);
        VALUES.put(2, DeviceType.DESKTOP);
        VALUES.put(3, DeviceType.WEARABLE);
        VALUES.put(4, DeviceType.VR);
    }

    public static Integer encode(DeviceType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static DeviceType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static DeviceType decode(int protoEnumIndex, DeviceType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(DeviceType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
