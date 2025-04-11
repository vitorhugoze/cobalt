package it.auties.whatsapp.model.button.base;

public class ButtonActionLinkBuilder {
    private java.lang.String url;
    private java.lang.String buttonTitle;

    public ButtonActionLinkBuilder() {
        url = null;
        buttonTitle = null;
    }

    public ButtonActionLinkBuilder url(it.auties.protobuf.model.ProtobufString url) {
        this.url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(url);
        return this;
    }

    public ButtonActionLinkBuilder url(java.lang.String url) {
        this.url = url;
        return this;
    }

    public ButtonActionLinkBuilder buttonTitle(it.auties.protobuf.model.ProtobufString buttonTitle) {
        this.buttonTitle = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(buttonTitle);
        return this;
    }

    public ButtonActionLinkBuilder buttonTitle(java.lang.String buttonTitle) {
        this.buttonTitle = buttonTitle;
        return this;
    }

    public it.auties.whatsapp.model.button.base.ButtonActionLink build() {
        return new it.auties.whatsapp.model.button.base.ButtonActionLink(url, buttonTitle);
    }

}
