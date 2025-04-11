package it.auties.whatsapp.model.sync;

public class HistorySyncMessageBuilder {
    private it.auties.whatsapp.model.info.ChatMessageInfo messageInfo;
    private long messageOrderId;

    public HistorySyncMessageBuilder() {
        messageInfo = null;
        messageOrderId = 0l;
    }

    public HistorySyncMessageBuilder messageInfo(it.auties.whatsapp.model.info.ChatMessageInfo messageInfo) {
        this.messageInfo = messageInfo;
        return this;
    }

    public HistorySyncMessageBuilder messageOrderId(long messageOrderId) {
        this.messageOrderId = messageOrderId;
        return this;
    }

    public it.auties.whatsapp.model.sync.HistorySyncMessage build() {
        return new it.auties.whatsapp.model.sync.HistorySyncMessage(messageInfo, messageOrderId);
    }

}
