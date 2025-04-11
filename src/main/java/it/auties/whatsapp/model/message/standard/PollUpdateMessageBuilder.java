package it.auties.whatsapp.model.message.standard;

public class PollUpdateMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey pollCreationMessageKey;
    private it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata encryptedMetadata;
    private it.auties.whatsapp.model.poll.PollUpdateMessageMetadata metadata;
    private long senderTimestampMilliseconds;
    private it.auties.whatsapp.model.jid.Jid voter;
    private it.auties.whatsapp.model.message.standard.PollCreationMessage pollCreationMessage;
    private java.util.List<it.auties.whatsapp.model.poll.PollOption> votes;

    public PollUpdateMessageBuilder() {
        pollCreationMessageKey = null;
        encryptedMetadata = null;
        metadata = null;
        senderTimestampMilliseconds = 0l;
        voter = null;
        pollCreationMessage = null;
        votes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public PollUpdateMessageBuilder pollCreationMessageKey(it.auties.whatsapp.model.message.model.ChatMessageKey pollCreationMessageKey) {
        this.pollCreationMessageKey = pollCreationMessageKey;
        return this;
    }

    public PollUpdateMessageBuilder encryptedMetadata(it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata encryptedMetadata) {
        this.encryptedMetadata = encryptedMetadata;
        return this;
    }

    public PollUpdateMessageBuilder metadata(it.auties.whatsapp.model.poll.PollUpdateMessageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public PollUpdateMessageBuilder senderTimestampMilliseconds(long senderTimestampMilliseconds) {
        this.senderTimestampMilliseconds = senderTimestampMilliseconds;
        return this;
    }

    public PollUpdateMessageBuilder voter(it.auties.protobuf.model.ProtobufString voter) {
        this.voter = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(voter));
        return this;
    }

    public PollUpdateMessageBuilder voter(it.auties.whatsapp.model.jid.Jid voter) {
        this.voter = voter;
        return this;
    }

    public PollUpdateMessageBuilder pollCreationMessage(it.auties.whatsapp.model.message.standard.PollCreationMessage pollCreationMessage) {
        this.pollCreationMessage = pollCreationMessage;
        return this;
    }

    public PollUpdateMessageBuilder votes(java.util.List<it.auties.whatsapp.model.poll.PollOption> votes) {
        this.votes = votes;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.PollUpdateMessage build() {
        return new it.auties.whatsapp.model.message.standard.PollUpdateMessage(pollCreationMessageKey, encryptedMetadata, metadata, senderTimestampMilliseconds, voter, pollCreationMessage, votes);
    }

}
