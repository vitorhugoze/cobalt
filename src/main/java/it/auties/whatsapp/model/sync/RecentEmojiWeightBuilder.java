package it.auties.whatsapp.model.sync;

public class RecentEmojiWeightBuilder {
    private java.lang.String emoji;
    private java.lang.Float weight;

    public RecentEmojiWeightBuilder() {
        emoji = null;
        weight = null;
    }

    public RecentEmojiWeightBuilder emoji(it.auties.protobuf.model.ProtobufString emoji) {
        this.emoji = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(emoji);
        return this;
    }

    public RecentEmojiWeightBuilder emoji(java.lang.String emoji) {
        this.emoji = emoji;
        return this;
    }

    public RecentEmojiWeightBuilder weight(java.lang.Float weight) {
        this.weight = weight;
        return this;
    }

    public it.auties.whatsapp.model.sync.RecentEmojiWeight build() {
        return new it.auties.whatsapp.model.sync.RecentEmojiWeight(emoji, weight);
    }

}
