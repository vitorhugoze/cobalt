package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.DocumentMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DocumentMessageSpec {
    public static byte[] encode(DocumentMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DocumentMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var mediaUrl = protoInputObject.mediaUrl;
        if (mediaUrl != null) {
            var mediaUrl0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaUrl);
            if (mediaUrl0 != null) {
                protoOutputStream.writeString(1, mediaUrl0);
            }
        }
        var mimetype = protoInputObject.mimetype;
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputStream.writeString(2, mimetype0);
            }
        }
        var title = protoInputObject.title;
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputStream.writeString(3, title0);
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256;
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha256);
            if (mediaSha2560 != null) {
                protoOutputStream.writeBytes(4, mediaSha2560);
            }
        }
        var mediaSize = protoInputObject.mediaSize;
        if (mediaSize != null) {
            protoOutputStream.writeUInt64(5, mediaSize);
        }
        var pageCount = protoInputObject.pageCount;
        if (pageCount != null) {
            protoOutputStream.writeUInt32(6, pageCount);
        }
        var mediaKey = protoInputObject.mediaKey;
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputStream.writeBytes(7, mediaKey0);
            }
        }
        var fileName = protoInputObject.fileName;
        if (fileName != null) {
            var fileName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileName);
            if (fileName0 != null) {
                protoOutputStream.writeString(8, fileName0);
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256;
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                protoOutputStream.writeBytes(9, mediaEncryptedSha2560);
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath;
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                protoOutputStream.writeString(10, mediaDirectPath0);
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds;
        if (mediaKeyTimestampSeconds != null) {
            protoOutputStream.writeUInt64(11, mediaKeyTimestampSeconds);
        }
        var contactVcard = protoInputObject.contactVcard;
        protoOutputStream.writeBool(12, contactVcard);
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath;
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                protoOutputStream.writeString(13, thumbnailDirectPath0);
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256;
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                protoOutputStream.writeBytes(14, thumbnailSha2560);
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256;
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                protoOutputStream.writeBytes(15, thumbnailEncSha2560);
            }
        }
        var thumbnail = protoInputObject.thumbnail;
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail);
            if (thumbnail0 != null) {
                protoOutputStream.writeBytes(16, thumbnail0);
            }
        }
        var contextInfo = protoInputObject.contextInfo;
        if (contextInfo != null) {
            protoOutputStream.writeMessage(17, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo));
            it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo, protoOutputStream);
        }
        var thumbnailHeight = protoInputObject.thumbnailHeight;
        if (thumbnailHeight != null) {
            protoOutputStream.writeUInt32(18, thumbnailHeight);
        }
        var thumbnailWidth = protoInputObject.thumbnailWidth;
        if (thumbnailWidth != null) {
            protoOutputStream.writeUInt32(19, thumbnailWidth);
        }
        var caption = protoInputObject.caption;
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption);
            if (caption0 != null) {
                protoOutputStream.writeString(20, caption0);
            }
        }
    }

    public static DocumentMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DocumentMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String mediaUrl = null;
        java.lang.String mimetype = null;
        java.lang.String title = null;
        byte[] mediaSha256 = null;
        java.lang.Long mediaSize = null;
        java.lang.Integer pageCount = null;
        byte[] mediaKey = null;
        java.lang.String fileName = null;
        byte[] mediaEncryptedSha256 = null;
        java.lang.String mediaDirectPath = null;
        java.lang.Long mediaKeyTimestampSeconds = null;
        boolean contactVcard = false;
        java.lang.String thumbnailDirectPath = null;
        byte[] thumbnailSha256 = null;
        byte[] thumbnailEncSha256 = null;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        java.lang.Integer thumbnailHeight = null;
        java.lang.Integer thumbnailWidth = null;
        java.lang.String caption = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> mediaSize = protoInputStream.readInt64();
                case 6 -> pageCount = protoInputStream.readInt32();
                case 7 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 8 -> fileName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 10 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 11 -> mediaKeyTimestampSeconds = protoInputStream.readInt64();
                case 12 -> contactVcard = protoInputStream.readBool();
                case 13 -> thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 14 -> thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 15 -> thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> thumbnailHeight = protoInputStream.readInt32();
                case 19 -> thumbnailWidth = protoInputStream.readInt32();
                case 20 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.DocumentMessage(mediaUrl, mimetype, title, mediaSha256, mediaSize, pageCount, mediaKey, fileName, mediaEncryptedSha256, mediaDirectPath, mediaKeyTimestampSeconds, contactVcard, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, thumbnail, contextInfo, thumbnailHeight, thumbnailWidth, caption);
    }

    public static int sizeOf(DocumentMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var mediaUrl = protoInputObject.mediaUrl;
        if (mediaUrl != null) {
            var mediaUrl0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaUrl);
            if (mediaUrl0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mediaUrl0);
            }
        }
        var mimetype = protoInputObject.mimetype;
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mimetype0);
            }
        }
        var title = protoInputObject.title;
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(title0);
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256;
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha256);
            if (mediaSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaSha2560);
            }
        }
        var mediaSize = protoInputObject.mediaSize;
        if (mediaSize != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaSize);
        }
        var pageCount = protoInputObject.pageCount;
        if (pageCount != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(pageCount);
        }
        var mediaKey = protoInputObject.mediaKey;
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey0);
            }
        }
        var fileName = protoInputObject.fileName;
        if (fileName != null) {
            var fileName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileName);
            if (fileName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(fileName0);
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256;
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2560);
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath;
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath0);
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds;
        if (mediaKeyTimestampSeconds != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(11, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaKeyTimestampSeconds);
        }
        var contactVcard = protoInputObject.contactVcard;
        protoOutputSize += ProtobufOutputStream.getFieldSize(12, 0);
        protoOutputSize += 1;
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath;
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(thumbnailDirectPath0);
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256;
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnailSha2560);
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256;
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnailEncSha2560);
            }
        }
        var thumbnail = protoInputObject.thumbnail;
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail);
            if (thumbnail0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail0);
            }
        }
        var contextInfo = protoInputObject.contextInfo;
        if (contextInfo != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
            var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
            protoOutputSize += contextInfoSerializedSize;
        }
        var thumbnailHeight = protoInputObject.thumbnailHeight;
        if (thumbnailHeight != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(18, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(thumbnailHeight);
        }
        var thumbnailWidth = protoInputObject.thumbnailWidth;
        if (thumbnailWidth != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(19, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(thumbnailWidth);
        }
        var caption = protoInputObject.caption;
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption);
            if (caption0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(caption0);
            }
        }
        return protoOutputSize;
    }

}
