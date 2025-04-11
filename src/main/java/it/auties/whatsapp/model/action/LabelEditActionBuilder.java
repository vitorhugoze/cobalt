package it.auties.whatsapp.model.action;

public class LabelEditActionBuilder {
    private java.lang.String name;
    private int color;
    private int id;
    private boolean deleted;

    public LabelEditActionBuilder() {
        name = null;
        color = 0;
        id = 0;
        deleted = false;
    }

    public LabelEditActionBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public LabelEditActionBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public LabelEditActionBuilder color(int color) {
        this.color = color;
        return this;
    }

    public LabelEditActionBuilder id(int id) {
        this.id = id;
        return this;
    }

    public LabelEditActionBuilder deleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public it.auties.whatsapp.model.action.LabelEditAction build() {
        return new it.auties.whatsapp.model.action.LabelEditAction(name, color, id, deleted);
    }

}
