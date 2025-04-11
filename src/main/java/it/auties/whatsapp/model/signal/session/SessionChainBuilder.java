package it.auties.whatsapp.model.signal.session;

public class SessionChainBuilder {
    private java.util.concurrent.atomic.AtomicInteger counter;
    private java.util.concurrent.atomic.AtomicReference<byte[]> key;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer,byte[]> messageKeys;

    public SessionChainBuilder() {
        counter = it.auties.protobuf.builtin.ProtobufAtomicMixin.newAtomicInt();
        key = it.auties.protobuf.builtin.ProtobufAtomicMixin.newAtomicReference();
        messageKeys = new java.util.concurrent.ConcurrentHashMap();
    }

    public SessionChainBuilder counter(java.lang.Integer counter) {
        this.counter = it.auties.protobuf.builtin.ProtobufAtomicMixin.ofAtomic(counter);
        return this;
    }

    public SessionChainBuilder key(java.nio.ByteBuffer key) {
        this.key = it.auties.protobuf.builtin.ProtobufAtomicMixin.ofAtomic(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(key));
        return this;
    }

    public SessionChainBuilder key(byte[] key) {
        this.key = it.auties.protobuf.builtin.ProtobufAtomicMixin.ofAtomic(key);
        return this;
    }

    public SessionChainBuilder messageKeys(java.util.concurrent.ConcurrentHashMap<java.lang.Integer,byte[]> messageKeys) {
        this.messageKeys = messageKeys;
        return this;
    }

    public it.auties.whatsapp.model.signal.session.SessionChain build() {
        return new it.auties.whatsapp.model.signal.session.SessionChain(counter, key, messageKeys);
    }

}
