package it.auties.whatsapp.model.action;

public class RecentEmojiWeightsActionBuilder {
    private java.util.List<it.auties.whatsapp.model.sync.RecentEmojiWeight> weights;

    public RecentEmojiWeightsActionBuilder() {
        weights = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public RecentEmojiWeightsActionBuilder weights(java.util.List<it.auties.whatsapp.model.sync.RecentEmojiWeight> weights) {
        this.weights = weights;
        return this;
    }

    public it.auties.whatsapp.model.action.RecentEmojiWeightsAction build() {
        return new it.auties.whatsapp.model.action.RecentEmojiWeightsAction(weights);
    }

}
