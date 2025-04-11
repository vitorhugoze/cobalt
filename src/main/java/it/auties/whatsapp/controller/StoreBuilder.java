package it.auties.whatsapp.controller;

public class StoreBuilder {
    private java.util.UUID uuid;
    private it.auties.whatsapp.model.mobile.PhoneNumber phoneNumber;
    private it.auties.whatsapp.api.ClientType clientType;
    private java.util.Collection<java.lang.String> alias;
    private java.net.URI proxy;
    private boolean online;
    private it.auties.whatsapp.model.mobile.CountryLocale locale;
    private java.lang.String name;
    private java.lang.String verifiedName;
    private java.lang.String businessAddress;
    private java.lang.Double businessLongitude;
    private java.lang.Double businessLatitude;
    private java.lang.String businessDescription;
    private java.lang.String businessWebsite;
    private java.lang.String businessEmail;
    private it.auties.whatsapp.model.business.BusinessCategory businessCategory;
    private java.lang.String deviceHash;
    private java.util.LinkedHashMap<it.auties.whatsapp.model.jid.Jid,java.lang.Integer> linkedDevicesKeys;
    private java.net.URI profilePicture;
    private java.lang.String about;
    private it.auties.whatsapp.model.jid.Jid jid;
    private it.auties.whatsapp.model.jid.Jid lid;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.String> properties;
    private java.util.concurrent.ConcurrentHashMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.contact.Contact> contacts;
    private java.util.concurrent.ConcurrentHashMap.KeySetView<it.auties.whatsapp.model.info.ChatMessageInfo,java.lang.Boolean> status;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.privacy.PrivacySettingEntry> privacySettings;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.call.Call> calls;
    private boolean unarchiveChats;
    private boolean twentyFourHourFormat;
    private java.lang.Long initializationTimeStamp;
    private it.auties.whatsapp.model.chat.ChatEphemeralTimer newChatsEphemeralTimer;
    private it.auties.whatsapp.api.TextPreviewSetting textPreviewSetting;
    private it.auties.whatsapp.api.WebHistorySetting historyLength;
    private boolean autodetectListeners;
    private boolean automaticPresenceUpdates;
    private boolean automaticMessageReceipts;
    private it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel releaseChannel;
    private it.auties.whatsapp.model.companion.CompanionDevice device;
    private boolean checkPatchMacs;
    private it.auties.whatsapp.api.MediaProxySetting mediaProxySetting;

    public StoreBuilder() {
        uuid = null;
        phoneNumber = null;
        clientType = null;
        alias = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newCollection();
        proxy = null;
        online = false;
        locale = null;
        name = null;
        verifiedName = null;
        businessAddress = null;
        businessLongitude = null;
        businessLatitude = null;
        businessDescription = null;
        businessWebsite = null;
        businessEmail = null;
        businessCategory = null;
        deviceHash = null;
        linkedDevicesKeys = new java.util.LinkedHashMap();
        profilePicture = null;
        about = null;
        jid = null;
        lid = null;
        properties = new java.util.concurrent.ConcurrentHashMap();
        contacts = new java.util.concurrent.ConcurrentHashMap();
        status = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newKeySet();
        privacySettings = new java.util.concurrent.ConcurrentHashMap();
        calls = new java.util.concurrent.ConcurrentHashMap();
        unarchiveChats = false;
        twentyFourHourFormat = false;
        initializationTimeStamp = null;
        newChatsEphemeralTimer = null;
        textPreviewSetting = null;
        historyLength = null;
        autodetectListeners = false;
        automaticPresenceUpdates = false;
        automaticMessageReceipts = false;
        releaseChannel = null;
        device = null;
        checkPatchMacs = false;
        mediaProxySetting = null;
    }

    public StoreBuilder uuid(it.auties.protobuf.model.ProtobufString uuid) {
        this.uuid = it.auties.protobuf.builtin.ProtobufUUIDMixin.ofNullable(uuid);
        return this;
    }

