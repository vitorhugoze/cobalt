package it.auties.whatsapp.model.message.standard;

public class ImageMessageBuilder {
    private java.lang.String mediaUrl;
    private java.lang.String mimetype;
    private java.lang.String caption;
    private byte[] mediaSha256;
    private java.lang.Long mediaSize;
    private java.lang.Integer height;
    private java.lang.Integer width;
    private byte[] mediaKey;
    private byte[] mediaEncryptedSha256;
    private java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation> interactiveAnnotations;
    private java.lang.String mediaDirectPath;
    private java.lang.Long mediaKeyTimestampSeconds;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private byte[] firstScanSidecar;
    private java.lang.Integer firstScanLength;
    private java.lang.Integer experimentGroupId;
    private byte[] scansSidecar;
    private java.util.List<java.lang.Integer> scanLengths;
    private byte[] midQualityFileSha256;
    private byte[] midQualityFileEncSha256;
    private boolean viewOnce;
    private java.lang.String thumbnailDirectPath;
    private byte[] thumbnailSha256;
    private byte[] thumbnailEncSha256;
    private java.lang.String staticUrl;

    public ImageMessageBuilder() {
        mediaUrl = null;
        mimetype = null;
        caption = null;
        mediaSha256 = null;
        mediaSize = null;
        height = null;
        width = null;
        mediaKey = null;
        mediaEncryptedSha256 = null;
        interactiveAnnotations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        mediaDirectPath = null;
        mediaKeyTimestampSeconds = null;
        thumbnail = null;
        contextInfo = null;
        firstScanSidecar = null;
        firstScanLength = null;
        experimentGroupId = null;
        scansSidecar = null;
        scanLengths = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        midQualityFileSha256 = null;
        midQualityFileEncSha256 = null;
        viewOnce = false;
        thumbnailDirectPath = null;
        thumbnailSha256 = null;
        thumbnailEncSha256 = null;
        staticUrl = null;
    }

    public ImageMessageBuilder mediaUrl(it.auties.protobuf.model.ProtobufString mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaUrl);
        return this;
    }

    public ImageMessageBuilder mediaUrl(java.lang.String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public ImageMessageBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public ImageMessageBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public ImageMessageBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption);
        return this;
    }

    public ImageMessageBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public ImageMessageBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public ImageMessageBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public ImageMessageBuilder mediaSize(java.lang.Long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public ImageMessageBuilder height(java.lang.Integer height) {
        this.height = height;
        return this;
    }

    public ImageMessageBuilder width(java.lang.Integer width) {
        this.width = width;
        return this;
    }

    public ImageMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public ImageMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public ImageMessageBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public ImageMessageBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public ImageMessageBuilder interactiveAnnotations(java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation> interactiveAnnotations) {
        this.interactiveAnnotations = interactiveAnnotations;
        return this;
    }

    public ImageMessageBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public ImageMessageBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public ImageMessageBuilder mediaKeyTimestampSeconds(java.lang.Long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public ImageMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public ImageMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public ImageMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public ImageMessageBuilder firstScanSidecar(java.nio.ByteBuffer firstScanSidecar) {
        this.firstScanSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(firstScanSidecar);
        return this;
    }

    public ImageMessageBuilder firstScanSidecar(byte[] firstScanSidecar) {
        this.firstScanSidecar = firstScanSidecar;
        return this;
    }

    public ImageMessageBuilder firstScanLength(java.lang.Integer firstScanLength) {
        this.firstScanLength = firstScanLength;
        return this;
    }

    public ImageMessageBuilder experimentGroupId(java.lang.Integer experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }

    public ImageMessageBuilder scansSidecar(java.nio.ByteBuffer scansSidecar) {
        this.scansSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(scansSidecar);
        return this;
    }

    public ImageMessageBuilder scansSidecar(byte[] scansSidecar) {
        this.scansSidecar = scansSidecar;
        return this;
    }

    public ImageMessageBuilder scanLengths(java.util.List<java.lang.Integer> scanLengths) {
        this.scanLengths = scanLengths;
        return this;
    }

    public ImageMessageBuilder midQualityFileSha256(java.nio.ByteBuffer midQualityFileSha256) {
        this.midQualityFileSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(midQualityFileSha256);
        return this;
    }

    public ImageMessageBuilder midQualityFileSha256(byte[] midQualityFileSha256) {
        this.midQualityFileSha256 = midQualityFileSha256;
        return this;
    }

    public ImageMessageBuilder midQualityFileEncSha256(java.nio.ByteBuffer midQualityFileEncSha256) {
        this.midQualityFileEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(midQualityFileEncSha256);
        return this;
    }

    public ImageMessageBuilder midQualityFileEncSha256(byte[] midQualityFileEncSha256) {
        this.midQualityFileEncSha256 = midQualityFileEncSha256;
        return this;
    }

    public ImageMessageBuilder viewOnce(boolean viewOnce) {
        this.viewOnce = viewOnce;
        return this;
    }

    public ImageMessageBuilder thumbnailDirectPath(it.auties.protobuf.model.ProtobufString thumbnailDirectPath) {
        this.thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailDirectPath);
        return this;
    }

    public ImageMessageBuilder thumbnailDirectPath(java.lang.String thumbnailDirectPath) {
        this.thumbnailDirectPath = thumbnailDirectPath;
        return this;
    }

    public ImageMessageBuilder thumbnailSha256(java.nio.ByteBuffer thumbnailSha256) {
        this.thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailSha256);
        return this;
    }

    public ImageMessageBuilder thumbnailSha256(byte[] thumbnailSha256) {
        this.thumbnailSha256 = thumbnailSha256;
        return this;
    }

    public ImageMessageBuilder thumbnailEncSha256(java.nio.ByteBuffer thumbnailEncSha256) {
        this.thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailEncSha256);
        return this;
    }

    public ImageMessageBuilder thumbnailEncSha256(byte[] thumbnailEncSha256) {
        this.thumbnailEncSha256 = thumbnailEncSha256;
        return this;
    }

    public ImageMessageBuilder staticUrl(it.auties.protobuf.model.ProtobufString staticUrl) {
        this.staticUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(staticUrl);
        return this;
    }

    public ImageMessageBuilder staticUrl(java.lang.String staticUrl) {
        this.staticUrl = staticUrl;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.ImageMessage build() {
        return new it.auties.whatsapp.model.message.standard.ImageMessage(mediaUrl, mimetype, caption, mediaSha256, mediaSize, height, width, mediaKey, mediaEncryptedSha256, interactiveAnnotations, mediaDirectPath, mediaKeyTimestampSeconds, thumbnail, contextInfo, firstScanSidecar, firstScanLength, experimentGroupId, scansSidecar, scanLengths, midQualityFileSha256, midQualityFileEncSha256, viewOnce, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, staticUrl);
    }

}
