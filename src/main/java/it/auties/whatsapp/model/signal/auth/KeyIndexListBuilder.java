package it.auties.whatsapp.model.signal.auth;

public class KeyIndexListBuilder {
    private int rawId;
    private long timestamp;
    private int currentIndex;
    private java.util.List<java.lang.Integer> validIndexes;

    public KeyIndexListBuilder() {
        rawId = 0;
        timestamp = 0l;
        currentIndex = 0;
        validIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public KeyIndexListBuilder rawId(int rawId) {
        this.rawId = rawId;
        return this;
    }

    public KeyIndexListBuilder timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public KeyIndexListBuilder currentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }

    public KeyIndexListBuilder validIndexes(java.util.List<java.lang.Integer> validIndexes) {
        this.validIndexes = validIndexes;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.KeyIndexList build() {
        return new it.auties.whatsapp.model.signal.auth.KeyIndexList(rawId, timestamp, currentIndex, validIndexes);
    }

}
