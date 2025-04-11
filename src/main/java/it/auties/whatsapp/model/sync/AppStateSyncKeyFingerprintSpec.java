package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateSyncKeyFingerprintSpec {
    public static byte[] encode(AppStateSyncKeyFingerprint protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateSyncKeyFingerprint protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var rawId = protoInputObject.rawId();
        if (rawId != null) {
            protoOutputStream.writeUInt32(1, rawId);
        }
        var currentIndex = protoInputObject.currentIndex();
        if (currentIndex != null) {
            protoOutputStream.writeUInt32(2, currentIndex);
        }
        protoOutputStream.writeUInt32Packed(3, protoInputObject.deviceIndexes());
    }

    public static AppStateSyncKeyFingerprint decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateSyncKeyFingerprint decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer rawId = null;
        java.lang.Integer currentIndex = null;
        java.util.List<java.lang.Integer> deviceIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> rawId = protoInputStream.readInt32();
                case 2 -> currentIndex = protoInputStream.readInt32();
                case 3 -> deviceIndexes.addAll(protoInputStream.readInt32Packed());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint(rawId, currentIndex, deviceIndexes);
    }

    public static int sizeOf(AppStateSyncKeyFingerprint protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var rawId = protoInputObject.rawId();
        if (rawId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(rawId);
        }
        var currentIndex = protoInputObject.currentIndex();
        if (currentIndex != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(currentIndex);
        }
        protoOutputSize += ProtobufOutputStream.getVarIntPackedSize(3, protoInputObject.deviceIndexes());
        return protoOutputSize;
    }

}
