package it.auties.whatsapp.model.sync;

public class HistorySyncConfigBuilder {
    private java.lang.Integer fullSyncDaysLimit;
    private java.lang.Integer fullSyncSizeMbLimit;
    private java.lang.Integer storageQuotaMb;
    private java.lang.Boolean inlineInitialPayloadInE2EeMsg;
    private java.lang.Integer recentSyncDaysLimit;
    private java.lang.Boolean supportCallLogHistory;
    private java.lang.Boolean supportBotUserAgentChatHistory;

    public HistorySyncConfigBuilder() {
        fullSyncDaysLimit = null;
        fullSyncSizeMbLimit = null;
        storageQuotaMb = null;
        inlineInitialPayloadInE2EeMsg = null;
        recentSyncDaysLimit = null;
        supportCallLogHistory = null;
        supportBotUserAgentChatHistory = null;
    }

    public HistorySyncConfigBuilder fullSyncDaysLimit(java.lang.Integer fullSyncDaysLimit) {
        this.fullSyncDaysLimit = fullSyncDaysLimit;
        return this;
    }

    public HistorySyncConfigBuilder fullSyncSizeMbLimit(java.lang.Integer fullSyncSizeMbLimit) {
        this.fullSyncSizeMbLimit = fullSyncSizeMbLimit;
        return this;
    }

    public HistorySyncConfigBuilder storageQuotaMb(java.lang.Integer storageQuotaMb) {
        this.storageQuotaMb = storageQuotaMb;
        return this;
    }

    public HistorySyncConfigBuilder inlineInitialPayloadInE2EeMsg(java.lang.Boolean inlineInitialPayloadInE2EeMsg) {
        this.inlineInitialPayloadInE2EeMsg = inlineInitialPayloadInE2EeMsg;
        return this;
    }

    public HistorySyncConfigBuilder recentSyncDaysLimit(java.lang.Integer recentSyncDaysLimit) {
        this.recentSyncDaysLimit = recentSyncDaysLimit;
        return this;
    }

    public HistorySyncConfigBuilder supportCallLogHistory(java.lang.Boolean supportCallLogHistory) {
        this.supportCallLogHistory = supportCallLogHistory;
        return this;
    }

    public HistorySyncConfigBuilder supportBotUserAgentChatHistory(java.lang.Boolean supportBotUserAgentChatHistory) {
        this.supportBotUserAgentChatHistory = supportBotUserAgentChatHistory;
        return this;
    }

    public it.auties.whatsapp.model.sync.HistorySyncConfig build() {
        return new it.auties.whatsapp.model.sync.HistorySyncConfig(fullSyncDaysLimit, fullSyncSizeMbLimit, storageQuotaMb, inlineInitialPayloadInE2EeMsg, recentSyncDaysLimit, supportCallLogHistory, supportBotUserAgentChatHistory);
    }

}
