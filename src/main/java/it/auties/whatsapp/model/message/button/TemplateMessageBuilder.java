package it.auties.whatsapp.model.message.button;

public class TemplateMessageBuilder {
    private java.lang.String id;
    private it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate content;
    private it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate highlyStructuredFourRowTemplateFormat;
    private it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate hydratedFourRowTemplateFormat;
    private it.auties.whatsapp.model.message.button.InteractiveMessage interactiveMessageFormat;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public TemplateMessageBuilder() {
        id = null;
        content = null;
        highlyStructuredFourRowTemplateFormat = null;
        hydratedFourRowTemplateFormat = null;
        interactiveMessageFormat = null;
        contextInfo = null;
    }

    public TemplateMessageBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public TemplateMessageBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public TemplateMessageBuilder content(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate content) {
        this.content = content;
        return this;
    }

    public TemplateMessageBuilder highlyStructuredFourRowTemplateFormat(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate highlyStructuredFourRowTemplateFormat) {
        this.highlyStructuredFourRowTemplateFormat = highlyStructuredFourRowTemplateFormat;
        return this;
    }

    public TemplateMessageBuilder hydratedFourRowTemplateFormat(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate hydratedFourRowTemplateFormat) {
        this.hydratedFourRowTemplateFormat = hydratedFourRowTemplateFormat;
        return this;
    }

    public TemplateMessageBuilder interactiveMessageFormat(it.auties.whatsapp.model.message.button.InteractiveMessage interactiveMessageFormat) {
        this.interactiveMessageFormat = interactiveMessageFormat;
        return this;
    }

    public TemplateMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.button.TemplateMessage build() {
        return new it.auties.whatsapp.model.message.button.TemplateMessage(id, content, highlyStructuredFourRowTemplateFormat, hydratedFourRowTemplateFormat, interactiveMessageFormat, contextInfo);
    }

}
