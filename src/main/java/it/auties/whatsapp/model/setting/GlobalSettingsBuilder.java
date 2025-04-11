package it.auties.whatsapp.model.setting;

public class GlobalSettingsBuilder {
    private java.util.Optional<it.auties.whatsapp.model.chat.ChatWallpaper> lightThemeWallpaper;
    private it.auties.whatsapp.model.media.MediaVisibility mediaVisibility;
    private java.util.Optional<it.auties.whatsapp.model.chat.ChatWallpaper> darkThemeWallpaper;
    private java.util.Optional<it.auties.whatsapp.model.setting.AutoDownloadSettings> autoDownloadWiFi;
    private java.util.Optional<it.auties.whatsapp.model.setting.AutoDownloadSettings> autoDownloadCellular;
    private java.util.Optional<it.auties.whatsapp.model.setting.AutoDownloadSettings> autoDownloadRoaming;
    private boolean showIndividualNotificationsPreview;
    private boolean showGroupNotificationsPreview;
    private int disappearingModeDuration;
    private long disappearingModeTimestampSeconds;
    private it.auties.whatsapp.model.setting.AvatarUserSettings avatarUserSettings;

    public GlobalSettingsBuilder() {
        lightThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        mediaVisibility = null;
        darkThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        autoDownloadWiFi = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        autoDownloadCellular = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        autoDownloadRoaming = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        showIndividualNotificationsPreview = false;
        showGroupNotificationsPreview = false;
        disappearingModeDuration = 0;
        disappearingModeTimestampSeconds = 0l;
        avatarUserSettings = null;
    }

    public GlobalSettingsBuilder lightThemeWallpaper(it.auties.whatsapp.model.chat.ChatWallpaper lightThemeWallpaper) {
        this.lightThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(lightThemeWallpaper);
        return this;
    }

    public GlobalSettingsBuilder mediaVisibility(it.auties.whatsapp.model.media.MediaVisibility mediaVisibility) {
        this.mediaVisibility = mediaVisibility;
        return this;
    }

    public GlobalSettingsBuilder darkThemeWallpaper(it.auties.whatsapp.model.chat.ChatWallpaper darkThemeWallpaper) {
        this.darkThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(darkThemeWallpaper);
        return this;
    }

    public GlobalSettingsBuilder autoDownloadWiFi(it.auties.whatsapp.model.setting.AutoDownloadSettings autoDownloadWiFi) {
        this.autoDownloadWiFi = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(autoDownloadWiFi);
        return this;
    }

    public GlobalSettingsBuilder autoDownloadCellular(it.auties.whatsapp.model.setting.AutoDownloadSettings autoDownloadCellular) {
        this.autoDownloadCellular = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(autoDownloadCellular);
        return this;
    }

    public GlobalSettingsBuilder autoDownloadRoaming(it.auties.whatsapp.model.setting.AutoDownloadSettings autoDownloadRoaming) {
        this.autoDownloadRoaming = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(autoDownloadRoaming);
        return this;
    }

    public GlobalSettingsBuilder showIndividualNotificationsPreview(boolean showIndividualNotificationsPreview) {
        this.showIndividualNotificationsPreview = showIndividualNotificationsPreview;
        return this;
    }

    public GlobalSettingsBuilder showGroupNotificationsPreview(boolean showGroupNotificationsPreview) {
        this.showGroupNotificationsPreview = showGroupNotificationsPreview;
        return this;
    }

    public GlobalSettingsBuilder disappearingModeDuration(int disappearingModeDuration) {
        this.disappearingModeDuration = disappearingModeDuration;
        return this;
    }

    public GlobalSettingsBuilder disappearingModeTimestampSeconds(long disappearingModeTimestampSeconds) {
        this.disappearingModeTimestampSeconds = disappearingModeTimestampSeconds;
        return this;
    }

    public GlobalSettingsBuilder avatarUserSettings(it.auties.whatsapp.model.setting.AvatarUserSettings avatarUserSettings) {
        this.avatarUserSettings = avatarUserSettings;
        return this;
    }

    public it.auties.whatsapp.model.setting.GlobalSettings build() {
        return new it.auties.whatsapp.model.setting.GlobalSettings(lightThemeWallpaper, mediaVisibility, darkThemeWallpaper, autoDownloadWiFi, autoDownloadCellular, autoDownloadRoaming, showIndividualNotificationsPreview, showGroupNotificationsPreview, disappearingModeDuration, disappearingModeTimestampSeconds, avatarUserSettings);
    }

}
