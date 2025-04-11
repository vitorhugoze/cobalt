package it.auties.whatsapp.model.sync;

public class AppStateSyncKeyFingerprintBuilder {
    private java.lang.Integer rawId;
    private java.lang.Integer currentIndex;
    private java.util.List<java.lang.Integer> deviceIndexes;

    public AppStateSyncKeyFingerprintBuilder() {
        rawId = null;
        currentIndex = null;
        deviceIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public AppStateSyncKeyFingerprintBuilder rawId(java.lang.Integer rawId) {
        this.rawId = rawId;
        return this;
    }

    public AppStateSyncKeyFingerprintBuilder currentIndex(java.lang.Integer currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }

    public AppStateSyncKeyFingerprintBuilder deviceIndexes(java.util.List<java.lang.Integer> deviceIndexes) {
        this.deviceIndexes = deviceIndexes;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint build() {
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint(rawId, currentIndex, deviceIndexes);
    }

}
