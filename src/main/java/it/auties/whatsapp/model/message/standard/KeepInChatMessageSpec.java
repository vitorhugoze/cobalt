package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.KeepInChatMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class KeepInChatMessageSpec {
    public static byte[] encode(KeepInChatMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(KeepInChatMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
        var keepType = protoInputObject.keepType();
        if (keepType != null) {
            var keepType0 = it.auties.whatsapp.model.message.model.KeepInChatTypeSpec.encode(keepType);
            protoOutputStream.writeInt32(2, keepType0);
        }
        var timestampMilliseconds = protoInputObject.timestampMilliseconds();
        protoOutputStream.writeInt64(3, timestampMilliseconds);
    }

    public static KeepInChatMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static KeepInChatMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        it.auties.whatsapp.model.message.model.KeepInChatType keepType = null;
        long timestampMilliseconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> keepType = it.auties.whatsapp.model.message.model.KeepInChatTypeSpec.decode(protoInputStream.readInt32());
                case 3 -> timestampMilliseconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.KeepInChatMessage(key, keepType, timestampMilliseconds);
    }

    public static int sizeOf(KeepInChatMessage protoInputObject) {
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
        var keepType = protoInputObject.keepType();
        if (keepType != null) {
            var keepType0 = it.auties.whatsapp.model.message.model.KeepInChatTypeSpec.encode(keepType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keepType0);
        }
        var timestampMilliseconds = protoInputObject.timestampMilliseconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampMilliseconds);
        return protoOutputSize;
    }

}
