package it.auties.whatsapp.model.setting;

public class LocaleSettingsBuilder {
    private java.lang.String locale;

    public LocaleSettingsBuilder() {
        locale = null;
    }

    public LocaleSettingsBuilder locale(it.auties.protobuf.model.ProtobufString locale) {
        this.locale = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(locale);
        return this;
    }

    public LocaleSettingsBuilder locale(java.lang.String locale) {
        this.locale = locale;
        return this;
    }

    public it.auties.whatsapp.model.setting.LocaleSettings build() {
        return new it.auties.whatsapp.model.setting.LocaleSettings(locale);
    }

}
