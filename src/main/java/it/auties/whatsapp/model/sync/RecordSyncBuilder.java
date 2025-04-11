package it.auties.whatsapp.model.sync;

public class RecordSyncBuilder {
    private it.auties.whatsapp.model.sync.IndexSync index;
    private it.auties.whatsapp.model.sync.ValueSync value;
    private it.auties.whatsapp.model.sync.KeyId keyId;

    public RecordSyncBuilder() {
        index = null;
        value = null;
        keyId = null;
    }

    public RecordSyncBuilder index(it.auties.whatsapp.model.sync.IndexSync index) {
        this.index = index;
        return this;
    }

    public RecordSyncBuilder value(it.auties.whatsapp.model.sync.ValueSync value) {
        this.value = value;
        return this;
    }

    public RecordSyncBuilder keyId(it.auties.whatsapp.model.sync.KeyId keyId) {
        this.keyId = keyId;
        return this;
    }

    public it.auties.whatsapp.model.sync.RecordSync build() {
        return new it.auties.whatsapp.model.sync.RecordSync(index, value, keyId);
    }

}
