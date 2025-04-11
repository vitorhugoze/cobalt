package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.Chat;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatSpec {
    public static byte[] encode(Chat protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Chat protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var jid = protoInputObject.jid;
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputStream.writeString(1, jid1);
                }
            }
        }
        if (protoInputObject.historySyncMessages != null) {
            for (var historySyncMessagesEntry : protoInputObject.historySyncMessages) { 
                if (historySyncMessagesEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.HistorySyncMessageSpec.sizeOf(historySyncMessagesEntry));
                    it.auties.whatsapp.model.sync.HistorySyncMessageSpec.encode(historySyncMessagesEntry, protoOutputStream);
                }
            }
        }
        var newJid = protoInputObject.newJid;
        if (newJid != null) {
            var newJid0 = newJid.toString();
            if (newJid0 != null) {
                var newJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newJid0);
                if (newJid1 != null) {
                    protoOutputStream.writeString(3, newJid1);
                }
            }
        }
        var oldJid = protoInputObject.oldJid;
        if (oldJid != null) {
            var oldJid0 = oldJid.toString();
            if (oldJid0 != null) {
                var oldJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(oldJid0);
                if (oldJid1 != null) {
                    protoOutputStream.writeString(4, oldJid1);
                }
            }
        }
        var unreadMessagesCount = protoInputObject.unreadMessagesCount;
        protoOutputStream.writeUInt32(6, unreadMessagesCount);
        var endOfHistoryTransfer = protoInputObject.endOfHistoryTransfer;
        protoOutputStream.writeBool(8, endOfHistoryTransfer);
        var ephemeralMessageDuration = protoInputObject.ephemeralMessageDuration;
        if (ephemeralMessageDuration != null) {
            var ephemeralMessageDuration0 = it.auties.whatsapp.model.chat.ChatEphemeralTimerSpec.encode(ephemeralMessageDuration);
            protoOutputStream.writeUInt32(9, ephemeralMessageDuration0);
        }
        var ephemeralMessagesToggleTimeSeconds = protoInputObject.ephemeralMessagesToggleTimeSeconds;
        protoOutputStream.writeInt64(10, ephemeralMessagesToggleTimeSeconds);
        var endOfHistoryTransferType = protoInputObject.endOfHistoryTransferType;
        if (endOfHistoryTransferType != null) {
            var endOfHistoryTransferType0 = it.auties.whatsapp.model.chat.ChatEndOfHistoryTransferTypeSpec.encode(endOfHistoryTransferType);
            protoOutputStream.writeInt32(11, endOfHistoryTransferType0);
        }
        var timestampSeconds = protoInputObject.timestampSeconds;
        protoOutputStream.writeUInt64(12, timestampSeconds);
        var name = protoInputObject.name;
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(13, name0);
            }
        }
        var notSpam = protoInputObject.notSpam;
        protoOutputStream.writeBool(15, notSpam);
        var archived = protoInputObject.archived;
        protoOutputStream.writeBool(16, archived);
        var disappearInitiator = protoInputObject.disappearInitiator;
        if (disappearInitiator != null) {
            protoOutputStream.writeMessage(17, it.auties.whatsapp.model.chat.ChatDisappearSpec.sizeOf(disappearInitiator));
            it.auties.whatsapp.model.chat.ChatDisappearSpec.encode(disappearInitiator, protoOutputStream);
        }
        var markedAsUnread = protoInputObject.markedAsUnread;
        protoOutputStream.writeBool(19, markedAsUnread);
        var pinnedTimestampSeconds = protoInputObject.pinnedTimestampSeconds;
        protoOutputStream.writeUInt32(24, pinnedTimestampSeconds);
        var mute = protoInputObject.mute;
        if (mute != null) {
            var mute0 = mute.endTimeStamp();
            protoOutputStream.writeUInt64(25, mute0);
        }
        var wallpaper = protoInputObject.wallpaper;
        if (wallpaper != null) {
            protoOutputStream.writeMessage(26, it.auties.whatsapp.model.chat.ChatWallpaperSpec.sizeOf(wallpaper));
            it.auties.whatsapp.model.chat.ChatWallpaperSpec.encode(wallpaper, protoOutputStream);
        }
        var mediaVisibility = protoInputObject.mediaVisibility;
        if (mediaVisibility != null) {
            var mediaVisibility0 = it.auties.whatsapp.model.media.MediaVisibilitySpec.encode(mediaVisibility);
            protoOutputStream.writeInt32(27, mediaVisibility0);
        }
        var suspended = protoInputObject.suspended;
        protoOutputStream.writeBool(29, suspended);
        var terminated = protoInputObject.terminated;
        protoOutputStream.writeBool(30, terminated);
        var support = protoInputObject.support;
        protoOutputStream.writeBool(34, support);
        var displayName = protoInputObject.displayName;
        if (displayName != null) {
            var displayName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(displayName);
            if (displayName0 != null) {
                protoOutputStream.writeString(38, displayName0);
            }
        }
        var phoneJid = protoInputObject.phoneJid;
        if (phoneJid != null) {
            var phoneJid0 = phoneJid.toString();
            if (phoneJid0 != null) {
                var phoneJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phoneJid0);
                if (phoneJid1 != null) {
                    protoOutputStream.writeString(39, phoneJid1);
                }
            }
        }
        var shareOwnPhoneNumber = protoInputObject.shareOwnPhoneNumber;
        protoOutputStream.writeBool(40, shareOwnPhoneNumber);
        var pnhDuplicateLidThread = protoInputObject.pnhDuplicateLidThread;
        protoOutputStream.writeBool(41, pnhDuplicateLidThread);
        var lid = protoInputObject.lid;
        if (lid != null) {
            var lid0 = lid.toString();
            if (lid0 != null) {
                var lid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lid0);
                if (lid1 != null) {
                    protoOutputStream.writeString(42, lid1);
                }
            }
        }
        if (protoInputObject.presences != null) {
            for (var presencesEntry : protoInputObject.presences.entrySet()) { 
                protoOutputStream.writeMessage(999, sizeOfPresences(presencesEntry));
                var presencesKey0 = presencesEntry.getKey().toString();
                if (presencesKey0 != null) {
                    var presencesKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(presencesKey0);
                    if (presencesKey1 != null) {
                        protoOutputStream.writeString(1, presencesKey1);
                    }
                }
                var presencesValue = presencesEntry.getValue();
                if (presencesValue != null) {
                    var presencesValue0 = it.auties.whatsapp.model.contact.ContactStatusSpec.encode(presencesValue);
                    protoOutputStream.writeInt32(2, presencesValue0);
                }
            }
        }
    }

    public static Chat decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Chat decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid jid = null;
        it.auties.whatsapp.util.ConcurrentLinkedSet<it.auties.whatsapp.model.sync.HistorySyncMessage> historySyncMessages = new it.auties.whatsapp.util.ConcurrentLinkedSet();
        it.auties.whatsapp.model.jid.Jid newJid = null;
        it.auties.whatsapp.model.jid.Jid oldJid = null;
        int unreadMessagesCount = 0;
        boolean endOfHistoryTransfer = false;
        it.auties.whatsapp.model.chat.ChatEphemeralTimer ephemeralMessageDuration = null;
        long ephemeralMessagesToggleTimeSeconds = 0l;
        it.auties.whatsapp.model.chat.Chat.EndOfHistoryTransferType endOfHistoryTransferType = null;
        long timestampSeconds = 0l;
        java.lang.String name = null;
        boolean notSpam = false;
        boolean archived = false;
        it.auties.whatsapp.model.chat.ChatDisappear disappearInitiator = null;
        boolean markedAsUnread = false;
        int pinnedTimestampSeconds = 0;
        it.auties.whatsapp.model.chat.ChatMute mute = null;
        it.auties.whatsapp.model.chat.ChatWallpaper wallpaper = null;
        it.auties.whatsapp.model.media.MediaVisibility mediaVisibility = null;
        boolean suspended = false;
        boolean terminated = false;
        boolean support = false;
        java.lang.String displayName = null;
        it.auties.whatsapp.model.jid.Jid phoneJid = null;
        boolean shareOwnPhoneNumber = false;
        boolean pnhDuplicateLidThread = false;
        it.auties.whatsapp.model.jid.Jid lid = null;
        java.util.concurrent.ConcurrentHashMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.contact.ContactStatus> presences = new java.util.concurrent.ConcurrentHashMap();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> historySyncMessages.add(it.auties.whatsapp.model.sync.HistorySyncMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> newJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> oldJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 6 -> unreadMessagesCount = protoInputStream.readInt32();
                case 8 -> endOfHistoryTransfer = protoInputStream.readBool();
                case 9 -> ephemeralMessageDuration = it.auties.whatsapp.model.chat.ChatEphemeralTimerSpec.decode(protoInputStream.readInt32());
                case 10 -> ephemeralMessagesToggleTimeSeconds = protoInputStream.readInt64();
                case 11 -> endOfHistoryTransferType = it.auties.whatsapp.model.chat.ChatEndOfHistoryTransferTypeSpec.decode(protoInputStream.readInt32());
                case 12 -> timestampSeconds = protoInputStream.readInt64();
                case 13 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 15 -> notSpam = protoInputStream.readBool();
                case 16 -> archived = protoInputStream.readBool();
                case 17 -> disappearInitiator = it.auties.whatsapp.model.chat.ChatDisappearSpec.decode(protoInputStream.readLengthDelimited());
                case 19 -> markedAsUnread = protoInputStream.readBool();
                case 24 -> pinnedTimestampSeconds = protoInputStream.readInt32();
                case 25 -> mute = it.auties.whatsapp.model.chat.ChatMute.ofProtobuf(protoInputStream.readInt64());
                case 26 -> wallpaper = it.auties.whatsapp.model.chat.ChatWallpaperSpec.decode(protoInputStream.readLengthDelimited());
                case 27 -> mediaVisibility = it.auties.whatsapp.model.media.MediaVisibilitySpec.decode(protoInputStream.readInt32());
                case 29 -> suspended = protoInputStream.readBool();
                case 30 -> terminated = protoInputStream.readBool();
                case 34 -> support = protoInputStream.readBool();
                case 38 -> displayName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 39 -> phoneJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 40 -> shareOwnPhoneNumber = protoInputStream.readBool();
                case 41 -> pnhDuplicateLidThread = protoInputStream.readBool();
                case 42 -> lid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 999 -> {
                    var presencesInputStream = protoInputStream.readLengthDelimited();
                    it.auties.whatsapp.model.jid.Jid presencesKey = null;
                    it.auties.whatsapp.model.contact.ContactStatus presencesValue = null;
                    while (presencesInputStream.readTag()) {
                        switch (presencesInputStream.index()) {
                            case 1 -> presencesKey = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(presencesInputStream.readString()));
                            case 2 -> presencesValue = it.auties.whatsapp.model.contact.ContactStatusSpec.decode(presencesInputStream.readInt32());
                        }
                    }
                    presences.put(presencesKey, presencesValue);
                }
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.chat.Chat(jid, historySyncMessages, newJid, oldJid, unreadMessagesCount, endOfHistoryTransfer, ephemeralMessageDuration, ephemeralMessagesToggleTimeSeconds, endOfHistoryTransferType, timestampSeconds, name, notSpam, archived, disappearInitiator, markedAsUnread, pinnedTimestampSeconds, mute, wallpaper, mediaVisibility, suspended, terminated, support, displayName, phoneJid, shareOwnPhoneNumber, pnhDuplicateLidThread, lid, presences);
    }

    public static int sizeOf(Chat protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var jid = protoInputObject.jid;
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(jid1);
                }
            }
        }
        if (protoInputObject.historySyncMessages != null) {
            for (var historySyncMessagesEntry : protoInputObject.historySyncMessages) { 
                if (historySyncMessagesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var historySyncMessagesEntrySerializedSize = it.auties.whatsapp.model.sync.HistorySyncMessageSpec.sizeOf(historySyncMessagesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(historySyncMessagesEntrySerializedSize);
                    protoOutputSize += historySyncMessagesEntrySerializedSize;
                }
            }
        }
        var newJid = protoInputObject.newJid;
        if (newJid != null) {
            var newJid0 = newJid.toString();
            if (newJid0 != null) {
                var newJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newJid0);
                if (newJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(newJid1);
                }
            }
        }
        var oldJid = protoInputObject.oldJid;
        if (oldJid != null) {
            var oldJid0 = oldJid.toString();
            if (oldJid0 != null) {
                var oldJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(oldJid0);
                if (oldJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(oldJid1);
                }
            }
        }
        var unreadMessagesCount = protoInputObject.unreadMessagesCount;
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(unreadMessagesCount);
        var endOfHistoryTransfer = protoInputObject.endOfHistoryTransfer;
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += 1;
        var ephemeralMessageDuration = protoInputObject.ephemeralMessageDuration;
        if (ephemeralMessageDuration != null) {
            var ephemeralMessageDuration0 = it.auties.whatsapp.model.chat.ChatEphemeralTimerSpec.encode(ephemeralMessageDuration);
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralMessageDuration0);
        }
        var ephemeralMessagesToggleTimeSeconds = protoInputObject.ephemeralMessagesToggleTimeSeconds;
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralMessagesToggleTimeSeconds);
        var endOfHistoryTransferType = protoInputObject.endOfHistoryTransferType;
        if (endOfHistoryTransferType != null) {
            var endOfHistoryTransferType0 = it.auties.whatsapp.model.chat.ChatEndOfHistoryTransferTypeSpec.encode(endOfHistoryTransferType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(endOfHistoryTransferType0);
        }
        var timestampSeconds = protoInputObject.timestampSeconds;
        protoOutputSize += ProtobufOutputStream.getFieldSize(12, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampSeconds);
        var name = protoInputObject.name;
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        var notSpam = protoInputObject.notSpam;
        protoOutputSize += ProtobufOutputStream.getFieldSize(15, 0);
        protoOutputSize += 1;
        var archived = protoInputObject.archived;
        protoOutputSize += ProtobufOutputStream.getFieldSize(16, 0);
        protoOutputSize += 1;
        var disappearInitiator = protoInputObject.disappearInitiator;
        if (disappearInitiator != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
            var disappearInitiatorSerializedSize = it.auties.whatsapp.model.chat.ChatDisappearSpec.sizeOf(disappearInitiator);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(disappearInitiatorSerializedSize);
            protoOutputSize += disappearInitiatorSerializedSize;
        }
        var markedAsUnread = protoInputObject.markedAsUnread;
        protoOutputSize += ProtobufOutputStream.getFieldSize(19, 0);
        protoOutputSize += 1;
        var pinnedTimestampSeconds = protoInputObject.pinnedTimestampSeconds;
        protoOutputSize += ProtobufOutputStream.getFieldSize(24, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(pinnedTimestampSeconds);
        var mute = protoInputObject.mute;
        if (mute != null) {
            var mute0 = mute.endTimeStamp();
            protoOutputSize += ProtobufOutputStream.getFieldSize(25, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mute0);
        }
        var wallpaper = protoInputObject.wallpaper;
        if (wallpaper != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
            var wallpaperSerializedSize = it.auties.whatsapp.model.chat.ChatWallpaperSpec.sizeOf(wallpaper);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(wallpaperSerializedSize);
            protoOutputSize += wallpaperSerializedSize;
        }
        var mediaVisibility = protoInputObject.mediaVisibility;
        if (mediaVisibility != null) {
            var mediaVisibility0 = it.auties.whatsapp.model.media.MediaVisibilitySpec.encode(mediaVisibility);
            protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaVisibility0);
        }
        var suspended = protoInputObject.suspended;
        protoOutputSize += ProtobufOutputStream.getFieldSize(29, 0);
        protoOutputSize += 1;
        var terminated = protoInputObject.terminated;
        protoOutputSize += ProtobufOutputStream.getFieldSize(30, 0);
        protoOutputSize += 1;
        var support = protoInputObject.support;
        protoOutputSize += ProtobufOutputStream.getFieldSize(34, 0);
        protoOutputSize += 1;
        var displayName = protoInputObject.displayName;
        if (displayName != null) {
            var displayName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(displayName);
            if (displayName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(38, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(displayName0);
            }
        }
        var phoneJid = protoInputObject.phoneJid;
        if (phoneJid != null) {
            var phoneJid0 = phoneJid.toString();
            if (phoneJid0 != null) {
                var phoneJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phoneJid0);
                if (phoneJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(39, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(phoneJid1);
                }
            }
        }
        var shareOwnPhoneNumber = protoInputObject.shareOwnPhoneNumber;
        protoOutputSize += ProtobufOutputStream.getFieldSize(40, 0);
        protoOutputSize += 1;
        var pnhDuplicateLidThread = protoInputObject.pnhDuplicateLidThread;
        protoOutputSize += ProtobufOutputStream.getFieldSize(41, 0);
        protoOutputSize += 1;
        var lid = protoInputObject.lid;
        if (lid != null) {
            var lid0 = lid.toString();
            if (lid0 != null) {
                var lid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lid0);
                if (lid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(42, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(lid1);
                }
            }
        }
        var presencesMapField = protoInputObject.presences;
        if (presencesMapField != null) {
            for (var presencesMapEntry : presencesMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(999, 2);
                var presencesMapEntrySize = sizeOfPresences(presencesMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(presencesMapEntrySize);
                protoOutputSize += presencesMapEntrySize;
            }
        }
        return protoOutputSize;
    }

    private static int sizeOfPresences(java.util.Map.Entry<it.auties.whatsapp.model.jid.Jid, it.auties.whatsapp.model.contact.ContactStatus> protoInputObject) {
        var protoOutputSize = 0;
        var presencesMapKey = protoInputObject.getKey();
        if (presencesMapKey != null) {
            var presencesMapKey0 = presencesMapKey.toString();
            if (presencesMapKey0 != null) {
                var presencesMapKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(presencesMapKey0);
                if (presencesMapKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(presencesMapKey1);
                }
            }
        }
        var presencesMapValue = protoInputObject.getValue();
        if (presencesMapValue != null) {
            var presencesMapValue0 = it.auties.whatsapp.model.contact.ContactStatusSpec.encode(presencesMapValue);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(presencesMapValue0);
        }
        return protoOutputSize;
    }

}
