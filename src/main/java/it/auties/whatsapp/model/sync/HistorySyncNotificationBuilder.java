package it.auties.whatsapp.model.sync;

public class HistorySyncNotificationBuilder {
    private byte[] mediaSha256;
    private java.lang.Long mediaSize;
    private byte[] mediaKey;
    private byte[] mediaEncryptedSha256;
    private java.lang.String mediaDirectPath;
    private it.auties.whatsapp.model.sync.HistorySync.Type syncType;
    private java.lang.Integer chunkOrder;
    private java.lang.String originalMessageId;
    private java.lang.Integer progress;
    private long oldestMsgInChunkTimestampSec;
    private byte[] initialHistBootstrapInlinePayload;
    private java.lang.String peerDataRequestSessionId;

    public HistorySyncNotificationBuilder() {
        mediaSha256 = null;
        mediaSize = null;
        mediaKey = null;
        mediaEncryptedSha256 = null;
        mediaDirectPath = null;
        syncType = null;
        chunkOrder = null;
        originalMessageId = null;
        progress = null;
        oldestMsgInChunkTimestampSec = 0l;
        initialHistBootstrapInlinePayload = null;
        peerDataRequestSessionId = null;
    }

    public HistorySyncNotificationBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public HistorySyncNotificationBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public HistorySyncNotificationBuilder mediaSize(java.lang.Long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public HistorySyncNotificationBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public HistorySyncNotificationBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public HistorySyncNotificationBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public HistorySyncNotificationBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public HistorySyncNotificationBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public HistorySyncNotificationBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public HistorySyncNotificationBuilder syncType(it.auties.whatsapp.model.sync.HistorySync.Type syncType) {
        this.syncType = syncType;
        return this;
    }

    public HistorySyncNotificationBuilder chunkOrder(java.lang.Integer chunkOrder) {
        this.chunkOrder = chunkOrder;
        return this;
    }

    public HistorySyncNotificationBuilder originalMessageId(it.auties.protobuf.model.ProtobufString originalMessageId) {
        this.originalMessageId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(originalMessageId);
        return this;
    }

    public HistorySyncNotificationBuilder originalMessageId(java.lang.String originalMessageId) {
        this.originalMessageId = originalMessageId;
        return this;
    }

    public HistorySyncNotificationBuilder progress(java.lang.Integer progress) {
        this.progress = progress;
        return this;
    }

    public HistorySyncNotificationBuilder oldestMsgInChunkTimestampSec(long oldestMsgInChunkTimestampSec) {
        this.oldestMsgInChunkTimestampSec = oldestMsgInChunkTimestampSec;
        return this;
    }

    public HistorySyncNotificationBuilder initialHistBootstrapInlinePayload(java.nio.ByteBuffer initialHistBootstrapInlinePayload) {
        this.initialHistBootstrapInlinePayload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(initialHistBootstrapInlinePayload);
        return this;
    }

    public HistorySyncNotificationBuilder initialHistBootstrapInlinePayload(byte[] initialHistBootstrapInlinePayload) {
        this.initialHistBootstrapInlinePayload = initialHistBootstrapInlinePayload;
        return this;
    }

    public HistorySyncNotificationBuilder peerDataRequestSessionId(it.auties.protobuf.model.ProtobufString peerDataRequestSessionId) {
        this.peerDataRequestSessionId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(peerDataRequestSessionId);
        return this;
    }

    public HistorySyncNotificationBuilder peerDataRequestSessionId(java.lang.String peerDataRequestSessionId) {
        this.peerDataRequestSessionId = peerDataRequestSessionId;
        return this;
    }

    public it.auties.whatsapp.model.sync.HistorySyncNotification build() {
        return new it.auties.whatsapp.model.sync.HistorySyncNotification(mediaSha256, mediaSize, mediaKey, mediaEncryptedSha256, mediaDirectPath, syncType, chunkOrder, originalMessageId, progress, oldestMsgInChunkTimestampSec, initialHistBootstrapInlinePayload, peerDataRequestSessionId);
    }

}
