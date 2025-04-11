package it.auties.whatsapp.model.sync;

public class SyncActionMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;
    private java.lang.Long timestamp;

    public SyncActionMessageBuilder() {
        key = null;
        timestamp = null;
    }

    public SyncActionMessageBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public SyncActionMessageBuilder timestamp(java.lang.Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public it.auties.whatsapp.model.sync.SyncActionMessage build() {
        return new it.auties.whatsapp.model.sync.SyncActionMessage(key, timestamp);
    }

}
