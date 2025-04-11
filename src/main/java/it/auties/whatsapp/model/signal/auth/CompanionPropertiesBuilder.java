package it.auties.whatsapp.model.signal.auth;

public class CompanionPropertiesBuilder {
    private java.lang.String os;
    private it.auties.whatsapp.model.signal.auth.Version version;
    private it.auties.whatsapp.model.signal.auth.CompanionProperties.PlatformType platformType;
    private boolean requireFullSync;
    private it.auties.whatsapp.model.sync.HistorySyncConfig historySyncConfig;

    public CompanionPropertiesBuilder() {
        os = null;
        version = null;
        platformType = null;
        requireFullSync = false;
        historySyncConfig = null;
    }

    public CompanionPropertiesBuilder os(it.auties.protobuf.model.ProtobufString os) {
        this.os = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(os);
        return this;
    }

    public CompanionPropertiesBuilder os(java.lang.String os) {
        this.os = os;
        return this;
    }

    public CompanionPropertiesBuilder version(it.auties.whatsapp.model.signal.auth.Version version) {
        this.version = version;
        return this;
    }

    public CompanionPropertiesBuilder platformType(it.auties.whatsapp.model.signal.auth.CompanionProperties.PlatformType platformType) {
        this.platformType = platformType;
        return this;
    }

    public CompanionPropertiesBuilder requireFullSync(boolean requireFullSync) {
        this.requireFullSync = requireFullSync;
        return this;
    }

    public CompanionPropertiesBuilder historySyncConfig(it.auties.whatsapp.model.sync.HistorySyncConfig historySyncConfig) {
        this.historySyncConfig = historySyncConfig;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.CompanionProperties build() {
        return new it.auties.whatsapp.model.signal.auth.CompanionProperties(os, version, platformType, requireFullSync, historySyncConfig);
    }

}
