package it.auties.whatsapp.model.signal.message;

public class SignalPreKeyMessageBuilder {
    private java.lang.Integer preKeyId;
    private byte[] baseKey;
    private byte[] identityKey;
    private byte[] serializedSignalMessage;
    private java.lang.Integer registrationId;
    private java.lang.Integer signedPreKeyId;

    public SignalPreKeyMessageBuilder() {
        preKeyId = null;
        baseKey = null;
        identityKey = null;
        serializedSignalMessage = null;
        registrationId = null;
        signedPreKeyId = null;
    }

    public SignalPreKeyMessageBuilder preKeyId(java.lang.Integer preKeyId) {
        this.preKeyId = preKeyId;
        return this;
    }

    public SignalPreKeyMessageBuilder baseKey(java.nio.ByteBuffer baseKey) {
        this.baseKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(baseKey);
        return this;
    }

    public SignalPreKeyMessageBuilder baseKey(byte[] baseKey) {
        this.baseKey = baseKey;
        return this;
    }

    public SignalPreKeyMessageBuilder identityKey(java.nio.ByteBuffer identityKey) {
        this.identityKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(identityKey);
        return this;
    }

    public SignalPreKeyMessageBuilder identityKey(byte[] identityKey) {
        this.identityKey = identityKey;
        return this;
    }

    public SignalPreKeyMessageBuilder serializedSignalMessage(java.nio.ByteBuffer serializedSignalMessage) {
        this.serializedSignalMessage = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(serializedSignalMessage);
        return this;
    }

    public SignalPreKeyMessageBuilder serializedSignalMessage(byte[] serializedSignalMessage) {
        this.serializedSignalMessage = serializedSignalMessage;
        return this;
    }

    public SignalPreKeyMessageBuilder registrationId(java.lang.Integer registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public SignalPreKeyMessageBuilder signedPreKeyId(java.lang.Integer signedPreKeyId) {
        this.signedPreKeyId = signedPreKeyId;
        return this;
    }

    public it.auties.whatsapp.model.signal.message.SignalPreKeyMessage build() {
        return new it.auties.whatsapp.model.signal.message.SignalPreKeyMessage(preKeyId, baseKey, identityKey, serializedSignalMessage, registrationId, signedPreKeyId);
    }

}
