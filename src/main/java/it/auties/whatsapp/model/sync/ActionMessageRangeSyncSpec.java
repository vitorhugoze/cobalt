package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ActionMessageRangeSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ActionMessageRangeSyncSpec {
    public static byte[] encode(ActionMessageRangeSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ActionMessageRangeSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var lastMessageTimestamp = protoInputObject.lastMessageTimestamp();
        protoOutputStream.writeInt64(1, lastMessageTimestamp);
        var lastSystemMessageTimestamp = protoInputObject.lastSystemMessageTimestamp();
        protoOutputStream.writeInt64(2, lastSystemMessageTimestamp);
        if (protoInputObject.messages() != null) {
            for (var messagesEntry : protoInputObject.messages()) { 
                if (messagesEntry != null) {
                    protoOutputStream.writeMessage(3, it.auties.whatsapp.model.sync.SyncActionMessageSpec.sizeOf(messagesEntry));
                    it.auties.whatsapp.model.sync.SyncActionMessageSpec.encode(messagesEntry, protoOutputStream);
                }
            }
        }
    }

    public static ActionMessageRangeSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ActionMessageRangeSync decode(ProtobufInputStream protoInputStream) {
        java.lang.Long lastMessageTimestamp = null;
        java.lang.Long lastSystemMessageTimestamp = null;
        java.util.List<it.auties.whatsapp.model.sync.SyncActionMessage> messages = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> lastMessageTimestamp = protoInputStream.readInt64();
                case 2 -> lastSystemMessageTimestamp = protoInputStream.readInt64();
                case 3 -> messages.add(it.auties.whatsapp.model.sync.SyncActionMessageSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ActionMessageRangeSync(lastMessageTimestamp, lastSystemMessageTimestamp, messages);
    }

    public static int sizeOf(ActionMessageRangeSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var lastMessageTimestamp = protoInputObject.lastMessageTimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(lastMessageTimestamp);
        var lastSystemMessageTimestamp = protoInputObject.lastSystemMessageTimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(lastSystemMessageTimestamp);
        if (protoInputObject.messages() != null) {
            for (var messagesEntry : protoInputObject.messages()) { 
                if (messagesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    var messagesEntrySerializedSize = it.auties.whatsapp.model.sync.SyncActionMessageSpec.sizeOf(messagesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(messagesEntrySerializedSize);
                    protoOutputSize += messagesEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
