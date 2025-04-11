package it.auties.whatsapp.model.signal.message;

public class SignalMessageBuilder {
    private byte[] ephemeralPublicKey;
    private java.lang.Integer counter;
    private java.lang.Integer previousCounter;
    private byte[] ciphertext;

    public SignalMessageBuilder() {
        ephemeralPublicKey = null;
        counter = null;
        previousCounter = null;
        ciphertext = null;
    }

    public SignalMessageBuilder ephemeralPublicKey(java.nio.ByteBuffer ephemeralPublicKey) {
        this.ephemeralPublicKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(ephemeralPublicKey);
        return this;
    }

    public SignalMessageBuilder ephemeralPublicKey(byte[] ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
        return this;
    }

    public SignalMessageBuilder counter(java.lang.Integer counter) {
        this.counter = counter;
        return this;
    }

    public SignalMessageBuilder previousCounter(java.lang.Integer previousCounter) {
        this.previousCounter = previousCounter;
        return this;
    }

    public SignalMessageBuilder ciphertext(java.nio.ByteBuffer ciphertext) {
        this.ciphertext = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(ciphertext);
        return this;
    }

    public SignalMessageBuilder ciphertext(byte[] ciphertext) {
        this.ciphertext = ciphertext;
        return this;
    }

    public it.auties.whatsapp.model.signal.message.SignalMessage build() {
        return new it.auties.whatsapp.model.signal.message.SignalMessage(ephemeralPublicKey, counter, previousCounter, ciphertext);
    }

}
