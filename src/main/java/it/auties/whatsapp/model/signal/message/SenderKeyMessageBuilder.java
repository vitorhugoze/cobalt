package it.auties.whatsapp.model.signal.message;

public class SenderKeyMessageBuilder {
    private java.lang.Integer id;
    private java.lang.Integer iteration;
    private byte[] cipherText;

    public SenderKeyMessageBuilder() {
        id = null;
        iteration = null;
        cipherText = null;
    }

    public SenderKeyMessageBuilder id(java.lang.Integer id) {
        this.id = id;
        return this;
    }

    public SenderKeyMessageBuilder iteration(java.lang.Integer iteration) {
        this.iteration = iteration;
        return this;
    }

    public SenderKeyMessageBuilder cipherText(java.nio.ByteBuffer cipherText) {
        this.cipherText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(cipherText);
        return this;
    }

    public SenderKeyMessageBuilder cipherText(byte[] cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    public it.auties.whatsapp.model.signal.message.SenderKeyMessage build() {
        return new it.auties.whatsapp.model.signal.message.SenderKeyMessage(id, iteration, cipherText);
    }

}
