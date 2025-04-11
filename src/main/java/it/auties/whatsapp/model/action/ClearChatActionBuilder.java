package it.auties.whatsapp.model.action;

public class ClearChatActionBuilder {
    private java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange;

    public ClearChatActionBuilder() {
        messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ClearChatActionBuilder messageRange(it.auties.whatsapp.model.sync.ActionMessageRangeSync messageRange) {
        this.messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(messageRange);
        return this;
    }

    public it.auties.whatsapp.model.action.ClearChatAction build() {
        return new it.auties.whatsapp.model.action.ClearChatAction(messageRange);
    }

}
