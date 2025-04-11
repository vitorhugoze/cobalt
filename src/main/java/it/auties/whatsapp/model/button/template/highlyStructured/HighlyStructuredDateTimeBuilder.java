package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredDateTimeBuilder {
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent> dateComponent;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpoch> dateUnixEpoch;

    public HighlyStructuredDateTimeBuilder() {
        dateComponent = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        dateUnixEpoch = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public HighlyStructuredDateTimeBuilder dateComponent(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent dateComponent) {
        this.dateComponent = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(dateComponent);
        return this;
    }

    public HighlyStructuredDateTimeBuilder dateUnixEpoch(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpoch dateUnixEpoch) {
        this.dateUnixEpoch = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(dateUnixEpoch);
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime(dateComponent, dateUnixEpoch);
    }

}
