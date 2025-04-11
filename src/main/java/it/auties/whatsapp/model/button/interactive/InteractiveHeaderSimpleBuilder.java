package it.auties.whatsapp.model.button.interactive;

public class InteractiveHeaderSimpleBuilder {
    private java.lang.String title;
    private java.lang.String subtitle;
    private it.auties.whatsapp.model.button.interactive.InteractiveHeaderAttachment attachment;

    public InteractiveHeaderSimpleBuilder() {
    }

    public InteractiveHeaderSimpleBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public InteractiveHeaderSimpleBuilder subtitle(java.lang.String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public InteractiveHeaderSimpleBuilder attachment(it.auties.whatsapp.model.button.interactive.InteractiveHeaderAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveHeader build() {
        return it.auties.whatsapp.model.button.interactive.InteractiveHeader.simpleBuilder(title, subtitle, attachment);
    }

}
