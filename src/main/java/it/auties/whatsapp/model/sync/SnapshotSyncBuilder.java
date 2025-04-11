package it.auties.whatsapp.model.sync;

public class SnapshotSyncBuilder {
    private it.auties.whatsapp.model.sync.VersionSync version;
    private java.util.List<it.auties.whatsapp.model.sync.RecordSync> records;
    private byte[] mac;
    private it.auties.whatsapp.model.sync.KeyId keyId;

    public SnapshotSyncBuilder() {
        version = null;
        records = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        mac = null;
        keyId = null;
    }

    public SnapshotSyncBuilder version(it.auties.whatsapp.model.sync.VersionSync version) {
        this.version = version;
        return this;
    }

    public SnapshotSyncBuilder records(java.util.List<it.auties.whatsapp.model.sync.RecordSync> records) {
        this.records = records;
        return this;
    }

    public SnapshotSyncBuilder mac(java.nio.ByteBuffer mac) {
        this.mac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mac);
        return this;
    }

    public SnapshotSyncBuilder mac(byte[] mac) {
        this.mac = mac;
        return this;
    }

    public SnapshotSyncBuilder keyId(it.auties.whatsapp.model.sync.KeyId keyId) {
        this.keyId = keyId;
        return this;
    }

    public it.auties.whatsapp.model.sync.SnapshotSync build() {
        return new it.auties.whatsapp.model.sync.SnapshotSync(version, records, mac, keyId);
    }

}
