package it.auties.whatsapp.model.poll;

public class PollUpdateEncryptedMetadataBuilder {
    private byte[] payload;
    private byte[] iv;

    public PollUpdateEncryptedMetadataBuilder() {
        payload = null;
        iv = null;
    }

    public PollUpdateEncryptedMetadataBuilder payload(java.nio.ByteBuffer payload) {
        this.payload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(payload);
        return this;
    }

    public PollUpdateEncryptedMetadataBuilder payload(byte[] payload) {
        this.payload = payload;
        return this;
    }

    public PollUpdateEncryptedMetadataBuilder iv(java.nio.ByteBuffer iv) {
        this.iv = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(iv);
        return this;
    }

    public PollUpdateEncryptedMetadataBuilder iv(byte[] iv) {
        this.iv = iv;
        return this;
    }

    public it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata build() {
        return new it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata(payload, iv);
    }

}
