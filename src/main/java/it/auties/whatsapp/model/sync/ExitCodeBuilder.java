package it.auties.whatsapp.model.sync;

public class ExitCodeBuilder {
    private long code;
    private java.lang.String text;

    public ExitCodeBuilder() {
        code = 0l;
        text = null;
    }

    public ExitCodeBuilder code(long code) {
        this.code = code;
        return this;
    }

    public ExitCodeBuilder text(it.auties.protobuf.model.ProtobufString text) {
        this.text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(text);
        return this;
    }

    public ExitCodeBuilder text(java.lang.String text) {
        this.text = text;
        return this;
    }

    public it.auties.whatsapp.model.sync.ExitCode build() {
        return new it.auties.whatsapp.model.sync.ExitCode(code, text);
    }

}
