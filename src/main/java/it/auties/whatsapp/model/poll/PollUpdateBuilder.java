package it.auties.whatsapp.model.poll;

public class PollUpdateBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey pollUpdateMessageKey;
    private it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions vote;
    private long senderTimestampMilliseconds;

    public PollUpdateBuilder() {
        pollUpdateMessageKey = null;
        vote = null;
        senderTimestampMilliseconds = 0l;
    }

    public PollUpdateBuilder pollUpdateMessageKey(it.auties.whatsapp.model.message.model.ChatMessageKey pollUpdateMessageKey) {
        this.pollUpdateMessageKey = pollUpdateMessageKey;
        return this;
    }

    public PollUpdateBuilder vote(it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions vote) {
        this.vote = vote;
        return this;
    }

    public PollUpdateBuilder senderTimestampMilliseconds(long senderTimestampMilliseconds) {
        this.senderTimestampMilliseconds = senderTimestampMilliseconds;
        return this;
    }

    public it.auties.whatsapp.model.poll.PollUpdate build() {
        return new it.auties.whatsapp.model.poll.PollUpdate(pollUpdateMessageKey, vote, senderTimestampMilliseconds);
    }

}
