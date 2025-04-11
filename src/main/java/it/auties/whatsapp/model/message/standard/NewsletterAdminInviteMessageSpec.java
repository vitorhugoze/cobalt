package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterAdminInviteMessageSpec {
    public static byte[] encode(NewsletterAdminInviteMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterAdminInviteMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var newsletterJid = protoInputObject.newsletterJid();
        if (newsletterJid != null) {
            var newsletterJid0 = newsletterJid.toString();
            if (newsletterJid0 != null) {
                var newsletterJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newsletterJid0);
                if (newsletterJid1 != null) {
                    protoOutputStream.writeString(1, newsletterJid1);
                }
            }
        }
        var newsletterName = protoInputObject.newsletterName();
        if (newsletterName != null) {
            var newsletterName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newsletterName);
            if (newsletterName0 != null) {
                protoOutputStream.writeString(2, newsletterName0);
            }
        }
        var jpegThumbnail = protoInputObject.jpegThumbnail();
        if (jpegThumbnail != null) {
            var jpegThumbnail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jpegThumbnail);
            if (jpegThumbnail0 != null) {
                protoOutputStream.writeBytes(3, jpegThumbnail0);
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption);
            if (caption0 != null) {
                protoOutputStream.writeString(4, caption0);
            }
        }
        var inviteExpirationTimestampSeconds = protoInputObject.inviteExpirationTimestampSeconds();
        protoOutputStream.writeInt64(5, inviteExpirationTimestampSeconds);
    }

    public static NewsletterAdminInviteMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterAdminInviteMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid newsletterJid = null;
        java.lang.String newsletterName = null;
        byte[] jpegThumbnail = null;
        java.lang.String caption = null;
        long inviteExpirationTimestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> newsletterJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> newsletterName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> jpegThumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> inviteExpirationTimestampSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage(newsletterJid, newsletterName, jpegThumbnail, caption, inviteExpirationTimestampSeconds);
    }

    public static int sizeOf(NewsletterAdminInviteMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var newsletterJid = protoInputObject.newsletterJid();
        if (newsletterJid != null) {
            var newsletterJid0 = newsletterJid.toString();
            if (newsletterJid0 != null) {
                var newsletterJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newsletterJid0);
                if (newsletterJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(newsletterJid1);
                }
            }
        }
        var newsletterName = protoInputObject.newsletterName();
        if (newsletterName != null) {
            var newsletterName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newsletterName);
            if (newsletterName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(newsletterName0);
            }
        }
        var jpegThumbnail = protoInputObject.jpegThumbnail();
        if (jpegThumbnail != null) {
            var jpegThumbnail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jpegThumbnail);
            if (jpegThumbnail0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(jpegThumbnail0);
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption);
            if (caption0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(caption0);
            }
        }
        var inviteExpirationTimestampSeconds = protoInputObject.inviteExpirationTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(inviteExpirationTimestampSeconds);
        return protoOutputSize;
    }

}
