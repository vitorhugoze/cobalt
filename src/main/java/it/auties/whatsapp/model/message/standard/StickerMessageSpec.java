package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.StickerMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class StickerMessageSpec {
    public static byte[] encode(StickerMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(StickerMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var mediaUrl = protoInputObject.mediaUrl();
        if (mediaUrl != null) {
            var mediaUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaUrl);
            if (mediaUrl0 != null) {
                var mediaUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaUrl0);
                if (mediaUrl1 != null) {
                    protoOutputStream.writeString(1, mediaUrl1);
                }
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputStream.writeBytes(2, mediaSha2561);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputStream.writeBytes(3, mediaEncryptedSha2561);
                }
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(4, mediaKey1);
                }
            }
        }
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mimetype);
            if (mimetype0 != null) {
                var mimetype1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype0);
                if (mimetype1 != null) {
                    protoOutputStream.writeString(5, mimetype1);
                }
            }
        }
        var height = protoInputObject.height();
        if (height != null) {
            var height0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(height);
            if (height0 != null) {
                protoOutputStream.writeUInt32(6, height0);
            }
        }
        var width = protoInputObject.width();
        if (width != null) {
            var width0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(width);
            if (width0 != null) {
                protoOutputStream.writeUInt32(7, width0);
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputStream.writeString(8, mediaDirectPath1);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputStream.writeUInt64(9, mediaSize0);
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputStream.writeUInt64(10, mediaKeyTimestampSeconds0);
            }
        }
        var firstFrameLength = protoInputObject.firstFrameLength();
        if (firstFrameLength != null) {
            var firstFrameLength0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(firstFrameLength);
            if (firstFrameLength0 != null) {
                protoOutputStream.writeUInt32(11, firstFrameLength0);
            }
        }
        var firstFrameSidecar = protoInputObject.firstFrameSidecar();
        if (firstFrameSidecar != null) {
            var firstFrameSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(firstFrameSidecar);
            if (firstFrameSidecar0 != null) {
                var firstFrameSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstFrameSidecar0);
                if (firstFrameSidecar1 != null) {
                    protoOutputStream.writeBytes(12, firstFrameSidecar1);
                }
            }
        }
        var animated = protoInputObject.animated();
        protoOutputStream.writeBool(13, animated);
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputStream.writeBytes(16, thumbnail1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(17, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        var stickerSentTimestamp = protoInputObject.stickerSentTimestamp();
        if (stickerSentTimestamp != null) {
            var stickerSentTimestamp0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(stickerSentTimestamp);
            if (stickerSentTimestamp0 != null) {
                protoOutputStream.writeInt64(18, stickerSentTimestamp0);
            }
        }
        var avatar = protoInputObject.avatar();
        protoOutputStream.writeBool(19, avatar);
    }

    public static StickerMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static StickerMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String mediaUrl = null;
        byte[] mediaSha256 = null;
        byte[] mediaEncryptedSha256 = null;
        byte[] mediaKey = null;
        java.lang.String mimetype = null;
        java.lang.Integer height = null;
        java.lang.Integer width = null;
        java.lang.String mediaDirectPath = null;
        java.lang.Long mediaSize = null;
        java.lang.Long mediaKeyTimestampSeconds = null;
        java.lang.Integer firstFrameLength = null;
        byte[] firstFrameSidecar = null;
        boolean animated = false;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        java.lang.Long stickerSentTimestamp = null;
        boolean avatar = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> height = protoInputStream.readInt32();
                case 7 -> width = protoInputStream.readInt32();
                case 8 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> mediaSize = protoInputStream.readInt64();
                case 10 -> mediaKeyTimestampSeconds = protoInputStream.readInt64();
                case 11 -> firstFrameLength = protoInputStream.readInt32();
                case 12 -> firstFrameSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 13 -> animated = protoInputStream.readBool();
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> stickerSentTimestamp = protoInputStream.readInt64();
                case 19 -> avatar = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.StickerMessage(mediaUrl, mediaSha256, mediaEncryptedSha256, mediaKey, mimetype, height, width, mediaDirectPath, mediaSize, mediaKeyTimestampSeconds, firstFrameLength, firstFrameSidecar, animated, thumbnail, contextInfo, stickerSentTimestamp, avatar);
    }

    public static int sizeOf(StickerMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var mediaUrl = protoInputObject.mediaUrl();
        if (mediaUrl != null) {
            var mediaUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaUrl);
            if (mediaUrl0 != null) {
                var mediaUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaUrl0);
                if (mediaUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaUrl1);
                }
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaSha2561);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2561);
                }
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey1);
                }
            }
        }
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mimetype);
            if (mimetype0 != null) {
                var mimetype1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype0);
                if (mimetype1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mimetype1);
                }
            }
        }
        var height = protoInputObject.height();
        if (height != null) {
            var height0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(height);
            if (height0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(height0);
            }
        }
        var width = protoInputObject.width();
        if (width != null) {
            var width0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(width);
            if (width0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(width0);
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath1);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaSize0);
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaKeyTimestampSeconds0);
            }
        }
        var firstFrameLength = protoInputObject.firstFrameLength();
        if (firstFrameLength != null) {
            var firstFrameLength0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(firstFrameLength);
            if (firstFrameLength0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(firstFrameLength0);
            }
        }
        var firstFrameSidecar = protoInputObject.firstFrameSidecar();
        if (firstFrameSidecar != null) {
            var firstFrameSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(firstFrameSidecar);
            if (firstFrameSidecar0 != null) {
                var firstFrameSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstFrameSidecar0);
                if (firstFrameSidecar1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(firstFrameSidecar1);
                }
            }
        }
        var animated = protoInputObject.animated();
        protoOutputSize += ProtobufOutputStream.getFieldSize(13, 0);
        protoOutputSize += 1;
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        var stickerSentTimestamp = protoInputObject.stickerSentTimestamp();
        if (stickerSentTimestamp != null) {
            var stickerSentTimestamp0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(stickerSentTimestamp);
            if (stickerSentTimestamp0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(18, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stickerSentTimestamp0);
            }
        }
        var avatar = protoInputObject.avatar();
        protoOutputSize += ProtobufOutputStream.getFieldSize(19, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