    public StoreBuilder uuid(java.util.UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public StoreBuilder phoneNumber(it.auties.whatsapp.model.mobile.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StoreBuilder clientType(it.auties.whatsapp.api.ClientType clientType) {
        this.clientType = clientType;
        return this;
    }

    public StoreBuilder alias(java.util.Collection<java.lang.String> alias) {
        this.alias = alias;
        return this;
    }

    public StoreBuilder proxy(it.auties.protobuf.model.ProtobufString proxy) {
        this.proxy = it.auties.protobuf.builtin.ProtobufURIMixin.ofNullable(proxy);
        return this;
    }

    public StoreBuilder proxy(java.net.URI proxy) {
        this.proxy = proxy;
        return this;
    }

    public StoreBuilder online(boolean online) {
        this.online = online;
        return this;
    }

    public StoreBuilder locale(it.auties.whatsapp.model.mobile.CountryLocale locale) {
        this.locale = locale;
        return this;
    }

    public StoreBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public StoreBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public StoreBuilder verifiedName(it.auties.protobuf.model.ProtobufString verifiedName) {
        this.verifiedName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(verifiedName);
        return this;
    }

    public StoreBuilder verifiedName(java.lang.String verifiedName) {
        this.verifiedName = verifiedName;
        return this;
    }

    public StoreBuilder businessAddress(it.auties.protobuf.model.ProtobufString businessAddress) {
        this.businessAddress = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(businessAddress);
        return this;
    }

    public StoreBuilder businessAddress(java.lang.String businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public StoreBuilder businessLongitude(java.lang.Double businessLongitude) {
        this.businessLongitude = businessLongitude;
        return this;
    }

    public StoreBuilder businessLatitude(java.lang.Double businessLatitude) {
        this.businessLatitude = businessLatitude;
        return this;
    }

    public StoreBuilder businessDescription(it.auties.protobuf.model.ProtobufString businessDescription) {
        this.businessDescription = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(businessDescription);
        return this;
    }

    public StoreBuilder businessDescription(java.lang.String businessDescription) {
        this.businessDescription = businessDescription;
        return this;
    }

    public StoreBuilder businessWebsite(it.auties.protobuf.model.ProtobufString businessWebsite) {
        this.businessWebsite = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(businessWebsite);
        return this;
    }

    public StoreBuilder businessWebsite(java.lang.String businessWebsite) {
        this.businessWebsite = businessWebsite;
        return this;
    }

    public StoreBuilder businessEmail(it.auties.protobuf.model.ProtobufString businessEmail) {
        this.businessEmail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(businessEmail);
        return this;
    }

    public StoreBuilder businessEmail(java.lang.String businessEmail) {
        this.businessEmail = businessEmail;
        return this;
    }

    public StoreBuilder businessCategory(it.auties.whatsapp.model.business.BusinessCategory businessCategory) {
        this.businessCategory = businessCategory;
        return this;
    }

    public StoreBuilder deviceHash(it.auties.protobuf.model.ProtobufString deviceHash) {
        this.deviceHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(deviceHash);
        return this;
    }

    public StoreBuilder deviceHash(java.lang.String deviceHash) {
        this.deviceHash = deviceHash;
        return this;
    }

    public StoreBuilder linkedDevicesKeys(java.util.LinkedHashMap<it.auties.whatsapp.model.jid.Jid,java.lang.Integer> linkedDevicesKeys) {
        this.linkedDevicesKeys = linkedDevicesKeys;
        return this;
    }

    public StoreBuilder profilePicture(it.auties.protobuf.model.ProtobufString profilePicture) {
        this.profilePicture = it.auties.protobuf.builtin.ProtobufURIMixin.ofNullable(profilePicture);
        return this;
    }

    public StoreBuilder profilePicture(java.net.URI profilePicture) {
        this.profilePicture = profilePicture;
        return this;
    }

    public StoreBuilder about(it.auties.protobuf.model.ProtobufString about) {
        this.about = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(about);
        return this;
    }

    public StoreBuilder about(java.lang.String about) {
        this.about = about;
        return this;
    }

    public StoreBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public StoreBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public StoreBuilder lid(it.auties.protobuf.model.ProtobufString lid) {
        this.lid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(lid));
        return this;
    }

    public StoreBuilder lid(it.auties.whatsapp.model.jid.Jid lid) {
        this.lid = lid;
        return this;
    }

    public StoreBuilder properties(java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.String> properties) {
        this.properties = properties;
        return this;
    }

    public StoreBuilder contacts(java.util.concurrent.ConcurrentHashMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.contact.Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    public StoreBuilder status(java.util.concurrent.ConcurrentHashMap.KeySetView<it.auties.whatsapp.model.info.ChatMessageInfo,java.lang.Boolean> status) {
        this.status = status;
        return this;
    }

    public StoreBuilder privacySettings(java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.privacy.PrivacySettingEntry> privacySettings) {
        this.privacySettings = privacySettings;
        return this;
    }

    public StoreBuilder calls(java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.call.Call> calls) {
        this.calls = calls;
        return this;
    }

    public StoreBuilder unarchiveChats(boolean unarchiveChats) {
        this.unarchiveChats = unarchiveChats;
        return this;
    }

    public StoreBuilder twentyFourHourFormat(boolean twentyFourHourFormat) {
        this.twentyFourHourFormat = twentyFourHourFormat;
        return this;
    }

    public StoreBuilder initializationTimeStamp(java.lang.Long initializationTimeStamp) {
        this.initializationTimeStamp = initializationTimeStamp;
        return this;
    }

    public StoreBuilder newChatsEphemeralTimer(it.auties.whatsapp.model.chat.ChatEphemeralTimer newChatsEphemeralTimer) {
        this.newChatsEphemeralTimer = newChatsEphemeralTimer;
        return this;
    }

    public StoreBuilder textPreviewSetting(it.auties.whatsapp.api.TextPreviewSetting textPreviewSetting) {
        this.textPreviewSetting = textPreviewSetting;
        return this;
    }

    public StoreBuilder historyLength(it.auties.whatsapp.api.WebHistorySetting historyLength) {
        this.historyLength = historyLength;
        return this;
    }

    public StoreBuilder autodetectListeners(boolean autodetectListeners) {
        this.autodetectListeners = autodetectListeners;
        return this;
    }

    public StoreBuilder automaticPresenceUpdates(boolean automaticPresenceUpdates) {
        this.automaticPresenceUpdates = automaticPresenceUpdates;
        return this;
    }

    public StoreBuilder automaticMessageReceipts(boolean automaticMessageReceipts) {
        this.automaticMessageReceipts = automaticMessageReceipts;
        return this;
    }

    public StoreBuilder releaseChannel(it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel releaseChannel) {
        this.releaseChannel = releaseChannel;
        return this;
    }

    public StoreBuilder device(it.auties.whatsapp.model.companion.CompanionDevice device) {
        this.device = device;
        return this;
    }

    public StoreBuilder checkPatchMacs(boolean checkPatchMacs) {
        this.checkPatchMacs = checkPatchMacs;
        return this;
    }

    public StoreBuilder mediaProxySetting(it.auties.whatsapp.api.MediaProxySetting mediaProxySetting) {
        this.mediaProxySetting = mediaProxySetting;
        return this;
    }

    public it.auties.whatsapp.controller.Store build() {
        return new it.auties.whatsapp.controller.Store(uuid, phoneNumber, clientType, alias, proxy, online, locale, name, verifiedName, businessAddress, businessLongitude, businessLatitude, businessDescription, businessWebsite, businessEmail, businessCategory, deviceHash, linkedDevicesKeys, profilePicture, about, jid, lid, properties, contacts, status, privacySettings, calls, unarchiveChats, twentyFourHourFormat, initializationTimeStamp, newChatsEphemeralTimer, textPreviewSetting, historyLength, autodetectListeners, automaticPresenceUpdates, automaticMessageReceipts, releaseChannel, device, checkPatchMacs, mediaProxySetting);
    }

}
