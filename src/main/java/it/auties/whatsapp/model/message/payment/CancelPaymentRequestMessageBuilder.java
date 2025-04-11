package it.auties.whatsapp.model.message.payment;

public class CancelPaymentRequestMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;

    public CancelPaymentRequestMessageBuilder() {
        key = null;
    }

    public CancelPaymentRequestMessageBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessage build() {
        return new it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessage(key);
    }

}
