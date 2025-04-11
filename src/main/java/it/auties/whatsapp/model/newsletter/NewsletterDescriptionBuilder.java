package it.auties.whatsapp.model.newsletter;

public class NewsletterDescriptionBuilder {
    private java.lang.String id;
    private java.lang.String text;
    private long updateTimeSeconds;

    public NewsletterDescriptionBuilder() {
        id = null;
        text = null;
        updateTimeSeconds = 0l;
    }

    public NewsletterDescriptionBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public NewsletterDescriptionBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public NewsletterDescriptionBuilder text(it.auties.protobuf.model.ProtobufString text) {
        this.text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(text);
        return this;
    }

    public NewsletterDescriptionBuilder text(java.lang.String text) {
        this.text = text;
        return this;
    }

    public NewsletterDescriptionBuilder updateTimeSeconds(long updateTimeSeconds) {
        this.updateTimeSeconds = updateTimeSeconds;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterDescription build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterDescription(id, text, updateTimeSeconds);
    }

}
