package it.auties.whatsapp.model.button.template.hsm;

import it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredButtonTemplateSpec {
    public static byte[] encode(HighlyStructuredButtonTemplate protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredButtonTemplate protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var highlyStructuredQuickReplyButton = protoInputObject.highlyStructuredQuickReplyButton();
        if (highlyStructuredQuickReplyButton != null) {
            var highlyStructuredQuickReplyButton0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredQuickReplyButton);
            if (highlyStructuredQuickReplyButton0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButtonSpec.sizeOf(highlyStructuredQuickReplyButton0));
                it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButtonSpec.encode(highlyStructuredQuickReplyButton0, protoOutputStream);
            }
        }
        var highlyStructuredUrlButton = protoInputObject.highlyStructuredUrlButton();
        if (highlyStructuredUrlButton != null) {
            var highlyStructuredUrlButton0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredUrlButton);
            if (highlyStructuredUrlButton0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButtonSpec.sizeOf(highlyStructuredUrlButton0));
                it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButtonSpec.encode(highlyStructuredUrlButton0, protoOutputStream);
            }
        }
        var highlyStructuredCallButton = protoInputObject.highlyStructuredCallButton();
        if (highlyStructuredCallButton != null) {
            var highlyStructuredCallButton0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredCallButton);
            if (highlyStructuredCallButton0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButtonSpec.sizeOf(highlyStructuredCallButton0));
                it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButtonSpec.encode(highlyStructuredCallButton0, protoOutputStream);
            }
        }
        var index = protoInputObject.index();
        protoOutputStream.writeUInt32(4, index);
    }

    public static HighlyStructuredButtonTemplate decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredButtonTemplate decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton> highlyStructuredQuickReplyButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton> highlyStructuredUrlButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButton> highlyStructuredCallButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        int index = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> highlyStructuredQuickReplyButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButtonSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> highlyStructuredUrlButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButtonSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> highlyStructuredCallButton = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButtonSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> index = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate(highlyStructuredQuickReplyButton, highlyStructuredUrlButton, highlyStructuredCallButton, index);
    }

    public static int sizeOf(HighlyStructuredButtonTemplate protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var highlyStructuredQuickReplyButton = protoInputObject.highlyStructuredQuickReplyButton();
        if (highlyStructuredQuickReplyButton != null) {
            var highlyStructuredQuickReplyButton0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredQuickReplyButton);
            if (highlyStructuredQuickReplyButton0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var highlyStructuredQuickReplyButtonSerializedSize = it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButtonSpec.sizeOf(highlyStructuredQuickReplyButton0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(highlyStructuredQuickReplyButtonSerializedSize);
                protoOutputSize += highlyStructuredQuickReplyButtonSerializedSize;
            }
        }
        var highlyStructuredUrlButton = protoInputObject.highlyStructuredUrlButton();
        if (highlyStructuredUrlButton != null) {
            var highlyStructuredUrlButton0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredUrlButton);
            if (highlyStructuredUrlButton0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var highlyStructuredUrlButtonSerializedSize = it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButtonSpec.sizeOf(highlyStructuredUrlButton0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(highlyStructuredUrlButtonSerializedSize);
                protoOutputSize += highlyStructuredUrlButtonSerializedSize;
            }
        }
        var highlyStructuredCallButton = protoInputObject.highlyStructuredCallButton();
        if (highlyStructuredCallButton != null) {
            var highlyStructuredCallButton0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredCallButton);
            if (highlyStructuredCallButton0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var highlyStructuredCallButtonSerializedSize = it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButtonSpec.sizeOf(highlyStructuredCallButton0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(highlyStructuredCallButtonSerializedSize);
                protoOutputSize += highlyStructuredCallButtonSerializedSize;
            }
        }
        var index = protoInputObject.index();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(index);
        return protoOutputSize;
    }

}
