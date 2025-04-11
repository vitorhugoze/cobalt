package it.auties.whatsapp.model.button.template.hydrated;

public class HydratedFourRowTemplateBuilder {
    private java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> titleDocument;
    private java.util.Optional<it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTextTitle> titleText;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> titleImage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> titleVideo;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.LocationMessage> titleLocation;
    private java.lang.String body;
    private java.util.Optional<java.lang.String> footer;
    private java.util.List<it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton> hydratedButtons;
    private java.lang.String templateId;

    public HydratedFourRowTemplateBuilder() {
        titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleText = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        body = null;
        footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        hydratedButtons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        templateId = null;
    }

    public HydratedFourRowTemplateBuilder titleDocument(it.auties.whatsapp.model.message.standard.DocumentMessage titleDocument) {
        this.titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleDocument);
        return this;
    }

    public HydratedFourRowTemplateBuilder titleText(it.auties.protobuf.model.ProtobufString titleText) {
        this.titleText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTextTitle.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(titleText)));
        return this;
    }

    public HydratedFourRowTemplateBuilder titleText(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTextTitle titleText) {
        this.titleText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleText);
        return this;
    }

    public HydratedFourRowTemplateBuilder titleImage(it.auties.whatsapp.model.message.standard.ImageMessage titleImage) {
        this.titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleImage);
        return this;
    }

    public HydratedFourRowTemplateBuilder titleVideo(it.auties.whatsapp.model.message.standard.VideoOrGifMessage titleVideo) {
        this.titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleVideo);
        return this;
    }

    public HydratedFourRowTemplateBuilder titleLocation(it.auties.whatsapp.model.message.standard.LocationMessage titleLocation) {
        this.titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(titleLocation);
        return this;
    }

    public HydratedFourRowTemplateBuilder body(it.auties.protobuf.model.ProtobufString body) {
        this.body = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(body);
        return this;
    }

    public HydratedFourRowTemplateBuilder body(java.lang.String body) {
        this.body = body;
        return this;
    }

    public HydratedFourRowTemplateBuilder footer(it.auties.protobuf.model.ProtobufString footer) {
        this.footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(footer));
        return this;
    }

    public HydratedFourRowTemplateBuilder footer(java.lang.String footer) {
        this.footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(footer);
        return this;
    }

    public HydratedFourRowTemplateBuilder hydratedButtons(java.util.List<it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton> hydratedButtons) {
        this.hydratedButtons = hydratedButtons;
        return this;
    }

    public HydratedFourRowTemplateBuilder templateId(it.auties.protobuf.model.ProtobufString templateId) {
        this.templateId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(templateId);
        return this;
    }

    public HydratedFourRowTemplateBuilder templateId(java.lang.String templateId) {
        this.templateId = templateId;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate build() {
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate(titleDocument, titleText, titleImage, titleVideo, titleLocation, body, footer, hydratedButtons, templateId);
    }

}
