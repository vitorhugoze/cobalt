package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterSettingsSpec {
    public static byte[] encode(NewsletterSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var reactionCodes = protoInputObject.reactionCodes();
        if (reactionCodes != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsSpec.sizeOf(reactionCodes));
            it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsSpec.encode(reactionCodes, protoOutputStream);
        }
    }

    public static NewsletterSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterSettings decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.newsletter.NewsletterReactionSettings reactionCodes = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> reactionCodes = it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterSettings(reactionCodes);
    }

    public static int sizeOf(NewsletterSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var reactionCodes = protoInputObject.reactionCodes();
        if (reactionCodes != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var reactionCodesSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsSpec.sizeOf(reactionCodes);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(reactionCodesSerializedSize);
            protoOutputSize += reactionCodesSerializedSize;
        }
        return protoOutputSize;
    }

}
