package it.auties.whatsapp.model.action;

public class DeleteChatActionBuilder {
    private java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange;

    public DeleteChatActionBuilder() {
        messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public DeleteChatActionBuilder messageRange(it.auties.whatsapp.model.sync.ActionMessageRangeSync messageRange) {
        this.messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(messageRange);
        return this;
    }

    public it.auties.whatsapp.model.action.DeleteChatAction build() {
        return new it.auties.whatsapp.model.action.DeleteChatAction(messageRange);
    }

}
