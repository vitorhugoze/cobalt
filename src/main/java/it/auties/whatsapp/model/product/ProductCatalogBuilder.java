package it.auties.whatsapp.model.product;

public class ProductCatalogBuilder {
    private it.auties.whatsapp.model.message.standard.ImageMessage catalogImage;
    private java.lang.String title;
    private java.lang.String description;

    public ProductCatalogBuilder() {
        catalogImage = null;
        title = null;
        description = null;
    }

    public ProductCatalogBuilder catalogImage(it.auties.whatsapp.model.message.standard.ImageMessage catalogImage) {
        this.catalogImage = catalogImage;
        return this;
    }

    public ProductCatalogBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public ProductCatalogBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public ProductCatalogBuilder description(it.auties.protobuf.model.ProtobufString description) {
        this.description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(description);
        return this;
    }

    public ProductCatalogBuilder description(java.lang.String description) {
        this.description = description;
        return this;
    }

    public it.auties.whatsapp.model.product.ProductCatalog build() {
        return new it.auties.whatsapp.model.product.ProductCatalog(catalogImage, title, description);
    }

}
