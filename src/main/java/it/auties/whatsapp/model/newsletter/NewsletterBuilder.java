package it.auties.whatsapp.model.newsletter;

public class NewsletterBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private it.auties.whatsapp.model.newsletter.NewsletterState state;
    private it.auties.whatsapp.model.newsletter.NewsletterMetadata metadata;
    private it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata viewerMetadata;
    private it.auties.whatsapp.util.ConcurrentLinkedSet<it.auties.whatsapp.model.info.NewsletterMessageInfo> messages;

    public NewsletterBuilder() {
        jid = null;
        state = null;
        metadata = null;
        viewerMetadata = null;
        messages = new it.auties.whatsapp.util.ConcurrentLinkedSet();
    }

    public NewsletterBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public NewsletterBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public NewsletterBuilder state(it.auties.whatsapp.model.newsletter.NewsletterState state) {
        this.state = state;
        return this;
    }

    public NewsletterBuilder metadata(it.auties.whatsapp.model.newsletter.NewsletterMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public NewsletterBuilder viewerMetadata(it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata viewerMetadata) {
        this.viewerMetadata = viewerMetadata;
        return this;
    }

    public NewsletterBuilder messages(it.auties.whatsapp.util.ConcurrentLinkedSet<it.auties.whatsapp.model.info.NewsletterMessageInfo> messages) {
        this.messages = messages;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.Newsletter build() {
        return new it.auties.whatsapp.model.newsletter.Newsletter(jid, state, metadata, viewerMetadata, messages);
    }

}
