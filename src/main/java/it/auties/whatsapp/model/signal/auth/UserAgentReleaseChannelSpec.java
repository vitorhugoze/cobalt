package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class UserAgentReleaseChannelSpec {
    private static final Map<Integer, ReleaseChannel> VALUES = new HashMap<>();
    static {
        VALUES.put(0, ReleaseChannel.RELEASE);
        VALUES.put(1, ReleaseChannel.BETA);
        VALUES.put(2, ReleaseChannel.ALPHA);
        VALUES.put(3, ReleaseChannel.DEBUG);
    }

    public static Integer encode(ReleaseChannel protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static ReleaseChannel decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static ReleaseChannel decode(int protoEnumIndex, ReleaseChannel defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(ReleaseChannel protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
