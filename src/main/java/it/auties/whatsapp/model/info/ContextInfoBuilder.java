package it.auties.whatsapp.model.info;

public class ContextInfoBuilder {
    private java.lang.String quotedMessageId;
    private it.auties.whatsapp.model.jid.Jid quotedMessageSenderJid;
    private it.auties.whatsapp.model.message.model.MessageContainer quotedMessage;
    private it.auties.whatsapp.model.jid.Jid quotedMessageChatJid;
    private java.util.List<it.auties.whatsapp.model.jid.Jid> mentions;
    private java.lang.String conversionSource;
    private byte[] conversionData;
    private int conversionDelaySeconds;
    private int forwardingScore;
    private boolean forwarded;
    private it.auties.whatsapp.model.info.AdReplyInfo quotedAd;
    private it.auties.whatsapp.model.message.model.ChatMessageKey placeholderKey;
    private int ephemeralExpiration;
    private long ephemeralSettingTimestamp;
    private byte[] ephemeralSharedSecret;
    private it.auties.whatsapp.model.info.ExternalAdReplyInfo externalAdReply;
    private java.lang.String entryPointConversionSource;
    private java.lang.String entryPointConversionApp;
    private int entryPointConversionDelaySeconds;
    private it.auties.whatsapp.model.chat.ChatDisappear disappearingMode;
    private it.auties.whatsapp.model.button.base.ButtonActionLink actionLink;
    private java.lang.String groupSubject;
    private it.auties.whatsapp.model.jid.Jid parentGroup;
    private java.lang.String trustBannerType;
    private int trustBannerAction;

    public ContextInfoBuilder() {
        quotedMessageId = null;
        quotedMessageSenderJid = null;
        quotedMessage = null;
        quotedMessageChatJid = null;
        mentions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        conversionSource = null;
        conversionData = null;
        conversionDelaySeconds = 0;
        forwardingScore = 0;
        forwarded = false;
        quotedAd = null;
        placeholderKey = null;
        ephemeralExpiration = 0;
        ephemeralSettingTimestamp = 0l;
        ephemeralSharedSecret = null;
        externalAdReply = null;
        entryPointConversionSource = null;
        entryPointConversionApp = null;
        entryPointConversionDelaySeconds = 0;
        disappearingMode = null;
        actionLink = null;
        groupSubject = null;
        parentGroup = null;
        trustBannerType = null;
        trustBannerAction = 0;
    }

    public ContextInfoBuilder quotedMessageId(it.auties.protobuf.model.ProtobufString quotedMessageId) {
        this.quotedMessageId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(quotedMessageId);
        return this;
    }

    public ContextInfoBuilder quotedMessageId(java.lang.String quotedMessageId) {
        this.quotedMessageId = quotedMessageId;
        return this;
    }

