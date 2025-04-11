package it.auties.whatsapp.controller;

public class KeysBuilder {
    private java.util.UUID uuid;
    private it.auties.whatsapp.model.mobile.PhoneNumber phoneNumber;
    private it.auties.whatsapp.api.ClientType clientType;
    private java.util.Collection<java.lang.String> alias;
    private java.lang.Integer registrationId;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair noiseKeyPair;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair ephemeralKeyPair;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair identityKeyPair;
    private it.auties.whatsapp.model.signal.keypair.SignalKeyPair companionKeyPair;
    private it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair signedKeyPair;
    private byte[] signedKeyIndex;
    private java.lang.Long signedKeyIndexTimestamp;
    private java.util.List<it.auties.whatsapp.model.signal.keypair.SignalPreKeyPair> preKeys;
    private java.lang.String fdid;
    private byte[] deviceId;
    private java.util.UUID advertisingId;
    private byte[] identityId;
    private byte[] backupToken;
    private it.auties.whatsapp.model.signal.auth.SignedDeviceIdentity companionIdentity;
    private java.util.Map<it.auties.whatsapp.model.signal.sender.SenderKeyName,it.auties.whatsapp.model.signal.sender.SenderKeyRecord> senderKeys;
    private java.util.List<it.auties.whatsapp.model.companion.CompanionSyncKey> appStateKeys;
    private java.util.concurrent.ConcurrentMap<it.auties.whatsapp.model.signal.session.SessionAddress,it.auties.whatsapp.model.signal.session.Session> sessions;
    private java.util.concurrent.ConcurrentMap<java.lang.String,it.auties.whatsapp.model.companion.CompanionHashState> hashStates;
    private java.util.concurrent.ConcurrentMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.signal.sender.SenderPreKeys> groupsPreKeys;
    private boolean registered;
    private boolean businessCertificate;
    private boolean initialAppSync;

    public KeysBuilder() {
        uuid = null;
        phoneNumber = null;
        clientType = null;
        alias = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newCollection();
        registrationId = null;
        noiseKeyPair = null;
        ephemeralKeyPair = null;
        identityKeyPair = null;
        companionKeyPair = null;
        signedKeyPair = null;
        signedKeyIndex = null;
        signedKeyIndexTimestamp = null;
        preKeys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        fdid = null;
        deviceId = null;
        advertisingId = null;
        identityId = null;
        backupToken = null;
        companionIdentity = null;
        senderKeys = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        appStateKeys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        sessions = it.auties.protobuf.builtin.ProtobufMapMixin.newConcurrentMap();
        hashStates = it.auties.protobuf.builtin.ProtobufMapMixin.newConcurrentMap();
        groupsPreKeys = it.auties.protobuf.builtin.ProtobufMapMixin.newConcurrentMap();
        registered = false;
        businessCertificate = false;
        initialAppSync = false;
    }

    public KeysBuilder uuid(it.auties.protobuf.model.ProtobufString uuid) {
        this.uuid = it.auties.protobuf.builtin.ProtobufUUIDMixin.ofNullable(uuid);
        return this;
    }

