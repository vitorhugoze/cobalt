package it.auties.whatsapp.model.action;

public class ChatAssignmentActionBuilder {
    private java.util.Optional<java.lang.String> deviceAgentId;

    public ChatAssignmentActionBuilder() {
        deviceAgentId = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ChatAssignmentActionBuilder deviceAgentId(it.auties.protobuf.model.ProtobufString deviceAgentId) {
        this.deviceAgentId = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(deviceAgentId));
        return this;
    }

    public ChatAssignmentActionBuilder deviceAgentId(java.lang.String deviceAgentId) {
        this.deviceAgentId = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(deviceAgentId);
        return this;
    }

    public it.auties.whatsapp.model.action.ChatAssignmentAction build() {
        return new it.auties.whatsapp.model.action.ChatAssignmentAction(deviceAgentId);
    }

}
