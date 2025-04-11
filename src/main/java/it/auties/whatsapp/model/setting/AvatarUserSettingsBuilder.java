package it.auties.whatsapp.model.setting;

public class AvatarUserSettingsBuilder {
    private java.lang.String facebookId;
    private java.lang.String password;

    public AvatarUserSettingsBuilder() {
        facebookId = null;
        password = null;
    }

    public AvatarUserSettingsBuilder facebookId(it.auties.protobuf.model.ProtobufString facebookId) {
        this.facebookId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(facebookId);
        return this;
    }

    public AvatarUserSettingsBuilder facebookId(java.lang.String facebookId) {
        this.facebookId = facebookId;
        return this;
    }

    public AvatarUserSettingsBuilder password(it.auties.protobuf.model.ProtobufString password) {
        this.password = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(password);
        return this;
    }

    public AvatarUserSettingsBuilder password(java.lang.String password) {
        this.password = password;
        return this;
    }

    public it.auties.whatsapp.model.setting.AvatarUserSettings build() {
        return new it.auties.whatsapp.model.setting.AvatarUserSettings(facebookId, password);
    }

}
