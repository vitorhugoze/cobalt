package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.RemoveRecentStickerAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class RemoveRecentStickerActionSpec {
    public static byte[] encode(RemoveRecentStickerAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(RemoveRecentStickerAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var lastStickerSentTimestampSeconds = protoInputObject.lastStickerSentTimestampSeconds();
        protoOutputStream.writeInt64(1, lastStickerSentTimestampSeconds);
    }

    public static RemoveRecentStickerAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static RemoveRecentStickerAction decode(ProtobufInputStream protoInputStream) {
        long lastStickerSentTimestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> lastStickerSentTimestampSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.RemoveRecentStickerAction(lastStickerSentTimestampSeconds);
    }

    public static int sizeOf(RemoveRecentStickerAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var lastStickerSentTimestampSeconds = protoInputObject.lastStickerSentTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(lastStickerSentTimestampSeconds);
        return protoOutputSize;
    }

}
