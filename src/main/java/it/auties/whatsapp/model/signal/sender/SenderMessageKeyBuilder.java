package it.auties.whatsapp.model.signal.sender;

public class SenderMessageKeyBuilder {
    private int iteration;
    private byte[] seed;
    private byte[] iv;
    private byte[] cipherKey;

    public SenderMessageKeyBuilder() {
        iteration = 0;
        seed = null;
        iv = null;
        cipherKey = null;
    }

    public SenderMessageKeyBuilder iteration(int iteration) {
        this.iteration = iteration;
        return this;
    }

    public SenderMessageKeyBuilder seed(java.nio.ByteBuffer seed) {
        this.seed = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(seed);
        return this;
    }

    public SenderMessageKeyBuilder seed(byte[] seed) {
        this.seed = seed;
        return this;
    }

    public SenderMessageKeyBuilder iv(java.nio.ByteBuffer iv) {
        this.iv = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(iv);
        return this;
    }

    public SenderMessageKeyBuilder iv(byte[] iv) {
        this.iv = iv;
        return this;
    }

    public SenderMessageKeyBuilder cipherKey(java.nio.ByteBuffer cipherKey) {
        this.cipherKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(cipherKey);
        return this;
    }

    public SenderMessageKeyBuilder cipherKey(byte[] cipherKey) {
        this.cipherKey = cipherKey;
        return this;
    }

    public it.auties.whatsapp.model.signal.sender.SenderMessageKey build() {
        return new it.auties.whatsapp.model.signal.sender.SenderMessageKey(iteration, seed, iv, cipherKey);
    }

}
