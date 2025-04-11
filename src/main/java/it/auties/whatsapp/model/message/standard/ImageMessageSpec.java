package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.ImageMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ImageMessageSpec {
    public static byte[] encode(ImageMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ImageMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(3, caption1);
                }
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputStream.writeBytes(4, mediaSha2561);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputStream.writeUInt64(5, mediaSize0);
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
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(8, mediaKey1);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputStream.writeBytes(9, mediaEncryptedSha2561);
                }
            }
        }
        if (protoInputObject.interactiveAnnotations() != null) {
            for (var interactiveAnnotationsEntry : protoInputObject.interactiveAnnotations()) { 
                if (interactiveAnnotationsEntry != null) {
                    protoOutputStream.writeMessage(10, it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotationSpec.sizeOf(interactiveAnnotationsEntry));
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
                    protoOutputStream.writeString(11, mediaDirectPath1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputStream.writeUInt64(12, mediaKeyTimestampSeconds0);
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
        var firstScanSidecar = protoInputObject.firstScanSidecar();
        if (firstScanSidecar != null) {
            var firstScanSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(firstScanSidecar);
            if (firstScanSidecar0 != null) {
                var firstScanSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstScanSidecar0);
                if (firstScanSidecar1 != null) {
                    protoOutputStream.writeBytes(18, firstScanSidecar1);
                }
            }
        }
        var firstScanLength = protoInputObject.firstScanLength();
        if (firstScanLength != null) {
            var firstScanLength0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(firstScanLength);
            if (firstScanLength0 != null) {
                protoOutputStream.writeUInt32(19, firstScanLength0);
            }
        }
        var experimentGroupId = protoInputObject.experimentGroupId();
        if (experimentGroupId != null) {
            var experimentGroupId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(experimentGroupId);
            if (experimentGroupId0 != null) {
                protoOutputStream.writeUInt32(20, experimentGroupId0);
            }
        }
        var scansSidecar = protoInputObject.scansSidecar();
        if (scansSidecar != null) {
            var scansSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(scansSidecar);
            if (scansSidecar0 != null) {
                var scansSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(scansSidecar0);
                if (scansSidecar1 != null) {
                    protoOutputStream.writeBytes(21, scansSidecar1);
                }
            }
        }
        if (protoInputObject.scanLengths() != null) {
            for (var scanLengthsEntry : protoInputObject.scanLengths()) { 
                if (scanLengthsEntry != null) {
                    protoOutputStream.writeUInt32(22, scanLengthsEntry);
                }
            }
        }
        var midQualityFileSha256 = protoInputObject.midQualityFileSha256();
        if (midQualityFileSha256 != null) {
            var midQualityFileSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(midQualityFileSha256);
            if (midQualityFileSha2560 != null) {
                var midQualityFileSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(midQualityFileSha2560);
                if (midQualityFileSha2561 != null) {
                    protoOutputStream.writeBytes(23, midQualityFileSha2561);
                }
            }
        }
        var midQualityFileEncSha256 = protoInputObject.midQualityFileEncSha256();
        if (midQualityFileEncSha256 != null) {
            var midQualityFileEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(midQualityFileEncSha256);
            if (midQualityFileEncSha2560 != null) {
                var midQualityFileEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(midQualityFileEncSha2560);
                if (midQualityFileEncSha2561 != null) {
                    protoOutputStream.writeBytes(24, midQualityFileEncSha2561);
                }
            }
        }
        var viewOnce = protoInputObject.viewOnce();
        protoOutputStream.writeBool(25, viewOnce);
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath();
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                var thumbnailDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath0);
                if (thumbnailDirectPath1 != null) {
                    protoOutputStream.writeString(26, thumbnailDirectPath1);
                }
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256();
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                var thumbnailSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha2560);
                if (thumbnailSha2561 != null) {
                    protoOutputStream.writeBytes(27, thumbnailSha2561);
                }
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256();
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                var thumbnailEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha2560);
                if (thumbnailEncSha2561 != null) {
                    protoOutputStream.writeBytes(28, thumbnailEncSha2561);
                }
            }
        }
        var staticUrl = protoInputObject.staticUrl();
        if (staticUrl != null) {
            var staticUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(staticUrl);
            if (staticUrl0 != null) {
                var staticUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(staticUrl0);
                if (staticUrl1 != null) {
                    protoOutputStream.writeString(29, staticUrl1);
                }
            }
        }
    }

    public static ImageMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ImageMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String mediaUrl = null;
        java.lang.String mimetype = null;
        java.lang.String caption = null;
        byte[] mediaSha256 = null;
        java.lang.Long mediaSize = null;
        java.lang.Integer height = null;
        java.lang.Integer width = null;
        byte[] mediaKey = null;
        byte[] mediaEncryptedSha256 = null;
        java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation> interactiveAnnotations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String mediaDirectPath = null;
        java.lang.Long mediaKeyTimestampSeconds = null;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        byte[] firstScanSidecar = null;
        java.lang.Integer firstScanLength = null;
        java.lang.Integer experimentGroupId = null;
        byte[] scansSidecar = null;
        java.util.List<java.lang.Integer> scanLengths = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        byte[] midQualityFileSha256 = null;
        byte[] midQualityFileEncSha256 = null;
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
                case 3 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> mediaSize = protoInputStream.readInt64();
                case 6 -> height = protoInputStream.readInt32();
                case 7 -> width = protoInputStream.readInt32();
                case 8 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 9 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 10 -> interactiveAnnotations.add(it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotationSpec.decode(protoInputStream.readLengthDelimited()));
                case 11 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 12 -> mediaKeyTimestampSeconds = protoInputStream.readInt64();
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> firstScanSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 19 -> firstScanLength = protoInputStream.readInt32();
                case 20 -> experimentGroupId = protoInputStream.readInt32();
                case 21 -> scansSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 22 -> scanLengths.add(protoInputStream.readInt32());
                case 23 -> midQualityFileSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 24 -> midQualityFileEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 25 -> viewOnce = protoInputStream.readBool();
                case 26 -> thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 27 -> thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 28 -> thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 29 -> staticUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.ImageMessage(mediaUrl, mimetype, caption, mediaSha256, mediaSize, height, width, mediaKey, mediaEncryptedSha256, interactiveAnnotations, mediaDirectPath, mediaKeyTimestampSeconds, thumbnail, contextInfo, firstScanSidecar, firstScanLength, experimentGroupId, scansSidecar, scanLengths, midQualityFileSha256, midQualityFileEncSha256, viewOnce, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, staticUrl);
    }

    public static int sizeOf(ImageMessage protoInputObject) {
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
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaSha2561);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaSize0);
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
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey1);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2561);
                }
            }
        }
        if (protoInputObject.interactiveAnnotations() != null) {
            for (var interactiveAnnotationsEntry : protoInputObject.interactiveAnnotations()) { 
                if (interactiveAnnotationsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(12, 0);
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
        var firstScanSidecar = protoInputObject.firstScanSidecar();
        if (firstScanSidecar != null) {
            var firstScanSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(firstScanSidecar);
            if (firstScanSidecar0 != null) {
                var firstScanSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstScanSidecar0);
                if (firstScanSidecar1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(firstScanSidecar1);
                }
            }
        }
        var firstScanLength = protoInputObject.firstScanLength();
        if (firstScanLength != null) {
            var firstScanLength0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(firstScanLength);
            if (firstScanLength0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(19, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(firstScanLength0);
            }
        }
        var experimentGroupId = protoInputObject.experimentGroupId();
        if (experimentGroupId != null) {
            var experimentGroupId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(experimentGroupId);
            if (experimentGroupId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(20, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(experimentGroupId0);
            }
        }
        var scansSidecar = protoInputObject.scansSidecar();
        if (scansSidecar != null) {
            var scansSidecar0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(scansSidecar);
            if (scansSidecar0 != null) {
                var scansSidecar1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(scansSidecar0);
                if (scansSidecar1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(scansSidecar1);
                }
            }
        }
        if (protoInputObject.scanLengths() != null) {
            for (var scanLengthsEntry : protoInputObject.scanLengths()) { 
                if (scanLengthsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(22, 0);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(scanLengthsEntry);
                }
            }
        }
        var midQualityFileSha256 = protoInputObject.midQualityFileSha256();
        if (midQualityFileSha256 != null) {
            var midQualityFileSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(midQualityFileSha256);
            if (midQualityFileSha2560 != null) {
                var midQualityFileSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(midQualityFileSha2560);
                if (midQualityFileSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(midQualityFileSha2561);
                }
            }
        }
        var midQualityFileEncSha256 = protoInputObject.midQualityFileEncSha256();
        if (midQualityFileEncSha256 != null) {
            var midQualityFileEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(midQualityFileEncSha256);
            if (midQualityFileEncSha2560 != null) {
                var midQualityFileEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(midQualityFileEncSha2560);
                if (midQualityFileEncSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(midQualityFileEncSha2561);
                }
            }
        }
        var viewOnce = protoInputObject.viewOnce();
        protoOutputSize += ProtobufOutputStream.getFieldSize(25, 0);
        protoOutputSize += 1;
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath();
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                var thumbnailDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath0);
                if (thumbnailDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(staticUrl1);
                }
            }
        }
        return protoOutputSize;
    }

}
