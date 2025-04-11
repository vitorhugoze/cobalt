package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.ClearChatAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ClearChatActionSpec {
    public static byte[] encode(ClearChatAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ClearChatAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var messageRange = protoInputObject.messageRange();
        if (messageRange != null) {
            var messageRange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageRange);
            if (messageRange0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.sizeOf(messageRange0));
                it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.encode(messageRange0, protoOutputStream);
            }
        }
    }

    public static ClearChatAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ClearChatAction decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.ClearChatAction(messageRange);
    }

    public static int sizeOf(ClearChatAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var messageRange = protoInputObject.messageRange();
        if (messageRange != null) {
            var messageRange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageRange);
            if (messageRange0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var messageRangeSerializedSize = it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.sizeOf(messageRange0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(messageRangeSerializedSize);
                protoOutputSize += messageRangeSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