    public KeysBuilder uuid(java.util.UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public KeysBuilder phoneNumber(it.auties.whatsapp.model.mobile.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public KeysBuilder clientType(it.auties.whatsapp.api.ClientType clientType) {
        this.clientType = clientType;
        return this;
    }

    public KeysBuilder alias(java.util.Collection<java.lang.String> alias) {
        this.alias = alias;
        return this;
    }

    public KeysBuilder registrationId(java.lang.Integer registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    public KeysBuilder noiseKeyPair(it.auties.whatsapp.model.signal.keypair.SignalKeyPair noiseKeyPair) {
        this.noiseKeyPair = noiseKeyPair;
        return this;
    }

    public KeysBuilder ephemeralKeyPair(it.auties.whatsapp.model.signal.keypair.SignalKeyPair ephemeralKeyPair) {
        this.ephemeralKeyPair = ephemeralKeyPair;
        return this;
    }

    public KeysBuilder identityKeyPair(it.auties.whatsapp.model.signal.keypair.SignalKeyPair identityKeyPair) {
        this.identityKeyPair = identityKeyPair;
        return this;
    }

    public KeysBuilder companionKeyPair(it.auties.whatsapp.model.signal.keypair.SignalKeyPair companionKeyPair) {
        this.companionKeyPair = companionKeyPair;
        return this;
    }

    public KeysBuilder signedKeyPair(it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair signedKeyPair) {
        this.signedKeyPair = signedKeyPair;
        return this;
    }

    public KeysBuilder signedKeyIndex(java.nio.ByteBuffer signedKeyIndex) {
        this.signedKeyIndex = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(signedKeyIndex);
        return this;
    }

    public KeysBuilder signedKeyIndex(byte[] signedKeyIndex) {
        this.signedKeyIndex = signedKeyIndex;
        return this;
    }

    public KeysBuilder signedKeyIndexTimestamp(java.lang.Long signedKeyIndexTimestamp) {
        this.signedKeyIndexTimestamp = signedKeyIndexTimestamp;
        return this;
    }

    public KeysBuilder preKeys(java.util.List<it.auties.whatsapp.model.signal.keypair.SignalPreKeyPair> preKeys) {
        this.preKeys = preKeys;
        return this;
    }

    public KeysBuilder fdid(it.auties.protobuf.model.ProtobufString fdid) {
        this.fdid = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fdid);
        return this;
    }

    public KeysBuilder fdid(java.lang.String fdid) {
        this.fdid = fdid;
        return this;
    }

    public KeysBuilder deviceId(java.nio.ByteBuffer deviceId) {
        this.deviceId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(deviceId);
        return this;
    }

    public KeysBuilder deviceId(byte[] deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public KeysBuilder advertisingId(it.auties.protobuf.model.ProtobufString advertisingId) {
        this.advertisingId = it.auties.protobuf.builtin.ProtobufUUIDMixin.ofNullable(advertisingId);
        return this;
    }

    public KeysBuilder advertisingId(java.util.UUID advertisingId) {
        this.advertisingId = advertisingId;
        return this;
    }

    public KeysBuilder identityId(java.nio.ByteBuffer identityId) {
        this.identityId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(identityId);
        return this;
    }

    public KeysBuilder identityId(byte[] identityId) {
        this.identityId = identityId;
        return this;
    }

    public KeysBuilder backupToken(java.nio.ByteBuffer backupToken) {
        this.backupToken = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(backupToken);
        return this;
    }

    public KeysBuilder backupToken(byte[] backupToken) {
        this.backupToken = backupToken;
        return this;
    }

    public KeysBuilder companionIdentity(it.auties.whatsapp.model.signal.auth.SignedDeviceIdentity companionIdentity) {
        this.companionIdentity = companionIdentity;
        return this;
    }

    public KeysBuilder senderKeys(java.util.Map<it.auties.whatsapp.model.signal.sender.SenderKeyName,it.auties.whatsapp.model.signal.sender.SenderKeyRecord> senderKeys) {
        this.senderKeys = senderKeys;
        return this;
    }

    public KeysBuilder appStateKeys(java.util.List<it.auties.whatsapp.model.companion.CompanionSyncKey> appStateKeys) {
        this.appStateKeys = appStateKeys;
        return this;
    }

    public KeysBuilder sessions(java.util.concurrent.ConcurrentMap<it.auties.whatsapp.model.signal.session.SessionAddress,it.auties.whatsapp.model.signal.session.Session> sessions) {
        this.sessions = sessions;
        return this;
    }

    public KeysBuilder hashStates(java.util.concurrent.ConcurrentMap<java.lang.String,it.auties.whatsapp.model.companion.CompanionHashState> hashStates) {
        this.hashStates = hashStates;
        return this;
    }

    public KeysBuilder groupsPreKeys(java.util.concurrent.ConcurrentMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.signal.sender.SenderPreKeys> groupsPreKeys) {
        this.groupsPreKeys = groupsPreKeys;
        return this;
    }

    public KeysBuilder registered(boolean registered) {
        this.registered = registered;
        return this;
    }

    public KeysBuilder businessCertificate(boolean businessCertificate) {
        this.businessCertificate = businessCertificate;
        return this;
    }

    public KeysBuilder initialAppSync(boolean initialAppSync) {
        this.initialAppSync = initialAppSync;
        return this;
    }

    public it.auties.whatsapp.controller.Keys build() {
        return new it.auties.whatsapp.controller.Keys(uuid, phoneNumber, clientType, alias, registrationId, noiseKeyPair, ephemeralKeyPair, identityKeyPair, companionKeyPair, signedKeyPair, signedKeyIndex, signedKeyIndexTimestamp, preKeys, fdid, deviceId, advertisingId, identityId, backupToken, companionIdentity, senderKeys, appStateKeys, sessions, hashStates, groupsPreKeys, registered, businessCertificate, initialAppSync);
    }

}
