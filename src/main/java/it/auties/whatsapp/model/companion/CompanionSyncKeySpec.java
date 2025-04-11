package it.auties.whatsapp.model.companion;

import it.auties.whatsapp.model.companion.CompanionSyncKey;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CompanionSyncKeySpec {
    public static byte[] encode(CompanionSyncKey protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CompanionSyncKey protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var companion = protoInputObject.companion();
        if (companion != null) {
            var companion0 = companion.toString();
            if (companion0 != null) {
                var companion1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(companion0);
                if (companion1 != null) {
                    protoOutputStream.writeString(1, companion1);
                }
            }
        }
        if (protoInputObject.keys() != null) {
            for (var keysEntry : protoInputObject.keys()) { 
                if (keysEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.AppStateSyncKeySpec.sizeOf(keysEntry));
                    it.auties.whatsapp.model.sync.AppStateSyncKeySpec.encode(keysEntry, protoOutputStream);
                }
            }
        }
    }

    public static CompanionSyncKey decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CompanionSyncKey decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid companion = null;
        java.util.LinkedList<it.auties.whatsapp.model.sync.AppStateSyncKey> keys = new java.util.LinkedList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> companion = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> keys.add(it.auties.whatsapp.model.sync.AppStateSyncKeySpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.companion.CompanionSyncKey(companion, keys);
    }

    public static int sizeOf(CompanionSyncKey protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var companion = protoInputObject.companion();
        if (companion != null) {
            var companion0 = companion.toString();
            if (companion0 != null) {
                var companion1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(companion0);
                if (companion1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(companion1);
                }
            }
        }
        if (protoInputObject.keys() != null) {
            for (var keysEntry : protoInputObject.keys()) { 
                if (keysEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var keysEntrySerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeySpec.sizeOf(keysEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(keysEntrySerializedSize);
                    protoOutputSize += keysEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
