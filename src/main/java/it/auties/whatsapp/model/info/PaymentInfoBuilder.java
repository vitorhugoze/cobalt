package it.auties.whatsapp.model.info;

public class PaymentInfoBuilder {
    private it.auties.whatsapp.model.info.PaymentInfo.Currency currencyDeprecated;
    private long amount1000;
    private it.auties.whatsapp.model.jid.Jid receiverJid;
    private it.auties.whatsapp.model.info.PaymentInfo.Status status;
    private long transactionTimestampSeconds;
    private it.auties.whatsapp.model.message.model.ChatMessageKey requestMessageKey;
    private long expiryTimestampSeconds;
    private boolean futureProofed;
    private java.lang.String currency;
    private it.auties.whatsapp.model.info.PaymentInfo.TransactionStatus transactionStatus;
    private boolean useNoviFormat;
    private it.auties.whatsapp.model.payment.PaymentMoney primaryAmount;
    private it.auties.whatsapp.model.payment.PaymentMoney exchangeAmount;

    public PaymentInfoBuilder() {
        currencyDeprecated = null;
        amount1000 = 0l;
        receiverJid = null;
        status = null;
        transactionTimestampSeconds = 0l;
        requestMessageKey = null;
        expiryTimestampSeconds = 0l;
        futureProofed = false;
        currency = null;
        transactionStatus = null;
        useNoviFormat = false;
        primaryAmount = null;
        exchangeAmount = null;
    }

    public PaymentInfoBuilder currencyDeprecated(it.auties.whatsapp.model.info.PaymentInfo.Currency currencyDeprecated) {
        this.currencyDeprecated = currencyDeprecated;
        return this;
    }

    public PaymentInfoBuilder amount1000(long amount1000) {
        this.amount1000 = amount1000;
        return this;
    }

    public PaymentInfoBuilder receiverJid(it.auties.protobuf.model.ProtobufString receiverJid) {
        this.receiverJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(receiverJid));
        return this;
    }

    public PaymentInfoBuilder receiverJid(it.auties.whatsapp.model.jid.Jid receiverJid) {
        this.receiverJid = receiverJid;
        return this;
    }

    public PaymentInfoBuilder status(it.auties.whatsapp.model.info.PaymentInfo.Status status) {
        this.status = status;
        return this;
    }

    public PaymentInfoBuilder transactionTimestampSeconds(long transactionTimestampSeconds) {
        this.transactionTimestampSeconds = transactionTimestampSeconds;
        return this;
    }

    public PaymentInfoBuilder requestMessageKey(it.auties.whatsapp.model.message.model.ChatMessageKey requestMessageKey) {
        this.requestMessageKey = requestMessageKey;
        return this;
    }

    public PaymentInfoBuilder expiryTimestampSeconds(long expiryTimestampSeconds) {
        this.expiryTimestampSeconds = expiryTimestampSeconds;
        return this;
    }

    public PaymentInfoBuilder futureProofed(boolean futureProofed) {
        this.futureProofed = futureProofed;
        return this;
    }

    public PaymentInfoBuilder currency(it.auties.protobuf.model.ProtobufString currency) {
        this.currency = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(currency);
        return this;
    }

    public PaymentInfoBuilder currency(java.lang.String currency) {
        this.currency = currency;
        return this;
    }

    public PaymentInfoBuilder transactionStatus(it.auties.whatsapp.model.info.PaymentInfo.TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    public PaymentInfoBuilder useNoviFormat(boolean useNoviFormat) {
        this.useNoviFormat = useNoviFormat;
        return this;
    }

    public PaymentInfoBuilder primaryAmount(it.auties.whatsapp.model.payment.PaymentMoney primaryAmount) {
        this.primaryAmount = primaryAmount;
        return this;
    }

    public PaymentInfoBuilder exchangeAmount(it.auties.whatsapp.model.payment.PaymentMoney exchangeAmount) {
        this.exchangeAmount = exchangeAmount;
        return this;
    }

    public it.auties.whatsapp.model.info.PaymentInfo build() {
        return new it.auties.whatsapp.model.info.PaymentInfo(currencyDeprecated, amount1000, receiverJid, status, transactionTimestampSeconds, requestMessageKey, expiryTimestampSeconds, futureProofed, currency, transactionStatus, useNoviFormat, primaryAmount, exchangeAmount);
    }

}
