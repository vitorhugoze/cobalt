package it.auties.whatsapp.model.signal.session;

import it.auties.whatsapp.model.signal.session.SessionState;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SessionStateSpec {
    public static byte[] encode(SessionState protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SessionState protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var version = protoInputObject.version();
        protoOutputStream.writeInt32(1, version);
        var registrationId = protoInputObject.registrationId();
        protoOutputStream.writeInt32(2, registrationId);
        var baseKey = protoInputObject.baseKey();
        if (baseKey != null) {
            var baseKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(baseKey);
            if (baseKey0 != null) {
                protoOutputStream.writeBytes(3, baseKey0);
            }
        }
        var remoteIdentityKey = protoInputObject.remoteIdentityKey();
        if (remoteIdentityKey != null) {
            var remoteIdentityKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(remoteIdentityKey);
            if (remoteIdentityKey0 != null) {
                protoOutputStream.writeBytes(4, remoteIdentityKey0);
            }
        }
        if (protoInputObject.chains() != null) {
            for (var chainsEntry : protoInputObject.chains().entrySet()) { 
                protoOutputStream.writeMessage(5, sizeOfChains(chainsEntry));
                var chainsKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chainsEntry.getKey());
                if (chainsKey0 != null) {
                    protoOutputStream.writeString(1, chainsKey0);
                }
                var chainsValue = chainsEntry.getValue();
                if (chainsValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.session.SessionChainSpec.sizeOf(chainsValue));
                    it.auties.whatsapp.model.signal.session.SessionChainSpec.encode(chainsValue, protoOutputStream);
                }
            }
        }
        var rootKey = protoInputObject.rootKey();
        if (rootKey != null) {
            var rootKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(rootKey);
            if (rootKey0 != null) {
                protoOutputStream.writeBytes(6, rootKey0);
            }
        }
        var pendingPreKey = protoInputObject.pendingPreKey();
        if (pendingPreKey != null) {
            protoOutputStream.writeMessage(7, it.auties.whatsapp.model.signal.session.SessionPreKeySpec.sizeOf(pendingPreKey));
            it.auties.whatsapp.model.signal.session.SessionPreKeySpec.encode(pendingPreKey, protoOutputStream);
        }
        var ephemeralKeyPair = protoInputObject.ephemeralKeyPair();
        if (ephemeralKeyPair != null) {
            protoOutputStream.writeMessage(8, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(ephemeralKeyPair));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(ephemeralKeyPair, protoOutputStream);
        }
        var lastRemoteEphemeralKey = protoInputObject.lastRemoteEphemeralKey();
        if (lastRemoteEphemeralKey != null) {
            var lastRemoteEphemeralKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lastRemoteEphemeralKey);
            if (lastRemoteEphemeralKey0 != null) {
                protoOutputStream.writeBytes(9, lastRemoteEphemeralKey0);
            }
        }
        var previousCounter = protoInputObject.previousCounter();
        protoOutputStream.writeInt32(10, previousCounter);
        var closed = protoInputObject.closed();
        protoOutputStream.writeBool(11, closed);
    }

    public static SessionState decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SessionState decode(ProtobufInputStream protoInputStream) {
        int version = 0;
        int registrationId = 0;
        byte[] baseKey = null;
        byte[] remoteIdentityKey = null;
        java.util.concurrent.ConcurrentHashMap<java.lang.String,it.auties.whatsapp.model.signal.session.SessionChain> chains = new java.util.concurrent.ConcurrentHashMap();
        byte[] rootKey = null;
        it.auties.whatsapp.model.signal.session.SessionPreKey pendingPreKey = null;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair ephemeralKeyPair = null;
        byte[] lastRemoteEphemeralKey = null;
        int previousCounter = 0;
        boolean closed = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> version = protoInputStream.readInt32();
                case 2 -> registrationId = protoInputStream.readInt32();
                case 3 -> baseKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> remoteIdentityKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> {
                    var chainsInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String chainsKey = null;
                    it.auties.whatsapp.model.signal.session.SessionChain chainsValue = null;
                    while (chainsInputStream.readTag()) {
                        switch (chainsInputStream.index()) {
                            case 1 -> chainsKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(chainsInputStream.readString());
                            case 2 -> chainsValue = it.auties.whatsapp.model.signal.session.SessionChainSpec.decode(chainsInputStream.readLengthDelimited());
                        }
                    }
                    chains.put(chainsKey, chainsValue);
                }
                case 6 -> rootKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 7 -> pendingPreKey = it.auties.whatsapp.model.signal.session.SessionPreKeySpec.decode(protoInputStream.readLengthDelimited());
                case 8 -> ephemeralKeyPair = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 9 -> lastRemoteEphemeralKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 10 -> previousCounter = protoInputStream.readInt32();
                case 11 -> closed = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.session.SessionState(version, registrationId, baseKey, remoteIdentityKey, chains, rootKey, pendingPreKey, ephemeralKeyPair, lastRemoteEphemeralKey, previousCounter, closed);
    }

    public static int sizeOf(SessionState protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var version = protoInputObject.version();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        var registrationId = protoInputObject.registrationId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(registrationId);
        var baseKey = protoInputObject.baseKey();
        if (baseKey != null) {
            var baseKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(baseKey);
            if (baseKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(baseKey0);
            }
        }
        var remoteIdentityKey = protoInputObject.remoteIdentityKey();
        if (remoteIdentityKey != null) {
            var remoteIdentityKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(remoteIdentityKey);
            if (remoteIdentityKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(remoteIdentityKey0);
            }
        }
        var chainsMapField = protoInputObject.chains();
        if (chainsMapField != null) {
            for (var chainsMapEntry : chainsMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var chainsMapEntrySize = sizeOfChains(chainsMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(chainsMapEntrySize);
                protoOutputSize += chainsMapEntrySize;
            }
        }
        var rootKey = protoInputObject.rootKey();
        if (rootKey != null) {
            var rootKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(rootKey);
            if (rootKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(rootKey0);
            }
        }
        var pendingPreKey = protoInputObject.pendingPreKey();
        if (pendingPreKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
            var pendingPreKeySerializedSize = it.auties.whatsapp.model.signal.session.SessionPreKeySpec.sizeOf(pendingPreKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(pendingPreKeySerializedSize);
            protoOutputSize += pendingPreKeySerializedSize;
        }
        var ephemeralKeyPair = protoInputObject.ephemeralKeyPair();
        if (ephemeralKeyPair != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
            var ephemeralKeyPairSerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(ephemeralKeyPair);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralKeyPairSerializedSize);
            protoOutputSize += ephemeralKeyPairSerializedSize;
        }
        var lastRemoteEphemeralKey = protoInputObject.lastRemoteEphemeralKey();
        if (lastRemoteEphemeralKey != null) {
            var lastRemoteEphemeralKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lastRemoteEphemeralKey);
            if (lastRemoteEphemeralKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(lastRemoteEphemeralKey0);
            }
        }
        var previousCounter = protoInputObject.previousCounter();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(previousCounter);
        var closed = protoInputObject.closed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(11, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

    private static int sizeOfChains(java.util.Map.Entry<java.lang.String, it.auties.whatsapp.model.signal.session.SessionChain> protoInputObject) {
        var protoOutputSize = 0;
        var chainsMapKey = protoInputObject.getKey();
        if (chainsMapKey != null) {
            var chainsMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chainsMapKey);
            if (chainsMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(chainsMapKey0);
            }
        }
        var chainsMapValue = protoInputObject.getValue();
        if (chainsMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var chainsMapValueSerializedSize = it.auties.whatsapp.model.signal.session.SessionChainSpec.sizeOf(chainsMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(chainsMapValueSerializedSize);
            protoOutputSize += chainsMapValueSerializedSize;
        }
        return protoOutputSize;
    }

}
