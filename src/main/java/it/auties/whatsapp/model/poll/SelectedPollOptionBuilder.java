package it.auties.whatsapp.model.poll;

public class SelectedPollOptionBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private java.lang.String name;

    public SelectedPollOptionBuilder() {
        jid = null;
        name = null;
    }

    public SelectedPollOptionBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public SelectedPollOptionBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public SelectedPollOptionBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public SelectedPollOptionBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public it.auties.whatsapp.model.poll.SelectedPollOption build() {
        return new it.auties.whatsapp.model.poll.SelectedPollOption(jid, name);
    }

}
