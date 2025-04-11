package it.auties.whatsapp.model.chat;

public class CommunityParticipantBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;

    public CommunityParticipantBuilder() {
        jid = null;
    }

    public CommunityParticipantBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public CommunityParticipantBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public it.auties.whatsapp.model.chat.CommunityParticipant build() {
        return new it.auties.whatsapp.model.chat.CommunityParticipant(jid);
    }

}
