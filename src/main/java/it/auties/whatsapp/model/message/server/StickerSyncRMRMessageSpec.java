package it.auties.whatsapp.model.message.server;

import it.auties.whatsapp.model.message.server.StickerSyncRMRMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class StickerSyncRMRMessageSpec {
    public static byte[] encode(StickerSyncRMRMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(StickerSyncRMRMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.hash() != null) {
            for (var hashEntry : protoInputObject.hash()) { 
                if (hashEntry != null) {
                    var hash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hashEntry);
                    if (hash0 != null) {
                        protoOutputStream.writeString(1, hash0);
                    }
                }
            }
        }
        var rmrSource = protoInputObject.rmrSource();
        if (rmrSource != null) {
            var rmrSource0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(rmrSource);
            if (rmrSource0 != null) {
                protoOutputStream.writeString(2, rmrSource0);
            }
        }
        var requestTimestamp = protoInputObject.requestTimestamp();
        protoOutputStream.writeInt64(3, requestTimestamp);
    }

    public static StickerSyncRMRMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static StickerSyncRMRMessage decode(ProtobufInputStream protoInputStream) {
        java.util.List<java.lang.String> hash = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String rmrSource = null;
        long requestTimestamp = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> hash.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> rmrSource = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> requestTimestamp = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.server.StickerSyncRMRMessage(hash, rmrSource, requestTimestamp);
    }

    public static int sizeOf(StickerSyncRMRMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.hash() != null) {
            for (var hashEntry : protoInputObject.hash()) { 
                if (hashEntry != null) {
                    var hashEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hashEntry);
                    if (hashEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(hashEntry0);
                    }
                }
            }
        }
        var rmrSource = protoInputObject.rmrSource();
        if (rmrSource != null) {
            var rmrSource0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(rmrSource);
            if (rmrSource0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(rmrSource0);
            }
        }
        var requestTimestamp = protoInputObject.requestTimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(requestTimestamp);
        return protoOutputSize;
    }

}
