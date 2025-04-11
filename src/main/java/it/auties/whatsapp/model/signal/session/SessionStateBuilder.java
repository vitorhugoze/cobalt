package it.auties.whatsapp.model.signal.session;

public class SessionStateBuilder {
    private int version;
    private int registrationId;
    private byte[] baseKey;
    private byte[] remoteIdentityKey;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.signal.session.SessionChain> chains;
    private byte[] rootKey;
    private it.auties.whatsapp.model.signal.session.SessionPreKey pendingPreKey;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair ephemeralKeyPair;
    private byte[] lastRemoteEphemeralKey;
    private int previousCounter;
    private boolean closed;

    public SessionStateBuilder() {
        version = 0;
        registrationId = 0;
        baseKey = null;
        remoteIdentityKey = null;
        chains = new java.util.concurrent.ConcurrentHashMap();
        rootKey = null;
        pendingPreKey = null;
        ephemeralKeyPair = null;
        lastRemoteEphemeralKey = null;
        previousCounter = 0;
        closed = false;
    }

    public SessionStateBuilder version(int version) {
        this.version = version;
        return this;
    }

    public SessionStateBuilder registrationId(int registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public SessionStateBuilder baseKey(java.nio.ByteBuffer baseKey) {
        this.baseKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(baseKey);
        return this;
    }

    public SessionStateBuilder baseKey(byte[] baseKey) {
        this.baseKey = baseKey;
        return this;
    }

    public SessionStateBuilder remoteIdentityKey(java.nio.ByteBuffer remoteIdentityKey) {
        this.remoteIdentityKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(remoteIdentityKey);
        return this;
    }

    public SessionStateBuilder remoteIdentityKey(byte[] remoteIdentityKey) {
        this.remoteIdentityKey = remoteIdentityKey;
        return this;
    }

    public SessionStateBuilder chains(java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.signal.session.SessionChain> chains) {
        this.chains = chains;
        return this;
    }

    public SessionStateBuilder rootKey(java.nio.ByteBuffer rootKey) {
        this.rootKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(rootKey);
        return this;
    }

    public SessionStateBuilder rootKey(byte[] rootKey) {
        this.rootKey = rootKey;
        return this;
    }

    public SessionStateBuilder pendingPreKey(it.auties.whatsapp.model.signal.session.SessionPreKey pendingPreKey) {
        this.pendingPreKey = pendingPreKey;
        return this;
    }

    public SessionStateBuilder ephemeralKeyPair(it.auties.whatsapp.model.signal.keypair.SignalKeyPair ephemeralKeyPair) {
        this.ephemeralKeyPair = ephemeralKeyPair;
        return this;
    }

    public SessionStateBuilder lastRemoteEphemeralKey(java.nio.ByteBuffer lastRemoteEphemeralKey) {
        this.lastRemoteEphemeralKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(lastRemoteEphemeralKey);
        return this;
    }

    public SessionStateBuilder lastRemoteEphemeralKey(byte[] lastRemoteEphemeralKey) {
        this.lastRemoteEphemeralKey = lastRemoteEphemeralKey;
        return this;
    }

    public SessionStateBuilder previousCounter(int previousCounter) {
        this.previousCounter = previousCounter;
        return this;
    }

    public SessionStateBuilder closed(boolean closed) {
        this.closed = closed;
        return this;
    }

    public it.auties.whatsapp.model.signal.session.SessionState build() {
        return new it.auties.whatsapp.model.signal.session.SessionState(version, registrationId, baseKey, remoteIdentityKey, chains, rootKey, pendingPreKey, ephemeralKeyPair, lastRemoteEphemeralKey, previousCounter, closed);
    }

}
