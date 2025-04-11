package it.auties.whatsapp.model.chat;

public class GroupParticipantBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private it.auties.whatsapp.model.chat.GroupRole role;

    public GroupParticipantBuilder() {
        jid = null;
        role = null;
    }

    public GroupParticipantBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public GroupParticipantBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public GroupParticipantBuilder role(it.auties.whatsapp.model.chat.GroupRole role) {
        this.role = role;
        return this;
    }

    public it.auties.whatsapp.model.chat.GroupParticipant build() {
        return new it.auties.whatsapp.model.chat.GroupParticipant(jid, role);
    }

}
