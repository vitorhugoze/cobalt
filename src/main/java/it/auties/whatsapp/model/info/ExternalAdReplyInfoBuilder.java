package it.auties.whatsapp.model.info;

public class ExternalAdReplyInfoBuilder {
    private java.util.Optional<java.lang.String> title;
    private java.util.Optional<java.lang.String> body;
    private java.util.Optional<it.auties.whatsapp.model.info.ExternalAdReplyInfo.MediaType> mediaType;
    private java.util.Optional<java.lang.String> thumbnailUrl;
    private java.util.Optional<java.lang.String> mediaUrl;
    private java.util.Optional<byte[]> thumbnail;
    private java.util.Optional<java.lang.String> sourceType;
    private java.util.Optional<java.lang.String> sourceId;
    private java.util.Optional<java.lang.String> sourceUrl;
    private boolean containsAutoReply;
    private boolean renderLargerThumbnail;
    private boolean showAdAttribution;
    private java.util.Optional<java.lang.String> ctwaClid;

    public ExternalAdReplyInfoBuilder() {
        title = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        body = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        mediaType = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        thumbnailUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        mediaUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        sourceType = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        sourceId = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        sourceUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        containsAutoReply = false;
        renderLargerThumbnail = false;
        showAdAttribution = false;
        ctwaClid = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ExternalAdReplyInfoBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title));
        return this;
    }

    public ExternalAdReplyInfoBuilder title(java.lang.String title) {
        this.title = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(title);
        return this;
    }

    public ExternalAdReplyInfoBuilder body(it.auties.protobuf.model.ProtobufString body) {
        this.body = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(body));
        return this;
    }

    public ExternalAdReplyInfoBuilder body(java.lang.String body) {
        this.body = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(body);
        return this;
    }

    public ExternalAdReplyInfoBuilder mediaType(it.auties.whatsapp.model.info.ExternalAdReplyInfo.MediaType mediaType) {
        this.mediaType = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(mediaType);
        return this;
    }

    public ExternalAdReplyInfoBuilder thumbnailUrl(it.auties.protobuf.model.ProtobufString thumbnailUrl) {
        this.thumbnailUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailUrl));
        return this;
    }

    public ExternalAdReplyInfoBuilder thumbnailUrl(java.lang.String thumbnailUrl) {
        this.thumbnailUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(thumbnailUrl);
        return this;
    }

    public ExternalAdReplyInfoBuilder mediaUrl(it.auties.protobuf.model.ProtobufString mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaUrl));
        return this;
    }

    public ExternalAdReplyInfoBuilder mediaUrl(java.lang.String mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(mediaUrl);
        return this;
    }

    public ExternalAdReplyInfoBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail));
        return this;
    }

    public ExternalAdReplyInfoBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(thumbnail);
        return this;
    }

    public ExternalAdReplyInfoBuilder sourceType(it.auties.protobuf.model.ProtobufString sourceType) {
        this.sourceType = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(sourceType));
        return this;
    }

    public ExternalAdReplyInfoBuilder sourceType(java.lang.String sourceType) {
        this.sourceType = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(sourceType);
        return this;
    }

    public ExternalAdReplyInfoBuilder sourceId(it.auties.protobuf.model.ProtobufString sourceId) {
        this.sourceId = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(sourceId));
        return this;
    }

    public ExternalAdReplyInfoBuilder sourceId(java.lang.String sourceId) {
        this.sourceId = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(sourceId);
        return this;
    }

    public ExternalAdReplyInfoBuilder sourceUrl(it.auties.protobuf.model.ProtobufString sourceUrl) {
        this.sourceUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(sourceUrl));
        return this;
    }

    public ExternalAdReplyInfoBuilder sourceUrl(java.lang.String sourceUrl) {
        this.sourceUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(sourceUrl);
        return this;
    }

    public ExternalAdReplyInfoBuilder containsAutoReply(boolean containsAutoReply) {
        this.containsAutoReply = containsAutoReply;
        return this;
    }

    public ExternalAdReplyInfoBuilder renderLargerThumbnail(boolean renderLargerThumbnail) {
        this.renderLargerThumbnail = renderLargerThumbnail;
        return this;
    }

    public ExternalAdReplyInfoBuilder showAdAttribution(boolean showAdAttribution) {
        this.showAdAttribution = showAdAttribution;
        return this;
    }

    public ExternalAdReplyInfoBuilder ctwaClid(it.auties.protobuf.model.ProtobufString ctwaClid) {
        this.ctwaClid = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(ctwaClid));
        return this;
    }

    public ExternalAdReplyInfoBuilder ctwaClid(java.lang.String ctwaClid) {
        this.ctwaClid = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(ctwaClid);
        return this;
    }

    public it.auties.whatsapp.model.info.ExternalAdReplyInfo build() {
        return new it.auties.whatsapp.model.info.ExternalAdReplyInfo(title, body, mediaType, thumbnailUrl, mediaUrl, thumbnail, sourceType, sourceId, sourceUrl, containsAutoReply, renderLargerThumbnail, showAdAttribution, ctwaClid);
    }

}
