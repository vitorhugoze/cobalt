package it.auties.whatsapp.model.signal.session;

public class SessionPreKeyBuilder {
    private java.lang.Integer preKeyId;
    private byte[] baseKey;
    private int signedKeyId;

    public SessionPreKeyBuilder() {
        preKeyId = null;
        baseKey = null;
        signedKeyId = 0;
    }

    public SessionPreKeyBuilder preKeyId(java.lang.Integer preKeyId) {
        this.preKeyId = preKeyId;
        return this;
    }

    public SessionPreKeyBuilder baseKey(java.nio.ByteBuffer baseKey) {
        this.baseKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(baseKey);
        return this;
    }

    public SessionPreKeyBuilder baseKey(byte[] baseKey) {
        this.baseKey = baseKey;
        return this;
    }

    public SessionPreKeyBuilder signedKeyId(int signedKeyId) {
        this.signedKeyId = signedKeyId;
        return this;
    }

    public it.auties.whatsapp.model.signal.session.SessionPreKey build() {
        return new it.auties.whatsapp.model.signal.session.SessionPreKey(preKeyId, baseKey, signedKeyId);
    }

}
