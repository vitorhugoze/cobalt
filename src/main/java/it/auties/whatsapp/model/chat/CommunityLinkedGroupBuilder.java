package it.auties.whatsapp.model.chat;

public class CommunityLinkedGroupBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private java.lang.Integer participants;

    public CommunityLinkedGroupBuilder() {
        jid = null;
        participants = null;
    }

    public CommunityLinkedGroupBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public CommunityLinkedGroupBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public CommunityLinkedGroupBuilder participants(java.lang.Integer participants) {
        this.participants = participants;
        return this;
    }

    public it.auties.whatsapp.model.chat.CommunityLinkedGroup build() {
        return new it.auties.whatsapp.model.chat.CommunityLinkedGroup(jid, participants);
    }

}
