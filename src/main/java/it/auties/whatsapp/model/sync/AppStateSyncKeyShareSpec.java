package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateSyncKeyShare;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateSyncKeyShareSpec {
    public static byte[] encode(AppStateSyncKeyShare protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateSyncKeyShare protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.keys() != null) {
            for (var keysEntry : protoInputObject.keys()) { 
                if (keysEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.AppStateSyncKeySpec.sizeOf(keysEntry));
                    it.auties.whatsapp.model.sync.AppStateSyncKeySpec.encode(keysEntry, protoOutputStream);
                }
            }
        }
    }

    public static AppStateSyncKeyShare decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateSyncKeyShare decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.sync.AppStateSyncKey> keys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> keys.add(it.auties.whatsapp.model.sync.AppStateSyncKeySpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateSyncKeyShare(keys);
    }

    public static int sizeOf(AppStateSyncKeyShare protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.keys() != null) {
            for (var keysEntry : protoInputObject.keys()) { 
                if (keysEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var keysEntrySerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeySpec.sizeOf(keysEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(keysEntrySerializedSize);
                    protoOutputSize += keysEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
