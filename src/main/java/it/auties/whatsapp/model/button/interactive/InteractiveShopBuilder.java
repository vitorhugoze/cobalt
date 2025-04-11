package it.auties.whatsapp.model.button.interactive;

public class InteractiveShopBuilder {
    private java.lang.String id;
    private it.auties.whatsapp.model.button.interactive.InteractiveShop.SurfaceType surfaceType;
    private int version;

    public InteractiveShopBuilder() {
        id = null;
        surfaceType = null;
        version = 0;
    }

    public InteractiveShopBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public InteractiveShopBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public InteractiveShopBuilder surfaceType(it.auties.whatsapp.model.button.interactive.InteractiveShop.SurfaceType surfaceType) {
        this.surfaceType = surfaceType;
        return this;
    }

    public InteractiveShopBuilder version(int version) {
        this.version = version;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveShop build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveShop(id, surfaceType, version);
    }

}
