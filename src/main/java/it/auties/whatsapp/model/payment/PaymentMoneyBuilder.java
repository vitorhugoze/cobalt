package it.auties.whatsapp.model.payment;

public class PaymentMoneyBuilder {
    private long money;
    private int offset;
    private java.lang.String currencyCode;

    public PaymentMoneyBuilder() {
        money = 0l;
        offset = 0;
        currencyCode = null;
    }

    public PaymentMoneyBuilder money(long money) {
        this.money = money;
        return this;
    }

    public PaymentMoneyBuilder offset(int offset) {
        this.offset = offset;
        return this;
    }

    public PaymentMoneyBuilder currencyCode(it.auties.protobuf.model.ProtobufString currencyCode) {
        this.currencyCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(currencyCode);
        return this;
    }

    public PaymentMoneyBuilder currencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public it.auties.whatsapp.model.payment.PaymentMoney build() {
        return new it.auties.whatsapp.model.payment.PaymentMoney(money, offset, currencyCode);
    }

}
