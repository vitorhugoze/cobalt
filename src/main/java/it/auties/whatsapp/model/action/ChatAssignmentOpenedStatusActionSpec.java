package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatAssignmentOpenedStatusActionSpec {
    public static byte[] encode(ChatAssignmentOpenedStatusAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ChatAssignmentOpenedStatusAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var chatOpened = protoInputObject.chatOpened();
        protoOutputStream.writeBool(1, chatOpened);
    }

    public static ChatAssignmentOpenedStatusAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ChatAssignmentOpenedStatusAction decode(ProtobufInputStream protoInputStream) {
        boolean chatOpened = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> chatOpened = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction(chatOpened);
    }

    public static int sizeOf(ChatAssignmentOpenedStatusAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var chatOpened = protoInputObject.chatOpened();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
