package it.auties.whatsapp.model.button.template.hydrated;

public class HydratedCallButtonBuilder {
    private java.lang.String text;
    private java.lang.String phoneNumber;

    public HydratedCallButtonBuilder() {
        text = null;
        phoneNumber = null;
    }

    public HydratedCallButtonBuilder text(it.auties.protobuf.model.ProtobufString text) {
        this.text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(text);
        return this;
    }

    public HydratedCallButtonBuilder text(java.lang.String text) {
        this.text = text;
        return this;
    }

    public HydratedCallButtonBuilder phoneNumber(it.auties.protobuf.model.ProtobufString phoneNumber) {
        this.phoneNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(phoneNumber);
        return this;
    }

    public HydratedCallButtonBuilder phoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hydrated.HydratedCallButton build() {
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedCallButton(text, phoneNumber);
    }

}
