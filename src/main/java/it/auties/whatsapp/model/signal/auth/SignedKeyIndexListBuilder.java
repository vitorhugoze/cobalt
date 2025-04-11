package it.auties.whatsapp.model.signal.auth;

public class SignedKeyIndexListBuilder {
    private byte[] details;
    private byte[] accountSignature;

    public SignedKeyIndexListBuilder() {
        details = null;
        accountSignature = null;
    }

    public SignedKeyIndexListBuilder details(java.nio.ByteBuffer details) {
        this.details = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(details);
        return this;
    }

    public SignedKeyIndexListBuilder details(byte[] details) {
        this.details = details;
        return this;
    }

    public SignedKeyIndexListBuilder accountSignature(java.nio.ByteBuffer accountSignature) {
        this.accountSignature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(accountSignature);
        return this;
    }

    public SignedKeyIndexListBuilder accountSignature(byte[] accountSignature) {
        this.accountSignature = accountSignature;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.SignedKeyIndexList build() {
        return new it.auties.whatsapp.model.signal.auth.SignedKeyIndexList(details, accountSignature);
    }

}
