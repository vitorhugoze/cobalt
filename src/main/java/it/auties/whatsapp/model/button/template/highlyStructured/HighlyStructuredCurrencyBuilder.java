package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredCurrencyBuilder {
    private java.lang.String currencyCode;
    private long amount1000;

    public HighlyStructuredCurrencyBuilder() {
        currencyCode = null;
        amount1000 = 0l;
    }

    public HighlyStructuredCurrencyBuilder currencyCode(it.auties.protobuf.model.ProtobufString currencyCode) {
        this.currencyCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(currencyCode);
        return this;
    }

    public HighlyStructuredCurrencyBuilder currencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public HighlyStructuredCurrencyBuilder amount1000(long amount1000) {
        this.amount1000 = amount1000;
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency(currencyCode, amount1000);
    }

}
