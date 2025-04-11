package it.auties.whatsapp.model.button.interactive;

public class InteractiveCollectionBuilder {
    private it.auties.whatsapp.model.jid.Jid business;
    private java.lang.String id;
    private int version;

    public InteractiveCollectionBuilder() {
        business = null;
        id = null;
        version = 0;
    }

    public InteractiveCollectionBuilder business(it.auties.protobuf.model.ProtobufString business) {
        this.business = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(business));
        return this;
    }

    public InteractiveCollectionBuilder business(it.auties.whatsapp.model.jid.Jid business) {
        this.business = business;
        return this;
    }

    public InteractiveCollectionBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public InteractiveCollectionBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public InteractiveCollectionBuilder version(int version) {
        this.version = version;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveCollection build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveCollection(business, id, version);
    }

}
