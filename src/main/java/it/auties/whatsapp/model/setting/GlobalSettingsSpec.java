package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.GlobalSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class GlobalSettingsSpec {
    public static byte[] encode(GlobalSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(GlobalSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var lightThemeWallpaper = protoInputObject.lightThemeWallpaper();
        if (lightThemeWallpaper != null) {
            var lightThemeWallpaper0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(lightThemeWallpaper);
            if (lightThemeWallpaper0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.chat.ChatWallpaperSpec.sizeOf(lightThemeWallpaper0));
                it.auties.whatsapp.model.chat.ChatWallpaperSpec.encode(lightThemeWallpaper0, protoOutputStream);
            }
        }
        var mediaVisibility = protoInputObject.mediaVisibility();
        if (mediaVisibility != null) {
            var mediaVisibility0 = it.auties.whatsapp.model.media.MediaVisibilitySpec.encode(mediaVisibility);
            protoOutputStream.writeInt32(2, mediaVisibility0);
        }
        var darkThemeWallpaper = protoInputObject.darkThemeWallpaper();
        if (darkThemeWallpaper != null) {
            var darkThemeWallpaper0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(darkThemeWallpaper);
            if (darkThemeWallpaper0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.chat.ChatWallpaperSpec.sizeOf(darkThemeWallpaper0));
                it.auties.whatsapp.model.chat.ChatWallpaperSpec.encode(darkThemeWallpaper0, protoOutputStream);
            }
        }
        var autoDownloadWiFi = protoInputObject.autoDownloadWiFi();
        if (autoDownloadWiFi != null) {
            var autoDownloadWiFi0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(autoDownloadWiFi);
            if (autoDownloadWiFi0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.sizeOf(autoDownloadWiFi0));
                it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.encode(autoDownloadWiFi0, protoOutputStream);
            }
        }
        var autoDownloadCellular = protoInputObject.autoDownloadCellular();
        if (autoDownloadCellular != null) {
            var autoDownloadCellular0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(autoDownloadCellular);
            if (autoDownloadCellular0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.sizeOf(autoDownloadCellular0));
                it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.encode(autoDownloadCellular0, protoOutputStream);
            }
        }
        var autoDownloadRoaming = protoInputObject.autoDownloadRoaming();
        if (autoDownloadRoaming != null) {
            var autoDownloadRoaming0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(autoDownloadRoaming);
            if (autoDownloadRoaming0 != null) {
                protoOutputStream.writeMessage(6, it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.sizeOf(autoDownloadRoaming0));
                it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.encode(autoDownloadRoaming0, protoOutputStream);
            }
        }
        var showIndividualNotificationsPreview = protoInputObject.showIndividualNotificationsPreview();
        protoOutputStream.writeBool(7, showIndividualNotificationsPreview);
        var showGroupNotificationsPreview = protoInputObject.showGroupNotificationsPreview();
        protoOutputStream.writeBool(8, showGroupNotificationsPreview);
        var disappearingModeDuration = protoInputObject.disappearingModeDuration();
        protoOutputStream.writeInt32(9, disappearingModeDuration);
        var disappearingModeTimestampSeconds = protoInputObject.disappearingModeTimestampSeconds();
        protoOutputStream.writeInt64(10, disappearingModeTimestampSeconds);
        var avatarUserSettings = protoInputObject.avatarUserSettings();
        if (avatarUserSettings != null) {
            protoOutputStream.writeMessage(11, it.auties.whatsapp.model.setting.AvatarUserSettingsSpec.sizeOf(avatarUserSettings));
            it.auties.whatsapp.model.setting.AvatarUserSettingsSpec.encode(avatarUserSettings, protoOutputStream);
        }
    }

    public static GlobalSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static GlobalSettings decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.chat.ChatWallpaper> lightThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.media.MediaVisibility mediaVisibility = null;
        java.util.Optional<it.auties.whatsapp.model.chat.ChatWallpaper> darkThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.AutoDownloadSettings> autoDownloadWiFi = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.AutoDownloadSettings> autoDownloadCellular = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.AutoDownloadSettings> autoDownloadRoaming = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        boolean showIndividualNotificationsPreview = false;
        boolean showGroupNotificationsPreview = false;
        int disappearingModeDuration = 0;
        long disappearingModeTimestampSeconds = 0l;
        it.auties.whatsapp.model.setting.AvatarUserSettings avatarUserSettings = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> lightThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.chat.ChatWallpaperSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> mediaVisibility = it.auties.whatsapp.model.media.MediaVisibilitySpec.decode(protoInputStream.readInt32());
                case 3 -> darkThemeWallpaper = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.chat.ChatWallpaperSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> autoDownloadWiFi = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> autoDownloadCellular = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> autoDownloadRoaming = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 7 -> showIndividualNotificationsPreview = protoInputStream.readBool();
                case 8 -> showGroupNotificationsPreview = protoInputStream.readBool();
                case 9 -> disappearingModeDuration = protoInputStream.readInt32();
                case 10 -> disappearingModeTimestampSeconds = protoInputStream.readInt64();
                case 11 -> avatarUserSettings = it.auties.whatsapp.model.setting.AvatarUserSettingsSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.GlobalSettings(lightThemeWallpaper, mediaVisibility, darkThemeWallpaper, autoDownloadWiFi, autoDownloadCellular, autoDownloadRoaming, showIndividualNotificationsPreview, showGroupNotificationsPreview, disappearingModeDuration, disappearingModeTimestampSeconds, avatarUserSettings);
    }

    public static int sizeOf(GlobalSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var lightThemeWallpaper = protoInputObject.lightThemeWallpaper();
        if (lightThemeWallpaper != null) {
            var lightThemeWallpaper0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(lightThemeWallpaper);
            if (lightThemeWallpaper0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var lightThemeWallpaperSerializedSize = it.auties.whatsapp.model.chat.ChatWallpaperSpec.sizeOf(lightThemeWallpaper0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(lightThemeWallpaperSerializedSize);
                protoOutputSize += lightThemeWallpaperSerializedSize;
            }
        }
        var mediaVisibility = protoInputObject.mediaVisibility();
        if (mediaVisibility != null) {
            var mediaVisibility0 = it.auties.whatsapp.model.media.MediaVisibilitySpec.encode(mediaVisibility);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaVisibility0);
        }
        var darkThemeWallpaper = protoInputObject.darkThemeWallpaper();
        if (darkThemeWallpaper != null) {
            var darkThemeWallpaper0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(darkThemeWallpaper);
            if (darkThemeWallpaper0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var darkThemeWallpaperSerializedSize = it.auties.whatsapp.model.chat.ChatWallpaperSpec.sizeOf(darkThemeWallpaper0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(darkThemeWallpaperSerializedSize);
                protoOutputSize += darkThemeWallpaperSerializedSize;
            }
        }
        var autoDownloadWiFi = protoInputObject.autoDownloadWiFi();
        if (autoDownloadWiFi != null) {
            var autoDownloadWiFi0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(autoDownloadWiFi);
            if (autoDownloadWiFi0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var autoDownloadWiFiSerializedSize = it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.sizeOf(autoDownloadWiFi0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(autoDownloadWiFiSerializedSize);
                protoOutputSize += autoDownloadWiFiSerializedSize;
            }
        }
        var autoDownloadCellular = protoInputObject.autoDownloadCellular();
        if (autoDownloadCellular != null) {
            var autoDownloadCellular0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(autoDownloadCellular);
            if (autoDownloadCellular0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var autoDownloadCellularSerializedSize = it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.sizeOf(autoDownloadCellular0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(autoDownloadCellularSerializedSize);
                protoOutputSize += autoDownloadCellularSerializedSize;
            }
        }
        var autoDownloadRoaming = protoInputObject.autoDownloadRoaming();
        if (autoDownloadRoaming != null) {
            var autoDownloadRoaming0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(autoDownloadRoaming);
            if (autoDownloadRoaming0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                var autoDownloadRoamingSerializedSize = it.auties.whatsapp.model.setting.AutoDownloadSettingsSpec.sizeOf(autoDownloadRoaming0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(autoDownloadRoamingSerializedSize);
                protoOutputSize += autoDownloadRoamingSerializedSize;
            }
        }
        var showIndividualNotificationsPreview = protoInputObject.showIndividualNotificationsPreview();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += 1;
        var showGroupNotificationsPreview = protoInputObject.showGroupNotificationsPreview();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += 1;
        var disappearingModeDuration = protoInputObject.disappearingModeDuration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(disappearingModeDuration);
        var disappearingModeTimestampSeconds = protoInputObject.disappearingModeTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(disappearingModeTimestampSeconds);
        var avatarUserSettings = protoInputObject.avatarUserSettings();
        if (avatarUserSettings != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
            var avatarUserSettingsSerializedSize = it.auties.whatsapp.model.setting.AvatarUserSettingsSpec.sizeOf(avatarUserSettings);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(avatarUserSettingsSerializedSize);
            protoOutputSize += avatarUserSettingsSerializedSize;
        }
        return protoOutputSize;
    }

}
