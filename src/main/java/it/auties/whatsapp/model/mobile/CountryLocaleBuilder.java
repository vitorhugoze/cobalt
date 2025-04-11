package it.auties.whatsapp.model.mobile;

public class CountryLocaleBuilder {
    private java.lang.String languageValue;
    private java.lang.String languageCode;
    private java.lang.String separator;

    public CountryLocaleBuilder() {
        languageValue = null;
        languageCode = null;
        separator = null;
    }

    public CountryLocaleBuilder languageValue(it.auties.protobuf.model.ProtobufString languageValue) {
        this.languageValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(languageValue);
        return this;
    }

    public CountryLocaleBuilder languageValue(java.lang.String languageValue) {
        this.languageValue = languageValue;
        return this;
    }

    public CountryLocaleBuilder languageCode(it.auties.protobuf.model.ProtobufString languageCode) {
        this.languageCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(languageCode);
        return this;
    }

    public CountryLocaleBuilder languageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public CountryLocaleBuilder separator(it.auties.protobuf.model.ProtobufString separator) {
        this.separator = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(separator);
        return this;
    }

    public CountryLocaleBuilder separator(java.lang.String separator) {
        this.separator = separator;
        return this;
    }

    public it.auties.whatsapp.model.mobile.CountryLocale build() {
        return new it.auties.whatsapp.model.mobile.CountryLocale(languageValue, languageCode, separator);
    }

}
