package it.auties.whatsapp.model.button.interactive;

public class InteractiveNativeFlowBuilder {
    private java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveButton> buttons;
    private java.lang.String parameters;
    private int version;

    public InteractiveNativeFlowBuilder() {
        buttons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        parameters = null;
        version = 0;
    }

    public InteractiveNativeFlowBuilder buttons(java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    public InteractiveNativeFlowBuilder parameters(it.auties.protobuf.model.ProtobufString parameters) {
        this.parameters = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(parameters);
        return this;
    }

    public InteractiveNativeFlowBuilder parameters(java.lang.String parameters) {
        this.parameters = parameters;
        return this;
    }

    public InteractiveNativeFlowBuilder version(int version) {
        this.version = version;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow(buttons, parameters, version);
    }

}
