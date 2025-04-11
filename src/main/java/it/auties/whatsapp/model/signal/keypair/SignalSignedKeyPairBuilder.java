package it.auties.whatsapp.model.signal.keypair;

public class SignalSignedKeyPairBuilder {
    private int id;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair keyPair;
    private byte[] signature;

    public SignalSignedKeyPairBuilder() {
        id = 0;
        keyPair = null;
        signature = null;
    }

    public SignalSignedKeyPairBuilder id(int id) {
        this.id = id;
        return this;
    }

    public SignalSignedKeyPairBuilder keyPair(it.auties.whatsapp.model.signal.keypair.SignalKeyPair keyPair) {
        this.keyPair = keyPair;
        return this;
    }

    public SignalSignedKeyPairBuilder signature(java.nio.ByteBuffer signature) {
        this.signature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(signature);
        return this;
    }

    public SignalSignedKeyPairBuilder signature(byte[] signature) {
        this.signature = signature;
        return this;
    }

    public it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair build() {
        return new it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair(id, keyPair, signature);
    }

}
