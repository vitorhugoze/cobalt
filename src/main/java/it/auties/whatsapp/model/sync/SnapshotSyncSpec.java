package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.SnapshotSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SnapshotSyncSpec {
    public static byte[] encode(SnapshotSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SnapshotSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.VersionSyncSpec.sizeOf(version));
            it.auties.whatsapp.model.sync.VersionSyncSpec.encode(version, protoOutputStream);
        }
        if (protoInputObject.records() != null) {
            for (var recordsEntry : protoInputObject.records()) { 
                if (recordsEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.RecordSyncSpec.sizeOf(recordsEntry));
                    it.auties.whatsapp.model.sync.RecordSyncSpec.encode(recordsEntry, protoOutputStream);
                }
            }
        }
        var mac = protoInputObject.mac();
        if (mac != null) {
            var mac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mac);
            if (mac0 != null) {
                protoOutputStream.writeBytes(3, mac0);
            }
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputStream.writeMessage(4, it.auties.whatsapp.model.sync.KeyIdSpec.sizeOf(keyId));
            it.auties.whatsapp.model.sync.KeyIdSpec.encode(keyId, protoOutputStream);
        }
    }

    public static SnapshotSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SnapshotSync decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.VersionSync version = null;
        java.util.List<it.auties.whatsapp.model.sync.RecordSync> records = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        byte[] mac = null;
        it.auties.whatsapp.model.sync.KeyId keyId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> version = it.auties.whatsapp.model.sync.VersionSyncSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> records.add(it.auties.whatsapp.model.sync.RecordSyncSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> mac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> keyId = it.auties.whatsapp.model.sync.KeyIdSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.SnapshotSync(version, records, mac, keyId);
    }

    public static int sizeOf(SnapshotSync protoInputObject) {
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
        if (protoInputObject.records() != null) {
            for (var recordsEntry : protoInputObject.records()) { 
                if (recordsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var recordsEntrySerializedSize = it.auties.whatsapp.model.sync.RecordSyncSpec.sizeOf(recordsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(recordsEntrySerializedSize);
                    protoOutputSize += recordsEntrySerializedSize;
                }
            }
        }
        var mac = protoInputObject.mac();
        if (mac != null) {
            var mac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mac);
            if (mac0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mac0);
            }
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            var keyIdSerializedSize = it.auties.whatsapp.model.sync.KeyIdSpec.sizeOf(keyId);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keyIdSerializedSize);
            protoOutputSize += keyIdSerializedSize;
        }
        return protoOutputSize;
    }

}
