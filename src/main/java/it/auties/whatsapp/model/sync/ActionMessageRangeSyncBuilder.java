package it.auties.whatsapp.model.sync;

public class ActionMessageRangeSyncBuilder {
    private java.lang.Long lastMessageTimestamp;
    private java.lang.Long lastSystemMessageTimestamp;
    private java.util.List<it.auties.whatsapp.model.sync.SyncActionMessage> messages;

    public ActionMessageRangeSyncBuilder() {
        lastMessageTimestamp = null;
        lastSystemMessageTimestamp = null;
        messages = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public ActionMessageRangeSyncBuilder lastMessageTimestamp(java.lang.Long lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
        return this;
    }

    public ActionMessageRangeSyncBuilder lastSystemMessageTimestamp(java.lang.Long lastSystemMessageTimestamp) {
        this.lastSystemMessageTimestamp = lastSystemMessageTimestamp;
        return this;
    }

    public ActionMessageRangeSyncBuilder messages(java.util.List<it.auties.whatsapp.model.sync.SyncActionMessage> messages) {
        this.messages = messages;
        return this;
    }

    public it.auties.whatsapp.model.sync.ActionMessageRangeSync build() {
        return new it.auties.whatsapp.model.sync.ActionMessageRangeSync(lastMessageTimestamp, lastSystemMessageTimestamp, messages);
    }

}
