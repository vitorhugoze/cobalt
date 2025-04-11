package it.auties.whatsapp.model.info;

public class WebNotificationsInfoBuilder {
    private long timestampSeconds;
    private int unreadChats;
    private int notifyMessageCount;
    private java.util.List<it.auties.whatsapp.model.info.ChatMessageInfo> notifyMessages;

    public WebNotificationsInfoBuilder() {
        timestampSeconds = 0l;
        unreadChats = 0;
        notifyMessageCount = 0;
        notifyMessages = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public WebNotificationsInfoBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public WebNotificationsInfoBuilder unreadChats(int unreadChats) {
        this.unreadChats = unreadChats;
        return this;
    }

    public WebNotificationsInfoBuilder notifyMessageCount(int notifyMessageCount) {
        this.notifyMessageCount = notifyMessageCount;
        return this;
    }

    public WebNotificationsInfoBuilder notifyMessages(java.util.List<it.auties.whatsapp.model.info.ChatMessageInfo> notifyMessages) {
        this.notifyMessages = notifyMessages;
        return this;
    }

    public it.auties.whatsapp.model.info.WebNotificationsInfo build() {
        return new it.auties.whatsapp.model.info.WebNotificationsInfo(timestampSeconds, unreadChats, notifyMessageCount, notifyMessages);
    }

}
