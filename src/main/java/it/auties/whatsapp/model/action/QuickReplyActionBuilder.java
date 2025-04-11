package it.auties.whatsapp.model.action;

public class QuickReplyActionBuilder {
    private java.lang.String shortcut;
    private java.lang.String message;
    private java.util.List<java.lang.String> keywords;
    private int count;
    private boolean deleted;

    public QuickReplyActionBuilder() {
        shortcut = null;
        message = null;
        keywords = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        count = 0;
        deleted = false;
    }

    public QuickReplyActionBuilder shortcut(it.auties.protobuf.model.ProtobufString shortcut) {
        this.shortcut = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(shortcut);
        return this;
    }

    public QuickReplyActionBuilder shortcut(java.lang.String shortcut) {
        this.shortcut = shortcut;
        return this;
    }

    public QuickReplyActionBuilder message(it.auties.protobuf.model.ProtobufString message) {
        this.message = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(message);
        return this;
    }

    public QuickReplyActionBuilder message(java.lang.String message) {
        this.message = message;
        return this;
    }

    public QuickReplyActionBuilder keywords(java.util.List<java.lang.String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public QuickReplyActionBuilder count(int count) {
        this.count = count;
        return this;
    }

    public QuickReplyActionBuilder deleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public it.auties.whatsapp.model.action.QuickReplyAction build() {
        return new it.auties.whatsapp.model.action.QuickReplyAction(shortcut, message, keywords, count, deleted);
    }

}
