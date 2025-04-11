package it.auties.whatsapp.model.product;

public class ProductSectionEntryBuilder {
    private java.lang.String id;

    public ProductSectionEntryBuilder() {
        id = null;
    }

    public ProductSectionEntryBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public ProductSectionEntryBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public it.auties.whatsapp.model.product.ProductSectionEntry build() {
        return new it.auties.whatsapp.model.product.ProductSectionEntry(id);
    }

}
