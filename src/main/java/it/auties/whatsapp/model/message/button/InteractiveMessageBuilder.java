package it.auties.whatsapp.model.message.button;

public class InteractiveMessageBuilder {
    private it.auties.whatsapp.model.button.interactive.InteractiveHeader header;
    private it.auties.whatsapp.model.button.interactive.InteractiveBody body;
    private it.auties.whatsapp.model.button.interactive.InteractiveFooter footer;
    private it.auties.whatsapp.model.button.interactive.InteractiveShop contentShop;
    private it.auties.whatsapp.model.button.interactive.InteractiveCollection contentCollection;
    private it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow contentNativeFlow;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public InteractiveMessageBuilder() {
        header = null;
        body = null;
        footer = null;
        contentShop = null;
        contentCollection = null;
        contentNativeFlow = null;
        contextInfo = null;
    }

    public InteractiveMessageBuilder header(it.auties.whatsapp.model.button.interactive.InteractiveHeader header) {
        this.header = header;
        return this;
    }

    public InteractiveMessageBuilder body(it.auties.whatsapp.model.button.interactive.InteractiveBody body) {
        this.body = body;
        return this;
    }

    public InteractiveMessageBuilder footer(it.auties.whatsapp.model.button.interactive.InteractiveFooter footer) {
        this.footer = footer;
        return this;
    }

    public InteractiveMessageBuilder contentShop(it.auties.whatsapp.model.button.interactive.InteractiveShop contentShop) {
        this.contentShop = contentShop;
        return this;
    }

    public InteractiveMessageBuilder contentCollection(it.auties.whatsapp.model.button.interactive.InteractiveCollection contentCollection) {
        this.contentCollection = contentCollection;
        return this;
    }

    public InteractiveMessageBuilder contentNativeFlow(it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow contentNativeFlow) {
        this.contentNativeFlow = contentNativeFlow;
        return this;
    }

    public InteractiveMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.button.InteractiveMessage build() {
        return new it.auties.whatsapp.model.message.button.InteractiveMessage(header, body, footer, contentShop, contentCollection, contentNativeFlow, contextInfo);
    }

}
