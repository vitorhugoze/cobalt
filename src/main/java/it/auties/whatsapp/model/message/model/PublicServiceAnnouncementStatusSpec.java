package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PublicServiceAnnouncementStatusSpec {
    public static byte[] encode(PublicServiceAnnouncementStatus protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PublicServiceAnnouncementStatus protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var campaignId = protoInputObject.campaignId();
        if (campaignId != null) {
            var campaignId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(campaignId);
            if (campaignId0 != null) {
                protoOutputStream.writeString(44, campaignId0);
            }
        }
        var campaignExpirationTimestampSeconds = protoInputObject.campaignExpirationTimestampSeconds();
        protoOutputStream.writeUInt64(45, campaignExpirationTimestampSeconds);
    }

    public static PublicServiceAnnouncementStatus decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PublicServiceAnnouncementStatus decode(ProtobufInputStream protoInputStream) {
        java.lang.String campaignId = null;
        long campaignExpirationTimestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 44 -> campaignId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 45 -> campaignExpirationTimestampSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus(campaignId, campaignExpirationTimestampSeconds);
    }

    public static int sizeOf(PublicServiceAnnouncementStatus protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var campaignId = protoInputObject.campaignId();
        if (campaignId != null) {
            var campaignId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(campaignId);
            if (campaignId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(44, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(campaignId0);
            }
        }
        var campaignExpirationTimestampSeconds = protoInputObject.campaignExpirationTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(45, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(campaignExpirationTimestampSeconds);
        return protoOutputSize;
    }

}
