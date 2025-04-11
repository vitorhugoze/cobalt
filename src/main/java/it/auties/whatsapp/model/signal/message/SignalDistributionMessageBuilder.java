package it.auties.whatsapp.model.signal.message;

public class SignalDistributionMessageBuilder {
    private java.lang.Integer id;
    private java.lang.Integer iteration;
    private byte[] chainKey;
    private byte[] signingKey;

    public SignalDistributionMessageBuilder() {
        id = null;
        iteration = null;
        chainKey = null;
        signingKey = null;
    }

    public SignalDistributionMessageBuilder id(java.lang.Integer id) {
        this.id = id;
        return this;
    }

    public SignalDistributionMessageBuilder iteration(java.lang.Integer iteration) {
        this.iteration = iteration;
        return this;
    }

    public SignalDistributionMessageBuilder chainKey(java.nio.ByteBuffer chainKey) {
        this.chainKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(chainKey);
        return this;
    }

    public SignalDistributionMessageBuilder chainKey(byte[] chainKey) {
        this.chainKey = chainKey;
        return this;
    }

    public SignalDistributionMessageBuilder signingKey(java.nio.ByteBuffer signingKey) {
        this.signingKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(signingKey);
        return this;
    }

    public SignalDistributionMessageBuilder signingKey(byte[] signingKey) {
        this.signingKey = signingKey;
        return this;
    }

    public it.auties.whatsapp.model.signal.message.SignalDistributionMessage build() {
        return new it.auties.whatsapp.model.signal.message.SignalDistributionMessage(id, iteration, chainKey, signingKey);
    }

}
