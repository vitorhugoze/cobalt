package it.auties.whatsapp.model.action;

public class AgentActionBuilder {
    private java.util.Optional<java.lang.String> name;
    private int deviceId;
    private boolean deleted;

    public AgentActionBuilder() {
        name = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        deviceId = 0;
        deleted = false;
    }

    public AgentActionBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name));
        return this;
    }

    public AgentActionBuilder name(java.lang.String name) {
        this.name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(name);
        return this;
    }

    public AgentActionBuilder deviceId(int deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public AgentActionBuilder deleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public it.auties.whatsapp.model.action.AgentAction build() {
        return new it.auties.whatsapp.model.action.AgentAction(name, deviceId, deleted);
    }

}
