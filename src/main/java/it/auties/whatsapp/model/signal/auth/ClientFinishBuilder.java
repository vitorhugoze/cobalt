package it.auties.whatsapp.model.signal.auth;

public class ClientFinishBuilder {
    private byte[] _static;
    private byte[] payload;

    public ClientFinishBuilder() {
        _static = null;
        payload = null;
    }

    public ClientFinishBuilder _static(java.nio.ByteBuffer _static) {
        this._static = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(_static);
        return this;
    }

    public ClientFinishBuilder _static(byte[] _static) {
        this._static = _static;
        return this;
    }

    public ClientFinishBuilder payload(java.nio.ByteBuffer payload) {
        this.payload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(payload);
        return this;
    }

    public ClientFinishBuilder payload(byte[] payload) {
        this.payload = payload;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.ClientFinish build() {
        return new it.auties.whatsapp.model.signal.auth.ClientFinish(_static, payload);
    }

}
