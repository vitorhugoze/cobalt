package it.auties.whatsapp.model.message.button;

public class InteractiveResponseMessageBuilder {
    private it.auties.whatsapp.model.button.interactive.InteractiveBody body;
    private it.auties.whatsapp.model.message.button.NativeFlowResponseMessage nativeFlowResponseMessage;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public InteractiveResponseMessageBuilder() {
        body = null;
        nativeFlowResponseMessage = null;
        contextInfo = null;
    }

    public InteractiveResponseMessageBuilder body(it.auties.whatsapp.model.button.interactive.InteractiveBody body) {
        this.body = body;
        return this;
    }

    public InteractiveResponseMessageBuilder nativeFlowResponseMessage(it.auties.whatsapp.model.message.button.NativeFlowResponseMessage nativeFlowResponseMessage) {
        this.nativeFlowResponseMessage = nativeFlowResponseMessage;
        return this;
    }

    public InteractiveResponseMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.button.InteractiveResponseMessage build() {
        return new it.auties.whatsapp.model.message.button.InteractiveResponseMessage(body, nativeFlowResponseMessage, contextInfo);
    }

}
