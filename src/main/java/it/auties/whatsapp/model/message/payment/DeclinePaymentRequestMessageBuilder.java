package it.auties.whatsapp.model.message.payment;

public class DeclinePaymentRequestMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;

    public DeclinePaymentRequestMessageBuilder() {
        key = null;
    }

    public DeclinePaymentRequestMessageBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage build() {
        return new it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage(key);
    }

}
