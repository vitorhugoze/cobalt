package it.auties.whatsapp.model.button.interactive;

public class InteractiveResponseBodyBuilder {
    private java.lang.String content;

    public InteractiveResponseBodyBuilder() {
        content = null;
    }

    public InteractiveResponseBodyBuilder content(it.auties.protobuf.model.ProtobufString content) {
        this.content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(content);
        return this;
    }

    public InteractiveResponseBodyBuilder content(java.lang.String content) {
        this.content = content;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveResponseBody build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveResponseBody(content);
    }

}
