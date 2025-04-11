package it.auties.whatsapp.model.poll;

public class PollAdditionalMetadataBuilder {
    private boolean pollInvalidated;

    public PollAdditionalMetadataBuilder() {
        pollInvalidated = false;
    }

    public PollAdditionalMetadataBuilder pollInvalidated(boolean pollInvalidated) {
        this.pollInvalidated = pollInvalidated;
        return this;
    }

    public it.auties.whatsapp.model.poll.PollAdditionalMetadata build() {
        return new it.auties.whatsapp.model.poll.PollAdditionalMetadata(pollInvalidated);
    }

}
