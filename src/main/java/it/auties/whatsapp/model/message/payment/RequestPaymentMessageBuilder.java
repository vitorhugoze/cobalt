package it.auties.whatsapp.model.message.payment;

public class RequestPaymentMessageBuilder {
    private java.lang.String currency;
    private long amount1000;
    private it.auties.whatsapp.model.jid.Jid requestFrom;
    private java.util.Optional<it.auties.whatsapp.model.message.model.MessageContainer> noteMessage;
    private long expiryTimestampSeconds;
    private it.auties.whatsapp.model.payment.PaymentMoney amount;
    private java.util.Optional<it.auties.whatsapp.model.payment.PaymentBackground> background;

    public RequestPaymentMessageBuilder() {
        currency = null;
        amount1000 = 0l;
        requestFrom = null;
        noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        expiryTimestampSeconds = 0l;
        amount = null;
        background = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public RequestPaymentMessageBuilder currency(it.auties.protobuf.model.ProtobufString currency) {
        this.currency = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(currency);
        return this;
    }

    public RequestPaymentMessageBuilder currency(java.lang.String currency) {
        this.currency = currency;
        return this;
    }

    public RequestPaymentMessageBuilder amount1000(long amount1000) {
        this.amount1000 = amount1000;
        return this;
    }

    public RequestPaymentMessageBuilder requestFrom(it.auties.protobuf.model.ProtobufString requestFrom) {
        this.requestFrom = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(requestFrom));
        return this;
    }

    public RequestPaymentMessageBuilder requestFrom(it.auties.whatsapp.model.jid.Jid requestFrom) {
        this.requestFrom = requestFrom;
        return this;
    }

    public RequestPaymentMessageBuilder noteMessage(it.auties.whatsapp.model.message.model.MessageContainer noteMessage) {
        this.noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(noteMessage);
        return this;
    }

    public RequestPaymentMessageBuilder expiryTimestampSeconds(long expiryTimestampSeconds) {
        this.expiryTimestampSeconds = expiryTimestampSeconds;
        return this;
    }

    public RequestPaymentMessageBuilder amount(it.auties.whatsapp.model.payment.PaymentMoney amount) {
        this.amount = amount;
        return this;
    }

    public RequestPaymentMessageBuilder background(it.auties.whatsapp.model.payment.PaymentBackground background) {
        this.background = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(background);
        return this;
    }

    public it.auties.whatsapp.model.message.payment.RequestPaymentMessage build() {
        return new it.auties.whatsapp.model.message.payment.RequestPaymentMessage(currency, amount1000, requestFrom, noteMessage, expiryTimestampSeconds, amount, background);
    }

}
