package it.auties.whatsapp.model.payment;

public class PaymentBackgroundBuilder {
    private java.lang.String id;
    private long mediaSize;
    private int width;
    private int height;
    private java.lang.String mimetype;
    private int placeholderArgb;
    private int textArgb;
    private int subtextArgb;
    private java.util.Optional<it.auties.whatsapp.model.payment.PaymentMediaData> mediaData;
    private it.auties.whatsapp.model.payment.PaymentBackground.PaymentBackgroundType type;

    public PaymentBackgroundBuilder() {
        id = null;
        mediaSize = 0l;
        width = 0;
        height = 0;
        mimetype = null;
        placeholderArgb = 0;
        textArgb = 0;
        subtextArgb = 0;
        mediaData = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        type = null;
    }

    public PaymentBackgroundBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public PaymentBackgroundBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public PaymentBackgroundBuilder mediaSize(long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public PaymentBackgroundBuilder width(int width) {
        this.width = width;
        return this;
    }

    public PaymentBackgroundBuilder height(int height) {
        this.height = height;
        return this;
    }

    public PaymentBackgroundBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public PaymentBackgroundBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public PaymentBackgroundBuilder placeholderArgb(int placeholderArgb) {
        this.placeholderArgb = placeholderArgb;
        return this;
    }

    public PaymentBackgroundBuilder textArgb(int textArgb) {
        this.textArgb = textArgb;
        return this;
    }

    public PaymentBackgroundBuilder subtextArgb(int subtextArgb) {
        this.subtextArgb = subtextArgb;
        return this;
    }

    public PaymentBackgroundBuilder mediaData(it.auties.whatsapp.model.payment.PaymentMediaData mediaData) {
        this.mediaData = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(mediaData);
        return this;
    }

    public PaymentBackgroundBuilder type(it.auties.whatsapp.model.payment.PaymentBackground.PaymentBackgroundType type) {
        this.type = type;
        return this;
    }

    public it.auties.whatsapp.model.payment.PaymentBackground build() {
        return new it.auties.whatsapp.model.payment.PaymentBackground(id, mediaSize, width, height, mimetype, placeholderArgb, textArgb, subtextArgb, mediaData, type);
    }

}
