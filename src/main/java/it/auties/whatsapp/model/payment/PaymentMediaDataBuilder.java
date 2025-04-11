package it.auties.whatsapp.model.payment;

public class PaymentMediaDataBuilder {
    private byte[] mediaKey;
    private long mediaKeyTimestamp;
    private byte[] mediaSha256;
    private byte[] mediaEncryptedSha256;
    private java.lang.String mediaDirectPath;

    public PaymentMediaDataBuilder() {
        mediaKey = null;
        mediaKeyTimestamp = 0l;
        mediaSha256 = null;
        mediaEncryptedSha256 = null;
        mediaDirectPath = null;
    }

    public PaymentMediaDataBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public PaymentMediaDataBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public PaymentMediaDataBuilder mediaKeyTimestamp(long mediaKeyTimestamp) {
        this.mediaKeyTimestamp = mediaKeyTimestamp;
        return this;
    }

    public PaymentMediaDataBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public PaymentMediaDataBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public PaymentMediaDataBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public PaymentMediaDataBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public PaymentMediaDataBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public PaymentMediaDataBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public it.auties.whatsapp.model.payment.PaymentMediaData build() {
        return new it.auties.whatsapp.model.payment.PaymentMediaData(mediaKey, mediaKeyTimestamp, mediaSha256, mediaEncryptedSha256, mediaDirectPath);
    }

}
