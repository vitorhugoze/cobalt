package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateSyncKeyData;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateSyncKeyDataSpec {
    public static byte[] encode(AppStateSyncKeyData protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateSyncKeyData protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var keyData = protoInputObject.keyData();
        if (keyData != null) {
            var keyData0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(keyData);
            if (keyData0 != null) {
                protoOutputStream.writeBytes(1, keyData0);
            }
        }
        var fingerprint = protoInputObject.fingerprint();
        if (fingerprint != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprintSpec.sizeOf(fingerprint));
            it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprintSpec.encode(fingerprint, protoOutputStream);
        }
        var timestamp = protoInputObject.timestamp();
        if (timestamp != null) {
            protoOutputStream.writeInt64(3, timestamp);
        }
    }

    public static AppStateSyncKeyData decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateSyncKeyData decode(ProtobufInputStream protoInputStream) {
        byte[] keyData = null;
        it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprint fingerprint = null;
        java.lang.Long timestamp = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> keyData = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> fingerprint = it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprintSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> timestamp = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyData(keyData, fingerprint, timestamp);
    }

    public static int sizeOf(AppStateSyncKeyData protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var keyData = protoInputObject.keyData();
        if (keyData != null) {
            var keyData0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(keyData);
            if (keyData0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(keyData0);
            }
        }
        var fingerprint = protoInputObject.fingerprint();
        if (fingerprint != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var fingerprintSerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeyFingerprintSpec.sizeOf(fingerprint);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(fingerprintSerializedSize);
            protoOutputSize += fingerprintSerializedSize;
        }
        var timestamp = protoInputObject.timestamp();
        if (timestamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(timestamp);
        }
        return protoOutputSize;
    }

}
