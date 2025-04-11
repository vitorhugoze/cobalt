package it.auties.whatsapp.model.sync;

public class MutationsSyncBuilder {
    private java.util.List<it.auties.whatsapp.model.sync.MutationSync> mutations;

    public MutationsSyncBuilder() {
        mutations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public MutationsSyncBuilder mutations(java.util.List<it.auties.whatsapp.model.sync.MutationSync> mutations) {
        this.mutations = mutations;
        return this;
    }

    public it.auties.whatsapp.model.sync.MutationsSync build() {
        return new it.auties.whatsapp.model.sync.MutationsSync(mutations);
    }

}
