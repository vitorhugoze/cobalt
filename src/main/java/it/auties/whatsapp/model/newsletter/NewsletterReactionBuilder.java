package it.auties.whatsapp.model.newsletter;

public class NewsletterReactionBuilder {
    private java.lang.String content;
    private long count;
    private boolean fromMe;

    public NewsletterReactionBuilder() {
        content = null;
        count = 0l;
        fromMe = false;
    }

    public NewsletterReactionBuilder content(it.auties.protobuf.model.ProtobufString content) {
        this.content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(content);
        return this;
    }

    public NewsletterReactionBuilder content(java.lang.String content) {
        this.content = content;
        return this;
    }

    public NewsletterReactionBuilder count(long count) {
        this.count = count;
        return this;
    }

    public NewsletterReactionBuilder fromMe(boolean fromMe) {
        this.fromMe = fromMe;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterReaction build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterReaction(content, count, fromMe);
    }

}
