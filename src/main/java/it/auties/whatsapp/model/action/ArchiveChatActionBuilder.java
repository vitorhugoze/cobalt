package it.auties.whatsapp.model.action;

public class ArchiveChatActionBuilder {
    private boolean archived;
    private java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange;

    public ArchiveChatActionBuilder() {
        archived = false;
        messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ArchiveChatActionBuilder archived(boolean archived) {
        this.archived = archived;
        return this;
    }

    public ArchiveChatActionBuilder messageRange(it.auties.whatsapp.model.sync.ActionMessageRangeSync messageRange) {
        this.messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(messageRange);
        return this;
    }

    public it.auties.whatsapp.model.action.ArchiveChatAction build() {
        return new it.auties.whatsapp.model.action.ArchiveChatAction(archived, messageRange);
    }

}
