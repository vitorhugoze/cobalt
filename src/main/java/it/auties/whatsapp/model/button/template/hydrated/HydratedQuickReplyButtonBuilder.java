package it.auties.whatsapp.model.button.template.hydrated;

public class HydratedQuickReplyButtonBuilder {
    private java.lang.String text;
    private java.lang.String id;

    public HydratedQuickReplyButtonBuilder() {
        text = null;
        id = null;
    }

    public HydratedQuickReplyButtonBuilder text(it.auties.protobuf.model.ProtobufString text) {
        this.text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(text);
        return this;
    }

    public HydratedQuickReplyButtonBuilder text(java.lang.String text) {
        this.text = text;
        return this;
    }

    public HydratedQuickReplyButtonBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public HydratedQuickReplyButtonBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButton build() {
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButton(text, id);
    }

}
