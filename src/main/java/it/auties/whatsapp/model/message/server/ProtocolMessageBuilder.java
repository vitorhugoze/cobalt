package it.auties.whatsapp.model.message.server;

public class ProtocolMessageBuilder {
    private java.util.Optional<it.auties.whatsapp.model.message.model.ChatMessageKey> key;
    private it.auties.whatsapp.model.message.server.ProtocolMessage.Type protocolType;
    private long ephemeralExpiration;
    private long ephemeralSettingTimestampSeconds;
    private java.util.Optional<it.auties.whatsapp.model.sync.HistorySyncNotification> historySyncNotification;
    private java.util.Optional<it.auties.whatsapp.model.sync.AppStateSyncKeyShare> appStateSyncKeyShare;
    private java.util.Optional<it.auties.whatsapp.model.sync.AppStateSyncKeyRequest> appStateSyncKeyRequest;
    private java.util.Optional<it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync> initialSecurityNotificationSettingSync;
    private java.util.Optional<it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification> appStateFatalExceptionNotification;
    private java.util.Optional<it.auties.whatsapp.model.chat.ChatDisappear> disappearingMode;
    private java.util.Optional<it.auties.whatsapp.model.message.model.MessageContainer> editedMessage;
    private long timestampMilliseconds;

    public ProtocolMessageBuilder() {
        key = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        protocolType = null;
        ephemeralExpiration = 0l;
        ephemeralSettingTimestampSeconds = 0l;
        historySyncNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        appStateSyncKeyShare = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        appStateSyncKeyRequest = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        initialSecurityNotificationSettingSync = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        appStateFatalExceptionNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        disappearingMode = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        timestampMilliseconds = 0l;
    }

    public ProtocolMessageBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(key);
        return this;
    }

    public ProtocolMessageBuilder protocolType(it.auties.whatsapp.model.message.server.ProtocolMessage.Type protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    public ProtocolMessageBuilder ephemeralExpiration(long ephemeralExpiration) {
        this.ephemeralExpiration = ephemeralExpiration;
        return this;
    }

    public ProtocolMessageBuilder ephemeralSettingTimestampSeconds(long ephemeralSettingTimestampSeconds) {
        this.ephemeralSettingTimestampSeconds = ephemeralSettingTimestampSeconds;
        return this;
    }

    public ProtocolMessageBuilder historySyncNotification(it.auties.whatsapp.model.sync.HistorySyncNotification historySyncNotification) {
        this.historySyncNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(historySyncNotification);
        return this;
    }

    public ProtocolMessageBuilder appStateSyncKeyShare(it.auties.whatsapp.model.sync.AppStateSyncKeyShare appStateSyncKeyShare) {
        this.appStateSyncKeyShare = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(appStateSyncKeyShare);
        return this;
    }

    public ProtocolMessageBuilder appStateSyncKeyRequest(it.auties.whatsapp.model.sync.AppStateSyncKeyRequest appStateSyncKeyRequest) {
        this.appStateSyncKeyRequest = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(appStateSyncKeyRequest);
        return this;
    }

    public ProtocolMessageBuilder initialSecurityNotificationSettingSync(it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync initialSecurityNotificationSettingSync) {
        this.initialSecurityNotificationSettingSync = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(initialSecurityNotificationSettingSync);
        return this;
    }

    public ProtocolMessageBuilder appStateFatalExceptionNotification(it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification appStateFatalExceptionNotification) {
        this.appStateFatalExceptionNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(appStateFatalExceptionNotification);
        return this;
    }

    public ProtocolMessageBuilder disappearingMode(it.auties.whatsapp.model.chat.ChatDisappear disappearingMode) {
        this.disappearingMode = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(disappearingMode);
        return this;
    }

    public ProtocolMessageBuilder editedMessage(it.auties.whatsapp.model.message.model.MessageContainer editedMessage) {
        this.editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(editedMessage);
        return this;
    }

    public ProtocolMessageBuilder timestampMilliseconds(long timestampMilliseconds) {
        this.timestampMilliseconds = timestampMilliseconds;
        return this;
    }

    public it.auties.whatsapp.model.message.server.ProtocolMessage build() {
        return new it.auties.whatsapp.model.message.server.ProtocolMessage(key, protocolType, ephemeralExpiration, ephemeralSettingTimestampSeconds, historySyncNotification, appStateSyncKeyShare, appStateSyncKeyRequest, initialSecurityNotificationSettingSync, appStateFatalExceptionNotification, disappearingMode, editedMessage, timestampMilliseconds);
    }

}
