package it.auties.whatsapp.model.sync;

public class ValueSyncBuilder {
    private byte[] blob;

    public ValueSyncBuilder() {
        blob = null;
    }

    public ValueSyncBuilder blob(java.nio.ByteBuffer blob) {
        this.blob = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(blob);
        return this;
    }

    public ValueSyncBuilder blob(byte[] blob) {
        this.blob = blob;
        return this;
    }

    public it.auties.whatsapp.model.sync.ValueSync build() {
        return new it.auties.whatsapp.model.sync.ValueSync(blob);
    }

}
