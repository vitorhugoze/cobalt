package it.auties.whatsapp.model.signal.auth;

public class ClientHelloBuilder {
    private byte[] ephemeral;
    private byte[] _static;
    private byte[] payload;

    public ClientHelloBuilder() {
        ephemeral = null;
        _static = null;
        payload = null;
    }

    public ClientHelloBuilder ephemeral(java.nio.ByteBuffer ephemeral) {
        this.ephemeral = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(ephemeral);
        return this;
    }

    public ClientHelloBuilder ephemeral(byte[] ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }

    public ClientHelloBuilder _static(java.nio.ByteBuffer _static) {
        this._static = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(_static);
        return this;
    }

    public ClientHelloBuilder _static(byte[] _static) {
        this._static = _static;
        return this;
    }

    public ClientHelloBuilder payload(java.nio.ByteBuffer payload) {
        this.payload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(payload);
        return this;
    }

    public ClientHelloBuilder payload(byte[] payload) {
        this.payload = payload;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.ClientHello build() {
        return new it.auties.whatsapp.model.signal.auth.ClientHello(ephemeral, _static, payload);
    }

}
