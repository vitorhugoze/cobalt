package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.ButtonsResponseMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonsResponseMessageSpec {
    public static byte[] encode(ButtonsResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonsResponseMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var buttonId = protoInputObject.buttonId();
        if (buttonId != null) {
            var buttonId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonId);
            if (buttonId0 != null) {
                protoOutputStream.writeString(1, buttonId0);
            }
        }
        var buttonText = protoInputObject.buttonText();
        if (buttonText != null) {
            var buttonText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(buttonText);
            if (buttonText0 != null) {
                var buttonText1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonText0);
                if (buttonText1 != null) {
                    protoOutputStream.writeString(2, buttonText1);
                }
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
        var responseType = protoInputObject.responseType();
        if (responseType != null) {
            var responseType0 = it.auties.whatsapp.model.message.button.ButtonsResponseMessageResponseTypeSpec.encode(responseType);
            protoOutputStream.writeInt32(4, responseType0);
        }
    }

    public static ButtonsResponseMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonsResponseMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String buttonId = null;
        java.lang.String buttonText = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        it.auties.whatsapp.model.message.button.ButtonsResponseMessage.ResponseType responseType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> buttonId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> buttonText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> responseType = it.auties.whatsapp.model.message.button.ButtonsResponseMessageResponseTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.ButtonsResponseMessage(buttonId, buttonText, contextInfo, responseType);
    }

    public static int sizeOf(ButtonsResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var buttonId = protoInputObject.buttonId();
        if (buttonId != null) {
            var buttonId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonId);
            if (buttonId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(buttonId0);
            }
        }
        var buttonText = protoInputObject.buttonText();
        if (buttonText != null) {
            var buttonText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(buttonText);
            if (buttonText0 != null) {
                var buttonText1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonText0);
                if (buttonText1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(buttonText1);
                }
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
        var responseType = protoInputObject.responseType();
        if (responseType != null) {
            var responseType0 = it.auties.whatsapp.model.message.button.ButtonsResponseMessageResponseTypeSpec.encode(responseType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(responseType0);
        }
        return protoOutputSize;
    }

}
