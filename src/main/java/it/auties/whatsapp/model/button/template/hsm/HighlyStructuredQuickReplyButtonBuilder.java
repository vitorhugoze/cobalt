package it.auties.whatsapp.model.button.template.hsm;

public class HighlyStructuredQuickReplyButtonBuilder {
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text;
    private java.lang.String id;

    public HighlyStructuredQuickReplyButtonBuilder() {
        text = null;
        id = null;
    }

    public HighlyStructuredQuickReplyButtonBuilder text(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text) {
        this.text = text;
        return this;
    }

    public HighlyStructuredQuickReplyButtonBuilder id(it.auties.protobuf.model.ProtobufString id) {
        this.id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(id);
        return this;
    }

    public HighlyStructuredQuickReplyButtonBuilder id(java.lang.String id) {
        this.id = id;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton build() {
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton(text, id);
    }

}
