package it.auties.whatsapp.model.companion;

public class CompanionDeviceBuilder {
    private java.lang.String model;
    private java.lang.String manufacturer;
    private it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType platform;
    private it.auties.whatsapp.model.signal.auth.Version appVersion;
    private it.auties.whatsapp.model.signal.auth.Version osVersion;
    private java.lang.String osBuildNumber;
    private java.lang.String address;
    private java.lang.String modelId;
    private it.auties.whatsapp.api.ClientType clientType;

    public CompanionDeviceBuilder() {
        model = null;
        manufacturer = null;
        platform = null;
        appVersion = null;
        osVersion = null;
        osBuildNumber = null;
        address = null;
        modelId = null;
        clientType = null;
    }

    public CompanionDeviceBuilder model(it.auties.protobuf.model.ProtobufString model) {
        this.model = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(model);
        return this;
    }

    public CompanionDeviceBuilder model(java.lang.String model) {
        this.model = model;
        return this;
    }

    public CompanionDeviceBuilder manufacturer(it.auties.protobuf.model.ProtobufString manufacturer) {
        this.manufacturer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(manufacturer);
        return this;
    }

    public CompanionDeviceBuilder manufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public CompanionDeviceBuilder platform(it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType platform) {
        this.platform = platform;
        return this;
    }

    public CompanionDeviceBuilder appVersion(it.auties.whatsapp.model.signal.auth.Version appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    public CompanionDeviceBuilder osVersion(it.auties.whatsapp.model.signal.auth.Version osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public CompanionDeviceBuilder osBuildNumber(it.auties.protobuf.model.ProtobufString osBuildNumber) {
        this.osBuildNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(osBuildNumber);
        return this;
    }

    public CompanionDeviceBuilder osBuildNumber(java.lang.String osBuildNumber) {
        this.osBuildNumber = osBuildNumber;
        return this;
    }

    public CompanionDeviceBuilder address(it.auties.protobuf.model.ProtobufString address) {
        this.address = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(address);
        return this;
    }

    public CompanionDeviceBuilder address(java.lang.String address) {
        this.address = address;
        return this;
    }

    public CompanionDeviceBuilder modelId(it.auties.protobuf.model.ProtobufString modelId) {
        this.modelId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(modelId);
        return this;
    }

    public CompanionDeviceBuilder modelId(java.lang.String modelId) {
        this.modelId = modelId;
        return this;
    }

    public CompanionDeviceBuilder clientType(it.auties.whatsapp.api.ClientType clientType) {
        this.clientType = clientType;
        return this;
    }

    public it.auties.whatsapp.model.companion.CompanionDevice build() {
        return new it.auties.whatsapp.model.companion.CompanionDevice(model, manufacturer, platform, appVersion, osVersion, osBuildNumber, address, modelId, clientType);
    }

}
