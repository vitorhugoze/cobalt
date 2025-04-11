package it.auties.whatsapp.model.action;

public class PrimaryVersionActionBuilder {
    private java.lang.String version;

    public PrimaryVersionActionBuilder() {
        version = null;
    }

    public PrimaryVersionActionBuilder version(it.auties.protobuf.model.ProtobufString version) {
        this.version = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(version);
        return this;
    }

    public PrimaryVersionActionBuilder version(java.lang.String version) {
        this.version = version;
        return this;
    }

    public it.auties.whatsapp.model.action.PrimaryVersionAction build() {
        return new it.auties.whatsapp.model.action.PrimaryVersionAction(version);
    }

}
