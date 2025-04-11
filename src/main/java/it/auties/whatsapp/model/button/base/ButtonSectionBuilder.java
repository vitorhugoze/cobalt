package it.auties.whatsapp.model.button.base;

public class ButtonSectionBuilder {
    private java.lang.String title;
    private java.util.List<it.auties.whatsapp.model.button.base.ButtonRow> rows;

    public ButtonSectionBuilder() {
        title = null;
        rows = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public ButtonSectionBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public ButtonSectionBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public ButtonSectionBuilder rows(java.util.List<it.auties.whatsapp.model.button.base.ButtonRow> rows) {
        this.rows = rows;
        return this;
    }

    public it.auties.whatsapp.model.button.base.ButtonSection build() {
        return new it.auties.whatsapp.model.button.base.ButtonSection(title, rows);
    }

}
