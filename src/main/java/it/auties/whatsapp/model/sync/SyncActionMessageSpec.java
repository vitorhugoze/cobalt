package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.SyncActionMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SyncActionMessageSpec {
    public static byte[] encode(SyncActionMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SyncActionMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
        var timestamp = protoInputObject.timestamp();
        if (timestamp != null) {
            protoOutputStream.writeInt64(2, timestamp);
        }
    }

    public static SyncActionMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SyncActionMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        java.lang.Long timestamp = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> timestamp = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.SyncActionMessage(key, timestamp);
    }

    public static int sizeOf(SyncActionMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var keySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keySerializedSize);
            protoOutputSize += keySerializedSize;
        }
        var timestamp = protoInputObject.timestamp();
        if (timestamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(timestamp);
        }
        return protoOutputSize;
    }

}
