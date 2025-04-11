package it.auties.whatsapp.model.business;

public class BusinessAccountPayloadBuilder {
    private it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate certificate;
    private byte[] info;

    public BusinessAccountPayloadBuilder() {
        certificate = null;
        info = null;
    }

    public BusinessAccountPayloadBuilder certificate(it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    public BusinessAccountPayloadBuilder info(java.nio.ByteBuffer info) {
        this.info = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(info);
        return this;
    }

    public BusinessAccountPayloadBuilder info(byte[] info) {
        this.info = info;
        return this;
    }

    public it.auties.whatsapp.model.business.BusinessAccountPayload build() {
        return new it.auties.whatsapp.model.business.BusinessAccountPayload(certificate, info);
    }

}
