package it.auties.whatsapp.model.sync;

public class MediaRetryNotificationBuilder {
    private java.lang.String stanzaId;
    private java.util.Optional<java.lang.String> directPath;
    private it.auties.whatsapp.model.sync.MediaRetryNotification.MediaRetryNotificationResultType result;

    public MediaRetryNotificationBuilder() {
        stanzaId = null;
        directPath = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        result = null;
    }

    public MediaRetryNotificationBuilder stanzaId(it.auties.protobuf.model.ProtobufString stanzaId) {
        this.stanzaId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(stanzaId);
        return this;
    }

    public MediaRetryNotificationBuilder stanzaId(java.lang.String stanzaId) {
        this.stanzaId = stanzaId;
        return this;
    }

    public MediaRetryNotificationBuilder directPath(it.auties.protobuf.model.ProtobufString directPath) {
        this.directPath = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(directPath));
        return this;
    }

    public MediaRetryNotificationBuilder directPath(java.lang.String directPath) {
        this.directPath = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(directPath);
        return this;
    }

    public MediaRetryNotificationBuilder result(it.auties.whatsapp.model.sync.MediaRetryNotification.MediaRetryNotificationResultType result) {
        this.result = result;
        return this;
    }

    public it.auties.whatsapp.model.sync.MediaRetryNotification build() {
        return new it.auties.whatsapp.model.sync.MediaRetryNotification(stanzaId, directPath, result);
    }

}
