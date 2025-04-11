package it.auties.whatsapp.model.newsletter;

public class NewsletterNameBuilder {
    private java.lang.String id;
    private java.lang.String text;
    private long updateTimeSeconds;

    public NewsletterNameBuilder() {
        id = null;
        text = null;
        updateTimeSeconds = 0l;
    }

    public NewsletterNameBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public NewsletterNameBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public NewsletterNameBuilder text(it.auties.protobuf.model.ProtobufString text) {
        this.text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(text);
        return this;
    }

    public NewsletterNameBuilder text(java.lang.String text) {
        this.text = text;
        return this;
    }

    public NewsletterNameBuilder updateTimeSeconds(long updateTimeSeconds) {
        this.updateTimeSeconds = updateTimeSeconds;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterName build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterName(id, text, updateTimeSeconds);
    }

}
