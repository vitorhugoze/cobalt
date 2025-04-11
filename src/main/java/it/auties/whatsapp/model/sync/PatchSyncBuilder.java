package it.auties.whatsapp.model.sync;

public class PatchSyncBuilder {
    private it.auties.whatsapp.model.sync.VersionSync version;
    private java.util.List<it.auties.whatsapp.model.sync.MutationSync> mutations;
    private it.auties.whatsapp.model.sync.ExternalBlobReference externalMutations;
    private byte[] snapshotMac;
    private byte[] patchMac;
    private it.auties.whatsapp.model.sync.KeyId keyId;
    private it.auties.whatsapp.model.sync.ExitCode exitCode;
    private java.lang.Integer deviceIndex;

    public PatchSyncBuilder() {
        version = null;
        mutations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        externalMutations = null;
        snapshotMac = null;
        patchMac = null;
        keyId = null;
        exitCode = null;
        deviceIndex = null;
    }

    public PatchSyncBuilder version(it.auties.whatsapp.model.sync.VersionSync version) {
        this.version = version;
        return this;
    }

    public PatchSyncBuilder mutations(java.util.List<it.auties.whatsapp.model.sync.MutationSync> mutations) {
        this.mutations = mutations;
        return this;
    }

    public PatchSyncBuilder externalMutations(it.auties.whatsapp.model.sync.ExternalBlobReference externalMutations) {
        this.externalMutations = externalMutations;
        return this;
    }

    public PatchSyncBuilder snapshotMac(java.nio.ByteBuffer snapshotMac) {
        this.snapshotMac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(snapshotMac);
        return this;
    }

    public PatchSyncBuilder snapshotMac(byte[] snapshotMac) {
        this.snapshotMac = snapshotMac;
        return this;
    }

    public PatchSyncBuilder patchMac(java.nio.ByteBuffer patchMac) {
        this.patchMac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(patchMac);
        return this;
    }

    public PatchSyncBuilder patchMac(byte[] patchMac) {
        this.patchMac = patchMac;
        return this;
    }

    public PatchSyncBuilder keyId(it.auties.whatsapp.model.sync.KeyId keyId) {
        this.keyId = keyId;
        return this;
    }

    public PatchSyncBuilder exitCode(it.auties.whatsapp.model.sync.ExitCode exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    public PatchSyncBuilder deviceIndex(java.lang.Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    public it.auties.whatsapp.model.sync.PatchSync build() {
        return new it.auties.whatsapp.model.sync.PatchSync(version, mutations, externalMutations, snapshotMac, patchMac, keyId, exitCode, deviceIndex);
    }

}
