package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.EncryptedReactionMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class EncryptedReactionMessageSpec {
    public static byte[] encode(EncryptedReactionMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(EncryptedReactionMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var targetMessageKey = protoInputObject.targetMessageKey();
        if (targetMessageKey != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(targetMessageKey));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(targetMessageKey, protoOutputStream);
        }
        var encPayload = protoInputObject.encPayload();
        if (encPayload != null) {
            var encPayload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encPayload);
            if (encPayload0 != null) {
                protoOutputStream.writeBytes(2, encPayload0);
            }
        }
        var encIv = protoInputObject.encIv();
        if (encIv != null) {
            var encIv0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encIv);
            if (encIv0 != null) {
                protoOutputStream.writeBytes(3, encIv0);
            }
        }
    }

    public static EncryptedReactionMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static EncryptedReactionMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey targetMessageKey = null;
        byte[] encPayload = null;
        byte[] encIv = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> targetMessageKey = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> encPayload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> encIv = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.EncryptedReactionMessage(targetMessageKey, encPayload, encIv);
    }

    public static int sizeOf(EncryptedReactionMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var targetMessageKey = protoInputObject.targetMessageKey();
        if (targetMessageKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var targetMessageKeySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(targetMessageKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(targetMessageKeySerializedSize);
            protoOutputSize += targetMessageKeySerializedSize;
        }
        var encPayload = protoInputObject.encPayload();
        if (encPayload != null) {
            var encPayload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encPayload);
            if (encPayload0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(encPayload0);
            }
        }
        var encIv = protoInputObject.encIv();
        if (encIv != null) {
            var encIv0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encIv);
            if (encIv0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(encIv0);
            }
        }
        return protoOutputSize;
    }

}
