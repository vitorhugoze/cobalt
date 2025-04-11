package it.auties.whatsapp.model.sync;

public class AppStateSyncKeyShareBuilder {
    private java.util.List<it.auties.whatsapp.model.sync.AppStateSyncKey> keys;

    public AppStateSyncKeyShareBuilder() {
        keys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public AppStateSyncKeyShareBuilder keys(java.util.List<it.auties.whatsapp.model.sync.AppStateSyncKey> keys) {
        this.keys = keys;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateSyncKeyShare build() {
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyShare(keys);
    }

}
