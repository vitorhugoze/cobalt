package it.auties.whatsapp.model.signal.keypair;

public class SignalKeyPairBuilder {
    private byte[] publicKey;
    private byte[] privateKey;

    public SignalKeyPairBuilder() {
        publicKey = null;
        privateKey = null;
    }

    public SignalKeyPairBuilder publicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(publicKey);
        return this;
    }

    public SignalKeyPairBuilder publicKey(byte[] publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public SignalKeyPairBuilder privateKey(java.nio.ByteBuffer privateKey) {
        this.privateKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(privateKey);
        return this;
    }

    public SignalKeyPairBuilder privateKey(byte[] privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public it.auties.whatsapp.model.signal.keypair.SignalKeyPair build() {
        return new it.auties.whatsapp.model.signal.keypair.SignalKeyPair(publicKey, privateKey);
    }

}
