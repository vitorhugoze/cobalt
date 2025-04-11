package it.auties.whatsapp.model.message.standard;

public class StickerMessageBuilder {
    private java.lang.String mediaUrl;
    private byte[] mediaSha256;
    private byte[] mediaEncryptedSha256;
    private byte[] mediaKey;
    private java.lang.String mimetype;
    private java.lang.Integer height;
    private java.lang.Integer width;
    private java.lang.String mediaDirectPath;
    private java.lang.Long mediaSize;
    private java.lang.Long mediaKeyTimestampSeconds;
    private java.lang.Integer firstFrameLength;
    private byte[] firstFrameSidecar;
    private boolean animated;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.lang.Long stickerSentTimestamp;
    private boolean avatar;

    public StickerMessageBuilder() {
        mediaUrl = null;
        mediaSha256 = null;
        mediaEncryptedSha256 = null;
        mediaKey = null;
        mimetype = null;
        height = null;
        width = null;
        mediaDirectPath = null;
        mediaSize = null;
        mediaKeyTimestampSeconds = null;
        firstFrameLength = null;
        firstFrameSidecar = null;
        animated = false;
        thumbnail = null;
        contextInfo = null;
        stickerSentTimestamp = null;
        avatar = false;
    }

    public StickerMessageBuilder mediaUrl(it.auties.protobuf.model.ProtobufString mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaUrl);
        return this;
    }

    public StickerMessageBuilder mediaUrl(java.lang.String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public StickerMessageBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public StickerMessageBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public StickerMessageBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public StickerMessageBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public StickerMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public StickerMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public StickerMessageBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public StickerMessageBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public StickerMessageBuilder height(java.lang.Integer height) {
        this.height = height;
        return this;
    }

    public StickerMessageBuilder width(java.lang.Integer width) {
        this.width = width;
        return this;
    }

    public StickerMessageBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public StickerMessageBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public StickerMessageBuilder mediaSize(java.lang.Long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public StickerMessageBuilder mediaKeyTimestampSeconds(java.lang.Long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public StickerMessageBuilder firstFrameLength(java.lang.Integer firstFrameLength) {
        this.firstFrameLength = firstFrameLength;
        return this;
    }

    public StickerMessageBuilder firstFrameSidecar(java.nio.ByteBuffer firstFrameSidecar) {
        this.firstFrameSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(firstFrameSidecar);
        return this;
    }

    public StickerMessageBuilder firstFrameSidecar(byte[] firstFrameSidecar) {
        this.firstFrameSidecar = firstFrameSidecar;
        return this;
    }

    public StickerMessageBuilder animated(boolean animated) {
        this.animated = animated;
        return this;
    }

    public StickerMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public StickerMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public StickerMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public StickerMessageBuilder stickerSentTimestamp(java.lang.Long stickerSentTimestamp) {
        this.stickerSentTimestamp = stickerSentTimestamp;
        return this;
    }

    public StickerMessageBuilder avatar(boolean avatar) {
        this.avatar = avatar;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.StickerMessage build() {
        return new it.auties.whatsapp.model.message.standard.StickerMessage(mediaUrl, mediaSha256, mediaEncryptedSha256, mediaKey, mimetype, height, width, mediaDirectPath, mediaSize, mediaKeyTimestampSeconds, firstFrameLength, firstFrameSidecar, animated, thumbnail, contextInfo, stickerSentTimestamp, avatar);
    }

}
