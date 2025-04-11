package it.auties.whatsapp.model.sync;

public class StickerMetadataBuilder {
    private java.lang.String url;
    private byte[] fileSha256;
    private byte[] fileEncSha256;
    private byte[] mediaKey;
    private java.lang.String mimetype;
    private int height;
    private int width;
    private java.lang.String directPath;
    private long fileLength;
    private float weight;
    private long lastStickerSentTs;

    public StickerMetadataBuilder() {
        url = null;
        fileSha256 = null;
        fileEncSha256 = null;
        mediaKey = null;
        mimetype = null;
        height = 0;
        width = 0;
        directPath = null;
        fileLength = 0l;
        weight = 0f;
        lastStickerSentTs = 0l;
    }

    public StickerMetadataBuilder url(it.auties.protobuf.model.ProtobufString url) {
        this.url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(url);
        return this;
    }

    public StickerMetadataBuilder url(java.lang.String url) {
        this.url = url;
        return this;
    }

    public StickerMetadataBuilder fileSha256(java.nio.ByteBuffer fileSha256) {
        this.fileSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fileSha256);
        return this;
    }

    public StickerMetadataBuilder fileSha256(byte[] fileSha256) {
        this.fileSha256 = fileSha256;
        return this;
    }

    public StickerMetadataBuilder fileEncSha256(java.nio.ByteBuffer fileEncSha256) {
        this.fileEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fileEncSha256);
        return this;
    }

    public StickerMetadataBuilder fileEncSha256(byte[] fileEncSha256) {
        this.fileEncSha256 = fileEncSha256;
        return this;
    }

    public StickerMetadataBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public StickerMetadataBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public StickerMetadataBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public StickerMetadataBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public StickerMetadataBuilder height(int height) {
        this.height = height;
        return this;
    }

    public StickerMetadataBuilder width(int width) {
        this.width = width;
        return this;
    }

    public StickerMetadataBuilder directPath(it.auties.protobuf.model.ProtobufString directPath) {
        this.directPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(directPath);
        return this;
    }

    public StickerMetadataBuilder directPath(java.lang.String directPath) {
        this.directPath = directPath;
        return this;
    }

    public StickerMetadataBuilder fileLength(long fileLength) {
        this.fileLength = fileLength;
        return this;
    }

    public StickerMetadataBuilder weight(float weight) {
        this.weight = weight;
        return this;
    }

    public StickerMetadataBuilder lastStickerSentTs(long lastStickerSentTs) {
        this.lastStickerSentTs = lastStickerSentTs;
        return this;
    }

    public it.auties.whatsapp.model.sync.StickerMetadata build() {
        return new it.auties.whatsapp.model.sync.StickerMetadata(url, fileSha256, fileEncSha256, mediaKey, mimetype, height, width, directPath, fileLength, weight, lastStickerSentTs);
    }

}
