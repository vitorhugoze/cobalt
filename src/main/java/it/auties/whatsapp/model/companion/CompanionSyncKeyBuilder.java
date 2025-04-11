package it.auties.whatsapp.model.companion;

public class CompanionSyncKeyBuilder {
    private it.auties.whatsapp.model.jid.Jid companion;
    private java.util.LinkedList<it.auties.whatsapp.model.sync.AppStateSyncKey> keys;

    public CompanionSyncKeyBuilder() {
        companion = null;
        keys = new java.util.LinkedList();
    }

    public CompanionSyncKeyBuilder companion(it.auties.protobuf.model.ProtobufString companion) {
        this.companion = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(companion));
        return this;
    }

    public CompanionSyncKeyBuilder companion(it.auties.whatsapp.model.jid.Jid companion) {
        this.companion = companion;
        return this;
    }

    public CompanionSyncKeyBuilder keys(java.util.LinkedList<it.auties.whatsapp.model.sync.AppStateSyncKey> keys) {
        this.keys = keys;
        return this;
    }

    public it.auties.whatsapp.model.companion.CompanionSyncKey build() {
        return new it.auties.whatsapp.model.companion.CompanionSyncKey(companion, keys);
    }

}
