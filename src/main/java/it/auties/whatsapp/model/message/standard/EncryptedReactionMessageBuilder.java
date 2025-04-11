package it.auties.whatsapp.model.message.standard;

public class EncryptedReactionMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey targetMessageKey;
    private byte[] encPayload;
    private byte[] encIv;

    public EncryptedReactionMessageBuilder() {
        targetMessageKey = null;
        encPayload = null;
        encIv = null;
    }

    public EncryptedReactionMessageBuilder targetMessageKey(it.auties.whatsapp.model.message.model.ChatMessageKey targetMessageKey) {
        this.targetMessageKey = targetMessageKey;
        return this;
    }

    public EncryptedReactionMessageBuilder encPayload(java.nio.ByteBuffer encPayload) {
        this.encPayload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(encPayload);
        return this;
    }

    public EncryptedReactionMessageBuilder encPayload(byte[] encPayload) {
        this.encPayload = encPayload;
        return this;
    }

    public EncryptedReactionMessageBuilder encIv(java.nio.ByteBuffer encIv) {
        this.encIv = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(encIv);
        return this;
    }

    public EncryptedReactionMessageBuilder encIv(byte[] encIv) {
        this.encIv = encIv;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.EncryptedReactionMessage build() {
        return new it.auties.whatsapp.model.message.standard.EncryptedReactionMessage(targetMessageKey, encPayload, encIv);
    }

}
