package it.auties.whatsapp.model.message.payment;

public class PaymentInviteMessageBuilder {
    private it.auties.whatsapp.model.message.payment.PaymentInviteMessage.ServiceType serviceType;
    private java.util.OptionalLong expiryTimestamp;

    public PaymentInviteMessageBuilder() {
        serviceType = null;
        expiryTimestamp = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
    }

    public PaymentInviteMessageBuilder serviceType(it.auties.whatsapp.model.message.payment.PaymentInviteMessage.ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public PaymentInviteMessageBuilder expiryTimestamp(java.lang.Long expiryTimestamp) {
        this.expiryTimestamp = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(expiryTimestamp);
        return this;
    }

    public it.auties.whatsapp.model.message.payment.PaymentInviteMessage build() {
        return new it.auties.whatsapp.model.message.payment.PaymentInviteMessage(serviceType, expiryTimestamp);
    }

}
