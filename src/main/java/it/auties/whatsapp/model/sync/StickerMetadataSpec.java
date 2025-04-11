package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.StickerMetadata;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class StickerMetadataSpec {
    public static byte[] encode(StickerMetadata protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(StickerMetadata protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputStream.writeString(1, url0);
            }
        }
        var fileSha256 = protoInputObject.fileSha256();
        if (fileSha256 != null) {
            var fileSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileSha256);
            if (fileSha2560 != null) {
                protoOutputStream.writeBytes(2, fileSha2560);
            }
        }
        var fileEncSha256 = protoInputObject.fileEncSha256();
        if (fileEncSha256 != null) {
            var fileEncSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileEncSha256);
            if (fileEncSha2560 != null) {
                protoOutputStream.writeBytes(3, fileEncSha2560);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputStream.writeBytes(4, mediaKey0);
            }
        }
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputStream.writeString(5, mimetype0);
            }
        }
        var height = protoInputObject.height();
        protoOutputStream.writeUInt32(6, height);
        var width = protoInputObject.width();
        protoOutputStream.writeUInt32(7, width);
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath);
            if (directPath0 != null) {
                protoOutputStream.writeString(8, directPath0);
            }
        }
        var fileLength = protoInputObject.fileLength();
        protoOutputStream.writeUInt64(9, fileLength);
        var weight = protoInputObject.weight();
        protoOutputStream.writeFloat(10, weight);
        var lastStickerSentTs = protoInputObject.lastStickerSentTs();
        protoOutputStream.writeInt64(11, lastStickerSentTs);
    }

    public static StickerMetadata decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static StickerMetadata decode(ProtobufInputStream protoInputStream) {
        java.lang.String url = null;
        byte[] fileSha256 = null;
        byte[] fileEncSha256 = null;
        byte[] mediaKey = null;
        java.lang.String mimetype = null;
        int height = 0;
        int width = 0;
        java.lang.String directPath = null;
        long fileLength = 0l;
        float weight = 0f;
        long lastStickerSentTs = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> fileSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> fileEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> height = protoInputStream.readInt32();
                case 7 -> width = protoInputStream.readInt32();
                case 8 -> directPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> fileLength = protoInputStream.readInt64();
                case 10 -> weight = protoInputStream.readFloat();
                case 11 -> lastStickerSentTs = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.StickerMetadata(url, fileSha256, fileEncSha256, mediaKey, mimetype, height, width, directPath, fileLength, weight, lastStickerSentTs);
    }

    public static int sizeOf(StickerMetadata protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(url0);
            }
        }
        var fileSha256 = protoInputObject.fileSha256();
        if (fileSha256 != null) {
            var fileSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileSha256);
            if (fileSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(fileSha2560);
            }
        }
        var fileEncSha256 = protoInputObject.fileEncSha256();
        if (fileEncSha256 != null) {
            var fileEncSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileEncSha256);
            if (fileEncSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(fileEncSha2560);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey0);
            }
        }
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mimetype0);
            }
        }
        var height = protoInputObject.height();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(height);
        var width = protoInputObject.width();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(width);
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath);
            if (directPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(directPath0);
            }
        }
        var fileLength = protoInputObject.fileLength();
        protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(fileLength);
        var weight = protoInputObject.weight();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 5);
        protoOutputSize += 4;
        var lastStickerSentTs = protoInputObject.lastStickerSentTs();
        protoOutputSize += ProtobufOutputStream.getFieldSize(11, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(lastStickerSentTs);
        return protoOutputSize;
    }

}
