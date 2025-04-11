package it.auties.whatsapp.model.message.button;

public class ButtonsResponseMessageBuilder {
    private java.lang.String buttonId;
    private java.lang.String buttonText;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private it.auties.whatsapp.model.message.button.ButtonsResponseMessage.ResponseType responseType;

    public ButtonsResponseMessageBuilder() {
        buttonId = null;
        buttonText = null;
        contextInfo = null;
        responseType = null;
    }

    public ButtonsResponseMessageBuilder buttonId(it.auties.protobuf.model.ProtobufString buttonId) {
        this.buttonId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(buttonId);
        return this;
    }

    public ButtonsResponseMessageBuilder buttonId(java.lang.String buttonId) {
        this.buttonId = buttonId;
        return this;
    }

    public ButtonsResponseMessageBuilder buttonText(it.auties.protobuf.model.ProtobufString buttonText) {
        this.buttonText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(buttonText);
        return this;
    }

    public ButtonsResponseMessageBuilder buttonText(java.lang.String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public ButtonsResponseMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public ButtonsResponseMessageBuilder responseType(it.auties.whatsapp.model.message.button.ButtonsResponseMessage.ResponseType responseType) {
        this.responseType = responseType;
        return this;
    }

    public it.auties.whatsapp.model.message.button.ButtonsResponseMessage build() {
        return new it.auties.whatsapp.model.message.button.ButtonsResponseMessage(buttonId, buttonText, contextInfo, responseType);
    }

}
