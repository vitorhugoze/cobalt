package it.auties.whatsapp.model.button.template.hsm;

public class HighlyStructuredFourRowTemplateBuilder {
    private java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> titleDocument;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage> titleHighlyStructured;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> titleImage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> titleVideo;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.LocationMessage> titleLocation;
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage content;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage> footer;
    private java.util.List<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate> buttons;

    public HighlyStructuredFourRowTemplateBuilder() {
        titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleHighlyStructured = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        content = null;
        footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        buttons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public HighlyStructuredFourRowTemplateBuilder titleDocument(it.auties.whatsapp.model.message.standard.DocumentMessage titleDocument) {
        this.titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleDocument);
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder titleHighlyStructured(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage titleHighlyStructured) {
        this.titleHighlyStructured = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleHighlyStructured);
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder titleImage(it.auties.whatsapp.model.message.standard.ImageMessage titleImage) {
        this.titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleImage);
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder titleVideo(it.auties.whatsapp.model.message.standard.VideoOrGifMessage titleVideo) {
        this.titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleVideo);
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder titleLocation(it.auties.whatsapp.model.message.standard.LocationMessage titleLocation) {
        this.titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleLocation);
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder content(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage content) {
        this.content = content;
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder footer(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage footer) {
        this.footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(footer);
        return this;
    }

    public HighlyStructuredFourRowTemplateBuilder buttons(java.util.List<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate> buttons) {
        this.buttons = buttons;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate build() {
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate(titleDocument, titleHighlyStructured, titleImage, titleVideo, titleLocation, content, footer, buttons);
    }

}
