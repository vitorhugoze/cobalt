package it.auties.whatsapp.model.action;

public class MarkChatAsReadActionBuilder {
    private boolean read;
    private java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange;

    public MarkChatAsReadActionBuilder() {
        read = false;
        messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public MarkChatAsReadActionBuilder read(boolean read) {
        this.read = read;
        return this;
    }

    public MarkChatAsReadActionBuilder messageRange(it.auties.whatsapp.model.sync.ActionMessageRangeSync messageRange) {
        this.messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(messageRange);
        return this;
    }

    public it.auties.whatsapp.model.action.MarkChatAsReadAction build() {
        return new it.auties.whatsapp.model.action.MarkChatAsReadAction(read, messageRange);
    }

}
