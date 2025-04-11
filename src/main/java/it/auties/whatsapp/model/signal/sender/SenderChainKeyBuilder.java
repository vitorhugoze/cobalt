package it.auties.whatsapp.model.signal.sender;

public class SenderChainKeyBuilder {
    private int iteration;
    private byte[] seed;

    public SenderChainKeyBuilder() {
        iteration = 0;
        seed = null;
    }

    public SenderChainKeyBuilder iteration(int iteration) {
        this.iteration = iteration;
        return this;
    }

    public SenderChainKeyBuilder seed(java.nio.ByteBuffer seed) {
        this.seed = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(seed);
        return this;
    }

    public SenderChainKeyBuilder seed(byte[] seed) {
        this.seed = seed;
        return this;
    }

    public it.auties.whatsapp.model.signal.sender.SenderChainKey build() {
        return new it.auties.whatsapp.model.signal.sender.SenderChainKey(iteration, seed);
    }

}
