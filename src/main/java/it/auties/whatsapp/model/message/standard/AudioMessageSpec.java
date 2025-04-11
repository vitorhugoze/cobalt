package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.AudioMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AudioMessageSpec {
    public static byte[] encode(AudioMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AudioMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var voiceMessage = protoInputObject.voiceMessage();
        protoOutputStream.writeBool(6, voiceMessage);
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(7, mediaKey1);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputStream.writeBytes(8, mediaEncryptedSha2561);
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputStream.writeString(9, mediaDirectPath1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(10, mediaKeyTimestampSeconds0);
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
        var waveform = protoInputObject.waveform();
        if (waveform != null) {
            var waveform0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(waveform);
            if (waveform0 != null) {
                var waveform1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(waveform0);
                if (waveform1 != null) {
                    protoOutputStream.writeBytes(19, waveform1);
                }
            }
        }
        var backgroundArgb = protoInputObject.backgroundArgb();
        if (backgroundArgb != null) {
            protoOutputStream.writeFixed32(20, backgroundArgb);
        }
    }

    public static AudioMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AudioMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String mediaUrl = null;
        java.lang.String mimetype = null;
        byte[] mediaSha256 = null;
        java.lang.Long mediaSize = null;
        java.lang.Integer duration = null;
        boolean voiceMessage = false;
        byte[] mediaKey = null;
        byte[] mediaEncryptedSha256 = null;
        java.lang.String mediaDirectPath = null;
        java.lang.Long mediaKeyTimestampSeconds = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        byte[] streamingSidecar = null;
        byte[] waveform = null;
        java.lang.Integer backgroundArgb = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mediaSize = protoInputStream.readInt64();
                case 5 -> duration = protoInputStream.readInt32();
                case 6 -> voiceMessage = protoInputStream.readBool();
                case 7 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 8 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 9 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 10 -> mediaKeyTimestampSeconds = protoInputStream.readInt64();
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> streamingSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 19 -> waveform = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 20 -> backgroundArgb = protoInputStream.readFixed32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.AudioMessage(mediaUrl, mimetype, mediaSha256, mediaSize, duration, voiceMessage, mediaKey, mediaEncryptedSha256, mediaDirectPath, mediaKeyTimestampSeconds, contextInfo, streamingSidecar, waveform, backgroundArgb);
    }

    public static int sizeOf(AudioMessage protoInputObject) {
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
        var voiceMessage = protoInputObject.voiceMessage();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += 1;
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2561);
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath1);
                }
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
        var waveform = protoInputObject.waveform();
        if (waveform != null) {
            var waveform0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(waveform);
            if (waveform0 != null) {
                var waveform1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(waveform0);
                if (waveform1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(waveform1);
                }
            }
        }
        var backgroundArgb = protoInputObject.backgroundArgb();
        if (backgroundArgb != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(20, 5);
            protoOutputSize += 4;
        }
        return protoOutputSize;
    }

}
