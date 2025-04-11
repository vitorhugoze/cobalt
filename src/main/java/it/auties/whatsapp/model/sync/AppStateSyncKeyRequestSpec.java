package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateSyncKeyRequest;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateSyncKeyRequestSpec {
    public static byte[] encode(AppStateSyncKeyRequest protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateSyncKeyRequest protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.keyIds() != null) {
            for (var keyIdsEntry : protoInputObject.keyIds()) { 
                if (keyIdsEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.sizeOf(keyIdsEntry));
                    it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.encode(keyIdsEntry, protoOutputStream);
                }
            }
        }
    }

    public static AppStateSyncKeyRequest decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateSyncKeyRequest decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.sync.AppStateSyncKeyId> keyIds = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> keyIds.add(it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyRequest(keyIds);
    }

    public static int sizeOf(AppStateSyncKeyRequest protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.keyIds() != null) {
            for (var keyIdsEntry : protoInputObject.keyIds()) { 
                if (keyIdsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var keyIdsEntrySerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeyIdSpec.sizeOf(keyIdsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(keyIdsEntrySerializedSize);
                    protoOutputSize += keyIdsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
