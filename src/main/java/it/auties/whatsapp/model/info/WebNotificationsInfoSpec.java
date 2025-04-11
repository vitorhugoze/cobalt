package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.WebNotificationsInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class WebNotificationsInfoSpec {
    public static byte[] encode(WebNotificationsInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(WebNotificationsInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputStream.writeUInt64(2, timestampSeconds);
        var unreadChats = protoInputObject.unreadChats();
        protoOutputStream.writeUInt32(3, unreadChats);
        var notifyMessageCount = protoInputObject.notifyMessageCount();
        protoOutputStream.writeUInt32(4, notifyMessageCount);
        if (protoInputObject.notifyMessages() != null) {
            for (var notifyMessagesEntry : protoInputObject.notifyMessages()) { 
                if (notifyMessagesEntry != null) {
                    protoOutputStream.writeMessage(5, it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(notifyMessagesEntry));
                    it.auties.whatsapp.model.info.ChatMessageInfoSpec.encode(notifyMessagesEntry, protoOutputStream);
                }
            }
        }
    }

    public static WebNotificationsInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static WebNotificationsInfo decode(ProtobufInputStream protoInputStream) {
        long timestampSeconds = 0l;
        int unreadChats = 0;
        int notifyMessageCount = 0;
        java.util.List<it.auties.whatsapp.model.info.ChatMessageInfo> notifyMessages = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 2 -> timestampSeconds = protoInputStream.readInt64();
                case 3 -> unreadChats = protoInputStream.readInt32();
                case 4 -> notifyMessageCount = protoInputStream.readInt32();
                case 5 -> notifyMessages.add(it.auties.whatsapp.model.info.ChatMessageInfoSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.WebNotificationsInfo(timestampSeconds, unreadChats, notifyMessageCount, notifyMessages);
    }

    public static int sizeOf(WebNotificationsInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampSeconds);
        var unreadChats = protoInputObject.unreadChats();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(unreadChats);
        var notifyMessageCount = protoInputObject.notifyMessageCount();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(notifyMessageCount);
        if (protoInputObject.notifyMessages() != null) {
            for (var notifyMessagesEntry : protoInputObject.notifyMessages()) { 
                if (notifyMessagesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    var notifyMessagesEntrySerializedSize = it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(notifyMessagesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(notifyMessagesEntrySerializedSize);
                    protoOutputSize += notifyMessagesEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
