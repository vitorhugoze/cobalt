package it.auties.whatsapp.model.action;

public class DeleteMessageForMeActionBuilder {
    private boolean deleteMedia;
    private long messageTimestampSeconds;

    public DeleteMessageForMeActionBuilder() {
        deleteMedia = false;
        messageTimestampSeconds = 0l;
    }

    public DeleteMessageForMeActionBuilder deleteMedia(boolean deleteMedia) {
        this.deleteMedia = deleteMedia;
        return this;
    }

    public DeleteMessageForMeActionBuilder messageTimestampSeconds(long messageTimestampSeconds) {
        this.messageTimestampSeconds = messageTimestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.action.DeleteMessageForMeAction build() {
        return new it.auties.whatsapp.model.action.DeleteMessageForMeAction(deleteMedia, messageTimestampSeconds);
    }

}
