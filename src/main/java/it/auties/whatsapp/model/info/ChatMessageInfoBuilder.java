package it.auties.whatsapp.model.info;

public class ChatMessageInfoBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;
    private it.auties.whatsapp.model.message.model.MessageContainer message;
    private long timestampSeconds;
    private it.auties.whatsapp.model.message.model.MessageStatus status;
    private it.auties.whatsapp.model.jid.Jid senderJid;
    private long messageC2STimestamp;
    private boolean ignore;
    private boolean starred;
    private boolean broadcast;
    private java.lang.String pushName;
    private byte[] mediaCiphertextSha256;
    private boolean multicast;
    private boolean urlText;
    private boolean urlNumber;
    private it.auties.whatsapp.model.info.ChatMessageInfo.StubType stubType;
    private boolean clearMedia;
    private java.util.List<java.lang.String> stubParameters;
    private int duration;
    private java.util.List<java.lang.String> labels;
    private it.auties.whatsapp.model.info.PaymentInfo paymentInfo;
    private it.auties.whatsapp.model.message.standard.LiveLocationMessage finalLiveLocation;
    private it.auties.whatsapp.model.info.PaymentInfo quotedPaymentInfo;
    private long ephemeralStartTimestamp;
    private int ephemeralDuration;
    private boolean enableEphemeral;
    private boolean ephemeralOutOfSync;
    private it.auties.whatsapp.model.business.BusinessPrivacyStatus businessPrivacyStatus;
    private java.lang.String businessVerifiedName;
    private it.auties.whatsapp.model.media.MediaData mediaData;
    private it.auties.whatsapp.model.sync.PhotoChange photoChange;
    private it.auties.whatsapp.model.message.model.MessageReceipt receipt;
    private java.util.List<it.auties.whatsapp.model.message.standard.ReactionMessage> reactions;
    private it.auties.whatsapp.model.media.MediaData quotedStickerData;
    private byte[] futureProofData;
    private it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus psaStatus;
    private java.util.List<it.auties.whatsapp.model.poll.PollUpdate> pollUpdates;
    private it.auties.whatsapp.model.poll.PollAdditionalMetadata pollAdditionalMetadata;
    private java.lang.String agentId;
    private boolean statusAlreadyViewed;
    private byte[] messageSecret;
    private it.auties.whatsapp.model.message.model.KeepInChat keepInChat;
    private it.auties.whatsapp.model.jid.Jid originalSender;
    private long revokeTimestampSeconds;

    public ChatMessageInfoBuilder() {
        key = null;
        message = null;
        timestampSeconds = 0l;
        status = null;
        senderJid = null;
        messageC2STimestamp = 0l;
        ignore = false;
        starred = false;
        broadcast = false;
        pushName = null;
        mediaCiphertextSha256 = null;
        multicast = false;
        urlText = false;
        urlNumber = false;
        stubType = null;
        clearMedia = false;
        stubParameters = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        duration = 0;
        labels = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        paymentInfo = null;
        finalLiveLocation = null;
        quotedPaymentInfo = null;
        ephemeralStartTimestamp = 0l;
        ephemeralDuration = 0;
        enableEphemeral = false;
        ephemeralOutOfSync = false;
        businessPrivacyStatus = null;
        businessVerifiedName = null;
        mediaData = null;
        photoChange = null;
        receipt = null;
        reactions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        quotedStickerData = null;
        futureProofData = null;
        psaStatus = null;
        pollUpdates = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        pollAdditionalMetadata = null;
        agentId = null;
        statusAlreadyViewed = false;
        messageSecret = null;
        keepInChat = null;
        originalSender = null;
        revokeTimestampSeconds = 0l;
    }

    public ChatMessageInfoBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public ChatMessageInfoBuilder message(it.auties.whatsapp.model.message.model.MessageContainer message) {
        this.message = message;
        return this;
    }

    public ChatMessageInfoBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public ChatMessageInfoBuilder status(it.auties.whatsapp.model.message.model.MessageStatus status) {
        this.status = status;
        return this;
    }

    public ChatMessageInfoBuilder senderJid(it.auties.protobuf.model.ProtobufString senderJid) {
        this.senderJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(senderJid));
        return this;
    }

    public ChatMessageInfoBuilder senderJid(it.auties.whatsapp.model.jid.Jid senderJid) {
        this.senderJid = senderJid;
        return this;
    }

    public ChatMessageInfoBuilder messageC2STimestamp(long messageC2STimestamp) {
        this.messageC2STimestamp = messageC2STimestamp;
        return this;
    }

    public ChatMessageInfoBuilder ignore(boolean ignore) {
        this.ignore = ignore;
        return this;
    }

    public ChatMessageInfoBuilder starred(boolean starred) {
        this.starred = starred;
        return this;
    }

    public ChatMessageInfoBuilder broadcast(boolean broadcast) {
        this.broadcast = broadcast;
        return this;
    }

    public ChatMessageInfoBuilder pushName(it.auties.protobuf.model.ProtobufString pushName) {
        this.pushName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(pushName);
        return this;
    }

    public ChatMessageInfoBuilder pushName(java.lang.String pushName) {
        this.pushName = pushName;
        return this;
    }

    public ChatMessageInfoBuilder mediaCiphertextSha256(java.nio.ByteBuffer mediaCiphertextSha256) {
        this.mediaCiphertextSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaCiphertextSha256);
        return this;
    }

    public ChatMessageInfoBuilder mediaCiphertextSha256(byte[] mediaCiphertextSha256) {
        this.mediaCiphertextSha256 = mediaCiphertextSha256;
        return this;
    }

    public ChatMessageInfoBuilder multicast(boolean multicast) {
        this.multicast = multicast;
        return this;
    }

    public ChatMessageInfoBuilder urlText(boolean urlText) {
        this.urlText = urlText;
        return this;
    }

    public ChatMessageInfoBuilder urlNumber(boolean urlNumber) {
        this.urlNumber = urlNumber;
        return this;
    }

    public ChatMessageInfoBuilder stubType(it.auties.whatsapp.model.info.ChatMessageInfo.StubType stubType) {
        this.stubType = stubType;
        return this;
    }

    public ChatMessageInfoBuilder clearMedia(boolean clearMedia) {
        this.clearMedia = clearMedia;
        return this;
    }

    public ChatMessageInfoBuilder stubParameters(java.util.List<java.lang.String> stubParameters) {
        this.stubParameters = stubParameters;
        return this;
    }

    public ChatMessageInfoBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public ChatMessageInfoBuilder labels(java.util.List<java.lang.String> labels) {
        this.labels = labels;
        return this;
    }

    public ChatMessageInfoBuilder paymentInfo(it.auties.whatsapp.model.info.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    public ChatMessageInfoBuilder finalLiveLocation(it.auties.whatsapp.model.message.standard.LiveLocationMessage finalLiveLocation) {
        this.finalLiveLocation = finalLiveLocation;
        return this;
    }

    public ChatMessageInfoBuilder quotedPaymentInfo(it.auties.whatsapp.model.info.PaymentInfo quotedPaymentInfo) {
        this.quotedPaymentInfo = quotedPaymentInfo;
        return this;
    }

    public ChatMessageInfoBuilder ephemeralStartTimestamp(long ephemeralStartTimestamp) {
        this.ephemeralStartTimestamp = ephemeralStartTimestamp;
        return this;
    }

    public ChatMessageInfoBuilder ephemeralDuration(int ephemeralDuration) {
        this.ephemeralDuration = ephemeralDuration;
        return this;
    }

    public ChatMessageInfoBuilder enableEphemeral(boolean enableEphemeral) {
        this.enableEphemeral = enableEphemeral;
        return this;
    }

    public ChatMessageInfoBuilder ephemeralOutOfSync(boolean ephemeralOutOfSync) {
        this.ephemeralOutOfSync = ephemeralOutOfSync;
        return this;
    }

    public ChatMessageInfoBuilder businessPrivacyStatus(it.auties.whatsapp.model.business.BusinessPrivacyStatus businessPrivacyStatus) {
        this.businessPrivacyStatus = businessPrivacyStatus;
        return this;
    }

    public ChatMessageInfoBuilder businessVerifiedName(it.auties.protobuf.model.ProtobufString businessVerifiedName) {
        this.businessVerifiedName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(businessVerifiedName);
        return this;
    }

    public ChatMessageInfoBuilder businessVerifiedName(java.lang.String businessVerifiedName) {
        this.businessVerifiedName = businessVerifiedName;
        return this;
    }

    public ChatMessageInfoBuilder mediaData(it.auties.whatsapp.model.media.MediaData mediaData) {
        this.mediaData = mediaData;
        return this;
    }

    public ChatMessageInfoBuilder photoChange(it.auties.whatsapp.model.sync.PhotoChange photoChange) {
        this.photoChange = photoChange;
        return this;
    }

    public ChatMessageInfoBuilder receipt(it.auties.whatsapp.model.message.model.MessageReceipt receipt) {
        this.receipt = receipt;
        return this;
    }

    public ChatMessageInfoBuilder reactions(java.util.List<it.auties.whatsapp.model.message.standard.ReactionMessage> reactions) {
        this.reactions = reactions;
        return this;
    }

    public ChatMessageInfoBuilder quotedStickerData(it.auties.whatsapp.model.media.MediaData quotedStickerData) {
        this.quotedStickerData = quotedStickerData;
        return this;
    }

    public ChatMessageInfoBuilder futureProofData(java.nio.ByteBuffer futureProofData) {
        this.futureProofData = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(futureProofData);
        return this;
    }

    public ChatMessageInfoBuilder futureProofData(byte[] futureProofData) {
        this.futureProofData = futureProofData;
        return this;
    }

    public ChatMessageInfoBuilder psaStatus(it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus psaStatus) {
        this.psaStatus = psaStatus;
        return this;
    }

    public ChatMessageInfoBuilder pollUpdates(java.util.List<it.auties.whatsapp.model.poll.PollUpdate> pollUpdates) {
        this.pollUpdates = pollUpdates;
        return this;
    }

    public ChatMessageInfoBuilder pollAdditionalMetadata(it.auties.whatsapp.model.poll.PollAdditionalMetadata pollAdditionalMetadata) {
        this.pollAdditionalMetadata = pollAdditionalMetadata;
        return this;
    }

    public ChatMessageInfoBuilder agentId(it.auties.protobuf.model.ProtobufString agentId) {
        this.agentId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(agentId);
        return this;
    }

    public ChatMessageInfoBuilder agentId(java.lang.String agentId) {
        this.agentId = agentId;
        return this;
    }

    public ChatMessageInfoBuilder statusAlreadyViewed(boolean statusAlreadyViewed) {
        this.statusAlreadyViewed = statusAlreadyViewed;
        return this;
    }

    public ChatMessageInfoBuilder messageSecret(java.nio.ByteBuffer messageSecret) {
        this.messageSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(messageSecret);
        return this;
    }

    public ChatMessageInfoBuilder messageSecret(byte[] messageSecret) {
        this.messageSecret = messageSecret;
        return this;
    }

    public ChatMessageInfoBuilder keepInChat(it.auties.whatsapp.model.message.model.KeepInChat keepInChat) {
        this.keepInChat = keepInChat;
        return this;
    }

    public ChatMessageInfoBuilder originalSender(it.auties.protobuf.model.ProtobufString originalSender) {
        this.originalSender = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(originalSender));
        return this;
    }

    public ChatMessageInfoBuilder originalSender(it.auties.whatsapp.model.jid.Jid originalSender) {
        this.originalSender = originalSender;
        return this;
    }

    public ChatMessageInfoBuilder revokeTimestampSeconds(long revokeTimestampSeconds) {
        this.revokeTimestampSeconds = revokeTimestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.info.ChatMessageInfo build() {
        return new it.auties.whatsapp.model.info.ChatMessageInfo(key, message, timestampSeconds, status, senderJid, messageC2STimestamp, ignore, starred, broadcast, pushName, mediaCiphertextSha256, multicast, urlText, urlNumber, stubType, clearMedia, stubParameters, duration, labels, paymentInfo, finalLiveLocation, quotedPaymentInfo, ephemeralStartTimestamp, ephemeralDuration, enableEphemeral, ephemeralOutOfSync, businessPrivacyStatus, businessVerifiedName, mediaData, photoChange, receipt, reactions, quotedStickerData, futureProofData, psaStatus, pollUpdates, pollAdditionalMetadata, agentId, statusAlreadyViewed, messageSecret, keepInChat, originalSender, revokeTimestampSeconds);
    }

}
