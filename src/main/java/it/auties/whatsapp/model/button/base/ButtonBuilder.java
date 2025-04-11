package it.auties.whatsapp.model.button.base;

public class ButtonBuilder {
    private java.lang.String id;
    private java.util.Optional<it.auties.whatsapp.model.button.base.ButtonText> bodyText;
    private java.util.Optional<it.auties.whatsapp.model.info.NativeFlowInfo> bodyNativeFlow;
    private it.auties.whatsapp.model.button.base.ButtonBody.Type bodyType;

    public ButtonBuilder() {
        id = null;
        bodyText = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        bodyNativeFlow = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        bodyType = null;
    }

    public ButtonBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public ButtonBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public ButtonBuilder bodyText(it.auties.whatsapp.model.button.base.ButtonText bodyText) {
        this.bodyText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(bodyText);
        return this;
    }

    public ButtonBuilder bodyNativeFlow(it.auties.whatsapp.model.info.NativeFlowInfo bodyNativeFlow) {
        this.bodyNativeFlow = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(bodyNativeFlow);
        return this;
    }

    public ButtonBuilder bodyType(it.auties.whatsapp.model.button.base.ButtonBody.Type bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public it.auties.whatsapp.model.button.base.Button build() {
        return new it.auties.whatsapp.model.button.base.Button(id, bodyText, bodyNativeFlow, bodyType);
    }

}
