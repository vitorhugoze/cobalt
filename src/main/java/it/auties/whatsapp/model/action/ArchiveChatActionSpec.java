package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.ArchiveChatAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ArchiveChatActionSpec {
    public static byte[] encode(ArchiveChatAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ArchiveChatAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var archived = protoInputObject.archived();
        protoOutputStream.writeBool(1, archived);
        var messageRange = protoInputObject.messageRange();
        if (messageRange != null) {
            var messageRange0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageRange);
            if (messageRange0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.sizeOf(messageRange0));
                it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.encode(messageRange0, protoOutputStream);
            }
        }
    }

    public static ArchiveChatAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ArchiveChatAction decode(ProtobufInputStream protoInputStream) {
        boolean archived = false;
        java.util.Optional<it.auties.whatsapp.model.sync.ActionMessageRangeSync> messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> archived = protoInputStream.readBool();
                case 2 -> messageRange = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.ActionMessageRangeSyncSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.ArchiveChatAction(archived, messageRange);
    }

    public static int sizeOf(ArchiveChatAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var archived = protoInputObject.archived();
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
