package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.HistorySync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;
import java.util.Objects;

public class HistorySyncSpec {
    public static byte[] encode(HistorySync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HistorySync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        Objects.requireNonNull(protoInputObject.syncType(), "Missing required property: syncType");
        var syncType = protoInputObject.syncType();
        if (syncType != null) {
            var syncType0 = it.auties.whatsapp.model.sync.HistorySyncTypeSpec.encode(syncType);
            protoOutputStream.writeInt32(1, syncType0);
        }
        if (protoInputObject.conversations() != null) {
            for (var conversationsEntry : protoInputObject.conversations()) { 
                if (conversationsEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.chat.ChatSpec.sizeOf(conversationsEntry));
                    it.auties.whatsapp.model.chat.ChatSpec.encode(conversationsEntry, protoOutputStream);
                }
            }
        }
        if (protoInputObject.statusV3Messages() != null) {
            for (var statusV3MessagesEntry : protoInputObject.statusV3Messages()) { 
                if (statusV3MessagesEntry != null) {
                    protoOutputStream.writeMessage(3, it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(statusV3MessagesEntry));
                    it.auties.whatsapp.model.info.ChatMessageInfoSpec.encode(statusV3MessagesEntry, protoOutputStream);
                }
            }
        }
        var chunkOrder = protoInputObject.chunkOrder();
        protoOutputStream.writeUInt32(5, chunkOrder);
        var progress = protoInputObject.progress();
        if (progress != null) {
            protoOutputStream.writeUInt32(6, progress);
        }
        if (protoInputObject.pushNames() != null) {
            for (var pushNamesEntry : protoInputObject.pushNames()) { 
                if (pushNamesEntry != null) {
                    protoOutputStream.writeMessage(7, it.auties.whatsapp.model.sync.PushNameSpec.sizeOf(pushNamesEntry));
                    it.auties.whatsapp.model.sync.PushNameSpec.encode(pushNamesEntry, protoOutputStream);
                }
            }
        }
        var globalSettings = protoInputObject.globalSettings();
        if (globalSettings != null) {
            protoOutputStream.writeMessage(8, it.auties.whatsapp.model.setting.GlobalSettingsSpec.sizeOf(globalSettings));
            it.auties.whatsapp.model.setting.GlobalSettingsSpec.encode(globalSettings, protoOutputStream);
        }
        var threadIdUserSecret = protoInputObject.threadIdUserSecret();
        if (threadIdUserSecret != null) {
            var threadIdUserSecret0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(threadIdUserSecret);
            if (threadIdUserSecret0 != null) {
                protoOutputStream.writeBytes(9, threadIdUserSecret0);
            }
        }
        var threadDsTimeframeOffset = protoInputObject.threadDsTimeframeOffset();
        protoOutputStream.writeUInt32(10, threadDsTimeframeOffset);
        if (protoInputObject.recentStickers() != null) {
            for (var recentStickersEntry : protoInputObject.recentStickers()) { 
                if (recentStickersEntry != null) {
                    protoOutputStream.writeMessage(11, it.auties.whatsapp.model.sync.StickerMetadataSpec.sizeOf(recentStickersEntry));
                    it.auties.whatsapp.model.sync.StickerMetadataSpec.encode(recentStickersEntry, protoOutputStream);
                }
            }
        }
        if (protoInputObject.pastParticipants() != null) {
            for (var pastParticipantsEntry : protoInputObject.pastParticipants()) { 
                if (pastParticipantsEntry != null) {
                    protoOutputStream.writeMessage(12, it.auties.whatsapp.model.chat.GroupPastParticipantsSpec.sizeOf(pastParticipantsEntry));
                    it.auties.whatsapp.model.chat.GroupPastParticipantsSpec.encode(pastParticipantsEntry, protoOutputStream);
                }
            }
        }
    }

    public static HistorySync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HistorySync decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.HistorySync.Type syncType = null;
        java.util.List<it.auties.whatsapp.model.chat.Chat> conversations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.util.List<it.auties.whatsapp.model.info.ChatMessageInfo> statusV3Messages = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        int chunkOrder = 0;
        java.lang.Integer progress = null;
        java.util.List<it.auties.whatsapp.model.sync.PushName> pushNames = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.setting.GlobalSettings globalSettings = null;
        byte[] threadIdUserSecret = null;
        int threadDsTimeframeOffset = 0;
        java.util.List<it.auties.whatsapp.model.sync.StickerMetadata> recentStickers = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.util.List<it.auties.whatsapp.model.chat.GroupPastParticipants> pastParticipants = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> syncType = it.auties.whatsapp.model.sync.HistorySyncTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> conversations.add(it.auties.whatsapp.model.chat.ChatSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> statusV3Messages.add(it.auties.whatsapp.model.info.ChatMessageInfoSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> chunkOrder = protoInputStream.readInt32();
                case 6 -> progress = protoInputStream.readInt32();
                case 7 -> pushNames.add(it.auties.whatsapp.model.sync.PushNameSpec.decode(protoInputStream.readLengthDelimited()));
                case 8 -> globalSettings = it.auties.whatsapp.model.setting.GlobalSettingsSpec.decode(protoInputStream.readLengthDelimited());
                case 9 -> threadIdUserSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 10 -> threadDsTimeframeOffset = protoInputStream.readInt32();
                case 11 -> recentStickers.add(it.auties.whatsapp.model.sync.StickerMetadataSpec.decode(protoInputStream.readLengthDelimited()));
                case 12 -> pastParticipants.add(it.auties.whatsapp.model.chat.GroupPastParticipantsSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        Objects.requireNonNull(syncType, "Missing required property: syncType");
        return new it.auties.whatsapp.model.sync.HistorySync(syncType, conversations, statusV3Messages, chunkOrder, progress, pushNames, globalSettings, threadIdUserSecret, threadDsTimeframeOffset, recentStickers, pastParticipants);
    }

    public static int sizeOf(HistorySync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var syncType = protoInputObject.syncType();
        if (syncType != null) {
            var syncType0 = it.auties.whatsapp.model.sync.HistorySyncTypeSpec.encode(syncType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(syncType0);
        }
        if (protoInputObject.conversations() != null) {
            for (var conversationsEntry : protoInputObject.conversations()) { 
                if (conversationsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var conversationsEntrySerializedSize = it.auties.whatsapp.model.chat.ChatSpec.sizeOf(conversationsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(conversationsEntrySerializedSize);
                    protoOutputSize += conversationsEntrySerializedSize;
                }
            }
        }
        if (protoInputObject.statusV3Messages() != null) {
            for (var statusV3MessagesEntry : protoInputObject.statusV3Messages()) { 
                if (statusV3MessagesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    var statusV3MessagesEntrySerializedSize = it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(statusV3MessagesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(statusV3MessagesEntrySerializedSize);
                    protoOutputSize += statusV3MessagesEntrySerializedSize;
                }
            }
        }
        var chunkOrder = protoInputObject.chunkOrder();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(chunkOrder);
        var progress = protoInputObject.progress();
        if (progress != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(progress);
        }
        if (protoInputObject.pushNames() != null) {
            for (var pushNamesEntry : protoInputObject.pushNames()) { 
                if (pushNamesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    var pushNamesEntrySerializedSize = it.auties.whatsapp.model.sync.PushNameSpec.sizeOf(pushNamesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(pushNamesEntrySerializedSize);
                    protoOutputSize += pushNamesEntrySerializedSize;
                }
            }
        }
        var globalSettings = protoInputObject.globalSettings();
        if (globalSettings != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
            var globalSettingsSerializedSize = it.auties.whatsapp.model.setting.GlobalSettingsSpec.sizeOf(globalSettings);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(globalSettingsSerializedSize);
            protoOutputSize += globalSettingsSerializedSize;
        }
        var threadIdUserSecret = protoInputObject.threadIdUserSecret();
        if (threadIdUserSecret != null) {
            var threadIdUserSecret0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(threadIdUserSecret);
            if (threadIdUserSecret0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(threadIdUserSecret0);
            }
        }
        var threadDsTimeframeOffset = protoInputObject.threadDsTimeframeOffset();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(threadDsTimeframeOffset);
        if (protoInputObject.recentStickers() != null) {
            for (var recentStickersEntry : protoInputObject.recentStickers()) { 
                if (recentStickersEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                    var recentStickersEntrySerializedSize = it.auties.whatsapp.model.sync.StickerMetadataSpec.sizeOf(recentStickersEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(recentStickersEntrySerializedSize);
                    protoOutputSize += recentStickersEntrySerializedSize;
                }
            }
        }
        if (protoInputObject.pastParticipants() != null) {
            for (var pastParticipantsEntry : protoInputObject.pastParticipants()) { 
                if (pastParticipantsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                    var pastParticipantsEntrySerializedSize = it.auties.whatsapp.model.chat.GroupPastParticipantsSpec.sizeOf(pastParticipantsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(pastParticipantsEntrySerializedSize);
                    protoOutputSize += pastParticipantsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
