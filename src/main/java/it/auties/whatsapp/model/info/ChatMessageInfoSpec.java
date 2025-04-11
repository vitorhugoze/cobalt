package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.ChatMessageInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatMessageInfoSpec {
    public static byte[] encode(ChatMessageInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ChatMessageInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message));
            it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(message, protoOutputStream);
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        if (timestampSeconds != null) {
            var timestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(timestampSeconds);
            if (timestampSeconds0 != null) {
                protoOutputStream.writeUInt64(3, timestampSeconds0);
            }
        }
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.message.model.MessageStatusSpec.encode(status);
            protoOutputStream.writeInt32(4, status0);
        }
        var senderJid = protoInputObject.senderJid();
        if (senderJid != null) {
            var senderJid0 = senderJid.toString();
            if (senderJid0 != null) {
                var senderJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderJid0);
                if (senderJid1 != null) {
                    protoOutputStream.writeString(5, senderJid1);
                }
            }
        }
        var messageC2STimestamp = protoInputObject.messageC2STimestamp();
        protoOutputStream.writeUInt64(6, messageC2STimestamp);
        var ignore = protoInputObject.ignore();
        protoOutputStream.writeBool(16, ignore);
        var starred = protoInputObject.starred();
        protoOutputStream.writeBool(17, starred);
        var broadcast = protoInputObject.broadcast();
        protoOutputStream.writeBool(18, broadcast);
        var pushName = protoInputObject.pushName();
        if (pushName != null) {
            var pushName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pushName);
            if (pushName0 != null) {
                var pushName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pushName0);
                if (pushName1 != null) {
                    protoOutputStream.writeString(19, pushName1);
                }
            }
        }
        var mediaCiphertextSha256 = protoInputObject.mediaCiphertextSha256();
        if (mediaCiphertextSha256 != null) {
            var mediaCiphertextSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaCiphertextSha256);
            if (mediaCiphertextSha2560 != null) {
                var mediaCiphertextSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaCiphertextSha2560);
                if (mediaCiphertextSha2561 != null) {
                    protoOutputStream.writeBytes(20, mediaCiphertextSha2561);
                }
            }
        }
        var multicast = protoInputObject.multicast();
        protoOutputStream.writeBool(21, multicast);
        var urlText = protoInputObject.urlText();
        protoOutputStream.writeBool(22, urlText);
        var urlNumber = protoInputObject.urlNumber();
        protoOutputStream.writeBool(23, urlNumber);
        var stubType = protoInputObject.stubType();
        if (stubType != null) {
            var stubType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stubType);
            if (stubType0 != null) {
                var stubType1 = it.auties.whatsapp.model.info.ChatMessageInfoStubTypeSpec.encode(stubType0);
                protoOutputStream.writeInt32(24, stubType1);
            }
        }
        var clearMedia = protoInputObject.clearMedia();
        protoOutputStream.writeBool(25, clearMedia);
        if (protoInputObject.stubParameters() != null) {
            for (var stubParametersEntry : protoInputObject.stubParameters()) { 
                if (stubParametersEntry != null) {
                    var stubParameters0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(stubParametersEntry);
                    if (stubParameters0 != null) {
                        protoOutputStream.writeString(26, stubParameters0);
                    }
                }
            }
        }
        var duration = protoInputObject.duration();
        protoOutputStream.writeUInt32(27, duration);
        if (protoInputObject.labels() != null) {
            for (var labelsEntry : protoInputObject.labels()) { 
                if (labelsEntry != null) {
                    var labels0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(labelsEntry);
                    if (labels0 != null) {
                        protoOutputStream.writeString(28, labels0);
                    }
                }
            }
        }
        var paymentInfo = protoInputObject.paymentInfo();
        if (paymentInfo != null) {
            var paymentInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paymentInfo);
            if (paymentInfo0 != null) {
                protoOutputStream.writeMessage(29, it.auties.whatsapp.model.info.PaymentInfoSpec.sizeOf(paymentInfo0));
                it.auties.whatsapp.model.info.PaymentInfoSpec.encode(paymentInfo0, protoOutputStream);
            }
        }
        var finalLiveLocation = protoInputObject.finalLiveLocation();
        if (finalLiveLocation != null) {
            var finalLiveLocation0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(finalLiveLocation);
            if (finalLiveLocation0 != null) {
                protoOutputStream.writeMessage(30, it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.sizeOf(finalLiveLocation0));
                it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.encode(finalLiveLocation0, protoOutputStream);
            }
        }
        var quotedPaymentInfo = protoInputObject.quotedPaymentInfo();
        if (quotedPaymentInfo != null) {
            var quotedPaymentInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedPaymentInfo);
            if (quotedPaymentInfo0 != null) {
                protoOutputStream.writeMessage(31, it.auties.whatsapp.model.info.PaymentInfoSpec.sizeOf(quotedPaymentInfo0));
                it.auties.whatsapp.model.info.PaymentInfoSpec.encode(quotedPaymentInfo0, protoOutputStream);
            }
        }
        var ephemeralStartTimestamp = protoInputObject.ephemeralStartTimestamp();
        protoOutputStream.writeUInt64(32, ephemeralStartTimestamp);
        var ephemeralDuration = protoInputObject.ephemeralDuration();
        protoOutputStream.writeUInt32(33, ephemeralDuration);
        var enableEphemeral = protoInputObject.enableEphemeral();
        protoOutputStream.writeBool(34, enableEphemeral);
        var ephemeralOutOfSync = protoInputObject.ephemeralOutOfSync();
        protoOutputStream.writeBool(35, ephemeralOutOfSync);
        var businessPrivacyStatus = protoInputObject.businessPrivacyStatus();
        if (businessPrivacyStatus != null) {
            var businessPrivacyStatus0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(businessPrivacyStatus);
            if (businessPrivacyStatus0 != null) {
                var businessPrivacyStatus1 = it.auties.whatsapp.model.business.BusinessPrivacyStatusSpec.encode(businessPrivacyStatus0);
                protoOutputStream.writeInt32(36, businessPrivacyStatus1);
            }
        }
        var businessVerifiedName = protoInputObject.businessVerifiedName();
        if (businessVerifiedName != null) {
            var businessVerifiedName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(businessVerifiedName);
            if (businessVerifiedName0 != null) {
                var businessVerifiedName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessVerifiedName0);
                if (businessVerifiedName1 != null) {
                    protoOutputStream.writeString(37, businessVerifiedName1);
                }
            }
        }
        var mediaData = protoInputObject.mediaData();
        if (mediaData != null) {
            var mediaData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaData);
            if (mediaData0 != null) {
                protoOutputStream.writeMessage(38, it.auties.whatsapp.model.media.MediaDataSpec.sizeOf(mediaData0));
                it.auties.whatsapp.model.media.MediaDataSpec.encode(mediaData0, protoOutputStream);
            }
        }
        var photoChange = protoInputObject.photoChange();
        if (photoChange != null) {
            var photoChange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(photoChange);
            if (photoChange0 != null) {
                protoOutputStream.writeMessage(39, it.auties.whatsapp.model.sync.PhotoChangeSpec.sizeOf(photoChange0));
                it.auties.whatsapp.model.sync.PhotoChangeSpec.encode(photoChange0, protoOutputStream);
            }
        }
        var receipt = protoInputObject.receipt();
        if (receipt != null) {
            protoOutputStream.writeMessage(40, it.auties.whatsapp.model.message.model.MessageReceiptSpec.sizeOf(receipt));
            it.auties.whatsapp.model.message.model.MessageReceiptSpec.encode(receipt, protoOutputStream);
        }
        if (protoInputObject.reactions() != null) {
            for (var reactionsEntry : protoInputObject.reactions()) { 
                if (reactionsEntry != null) {
                    protoOutputStream.writeMessage(41, it.auties.whatsapp.model.message.standard.ReactionMessageSpec.sizeOf(reactionsEntry));
                    it.auties.whatsapp.model.message.standard.ReactionMessageSpec.encode(reactionsEntry, protoOutputStream);
                }
            }
        }
        var quotedStickerData = protoInputObject.quotedStickerData();
        if (quotedStickerData != null) {
            var quotedStickerData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedStickerData);
            if (quotedStickerData0 != null) {
                protoOutputStream.writeMessage(42, it.auties.whatsapp.model.media.MediaDataSpec.sizeOf(quotedStickerData0));
                it.auties.whatsapp.model.media.MediaDataSpec.encode(quotedStickerData0, protoOutputStream);
            }
        }
        var futureProofData = protoInputObject.futureProofData();
        if (futureProofData != null) {
            var futureProofData0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(futureProofData);
            if (futureProofData0 != null) {
                protoOutputStream.writeBytes(43, futureProofData0);
            }
        }
        var psaStatus = protoInputObject.psaStatus();
        if (psaStatus != null) {
            var psaStatus0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(psaStatus);
            if (psaStatus0 != null) {
                protoOutputStream.writeMessage(44, it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatusSpec.sizeOf(psaStatus0));
                it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatusSpec.encode(psaStatus0, protoOutputStream);
            }
        }
        if (protoInputObject.pollUpdates() != null) {
            for (var pollUpdatesEntry : protoInputObject.pollUpdates()) { 
                if (pollUpdatesEntry != null) {
                    protoOutputStream.writeMessage(45, it.auties.whatsapp.model.poll.PollUpdateSpec.sizeOf(pollUpdatesEntry));
                    it.auties.whatsapp.model.poll.PollUpdateSpec.encode(pollUpdatesEntry, protoOutputStream);
                }
            }
        }
        var pollAdditionalMetadata = protoInputObject.pollAdditionalMetadata();
        if (pollAdditionalMetadata != null) {
            var pollAdditionalMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollAdditionalMetadata);
            if (pollAdditionalMetadata0 != null) {
                protoOutputStream.writeMessage(46, it.auties.whatsapp.model.poll.PollAdditionalMetadataSpec.sizeOf(pollAdditionalMetadata0));
                it.auties.whatsapp.model.poll.PollAdditionalMetadataSpec.encode(pollAdditionalMetadata0, protoOutputStream);
            }
        }
        var agentId = protoInputObject.agentId();
        if (agentId != null) {
            var agentId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(agentId);
            if (agentId0 != null) {
                var agentId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(agentId0);
                if (agentId1 != null) {
                    protoOutputStream.writeString(47, agentId1);
                }
            }
        }
        var statusAlreadyViewed = protoInputObject.statusAlreadyViewed();
        protoOutputStream.writeBool(48, statusAlreadyViewed);
        var messageSecret = protoInputObject.messageSecret();
        if (messageSecret != null) {
            var messageSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageSecret);
            if (messageSecret0 != null) {
                var messageSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageSecret0);
                if (messageSecret1 != null) {
                    protoOutputStream.writeBytes(49, messageSecret1);
                }
            }
        }
        var keepInChat = protoInputObject.keepInChat();
        if (keepInChat != null) {
            var keepInChat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(keepInChat);
            if (keepInChat0 != null) {
                protoOutputStream.writeMessage(50, it.auties.whatsapp.model.message.model.KeepInChatSpec.sizeOf(keepInChat0));
                it.auties.whatsapp.model.message.model.KeepInChatSpec.encode(keepInChat0, protoOutputStream);
            }
        }
        var originalSender = protoInputObject.originalSender();
        if (originalSender != null) {
            var originalSender0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(originalSender);
            if (originalSender0 != null) {
                var originalSender1 = originalSender0.toString();
                if (originalSender1 != null) {
                    var originalSender2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(originalSender1);
                    if (originalSender2 != null) {
                        protoOutputStream.writeString(51, originalSender2);
                    }
                }
            }
        }
        var revokeTimestampSeconds = protoInputObject.revokeTimestampSeconds();
        protoOutputStream.writeUInt64(52, revokeTimestampSeconds);
    }

    public static ChatMessageInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ChatMessageInfo decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        it.auties.whatsapp.model.message.model.MessageContainer message = null;
        long timestampSeconds = 0l;
        it.auties.whatsapp.model.message.model.MessageStatus status = null;
        it.auties.whatsapp.model.jid.Jid senderJid = null;
        long messageC2STimestamp = 0l;
        boolean ignore = false;
        boolean starred = false;
        boolean broadcast = false;
        java.lang.String pushName = null;
        byte[] mediaCiphertextSha256 = null;
        boolean multicast = false;
        boolean urlText = false;
        boolean urlNumber = false;
        it.auties.whatsapp.model.info.ChatMessageInfo.StubType stubType = null;
        boolean clearMedia = false;
        java.util.List<java.lang.String> stubParameters = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        int duration = 0;
        java.util.List<java.lang.String> labels = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.info.PaymentInfo paymentInfo = null;
        it.auties.whatsapp.model.message.standard.LiveLocationMessage finalLiveLocation = null;
        it.auties.whatsapp.model.info.PaymentInfo quotedPaymentInfo = null;
        long ephemeralStartTimestamp = 0l;
        int ephemeralDuration = 0;
        boolean enableEphemeral = false;
        boolean ephemeralOutOfSync = false;
        it.auties.whatsapp.model.business.BusinessPrivacyStatus businessPrivacyStatus = null;
        java.lang.String businessVerifiedName = null;
        it.auties.whatsapp.model.media.MediaData mediaData = null;
        it.auties.whatsapp.model.sync.PhotoChange photoChange = null;
        it.auties.whatsapp.model.message.model.MessageReceipt receipt = null;
        java.util.List<it.auties.whatsapp.model.message.standard.ReactionMessage> reactions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.media.MediaData quotedStickerData = null;
        byte[] futureProofData = null;
        it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus psaStatus = null;
        java.util.List<it.auties.whatsapp.model.poll.PollUpdate> pollUpdates = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.poll.PollAdditionalMetadata pollAdditionalMetadata = null;
        java.lang.String agentId = null;
        boolean statusAlreadyViewed = false;
        byte[] messageSecret = null;
        it.auties.whatsapp.model.message.model.KeepInChat keepInChat = null;
        it.auties.whatsapp.model.jid.Jid originalSender = null;
        long revokeTimestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> message = it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> timestampSeconds = protoInputStream.readInt64();
                case 4 -> status = it.auties.whatsapp.model.message.model.MessageStatusSpec.decode(protoInputStream.readInt32());
                case 5 -> senderJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 6 -> messageC2STimestamp = protoInputStream.readInt64();
                case 16 -> ignore = protoInputStream.readBool();
                case 17 -> starred = protoInputStream.readBool();
                case 18 -> broadcast = protoInputStream.readBool();
                case 19 -> pushName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 20 -> mediaCiphertextSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 21 -> multicast = protoInputStream.readBool();
                case 22 -> urlText = protoInputStream.readBool();
                case 23 -> urlNumber = protoInputStream.readBool();
                case 24 -> stubType = it.auties.whatsapp.model.info.ChatMessageInfoStubTypeSpec.decode(protoInputStream.readInt32());
                case 25 -> clearMedia = protoInputStream.readBool();
                case 26 -> stubParameters.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 27 -> duration = protoInputStream.readInt32();
                case 28 -> labels.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 29 -> paymentInfo = it.auties.whatsapp.model.info.PaymentInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 30 -> finalLiveLocation = it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 31 -> quotedPaymentInfo = it.auties.whatsapp.model.info.PaymentInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 32 -> ephemeralStartTimestamp = protoInputStream.readInt64();
                case 33 -> ephemeralDuration = protoInputStream.readInt32();
                case 34 -> enableEphemeral = protoInputStream.readBool();
                case 35 -> ephemeralOutOfSync = protoInputStream.readBool();
                case 36 -> businessPrivacyStatus = it.auties.whatsapp.model.business.BusinessPrivacyStatusSpec.decode(protoInputStream.readInt32());
                case 37 -> businessVerifiedName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 38 -> mediaData = it.auties.whatsapp.model.media.MediaDataSpec.decode(protoInputStream.readLengthDelimited());
                case 39 -> photoChange = it.auties.whatsapp.model.sync.PhotoChangeSpec.decode(protoInputStream.readLengthDelimited());
                case 40 -> receipt = it.auties.whatsapp.model.message.model.MessageReceiptSpec.decode(protoInputStream.readLengthDelimited());
                case 41 -> reactions.add(it.auties.whatsapp.model.message.standard.ReactionMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 42 -> quotedStickerData = it.auties.whatsapp.model.media.MediaDataSpec.decode(protoInputStream.readLengthDelimited());
                case 43 -> futureProofData = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 44 -> psaStatus = it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatusSpec.decode(protoInputStream.readLengthDelimited());
                case 45 -> pollUpdates.add(it.auties.whatsapp.model.poll.PollUpdateSpec.decode(protoInputStream.readLengthDelimited()));
                case 46 -> pollAdditionalMetadata = it.auties.whatsapp.model.poll.PollAdditionalMetadataSpec.decode(protoInputStream.readLengthDelimited());
                case 47 -> agentId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 48 -> statusAlreadyViewed = protoInputStream.readBool();
                case 49 -> messageSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 50 -> keepInChat = it.auties.whatsapp.model.message.model.KeepInChatSpec.decode(protoInputStream.readLengthDelimited());
                case 51 -> originalSender = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 52 -> revokeTimestampSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.ChatMessageInfo(key, message, timestampSeconds, status, senderJid, messageC2STimestamp, ignore, starred, broadcast, pushName, mediaCiphertextSha256, multicast, urlText, urlNumber, stubType, clearMedia, stubParameters, duration, labels, paymentInfo, finalLiveLocation, quotedPaymentInfo, ephemeralStartTimestamp, ephemeralDuration, enableEphemeral, ephemeralOutOfSync, businessPrivacyStatus, businessVerifiedName, mediaData, photoChange, receipt, reactions, quotedStickerData, futureProofData, psaStatus, pollUpdates, pollAdditionalMetadata, agentId, statusAlreadyViewed, messageSecret, keepInChat, originalSender, revokeTimestampSeconds);
    }

    public static int sizeOf(ChatMessageInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var keySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keySerializedSize);
            protoOutputSize += keySerializedSize;
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var messageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageSerializedSize);
            protoOutputSize += messageSerializedSize;
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        if (timestampSeconds != null) {
            var timestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(timestampSeconds);
            if (timestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampSeconds0);
            }
        }
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.message.model.MessageStatusSpec.encode(status);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(status0);
        }
        var senderJid = protoInputObject.senderJid();
        if (senderJid != null) {
            var senderJid0 = senderJid.toString();
            if (senderJid0 != null) {
                var senderJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderJid0);
                if (senderJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(senderJid1);
                }
            }
        }
        var messageC2STimestamp = protoInputObject.messageC2STimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(messageC2STimestamp);
        var ignore = protoInputObject.ignore();
        protoOutputSize += ProtobufOutputStream.getFieldSize(16, 0);
        protoOutputSize += 1;
        var starred = protoInputObject.starred();
        protoOutputSize += ProtobufOutputStream.getFieldSize(17, 0);
        protoOutputSize += 1;
        var broadcast = protoInputObject.broadcast();
        protoOutputSize += ProtobufOutputStream.getFieldSize(18, 0);
        protoOutputSize += 1;
        var pushName = protoInputObject.pushName();
        if (pushName != null) {
            var pushName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pushName);
            if (pushName0 != null) {
                var pushName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pushName0);
                if (pushName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(pushName1);
                }
            }
        }
        var mediaCiphertextSha256 = protoInputObject.mediaCiphertextSha256();
        if (mediaCiphertextSha256 != null) {
            var mediaCiphertextSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaCiphertextSha256);
            if (mediaCiphertextSha2560 != null) {
                var mediaCiphertextSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaCiphertextSha2560);
                if (mediaCiphertextSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaCiphertextSha2561);
                }
            }
        }
        var multicast = protoInputObject.multicast();
        protoOutputSize += ProtobufOutputStream.getFieldSize(21, 0);
        protoOutputSize += 1;
        var urlText = protoInputObject.urlText();
        protoOutputSize += ProtobufOutputStream.getFieldSize(22, 0);
        protoOutputSize += 1;
        var urlNumber = protoInputObject.urlNumber();
        protoOutputSize += ProtobufOutputStream.getFieldSize(23, 0);
        protoOutputSize += 1;
        var stubType = protoInputObject.stubType();
        if (stubType != null) {
            var stubType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stubType);
            if (stubType0 != null) {
                var stubType1 = it.auties.whatsapp.model.info.ChatMessageInfoStubTypeSpec.encode(stubType0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stubType1);
            }
        }
        var clearMedia = protoInputObject.clearMedia();
        protoOutputSize += ProtobufOutputStream.getFieldSize(25, 0);
        protoOutputSize += 1;
        if (protoInputObject.stubParameters() != null) {
            for (var stubParametersEntry : protoInputObject.stubParameters()) { 
                if (stubParametersEntry != null) {
                    var stubParametersEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(stubParametersEntry);
                    if (stubParametersEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(stubParametersEntry0);
                    }
                }
            }
        }
        var duration = protoInputObject.duration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(27, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(duration);
        if (protoInputObject.labels() != null) {
            for (var labelsEntry : protoInputObject.labels()) { 
                if (labelsEntry != null) {
                    var labelsEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(labelsEntry);
                    if (labelsEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(labelsEntry0);
                    }
                }
            }
        }
        var paymentInfo = protoInputObject.paymentInfo();
        if (paymentInfo != null) {
            var paymentInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paymentInfo);
            if (paymentInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
                var paymentInfoSerializedSize = it.auties.whatsapp.model.info.PaymentInfoSpec.sizeOf(paymentInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(paymentInfoSerializedSize);
                protoOutputSize += paymentInfoSerializedSize;
            }
        }
        var finalLiveLocation = protoInputObject.finalLiveLocation();
        if (finalLiveLocation != null) {
            var finalLiveLocation0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(finalLiveLocation);
            if (finalLiveLocation0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(30, 2);
                var finalLiveLocationSerializedSize = it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.sizeOf(finalLiveLocation0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(finalLiveLocationSerializedSize);
                protoOutputSize += finalLiveLocationSerializedSize;
            }
        }
        var quotedPaymentInfo = protoInputObject.quotedPaymentInfo();
        if (quotedPaymentInfo != null) {
            var quotedPaymentInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedPaymentInfo);
            if (quotedPaymentInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(31, 2);
                var quotedPaymentInfoSerializedSize = it.auties.whatsapp.model.info.PaymentInfoSpec.sizeOf(quotedPaymentInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(quotedPaymentInfoSerializedSize);
                protoOutputSize += quotedPaymentInfoSerializedSize;
            }
        }
        var ephemeralStartTimestamp = protoInputObject.ephemeralStartTimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(32, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralStartTimestamp);
        var ephemeralDuration = protoInputObject.ephemeralDuration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(33, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralDuration);
        var enableEphemeral = protoInputObject.enableEphemeral();
        protoOutputSize += ProtobufOutputStream.getFieldSize(34, 0);
        protoOutputSize += 1;
        var ephemeralOutOfSync = protoInputObject.ephemeralOutOfSync();
        protoOutputSize += ProtobufOutputStream.getFieldSize(35, 0);
        protoOutputSize += 1;
        var businessPrivacyStatus = protoInputObject.businessPrivacyStatus();
        if (businessPrivacyStatus != null) {
            var businessPrivacyStatus0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(businessPrivacyStatus);
            if (businessPrivacyStatus0 != null) {
                var businessPrivacyStatus1 = it.auties.whatsapp.model.business.BusinessPrivacyStatusSpec.encode(businessPrivacyStatus0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(36, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(businessPrivacyStatus1);
            }
        }
        var businessVerifiedName = protoInputObject.businessVerifiedName();
        if (businessVerifiedName != null) {
            var businessVerifiedName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(businessVerifiedName);
            if (businessVerifiedName0 != null) {
                var businessVerifiedName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessVerifiedName0);
                if (businessVerifiedName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(37, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(businessVerifiedName1);
                }
            }
        }
        var mediaData = protoInputObject.mediaData();
        if (mediaData != null) {
            var mediaData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaData);
            if (mediaData0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(38, 2);
                var mediaDataSerializedSize = it.auties.whatsapp.model.media.MediaDataSpec.sizeOf(mediaData0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaDataSerializedSize);
                protoOutputSize += mediaDataSerializedSize;
            }
        }
        var photoChange = protoInputObject.photoChange();
        if (photoChange != null) {
            var photoChange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(photoChange);
            if (photoChange0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(39, 2);
                var photoChangeSerializedSize = it.auties.whatsapp.model.sync.PhotoChangeSpec.sizeOf(photoChange0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(photoChangeSerializedSize);
                protoOutputSize += photoChangeSerializedSize;
            }
        }
        var receipt = protoInputObject.receipt();
        if (receipt != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(40, 2);
            var receiptSerializedSize = it.auties.whatsapp.model.message.model.MessageReceiptSpec.sizeOf(receipt);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(receiptSerializedSize);
            protoOutputSize += receiptSerializedSize;
        }
        if (protoInputObject.reactions() != null) {
            for (var reactionsEntry : protoInputObject.reactions()) { 
                if (reactionsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(41, 2);
                    var reactionsEntrySerializedSize = it.auties.whatsapp.model.message.standard.ReactionMessageSpec.sizeOf(reactionsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(reactionsEntrySerializedSize);
                    protoOutputSize += reactionsEntrySerializedSize;
                }
            }
        }
        var quotedStickerData = protoInputObject.quotedStickerData();
        if (quotedStickerData != null) {
            var quotedStickerData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedStickerData);
            if (quotedStickerData0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(42, 2);
                var quotedStickerDataSerializedSize = it.auties.whatsapp.model.media.MediaDataSpec.sizeOf(quotedStickerData0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(quotedStickerDataSerializedSize);
                protoOutputSize += quotedStickerDataSerializedSize;
            }
        }
        var futureProofData = protoInputObject.futureProofData();
        if (futureProofData != null) {
            var futureProofData0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(futureProofData);
            if (futureProofData0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(43, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(futureProofData0);
            }
        }
        var psaStatus = protoInputObject.psaStatus();
        if (psaStatus != null) {
            var psaStatus0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(psaStatus);
            if (psaStatus0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(44, 2);
                var psaStatusSerializedSize = it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatusSpec.sizeOf(psaStatus0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(psaStatusSerializedSize);
                protoOutputSize += psaStatusSerializedSize;
            }
        }
        if (protoInputObject.pollUpdates() != null) {
            for (var pollUpdatesEntry : protoInputObject.pollUpdates()) { 
                if (pollUpdatesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(45, 2);
                    var pollUpdatesEntrySerializedSize = it.auties.whatsapp.model.poll.PollUpdateSpec.sizeOf(pollUpdatesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(pollUpdatesEntrySerializedSize);
                    protoOutputSize += pollUpdatesEntrySerializedSize;
                }
            }
        }
        var pollAdditionalMetadata = protoInputObject.pollAdditionalMetadata();
        if (pollAdditionalMetadata != null) {
            var pollAdditionalMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollAdditionalMetadata);
            if (pollAdditionalMetadata0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(46, 2);
                var pollAdditionalMetadataSerializedSize = it.auties.whatsapp.model.poll.PollAdditionalMetadataSpec.sizeOf(pollAdditionalMetadata0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pollAdditionalMetadataSerializedSize);
                protoOutputSize += pollAdditionalMetadataSerializedSize;
            }
        }
        var agentId = protoInputObject.agentId();
        if (agentId != null) {
            var agentId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(agentId);
            if (agentId0 != null) {
                var agentId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(agentId0);
                if (agentId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(47, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(agentId1);
                }
            }
        }
        var statusAlreadyViewed = protoInputObject.statusAlreadyViewed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(48, 0);
        protoOutputSize += 1;
        var messageSecret = protoInputObject.messageSecret();
        if (messageSecret != null) {
            var messageSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageSecret);
            if (messageSecret0 != null) {
                var messageSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageSecret0);
                if (messageSecret1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(49, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(messageSecret1);
                }
            }
        }
        var keepInChat = protoInputObject.keepInChat();
        if (keepInChat != null) {
            var keepInChat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(keepInChat);
            if (keepInChat0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(50, 2);
                var keepInChatSerializedSize = it.auties.whatsapp.model.message.model.KeepInChatSpec.sizeOf(keepInChat0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(keepInChatSerializedSize);
                protoOutputSize += keepInChatSerializedSize;
            }
        }
        var originalSender = protoInputObject.originalSender();
        if (originalSender != null) {
            var originalSender0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(originalSender);
            if (originalSender0 != null) {
                var originalSender1 = originalSender0.toString();
                if (originalSender1 != null) {
                    var originalSender2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(originalSender1);
                    if (originalSender2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(51, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(originalSender2);
                    }
                }
            }
        }
        var revokeTimestampSeconds = protoInputObject.revokeTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(52, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(revokeTimestampSeconds);
        return protoOutputSize;
    }

}
