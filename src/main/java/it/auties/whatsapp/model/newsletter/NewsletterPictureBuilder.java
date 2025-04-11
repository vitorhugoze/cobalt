package it.auties.whatsapp.model.newsletter;

public class NewsletterPictureBuilder {
    private java.lang.String id;
    private java.lang.String type;
    private java.lang.String directPath;

    public NewsletterPictureBuilder() {
        id = null;
        type = null;
        directPath = null;
    }

    public NewsletterPictureBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public NewsletterPictureBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public NewsletterPictureBuilder type(it.auties.protobuf.model.ProtobufString type) {
        this.type = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(type);
        return this;
    }

    public NewsletterPictureBuilder type(java.lang.String type) {
        this.type = type;
        return this;
    }

    public NewsletterPictureBuilder directPath(it.auties.protobuf.model.ProtobufString directPath) {
        this.directPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(directPath);
        return this;
    }

    public NewsletterPictureBuilder directPath(java.lang.String directPath) {
        this.directPath = directPath;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterPicture build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterPicture(id, type, directPath);
    }

}
