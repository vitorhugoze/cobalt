package it.auties.whatsapp.model.message.button;

public class ButtonsMessageSimpleBuilder {
    private it.auties.whatsapp.model.message.button.ButtonsMessageHeader header;
    private java.lang.String body;
    private java.lang.String footer;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.util.List<it.auties.whatsapp.model.button.base.Button> buttons;

    public ButtonsMessageSimpleBuilder() {
    }

    public ButtonsMessageSimpleBuilder header(it.auties.whatsapp.model.message.button.ButtonsMessageHeader header) {
        this.header = header;
        return this;
    }

    public ButtonsMessageSimpleBuilder body(java.lang.String body) {
        this.body = body;
        return this;
    }

    public ButtonsMessageSimpleBuilder footer(java.lang.String footer) {
        this.footer = footer;
        return this;
    }

    public ButtonsMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public ButtonsMessageSimpleBuilder buttons(java.util.List<it.auties.whatsapp.model.button.base.Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public it.auties.whatsapp.model.message.button.ButtonsMessage build() {
        return it.auties.whatsapp.model.message.button.ButtonsMessage.customBuilder(header, body, footer, contextInfo, buttons);
    }

}
