package it.auties.whatsapp.model.product;

public class ProductSectionBuilder {
    private java.lang.String title;
    private java.util.List<it.auties.whatsapp.model.product.ProductSectionEntry> products;

    public ProductSectionBuilder() {
        title = null;
        products = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public ProductSectionBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public ProductSectionBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public ProductSectionBuilder products(java.util.List<it.auties.whatsapp.model.product.ProductSectionEntry> products) {
        this.products = products;
        return this;
    }

    public it.auties.whatsapp.model.product.ProductSection build() {
        return new it.auties.whatsapp.model.product.ProductSection(title, products);
    }

}
