package it.auties.whatsapp.model.business;

public class BusinessCategoryBuilder {
    private java.lang.String id;
    private java.lang.String name;

    public BusinessCategoryBuilder() {
        id = null;
        name = null;
    }

    public BusinessCategoryBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public BusinessCategoryBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public BusinessCategoryBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public BusinessCategoryBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public it.auties.whatsapp.model.business.BusinessCategory build() {
        return new it.auties.whatsapp.model.business.BusinessCategory(id, name);
    }

}
