package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterViewerMetadataSpec {
    public static byte[] encode(NewsletterViewerMetadata protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterViewerMetadata protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var mute = protoInputObject.mute();
        protoOutputStream.writeBool(1, mute);
        var role = protoInputObject.role();
        if (role != null) {
            var role0 = it.auties.whatsapp.model.newsletter.NewsletterViewerRoleSpec.encode(role);
            protoOutputStream.writeInt32(2, role0);
        }
    }

    public static NewsletterViewerMetadata decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterViewerMetadata decode(ProtobufInputStream protoInputStream) {
        boolean mute = false;
        it.auties.whatsapp.model.newsletter.NewsletterViewerRole role = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mute = protoInputStream.readBool();
                case 2 -> role = it.auties.whatsapp.model.newsletter.NewsletterViewerRoleSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata(mute, role);
    }

    public static int sizeOf(NewsletterViewerMetadata protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var mute = protoInputObject.mute();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var role = protoInputObject.role();
        if (role != null) {
            var role0 = it.auties.whatsapp.model.newsletter.NewsletterViewerRoleSpec.encode(role);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(role0);
        }
        return protoOutputSize;
    }

}
