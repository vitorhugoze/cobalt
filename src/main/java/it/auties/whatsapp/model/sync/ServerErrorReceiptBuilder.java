package it.auties.whatsapp.model.sync;

public class ServerErrorReceiptBuilder {
    private java.lang.String stanzaId;

    public ServerErrorReceiptBuilder() {
        stanzaId = null;
    }

    public ServerErrorReceiptBuilder stanzaId(it.auties.protobuf.model.ProtobufString stanzaId) {
        this.stanzaId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(stanzaId);
        return this;
    }

    public ServerErrorReceiptBuilder stanzaId(java.lang.String stanzaId) {
        this.stanzaId = stanzaId;
        return this;
    }

    public it.auties.whatsapp.model.sync.ServerErrorReceipt build() {
        return new it.auties.whatsapp.model.sync.ServerErrorReceipt(stanzaId);
    }

}
