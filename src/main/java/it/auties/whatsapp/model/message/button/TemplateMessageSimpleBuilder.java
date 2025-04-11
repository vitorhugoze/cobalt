package it.auties.whatsapp.model.message.button;

public class TemplateMessageSimpleBuilder {
    private java.lang.String id;
    private it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate content;
    private it.auties.whatsapp.model.button.template.TemplateFormatter format;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public TemplateMessageSimpleBuilder() {
    }

    public TemplateMessageSimpleBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public TemplateMessageSimpleBuilder content(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate content) {
        this.content = content;
        return this;
    }

    public TemplateMessageSimpleBuilder format(it.auties.whatsapp.model.button.template.TemplateFormatter format) {
        this.format = format;
        return this;
    }

    public TemplateMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.button.TemplateMessage build() {
        return it.auties.whatsapp.model.message.button.TemplateMessage.customBuilder(id, content, format, contextInfo);
    }

}
