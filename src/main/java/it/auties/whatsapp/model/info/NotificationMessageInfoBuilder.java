package it.auties.whatsapp.model.info;

public class NotificationMessageInfoBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;
    private it.auties.whatsapp.model.message.model.MessageContainer message;
    private long messageTimestampSeconds;
    private java.util.Optional<java.lang.String> participant;

    public NotificationMessageInfoBuilder() {
        key = null;
        message = null;
        messageTimestampSeconds = 0l;
        participant = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public NotificationMessageInfoBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public NotificationMessageInfoBuilder message(it.auties.whatsapp.model.message.model.MessageContainer message) {
        this.message = message;
        return this;
    }

    public NotificationMessageInfoBuilder messageTimestampSeconds(long messageTimestampSeconds) {
        this.messageTimestampSeconds = messageTimestampSeconds;
        return this;
    }

    public NotificationMessageInfoBuilder participant(it.auties.protobuf.model.ProtobufString participant) {
        this.participant = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(participant));
        return this;
    }

    public NotificationMessageInfoBuilder participant(java.lang.String participant) {
        this.participant = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(participant);
        return this;
    }

    public it.auties.whatsapp.model.info.NotificationMessageInfo build() {
        return new it.auties.whatsapp.model.info.NotificationMessageInfo(key, message, messageTimestampSeconds, participant);
    }

}
