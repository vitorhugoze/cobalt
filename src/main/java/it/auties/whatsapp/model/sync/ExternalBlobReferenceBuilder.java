package it.auties.whatsapp.model.sync;

public class ExternalBlobReferenceBuilder {
    private byte[] mediaKey;
    private java.lang.String mediaDirectPath;
    private java.lang.String handle;
    private long mediaSize;
    private byte[] mediaSha256;
    private byte[] mediaEncryptedSha256;

    public ExternalBlobReferenceBuilder() {
        mediaKey = null;
        mediaDirectPath = null;
        handle = null;
        mediaSize = 0l;
        mediaSha256 = null;
        mediaEncryptedSha256 = null;
    }

    public ExternalBlobReferenceBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public ExternalBlobReferenceBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public ExternalBlobReferenceBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public ExternalBlobReferenceBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public ExternalBlobReferenceBuilder handle(it.auties.protobuf.model.ProtobufString handle) {
        this.handle = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(handle);
        return this;
    }

    public ExternalBlobReferenceBuilder handle(java.lang.String handle) {
        this.handle = handle;
        return this;
    }

    public ExternalBlobReferenceBuilder mediaSize(long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public ExternalBlobReferenceBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public ExternalBlobReferenceBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public ExternalBlobReferenceBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public ExternalBlobReferenceBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public it.auties.whatsapp.model.sync.ExternalBlobReference build() {
        return new it.auties.whatsapp.model.sync.ExternalBlobReference(mediaKey, mediaDirectPath, handle, mediaSize, mediaSha256, mediaEncryptedSha256);
    }

}
