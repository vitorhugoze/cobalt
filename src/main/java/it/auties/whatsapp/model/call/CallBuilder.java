package it.auties.whatsapp.model.call;

public class CallBuilder {
    private it.auties.whatsapp.model.jid.Jid chat;
    private it.auties.whatsapp.model.jid.Jid caller;
    private java.lang.String id;
    private long timestampSeconds;
    private boolean video;
    private it.auties.whatsapp.model.call.CallStatus status;
    private boolean offline;

    public CallBuilder() {
        chat = null;
        caller = null;
        id = null;
        timestampSeconds = 0l;
        video = false;
        status = null;
        offline = false;
    }

    public CallBuilder chat(it.auties.protobuf.model.ProtobufString chat) {
        this.chat = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(chat));
        return this;
    }

    public CallBuilder chat(it.auties.whatsapp.model.jid.Jid chat) {
        this.chat = chat;
        return this;
    }

    public CallBuilder caller(it.auties.protobuf.model.ProtobufString caller) {
        this.caller = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caller));
        return this;
    }

    public CallBuilder caller(it.auties.whatsapp.model.jid.Jid caller) {
        this.caller = caller;
        return this;
    }

    public CallBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public CallBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public CallBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public CallBuilder video(boolean video) {
        this.video = video;
        return this;
    }

    public CallBuilder status(it.auties.whatsapp.model.call.CallStatus status) {
        this.status = status;
        return this;
    }

    public CallBuilder offline(boolean offline) {
        this.offline = offline;
        return this;
    }

    public it.auties.whatsapp.model.call.Call build() {
        return new it.auties.whatsapp.model.call.Call(chat, caller, id, timestampSeconds, video, status, offline);
    }

}
