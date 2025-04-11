package it.auties.whatsapp.model.newsletter;

public class NewsletterSettingsBuilder {
    private it.auties.whatsapp.model.newsletter.NewsletterReactionSettings reactionCodes;

    public NewsletterSettingsBuilder() {
        reactionCodes = null;
    }

    public NewsletterSettingsBuilder reactionCodes(it.auties.whatsapp.model.newsletter.NewsletterReactionSettings reactionCodes) {
        this.reactionCodes = reactionCodes;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterSettings build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterSettings(reactionCodes);
    }

}
