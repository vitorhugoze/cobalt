package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterState;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterStateSpec {
    public static byte[] encode(NewsletterState protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterState protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(type);
            if (type0 != null) {
                protoOutputStream.writeString(1, type0);
            }
        }
    }

    public static NewsletterState decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterState decode(ProtobufInputStream protoInputStream) {
        java.lang.String type = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> type = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterState(type);
    }

    public static int sizeOf(NewsletterState protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(type);
            if (type0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(type0);
            }
        }
        return protoOutputSize;
    }

}
