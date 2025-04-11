package it.auties.whatsapp.model.newsletter;

public class NewsletterViewerMetadataBuilder {
    private boolean mute;
    private it.auties.whatsapp.model.newsletter.NewsletterViewerRole role;

    public NewsletterViewerMetadataBuilder() {
        mute = false;
        role = null;
    }

    public NewsletterViewerMetadataBuilder mute(boolean mute) {
        this.mute = mute;
        return this;
    }

    public NewsletterViewerMetadataBuilder role(it.auties.whatsapp.model.newsletter.NewsletterViewerRole role) {
        this.role = role;
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata(mute, role);
    }

}
