package it.auties.whatsapp.model.message.standard;

public class ReactionMessageBuilder {
    private it.auties.whatsapp.model.message.model.ChatMessageKey key;
    private java.lang.String content;
    private java.util.Optional<java.lang.String> groupingKey;
    private long timestampSeconds;

    public ReactionMessageBuilder() {
        key = null;
        content = null;
        groupingKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        timestampSeconds = 0l;
    }

    public ReactionMessageBuilder key(it.auties.whatsapp.model.message.model.ChatMessageKey key) {
        this.key = key;
        return this;
    }

    public ReactionMessageBuilder content(it.auties.protobuf.model.ProtobufString content) {
        this.content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(content);
        return this;
    }

    public ReactionMessageBuilder content(java.lang.String content) {
        this.content = content;
        return this;
    }

    public ReactionMessageBuilder groupingKey(it.auties.protobuf.model.ProtobufString groupingKey) {
        this.groupingKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(groupingKey));
        return this;
    }

    public ReactionMessageBuilder groupingKey(java.lang.String groupingKey) {
        this.groupingKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(groupingKey);
        return this;
    }

    public ReactionMessageBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.ReactionMessage build() {
        return new it.auties.whatsapp.model.message.standard.ReactionMessage(key, content, groupingKey, timestampSeconds);
    }

}
