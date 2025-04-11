package it.auties.whatsapp.model.signal.sender;

public class SenderPreKeysBuilder {
    private java.util.Collection<it.auties.whatsapp.model.jid.Jid> preKeys;

    public SenderPreKeysBuilder() {
        preKeys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newCollection();
    }

    public SenderPreKeysBuilder preKeys(java.util.Collection<it.auties.whatsapp.model.jid.Jid> preKeys) {
        this.preKeys = preKeys;
        return this;
    }

    public it.auties.whatsapp.model.signal.sender.SenderPreKeys build() {
        return new it.auties.whatsapp.model.signal.sender.SenderPreKeys(preKeys);
    }

}
