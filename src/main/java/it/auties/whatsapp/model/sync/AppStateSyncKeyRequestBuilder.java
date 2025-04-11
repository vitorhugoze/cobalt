package it.auties.whatsapp.model.sync;

public class AppStateSyncKeyRequestBuilder {
    private java.util.List<it.auties.whatsapp.model.sync.AppStateSyncKeyId> keyIds;

    public AppStateSyncKeyRequestBuilder() {
        keyIds = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public AppStateSyncKeyRequestBuilder keyIds(java.util.List<it.auties.whatsapp.model.sync.AppStateSyncKeyId> keyIds) {
        this.keyIds = keyIds;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateSyncKeyRequest build() {
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyRequest(keyIds);
    }

}
