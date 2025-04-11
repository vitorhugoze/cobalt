package it.auties.whatsapp.controller;

import it.auties.whatsapp.controller.Keys;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class KeysSpec {
    public static byte[] encode(Keys protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Keys protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var registrationId = protoInputObject.registrationId;
        if (registrationId != null) {
            protoOutputStream.writeInt32(5, registrationId);
        }
        var noiseKeyPair = protoInputObject.noiseKeyPair;
        if (noiseKeyPair != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(noiseKeyPair));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(noiseKeyPair, protoOutputStream);
        }
        var ephemeralKeyPair = protoInputObject.ephemeralKeyPair;
        if (ephemeralKeyPair != null) {
            protoOutputStream.writeMessage(7, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(ephemeralKeyPair));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(ephemeralKeyPair, protoOutputStream);
        }
        var identityKeyPair = protoInputObject.identityKeyPair;
        if (identityKeyPair != null) {
            protoOutputStream.writeMessage(8, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(identityKeyPair));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(identityKeyPair, protoOutputStream);
        }
        var companionKeyPair = protoInputObject.companionKeyPair;
        if (companionKeyPair != null) {
            protoOutputStream.writeMessage(9, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(companionKeyPair));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(companionKeyPair, protoOutputStream);
        }
        var signedKeyPair = protoInputObject.signedKeyPair;
        if (signedKeyPair != null) {
            protoOutputStream.writeMessage(10, it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPairSpec.sizeOf(signedKeyPair));
            it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPairSpec.encode(signedKeyPair, protoOutputStream);
        }
        var signedKeyIndex = protoInputObject.signedKeyIndex;
        if (signedKeyIndex != null) {
            var signedKeyIndex0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signedKeyIndex);
            if (signedKeyIndex0 != null) {
                protoOutputStream.writeBytes(11, signedKeyIndex0);
            }
        }
        var signedKeyIndexTimestamp = protoInputObject.signedKeyIndexTimestamp;
        if (signedKeyIndexTimestamp != null) {
            protoOutputStream.writeUInt64(12, signedKeyIndexTimestamp);
        }
        if (protoInputObject.preKeys != null) {
            for (var preKeysEntry : protoInputObject.preKeys) { 
                if (preKeysEntry != null) {
                    protoOutputStream.writeMessage(13, it.auties.whatsapp.model.signal.keypair.SignalPreKeyPairSpec.sizeOf(preKeysEntry));
                    it.auties.whatsapp.model.signal.keypair.SignalPreKeyPairSpec.encode(preKeysEntry, protoOutputStream);
                }
            }
        }
        var fdid = protoInputObject.fdid;
        if (fdid != null) {
            var fdid0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fdid);
            if (fdid0 != null) {
                protoOutputStream.writeString(14, fdid0);
            }
        }
        var deviceId = protoInputObject.deviceId;
        if (deviceId != null) {
            var deviceId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceId);
            if (deviceId0 != null) {
                protoOutputStream.writeBytes(15, deviceId0);
            }
        }
        var advertisingId = protoInputObject.advertisingId;
        if (advertisingId != null) {
            var advertisingId0 = it.auties.protobuf.builtin.ProtobufUUIDMixin.toValue(advertisingId);
            if (advertisingId0 != null) {
                protoOutputStream.writeString(26, advertisingId0);
            }
        }
        var identityId = protoInputObject.identityId;
        if (identityId != null) {
            var identityId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(identityId);
            if (identityId0 != null) {
                protoOutputStream.writeBytes(16, identityId0);
            }
        }
        var backupToken = protoInputObject.backupToken;
        if (backupToken != null) {
            var backupToken0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(backupToken);
            if (backupToken0 != null) {
                protoOutputStream.writeBytes(27, backupToken0);
            }
        }
        var companionIdentity = protoInputObject.companionIdentity;
        if (companionIdentity != null) {
            protoOutputStream.writeMessage(17, it.auties.whatsapp.model.signal.auth.SignedDeviceIdentitySpec.sizeOf(companionIdentity));
            it.auties.whatsapp.model.signal.auth.SignedDeviceIdentitySpec.encode(companionIdentity, protoOutputStream);
        }
        if (protoInputObject.senderKeys != null) {
            for (var senderKeysEntry : protoInputObject.senderKeys.entrySet()) { 
                protoOutputStream.writeMessage(18, sizeOfSenderKeys(senderKeysEntry));
                var senderKeysKey0 = senderKeysEntry.getKey().toString();
                if (senderKeysKey0 != null) {
                    var senderKeysKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderKeysKey0);
                    if (senderKeysKey1 != null) {
                        protoOutputStream.writeString(1, senderKeysKey1);
                    }
                }
                var senderKeysValue = senderKeysEntry.getValue();
                if (senderKeysValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.sender.SenderKeyRecordSpec.sizeOf(senderKeysValue));
                    it.auties.whatsapp.model.signal.sender.SenderKeyRecordSpec.encode(senderKeysValue, protoOutputStream);
                }
            }
        }
        if (protoInputObject.appStateKeys != null) {
            for (var appStateKeysEntry : protoInputObject.appStateKeys) { 
                if (appStateKeysEntry != null) {
                    protoOutputStream.writeMessage(19, it.auties.whatsapp.model.companion.CompanionSyncKeySpec.sizeOf(appStateKeysEntry));
                    it.auties.whatsapp.model.companion.CompanionSyncKeySpec.encode(appStateKeysEntry, protoOutputStream);
                }
            }
        }
        if (protoInputObject.sessions != null) {
            for (var sessionsEntry : protoInputObject.sessions.entrySet()) { 
                protoOutputStream.writeMessage(20, sizeOfSessions(sessionsEntry));
                var sessionsKey0 = sessionsEntry.getKey().toString();
                if (sessionsKey0 != null) {
                    var sessionsKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sessionsKey0);
                    if (sessionsKey1 != null) {
                        protoOutputStream.writeString(1, sessionsKey1);
                    }
                }
                var sessionsValue = sessionsEntry.getValue();
                if (sessionsValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.session.SessionSpec.sizeOf(sessionsValue));
                    it.auties.whatsapp.model.signal.session.SessionSpec.encode(sessionsValue, protoOutputStream);
                }
            }
        }
        if (protoInputObject.hashStates != null) {
            for (var hashStatesEntry : protoInputObject.hashStates.entrySet()) { 
                protoOutputStream.writeMessage(21, sizeOfHashStates(hashStatesEntry));
                var hashStatesKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hashStatesEntry.getKey());
                if (hashStatesKey0 != null) {
                    protoOutputStream.writeString(1, hashStatesKey0);
                }
                var hashStatesValue = hashStatesEntry.getValue();
                if (hashStatesValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.companion.CompanionHashStateSpec.sizeOf(hashStatesValue));
                    it.auties.whatsapp.model.companion.CompanionHashStateSpec.encode(hashStatesValue, protoOutputStream);
                }
            }
        }
        if (protoInputObject.groupsPreKeys != null) {
            for (var groupsPreKeysEntry : protoInputObject.groupsPreKeys.entrySet()) { 
                protoOutputStream.writeMessage(22, sizeOfGroupsPreKeys(groupsPreKeysEntry));
                var groupsPreKeysKey0 = groupsPreKeysEntry.getKey().toString();
                if (groupsPreKeysKey0 != null) {
                    var groupsPreKeysKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupsPreKeysKey0);
                    if (groupsPreKeysKey1 != null) {
                        protoOutputStream.writeString(1, groupsPreKeysKey1);
                    }
                }
                var groupsPreKeysValue = groupsPreKeysEntry.getValue();
                if (groupsPreKeysValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.sender.SenderPreKeysSpec.sizeOf(groupsPreKeysValue));
                    it.auties.whatsapp.model.signal.sender.SenderPreKeysSpec.encode(groupsPreKeysValue, protoOutputStream);
                }
            }
        }
        var registered = protoInputObject.registered;
        protoOutputStream.writeBool(23, registered);
        var businessCertificate = protoInputObject.businessCertificate;
        protoOutputStream.writeBool(24, businessCertificate);
        var initialAppSync = protoInputObject.initialAppSync;
        protoOutputStream.writeBool(25, initialAppSync);
    }

    public static Keys decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Keys decode(ProtobufInputStream protoInputStream) {
        java.util.UUID uuid = null;
        it.auties.whatsapp.model.mobile.PhoneNumber phoneNumber = null;
        it.auties.whatsapp.api.ClientType clientType = null;
        java.util.Collection<java.lang.String> alias = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newCollection();
        java.lang.Integer registrationId = null;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair noiseKeyPair = null;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair ephemeralKeyPair = null;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair identityKeyPair = null;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair companionKeyPair = null;
        it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPair signedKeyPair = null;
        byte[] signedKeyIndex = null;
        java.lang.Long signedKeyIndexTimestamp = null;
        java.util.List<it.auties.whatsapp.model.signal.keypair.SignalPreKeyPair> preKeys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String fdid = null;
        byte[] deviceId = null;
        java.util.UUID advertisingId = null;
        byte[] identityId = null;
        byte[] backupToken = null;
        it.auties.whatsapp.model.signal.auth.SignedDeviceIdentity companionIdentity = null;
        java.util.Map<it.auties.whatsapp.model.signal.sender.SenderKeyName,it.auties.whatsapp.model.signal.sender.SenderKeyRecord> senderKeys = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        java.util.List<it.auties.whatsapp.model.companion.CompanionSyncKey> appStateKeys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.util.concurrent.ConcurrentMap<it.auties.whatsapp.model.signal.session.SessionAddress,it.auties.whatsapp.model.signal.session.Session> sessions = it.auties.protobuf.builtin.ProtobufMapMixin.newConcurrentMap();
        java.util.concurrent.ConcurrentMap<java.lang.String,it.auties.whatsapp.model.companion.CompanionHashState> hashStates = it.auties.protobuf.builtin.ProtobufMapMixin.newConcurrentMap();
        java.util.concurrent.ConcurrentMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.signal.sender.SenderPreKeys> groupsPreKeys = it.auties.protobuf.builtin.ProtobufMapMixin.newConcurrentMap();
        boolean registered = false;
        boolean businessCertificate = false;
        boolean initialAppSync = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> uuid = it.auties.protobuf.builtin.ProtobufUUIDMixin.ofNullable(protoInputStream.readString());
                case 2 -> phoneNumber = it.auties.whatsapp.model.mobile.PhoneNumber.of(protoInputStream.readInt64());
                case 3 -> clientType = it.auties.whatsapp.api.ClientTypeSpec.decode(protoInputStream.readInt32());
                case 4 -> alias.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> registrationId = protoInputStream.readInt32();
                case 6 -> noiseKeyPair = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> ephemeralKeyPair = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 8 -> identityKeyPair = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 9 -> companionKeyPair = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 10 -> signedKeyPair = it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 11 -> signedKeyIndex = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 12 -> signedKeyIndexTimestamp = protoInputStream.readInt64();
                case 13 -> preKeys.add(it.auties.whatsapp.model.signal.keypair.SignalPreKeyPairSpec.decode(protoInputStream.readLengthDelimited()));
                case 14 -> fdid = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 15 -> deviceId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 26 -> advertisingId = it.auties.protobuf.builtin.ProtobufUUIDMixin.ofNullable(protoInputStream.readString());
                case 16 -> identityId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 27 -> backupToken = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> companionIdentity = it.auties.whatsapp.model.signal.auth.SignedDeviceIdentitySpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> {
                    var senderKeysInputStream = protoInputStream.readLengthDelimited();
                    it.auties.whatsapp.model.signal.sender.SenderKeyName senderKeysKey = null;
                    it.auties.whatsapp.model.signal.sender.SenderKeyRecord senderKeysValue = null;
                    while (senderKeysInputStream.readTag()) {
                        switch (senderKeysInputStream.index()) {
                            case 1 -> senderKeysKey = it.auties.whatsapp.model.signal.sender.SenderKeyName.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(senderKeysInputStream.readString()));
                            case 2 -> senderKeysValue = it.auties.whatsapp.model.signal.sender.SenderKeyRecordSpec.decode(senderKeysInputStream.readLengthDelimited());
                        }
                    }
                    senderKeys.put(senderKeysKey, senderKeysValue);
                }
                case 19 -> appStateKeys.add(it.auties.whatsapp.model.companion.CompanionSyncKeySpec.decode(protoInputStream.readLengthDelimited()));
                case 20 -> {
                    var sessionsInputStream = protoInputStream.readLengthDelimited();
                    it.auties.whatsapp.model.signal.session.SessionAddress sessionsKey = null;
                    it.auties.whatsapp.model.signal.session.Session sessionsValue = null;
                    while (sessionsInputStream.readTag()) {
                        switch (sessionsInputStream.index()) {
                            case 1 -> sessionsKey = it.auties.whatsapp.model.signal.session.SessionAddress.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(sessionsInputStream.readString()));
                            case 2 -> sessionsValue = it.auties.whatsapp.model.signal.session.SessionSpec.decode(sessionsInputStream.readLengthDelimited());
                        }
                    }
                    sessions.put(sessionsKey, sessionsValue);
                }
                case 21 -> {
                    var hashStatesInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String hashStatesKey = null;
                    it.auties.whatsapp.model.companion.CompanionHashState hashStatesValue = null;
                    while (hashStatesInputStream.readTag()) {
                        switch (hashStatesInputStream.index()) {
                            case 1 -> hashStatesKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(hashStatesInputStream.readString());
                            case 2 -> hashStatesValue = it.auties.whatsapp.model.companion.CompanionHashStateSpec.decode(hashStatesInputStream.readLengthDelimited());
                        }
                    }
                    hashStates.put(hashStatesKey, hashStatesValue);
                }
                case 22 -> {
                    var groupsPreKeysInputStream = protoInputStream.readLengthDelimited();
                    it.auties.whatsapp.model.jid.Jid groupsPreKeysKey = null;
                    it.auties.whatsapp.model.signal.sender.SenderPreKeys groupsPreKeysValue = null;
                    while (groupsPreKeysInputStream.readTag()) {
                        switch (groupsPreKeysInputStream.index()) {
                            case 1 -> groupsPreKeysKey = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(groupsPreKeysInputStream.readString()));
                            case 2 -> groupsPreKeysValue = it.auties.whatsapp.model.signal.sender.SenderPreKeysSpec.decode(groupsPreKeysInputStream.readLengthDelimited());
                        }
                    }
                    groupsPreKeys.put(groupsPreKeysKey, groupsPreKeysValue);
                }
                case 23 -> registered = protoInputStream.readBool();
                case 24 -> businessCertificate = protoInputStream.readBool();
                case 25 -> initialAppSync = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.controller.Keys(uuid, phoneNumber, clientType, alias, registrationId, noiseKeyPair, ephemeralKeyPair, identityKeyPair, companionKeyPair, signedKeyPair, signedKeyIndex, signedKeyIndexTimestamp, preKeys, fdid, deviceId, advertisingId, identityId, backupToken, companionIdentity, senderKeys, appStateKeys, sessions, hashStates, groupsPreKeys, registered, businessCertificate, initialAppSync);
    }

    public static int sizeOf(Keys protoInputObject) {
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
        var registrationId = protoInputObject.registrationId;
        if (registrationId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(registrationId);
        }
        var noiseKeyPair = protoInputObject.noiseKeyPair;
        if (noiseKeyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var noiseKeyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(noiseKeyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(noiseKeyPairSerializedSize);
            protoOutputSize += noiseKeyPairSerializedSize;
        }
        var ephemeralKeyPair = protoInputObject.ephemeralKeyPair;
        if (ephemeralKeyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
            var ephemeralKeyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(ephemeralKeyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralKeyPairSerializedSize);
            protoOutputSize += ephemeralKeyPairSerializedSize;
        }
        var identityKeyPair = protoInputObject.identityKeyPair;
        if (identityKeyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
            var identityKeyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(identityKeyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(identityKeyPairSerializedSize);
            protoOutputSize += identityKeyPairSerializedSize;
        }
        var companionKeyPair = protoInputObject.companionKeyPair;
        if (companionKeyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
            var companionKeyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(companionKeyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(companionKeyPairSerializedSize);
            protoOutputSize += companionKeyPairSerializedSize;
        }
        var signedKeyPair = protoInputObject.signedKeyPair;
        if (signedKeyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
            var signedKeyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalSignedKeyPairSpec.sizeOf(signedKeyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(signedKeyPairSerializedSize);
            protoOutputSize += signedKeyPairSerializedSize;
        }
        var signedKeyIndex = protoInputObject.signedKeyIndex;
        if (signedKeyIndex != null) {
            var signedKeyIndex0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signedKeyIndex);
            if (signedKeyIndex0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(signedKeyIndex0);
            }
        }
        var signedKeyIndexTimestamp = protoInputObject.signedKeyIndexTimestamp;
        if (signedKeyIndexTimestamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(12, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(signedKeyIndexTimestamp);
        }
        if (protoInputObject.preKeys != null) {
            for (var preKeysEntry : protoInputObject.preKeys) { 
                if (preKeysEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                    var preKeysEntrySerializedSize = it.auties.whatsapp.model.signal.keypair.SignalPreKeyPairSpec.sizeOf(preKeysEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(preKeysEntrySerializedSize);
                    protoOutputSize += preKeysEntrySerializedSize;
                }
            }
        }
        var fdid = protoInputObject.fdid;
        if (fdid != null) {
            var fdid0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fdid);
            if (fdid0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(fdid0);
            }
        }
        var deviceId = protoInputObject.deviceId;
        if (deviceId != null) {
            var deviceId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceId);
            if (deviceId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(deviceId0);
            }
        }
        var advertisingId = protoInputObject.advertisingId;
        if (advertisingId != null) {
            var advertisingId0 = it.auties.protobuf.builtin.ProtobufUUIDMixin.toValue(advertisingId);
            if (advertisingId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(advertisingId0);
            }
        }
        var identityId = protoInputObject.identityId;
        if (identityId != null) {
            var identityId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(identityId);
            if (identityId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(identityId0);
            }
        }
        var backupToken = protoInputObject.backupToken;
        if (backupToken != null) {
            var backupToken0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(backupToken);
            if (backupToken0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(backupToken0);
            }
        }
        var companionIdentity = protoInputObject.companionIdentity;
        if (companionIdentity != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
            var companionIdentitySerializedSize = it.auties.whatsapp.model.signal.auth.SignedDeviceIdentitySpec.sizeOf(companionIdentity);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(companionIdentitySerializedSize);
            protoOutputSize += companionIdentitySerializedSize;
        }
        var senderKeysMapField = protoInputObject.senderKeys;
        if (senderKeysMapField != null) {
            for (var senderKeysMapEntry : senderKeysMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                var senderKeysMapEntrySize = sizeOfSenderKeys(senderKeysMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(senderKeysMapEntrySize);
                protoOutputSize += senderKeysMapEntrySize;
            }
        }
        if (protoInputObject.appStateKeys != null) {
            for (var appStateKeysEntry : protoInputObject.appStateKeys) { 
                if (appStateKeysEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                    var appStateKeysEntrySerializedSize = it.auties.whatsapp.model.companion.CompanionSyncKeySpec.sizeOf(appStateKeysEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(appStateKeysEntrySerializedSize);
                    protoOutputSize += appStateKeysEntrySerializedSize;
                }
            }
        }
        var sessionsMapField = protoInputObject.sessions;
        if (sessionsMapField != null) {
            for (var sessionsMapEntry : sessionsMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
                var sessionsMapEntrySize = sizeOfSessions(sessionsMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(sessionsMapEntrySize);
                protoOutputSize += sessionsMapEntrySize;
            }
        }
        var hashStatesMapField = protoInputObject.hashStates;
        if (hashStatesMapField != null) {
            for (var hashStatesMapEntry : hashStatesMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                var hashStatesMapEntrySize = sizeOfHashStates(hashStatesMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(hashStatesMapEntrySize);
                protoOutputSize += hashStatesMapEntrySize;
            }
        }
        var groupsPreKeysMapField = protoInputObject.groupsPreKeys;
        if (groupsPreKeysMapField != null) {
            for (var groupsPreKeysMapEntry : groupsPreKeysMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                var groupsPreKeysMapEntrySize = sizeOfGroupsPreKeys(groupsPreKeysMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(groupsPreKeysMapEntrySize);
                protoOutputSize += groupsPreKeysMapEntrySize;
            }
        }
        var registered = protoInputObject.registered;
        protoOutputSize += ProtobufOutputStream.getFieldSize(23, 0);
        protoOutputSize += 1;
        var businessCertificate = protoInputObject.businessCertificate;
        protoOutputSize += ProtobufOutputStream.getFieldSize(24, 0);
        protoOutputSize += 1;
        var initialAppSync = protoInputObject.initialAppSync;
        protoOutputSize += ProtobufOutputStream.getFieldSize(25, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

    private static int sizeOfSenderKeys(java.util.Map.Entry<it.auties.whatsapp.model.signal.sender.SenderKeyName, it.auties.whatsapp.model.signal.sender.SenderKeyRecord> protoInputObject) {
        var protoOutputSize = 0;
        var senderKeysMapKey = protoInputObject.getKey();
        if (senderKeysMapKey != null) {
            var senderKeysMapKey0 = senderKeysMapKey.toString();
            if (senderKeysMapKey0 != null) {
                var senderKeysMapKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderKeysMapKey0);
                if (senderKeysMapKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(senderKeysMapKey1);
                }
            }
        }
        var senderKeysMapValue = protoInputObject.getValue();
        if (senderKeysMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var senderKeysMapValueSerializedSize = it.auties.whatsapp.model.signal.sender.SenderKeyRecordSpec.sizeOf(senderKeysMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(senderKeysMapValueSerializedSize);
            protoOutputSize += senderKeysMapValueSerializedSize;
        }
        return protoOutputSize;
    }

    private static int sizeOfSessions(java.util.Map.Entry<it.auties.whatsapp.model.signal.session.SessionAddress, it.auties.whatsapp.model.signal.session.Session> protoInputObject) {
        var protoOutputSize = 0;
        var sessionsMapKey = protoInputObject.getKey();
        if (sessionsMapKey != null) {
            var sessionsMapKey0 = sessionsMapKey.toString();
            if (sessionsMapKey0 != null) {
                var sessionsMapKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sessionsMapKey0);
                if (sessionsMapKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(sessionsMapKey1);
                }
            }
        }
        var sessionsMapValue = protoInputObject.getValue();
        if (sessionsMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var sessionsMapValueSerializedSize = it.auties.whatsapp.model.signal.session.SessionSpec.sizeOf(sessionsMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(sessionsMapValueSerializedSize);
            protoOutputSize += sessionsMapValueSerializedSize;
        }
        return protoOutputSize;
    }

    private static int sizeOfHashStates(java.util.Map.Entry<java.lang.String, it.auties.whatsapp.model.companion.CompanionHashState> protoInputObject) {
        var protoOutputSize = 0;
        var hashStatesMapKey = protoInputObject.getKey();
        if (hashStatesMapKey != null) {
            var hashStatesMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hashStatesMapKey);
            if (hashStatesMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(hashStatesMapKey0);
            }
        }
        var hashStatesMapValue = protoInputObject.getValue();
        if (hashStatesMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var hashStatesMapValueSerializedSize = it.auties.whatsapp.model.companion.CompanionHashStateSpec.sizeOf(hashStatesMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(hashStatesMapValueSerializedSize);
            protoOutputSize += hashStatesMapValueSerializedSize;
        }
        return protoOutputSize;
    }

    private static int sizeOfGroupsPreKeys(java.util.Map.Entry<it.auties.whatsapp.model.jid.Jid, it.auties.whatsapp.model.signal.sender.SenderPreKeys> protoInputObject) {
        var protoOutputSize = 0;
        var groupsPreKeysMapKey = protoInputObject.getKey();
        if (groupsPreKeysMapKey != null) {
            var groupsPreKeysMapKey0 = groupsPreKeysMapKey.toString();
            if (groupsPreKeysMapKey0 != null) {
                var groupsPreKeysMapKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupsPreKeysMapKey0);
                if (groupsPreKeysMapKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(groupsPreKeysMapKey1);
                }
            }
        }
        var groupsPreKeysMapValue = protoInputObject.getValue();
        if (groupsPreKeysMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var groupsPreKeysMapValueSerializedSize = it.auties.whatsapp.model.signal.sender.SenderPreKeysSpec.sizeOf(groupsPreKeysMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupsPreKeysMapValueSerializedSize);
            protoOutputSize += groupsPreKeysMapValueSerializedSize;
        }
        return protoOutputSize;
    }

}
