package it.auties.whatsapp.model.info;

public class BusinessIdentityInfoBuilder {
    private it.auties.whatsapp.model.info.BusinessIdentityInfo.VerifiedLevel level;
    private it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate certificate;
    private boolean signed;
    private boolean revoked;
    private it.auties.whatsapp.model.info.BusinessIdentityInfo.HostStorageType hostStorage;
    private it.auties.whatsapp.model.info.BusinessIdentityInfo.ActorsType actualActors;
    private long privacyModeTimestampSeconds;
    private long featureControls;

    public BusinessIdentityInfoBuilder() {
        level = null;
        certificate = null;
        signed = false;
        revoked = false;
        hostStorage = null;
        actualActors = null;
        privacyModeTimestampSeconds = 0l;
        featureControls = 0l;
    }

    public BusinessIdentityInfoBuilder level(it.auties.whatsapp.model.info.BusinessIdentityInfo.VerifiedLevel level) {
        this.level = level;
        return this;
    }

    public BusinessIdentityInfoBuilder certificate(it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    public BusinessIdentityInfoBuilder signed(boolean signed) {
        this.signed = signed;
        return this;
    }

    public BusinessIdentityInfoBuilder revoked(boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    public BusinessIdentityInfoBuilder hostStorage(it.auties.whatsapp.model.info.BusinessIdentityInfo.HostStorageType hostStorage) {
        this.hostStorage = hostStorage;
        return this;
    }

    public BusinessIdentityInfoBuilder actualActors(it.auties.whatsapp.model.info.BusinessIdentityInfo.ActorsType actualActors) {
        this.actualActors = actualActors;
        return this;
    }

    public BusinessIdentityInfoBuilder privacyModeTimestampSeconds(long privacyModeTimestampSeconds) {
        this.privacyModeTimestampSeconds = privacyModeTimestampSeconds;
        return this;
    }

    public BusinessIdentityInfoBuilder featureControls(long featureControls) {
        this.featureControls = featureControls;
        return this;
    }

    public it.auties.whatsapp.model.info.BusinessIdentityInfo build() {
        return new it.auties.whatsapp.model.info.BusinessIdentityInfo(level, certificate, signed, revoked, hostStorage, actualActors, privacyModeTimestampSeconds, featureControls);
    }

}
