package it.auties.whatsapp.model.sync;

public class HistorySyncBuilder {
    private it.auties.whatsapp.model.sync.HistorySync.Type syncType;
    private java.util.List<it.auties.whatsapp.model.chat.Chat> conversations;
    private java.util.List<it.auties.whatsapp.model.info.ChatMessageInfo> statusV3Messages;
    private int chunkOrder;
    private java.lang.Integer progress;
    private java.util.List<it.auties.whatsapp.model.sync.PushName> pushNames;
    private it.auties.whatsapp.model.setting.GlobalSettings globalSettings;
    private byte[] threadIdUserSecret;
    private int threadDsTimeframeOffset;
    private java.util.List<it.auties.whatsapp.model.sync.StickerMetadata> recentStickers;
    private java.util.List<it.auties.whatsapp.model.chat.GroupPastParticipants> pastParticipants;

    public HistorySyncBuilder() {
        syncType = null;
        conversations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        statusV3Messages = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        chunkOrder = 0;
        progress = null;
        pushNames = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        globalSettings = null;
        threadIdUserSecret = null;
        threadDsTimeframeOffset = 0;
        recentStickers = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        pastParticipants = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public HistorySyncBuilder syncType(it.auties.whatsapp.model.sync.HistorySync.Type syncType) {
        this.syncType = syncType;
        return this;
    }

    public HistorySyncBuilder conversations(java.util.List<it.auties.whatsapp.model.chat.Chat> conversations) {
        this.conversations = conversations;
        return this;
    }

    public HistorySyncBuilder statusV3Messages(java.util.List<it.auties.whatsapp.model.info.ChatMessageInfo> statusV3Messages) {
        this.statusV3Messages = statusV3Messages;
        return this;
    }

    public HistorySyncBuilder chunkOrder(int chunkOrder) {
        this.chunkOrder = chunkOrder;
        return this;
    }

    public HistorySyncBuilder progress(java.lang.Integer progress) {
        this.progress = progress;
        return this;
    }

    public HistorySyncBuilder pushNames(java.util.List<it.auties.whatsapp.model.sync.PushName> pushNames) {
        this.pushNames = pushNames;
        return this;
    }

    public HistorySyncBuilder globalSettings(it.auties.whatsapp.model.setting.GlobalSettings globalSettings) {
        this.globalSettings = globalSettings;
        return this;
    }

    public HistorySyncBuilder threadIdUserSecret(java.nio.ByteBuffer threadIdUserSecret) {
        this.threadIdUserSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(threadIdUserSecret);
        return this;
    }

    public HistorySyncBuilder threadIdUserSecret(byte[] threadIdUserSecret) {
        this.threadIdUserSecret = threadIdUserSecret;
        return this;
    }

    public HistorySyncBuilder threadDsTimeframeOffset(int threadDsTimeframeOffset) {
        this.threadDsTimeframeOffset = threadDsTimeframeOffset;
        return this;
    }

    public HistorySyncBuilder recentStickers(java.util.List<it.auties.whatsapp.model.sync.StickerMetadata> recentStickers) {
        this.recentStickers = recentStickers;
        return this;
    }

    public HistorySyncBuilder pastParticipants(java.util.List<it.auties.whatsapp.model.chat.GroupPastParticipants> pastParticipants) {
        this.pastParticipants = pastParticipants;
        return this;
    }

    public it.auties.whatsapp.model.sync.HistorySync build() {
        return new it.auties.whatsapp.model.sync.HistorySync(syncType, conversations, statusV3Messages, chunkOrder, progress, pushNames, globalSettings, threadIdUserSecret, threadDsTimeframeOffset, recentStickers, pastParticipants);
    }

}
