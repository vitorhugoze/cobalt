package it.auties.whatsapp.model.button.template.hsm;

public class HighlyStructuredButtonTemplateBuilder {
    private java.util.Optional<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton> highlyStructuredQuickReplyButton;
    private java.util.Optional<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton> highlyStructuredUrlButton;
    private java.util.Optional<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButton> highlyStructuredCallButton;
    private int index;

    public HighlyStructuredButtonTemplateBuilder() {
        highlyStructuredQuickReplyButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        highlyStructuredUrlButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        highlyStructuredCallButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        index = 0;
    }

    public HighlyStructuredButtonTemplateBuilder highlyStructuredQuickReplyButton(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton highlyStructuredQuickReplyButton) {
        this.highlyStructuredQuickReplyButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredQuickReplyButton);
        return this;
    }

    public HighlyStructuredButtonTemplateBuilder highlyStructuredUrlButton(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton highlyStructuredUrlButton) {
        this.highlyStructuredUrlButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredUrlButton);
        return this;
    }

    public HighlyStructuredButtonTemplateBuilder highlyStructuredCallButton(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButton highlyStructuredCallButton) {
        this.highlyStructuredCallButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredCallButton);
        return this;
    }

    public HighlyStructuredButtonTemplateBuilder index(int index) {
        this.index = index;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate build() {
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate(highlyStructuredQuickReplyButton, highlyStructuredUrlButton, highlyStructuredCallButton, index);
    }

}
