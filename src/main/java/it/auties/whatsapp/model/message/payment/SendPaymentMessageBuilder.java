package it.auties.whatsapp.model.message.payment;

public class SendPaymentMessageBuilder {
    private java.util.Optional<it.auties.whatsapp.model.message.model.MessageContainer> noteMessage;
    private it.auties.whatsapp.model.message.model.ChatMessageKey requestMessageKey;
    private java.util.Optional<it.auties.whatsapp.model.payment.PaymentBackground> background;

    public SendPaymentMessageBuilder() {
        noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        requestMessageKey = null;
        background = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public SendPaymentMessageBuilder noteMessage(it.auties.whatsapp.model.message.model.MessageContainer noteMessage) {
        this.noteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(noteMessage);
        return this;
    }

    public SendPaymentMessageBuilder requestMessageKey(it.auties.whatsapp.model.message.model.ChatMessageKey requestMessageKey) {
        this.requestMessageKey = requestMessageKey;
        return this;
    }

    public SendPaymentMessageBuilder background(it.auties.whatsapp.model.payment.PaymentBackground background) {
        this.background = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(background);
        return this;
    }

    public it.auties.whatsapp.model.message.payment.SendPaymentMessage build() {
        return new it.auties.whatsapp.model.message.payment.SendPaymentMessage(noteMessage, requestMessageKey, background);
    }

}
