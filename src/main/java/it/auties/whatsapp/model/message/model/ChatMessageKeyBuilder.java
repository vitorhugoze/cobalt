package it.auties.whatsapp.model.message.model;

public class ChatMessageKeyBuilder {
    private it.auties.whatsapp.model.jid.Jid chatJid;
    private boolean fromMe;
    private java.lang.String id;
    private it.auties.whatsapp.model.jid.Jid senderJid;

    public ChatMessageKeyBuilder() {
        chatJid = null;
        fromMe = false;
        id = null;
        senderJid = null;
    }

    public ChatMessageKeyBuilder chatJid(it.auties.protobuf.model.ProtobufString chatJid) {
        this.chatJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(chatJid));
        return this;
    }

    public ChatMessageKeyBuilder chatJid(it.auties.whatsapp.model.jid.Jid chatJid) {
        this.chatJid = chatJid;
        return this;
    }

    public ChatMessageKeyBuilder fromMe(boolean fromMe) {
        this.fromMe = fromMe;
        return this;
    }

    public ChatMessageKeyBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public ChatMessageKeyBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public ChatMessageKeyBuilder senderJid(it.auties.protobuf.model.ProtobufString senderJid) {
        this.senderJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(senderJid));
        return this;
    }

    public ChatMessageKeyBuilder senderJid(it.auties.whatsapp.model.jid.Jid senderJid) {
        this.senderJid = senderJid;
        return this;
    }

    public it.auties.whatsapp.model.message.model.ChatMessageKey build() {
        return new it.auties.whatsapp.model.message.model.ChatMessageKey(chatJid, fromMe, id, senderJid);
    }

}
