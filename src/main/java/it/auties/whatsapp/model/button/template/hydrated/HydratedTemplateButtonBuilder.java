package it.auties.whatsapp.model.button.template.hydrated;

public class HydratedTemplateButtonBuilder {
    private it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButton quickReplyButton;
    private it.auties.whatsapp.model.button.template.hydrated.HydratedURLButton urlButton;
    private it.auties.whatsapp.model.button.template.hydrated.HydratedCallButton callButton;
    private int index;

    public HydratedTemplateButtonBuilder() {
        quickReplyButton = null;
        urlButton = null;
        callButton = null;
        index = 0;
    }

    public HydratedTemplateButtonBuilder quickReplyButton(it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButton quickReplyButton) {
        this.quickReplyButton = quickReplyButton;
        return this;
    }

    public HydratedTemplateButtonBuilder urlButton(it.auties.whatsapp.model.button.template.hydrated.HydratedURLButton urlButton) {
        this.urlButton = urlButton;
        return this;
    }

    public HydratedTemplateButtonBuilder callButton(it.auties.whatsapp.model.button.template.hydrated.HydratedCallButton callButton) {
        this.callButton = callButton;
        return this;
    }

    public HydratedTemplateButtonBuilder index(int index) {
        this.index = index;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton build() {
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton(quickReplyButton, urlButton, callButton, index);
    }

}
