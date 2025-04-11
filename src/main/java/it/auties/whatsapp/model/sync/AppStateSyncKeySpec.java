package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateSyncKey;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateSyncKeySpec {
    public static byte[] encode(AppStateSyncKey protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateSyncKey protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.sizeOf(keyId));
            it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.encode(keyId, protoOutputStream);
        }
        var keyData = protoInputObject.keyData();
        if (keyData != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.AppStateSyncKeyDataSpec.sizeOf(keyData));
            it.auties.whatsapp.model.sync.AppStateSyncKeyDataSpec.encode(keyData, protoOutputStream);
        }
    }

    public static AppStateSyncKey decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateSyncKey decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.AppStateSyncKeyId keyId = null;
        it.auties.whatsapp.model.sync.AppStateSyncKeyData keyData = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> keyId = it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> keyData = it.auties.whatsapp.model.sync.AppStateSyncKeyDataSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateSyncKey(keyId, keyData);
    }

    public static int sizeOf(AppStateSyncKey protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var keyIdSerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.sizeOf(keyId);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keyIdSerializedSize);
            protoOutputSize += keyIdSerializedSize;
        }
        var keyData = protoInputObject.keyData();
        if (keyData != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var keyDataSerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeyDataSpec.sizeOf(keyData);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keyDataSerializedSize);
            protoOutputSize += keyDataSerializedSize;
        }
        return protoOutputSize;
    }

}
