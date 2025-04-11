package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.StickerAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class StickerActionSpec {
    public static byte[] encode(StickerAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(StickerAction protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var fileEncSha256 = protoInputObject.fileEncSha256();
        if (fileEncSha256 != null) {
            var fileEncSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileEncSha256);
            if (fileEncSha2560 != null) {
                protoOutputStream.writeBytes(2, fileEncSha2560);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputStream.writeBytes(3, mediaKey0);
            }
        }
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputStream.writeString(4, mimetype0);
            }
        }
        var height = protoInputObject.height();
        protoOutputStream.writeUInt32(5, height);
        var width = protoInputObject.width();
        protoOutputStream.writeUInt32(6, width);
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath);
            if (directPath0 != null) {
                protoOutputStream.writeString(7, directPath0);
            }
        }
        var fileLength = protoInputObject.fileLength();
        protoOutputStream.writeUInt64(8, fileLength);
        var favorite = protoInputObject.favorite();
        protoOutputStream.writeBool(9, favorite);
        var deviceIdHint = protoInputObject.deviceIdHint();
        if (deviceIdHint != null) {
            protoOutputStream.writeUInt32(10, deviceIdHint);
        }
    }

    public static StickerAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static StickerAction decode(ProtobufInputStream protoInputStream) {
        java.lang.String url = null;
        byte[] fileEncSha256 = null;
        byte[] mediaKey = null;
        java.lang.String mimetype = null;
        int height = 0;
        int width = 0;
        java.lang.String directPath = null;
        long fileLength = 0l;
        boolean favorite = false;
        java.lang.Integer deviceIdHint = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> fileEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> height = protoInputStream.readInt32();
                case 6 -> width = protoInputStream.readInt32();
                case 7 -> directPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> fileLength = protoInputStream.readInt64();
                case 9 -> favorite = protoInputStream.readBool();
                case 10 -> deviceIdHint = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.StickerAction(url, fileEncSha256, mediaKey, mimetype, height, width, directPath, fileLength, favorite, deviceIdHint);
    }

    public static int sizeOf(StickerAction protoInputObject) {
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
        var fileEncSha256 = protoInputObject.fileEncSha256();
        if (fileEncSha256 != null) {
            var fileEncSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fileEncSha256);
            if (fileEncSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(fileEncSha2560);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey0);
            }
        }
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mimetype0);
            }
        }
        var height = protoInputObject.height();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(height);
        var width = protoInputObject.width();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(width);
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath);
            if (directPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(directPath0);
            }
        }
        var fileLength = protoInputObject.fileLength();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(fileLength);
        var favorite = protoInputObject.favorite();
        protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
        protoOutputSize += 1;
        var deviceIdHint = protoInputObject.deviceIdHint();
        if (deviceIdHint != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceIdHint);
        }
        return protoOutputSize;
    }

}
