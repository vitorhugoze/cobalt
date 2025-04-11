package it.auties.whatsapp.model.sync;

public class AppStateSyncKeyDataBuilder {
    private byte[] keyData;
    private it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint fingerprint;
    private java.lang.Long timestamp;

    public AppStateSyncKeyDataBuilder() {
        keyData = null;
        fingerprint = null;
        timestamp = null;
    }

    public AppStateSyncKeyDataBuilder keyData(java.nio.ByteBuffer keyData) {
        this.keyData = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(keyData);
        return this;
    }

    public AppStateSyncKeyDataBuilder keyData(byte[] keyData) {
        this.keyData = keyData;
        return this;
    }

    public AppStateSyncKeyDataBuilder fingerprint(it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public AppStateSyncKeyDataBuilder timestamp(java.lang.Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateSyncKeyData build() {
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyData(keyData, fingerprint, timestamp);
    }

}
