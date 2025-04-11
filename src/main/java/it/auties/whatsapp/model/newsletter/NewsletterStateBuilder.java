package it.auties.whatsapp.model.newsletter;

public class NewsletterStateBuilder {
    private java.lang.String type;

    public NewsletterStateBuilder() {
        type = null;
    }

    public NewsletterStateBuilder type(it.auties.protobuf.model.ProtobufString type) {
        this.type = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(type);
        return this;
    }

    public NewsletterStateBuilder type(java.lang.String type) {
        this.type = type;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterState build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterState(type);
    }

}
