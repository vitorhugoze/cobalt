package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterViewerRole;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class NewsletterViewerRoleSpec {
    private static final Map<Integer, NewsletterViewerRole> VALUES = new HashMap<>();
    static {
        VALUES.put(0, NewsletterViewerRole.UNKNOWN);
        VALUES.put(1, NewsletterViewerRole.OWNER);
        VALUES.put(2, NewsletterViewerRole.SUBSCRIBER);
        VALUES.put(3, NewsletterViewerRole.ADMIN);
        VALUES.put(4, NewsletterViewerRole.GUEST);
    }

    public static Integer encode(NewsletterViewerRole protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static NewsletterViewerRole decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static NewsletterViewerRole decode(int protoEnumIndex, NewsletterViewerRole defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(NewsletterViewerRole protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
