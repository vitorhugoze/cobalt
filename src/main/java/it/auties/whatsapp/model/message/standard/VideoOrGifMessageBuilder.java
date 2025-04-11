package it.auties.whatsapp.model.message.standard;

public class VideoOrGifMessageBuilder {
    private java.lang.String mediaUrl;
    private java.lang.String mimetype;
    private byte[] mediaSha256;
    private java.lang.Long mediaSize;
    private java.lang.Integer duration;
    private byte[] mediaKey;
    private java.lang.String caption;
    private boolean gifPlayback;
    private java.lang.Integer height;
    private java.lang.Integer width;
    private byte[] mediaEncryptedSha256;
    private java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation> interactiveAnnotations;
    private java.lang.String mediaDirectPath;
    private long mediaKeyTimestampSeconds;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private byte[] streamingSidecar;
    private it.auties.whatsapp.model.message.standard.VideoOrGifMessage.Attribution gifAttribution;
    private boolean viewOnce;
    private java.lang.String thumbnailDirectPath;
    private byte[] thumbnailSha256;
    private byte[] thumbnailEncSha256;
    private java.lang.String staticUrl;

    public VideoOrGifMessageBuilder() {
        mediaUrl = null;
        mimetype = null;
        mediaSha256 = null;
        mediaSize = null;
        duration = null;
        mediaKey = null;
        caption = null;
        gifPlayback = false;
        height = null;
        width = null;
        mediaEncryptedSha256 = null;
        interactiveAnnotations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        mediaDirectPath = null;
        mediaKeyTimestampSeconds = 0l;
        thumbnail = null;
        contextInfo = null;
        streamingSidecar = null;
        gifAttribution = null;
        viewOnce = false;
        thumbnailDirectPath = null;
        thumbnailSha256 = null;
        thumbnailEncSha256 = null;
        staticUrl = null;
    }

    public VideoOrGifMessageBuilder mediaUrl(it.auties.protobuf.model.ProtobufString mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaUrl);
        return this;
    }

    public VideoOrGifMessageBuilder mediaUrl(java.lang.String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public VideoOrGifMessageBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public VideoOrGifMessageBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public VideoOrGifMessageBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public VideoOrGifMessageBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public VideoOrGifMessageBuilder mediaSize(java.lang.Long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public VideoOrGifMessageBuilder duration(java.lang.Integer duration) {
        this.duration = duration;
        return this;
    }

    public VideoOrGifMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public VideoOrGifMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public VideoOrGifMessageBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption);
        return this;
    }

    public VideoOrGifMessageBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public VideoOrGifMessageBuilder gifPlayback(boolean gifPlayback) {
        this.gifPlayback = gifPlayback;
        return this;
    }

    public VideoOrGifMessageBuilder height(java.lang.Integer height) {
        this.height = height;
        return this;
    }

    public VideoOrGifMessageBuilder width(java.lang.Integer width) {
        this.width = width;
        return this;
    }

    public VideoOrGifMessageBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public VideoOrGifMessageBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public VideoOrGifMessageBuilder interactiveAnnotations(java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation> interactiveAnnotations) {
        this.interactiveAnnotations = interactiveAnnotations;
        return this;
    }

    public VideoOrGifMessageBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public VideoOrGifMessageBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public VideoOrGifMessageBuilder mediaKeyTimestampSeconds(long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public VideoOrGifMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public VideoOrGifMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public VideoOrGifMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public VideoOrGifMessageBuilder streamingSidecar(java.nio.ByteBuffer streamingSidecar) {
        this.streamingSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(streamingSidecar);
        return this;
    }

    public VideoOrGifMessageBuilder streamingSidecar(byte[] streamingSidecar) {
        this.streamingSidecar = streamingSidecar;
        return this;
    }

    public VideoOrGifMessageBuilder gifAttribution(it.auties.whatsapp.model.message.standard.VideoOrGifMessage.Attribution gifAttribution) {
        this.gifAttribution = gifAttribution;
        return this;
    }

    public VideoOrGifMessageBuilder viewOnce(boolean viewOnce) {
        this.viewOnce = viewOnce;
        return this;
    }

    public VideoOrGifMessageBuilder thumbnailDirectPath(it.auties.protobuf.model.ProtobufString thumbnailDirectPath) {
        this.thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailDirectPath);
        return this;
    }

    public VideoOrGifMessageBuilder thumbnailDirectPath(java.lang.String thumbnailDirectPath) {
        this.thumbnailDirectPath = thumbnailDirectPath;
        return this;
    }

    public VideoOrGifMessageBuilder thumbnailSha256(java.nio.ByteBuffer thumbnailSha256) {
        this.thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailSha256);
        return this;
    }

    public VideoOrGifMessageBuilder thumbnailSha256(byte[] thumbnailSha256) {
        this.thumbnailSha256 = thumbnailSha256;
        return this;
    }

    public VideoOrGifMessageBuilder thumbnailEncSha256(java.nio.ByteBuffer thumbnailEncSha256) {
        this.thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailEncSha256);
        return this;
    }

    public VideoOrGifMessageBuilder thumbnailEncSha256(byte[] thumbnailEncSha256) {
        this.thumbnailEncSha256 = thumbnailEncSha256;
        return this;
    }

    public VideoOrGifMessageBuilder staticUrl(it.auties.protobuf.model.ProtobufString staticUrl) {
        this.staticUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(staticUrl);
        return this;
    }

    public VideoOrGifMessageBuilder staticUrl(java.lang.String staticUrl) {
        this.staticUrl = staticUrl;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.VideoOrGifMessage build() {
        return new it.auties.whatsapp.model.message.standard.VideoOrGifMessage(mediaUrl, mimetype, mediaSha256, mediaSize, duration, mediaKey, caption, gifPlayback, height, width, mediaEncryptedSha256, interactiveAnnotations, mediaDirectPath, mediaKeyTimestampSeconds, thumbnail, contextInfo, streamingSidecar, gifAttribution, viewOnce, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, staticUrl);
    }

}
