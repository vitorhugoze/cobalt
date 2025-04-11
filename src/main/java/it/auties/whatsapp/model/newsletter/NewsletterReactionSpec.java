package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterReaction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterReactionSpec {
    public static byte[] encode(NewsletterReaction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterReaction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var content = protoInputObject.content();
        if (content != null) {
            var content0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(content);
            if (content0 != null) {
                protoOutputStream.writeString(1, content0);
            }
        }
        var count = protoInputObject.count();
        protoOutputStream.writeUInt64(2, count);
        var fromMe = protoInputObject.fromMe();
        protoOutputStream.writeBool(3, fromMe);
    }

    public static NewsletterReaction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterReaction decode(ProtobufInputStream protoInputStream) {
        java.lang.String content = null;
        long count = 0l;
        boolean fromMe = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> count = protoInputStream.readInt64();
                case 3 -> fromMe = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterReaction(content, count, fromMe);
    }

    public static int sizeOf(NewsletterReaction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var content = protoInputObject.content();
        if (content != null) {
            var content0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(content);
            if (content0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(content0);
            }
        }
        var count = protoInputObject.count();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(count);
        var fromMe = protoInputObject.fromMe();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
