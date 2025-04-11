package it.auties.whatsapp.model.poll;

public class PollOptionBuilder {
    private java.lang.String name;

    public PollOptionBuilder() {
        name = null;
    }

    public PollOptionBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public PollOptionBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public it.auties.whatsapp.model.poll.PollOption build() {
        return new it.auties.whatsapp.model.poll.PollOption(name);
    }

}
