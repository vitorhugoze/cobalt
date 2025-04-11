package it.auties.whatsapp.model.message.button;

public class ButtonsMessageBuilder {
    private it.auties.whatsapp.model.message.button.ButtonsMessageHeaderText headerText;
    private it.auties.whatsapp.model.message.standard.DocumentMessage headerDocument;
    private it.auties.whatsapp.model.message.standard.ImageMessage headerImage;
    private it.auties.whatsapp.model.message.standard.VideoOrGifMessage headerVideo;
    private it.auties.whatsapp.model.message.standard.LocationMessage headerLocation;
    private java.lang.String body;
    private java.lang.String footer;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.util.List<it.auties.whatsapp.model.button.base.Button> buttons;
    private it.auties.whatsapp.model.message.button.ButtonsMessageHeader.Type headerType;

    public ButtonsMessageBuilder() {
        headerText = null;
        headerDocument = null;
        headerImage = null;
        headerVideo = null;
        headerLocation = null;
        body = null;
        footer = null;
        contextInfo = null;
        buttons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        headerType = null;
    }

    public ButtonsMessageBuilder headerText(it.auties.protobuf.model.ProtobufString headerText) {
        this.headerText = it.auties.whatsapp.model.message.button.ButtonsMessageHeaderText.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(headerText));
        return this;
    }

    public ButtonsMessageBuilder headerText(it.auties.whatsapp.model.message.button.ButtonsMessageHeaderText headerText) {
        this.headerText = headerText;
        return this;
    }

    public ButtonsMessageBuilder headerDocument(it.auties.whatsapp.model.message.standard.DocumentMessage headerDocument) {
        this.headerDocument = headerDocument;
        return this;
    }

    public ButtonsMessageBuilder headerImage(it.auties.whatsapp.model.message.standard.ImageMessage headerImage) {
        this.headerImage = headerImage;
        return this;
    }

    public ButtonsMessageBuilder headerVideo(it.auties.whatsapp.model.message.standard.VideoOrGifMessage headerVideo) {
        this.headerVideo = headerVideo;
        return this;
    }

    public ButtonsMessageBuilder headerLocation(it.auties.whatsapp.model.message.standard.LocationMessage headerLocation) {
        this.headerLocation = headerLocation;
        return this;
    }

    public ButtonsMessageBuilder body(it.auties.protobuf.model.ProtobufString body) {
        this.body = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(body);
        return this;
    }

    public ButtonsMessageBuilder body(java.lang.String body) {
        this.body = body;
        return this;
    }

    public ButtonsMessageBuilder footer(it.auties.protobuf.model.ProtobufString footer) {
        this.footer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(footer);
        return this;
    }

    public ButtonsMessageBuilder footer(java.lang.String footer) {
        this.footer = footer;
        return this;
    }

    public ButtonsMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public ButtonsMessageBuilder buttons(java.util.List<it.auties.whatsapp.model.button.base.Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public ButtonsMessageBuilder headerType(it.auties.whatsapp.model.message.button.ButtonsMessageHeader.Type headerType) {
        this.headerType = headerType;
        return this;
    }

    public it.auties.whatsapp.model.message.button.ButtonsMessage build() {
        return new it.auties.whatsapp.model.message.button.ButtonsMessage(headerText, headerDocument, headerImage, headerVideo, headerLocation, body, footer, contextInfo, buttons, headerType);
    }

}
