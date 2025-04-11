package it.auties.whatsapp.model.companion;

public class CompanionHashStateBuilder {
    private it.auties.whatsapp.model.sync.PatchType type;
    private long version;
    private byte[] hash;
    private java.util.Map<java.lang.String,byte[]> indexValueMap;

    public CompanionHashStateBuilder() {
        type = null;
        version = 0l;
        hash = null;
        indexValueMap = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
    }

    public CompanionHashStateBuilder type(it.auties.whatsapp.model.sync.PatchType type) {
        this.type = type;
        return this;
    }

    public CompanionHashStateBuilder version(long version) {
        this.version = version;
        return this;
    }

    public CompanionHashStateBuilder hash(java.nio.ByteBuffer hash) {
        this.hash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(hash);
        return this;
    }

    public CompanionHashStateBuilder hash(byte[] hash) {
        this.hash = hash;
        return this;
    }

    public CompanionHashStateBuilder indexValueMap(java.util.Map<java.lang.String,byte[]> indexValueMap) {
        this.indexValueMap = indexValueMap;
        return this;
    }

    public it.auties.whatsapp.model.companion.CompanionHashState build() {
        return new it.auties.whatsapp.model.companion.CompanionHashState(type, version, hash, indexValueMap);
    }

}
