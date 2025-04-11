package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.DeleteMessageForMeAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeleteMessageForMeActionSpec {
    public static byte[] encode(DeleteMessageForMeAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeleteMessageForMeAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var deleteMedia = protoInputObject.deleteMedia();
        protoOutputStream.writeBool(1, deleteMedia);
        var messageTimestampSeconds = protoInputObject.messageTimestampSeconds();
        protoOutputStream.writeInt64(2, messageTimestampSeconds);
    }

    public static DeleteMessageForMeAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeleteMessageForMeAction decode(ProtobufInputStream protoInputStream) {
        boolean deleteMedia = false;
        long messageTimestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> deleteMedia = protoInputStream.readBool();
                case 2 -> messageTimestampSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.DeleteMessageForMeAction(deleteMedia, messageTimestampSeconds);
    }

    public static int sizeOf(DeleteMessageForMeAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var deleteMedia = protoInputObject.deleteMedia();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var messageTimestampSeconds = protoInputObject.messageTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(messageTimestampSeconds);
        return protoOutputSize;
    }

}
