package it.auties.whatsapp.model.sync;

public class AppStateSyncKeyIdBuilder {
    private byte[] keyId;

    public AppStateSyncKeyIdBuilder() {
        keyId = null;
    }

    public AppStateSyncKeyIdBuilder keyId(java.nio.ByteBuffer keyId) {
        this.keyId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(keyId);
        return this;
    }

    public AppStateSyncKeyIdBuilder keyId(byte[] keyId) {
        this.keyId = keyId;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateSyncKeyId build() {
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyId(keyId);
    }

}
