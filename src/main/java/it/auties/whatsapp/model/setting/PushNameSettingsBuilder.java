package it.auties.whatsapp.model.setting;

public class PushNameSettingsBuilder {
    private java.lang.String name;

    public PushNameSettingsBuilder() {
        name = null;
    }

    public PushNameSettingsBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public PushNameSettingsBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public it.auties.whatsapp.model.setting.PushNameSettings build() {
        return new it.auties.whatsapp.model.setting.PushNameSettings(name);
    }

}
