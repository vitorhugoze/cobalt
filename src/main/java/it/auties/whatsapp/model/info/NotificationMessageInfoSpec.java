package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.NotificationMessageInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NotificationMessageInfoSpec {
    public static byte[] encode(NotificationMessageInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NotificationMessageInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message));
            it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(message, protoOutputStream);
        }
        var messageTimestampSeconds = protoInputObject.messageTimestampSeconds();
        protoOutputStream.writeUInt64(3, messageTimestampSeconds);
        var participant = protoInputObject.participant();
        if (participant != null) {
            var participant0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(participant);
            if (participant0 != null) {
                var participant1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(participant0);
                if (participant1 != null) {
                    protoOutputStream.writeString(4, participant1);
                }
            }
        }
    }

    public static NotificationMessageInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NotificationMessageInfo decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        it.auties.whatsapp.model.message.model.MessageContainer message = null;
        long messageTimestampSeconds = 0l;
        java.util.Optional<java.lang.String> participant = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> message = it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> messageTimestampSeconds = protoInputStream.readInt64();
                case 4 -> participant = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.NotificationMessageInfo(key, message, messageTimestampSeconds, participant);
    }

    public static int sizeOf(NotificationMessageInfo protoInputObject) {
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
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var messageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageSerializedSize);
            protoOutputSize += messageSerializedSize;
        }
        var messageTimestampSeconds = protoInputObject.messageTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(messageTimestampSeconds);
        var participant = protoInputObject.participant();
        if (participant != null) {
            var participant0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(participant);
            if (participant0 != null) {
                var participant1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(participant0);
                if (participant1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(participant1);
                }
            }
        }
        return protoOutputSize;
    }

}
