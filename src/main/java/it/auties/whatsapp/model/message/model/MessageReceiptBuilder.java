package it.auties.whatsapp.model.message.model;

public class MessageReceiptBuilder {
    private java.lang.Long deliveredTimestampSeconds;
    private java.lang.Long readTimestampSeconds;
    private java.lang.Long playedTimestampSeconds;
    private java.util.Set<it.auties.whatsapp.model.jid.Jid> deliveredJids;
    private java.util.Set<it.auties.whatsapp.model.jid.Jid> readJids;

    public MessageReceiptBuilder() {
        deliveredTimestampSeconds = null;
        readTimestampSeconds = null;
        playedTimestampSeconds = null;
        deliveredJids = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newSet();
        readJids = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newSet();
    }

    public MessageReceiptBuilder deliveredTimestampSeconds(java.lang.Long deliveredTimestampSeconds) {
        this.deliveredTimestampSeconds = deliveredTimestampSeconds;
        return this;
    }

    public MessageReceiptBuilder readTimestampSeconds(java.lang.Long readTimestampSeconds) {
        this.readTimestampSeconds = readTimestampSeconds;
        return this;
    }

    public MessageReceiptBuilder playedTimestampSeconds(java.lang.Long playedTimestampSeconds) {
        this.playedTimestampSeconds = playedTimestampSeconds;
        return this;
    }

    public MessageReceiptBuilder deliveredJids(java.util.Set<it.auties.whatsapp.model.jid.Jid> deliveredJids) {
        this.deliveredJids = deliveredJids;
        return this;
    }

    public MessageReceiptBuilder readJids(java.util.Set<it.auties.whatsapp.model.jid.Jid> readJids) {
        this.readJids = readJids;
        return this;
    }

    public it.auties.whatsapp.model.message.model.MessageReceipt build() {
        return new it.auties.whatsapp.model.message.model.MessageReceipt(deliveredTimestampSeconds, readTimestampSeconds, playedTimestampSeconds, deliveredJids, readJids);
    }

}
