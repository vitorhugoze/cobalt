package it.auties.whatsapp.model.signal.auth;

public class UserAgentBuilder {
    private it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType platform;
    private it.auties.whatsapp.model.signal.auth.Version appVersion;
    private java.lang.String mcc;
    private java.lang.String mnc;
    private java.lang.String osVersion;
    private java.lang.String manufacturer;
    private java.lang.String device;
    private java.lang.String osBuildNumber;
    private java.lang.String phoneId;
    private it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel releaseChannel;
    private java.lang.String localeLanguageIso6391;
    private java.lang.String localeCountryIso31661Alpha2;
    private java.lang.String deviceBoard;
    private it.auties.whatsapp.model.signal.auth.UserAgent.DeviceType deviceType;
    private java.lang.String deviceModelType;

    public UserAgentBuilder() {
        platform = null;
        appVersion = null;
        mcc = null;
        mnc = null;
        osVersion = null;
        manufacturer = null;
        device = null;
        osBuildNumber = null;
        phoneId = null;
        releaseChannel = null;
        localeLanguageIso6391 = null;
        localeCountryIso31661Alpha2 = null;
        deviceBoard = null;
        deviceType = null;
        deviceModelType = null;
    }

    public UserAgentBuilder platform(it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType platform) {
        this.platform = platform;
        return this;
    }

    public UserAgentBuilder appVersion(it.auties.whatsapp.model.signal.auth.Version appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    public UserAgentBuilder mcc(it.auties.protobuf.model.ProtobufString mcc) {
        this.mcc = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mcc);
        return this;
    }

    public UserAgentBuilder mcc(java.lang.String mcc) {
        this.mcc = mcc;
        return this;
    }

    public UserAgentBuilder mnc(it.auties.protobuf.model.ProtobufString mnc) {
        this.mnc = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mnc);
        return this;
    }

    public UserAgentBuilder mnc(java.lang.String mnc) {
        this.mnc = mnc;
        return this;
    }

    public UserAgentBuilder osVersion(it.auties.protobuf.model.ProtobufString osVersion) {
        this.osVersion = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(osVersion);
        return this;
    }

    public UserAgentBuilder osVersion(java.lang.String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public UserAgentBuilder manufacturer(it.auties.protobuf.model.ProtobufString manufacturer) {
        this.manufacturer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(manufacturer);
        return this;
    }

    public UserAgentBuilder manufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public UserAgentBuilder device(it.auties.protobuf.model.ProtobufString device) {
        this.device = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(device);
        return this;
    }

    public UserAgentBuilder device(java.lang.String device) {
        this.device = device;
        return this;
    }

    public UserAgentBuilder osBuildNumber(it.auties.protobuf.model.ProtobufString osBuildNumber) {
        this.osBuildNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(osBuildNumber);
        return this;
    }

    public UserAgentBuilder osBuildNumber(java.lang.String osBuildNumber) {
        this.osBuildNumber = osBuildNumber;
        return this;
    }

    public UserAgentBuilder phoneId(it.auties.protobuf.model.ProtobufString phoneId) {
        this.phoneId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(phoneId);
        return this;
    }

    public UserAgentBuilder phoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    public UserAgentBuilder releaseChannel(it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel releaseChannel) {
        this.releaseChannel = releaseChannel;
        return this;
    }

    public UserAgentBuilder localeLanguageIso6391(it.auties.protobuf.model.ProtobufString localeLanguageIso6391) {
        this.localeLanguageIso6391 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(localeLanguageIso6391);
        return this;
    }

    public UserAgentBuilder localeLanguageIso6391(java.lang.String localeLanguageIso6391) {
        this.localeLanguageIso6391 = localeLanguageIso6391;
        return this;
    }

    public UserAgentBuilder localeCountryIso31661Alpha2(it.auties.protobuf.model.ProtobufString localeCountryIso31661Alpha2) {
        this.localeCountryIso31661Alpha2 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(localeCountryIso31661Alpha2);
        return this;
    }

    public UserAgentBuilder localeCountryIso31661Alpha2(java.lang.String localeCountryIso31661Alpha2) {
        this.localeCountryIso31661Alpha2 = localeCountryIso31661Alpha2;
        return this;
    }

    public UserAgentBuilder deviceBoard(it.auties.protobuf.model.ProtobufString deviceBoard) {
        this.deviceBoard = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(deviceBoard);
        return this;
    }

    public UserAgentBuilder deviceBoard(java.lang.String deviceBoard) {
        this.deviceBoard = deviceBoard;
        return this;
    }

    public UserAgentBuilder deviceType(it.auties.whatsapp.model.signal.auth.UserAgent.DeviceType deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    public UserAgentBuilder deviceModelType(it.auties.protobuf.model.ProtobufString deviceModelType) {
        this.deviceModelType = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(deviceModelType);
        return this;
    }

    public UserAgentBuilder deviceModelType(java.lang.String deviceModelType) {
        this.deviceModelType = deviceModelType;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.UserAgent build() {
        return new it.auties.whatsapp.model.signal.auth.UserAgent(platform, appVersion, mcc, mnc, osVersion, manufacturer, device, osBuildNumber, phoneId, releaseChannel, localeLanguageIso6391, localeCountryIso31661Alpha2, deviceBoard, deviceType, deviceModelType);
    }

}
