package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.FutureMessageContainer;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class FutureMessageContainerSpec {
    public static byte[] encode(FutureMessageContainer protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(FutureMessageContainer protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var content = protoInputObject.content();
        if (content != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(content));
            it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(content, protoOutputStream);
        }
    }

    public static FutureMessageContainer decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static FutureMessageContainer decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.MessageContainer content = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> content = it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.model.FutureMessageContainer(content);
    }

    public static int sizeOf(FutureMessageContainer protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var content = protoInputObject.content();
        if (content != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var contentSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(content);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(contentSerializedSize);
            protoOutputSize += contentSerializedSize;
        }
        return protoOutputSize;
    }

}
