package it.auties.whatsapp.model.button.interactive;

public class InteractiveButtonBuilder {
    private java.lang.String name;
    private java.util.Optional<java.lang.String> parameters;

    public InteractiveButtonBuilder() {
        name = null;
        parameters = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public InteractiveButtonBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public InteractiveButtonBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public InteractiveButtonBuilder parameters(it.auties.protobuf.model.ProtobufString parameters) {
        this.parameters = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(parameters));
        return this;
    }

    public InteractiveButtonBuilder parameters(java.lang.String parameters) {
        this.parameters = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(parameters);
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveButton build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveButton(name, parameters);
    }

}
