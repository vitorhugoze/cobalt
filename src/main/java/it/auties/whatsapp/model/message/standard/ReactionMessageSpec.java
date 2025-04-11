package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.ReactionMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ReactionMessageSpec {
    public static byte[] encode(ReactionMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ReactionMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key, protoOutputStream);
        }
        var content = protoInputObject.content();
        if (content != null) {
            var content0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(content);
            if (content0 != null) {
                protoOutputStream.writeString(2, content0);
            }
        }
        var groupingKey = protoInputObject.groupingKey();
        if (groupingKey != null) {
            var groupingKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(groupingKey);
            if (groupingKey0 != null) {
                var groupingKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupingKey0);
                if (groupingKey1 != null) {
                    protoOutputStream.writeString(3, groupingKey1);
                }
            }
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputStream.writeInt64(4, timestampSeconds);
    }

    public static ReactionMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ReactionMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey key = null;
        java.lang.String content = null;
        java.util.Optional<java.lang.String> groupingKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        long timestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> groupingKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> timestampSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.ReactionMessage(key, content, groupingKey, timestampSeconds);
    }

    public static int sizeOf(ReactionMessage protoInputObject) {
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
        var content = protoInputObject.content();
        if (content != null) {
            var content0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(content);
            if (content0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(content0);
            }
        }
        var groupingKey = protoInputObject.groupingKey();
        if (groupingKey != null) {
            var groupingKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(groupingKey);
            if (groupingKey0 != null) {
                var groupingKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupingKey0);
                if (groupingKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(groupingKey1);
                }
            }
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampSeconds);
        return protoOutputSize;
    }

}
