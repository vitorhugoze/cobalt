package it.auties.whatsapp.model.button.interactive;

public class InteractiveHeaderBuilder {
    private java.lang.String title;
    private java.util.Optional<java.lang.String> subtitle;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> attachmentDocument;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> attachmentImage;
    private boolean mediaAttachment;
    private java.util.Optional<it.auties.whatsapp.model.button.interactive.InteractiveHeaderThumbnail> attachmentThumbnail;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> attachmentVideo;

    public InteractiveHeaderBuilder() {
        title = null;
        subtitle = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        attachmentDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        attachmentImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        mediaAttachment = false;
        attachmentThumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        attachmentVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public InteractiveHeaderBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public InteractiveHeaderBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public InteractiveHeaderBuilder subtitle(it.auties.protobuf.model.ProtobufString subtitle) {
        this.subtitle = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(subtitle));
        return this;
    }

    public InteractiveHeaderBuilder subtitle(java.lang.String subtitle) {
        this.subtitle = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(subtitle);
        return this;
    }

    public InteractiveHeaderBuilder attachmentDocument(it.auties.whatsapp.model.message.standard.DocumentMessage attachmentDocument) {
        this.attachmentDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(attachmentDocument);
        return this;
    }

    public InteractiveHeaderBuilder attachmentImage(it.auties.whatsapp.model.message.standard.ImageMessage attachmentImage) {
        this.attachmentImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(attachmentImage);
        return this;
    }

    public InteractiveHeaderBuilder mediaAttachment(boolean mediaAttachment) {
        this.mediaAttachment = mediaAttachment;
        return this;
    }

    public InteractiveHeaderBuilder attachmentThumbnail(java.nio.ByteBuffer attachmentThumbnail) {
        this.attachmentThumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.interactive.InteractiveHeaderThumbnail.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(attachmentThumbnail)));
        return this;
    }

    public InteractiveHeaderBuilder attachmentThumbnail(it.auties.whatsapp.model.button.interactive.InteractiveHeaderThumbnail attachmentThumbnail) {
        this.attachmentThumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(attachmentThumbnail);
        return this;
    }

    public InteractiveHeaderBuilder attachmentVideo(it.auties.whatsapp.model.message.standard.VideoOrGifMessage attachmentVideo) {
        this.attachmentVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(attachmentVideo);
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveHeader build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveHeader(title, subtitle, attachmentDocument, attachmentImage, mediaAttachment, attachmentThumbnail, attachmentVideo);
    }

}
