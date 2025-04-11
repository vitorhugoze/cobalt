package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.PatchSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PatchSyncSpec {
    public static byte[] encode(PatchSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PatchSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.VersionSyncSpec.sizeOf(version));
            it.auties.whatsapp.model.sync.VersionSyncSpec.encode(version, protoOutputStream);
        }
        if (protoInputObject.mutations() != null) {
            for (var mutationsEntry : protoInputObject.mutations()) { 
                if (mutationsEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.MutationSyncSpec.sizeOf(mutationsEntry));
                    it.auties.whatsapp.model.sync.MutationSyncSpec.encode(mutationsEntry, protoOutputStream);
                }
            }
        }
        var externalMutations = protoInputObject.externalMutations();
        if (externalMutations != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.sync.ExternalBlobReferenceSpec.sizeOf(externalMutations));
            it.auties.whatsapp.model.sync.ExternalBlobReferenceSpec.encode(externalMutations, protoOutputStream);
        }
        var snapshotMac = protoInputObject.snapshotMac();
        if (snapshotMac != null) {
            var snapshotMac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(snapshotMac);
            if (snapshotMac0 != null) {
                protoOutputStream.writeBytes(4, snapshotMac0);
            }
        }
        var patchMac = protoInputObject.patchMac();
        if (patchMac != null) {
            var patchMac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(patchMac);
            if (patchMac0 != null) {
                protoOutputStream.writeBytes(5, patchMac0);
            }
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.sync.KeyIdSpec.sizeOf(keyId));
            it.auties.whatsapp.model.sync.KeyIdSpec.encode(keyId, protoOutputStream);
        }
        var exitCode = protoInputObject.exitCode();
        if (exitCode != null) {
            protoOutputStream.writeMessage(7, it.auties.whatsapp.model.sync.ExitCodeSpec.sizeOf(exitCode));
            it.auties.whatsapp.model.sync.ExitCodeSpec.encode(exitCode, protoOutputStream);
        }
        var deviceIndex = protoInputObject.deviceIndex();
        if (deviceIndex != null) {
            protoOutputStream.writeUInt32(8, deviceIndex);
        }
    }

    public static PatchSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PatchSync decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.VersionSync version = null;
        java.util.List<it.auties.whatsapp.model.sync.MutationSync> mutations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.sync.ExternalBlobReference externalMutations = null;
        byte[] snapshotMac = null;
        byte[] patchMac = null;
        it.auties.whatsapp.model.sync.KeyId keyId = null;
        it.auties.whatsapp.model.sync.ExitCode exitCode = null;
        java.lang.Integer deviceIndex = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> version = it.auties.whatsapp.model.sync.VersionSyncSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> mutations.add(it.auties.whatsapp.model.sync.MutationSyncSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> externalMutations = it.auties.whatsapp.model.sync.ExternalBlobReferenceSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> snapshotMac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> patchMac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 6 -> keyId = it.auties.whatsapp.model.sync.KeyIdSpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> exitCode = it.auties.whatsapp.model.sync.ExitCodeSpec.decode(protoInputStream.readLengthDelimited());
                case 8 -> deviceIndex = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.PatchSync(version, mutations, externalMutations, snapshotMac, patchMac, keyId, exitCode, deviceIndex);
    }

    public static int sizeOf(PatchSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var versionSerializedSize = it.auties.whatsapp.model.sync.VersionSyncSpec.sizeOf(version);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(versionSerializedSize);
            protoOutputSize += versionSerializedSize;
        }
        if (protoInputObject.mutations() != null) {
            for (var mutationsEntry : protoInputObject.mutations()) { 
                if (mutationsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var mutationsEntrySerializedSize = it.auties.whatsapp.model.sync.MutationSyncSpec.sizeOf(mutationsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(mutationsEntrySerializedSize);
                    protoOutputSize += mutationsEntrySerializedSize;
                }
            }
        }
        var externalMutations = protoInputObject.externalMutations();
        if (externalMutations != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var externalMutationsSerializedSize = it.auties.whatsapp.model.sync.ExternalBlobReferenceSpec.sizeOf(externalMutations);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(externalMutationsSerializedSize);
            protoOutputSize += externalMutationsSerializedSize;
        }
        var snapshotMac = protoInputObject.snapshotMac();
        if (snapshotMac != null) {
            var snapshotMac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(snapshotMac);
            if (snapshotMac0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(snapshotMac0);
            }
        }
        var patchMac = protoInputObject.patchMac();
        if (patchMac != null) {
            var patchMac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(patchMac);
            if (patchMac0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(patchMac0);
            }
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var keyIdSerializedSize = it.auties.whatsapp.model.sync.KeyIdSpec.sizeOf(keyId);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keyIdSerializedSize);
            protoOutputSize += keyIdSerializedSize;
        }
        var exitCode = protoInputObject.exitCode();
        if (exitCode != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
            var exitCodeSerializedSize = it.auties.whatsapp.model.sync.ExitCodeSpec.sizeOf(exitCode);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(exitCodeSerializedSize);
            protoOutputSize += exitCodeSerializedSize;
        }
        var deviceIndex = protoInputObject.deviceIndex();
        if (deviceIndex != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceIndex);
        }
        return protoOutputSize;
    }

}
