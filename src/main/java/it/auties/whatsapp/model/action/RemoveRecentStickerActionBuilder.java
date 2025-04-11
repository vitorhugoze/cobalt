package it.auties.whatsapp.model.action;

public class RemoveRecentStickerActionBuilder {
    private long lastStickerSentTimestampSeconds;

    public RemoveRecentStickerActionBuilder() {
        lastStickerSentTimestampSeconds = 0l;
    }

    public RemoveRecentStickerActionBuilder lastStickerSentTimestampSeconds(long lastStickerSentTimestampSeconds) {
        this.lastStickerSentTimestampSeconds = lastStickerSentTimestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.action.RemoveRecentStickerAction build() {
        return new it.auties.whatsapp.model.action.RemoveRecentStickerAction(lastStickerSentTimestampSeconds);
    }

}
