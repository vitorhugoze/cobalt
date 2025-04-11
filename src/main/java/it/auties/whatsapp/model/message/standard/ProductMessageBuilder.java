package it.auties.whatsapp.model.message.standard;

public class ProductMessageBuilder {
    private it.auties.whatsapp.model.product.Product product;
    private it.auties.whatsapp.model.jid.Jid businessOwnerJid;
    private it.auties.whatsapp.model.product.ProductCatalog catalog;
    private java.lang.String body;
    private java.lang.String footer;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public ProductMessageBuilder() {
        product = null;
        businessOwnerJid = null;
        catalog = null;
        body = null;
        footer = null;
        contextInfo = null;
    }

    public ProductMessageBuilder product(it.auties.whatsapp.model.product.Product product) {
        this.product = product;
        return this;
    }

    public ProductMessageBuilder businessOwnerJid(it.auties.protobuf.model.ProtobufString businessOwnerJid) {
        this.businessOwnerJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(businessOwnerJid));
        return this;
    }

    public ProductMessageBuilder businessOwnerJid(it.auties.whatsapp.model.jid.Jid businessOwnerJid) {
        this.businessOwnerJid = businessOwnerJid;
        return this;
    }

    public ProductMessageBuilder catalog(it.auties.whatsapp.model.product.ProductCatalog catalog) {
        this.catalog = catalog;
        return this;
    }

    public ProductMessageBuilder body(it.auties.protobuf.model.ProtobufString body) {
        this.body = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(body);
        return this;
    }

    public ProductMessageBuilder body(java.lang.String body) {
        this.body = body;
        return this;
    }

    public ProductMessageBuilder footer(it.auties.protobuf.model.ProtobufString footer) {
        this.footer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(footer);
        return this;
    }

    public ProductMessageBuilder footer(java.lang.String footer) {
        this.footer = footer;
        return this;
    }

    public ProductMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.ProductMessage build() {
        return new it.auties.whatsapp.model.message.standard.ProductMessage(product, businessOwnerJid, catalog, body, footer, contextInfo);
    }

}
