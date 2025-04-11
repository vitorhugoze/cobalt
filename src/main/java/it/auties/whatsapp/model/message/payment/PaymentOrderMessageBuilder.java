package it.auties.whatsapp.model.message.payment;

public class PaymentOrderMessageBuilder {
    private java.lang.String id;
    private byte[] thumbnail;
    private int itemCount;
    private it.auties.whatsapp.model.message.payment.PaymentOrderMessage.Status status;
    private it.auties.whatsapp.model.message.payment.PaymentOrderMessage.PaymentOrderSurface surface;
    private java.lang.String message;
    private java.lang.String title;
    private it.auties.whatsapp.model.jid.Jid sellerId;
    private java.lang.String token;
    private long amount;
    private java.lang.String currency;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public PaymentOrderMessageBuilder() {
        id = null;
        thumbnail = null;
        itemCount = 0;
        status = null;
        surface = null;
        message = null;
        title = null;
        sellerId = null;
        token = null;
        amount = 0l;
        currency = null;
        contextInfo = null;
    }

    public PaymentOrderMessageBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public PaymentOrderMessageBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public PaymentOrderMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public PaymentOrderMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public PaymentOrderMessageBuilder itemCount(int itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    public PaymentOrderMessageBuilder status(it.auties.whatsapp.model.message.payment.PaymentOrderMessage.Status status) {
        this.status = status;
        return this;
    }

    public PaymentOrderMessageBuilder surface(it.auties.whatsapp.model.message.payment.PaymentOrderMessage.PaymentOrderSurface surface) {
        this.surface = surface;
        return this;
    }

    public PaymentOrderMessageBuilder message(it.auties.protobuf.model.ProtobufString message) {
        this.message = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(message);
        return this;
    }

    public PaymentOrderMessageBuilder message(java.lang.String message) {
        this.message = message;
        return this;
    }

    public PaymentOrderMessageBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public PaymentOrderMessageBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public PaymentOrderMessageBuilder sellerId(it.auties.protobuf.model.ProtobufString sellerId) {
        this.sellerId = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(sellerId));
        return this;
    }

    public PaymentOrderMessageBuilder sellerId(it.auties.whatsapp.model.jid.Jid sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public PaymentOrderMessageBuilder token(it.auties.protobuf.model.ProtobufString token) {
        this.token = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(token);
        return this;
    }

    public PaymentOrderMessageBuilder token(java.lang.String token) {
        this.token = token;
        return this;
    }

    public PaymentOrderMessageBuilder amount(long amount) {
        this.amount = amount;
        return this;
    }

    public PaymentOrderMessageBuilder currency(it.auties.protobuf.model.ProtobufString currency) {
        this.currency = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(currency);
        return this;
    }

    public PaymentOrderMessageBuilder currency(java.lang.String currency) {
        this.currency = currency;
        return this;
    }

    public PaymentOrderMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.payment.PaymentOrderMessage build() {
        return new it.auties.whatsapp.model.message.payment.PaymentOrderMessage(id, thumbnail, itemCount, status, surface, message, title, sellerId, token, amount, currency, contextInfo);
    }

}
