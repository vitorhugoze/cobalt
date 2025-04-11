package it.auties.whatsapp.model.message.button;

public class InteractiveMessageSimpleBuilder {
    private it.auties.whatsapp.model.button.interactive.InteractiveHeader header;
    private java.lang.String body;
    private java.lang.String footer;
    private it.auties.whatsapp.model.message.button.InteractiveMessageContent content;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public InteractiveMessageSimpleBuilder() {
    }

    public InteractiveMessageSimpleBuilder header(it.auties.whatsapp.model.button.interactive.InteractiveHeader header) {
        this.header = header;
        return this;
    }

    public InteractiveMessageSimpleBuilder body(java.lang.String body) {
        this.body = body;
        return this;
    }

    public InteractiveMessageSimpleBuilder footer(java.lang.String footer) {
        this.footer = footer;
        return this;
    }

    public InteractiveMessageSimpleBuilder content(it.auties.whatsapp.model.message.button.InteractiveMessageContent content) {
        this.content = content;
        return this;
    }

    public InteractiveMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.button.InteractiveMessage build() {
        return it.auties.whatsapp.model.message.button.InteractiveMessage.simpleBuilder(header, body, footer, content, contextInfo);
    }

}
