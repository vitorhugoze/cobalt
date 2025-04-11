package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateSyncKeyId;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateSyncKeyIdSpec {
    public static byte[] encode(AppStateSyncKeyId protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateSyncKeyId protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            var keyId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(keyId);
            if (keyId0 != null) {
                protoOutputStream.writeBytes(1, keyId0);
            }
        }
    }

    public static AppStateSyncKeyId decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateSyncKeyId decode(ProtobufInputStream protoInputStream) {
        byte[] keyId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> keyId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyId(keyId);
    }

    public static int sizeOf(AppStateSyncKeyId protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            var keyId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(keyId);
            if (keyId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(keyId0);
            }
        }
        return protoOutputSize;
    }

}
