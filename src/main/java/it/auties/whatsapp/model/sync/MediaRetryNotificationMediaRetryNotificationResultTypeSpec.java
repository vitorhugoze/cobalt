package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.MediaRetryNotification.MediaRetryNotificationResultType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class MediaRetryNotificationMediaRetryNotificationResultTypeSpec {
    private static final Map<Integer, MediaRetryNotificationResultType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, MediaRetryNotificationResultType.GENERAL_ERROR);
        VALUES.put(1, MediaRetryNotificationResultType.SUCCESS);
        VALUES.put(2, MediaRetryNotificationResultType.NOT_FOUND);
        VALUES.put(3, MediaRetryNotificationResultType.DECRYPTION_ERROR);
    }

    public static Integer encode(MediaRetryNotificationResultType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static MediaRetryNotificationResultType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static MediaRetryNotificationResultType decode(int protoEnumIndex, MediaRetryNotificationResultType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(MediaRetryNotificationResultType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
