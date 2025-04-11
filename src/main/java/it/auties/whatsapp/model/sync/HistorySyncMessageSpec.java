package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.HistorySyncMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HistorySyncMessageSpec {
    public static byte[] encode(HistorySyncMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HistorySyncMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var messageInfo = protoInputObject.messageInfo();
        if (messageInfo != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(messageInfo));
            it.auties.whatsapp.model.info.ChatMessageInfoSpec.encode(messageInfo, protoOutputStream);
        }
        var messageOrderId = protoInputObject.messageOrderId();
        protoOutputStream.writeUInt64(2, messageOrderId);
    }

    public static HistorySyncMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HistorySyncMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.info.ChatMessageInfo messageInfo = null;
        long messageOrderId = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> messageInfo = it.auties.whatsapp.model.info.ChatMessageInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> messageOrderId = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.HistorySyncMessage(messageInfo, messageOrderId);
    }

    public static int sizeOf(HistorySyncMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var messageInfo = protoInputObject.messageInfo();
        if (messageInfo != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var messageInfoSerializedSize = it.auties.whatsapp.model.info.ChatMessageInfoSpec.sizeOf(messageInfo);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageInfoSerializedSize);
            protoOutputSize += messageInfoSerializedSize;
        }
        var messageOrderId = protoInputObject.messageOrderId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(messageOrderId);
        return protoOutputSize;
    }

}
