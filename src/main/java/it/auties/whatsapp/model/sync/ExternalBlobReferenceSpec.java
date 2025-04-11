package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ExternalBlobReference;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ExternalBlobReferenceSpec {
    public static byte[] encode(ExternalBlobReference protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ExternalBlobReference protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(1, mediaKey1);
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputStream.writeString(2, mediaDirectPath1);
                }
            }
        }
        var handle = protoInputObject.handle();
        if (handle != null) {
            var handle0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(handle);
            if (handle0 != null) {
                var handle1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(handle0);
                if (handle1 != null) {
                    protoOutputStream.writeString(3, handle1);
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
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputStream.writeBytes(5, mediaSha2561);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputStream.writeBytes(6, mediaEncryptedSha2561);
                }
            }
        }
    }

    public static ExternalBlobReference decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ExternalBlobReference decode(ProtobufInputStream protoInputStream) {
        byte[] mediaKey = null;
        java.lang.String mediaDirectPath = null;
        java.lang.String handle = null;
        long mediaSize = 0l;
        byte[] mediaSha256 = null;
        byte[] mediaEncryptedSha256 = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> handle = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> mediaSize = protoInputStream.readInt64();
                case 5 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 6 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ExternalBlobReference(mediaKey, mediaDirectPath, handle, mediaSize, mediaSha256, mediaEncryptedSha256);
    }

    public static int sizeOf(ExternalBlobReference protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey1);
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath1);
                }
            }
        }
        var handle = protoInputObject.handle();
        if (handle != null) {
            var handle0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(handle);
            if (handle0 != null) {
                var handle1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(handle0);
                if (handle1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(handle1);
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
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2561);
                }
            }
        }
        return protoOutputSize;
    }

}
