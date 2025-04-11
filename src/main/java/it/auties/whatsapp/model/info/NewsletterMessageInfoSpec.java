package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.NewsletterMessageInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterMessageInfoSpec {
    public static byte[] encode(NewsletterMessageInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterMessageInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var serverId = protoInputObject.serverId();
        protoOutputStream.writeInt32(2, serverId);
        var timestampSeconds = protoInputObject.timestampSeconds();
        if (timestampSeconds != null) {
            var timestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(timestampSeconds);
            if (timestampSeconds0 != null) {
                protoOutputStream.writeUInt64(3, timestampSeconds0);
            }
        }
        var views = protoInputObject.views();
        if (views != null) {
            var views0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(views);
            if (views0 != null) {
                protoOutputStream.writeUInt64(4, views0);
            }
        }
        if (protoInputObject.reactions != null) {
            for (var reactionsEntry : protoInputObject.reactions.entrySet()) { 
                protoOutputStream.writeMessage(5, sizeOfReactions(reactionsEntry));
                var reactionsKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(reactionsEntry.getKey());
                if (reactionsKey0 != null) {
                    protoOutputStream.writeString(1, reactionsKey0);
                }
                var reactionsValue = reactionsEntry.getValue();
                if (reactionsValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.newsletter.NewsletterReactionSpec.sizeOf(reactionsValue));
                    it.auties.whatsapp.model.newsletter.NewsletterReactionSpec.encode(reactionsValue, protoOutputStream);
                }
            }
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message));
            it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(message, protoOutputStream);
        }
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.message.model.MessageStatusSpec.encode(status);
            protoOutputStream.writeInt32(7, status0);
        }
    }

    public static NewsletterMessageInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterMessageInfo decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        int serverId = 0;
        java.lang.Long timestampSeconds = null;
        java.lang.Long views = null;
        java.util.Map<java.lang.String,it.auties.whatsapp.model.newsletter.NewsletterReaction> reactions = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        it.auties.whatsapp.model.message.model.MessageContainer message = null;
        it.auties.whatsapp.model.message.model.MessageStatus status = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> serverId = protoInputStream.readInt32();
                case 3 -> timestampSeconds = protoInputStream.readInt64();
                case 4 -> views = protoInputStream.readInt64();
                case 5 -> {
                    var reactionsInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String reactionsKey = null;
                    it.auties.whatsapp.model.newsletter.NewsletterReaction reactionsValue = null;
                    while (reactionsInputStream.readTag()) {
                        switch (reactionsInputStream.index()) {
                            case 1 -> reactionsKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(reactionsInputStream.readString());
                            case 2 -> reactionsValue = it.auties.whatsapp.model.newsletter.NewsletterReactionSpec.decode(reactionsInputStream.readLengthDelimited());
                        }
                    }
                    reactions.put(reactionsKey, reactionsValue);
                }
                case 6 -> message = it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> status = it.auties.whatsapp.model.message.model.MessageStatusSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.NewsletterMessageInfo(id, serverId, timestampSeconds, views, reactions, message, status);
    }

    public static int sizeOf(NewsletterMessageInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var serverId = protoInputObject.serverId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(serverId);
        var timestampSeconds = protoInputObject.timestampSeconds();
        if (timestampSeconds != null) {
            var timestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(timestampSeconds);
            if (timestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampSeconds0);
            }
        }
        var views = protoInputObject.views();
        if (views != null) {
            var views0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(views);
            if (views0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(views0);
            }
        }
        var reactionsMapField = protoInputObject.reactions;
        if (reactionsMapField != null) {
            for (var reactionsMapEntry : reactionsMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var reactionsMapEntrySize = sizeOfReactions(reactionsMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(reactionsMapEntrySize);
                protoOutputSize += reactionsMapEntrySize;
            }
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var messageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageSerializedSize);
            protoOutputSize += messageSerializedSize;
        }
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.message.model.MessageStatusSpec.encode(status);
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(status0);
        }
        return protoOutputSize;
    }

    private static int sizeOfReactions(java.util.Map.Entry<java.lang.String, it.auties.whatsapp.model.newsletter.NewsletterReaction> protoInputObject) {
        var protoOutputSize = 0;
        var reactionsMapKey = protoInputObject.getKey();
        if (reactionsMapKey != null) {
            var reactionsMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(reactionsMapKey);
            if (reactionsMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(reactionsMapKey0);
            }
        }
        var reactionsMapValue = protoInputObject.getValue();
        if (reactionsMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var reactionsMapValueSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterReactionSpec.sizeOf(reactionsMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(reactionsMapValueSerializedSize);
            protoOutputSize += reactionsMapValueSerializedSize;
        }
        return protoOutputSize;
    }

}