    public ContextInfoBuilder quotedMessageSenderJid(it.auties.protobuf.model.ProtobufString quotedMessageSenderJid) {
        this.quotedMessageSenderJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(quotedMessageSenderJid));
        return this;
    }

    public ContextInfoBuilder quotedMessageSenderJid(it.auties.whatsapp.model.jid.Jid quotedMessageSenderJid) {
        this.quotedMessageSenderJid = quotedMessageSenderJid;
        return this;
    }

    public ContextInfoBuilder quotedMessage(it.auties.whatsapp.model.message.model.MessageContainer quotedMessage) {
        this.quotedMessage = quotedMessage;
        return this;
    }

    public ContextInfoBuilder quotedMessageChatJid(it.auties.protobuf.model.ProtobufString quotedMessageChatJid) {
        this.quotedMessageChatJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(quotedMessageChatJid));
        return this;
    }

    public ContextInfoBuilder quotedMessageChatJid(it.auties.whatsapp.model.jid.Jid quotedMessageChatJid) {
        this.quotedMessageChatJid = quotedMessageChatJid;
        return this;
    }

    public ContextInfoBuilder mentions(java.util.List<it.auties.whatsapp.model.jid.Jid> mentions) {
        this.mentions = mentions;
        return this;
    }

    public ContextInfoBuilder conversionSource(it.auties.protobuf.model.ProtobufString conversionSource) {
        this.conversionSource = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(conversionSource);
        return this;
    }

    public ContextInfoBuilder conversionSource(java.lang.String conversionSource) {
        this.conversionSource = conversionSource;
        return this;
    }

    public ContextInfoBuilder conversionData(java.nio.ByteBuffer conversionData) {
        this.conversionData = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(conversionData);
        return this;
    }

    public ContextInfoBuilder conversionData(byte[] conversionData) {
        this.conversionData = conversionData;
        return this;
    }

    public ContextInfoBuilder conversionDelaySeconds(int conversionDelaySeconds) {
        this.conversionDelaySeconds = conversionDelaySeconds;
        return this;
    }

    public ContextInfoBuilder forwardingScore(int forwardingScore) {
        this.forwardingScore = forwardingScore;
        return this;
    }

    public ContextInfoBuilder forwarded(boolean forwarded) {
        this.forwarded = forwarded;
        return this;
    }

    public ContextInfoBuilder quotedAd(it.auties.whatsapp.model.info.AdReplyInfo quotedAd) {
        this.quotedAd = quotedAd;
        return this;
    }

    public ContextInfoBuilder placeholderKey(it.auties.whatsapp.model.message.model.ChatMessageKey placeholderKey) {
        this.placeholderKey = placeholderKey;
        return this;
    }

    public ContextInfoBuilder ephemeralExpiration(int ephemeralExpiration) {
        this.ephemeralExpiration = ephemeralExpiration;
        return this;
    }

    public ContextInfoBuilder ephemeralSettingTimestamp(long ephemeralSettingTimestamp) {
        this.ephemeralSettingTimestamp = ephemeralSettingTimestamp;
        return this;
    }

    public ContextInfoBuilder ephemeralSharedSecret(java.nio.ByteBuffer ephemeralSharedSecret) {
        this.ephemeralSharedSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(ephemeralSharedSecret);
        return this;
    }

    public ContextInfoBuilder ephemeralSharedSecret(byte[] ephemeralSharedSecret) {
        this.ephemeralSharedSecret = ephemeralSharedSecret;
        return this;
    }

    public ContextInfoBuilder externalAdReply(it.auties.whatsapp.model.info.ExternalAdReplyInfo externalAdReply) {
        this.externalAdReply = externalAdReply;
        return this;
    }

    public ContextInfoBuilder entryPointConversionSource(it.auties.protobuf.model.ProtobufString entryPointConversionSource) {
        this.entryPointConversionSource = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(entryPointConversionSource);
        return this;
    }

    public ContextInfoBuilder entryPointConversionSource(java.lang.String entryPointConversionSource) {
        this.entryPointConversionSource = entryPointConversionSource;
        return this;
    }

    public ContextInfoBuilder entryPointConversionApp(it.auties.protobuf.model.ProtobufString entryPointConversionApp) {
        this.entryPointConversionApp = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(entryPointConversionApp);
        return this;
    }

    public ContextInfoBuilder entryPointConversionApp(java.lang.String entryPointConversionApp) {
        this.entryPointConversionApp = entryPointConversionApp;
        return this;
    }

    public ContextInfoBuilder entryPointConversionDelaySeconds(int entryPointConversionDelaySeconds) {
        this.entryPointConversionDelaySeconds = entryPointConversionDelaySeconds;
        return this;
    }

    public ContextInfoBuilder disappearingMode(it.auties.whatsapp.model.chat.ChatDisappear disappearingMode) {
        this.disappearingMode = disappearingMode;
        return this;
    }

    public ContextInfoBuilder actionLink(it.auties.whatsapp.model.button.base.ButtonActionLink actionLink) {
        this.actionLink = actionLink;
        return this;
    }

    public ContextInfoBuilder groupSubject(it.auties.protobuf.model.ProtobufString groupSubject) {
        this.groupSubject = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(groupSubject);
        return this;
    }

    public ContextInfoBuilder groupSubject(java.lang.String groupSubject) {
        this.groupSubject = groupSubject;
        return this;
    }

    public ContextInfoBuilder parentGroup(it.auties.protobuf.model.ProtobufString parentGroup) {
        this.parentGroup = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(parentGroup));
        return this;
    }

    public ContextInfoBuilder parentGroup(it.auties.whatsapp.model.jid.Jid parentGroup) {
        this.parentGroup = parentGroup;
        return this;
    }

    public ContextInfoBuilder trustBannerType(it.auties.protobuf.model.ProtobufString trustBannerType) {
        this.trustBannerType = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(trustBannerType);
        return this;
    }

    public ContextInfoBuilder trustBannerType(java.lang.String trustBannerType) {
        this.trustBannerType = trustBannerType;
        return this;
    }

    public ContextInfoBuilder trustBannerAction(int trustBannerAction) {
        this.trustBannerAction = trustBannerAction;
        return this;
    }

    public it.auties.whatsapp.model.info.ContextInfo build() {
        return new it.auties.whatsapp.model.info.ContextInfo(quotedMessageId, quotedMessageSenderJid, quotedMessage, quotedMessageChatJid, mentions, conversionSource, conversionData, conversionDelaySeconds, forwardingScore, forwarded, quotedAd, placeholderKey, ephemeralExpiration, ephemeralSettingTimestamp, ephemeralSharedSecret, externalAdReply, entryPointConversionSource, entryPointConversionApp, entryPointConversionDelaySeconds, disappearingMode, actionLink, groupSubject, parentGroup, trustBannerType, trustBannerAction);
    }

}
