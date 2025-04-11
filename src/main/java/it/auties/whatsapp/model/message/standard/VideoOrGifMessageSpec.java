package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.VideoOrGifMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class VideoOrGifMessageSpec {
    public static byte[] encode(VideoOrGifMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(VideoOrGifMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mimetype);
            if (mimetype0 != null) {
                var mimetype1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype0);
                if (mimetype1 != null) {
                    protoOutputStream.writeString(2, mimetype1);
                }
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputStream.writeBytes(3, mediaSha2561);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputStream.writeUInt64(4, mediaSize0);
            }
        }
        var duration = protoInputObject.duration();
        if (duration != null) {
            var duration0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(duration);
            if (duration0 != null) {
                protoOutputStream.writeUInt32(5, duration0);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(6, mediaKey1);
                }
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(7, caption1);
                }
            }
        }
        var gifPlayback = protoInputObject.gifPlayback();
        protoOutputStream.writeBool(8, gifPlayback);
        var height = protoInputObject.height();
        if (height != null) {
            var height0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(height);
            if (height0 != null) {
                protoOutputStream.writeUInt32(9, height0);
            }
        }
        var width = protoInputObject.width();
        if (width != null) {
            var width0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(width);
            if (width0 != null) {
                protoOutputStream.writeUInt32(10, width0);
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputStream.writeBytes(11, mediaEncryptedSha2561);
                }
            }
        }
        if (protoInputObject.interactiveAnnotations() != null) {
            for (var interactiveAnnotationsEntry : protoInputObject.interactiveAnnotations()) { 
                if (interactiveAnnotationsEntry != null) {
                    protoOutputStream.writeMessage(12, it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotationSpec.sizeOf(interactiveAnnotationsEntry));
                    it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotationSpec.encode(interactiveAnnotationsEntry, protoOutputStream);
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputStream.writeString(13, mediaDirectPath1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(14, mediaKeyTimestampSeconds0);
            }
        }
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
        var streamingSidecar = protoInputObject.streamingSidecar();
        if (streamingSidecar != null) {
            var streamingSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(streamingSidecar);
            if (streamingSidecar0 != null) {
                var streamingSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(streamingSidecar0);
                if (streamingSidecar1 != null) {
                    protoOutputStream.writeBytes(18, streamingSidecar1);
                }
            }
        }
        var gifAttribution = protoInputObject.gifAttribution();
        if (gifAttribution != null) {
            var gifAttribution0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(gifAttribution);
            if (gifAttribution0 != null) {
                var gifAttribution1 = it.auties.whatsapp.model.message.standard.VideoOrGifMessageAttributionSpec.encode(gifAttribution0);
                protoOutputStream.writeInt32(19, gifAttribution1);
            }
        }
        var viewOnce = protoInputObject.viewOnce();
        protoOutputStream.writeBool(20, viewOnce);
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath();
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                var thumbnailDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath0);
                if (thumbnailDirectPath1 != null) {
                    protoOutputStream.writeString(21, thumbnailDirectPath1);
                }
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256();
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                var thumbnailSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha2560);
                if (thumbnailSha2561 != null) {
                    protoOutputStream.writeBytes(22, thumbnailSha2561);
                }
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256();
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                var thumbnailEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha2560);
                if (thumbnailEncSha2561 != null) {
                    protoOutputStream.writeBytes(23, thumbnailEncSha2561);
                }
            }
        }
        var staticUrl = protoInputObject.staticUrl();
        if (staticUrl != null) {
            var staticUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(staticUrl);
            if (staticUrl0 != null) {
                var staticUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(staticUrl0);
                if (staticUrl1 != null) {
                    protoOutputStream.writeString(24, staticUrl1);
                }
            }
        }
    }

    public static VideoOrGifMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static VideoOrGifMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String mediaUrl = null;
        java.lang.String mimetype = null;
        byte[] mediaSha256 = null;
        java.lang.Long mediaSize = null;
        java.lang.Integer duration = null;
        byte[] mediaKey = null;
        java.lang.String caption = null;
        boolean gifPlayback = false;
        java.lang.Integer height = null;
        java.lang.Integer width = null;
        byte[] mediaEncryptedSha256 = null;
        java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation> interactiveAnnotations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String mediaDirectPath = null;
        long mediaKeyTimestampSeconds = 0l;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        byte[] streamingSidecar = null;
        it.auties.whatsapp.model.message.standard.VideoOrGifMessage.Attribution gifAttribution = null;
        boolean viewOnce = false;
        java.lang.String thumbnailDirectPath = null;
        byte[] thumbnailSha256 = null;
        byte[] thumbnailEncSha256 = null;
        java.lang.String staticUrl = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mediaSize = protoInputStream.readInt64();
                case 5 -> duration = protoInputStream.readInt32();
                case 6 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 7 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> gifPlayback = protoInputStream.readBool();
                case 9 -> height = protoInputStream.readInt32();
                case 10 -> width = protoInputStream.readInt32();
                case 11 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 12 -> interactiveAnnotations.add(it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotationSpec.decode(protoInputStream.readLengthDelimited()));
                case 13 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 14 -> mediaKeyTimestampSeconds = protoInputStream.readInt64();
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> streamingSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 19 -> gifAttribution = it.auties.whatsapp.model.message.standard.VideoOrGifMessageAttributionSpec.decode(protoInputStream.readInt32());
                case 20 -> viewOnce = protoInputStream.readBool();
                case 21 -> thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 22 -> thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 23 -> thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 24 -> staticUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.VideoOrGifMessage(mediaUrl, mimetype, mediaSha256, mediaSize, duration, mediaKey, caption, gifPlayback, height, width, mediaEncryptedSha256, interactiveAnnotations, mediaDirectPath, mediaKeyTimestampSeconds, thumbnail, contextInfo, streamingSidecar, gifAttribution, viewOnce, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, staticUrl);
    }

    public static int sizeOf(VideoOrGifMessage protoInputObject) {
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
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mimetype);
            if (mimetype0 != null) {
                var mimetype1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype0);
                if (mimetype1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mimetype1);
                }
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaSha2561);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaSize0);
            }
        }
        var duration = protoInputObject.duration();
        if (duration != null) {
            var duration0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(duration);
            if (duration0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(duration0);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey1);
                }
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
        var gifPlayback = protoInputObject.gifPlayback();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += 1;
        var height = protoInputObject.height();
        if (height != null) {
            var height0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(height);
            if (height0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(height0);
            }
        }
        var width = protoInputObject.width();
        if (width != null) {
            var width0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(width);
            if (width0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(width0);
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2561);
                }
            }
        }
        if (protoInputObject.interactiveAnnotations() != null) {
            for (var interactiveAnnotationsEntry : protoInputObject.interactiveAnnotations()) { 
                if (interactiveAnnotationsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                    var interactiveAnnotationsEntrySerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotationSpec.sizeOf(interactiveAnnotationsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(interactiveAnnotationsEntrySerializedSize);
                    protoOutputSize += interactiveAnnotationsEntrySerializedSize;
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaKeyTimestampSeconds0);
            }
        }
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
        var streamingSidecar = protoInputObject.streamingSidecar();
        if (streamingSidecar != null) {
            var streamingSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(streamingSidecar);
            if (streamingSidecar0 != null) {
                var streamingSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(streamingSidecar0);
                if (streamingSidecar1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(streamingSidecar1);
                }
            }
        }
        var gifAttribution = protoInputObject.gifAttribution();
        if (gifAttribution != null) {
            var gifAttribution0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(gifAttribution);
            if (gifAttribution0 != null) {
                var gifAttribution1 = it.auties.whatsapp.model.message.standard.VideoOrGifMessageAttributionSpec.encode(gifAttribution0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(gifAttribution1);
            }
        }
        var viewOnce = protoInputObject.viewOnce();
        protoOutputSize += ProtobufOutputStream.getFieldSize(20, 0);
        protoOutputSize += 1;
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath();
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                var thumbnailDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath0);
                if (thumbnailDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(thumbnailDirectPath1);
                }
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256();
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                var thumbnailSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha2560);
                if (thumbnailSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnailSha2561);
                }
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256();
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                var thumbnailEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha2560);
                if (thumbnailEncSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnailEncSha2561);
                }
            }
        }
        var staticUrl = protoInputObject.staticUrl();
        if (staticUrl != null) {
            var staticUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(staticUrl);
            if (staticUrl0 != null) {
                var staticUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(staticUrl0);
                if (staticUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(staticUrl1);
                }
            }
        }
        return protoOutputSize;
    }

}
