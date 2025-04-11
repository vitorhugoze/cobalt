package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.ChatDisappear;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatDisappearSpec {
    public static byte[] encode(ChatDisappear protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ChatDisappear protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var initiator = protoInputObject.initiator();
        if (initiator != null) {
            var initiator0 = it.auties.whatsapp.model.chat.ChatDisappearInitiatorSpec.encode(initiator);
            protoOutputStream.writeInt32(1, initiator0);
        }
    }

    public static ChatDisappear decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ChatDisappear decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.chat.ChatDisappear.Initiator initiator = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> initiator = it.auties.whatsapp.model.chat.ChatDisappearInitiatorSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.chat.ChatDisappear(initiator);
    }

    public static int sizeOf(ChatDisappear protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var initiator = protoInputObject.initiator();
        if (initiator != null) {
            var initiator0 = it.auties.whatsapp.model.chat.ChatDisappearInitiatorSpec.encode(initiator);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(initiator0);
        }
        return protoOutputSize;
    }

}
