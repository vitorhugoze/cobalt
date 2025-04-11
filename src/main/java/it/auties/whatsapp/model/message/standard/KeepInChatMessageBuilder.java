package it.auties.whatsapp.model.message.standard;

public class KeepInChatMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;
    private it.auties.whatsapp.model.message.model.KeepInChatType keepType;
    private long timestampMilliseconds;

    public KeepInChatMessageBuilder() {
        key = null;
        keepType = null;
        timestampMilliseconds = 0l;
    }

    public KeepInChatMessageBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public KeepInChatMessageBuilder keepType(it.auties.whatsapp.model.message.model.KeepInChatType keepType) {
        this.keepType = keepType;
        return this;
    }

    public KeepInChatMessageBuilder timestampMilliseconds(long timestampMilliseconds) {
        this.timestampMilliseconds = timestampMilliseconds;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.KeepInChatMessage build() {
        return new it.auties.whatsapp.model.message.standard.KeepInChatMessage(key, keepType, timestampMilliseconds);
    }

}
