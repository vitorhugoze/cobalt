package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredLocalizableParameterBuilder {
    private java.lang.String defaultValue;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency> parameterCurrency;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime> parameterDateTime;

    public HighlyStructuredLocalizableParameterBuilder() {
        defaultValue = null;
        parameterCurrency = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        parameterDateTime = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public HighlyStructuredLocalizableParameterBuilder defaultValue(it.auties.protobuf.model.ProtobufString defaultValue) {
        this.defaultValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(defaultValue);
        return this;
    }

    public HighlyStructuredLocalizableParameterBuilder defaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public HighlyStructuredLocalizableParameterBuilder parameterCurrency(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency parameterCurrency) {
        this.parameterCurrency = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(parameterCurrency);
        return this;
    }

    public HighlyStructuredLocalizableParameterBuilder parameterDateTime(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime parameterDateTime) {
        this.parameterDateTime = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(parameterDateTime);
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameter build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameter(defaultValue, parameterCurrency, parameterDateTime);
    }

}
