package it.auties.whatsapp.model.message.button;

public class ListResponseMessageBuilder {
    private java.lang.String title;
    private it.auties.whatsapp.model.message.button.ListResponseMessage.Type listType;
    private it.auties.whatsapp.model.button.base.SingleSelectReplyButton reply;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.lang.String description;

    public ListResponseMessageBuilder() {
        title = null;
        listType = null;
        reply = null;
        contextInfo = null;
        description = null;
    }

    public ListResponseMessageBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public ListResponseMessageBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public ListResponseMessageBuilder listType(it.auties.whatsapp.model.message.button.ListResponseMessage.Type listType) {
        this.listType = listType;
        return this;
    }

    public ListResponseMessageBuilder reply(it.auties.whatsapp.model.button.base.SingleSelectReplyButton reply) {
        this.reply = reply;
        return this;
    }

    public ListResponseMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public ListResponseMessageBuilder description(it.auties.protobuf.model.ProtobufString description) {
        this.description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(description);
        return this;
    }

    public ListResponseMessageBuilder description(java.lang.String description) {
        this.description = description;
        return this;
    }

    public it.auties.whatsapp.model.message.button.ListResponseMessage build() {
        return new it.auties.whatsapp.model.message.button.ListResponseMessage(title, listType, reply, contextInfo, description);
    }

}
