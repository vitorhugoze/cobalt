package it.auties.whatsapp.model.message.button;

public class NativeFlowResponseMessageBuilder {
    private java.lang.String name;
    private java.lang.String paramsJson;
    private int version;

    public NativeFlowResponseMessageBuilder() {
        name = null;
        paramsJson = null;
        version = 0;
    }

    public NativeFlowResponseMessageBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public NativeFlowResponseMessageBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public NativeFlowResponseMessageBuilder paramsJson(it.auties.protobuf.model.ProtobufString paramsJson) {
        this.paramsJson = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(paramsJson);
        return this;
    }

    public NativeFlowResponseMessageBuilder paramsJson(java.lang.String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }

    public NativeFlowResponseMessageBuilder version(int version) {
        this.version = version;
        return this;
    }

    public it.auties.whatsapp.model.message.button.NativeFlowResponseMessage build() {
        return new it.auties.whatsapp.model.message.button.NativeFlowResponseMessage(name, paramsJson, version);
    }

}
