package it.auties.whatsapp.model.message.standard;

public class DocumentMessageBuilder {
    private java.lang.String mediaUrl;
    private java.lang.String mimetype;
    private java.lang.String title;
    private byte[] mediaSha256;
    private java.lang.Long mediaSize;
    private java.lang.Integer pageCount;
    private byte[] mediaKey;
    private java.lang.String fileName;
    private byte[] mediaEncryptedSha256;
    private java.lang.String mediaDirectPath;
    private java.lang.Long mediaKeyTimestampSeconds;
    private boolean contactVcard;
    private java.lang.String thumbnailDirectPath;
    private byte[] thumbnailSha256;
    private byte[] thumbnailEncSha256;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.lang.Integer thumbnailHeight;
    private java.lang.Integer thumbnailWidth;
    private java.lang.String caption;

    public DocumentMessageBuilder() {
        mediaUrl = null;
        mimetype = null;
        title = null;
        mediaSha256 = null;
        mediaSize = null;
        pageCount = null;
        mediaKey = null;
        fileName = null;
        mediaEncryptedSha256 = null;
        mediaDirectPath = null;
        mediaKeyTimestampSeconds = null;
        contactVcard = false;
        thumbnailDirectPath = null;
        thumbnailSha256 = null;
        thumbnailEncSha256 = null;
        thumbnail = null;
        contextInfo = null;
        thumbnailHeight = null;
        thumbnailWidth = null;
        caption = null;
    }

    public DocumentMessageBuilder mediaUrl(it.auties.protobuf.model.ProtobufString mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaUrl);
        return this;
    }

    public DocumentMessageBuilder mediaUrl(java.lang.String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public DocumentMessageBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public DocumentMessageBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public DocumentMessageBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public DocumentMessageBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public DocumentMessageBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public DocumentMessageBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public DocumentMessageBuilder mediaSize(java.lang.Long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public DocumentMessageBuilder pageCount(java.lang.Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public DocumentMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public DocumentMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public DocumentMessageBuilder fileName(it.auties.protobuf.model.ProtobufString fileName) {
        this.fileName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fileName);
        return this;
    }

    public DocumentMessageBuilder fileName(java.lang.String fileName) {
        this.fileName = fileName;
        return this;
    }

    public DocumentMessageBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public DocumentMessageBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public DocumentMessageBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public DocumentMessageBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public DocumentMessageBuilder mediaKeyTimestampSeconds(java.lang.Long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public DocumentMessageBuilder contactVcard(boolean contactVcard) {
        this.contactVcard = contactVcard;
        return this;
    }

    public DocumentMessageBuilder thumbnailDirectPath(it.auties.protobuf.model.ProtobufString thumbnailDirectPath) {
        this.thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailDirectPath);
        return this;
    }

    public DocumentMessageBuilder thumbnailDirectPath(java.lang.String thumbnailDirectPath) {
        this.thumbnailDirectPath = thumbnailDirectPath;
        return this;
    }

    public DocumentMessageBuilder thumbnailSha256(java.nio.ByteBuffer thumbnailSha256) {
        this.thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailSha256);
        return this;
    }

    public DocumentMessageBuilder thumbnailSha256(byte[] thumbnailSha256) {
        this.thumbnailSha256 = thumbnailSha256;
        return this;
    }

    public DocumentMessageBuilder thumbnailEncSha256(java.nio.ByteBuffer thumbnailEncSha256) {
        this.thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailEncSha256);
        return this;
    }

    public DocumentMessageBuilder thumbnailEncSha256(byte[] thumbnailEncSha256) {
        this.thumbnailEncSha256 = thumbnailEncSha256;
        return this;
    }

    public DocumentMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public DocumentMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public DocumentMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public DocumentMessageBuilder thumbnailHeight(java.lang.Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }

    public DocumentMessageBuilder thumbnailWidth(java.lang.Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public DocumentMessageBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption);
        return this;
    }

    public DocumentMessageBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.DocumentMessage build() {
        return new it.auties.whatsapp.model.message.standard.DocumentMessage(mediaUrl, mimetype, title, mediaSha256, mediaSize, pageCount, mediaKey, fileName, mediaEncryptedSha256, mediaDirectPath, mediaKeyTimestampSeconds, contactVcard, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, thumbnail, contextInfo, thumbnailHeight, thumbnailWidth, caption);
    }

}
