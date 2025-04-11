package it.auties.whatsapp.model.sync;

public class IndexSyncBuilder {
    private byte[] blob;

    public IndexSyncBuilder() {
        blob = null;
    }

    public IndexSyncBuilder blob(java.nio.ByteBuffer blob) {
        this.blob = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(blob);
        return this;
    }

    public IndexSyncBuilder blob(byte[] blob) {
        this.blob = blob;
        return this;
    }

    public it.auties.whatsapp.model.sync.IndexSync build() {
        return new it.auties.whatsapp.model.sync.IndexSync(blob);
    }

}
