package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.ContextInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ContextInfoSpec {
    public static byte[] encode(ContextInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ContextInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var quotedMessageId = protoInputObject.quotedMessageId();
        if (quotedMessageId != null) {
            var quotedMessageId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessageId);
            if (quotedMessageId0 != null) {
                var quotedMessageId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(quotedMessageId0);
                if (quotedMessageId1 != null) {
                    protoOutputStream.writeString(1, quotedMessageId1);
                }
            }
        }
        var quotedMessageSenderJid = protoInputObject.quotedMessageSenderJid();
        if (quotedMessageSenderJid != null) {
            var quotedMessageSenderJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessageSenderJid);
            if (quotedMessageSenderJid0 != null) {
                var quotedMessageSenderJid1 = quotedMessageSenderJid0.toString();
                if (quotedMessageSenderJid1 != null) {
                    var quotedMessageSenderJid2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(quotedMessageSenderJid1);
                    if (quotedMessageSenderJid2 != null) {
                        protoOutputStream.writeString(2, quotedMessageSenderJid2);
                    }
                }
            }
        }
        var quotedMessage = protoInputObject.quotedMessage();
        if (quotedMessage != null) {
            var quotedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessage);
            if (quotedMessage0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(quotedMessage0));
                it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(quotedMessage0, protoOutputStream);
            }
        }
        var quotedMessageChatJid = protoInputObject.quotedMessageChatJid();
        if (quotedMessageChatJid != null) {
            var quotedMessageChatJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessageChatJid);
            if (quotedMessageChatJid0 != null) {
                var quotedMessageChatJid1 = quotedMessageChatJid0.toString();
                if (quotedMessageChatJid1 != null) {
                    var quotedMessageChatJid2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(quotedMessageChatJid1);
                    if (quotedMessageChatJid2 != null) {
                        protoOutputStream.writeString(4, quotedMessageChatJid2);
                    }
                }
            }
        }
        if (protoInputObject.mentions() != null) {
            for (var mentionsEntry : protoInputObject.mentions()) { 
                if (mentionsEntry != null) {
                    var mentions0 = mentionsEntry.toString();
                    if (mentions0 != null) {
                        var mentions1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mentions0);
                        if (mentions1 != null) {
                            protoOutputStream.writeString(15, mentions1);
                        }
                    }
                }
            }
        }
        var conversionSource = protoInputObject.conversionSource();
        if (conversionSource != null) {
            var conversionSource0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(conversionSource);
            if (conversionSource0 != null) {
                var conversionSource1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(conversionSource0);
                if (conversionSource1 != null) {
                    protoOutputStream.writeString(18, conversionSource1);
                }
            }
        }
        var conversionData = protoInputObject.conversionData();
        if (conversionData != null) {
            var conversionData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(conversionData);
            if (conversionData0 != null) {
                var conversionData1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(conversionData0);
                if (conversionData1 != null) {
                    protoOutputStream.writeBytes(19, conversionData1);
                }
            }
        }
        var conversionDelaySeconds = protoInputObject.conversionDelaySeconds();
        protoOutputStream.writeUInt32(20, conversionDelaySeconds);
        var forwardingScore = protoInputObject.forwardingScore();
        protoOutputStream.writeUInt32(21, forwardingScore);
        var forwarded = protoInputObject.forwarded();
        protoOutputStream.writeBool(22, forwarded);
        var quotedAd = protoInputObject.quotedAd();
        if (quotedAd != null) {
            var quotedAd0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedAd);
            if (quotedAd0 != null) {
                protoOutputStream.writeMessage(23, it.auties.whatsapp.model.info.AdReplyInfoSpec.sizeOf(quotedAd0));
                it.auties.whatsapp.model.info.AdReplyInfoSpec.encode(quotedAd0, protoOutputStream);
            }
        }
        var placeholderKey = protoInputObject.placeholderKey();
        if (placeholderKey != null) {
            var placeholderKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(placeholderKey);
            if (placeholderKey0 != null) {
                protoOutputStream.writeMessage(24, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(placeholderKey0));
                it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(placeholderKey0, protoOutputStream);
            }
        }
        var ephemeralExpiration = protoInputObject.ephemeralExpiration();
        protoOutputStream.writeUInt32(25, ephemeralExpiration);
        var ephemeralSettingTimestamp = protoInputObject.ephemeralSettingTimestamp();
        protoOutputStream.writeInt64(26, ephemeralSettingTimestamp);
        var ephemeralSharedSecret = protoInputObject.ephemeralSharedSecret();
        if (ephemeralSharedSecret != null) {
            var ephemeralSharedSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(ephemeralSharedSecret);
            if (ephemeralSharedSecret0 != null) {
                var ephemeralSharedSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ephemeralSharedSecret0);
                if (ephemeralSharedSecret1 != null) {
                    protoOutputStream.writeBytes(27, ephemeralSharedSecret1);
                }
            }
        }
        var externalAdReply = protoInputObject.externalAdReply();
        if (externalAdReply != null) {
            var externalAdReply0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(externalAdReply);
            if (externalAdReply0 != null) {
                protoOutputStream.writeMessage(28, it.auties.whatsapp.model.info.ExternalAdReplyInfoSpec.sizeOf(externalAdReply0));
                it.auties.whatsapp.model.info.ExternalAdReplyInfoSpec.encode(externalAdReply0, protoOutputStream);
            }
        }
        var entryPointConversionSource = protoInputObject.entryPointConversionSource();
        if (entryPointConversionSource != null) {
            var entryPointConversionSource0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(entryPointConversionSource);
            if (entryPointConversionSource0 != null) {
                var entryPointConversionSource1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(entryPointConversionSource0);
                if (entryPointConversionSource1 != null) {
                    protoOutputStream.writeString(29, entryPointConversionSource1);
                }
            }
        }
        var entryPointConversionApp = protoInputObject.entryPointConversionApp();
        if (entryPointConversionApp != null) {
            var entryPointConversionApp0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(entryPointConversionApp);
            if (entryPointConversionApp0 != null) {
                var entryPointConversionApp1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(entryPointConversionApp0);
                if (entryPointConversionApp1 != null) {
                    protoOutputStream.writeString(30, entryPointConversionApp1);
                }
            }
        }
        var entryPointConversionDelaySeconds = protoInputObject.entryPointConversionDelaySeconds();
        protoOutputStream.writeUInt32(31, entryPointConversionDelaySeconds);
        var disappearingMode = protoInputObject.disappearingMode();
        if (disappearingMode != null) {
            var disappearingMode0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(disappearingMode);
            if (disappearingMode0 != null) {
                protoOutputStream.writeMessage(32, it.auties.whatsapp.model.chat.ChatDisappearSpec.sizeOf(disappearingMode0));
                it.auties.whatsapp.model.chat.ChatDisappearSpec.encode(disappearingMode0, protoOutputStream);
            }
        }
        var actionLink = protoInputObject.actionLink();
        if (actionLink != null) {
            var actionLink0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(actionLink);
            if (actionLink0 != null) {
                protoOutputStream.writeMessage(33, it.auties.whatsapp.model.button.base.ButtonActionLinkSpec.sizeOf(actionLink0));
                it.auties.whatsapp.model.button.base.ButtonActionLinkSpec.encode(actionLink0, protoOutputStream);
            }
        }
        var groupSubject = protoInputObject.groupSubject();
        if (groupSubject != null) {
            var groupSubject0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(groupSubject);
            if (groupSubject0 != null) {
                var groupSubject1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupSubject0);
                if (groupSubject1 != null) {
                    protoOutputStream.writeString(34, groupSubject1);
                }
            }
        }
        var parentGroup = protoInputObject.parentGroup();
        if (parentGroup != null) {
            var parentGroup0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parentGroup);
            if (parentGroup0 != null) {
                var parentGroup1 = parentGroup0.toString();
                if (parentGroup1 != null) {
                    var parentGroup2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(parentGroup1);
                    if (parentGroup2 != null) {
                        protoOutputStream.writeString(35, parentGroup2);
                    }
                }
            }
        }
        var trustBannerType = protoInputObject.trustBannerType();
        if (trustBannerType != null) {
            var trustBannerType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(trustBannerType);
            if (trustBannerType0 != null) {
                var trustBannerType1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(trustBannerType0);
                if (trustBannerType1 != null) {
                    protoOutputStream.writeString(37, trustBannerType1);
                }
            }
        }
        var trustBannerAction = protoInputObject.trustBannerAction();
        protoOutputStream.writeUInt32(38, trustBannerAction);
    }

    public static ContextInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ContextInfo decode(ProtobufInputStream protoInputStream) {
        java.lang.String quotedMessageId = null;
        it.auties.whatsapp.model.jid.Jid quotedMessageSenderJid = null;
        it.auties.whatsapp.model.message.model.MessageContainer quotedMessage = null;
        it.auties.whatsapp.model.jid.Jid quotedMessageChatJid = null;
        java.util.List<it.auties.whatsapp.model.jid.Jid> mentions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String conversionSource = null;
        byte[] conversionData = null;
        int conversionDelaySeconds = 0;
        int forwardingScore = 0;
        boolean forwarded = false;
        it.auties.whatsapp.model.info.AdReplyInfo quotedAd = null;
        it.auties.whatsapp.model.message.model.ChatMessageKey placeholderKey = null;
        int ephemeralExpiration = 0;
        long ephemeralSettingTimestamp = 0l;
        byte[] ephemeralSharedSecret = null;
        it.auties.whatsapp.model.info.ExternalAdReplyInfo externalAdReply = null;
        java.lang.String entryPointConversionSource = null;
        java.lang.String entryPointConversionApp = null;
        int entryPointConversionDelaySeconds = 0;
        it.auties.whatsapp.model.chat.ChatDisappear disappearingMode = null;
        it.auties.whatsapp.model.button.base.ButtonActionLink actionLink = null;
        java.lang.String groupSubject = null;
        it.auties.whatsapp.model.jid.Jid parentGroup = null;
        java.lang.String trustBannerType = null;
        int trustBannerAction = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> quotedMessageId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> quotedMessageSenderJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> quotedMessage = it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> quotedMessageChatJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 15 -> mentions.add(it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString())));
                case 18 -> conversionSource = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 19 -> conversionData = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 20 -> conversionDelaySeconds = protoInputStream.readInt32();
                case 21 -> forwardingScore = protoInputStream.readInt32();
                case 22 -> forwarded = protoInputStream.readBool();
                case 23 -> quotedAd = it.auties.whatsapp.model.info.AdReplyInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 24 -> placeholderKey = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 25 -> ephemeralExpiration = protoInputStream.readInt32();
                case 26 -> ephemeralSettingTimestamp = protoInputStream.readInt64();
                case 27 -> ephemeralSharedSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 28 -> externalAdReply = it.auties.whatsapp.model.info.ExternalAdReplyInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 29 -> entryPointConversionSource = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 30 -> entryPointConversionApp = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 31 -> entryPointConversionDelaySeconds = protoInputStream.readInt32();
                case 32 -> disappearingMode = it.auties.whatsapp.model.chat.ChatDisappearSpec.decode(protoInputStream.readLengthDelimited());
                case 33 -> actionLink = it.auties.whatsapp.model.button.base.ButtonActionLinkSpec.decode(protoInputStream.readLengthDelimited());
                case 34 -> groupSubject = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 35 -> parentGroup = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 37 -> trustBannerType = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 38 -> trustBannerAction = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.ContextInfo(quotedMessageId, quotedMessageSenderJid, quotedMessage, quotedMessageChatJid, mentions, conversionSource, conversionData, conversionDelaySeconds, forwardingScore, forwarded, quotedAd, placeholderKey, ephemeralExpiration, ephemeralSettingTimestamp, ephemeralSharedSecret, externalAdReply, entryPointConversionSource, entryPointConversionApp, entryPointConversionDelaySeconds, disappearingMode, actionLink, groupSubject, parentGroup, trustBannerType, trustBannerAction);
    }

    public static int sizeOf(ContextInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var quotedMessageId = protoInputObject.quotedMessageId();
        if (quotedMessageId != null) {
            var quotedMessageId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessageId);
            if (quotedMessageId0 != null) {
                var quotedMessageId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(quotedMessageId0);
                if (quotedMessageId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(quotedMessageId1);
                }
            }
        }
        var quotedMessageSenderJid = protoInputObject.quotedMessageSenderJid();
        if (quotedMessageSenderJid != null) {
            var quotedMessageSenderJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessageSenderJid);
            if (quotedMessageSenderJid0 != null) {
                var quotedMessageSenderJid1 = quotedMessageSenderJid0.toString();
                if (quotedMessageSenderJid1 != null) {
                    var quotedMessageSenderJid2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(quotedMessageSenderJid1);
                    if (quotedMessageSenderJid2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(quotedMessageSenderJid2);
                    }
                }
            }
        }
        var quotedMessage = protoInputObject.quotedMessage();
        if (quotedMessage != null) {
            var quotedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessage);
            if (quotedMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var quotedMessageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(quotedMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(quotedMessageSerializedSize);
                protoOutputSize += quotedMessageSerializedSize;
            }
        }
        var quotedMessageChatJid = protoInputObject.quotedMessageChatJid();
        if (quotedMessageChatJid != null) {
            var quotedMessageChatJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessageChatJid);
            if (quotedMessageChatJid0 != null) {
                var quotedMessageChatJid1 = quotedMessageChatJid0.toString();
                if (quotedMessageChatJid1 != null) {
                    var quotedMessageChatJid2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(quotedMessageChatJid1);
                    if (quotedMessageChatJid2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(quotedMessageChatJid2);
                    }
                }
            }
        }
        if (protoInputObject.mentions() != null) {
            for (var mentionsEntry : protoInputObject.mentions()) { 
                if (mentionsEntry != null) {
                    var mentionsEntry0 = mentionsEntry.toString();
                    if (mentionsEntry0 != null) {
                        var mentionsEntry1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mentionsEntry0);
                        if (mentionsEntry1 != null) {
                            protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                            protoOutputSize += ProtobufOutputStream.getStringSize(mentionsEntry1);
                        }
                    }
                }
            }
        }
        var conversionSource = protoInputObject.conversionSource();
        if (conversionSource != null) {
            var conversionSource0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(conversionSource);
            if (conversionSource0 != null) {
                var conversionSource1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(conversionSource0);
                if (conversionSource1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(conversionSource1);
                }
            }
        }
        var conversionData = protoInputObject.conversionData();
        if (conversionData != null) {
            var conversionData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(conversionData);
            if (conversionData0 != null) {
                var conversionData1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(conversionData0);
                if (conversionData1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(conversionData1);
                }
            }
        }
        var conversionDelaySeconds = protoInputObject.conversionDelaySeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(20, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(conversionDelaySeconds);
        var forwardingScore = protoInputObject.forwardingScore();
        protoOutputSize += ProtobufOutputStream.getFieldSize(21, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(forwardingScore);
        var forwarded = protoInputObject.forwarded();
        protoOutputSize += ProtobufOutputStream.getFieldSize(22, 0);
        protoOutputSize += 1;
        var quotedAd = protoInputObject.quotedAd();
        if (quotedAd != null) {
            var quotedAd0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedAd);
            if (quotedAd0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                var quotedAdSerializedSize = it.auties.whatsapp.model.info.AdReplyInfoSpec.sizeOf(quotedAd0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(quotedAdSerializedSize);
                protoOutputSize += quotedAdSerializedSize;
            }
        }
        var placeholderKey = protoInputObject.placeholderKey();
        if (placeholderKey != null) {
            var placeholderKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(placeholderKey);
            if (placeholderKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                var placeholderKeySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(placeholderKey0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(placeholderKeySerializedSize);
                protoOutputSize += placeholderKeySerializedSize;
            }
        }
        var ephemeralExpiration = protoInputObject.ephemeralExpiration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(25, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralExpiration);
        var ephemeralSettingTimestamp = protoInputObject.ephemeralSettingTimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(26, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralSettingTimestamp);
        var ephemeralSharedSecret = protoInputObject.ephemeralSharedSecret();
        if (ephemeralSharedSecret != null) {
            var ephemeralSharedSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(ephemeralSharedSecret);
            if (ephemeralSharedSecret0 != null) {
                var ephemeralSharedSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ephemeralSharedSecret0);
                if (ephemeralSharedSecret1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(ephemeralSharedSecret1);
                }
            }
        }
        var externalAdReply = protoInputObject.externalAdReply();
        if (externalAdReply != null) {
            var externalAdReply0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(externalAdReply);
            if (externalAdReply0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
                var externalAdReplySerializedSize = it.auties.whatsapp.model.info.ExternalAdReplyInfoSpec.sizeOf(externalAdReply0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(externalAdReplySerializedSize);
                protoOutputSize += externalAdReplySerializedSize;
            }
        }
        var entryPointConversionSource = protoInputObject.entryPointConversionSource();
        if (entryPointConversionSource != null) {
            var entryPointConversionSource0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(entryPointConversionSource);
            if (entryPointConversionSource0 != null) {
                var entryPointConversionSource1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(entryPointConversionSource0);
                if (entryPointConversionSource1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(entryPointConversionSource1);
                }
            }
        }
        var entryPointConversionApp = protoInputObject.entryPointConversionApp();
        if (entryPointConversionApp != null) {
            var entryPointConversionApp0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(entryPointConversionApp);
            if (entryPointConversionApp0 != null) {
                var entryPointConversionApp1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(entryPointConversionApp0);
                if (entryPointConversionApp1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(30, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(entryPointConversionApp1);
                }
            }
        }
        var entryPointConversionDelaySeconds = protoInputObject.entryPointConversionDelaySeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(31, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(entryPointConversionDelaySeconds);
        var disappearingMode = protoInputObject.disappearingMode();
        if (disappearingMode != null) {
            var disappearingMode0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(disappearingMode);
            if (disappearingMode0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(32, 2);
                var disappearingModeSerializedSize = it.auties.whatsapp.model.chat.ChatDisappearSpec.sizeOf(disappearingMode0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(disappearingModeSerializedSize);
                protoOutputSize += disappearingModeSerializedSize;
            }
        }
        var actionLink = protoInputObject.actionLink();
        if (actionLink != null) {
            var actionLink0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(actionLink);
            if (actionLink0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(33, 2);
                var actionLinkSerializedSize = it.auties.whatsapp.model.button.base.ButtonActionLinkSpec.sizeOf(actionLink0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(actionLinkSerializedSize);
                protoOutputSize += actionLinkSerializedSize;
            }
        }
        var groupSubject = protoInputObject.groupSubject();
        if (groupSubject != null) {
            var groupSubject0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(groupSubject);
            if (groupSubject0 != null) {
                var groupSubject1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupSubject0);
                if (groupSubject1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(34, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(groupSubject1);
                }
            }
        }
        var parentGroup = protoInputObject.parentGroup();
        if (parentGroup != null) {
            var parentGroup0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parentGroup);
            if (parentGroup0 != null) {
                var parentGroup1 = parentGroup0.toString();
                if (parentGroup1 != null) {
                    var parentGroup2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(parentGroup1);
                    if (parentGroup2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(35, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(parentGroup2);
                    }
                }
            }
        }
        var trustBannerType = protoInputObject.trustBannerType();
        if (trustBannerType != null) {
            var trustBannerType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(trustBannerType);
            if (trustBannerType0 != null) {
                var trustBannerType1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(trustBannerType0);
                if (trustBannerType1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(37, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(trustBannerType1);
                }
            }
        }
        var trustBannerAction = protoInputObject.trustBannerAction();
        protoOutputSize += ProtobufOutputStream.getFieldSize(38, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(trustBannerAction);
        return protoOutputSize;
    }

}
