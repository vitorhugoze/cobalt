package it.auties.whatsapp.model.info;

public class NewsletterMessageInfoBuilder {
    private java.lang.String id;
    private int serverId;
    private java.lang.Long timestampSeconds;
    private java.lang.Long views;
    private java.util.Map<java.lang.String,it.auties.whatsapp.model.newsletter.NewsletterReaction> reactions;
    private it.auties.whatsapp.model.message.model.MessageContainer message;
    private it.auties.whatsapp.model.message.model.MessageStatus status;

    public NewsletterMessageInfoBuilder() {
        id = null;
        serverId = 0;
        timestampSeconds = null;
        views = null;
        reactions = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        message = null;
        status = null;
    }

    public NewsletterMessageInfoBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public NewsletterMessageInfoBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public NewsletterMessageInfoBuilder serverId(int serverId) {
        this.serverId = serverId;
        return this;
    }

    public NewsletterMessageInfoBuilder timestampSeconds(java.lang.Long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public NewsletterMessageInfoBuilder views(java.lang.Long views) {
        this.views = views;
        return this;
    }

    public NewsletterMessageInfoBuilder reactions(java.util.Map<java.lang.String,it.auties.whatsapp.model.newsletter.NewsletterReaction> reactions) {
        this.reactions = reactions;
        return this;
    }

    public NewsletterMessageInfoBuilder message(it.auties.whatsapp.model.message.model.MessageContainer message) {
        this.message = message;
        return this;
    }

    public NewsletterMessageInfoBuilder status(it.auties.whatsapp.model.message.model.MessageStatus status) {
        this.status = status;
        return this;
    }

    public it.auties.whatsapp.model.info.NewsletterMessageInfo build() {
        return new it.auties.whatsapp.model.info.NewsletterMessageInfo(id, serverId, timestampSeconds, views, reactions, message, status);
    }

}
