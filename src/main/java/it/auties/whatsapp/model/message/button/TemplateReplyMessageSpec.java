package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.TemplateReplyMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class TemplateReplyMessageSpec {
    public static byte[] encode(TemplateReplyMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(TemplateReplyMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var buttonText = protoInputObject.buttonText();
        if (buttonText != null) {
            var buttonText0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonText);
            if (buttonText0 != null) {
                protoOutputStream.writeString(2, buttonText0);
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        var index = protoInputObject.index();
        protoOutputStream.writeUInt32(4, index);
    }

    public static TemplateReplyMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static TemplateReplyMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        java.lang.String buttonText = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        int index = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> buttonText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> index = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.TemplateReplyMessage(id, buttonText, contextInfo, index);
    }

    public static int sizeOf(TemplateReplyMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var buttonText = protoInputObject.buttonText();
        if (buttonText != null) {
            var buttonText0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonText);
            if (buttonText0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(buttonText0);
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        var index = protoInputObject.index();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(index);
        return protoOutputSize;
    }

}
