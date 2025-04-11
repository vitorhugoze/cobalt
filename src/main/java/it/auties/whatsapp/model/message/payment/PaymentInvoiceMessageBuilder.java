package it.auties.whatsapp.model.message.payment;

public class PaymentInvoiceMessageBuilder {
    private java.lang.String note;
    private java.lang.String token;
    private it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage.PaymentAttachmentType paymentAttachmentType;
    private java.lang.String mimeType;
    private byte[] mediaKey;
    private java.lang.Long mediaKeyTimestampSeconds;
    private byte[] mediaSha256;
    private byte[] mediaEncryptedSha256;
    private java.lang.String mediaDirectPath;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public PaymentInvoiceMessageBuilder() {
        note = null;
        token = null;
        paymentAttachmentType = null;
        mimeType = null;
        mediaKey = null;
        mediaKeyTimestampSeconds = null;
        mediaSha256 = null;
        mediaEncryptedSha256 = null;
        mediaDirectPath = null;
        thumbnail = null;
        contextInfo = null;
    }

    public PaymentInvoiceMessageBuilder note(it.auties.protobuf.model.ProtobufString note) {
        this.note = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(note);
        return this;
    }

    public PaymentInvoiceMessageBuilder note(java.lang.String note) {
        this.note = note;
        return this;
    }

    public PaymentInvoiceMessageBuilder token(it.auties.protobuf.model.ProtobufString token) {
        this.token = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(token);
        return this;
    }

    public PaymentInvoiceMessageBuilder token(java.lang.String token) {
        this.token = token;
        return this;
    }

    public PaymentInvoiceMessageBuilder paymentAttachmentType(it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage.PaymentAttachmentType paymentAttachmentType) {
        this.paymentAttachmentType = paymentAttachmentType;
        return this;
    }

    public PaymentInvoiceMessageBuilder mimeType(it.auties.protobuf.model.ProtobufString mimeType) {
        this.mimeType = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimeType);
        return this;
    }

    public PaymentInvoiceMessageBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaKeyTimestampSeconds(java.lang.Long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public PaymentInvoiceMessageBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public PaymentInvoiceMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public PaymentInvoiceMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public PaymentInvoiceMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage build() {
        return new it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage(note, token, paymentAttachmentType, mimeType, mediaKey, mediaKeyTimestampSeconds, mediaSha256, mediaEncryptedSha256, mediaDirectPath, thumbnail, contextInfo);
    }

}
