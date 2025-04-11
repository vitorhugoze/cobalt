package it.auties.whatsapp.controller;

import it.auties.whatsapp.controller.Store;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class StoreSpec {
    public static byte[] encode(Store protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Store protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var uuid = protoInputObject.uuid;
        if (uuid != null) {
            var uuid0 = it.auties.protobuf.builtin.ProtobufUUIDMixin.toValue(uuid);
            if (uuid0 != null) {
                protoOutputStream.writeString(1, uuid0);
            }
        }
        var phoneNumber = protoInputObject.phoneNumber();
        if (phoneNumber != null) {
            var phoneNumber0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(phoneNumber);
            if (phoneNumber0 != null) {
                var phoneNumber1 = phoneNumber0.number();
                protoOutputStream.writeUInt64(2, phoneNumber1);
            }
        }
        var clientType = protoInputObject.clientType;
        if (clientType != null) {
            var clientType0 = it.auties.whatsapp.api.ClientTypeSpec.encode(clientType);
            protoOutputStream.writeInt32(3, clientType0);
        }
        if (protoInputObject.alias != null) {
            for (var aliasEntry : protoInputObject.alias) { 
                if (aliasEntry != null) {
                    var alias0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(aliasEntry);
                    if (alias0 != null) {
                        protoOutputStream.writeString(4, alias0);
                    }
                }
            }
        }
        var proxy = protoInputObject.proxy;
        if (proxy != null) {
            var proxy0 = it.auties.protobuf.builtin.ProtobufURIMixin.toValue(proxy);
            if (proxy0 != null) {
                protoOutputStream.writeString(5, proxy0);
            }
        }
        var online = protoInputObject.online;
        protoOutputStream.writeBool(7, online);
        var locale = protoInputObject.locale;
        if (locale != null) {
            protoOutputStream.writeMessage(8, it.auties.whatsapp.model.mobile.CountryLocaleSpec.sizeOf(locale));
            it.auties.whatsapp.model.mobile.CountryLocaleSpec.encode(locale, protoOutputStream);
        }
        var name = protoInputObject.name;
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(9, name0);
            }
        }
        var verifiedName = protoInputObject.verifiedName;
        if (verifiedName != null) {
            var verifiedName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(verifiedName);
            if (verifiedName0 != null) {
                protoOutputStream.writeString(40, verifiedName0);
            }
        }
        var businessAddress = protoInputObject.businessAddress;
        if (businessAddress != null) {
            var businessAddress0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessAddress);
            if (businessAddress0 != null) {
                protoOutputStream.writeString(10, businessAddress0);
            }
        }
        var businessLongitude = protoInputObject.businessLongitude;
        if (businessLongitude != null) {
            protoOutputStream.writeDouble(11, businessLongitude);
        }
        var businessLatitude = protoInputObject.businessLatitude;
        if (businessLatitude != null) {
            protoOutputStream.writeDouble(12, businessLatitude);
        }
        var businessDescription = protoInputObject.businessDescription;
        if (businessDescription != null) {
            var businessDescription0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessDescription);
            if (businessDescription0 != null) {
                protoOutputStream.writeString(13, businessDescription0);
            }
        }
        var businessWebsite = protoInputObject.businessWebsite;
        if (businessWebsite != null) {
            var businessWebsite0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessWebsite);
            if (businessWebsite0 != null) {
                protoOutputStream.writeString(14, businessWebsite0);
            }
        }
        var businessEmail = protoInputObject.businessEmail;
        if (businessEmail != null) {
            var businessEmail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessEmail);
            if (businessEmail0 != null) {
                protoOutputStream.writeString(15, businessEmail0);
            }
        }
        var businessCategory = protoInputObject.businessCategory;
        if (businessCategory != null) {
            protoOutputStream.writeMessage(16, it.auties.whatsapp.model.business.BusinessCategorySpec.sizeOf(businessCategory));
            it.auties.whatsapp.model.business.BusinessCategorySpec.encode(businessCategory, protoOutputStream);
        }
        var deviceHash = protoInputObject.deviceHash;
        if (deviceHash != null) {
            var deviceHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceHash);
            if (deviceHash0 != null) {
                protoOutputStream.writeString(17, deviceHash0);
            }
        }
        if (protoInputObject.linkedDevicesKeys != null) {
            for (var linkedDevicesKeysEntry : protoInputObject.linkedDevicesKeys.entrySet()) { 
                protoOutputStream.writeMessage(18, sizeOfLinkedDevicesKeys(linkedDevicesKeysEntry));
                var linkedDevicesKeysKey0 = linkedDevicesKeysEntry.getKey().toString();
                if (linkedDevicesKeysKey0 != null) {
                    var linkedDevicesKeysKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(linkedDevicesKeysKey0);
                    if (linkedDevicesKeysKey1 != null) {
                        protoOutputStream.writeString(1, linkedDevicesKeysKey1);
                    }
                }
                var linkedDevicesKeysValue = linkedDevicesKeysEntry.getValue();
                if (linkedDevicesKeysValue != null) {
                    protoOutputStream.writeInt32(2, linkedDevicesKeysValue);
                }
            }
        }
        var profilePicture = protoInputObject.profilePicture;
        if (profilePicture != null) {
            var profilePicture0 = it.auties.protobuf.builtin.ProtobufURIMixin.toValue(profilePicture);
            if (profilePicture0 != null) {
                protoOutputStream.writeString(19, profilePicture0);
            }
        }
        var about = protoInputObject.about;
        if (about != null) {
            var about0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(about);
            if (about0 != null) {
                protoOutputStream.writeString(20, about0);
            }
        }
        var jid = protoInputObject.jid;
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputStream.writeString(21, jid1);
                }
            }
        }
        var lid = protoInputObject.lid;
        if (lid != null) {
            var lid0 = lid.toString();
            if (lid0 != null) {
                var lid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lid0);
                if (lid1 != null) {
                    protoOutputStream.writeString(22, lid1);
                }
            }
        }
        if (protoInputObject.properties != null) {
            for (var propertiesEntry : protoInputObject.properties.entrySet()) { 
                protoOutputStream.writeMessage(23, sizeOfProperties(propertiesEntry));
                var propertiesKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(propertiesEntry.getKey());
                if (propertiesKey0 != null) {
                    protoOutputStream.writeString(1, propertiesKey0);
                }
                var propertiesValue = propertiesEntry.getValue();
                if (propertiesValue != null) {
                    var propertiesValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(propertiesValue);
                    if (propertiesValue0 != null) {
                        protoOutputStream.writeString(2, propertiesValue0);
                    }
                }
            }
        }
        if (protoInputObject.contacts != null) {
            for (var contactsEntry : protoInputObject.contacts.entrySet()) { 
                protoOutputStream.writeMessage(24, sizeOfContacts(contactsEntry));
                var contactsKey0 = contactsEntry.getKey().toString();
                if (contactsKey0 != null) {
                    var contactsKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(contactsKey0);
                    if (contactsKey1 != null) {
                        protoOutputStream.writeString(1, contactsKey1);
                    }
                }
                var contactsValue = contactsEntry.getValue();
                if (contactsValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.contact.ContactSpec.sizeOf(contactsValue));
                    it.auties.whatsapp.model.contact.ContactSpec.encode(contactsValue, protoOutputStream);
                }
            }
        }
        if (protoInputObject.status != null) {
            for (var statusEntry : protoInputObject.status) { 
                if (statusEntry != null) {
                    protoOutputStream.writeMessage(25, it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(statusEntry));
                    it.auties.whatsapp.model.info.ChatMessageInfoSpec.encode(statusEntry, protoOutputStream);
                }
            }
        }
        if (protoInputObject.privacySettings != null) {
            for (var privacySettingsEntry : protoInputObject.privacySettings.entrySet()) { 
                protoOutputStream.writeMessage(26, sizeOfPrivacySettings(privacySettingsEntry));
                var privacySettingsKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(privacySettingsEntry.getKey());
                if (privacySettingsKey0 != null) {
                    protoOutputStream.writeString(1, privacySettingsKey0);
                }
                var privacySettingsValue = privacySettingsEntry.getValue();
                if (privacySettingsValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.privacy.PrivacySettingEntrySpec.sizeOf(privacySettingsValue));
                    it.auties.whatsapp.model.privacy.PrivacySettingEntrySpec.encode(privacySettingsValue, protoOutputStream);
                }
            }
        }
        if (protoInputObject.calls != null) {
            for (var callsEntry : protoInputObject.calls.entrySet()) { 
                protoOutputStream.writeMessage(27, sizeOfCalls(callsEntry));
                var callsKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(callsEntry.getKey());
                if (callsKey0 != null) {
                    protoOutputStream.writeString(1, callsKey0);
                }
                var callsValue = callsEntry.getValue();
                if (callsValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.call.CallSpec.sizeOf(callsValue));
                    it.auties.whatsapp.model.call.CallSpec.encode(callsValue, protoOutputStream);
                }
            }
        }
        var unarchiveChats = protoInputObject.unarchiveChats;
        protoOutputStream.writeBool(28, unarchiveChats);
        var twentyFourHourFormat = protoInputObject.twentyFourHourFormat;
        protoOutputStream.writeBool(29, twentyFourHourFormat);
        var initializationTimeStamp = protoInputObject.initializationTimeStamp;
        if (initializationTimeStamp != null) {
            protoOutputStream.writeUInt64(30, initializationTimeStamp);
        }
        var newChatsEphemeralTimer = protoInputObject.newChatsEphemeralTimer;
        if (newChatsEphemeralTimer != null) {
            var newChatsEphemeralTimer0 = it.auties.whatsapp.model.chat.ChatEphemeralTimerSpec.encode(newChatsEphemeralTimer);
            protoOutputStream.writeInt32(31, newChatsEphemeralTimer0);
        }
        var textPreviewSetting = protoInputObject.textPreviewSetting;
        if (textPreviewSetting != null) {
            var textPreviewSetting0 = it.auties.whatsapp.api.TextPreviewSettingSpec.encode(textPreviewSetting);
            protoOutputStream.writeInt32(32, textPreviewSetting0);
        }
        var historyLength = protoInputObject.historyLength;
        if (historyLength != null) {
            protoOutputStream.writeMessage(33, it.auties.whatsapp.api.WebHistorySettingSpec.sizeOf(historyLength));
            it.auties.whatsapp.api.WebHistorySettingSpec.encode(historyLength, protoOutputStream);
        }
        var autodetectListeners = protoInputObject.autodetectListeners;
        protoOutputStream.writeBool(34, autodetectListeners);
        var automaticPresenceUpdates = protoInputObject.automaticPresenceUpdates;
        protoOutputStream.writeBool(36, automaticPresenceUpdates);
        var automaticMessageReceipts = protoInputObject.automaticMessageReceipts;
        protoOutputStream.writeBool(41, automaticMessageReceipts);
        var releaseChannel = protoInputObject.releaseChannel;
        if (releaseChannel != null) {
            var releaseChannel0 = it.auties.whatsapp.model.signal.auth.UserAgentReleaseChannelSpec.encode(releaseChannel);
            protoOutputStream.writeInt32(37, releaseChannel0);
        }
        var device = protoInputObject.device;
        if (device != null) {
            protoOutputStream.writeMessage(38, it.auties.whatsapp.model.companion.CompanionDeviceSpec.sizeOf(device));
            it.auties.whatsapp.model.companion.CompanionDeviceSpec.encode(device, protoOutputStream);
        }
        var checkPatchMacs = protoInputObject.checkPatchMacs;
        protoOutputStream.writeBool(39, checkPatchMacs);
        var mediaProxySetting = protoInputObject.mediaProxySetting;
        if (mediaProxySetting != null) {
            var mediaProxySetting0 = it.auties.whatsapp.api.MediaProxySettingSpec.encode(mediaProxySetting);
            protoOutputStream.writeInt32(42, mediaProxySetting0);
        }
    }

    public static Store decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Store decode(ProtobufInputStream protoInputStream) {
        java.util.UUID uuid = null;
        it.auties.whatsapp.model.mobile.PhoneNumber phoneNumber = null;
        it.auties.whatsapp.api.ClientType clientType = null;
        java.util.Collection<java.lang.String> alias = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newCollection();
        java.net.URI proxy = null;
        boolean online = false;
        it.auties.whatsapp.model.mobile.CountryLocale locale = null;
        java.lang.String name = null;
        java.lang.String verifiedName = null;
        java.lang.String businessAddress = null;
        java.lang.Double businessLongitude = null;
        java.lang.Double businessLatitude = null;
        java.lang.String businessDescription = null;
        java.lang.String businessWebsite = null;
        java.lang.String businessEmail = null;
        it.auties.whatsapp.model.business.BusinessCategory businessCategory = null;
        java.lang.String deviceHash = null;
        java.util.LinkedHashMap<it.auties.whatsapp.model.jid.Jid,java.lang.Integer> linkedDevicesKeys = new java.util.LinkedHashMap();
        java.net.URI profilePicture = null;
        java.lang.String about = null;
        it.auties.whatsapp.model.jid.Jid jid = null;
        it.auties.whatsapp.model.jid.Jid lid = null;
        java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.String> properties = new java.util.concurrent.ConcurrentHashMap();
        java.util.concurrent.ConcurrentHashMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.contact.Contact> contacts = new java.util.concurrent.ConcurrentHashMap();
        java.util.concurrent.ConcurrentHashMap.KeySetView<it.auties.whatsapp.model.info.ChatMessageInfo,java.lang.Boolean> status = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newKeySet();
        java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.privacy.PrivacySettingEntry> privacySettings = new java.util.concurrent.ConcurrentHashMap();
        java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.call.Call> calls = new java.util.concurrent.ConcurrentHashMap();
        boolean unarchiveChats = false;
        boolean twentyFourHourFormat = false;
        java.lang.Long initializationTimeStamp = null;
        it.auties.whatsapp.model.chat.ChatEphemeralTimer newChatsEphemeralTimer = null;
        it.auties.whatsapp.api.TextPreviewSetting textPreviewSetting = null;
        it.auties.whatsapp.api.WebHistorySetting historyLength = null;
        boolean autodetectListeners = false;
        boolean automaticPresenceUpdates = false;
        boolean automaticMessageReceipts = false;
        it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel releaseChannel = null;
        it.auties.whatsapp.model.companion.CompanionDevice device = null;
        boolean checkPatchMacs = false;
        it.auties.whatsapp.api.MediaProxySetting mediaProxySetting = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> uuid = it.auties.protobuf.builtin.ProtobufUUIDMixin.ofNullable(protoInputStream.readString());
                case 2 -> phoneNumber = it.auties.whatsapp.model.mobile.PhoneNumber.of(protoInputStream.readInt64());
                case 3 -> clientType = it.auties.whatsapp.api.ClientTypeSpec.decode(protoInputStream.readInt32());
                case 4 -> alias.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> proxy = it.auties.protobuf.builtin.ProtobufURIMixin.ofNullable(protoInputStream.readString());
                case 7 -> online = protoInputStream.readBool();
                case 8 -> locale = it.auties.whatsapp.model.mobile.CountryLocaleSpec.decode(protoInputStream.readLengthDelimited());
                case 9 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 40 -> verifiedName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 10 -> businessAddress = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 11 -> businessLongitude = protoInputStream.readDouble();
                case 12 -> businessLatitude = protoInputStream.readDouble();
                case 13 -> businessDescription = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 14 -> businessWebsite = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 15 -> businessEmail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 16 -> businessCategory = it.auties.whatsapp.model.business.BusinessCategorySpec.decode(protoInputStream.readLengthDelimited());
                case 17 -> deviceHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 18 -> {
                    var linkedDevicesKeysInputStream = protoInputStream.readLengthDelimited();
                    it.auties.whatsapp.model.jid.Jid linkedDevicesKeysKey = null;
                    java.lang.Integer linkedDevicesKeysValue = null;
                    while (linkedDevicesKeysInputStream.readTag()) {
                        switch (linkedDevicesKeysInputStream.index()) {
                            case 1 -> linkedDevicesKeysKey = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(linkedDevicesKeysInputStream.readString()));
                            case 2 -> linkedDevicesKeysValue = linkedDevicesKeysInputStream.readInt32();
                        }
                    }
                    linkedDevicesKeys.put(linkedDevicesKeysKey, linkedDevicesKeysValue);
                }
                case 19 -> profilePicture = it.auties.protobuf.builtin.ProtobufURIMixin.ofNullable(protoInputStream.readString());
                case 20 -> about = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 21 -> jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 22 -> lid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 23 -> {
                    var propertiesInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String propertiesKey = null;
                    java.lang.String propertiesValue = null;
                    while (propertiesInputStream.readTag()) {
                        switch (propertiesInputStream.index()) {
                            case 1 -> propertiesKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(propertiesInputStream.readString());
                            case 2 -> propertiesValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(propertiesInputStream.readString());
                        }
                    }
                    properties.put(propertiesKey, propertiesValue);
                }
                case 24 -> {
                    var contactsInputStream = protoInputStream.readLengthDelimited();
                    it.auties.whatsapp.model.jid.Jid contactsKey = null;
                    it.auties.whatsapp.model.contact.Contact contactsValue = null;
                    while (contactsInputStream.readTag()) {
                        switch (contactsInputStream.index()) {
                            case 1 -> contactsKey = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(contactsInputStream.readString()));
                            case 2 -> contactsValue = it.auties.whatsapp.model.contact.ContactSpec.decode(contactsInputStream.readLengthDelimited());
                        }
                    }
                    contacts.put(contactsKey, contactsValue);
                }
                case 25 -> status.add(it.auties.whatsapp.model.info.ChatMessageInfoSpec.decode(protoInputStream.readLengthDelimited()));
                case 26 -> {
                    var privacySettingsInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String privacySettingsKey = null;
                    it.auties.whatsapp.model.privacy.PrivacySettingEntry privacySettingsValue = null;
                    while (privacySettingsInputStream.readTag()) {
                        switch (privacySettingsInputStream.index()) {
                            case 1 -> privacySettingsKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(privacySettingsInputStream.readString());
                            case 2 -> privacySettingsValue = it.auties.whatsapp.model.privacy.PrivacySettingEntrySpec.decode(privacySettingsInputStream.readLengthDelimited());
                        }
                    }
                    privacySettings.put(privacySettingsKey, privacySettingsValue);
                }
                case 27 -> {
                    var callsInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String callsKey = null;
                    it.auties.whatsapp.model.call.Call callsValue = null;
                    while (callsInputStream.readTag()) {
                        switch (callsInputStream.index()) {
                            case 1 -> callsKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(callsInputStream.readString());
                            case 2 -> callsValue = it.auties.whatsapp.model.call.CallSpec.decode(callsInputStream.readLengthDelimited());
                        }
                    }
                    calls.put(callsKey, callsValue);
                }
                case 28 -> unarchiveChats = protoInputStream.readBool();
                case 29 -> twentyFourHourFormat = protoInputStream.readBool();
                case 30 -> initializationTimeStamp = protoInputStream.readInt64();
                case 31 -> newChatsEphemeralTimer = it.auties.whatsapp.model.chat.ChatEphemeralTimerSpec.decode(protoInputStream.readInt32());
                case 32 -> textPreviewSetting = it.auties.whatsapp.api.TextPreviewSettingSpec.decode(protoInputStream.readInt32());
                case 33 -> historyLength = it.auties.whatsapp.api.WebHistorySettingSpec.decode(protoInputStream.readLengthDelimited());
                case 34 -> autodetectListeners = protoInputStream.readBool();
                case 36 -> automaticPresenceUpdates = protoInputStream.readBool();
                case 41 -> automaticMessageReceipts = protoInputStream.readBool();
                case 37 -> releaseChannel = it.auties.whatsapp.model.signal.auth.UserAgentReleaseChannelSpec.decode(protoInputStream.readInt32());
                case 38 -> device = it.auties.whatsapp.model.companion.CompanionDeviceSpec.decode(protoInputStream.readLengthDelimited());
                case 39 -> checkPatchMacs = protoInputStream.readBool();
                case 42 -> mediaProxySetting = it.auties.whatsapp.api.MediaProxySettingSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.controller.Store(uuid, phoneNumber, clientType, alias, proxy, online, locale, name, verifiedName, businessAddress, businessLongitude, businessLatitude, businessDescription, businessWebsite, businessEmail, businessCategory, deviceHash, linkedDevicesKeys, profilePicture, about, jid, lid, properties, contacts, status, privacySettings, calls, unarchiveChats, twentyFourHourFormat, initializationTimeStamp, newChatsEphemeralTimer, textPreviewSetting, historyLength, autodetectListeners, automaticPresenceUpdates, automaticMessageReceipts, releaseChannel, device, checkPatchMacs, mediaProxySetting);
    }

    public static int sizeOf(Store protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var uuid = protoInputObject.uuid;
        if (uuid != null) {
            var uuid0 = it.auties.protobuf.builtin.ProtobufUUIDMixin.toValue(uuid);
            if (uuid0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(uuid0);
            }
        }
        var phoneNumber = protoInputObject.phoneNumber();
        if (phoneNumber != null) {
            var phoneNumber0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(phoneNumber);
            if (phoneNumber0 != null) {
                var phoneNumber1 = phoneNumber0.number();
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(phoneNumber1);
            }
        }
        var clientType = protoInputObject.clientType;
        if (clientType != null) {
            var clientType0 = it.auties.whatsapp.api.ClientTypeSpec.encode(clientType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(clientType0);
        }
        if (protoInputObject.alias != null) {
            for (var aliasEntry : protoInputObject.alias) { 
                if (aliasEntry != null) {
                    var aliasEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(aliasEntry);
                    if (aliasEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(aliasEntry0);
                    }
                }
            }
        }
        var proxy = protoInputObject.proxy;
        if (proxy != null) {
            var proxy0 = it.auties.protobuf.builtin.ProtobufURIMixin.toValue(proxy);
            if (proxy0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(proxy0);
            }
        }
        var online = protoInputObject.online;
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += 1;
        var locale = protoInputObject.locale;
        if (locale != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
            var localeSerializedSize = it.auties.whatsapp.model.mobile.CountryLocaleSpec.sizeOf(locale);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(localeSerializedSize);
            protoOutputSize += localeSerializedSize;
        }
        var name = protoInputObject.name;
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        var verifiedName = protoInputObject.verifiedName;
        if (verifiedName != null) {
            var verifiedName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(verifiedName);
            if (verifiedName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(40, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(verifiedName0);
            }
        }
        var businessAddress = protoInputObject.businessAddress;
        if (businessAddress != null) {
            var businessAddress0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessAddress);
            if (businessAddress0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(businessAddress0);
            }
        }
        var businessLongitude = protoInputObject.businessLongitude;
        if (businessLongitude != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(11, 1);
            protoOutputSize += 8;
        }
        var businessLatitude = protoInputObject.businessLatitude;
        if (businessLatitude != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(12, 1);
            protoOutputSize += 8;
        }
        var businessDescription = protoInputObject.businessDescription;
        if (businessDescription != null) {
            var businessDescription0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessDescription);
            if (businessDescription0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(businessDescription0);
            }
        }
        var businessWebsite = protoInputObject.businessWebsite;
        if (businessWebsite != null) {
            var businessWebsite0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessWebsite);
            if (businessWebsite0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(businessWebsite0);
            }
        }
        var businessEmail = protoInputObject.businessEmail;
        if (businessEmail != null) {
            var businessEmail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessEmail);
            if (businessEmail0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(businessEmail0);
            }
        }
        var businessCategory = protoInputObject.businessCategory;
        if (businessCategory != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
            var businessCategorySerializedSize = it.auties.whatsapp.model.business.BusinessCategorySpec.sizeOf(businessCategory);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(businessCategorySerializedSize);
            protoOutputSize += businessCategorySerializedSize;
        }
        var deviceHash = protoInputObject.deviceHash;
        if (deviceHash != null) {
            var deviceHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceHash);
            if (deviceHash0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(deviceHash0);
            }
        }
        var linkedDevicesKeysMapField = protoInputObject.linkedDevicesKeys;
        if (linkedDevicesKeysMapField != null) {
            for (var linkedDevicesKeysMapEntry : linkedDevicesKeysMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                var linkedDevicesKeysMapEntrySize = sizeOfLinkedDevicesKeys(linkedDevicesKeysMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(linkedDevicesKeysMapEntrySize);
                protoOutputSize += linkedDevicesKeysMapEntrySize;
            }
        }
        var profilePicture = protoInputObject.profilePicture;
        if (profilePicture != null) {
            var profilePicture0 = it.auties.protobuf.builtin.ProtobufURIMixin.toValue(profilePicture);
            if (profilePicture0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(profilePicture0);
            }
        }
        var about = protoInputObject.about;
        if (about != null) {
            var about0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(about);
            if (about0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(about0);
            }
        }
        var jid = protoInputObject.jid;
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(jid1);
                }
            }
        }
        var lid = protoInputObject.lid;
        if (lid != null) {
            var lid0 = lid.toString();
            if (lid0 != null) {
                var lid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lid0);
                if (lid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(lid1);
                }
            }
        }
        var propertiesMapField = protoInputObject.properties;
        if (propertiesMapField != null) {
            for (var propertiesMapEntry : propertiesMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                var propertiesMapEntrySize = sizeOfProperties(propertiesMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(propertiesMapEntrySize);
                protoOutputSize += propertiesMapEntrySize;
            }
        }
        var contactsMapField = protoInputObject.contacts;
        if (contactsMapField != null) {
            for (var contactsMapEntry : contactsMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                var contactsMapEntrySize = sizeOfContacts(contactsMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contactsMapEntrySize);
                protoOutputSize += contactsMapEntrySize;
            }
        }
        if (protoInputObject.status != null) {
            for (var statusEntry : protoInputObject.status) { 
                if (statusEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(25, 2);
                    var statusEntrySerializedSize = it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(statusEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(statusEntrySerializedSize);
                    protoOutputSize += statusEntrySerializedSize;
                }
            }
        }
        var privacySettingsMapField = protoInputObject.privacySettings;
        if (privacySettingsMapField != null) {
            for (var privacySettingsMapEntry : privacySettingsMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                var privacySettingsMapEntrySize = sizeOfPrivacySettings(privacySettingsMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(privacySettingsMapEntrySize);
                protoOutputSize += privacySettingsMapEntrySize;
            }
        }
        var callsMapField = protoInputObject.calls;
        if (callsMapField != null) {
            for (var callsMapEntry : callsMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
                var callsMapEntrySize = sizeOfCalls(callsMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(callsMapEntrySize);
                protoOutputSize += callsMapEntrySize;
            }
        }
        var unarchiveChats = protoInputObject.unarchiveChats;
        protoOutputSize += ProtobufOutputStream.getFieldSize(28, 0);
        protoOutputSize += 1;
        var twentyFourHourFormat = protoInputObject.twentyFourHourFormat;
        protoOutputSize += ProtobufOutputStream.getFieldSize(29, 0);
        protoOutputSize += 1;
        var initializationTimeStamp = protoInputObject.initializationTimeStamp;
        if (initializationTimeStamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(30, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(initializationTimeStamp);
        }
        var newChatsEphemeralTimer = protoInputObject.newChatsEphemeralTimer;
        if (newChatsEphemeralTimer != null) {
            var newChatsEphemeralTimer0 = it.auties.whatsapp.model.chat.ChatEphemeralTimerSpec.encode(newChatsEphemeralTimer);
            protoOutputSize += ProtobufOutputStream.getFieldSize(31, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(newChatsEphemeralTimer0);
        }
        var textPreviewSetting = protoInputObject.textPreviewSetting;
        if (textPreviewSetting != null) {
            var textPreviewSetting0 = it.auties.whatsapp.api.TextPreviewSettingSpec.encode(textPreviewSetting);
            protoOutputSize += ProtobufOutputStream.getFieldSize(32, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(textPreviewSetting0);
        }
        var historyLength = protoInputObject.historyLength;
        if (historyLength != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(33, 2);
            var historyLengthSerializedSize = it.auties.whatsapp.api.WebHistorySettingSpec.sizeOf(historyLength);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(historyLengthSerializedSize);
            protoOutputSize += historyLengthSerializedSize;
        }
        var autodetectListeners = protoInputObject.autodetectListeners;
        protoOutputSize += ProtobufOutputStream.getFieldSize(34, 0);
        protoOutputSize += 1;
        var automaticPresenceUpdates = protoInputObject.automaticPresenceUpdates;
        protoOutputSize += ProtobufOutputStream.getFieldSize(36, 0);
        protoOutputSize += 1;
        var automaticMessageReceipts = protoInputObject.automaticMessageReceipts;
        protoOutputSize += ProtobufOutputStream.getFieldSize(41, 0);
        protoOutputSize += 1;
        var releaseChannel = protoInputObject.releaseChannel;
        if (releaseChannel != null) {
            var releaseChannel0 = it.auties.whatsapp.model.signal.auth.UserAgentReleaseChannelSpec.encode(releaseChannel);
            protoOutputSize += ProtobufOutputStream.getFieldSize(37, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(releaseChannel0);
        }
        var device = protoInputObject.device;
        if (device != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(38, 2);
            var deviceSerializedSize = it.auties.whatsapp.model.companion.CompanionDeviceSpec.sizeOf(device);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceSerializedSize);
            protoOutputSize += deviceSerializedSize;
        }
        var checkPatchMacs = protoInputObject.checkPatchMacs;
        protoOutputSize += ProtobufOutputStream.getFieldSize(39, 0);
        protoOutputSize += 1;
        var mediaProxySetting = protoInputObject.mediaProxySetting;
        if (mediaProxySetting != null) {
            var mediaProxySetting0 = it.auties.whatsapp.api.MediaProxySettingSpec.encode(mediaProxySetting);
            protoOutputSize += ProtobufOutputStream.getFieldSize(42, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaProxySetting0);
        }
        return protoOutputSize;
    }

    private static int sizeOfLinkedDevicesKeys(java.util.Map.Entry<it.auties.whatsapp.model.jid.Jid, java.lang.Integer> protoInputObject) {
        var protoOutputSize = 0;
        var linkedDevicesKeysMapKey = protoInputObject.getKey();
        if (linkedDevicesKeysMapKey != null) {
            var linkedDevicesKeysMapKey0 = linkedDevicesKeysMapKey.toString();
            if (linkedDevicesKeysMapKey0 != null) {
                var linkedDevicesKeysMapKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(linkedDevicesKeysMapKey0);
                if (linkedDevicesKeysMapKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(linkedDevicesKeysMapKey1);
                }
            }
        }
        var linkedDevicesKeysMapValue = protoInputObject.getValue();
        if (linkedDevicesKeysMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(linkedDevicesKeysMapValue);
        }
        return protoOutputSize;
    }

    private static int sizeOfProperties(java.util.Map.Entry<java.lang.String, java.lang.String> protoInputObject) {
        var protoOutputSize = 0;
        var propertiesMapKey = protoInputObject.getKey();
        if (propertiesMapKey != null) {
            var propertiesMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(propertiesMapKey);
            if (propertiesMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(propertiesMapKey0);
            }
        }
        var propertiesMapValue = protoInputObject.getValue();
        if (propertiesMapValue != null) {
            var propertiesMapValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(propertiesMapValue);
            if (propertiesMapValue0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(propertiesMapValue0);
            }
        }
        return protoOutputSize;
    }

    private static int sizeOfContacts(java.util.Map.Entry<it.auties.whatsapp.model.jid.Jid, it.auties.whatsapp.model.contact.Contact> protoInputObject) {
        var protoOutputSize = 0;
        var contactsMapKey = protoInputObject.getKey();
        if (contactsMapKey != null) {
            var contactsMapKey0 = contactsMapKey.toString();
            if (contactsMapKey0 != null) {
                var contactsMapKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(contactsMapKey0);
                if (contactsMapKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(contactsMapKey1);
                }
            }
        }
        var contactsMapValue = protoInputObject.getValue();
        if (contactsMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var contactsMapValueSerializedSize = it.auties.whatsapp.model.contact.ContactSpec.sizeOf(contactsMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(contactsMapValueSerializedSize);
            protoOutputSize += contactsMapValueSerializedSize;
        }
        return protoOutputSize;
    }

    private static int sizeOfPrivacySettings(java.util.Map.Entry<java.lang.String, it.auties.whatsapp.model.privacy.PrivacySettingEntry> protoInputObject) {
        var protoOutputSize = 0;
        var privacySettingsMapKey = protoInputObject.getKey();
        if (privacySettingsMapKey != null) {
            var privacySettingsMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(privacySettingsMapKey);
            if (privacySettingsMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(privacySettingsMapKey0);
            }
        }
        var privacySettingsMapValue = protoInputObject.getValue();
        if (privacySettingsMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var privacySettingsMapValueSerializedSize = it.auties.whatsapp.model.privacy.PrivacySettingEntrySpec.sizeOf(privacySettingsMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(privacySettingsMapValueSerializedSize);
            protoOutputSize += privacySettingsMapValueSerializedSize;
        }
        return protoOutputSize;
    }

    private static int sizeOfCalls(java.util.Map.Entry<java.lang.String, it.auties.whatsapp.model.call.Call> protoInputObject) {
        var protoOutputSize = 0;
        var callsMapKey = protoInputObject.getKey();
        if (callsMapKey != null) {
            var callsMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(callsMapKey);
            if (callsMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(callsMapKey0);
            }
        }
        var callsMapValue = protoInputObject.getValue();
        if (callsMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var callsMapValueSerializedSize = it.auties.whatsapp.model.call.CallSpec.sizeOf(callsMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(callsMapValueSerializedSize);
            protoOutputSize += callsMapValueSerializedSize;
        }
        return protoOutputSize;
    }

}
