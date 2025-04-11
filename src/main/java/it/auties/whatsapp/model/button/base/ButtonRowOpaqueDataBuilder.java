package it.auties.whatsapp.model.button.base;

public class ButtonRowOpaqueDataBuilder {
    private java.util.Optional<it.auties.whatsapp.model.button.base.ButtonOpaqueData> currentMessage;
    private java.util.Optional<it.auties.whatsapp.model.button.base.ButtonOpaqueData> quotedMessage;

    public ButtonRowOpaqueDataBuilder() {
        currentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        quotedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ButtonRowOpaqueDataBuilder currentMessage(it.auties.whatsapp.model.button.base.ButtonOpaqueData currentMessage) {
        this.currentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(currentMessage);
        return this;
    }

    public ButtonRowOpaqueDataBuilder quotedMessage(it.auties.whatsapp.model.button.base.ButtonOpaqueData quotedMessage) {
        this.quotedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(quotedMessage);
        return this;
    }

    public it.auties.whatsapp.model.button.base.ButtonRowOpaqueData build() {
        return new it.auties.whatsapp.model.button.base.ButtonRowOpaqueData(currentMessage, quotedMessage);
    }

}
