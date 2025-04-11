package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.HistorySyncNotification;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HistorySyncNotificationSpec {
    public static byte[] encode(HistorySyncNotification protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HistorySyncNotification protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputStream.writeBytes(1, mediaSha2561);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputStream.writeUInt64(2, mediaSize0);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(3, mediaKey1);
                }
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                var mediaEncryptedSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha2560);
                if (mediaEncryptedSha2561 != null) {
                    protoOutputStream.writeBytes(4, mediaEncryptedSha2561);
                }
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                var mediaDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath0);
                if (mediaDirectPath1 != null) {
                    protoOutputStream.writeString(5, mediaDirectPath1);
                }
            }
        }
        var syncType = protoInputObject.syncType();
        if (syncType != null) {
            var syncType0 = it.auties.whatsapp.model.sync.HistorySyncTypeSpec.encode(syncType);
            protoOutputStream.writeInt32(6, syncType0);
        }
        var chunkOrder = protoInputObject.chunkOrder();
        if (chunkOrder != null) {
            protoOutputStream.writeUInt32(7, chunkOrder);
        }
        var originalMessageId = protoInputObject.originalMessageId();
        if (originalMessageId != null) {
            var originalMessageId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(originalMessageId);
            if (originalMessageId0 != null) {
                var originalMessageId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(originalMessageId0);
                if (originalMessageId1 != null) {
                    protoOutputStream.writeString(8, originalMessageId1);
                }
            }
        }
        var progress = protoInputObject.progress();
        if (progress != null) {
            protoOutputStream.writeUInt32(9, progress);
        }
        var oldestMsgInChunkTimestampSec = protoInputObject.oldestMsgInChunkTimestampSec();
        protoOutputStream.writeInt64(10, oldestMsgInChunkTimestampSec);
        var initialHistBootstrapInlinePayload = protoInputObject.initialHistBootstrapInlinePayload();
        if (initialHistBootstrapInlinePayload != null) {
            var initialHistBootstrapInlinePayload0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(initialHistBootstrapInlinePayload);
            if (initialHistBootstrapInlinePayload0 != null) {
                var initialHistBootstrapInlinePayload1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(initialHistBootstrapInlinePayload0);
                if (initialHistBootstrapInlinePayload1 != null) {
                    protoOutputStream.writeBytes(11, initialHistBootstrapInlinePayload1);
                }
            }
        }
        var peerDataRequestSessionId = protoInputObject.peerDataRequestSessionId();
        if (peerDataRequestSessionId != null) {
            var peerDataRequestSessionId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(peerDataRequestSessionId);
            if (peerDataRequestSessionId0 != null) {
                var peerDataRequestSessionId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(peerDataRequestSessionId0);
                if (peerDataRequestSessionId1 != null) {
                    protoOutputStream.writeString(12, peerDataRequestSessionId1);
                }
            }
        }
    }

    public static HistorySyncNotification decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HistorySyncNotification decode(ProtobufInputStream protoInputStream) {
        byte[] mediaSha256 = null;
        java.lang.Long mediaSize = null;
        byte[] mediaKey = null;
        byte[] mediaEncryptedSha256 = null;
        java.lang.String mediaDirectPath = null;
        it.auties.whatsapp.model.sync.HistorySync.Type syncType = null;
        java.lang.Integer chunkOrder = null;
        java.lang.String originalMessageId = null;
        java.lang.Integer progress = null;
        long oldestMsgInChunkTimestampSec = 0l;
        byte[] initialHistBootstrapInlinePayload = null;
        java.lang.String peerDataRequestSessionId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> mediaSize = protoInputStream.readInt64();
                case 3 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> syncType = it.auties.whatsapp.model.sync.HistorySyncTypeSpec.decode(protoInputStream.readInt32());
                case 7 -> chunkOrder = protoInputStream.readInt32();
                case 8 -> originalMessageId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> progress = protoInputStream.readInt32();
                case 10 -> oldestMsgInChunkTimestampSec = protoInputStream.readInt64();
                case 11 -> initialHistBootstrapInlinePayload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 12 -> peerDataRequestSessionId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.HistorySyncNotification(mediaSha256, mediaSize, mediaKey, mediaEncryptedSha256, mediaDirectPath, syncType, chunkOrder, originalMessageId, progress, oldestMsgInChunkTimestampSec, initialHistBootstrapInlinePayload, peerDataRequestSessionId);
    }

    public static int sizeOf(HistorySyncNotification protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaSha256);
            if (mediaSha2560 != null) {
                var mediaSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha2560);
                if (mediaSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaSha2561);
                }
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        if (mediaSize != null) {
            var mediaSize0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaSize);
            if (mediaSize0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaSize0);
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
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
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath1);
                }
            }
        }
        var syncType = protoInputObject.syncType();
        if (syncType != null) {
            var syncType0 = it.auties.whatsapp.model.sync.HistorySyncTypeSpec.encode(syncType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(syncType0);
        }
        var chunkOrder = protoInputObject.chunkOrder();
        if (chunkOrder != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(chunkOrder);
        }
        var originalMessageId = protoInputObject.originalMessageId();
        if (originalMessageId != null) {
            var originalMessageId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(originalMessageId);
            if (originalMessageId0 != null) {
                var originalMessageId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(originalMessageId0);
                if (originalMessageId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(originalMessageId1);
                }
            }
        }
        var progress = protoInputObject.progress();
        if (progress != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(progress);
        }
        var oldestMsgInChunkTimestampSec = protoInputObject.oldestMsgInChunkTimestampSec();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(oldestMsgInChunkTimestampSec);
        var initialHistBootstrapInlinePayload = protoInputObject.initialHistBootstrapInlinePayload();
        if (initialHistBootstrapInlinePayload != null) {
            var initialHistBootstrapInlinePayload0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(initialHistBootstrapInlinePayload);
            if (initialHistBootstrapInlinePayload0 != null) {
                var initialHistBootstrapInlinePayload1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(initialHistBootstrapInlinePayload0);
                if (initialHistBootstrapInlinePayload1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(initialHistBootstrapInlinePayload1);
                }
            }
        }
        var peerDataRequestSessionId = protoInputObject.peerDataRequestSessionId();
        if (peerDataRequestSessionId != null) {
            var peerDataRequestSessionId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(peerDataRequestSessionId);
            if (peerDataRequestSessionId0 != null) {
                var peerDataRequestSessionId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(peerDataRequestSessionId0);
                if (peerDataRequestSessionId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(peerDataRequestSessionId1);
                }
            }
        }
        return protoOutputSize;
    }

}
