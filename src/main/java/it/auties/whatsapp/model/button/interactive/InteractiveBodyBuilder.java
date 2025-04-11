package it.auties.whatsapp.model.button.interactive;

public class InteractiveBodyBuilder {
    private java.lang.String content;

    public InteractiveBodyBuilder() {
        content = null;
    }

    public InteractiveBodyBuilder content(it.auties.protobuf.model.ProtobufString content) {
        this.content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(content);
        return this;
    }

    public InteractiveBodyBuilder content(java.lang.String content) {
        this.content = content;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveBody build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveBody(content);
    }

}
