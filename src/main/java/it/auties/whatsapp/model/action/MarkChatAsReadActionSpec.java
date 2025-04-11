package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.MarkChatAsReadAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MarkChatAsReadActionSpec {
    public static byte[] encode(MarkChatAsReadAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MarkChatAsReadAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var read = protoInputObject.read();
        protoOutputStream.writeBool(1, read);
        var messageRange = protoInputObject.messageRange();
        if (messageRange != null) {
            var messageRange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageRange);
            if (messageRange0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.sizeOf(messageRange0));
                it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.encode(messageRange0, protoOutputStream);
            }
        }
    }

    public static MarkChatAsReadAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MarkChatAsReadAction decode(ProtobufInputStream protoInputStream) {
        boolean read = false;
        java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> read = protoInputStream.readBool();
                case 2 -> messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.MarkChatAsReadAction(read, messageRange);
    }

    public static int sizeOf(MarkChatAsReadAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var read = protoInputObject.read();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var messageRange = protoInputObject.messageRange();
        if (messageRange != null) {
            var messageRange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageRange);
            if (messageRange0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var messageRangeSerializedSize = it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.sizeOf(messageRange0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(messageRangeSerializedSize);
                protoOutputSize += messageRangeSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
