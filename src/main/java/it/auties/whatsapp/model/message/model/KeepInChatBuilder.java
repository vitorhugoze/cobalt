package it.auties.whatsapp.model.message.model;

public class KeepInChatBuilder {
    private it.auties.whatsapp.model.message.model.KeepInChatType keepType;
    private long serverTimestampSeconds;
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;
    private it.auties.whatsapp.model.jid.Jid deviceJid;
    private long clientTimestampInMilliseconds;
    private long serverTimestampMilliseconds;

    public KeepInChatBuilder() {
        keepType = null;
        serverTimestampSeconds = 0l;
        key = null;
        deviceJid = null;
        clientTimestampInMilliseconds = 0l;
        serverTimestampMilliseconds = 0l;
    }

    public KeepInChatBuilder keepType(it.auties.whatsapp.model.message.model.KeepInChatType keepType) {
        this.keepType = keepType;
        return this;
    }

    public KeepInChatBuilder serverTimestampSeconds(long serverTimestampSeconds) {
        this.serverTimestampSeconds = serverTimestampSeconds;
        return this;
    }

    public KeepInChatBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public KeepInChatBuilder deviceJid(it.auties.protobuf.model.ProtobufString deviceJid) {
        this.deviceJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(deviceJid));
        return this;
    }

    public KeepInChatBuilder deviceJid(it.auties.whatsapp.model.jid.Jid deviceJid) {
        this.deviceJid = deviceJid;
        return this;
    }

    public KeepInChatBuilder clientTimestampInMilliseconds(long clientTimestampInMilliseconds) {
        this.clientTimestampInMilliseconds = clientTimestampInMilliseconds;
        return this;
    }

    public KeepInChatBuilder serverTimestampMilliseconds(long serverTimestampMilliseconds) {
        this.serverTimestampMilliseconds = serverTimestampMilliseconds;
        return this;
    }

    public it.auties.whatsapp.model.message.model.KeepInChat build() {
        return new it.auties.whatsapp.model.message.model.KeepInChat(keepType, serverTimestampSeconds, key, deviceJid, clientTimestampInMilliseconds, serverTimestampMilliseconds);
    }

}
