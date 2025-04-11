package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.TemplateMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class TemplateMessageSpec {
    public static byte[] encode(TemplateMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(TemplateMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(9, id0);
            }
        }
        var content = protoInputObject.content();
        if (content != null) {
            protoOutputStream.writeMessage(4, it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.sizeOf(content));
            it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.encode(content, protoOutputStream);
        }
        var highlyStructuredFourRowTemplateFormat = protoInputObject.highlyStructuredFourRowTemplateFormat();
        if (highlyStructuredFourRowTemplateFormat != null) {
            var highlyStructuredFourRowTemplateFormat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredFourRowTemplateFormat);
            if (highlyStructuredFourRowTemplateFormat0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplateSpec.sizeOf(highlyStructuredFourRowTemplateFormat0));
                it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplateSpec.encode(highlyStructuredFourRowTemplateFormat0, protoOutputStream);
            }
        }
        var hydratedFourRowTemplateFormat = protoInputObject.hydratedFourRowTemplateFormat();
        if (hydratedFourRowTemplateFormat != null) {
            var hydratedFourRowTemplateFormat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(hydratedFourRowTemplateFormat);
            if (hydratedFourRowTemplateFormat0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.sizeOf(hydratedFourRowTemplateFormat0));
                it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.encode(hydratedFourRowTemplateFormat0, protoOutputStream);
            }
        }
        var interactiveMessageFormat = protoInputObject.interactiveMessageFormat();
        if (interactiveMessageFormat != null) {
            var interactiveMessageFormat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(interactiveMessageFormat);
            if (interactiveMessageFormat0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.message.button.InteractiveMessageSpec.sizeOf(interactiveMessageFormat0));
                it.auties.whatsapp.model.message.button.InteractiveMessageSpec.encode(interactiveMessageFormat0, protoOutputStream);
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
    }

    public static TemplateMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static TemplateMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate content = null;
        it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate highlyStructuredFourRowTemplateFormat = null;
        it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate hydratedFourRowTemplateFormat = null;
        it.auties.whatsapp.model.message.button.InteractiveMessage interactiveMessageFormat = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 9 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> content = it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.decode(protoInputStream.readLengthDelimited());
                case 1 -> highlyStructuredFourRowTemplateFormat = it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplateSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> hydratedFourRowTemplateFormat = it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> interactiveMessageFormat = it.auties.whatsapp.model.message.button.InteractiveMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.TemplateMessage(id, content, highlyStructuredFourRowTemplateFormat, hydratedFourRowTemplateFormat, interactiveMessageFormat, contextInfo);
    }

    public static int sizeOf(TemplateMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var content = protoInputObject.content();
        if (content != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            var contentSerializedSize = it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.sizeOf(content);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(contentSerializedSize);
            protoOutputSize += contentSerializedSize;
        }
        var highlyStructuredFourRowTemplateFormat = protoInputObject.highlyStructuredFourRowTemplateFormat();
        if (highlyStructuredFourRowTemplateFormat != null) {
            var highlyStructuredFourRowTemplateFormat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredFourRowTemplateFormat);
            if (highlyStructuredFourRowTemplateFormat0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var highlyStructuredFourRowTemplateFormatSerializedSize = it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplateSpec.sizeOf(highlyStructuredFourRowTemplateFormat0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(highlyStructuredFourRowTemplateFormatSerializedSize);
                protoOutputSize += highlyStructuredFourRowTemplateFormatSerializedSize;
            }
        }
        var hydratedFourRowTemplateFormat = protoInputObject.hydratedFourRowTemplateFormat();
        if (hydratedFourRowTemplateFormat != null) {
            var hydratedFourRowTemplateFormat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(hydratedFourRowTemplateFormat);
            if (hydratedFourRowTemplateFormat0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var hydratedFourRowTemplateFormatSerializedSize = it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateSpec.sizeOf(hydratedFourRowTemplateFormat0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(hydratedFourRowTemplateFormatSerializedSize);
                protoOutputSize += hydratedFourRowTemplateFormatSerializedSize;
            }
        }
        var interactiveMessageFormat = protoInputObject.interactiveMessageFormat();
        if (interactiveMessageFormat != null) {
            var interactiveMessageFormat0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(interactiveMessageFormat);
            if (interactiveMessageFormat0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var interactiveMessageFormatSerializedSize = it.auties.whatsapp.model.message.button.InteractiveMessageSpec.sizeOf(interactiveMessageFormat0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(interactiveMessageFormatSerializedSize);
                protoOutputSize += interactiveMessageFormatSerializedSize;
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
        return protoOutputSize;
    }

}
