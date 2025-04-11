package it.auties.whatsapp.model.product;

public class ProductListHeaderImageBuilder {
    private java.lang.String id;
    private byte[] thumbnail;

    public ProductListHeaderImageBuilder() {
        id = null;
        thumbnail = null;
    }

    public ProductListHeaderImageBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public ProductListHeaderImageBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public ProductListHeaderImageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public ProductListHeaderImageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public it.auties.whatsapp.model.product.ProductListHeaderImage build() {
        return new it.auties.whatsapp.model.product.ProductListHeaderImage(id, thumbnail);
    }

}
