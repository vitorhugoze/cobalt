package it.auties.whatsapp.model.message.standard;

public class PollUpdateMessageSimpleBuilder {
    private it.auties.whatsapp.model.info.ChatMessageInfo poll;
    private java.util.List<it.auties.whatsapp.model.poll.PollOption> votes;

    public PollUpdateMessageSimpleBuilder() {
    }

    public PollUpdateMessageSimpleBuilder poll(it.auties.whatsapp.model.info.ChatMessageInfo poll) {
        this.poll = poll;
        return this;
    }

    public PollUpdateMessageSimpleBuilder votes(java.util.List<it.auties.whatsapp.model.poll.PollOption> votes) {
        this.votes = votes;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.PollUpdateMessage build() {
        return it.auties.whatsapp.model.message.standard.PollUpdateMessage.simpleBuilder(poll, votes);
    }

}
