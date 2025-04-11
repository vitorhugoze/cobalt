package it.auties.whatsapp.model.message.server;

public class DeviceSentMessageBuilder {
    private it.auties.whatsapp.model.jid.Jid destinationJid;
    private it.auties.whatsapp.model.message.model.MessageContainer message;
    private java.util.Optional<java.lang.String> phash;

    public DeviceSentMessageBuilder() {
        destinationJid = null;
        message = null;
        phash = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public DeviceSentMessageBuilder destinationJid(it.auties.protobuf.model.ProtobufString destinationJid) {
        this.destinationJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(destinationJid));
        return this;
    }

    public DeviceSentMessageBuilder destinationJid(it.auties.whatsapp.model.jid.Jid destinationJid) {
        this.destinationJid = destinationJid;
        return this;
    }

    public DeviceSentMessageBuilder message(it.auties.whatsapp.model.message.model.MessageContainer message) {
        this.message = message;
        return this;
    }

    public DeviceSentMessageBuilder phash(it.auties.protobuf.model.ProtobufString phash) {
        this.phash = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(phash));
        return this;
    }

    public DeviceSentMessageBuilder phash(java.lang.String phash) {
        this.phash = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(phash);
        return this;
    }

    public it.auties.whatsapp.model.message.server.DeviceSentMessage build() {
        return new it.auties.whatsapp.model.message.server.DeviceSentMessage(destinationJid, message, phash);
    }

}
