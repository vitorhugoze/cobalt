package it.auties.whatsapp.model.chat;

public class GroupPastParticipantsBuilder {
    private it.auties.whatsapp.model.jid.Jid groupJid;
    private java.util.List<it.auties.whatsapp.model.chat.ChatPastParticipant> pastParticipants;

    public GroupPastParticipantsBuilder() {
        groupJid = null;
        pastParticipants = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public GroupPastParticipantsBuilder groupJid(it.auties.protobuf.model.ProtobufString groupJid) {
        this.groupJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(groupJid));
        return this;
    }

    public GroupPastParticipantsBuilder groupJid(it.auties.whatsapp.model.jid.Jid groupJid) {
        this.groupJid = groupJid;
        return this;
    }

    public GroupPastParticipantsBuilder pastParticipants(java.util.List<it.auties.whatsapp.model.chat.ChatPastParticipant> pastParticipants) {
        this.pastParticipants = pastParticipants;
        return this;
    }

    public it.auties.whatsapp.model.chat.GroupPastParticipants build() {
        return new it.auties.whatsapp.model.chat.GroupPastParticipants(groupJid, pastParticipants);
    }

}
