package it.auties.whatsapp.model.sync;

public class PrimaryFeatureBuilder {
    private java.util.List<java.lang.String> flags;

    public PrimaryFeatureBuilder() {
        flags = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public PrimaryFeatureBuilder flags(java.util.List<java.lang.String> flags) {
        this.flags = flags;
        return this;
    }

    public it.auties.whatsapp.model.sync.PrimaryFeature build() {
        return new it.auties.whatsapp.model.sync.PrimaryFeature(flags);
    }

}
