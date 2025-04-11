package it.auties.whatsapp.model.sync;

public class AppStateSyncKeyBuilder {
    private it.auties.whatsapp.model.sync.AppStateSyncKeyId keyId;
    private it.auties.whatsapp.model.sync.AppStateSyncKeyData keyData;

    public AppStateSyncKeyBuilder() {
        keyId = null;
        keyData = null;
    }

    public AppStateSyncKeyBuilder keyId(it.auties.whatsapp.model.sync.AppStateSyncKeyId keyId) {
        this.keyId = keyId;
        return this;
    }

    public AppStateSyncKeyBuilder keyData(it.auties.whatsapp.model.sync.AppStateSyncKeyData keyData) {
        this.keyData = keyData;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateSyncKey build() {
        return new it.auties.whatsapp.model.sync.AppStateSyncKey(keyId, keyData);
    }

}
