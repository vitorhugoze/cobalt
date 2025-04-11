package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.KeepInChat;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class KeepInChatSpec {
    public static byte[] encode(KeepInChat protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(KeepInChat protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var keepType = protoInputObject.keepType();
        if (keepType != null) {
            var keepType0 = it.auties.whatsapp.model.message.model.KeepInChatTypeSpec.encode(keepType);
            protoOutputStream.writeInt32(1, keepType0);
        }
        var serverTimestampSeconds = protoInputObject.serverTimestampSeconds();
        protoOutputStream.writeInt64(2, serverTimestampSeconds);
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
        var deviceJid = protoInputObject.deviceJid();
        if (deviceJid != null) {
            var deviceJid0 = deviceJid.toString();
            if (deviceJid0 != null) {
                var deviceJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceJid0);
                if (deviceJid1 != null) {
                    protoOutputStream.writeString(4, deviceJid1);
                }
            }
        }
        var clientTimestampInMilliseconds = protoInputObject.clientTimestampInMilliseconds();
        protoOutputStream.writeInt64(5, clientTimestampInMilliseconds);
        var serverTimestampMilliseconds = protoInputObject.serverTimestampMilliseconds();
        protoOutputStream.writeInt64(6, serverTimestampMilliseconds);
    }

    public static KeepInChat decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static KeepInChat decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.KeepInChatType keepType = null;
        long serverTimestampSeconds = 0l;
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        it.auties.whatsapp.model.jid.Jid deviceJid = null;
        long clientTimestampInMilliseconds = 0l;
        long serverTimestampMilliseconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> keepType = it.auties.whatsapp.model.message.model.KeepInChatTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> serverTimestampSeconds = protoInputStream.readInt64();
                case 3 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> deviceJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> clientTimestampInMilliseconds = protoInputStream.readInt64();
                case 6 -> serverTimestampMilliseconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.model.KeepInChat(keepType, serverTimestampSeconds, key, deviceJid, clientTimestampInMilliseconds, serverTimestampMilliseconds);
    }

    public static int sizeOf(KeepInChat protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var keepType = protoInputObject.keepType();
        if (keepType != null) {
            var keepType0 = it.auties.whatsapp.model.message.model.KeepInChatTypeSpec.encode(keepType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keepType0);
        }
        var serverTimestampSeconds = protoInputObject.serverTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(serverTimestampSeconds);
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var keySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keySerializedSize);
            protoOutputSize += keySerializedSize;
        }
        var deviceJid = protoInputObject.deviceJid();
        if (deviceJid != null) {
            var deviceJid0 = deviceJid.toString();
            if (deviceJid0 != null) {
                var deviceJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceJid0);
                if (deviceJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(deviceJid1);
                }
            }
        }
        var clientTimestampInMilliseconds = protoInputObject.clientTimestampInMilliseconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(clientTimestampInMilliseconds);
        var serverTimestampMilliseconds = protoInputObject.serverTimestampMilliseconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(serverTimestampMilliseconds);
        return protoOutputSize;
    }

}
