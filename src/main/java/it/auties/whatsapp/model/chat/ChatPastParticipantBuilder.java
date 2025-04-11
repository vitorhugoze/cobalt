package it.auties.whatsapp.model.chat;

public class ChatPastParticipantBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private it.auties.whatsapp.model.chat.ChatPastParticipant.Reason reason;
    private long timestampSeconds;

    public ChatPastParticipantBuilder() {
        jid = null;
        reason = null;
        timestampSeconds = 0l;
    }

    public ChatPastParticipantBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public ChatPastParticipantBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public ChatPastParticipantBuilder reason(it.auties.whatsapp.model.chat.ChatPastParticipant.Reason reason) {
        this.reason = reason;
        return this;
    }

    public ChatPastParticipantBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.chat.ChatPastParticipant build() {
        return new it.auties.whatsapp.model.chat.ChatPastParticipant(jid, reason, timestampSeconds);
    }

}
