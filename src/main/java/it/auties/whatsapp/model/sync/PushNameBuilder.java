package it.auties.whatsapp.model.sync;

public class PushNameBuilder {
    private java.lang.String id;
    private java.util.Optional<java.lang.String> name;

    public PushNameBuilder() {
        id = null;
        name = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public PushNameBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public PushNameBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public PushNameBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name));
        return this;
    }

    public PushNameBuilder name(java.lang.String name) {
        this.name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(name);
        return this;
    }

    public it.auties.whatsapp.model.sync.PushName build() {
        return new it.auties.whatsapp.model.sync.PushName(id, name);
    }

}
