package it.auties.whatsapp.model.action;

public class ContactActionBuilder {
    private java.util.Optional<java.lang.String> fullName;
    private java.util.Optional<java.lang.String> firstName;
    private java.util.Optional<java.lang.String> lidJid;

    public ContactActionBuilder() {
        fullName = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        firstName = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        lidJid = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ContactActionBuilder fullName(it.auties.protobuf.model.ProtobufString fullName) {
        this.fullName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fullName));
        return this;
    }

    public ContactActionBuilder fullName(java.lang.String fullName) {
        this.fullName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(fullName);
        return this;
    }

    public ContactActionBuilder firstName(it.auties.protobuf.model.ProtobufString firstName) {
        this.firstName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(firstName));
        return this;
    }

    public ContactActionBuilder firstName(java.lang.String firstName) {
        this.firstName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(firstName);
        return this;
    }

    public ContactActionBuilder lidJid(it.auties.protobuf.model.ProtobufString lidJid) {
        this.lidJid = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(lidJid));
        return this;
    }

    public ContactActionBuilder lidJid(java.lang.String lidJid) {
        this.lidJid = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(lidJid);
        return this;
    }

    public it.auties.whatsapp.model.action.ContactAction build() {
        return new it.auties.whatsapp.model.action.ContactAction(fullName, firstName, lidJid);
    }

}
