package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterDescription;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterDescriptionSpec {
    public static byte[] encode(NewsletterDescription protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterDescription protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputStream.writeString(2, text0);
            }
        }
        var updateTimeSeconds = protoInputObject.updateTimeSeconds();
        protoOutputStream.writeUInt64(3, updateTimeSeconds);
    }

    public static NewsletterDescription decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterDescription decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        java.lang.String text = null;
        long updateTimeSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> updateTimeSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterDescription(id, text, updateTimeSeconds);
    }

    public static int sizeOf(NewsletterDescription protoInputObject) {
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
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(text0);
            }
        }
        var updateTimeSeconds = protoInputObject.updateTimeSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(updateTimeSeconds);
        return protoOutputSize;
    }

}
