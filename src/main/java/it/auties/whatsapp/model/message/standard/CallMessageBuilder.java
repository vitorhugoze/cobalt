package it.auties.whatsapp.model.message.standard;

public class CallMessageBuilder {
    private byte[] key;
    private java.lang.String source;
    private byte[] data;
    private int delay;

    public CallMessageBuilder() {
        key = null;
        source = null;
        data = null;
        delay = 0;
    }

    public CallMessageBuilder key(java.nio.ByteBuffer key) {
        this.key = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(key);
        return this;
    }

    public CallMessageBuilder key(byte[] key) {
        this.key = key;
        return this;
    }

    public CallMessageBuilder source(it.auties.protobuf.model.ProtobufString source) {
        this.source = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(source);
        return this;
    }

    public CallMessageBuilder source(java.lang.String source) {
        this.source = source;
        return this;
    }

    public CallMessageBuilder data(java.nio.ByteBuffer data) {
        this.data = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(data);
        return this;
    }

    public CallMessageBuilder data(byte[] data) {
        this.data = data;
        return this;
    }

    public CallMessageBuilder delay(int delay) {
        this.delay = delay;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.CallMessage build() {
        return new it.auties.whatsapp.model.message.standard.CallMessage(key, source, data, delay);
    }

}
