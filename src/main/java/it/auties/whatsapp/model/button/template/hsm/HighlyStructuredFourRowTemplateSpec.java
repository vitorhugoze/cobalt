package it.auties.whatsapp.model.button.template.hsm;

import it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredFourRowTemplateSpec {
    public static byte[] encode(HighlyStructuredFourRowTemplate protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredFourRowTemplate protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var titleDocument = protoInputObject.titleDocument();
        if (titleDocument != null) {
            var titleDocument0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleDocument);
            if (titleDocument0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(titleDocument0));
                it.auties.whatsapp.model.message.standard.DocumentMessageSpec.encode(titleDocument0, protoOutputStream);
            }
        }
        var titleHighlyStructured = protoInputObject.titleHighlyStructured();
        if (titleHighlyStructured != null) {
            var titleHighlyStructured0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleHighlyStructured);
            if (titleHighlyStructured0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(titleHighlyStructured0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(titleHighlyStructured0, protoOutputStream);
            }
        }
        var titleImage = protoInputObject.titleImage();
        if (titleImage != null) {
            var titleImage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleImage);
            if (titleImage0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(titleImage0));
                it.auties.whatsapp.model.message.standard.ImageMessageSpec.encode(titleImage0, protoOutputStream);
            }
        }
        var titleVideo = protoInputObject.titleVideo();
        if (titleVideo != null) {
            var titleVideo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleVideo);
            if (titleVideo0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(titleVideo0));
                it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.encode(titleVideo0, protoOutputStream);
            }
        }
        var titleLocation = protoInputObject.titleLocation();
        if (titleLocation != null) {
            var titleLocation0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleLocation);
            if (titleLocation0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.message.standard.LocationMessageSpec.sizeOf(titleLocation0));
                it.auties.whatsapp.model.message.standard.LocationMessageSpec.encode(titleLocation0, protoOutputStream);
            }
        }
        var content = protoInputObject.content();
        if (content != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(content));
            it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(content, protoOutputStream);
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(footer0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(footer0, protoOutputStream);
            }
        }
        if (protoInputObject.buttons() != null) {
            for (var buttonsEntry : protoInputObject.buttons()) { 
                if (buttonsEntry != null) {
                    protoOutputStream.writeMessage(8, it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplateSpec.sizeOf(buttonsEntry));
                    it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplateSpec.encode(buttonsEntry, protoOutputStream);
                }
            }
        }
    }

    public static HighlyStructuredFourRowTemplate decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredFourRowTemplate decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage> titleHighlyStructured = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.LocationMessage> titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage content = null;
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage> footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.List<it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplate> buttons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.DocumentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> titleHighlyStructured = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.LocationMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> content = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 8 -> buttons.add(it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplateSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredFourRowTemplate(titleDocument, titleHighlyStructured, titleImage, titleVideo, titleLocation, content, footer, buttons);
    }

    public static int sizeOf(HighlyStructuredFourRowTemplate protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var titleDocument = protoInputObject.titleDocument();
        if (titleDocument != null) {
            var titleDocument0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleDocument);
            if (titleDocument0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var titleDocumentSerializedSize = it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(titleDocument0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(titleDocumentSerializedSize);
                protoOutputSize += titleDocumentSerializedSize;
            }
        }
        var titleHighlyStructured = protoInputObject.titleHighlyStructured();
        if (titleHighlyStructured != null) {
            var titleHighlyStructured0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleHighlyStructured);
            if (titleHighlyStructured0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var titleHighlyStructuredSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(titleHighlyStructured0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(titleHighlyStructuredSerializedSize);
                protoOutputSize += titleHighlyStructuredSerializedSize;
            }
        }
        var titleImage = protoInputObject.titleImage();
        if (titleImage != null) {
            var titleImage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleImage);
            if (titleImage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var titleImageSerializedSize = it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(titleImage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(titleImageSerializedSize);
                protoOutputSize += titleImageSerializedSize;
            }
        }
        var titleVideo = protoInputObject.titleVideo();
        if (titleVideo != null) {
            var titleVideo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleVideo);
            if (titleVideo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var titleVideoSerializedSize = it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(titleVideo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(titleVideoSerializedSize);
                protoOutputSize += titleVideoSerializedSize;
            }
        }
        var titleLocation = protoInputObject.titleLocation();
        if (titleLocation != null) {
            var titleLocation0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleLocation);
            if (titleLocation0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var titleLocationSerializedSize = it.auties.whatsapp.model.message.standard.LocationMessageSpec.sizeOf(titleLocation0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(titleLocationSerializedSize);
                protoOutputSize += titleLocationSerializedSize;
            }
        }
        var content = protoInputObject.content();
        if (content != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var contentSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(content);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(contentSerializedSize);
            protoOutputSize += contentSerializedSize;
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var footerSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(footer0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(footerSerializedSize);
                protoOutputSize += footerSerializedSize;
            }
        }
        if (protoInputObject.buttons() != null) {
            for (var buttonsEntry : protoInputObject.buttons()) { 
                if (buttonsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    var buttonsEntrySerializedSize = it.auties.whatsapp.model.button.template.hsm.HighlyStructuredButtonTemplateSpec.sizeOf(buttonsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(buttonsEntrySerializedSize);
                    protoOutputSize += buttonsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
