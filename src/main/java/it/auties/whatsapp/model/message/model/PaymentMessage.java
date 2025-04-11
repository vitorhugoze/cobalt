package it.auties.whatsapp.model.message.model;

/**
 * A model interface that represents a message regarding a payment
 */
public interface PaymentMessage extends Message {
    @Override
    default MessageCategory category() {
        return MessageCategory.PAYMENT;
    }
}
