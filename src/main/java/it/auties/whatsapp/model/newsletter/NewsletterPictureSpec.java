package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterPicture;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterPictureSpec {
    public static byte[] encode(NewsletterPicture protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterPicture protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(type);
            if (type0 != null) {
                protoOutputStream.writeString(2, type0);
            }
        }
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath);
            if (directPath0 != null) {
                protoOutputStream.writeString(3, directPath0);
            }
        }
    }

    public static NewsletterPicture decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterPicture decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        java.lang.String type = null;
        java.lang.String directPath = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> type = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> directPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterPicture(id, type, directPath);
    }

    public static int sizeOf(NewsletterPicture protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(type);
            if (type0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(type0);
            }
        }
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath);
            if (directPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(directPath0);
            }
        }
        return protoOutputSize;
    }

}
