package it.auties.whatsapp.model.signal.sender;

public class SenderKeyStateBuilder {
    private int id;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair signingKey;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer,it.auties.whatsapp.model.signal.sender.SenderMessageKey> messageKeys;
    private it.auties.whatsapp.model.signal.sender.SenderChainKey chainKey;

    public SenderKeyStateBuilder() {
        id = 0;
        signingKey = null;
        messageKeys = new java.util.concurrent.ConcurrentHashMap();
        chainKey = null;
    }

    public SenderKeyStateBuilder id(int id) {
        this.id = id;
        return this;
    }

    public SenderKeyStateBuilder signingKey(it.auties.whatsapp.model.signal.keypair.SignalKeyPair signingKey) {
        this.signingKey = signingKey;
        return this;
    }

    public SenderKeyStateBuilder messageKeys(java.util.concurrent.ConcurrentHashMap<java.lang.Integer,it.auties.whatsapp.model.signal.sender.SenderMessageKey> messageKeys) {
        this.messageKeys = messageKeys;
        return this;
    }

    public SenderKeyStateBuilder chainKey(it.auties.whatsapp.model.signal.sender.SenderChainKey chainKey) {
        this.chainKey = chainKey;
        return this;
    }

    public it.auties.whatsapp.model.signal.sender.SenderKeyState build() {
        return new it.auties.whatsapp.model.signal.sender.SenderKeyState(id, signingKey, messageKeys, chainKey);
    }

}
