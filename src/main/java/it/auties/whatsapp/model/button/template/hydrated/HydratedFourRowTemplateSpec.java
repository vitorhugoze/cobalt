package it.auties.whatsapp.model.button.template.hydrated;

import it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HydratedFourRowTemplateSpec {
    public static byte[] encode(HydratedFourRowTemplate protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HydratedFourRowTemplate protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var titleText = protoInputObject.titleText();
        if (titleText != null) {
            var titleText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleText);
            if (titleText0 != null) {
                var titleText1 = titleText0.text();
                if (titleText1 != null) {
                    var titleText2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(titleText1);
                    if (titleText2 != null) {
                        protoOutputStream.writeString(2, titleText2);
                    }
                }
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
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body);
            if (body0 != null) {
                protoOutputStream.writeString(6, body0);
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                var footer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(footer0);
                if (footer1 != null) {
                    protoOutputStream.writeString(7, footer1);
                }
            }
        }
        if (protoInputObject.hydratedButtons() != null) {
            for (var hydratedButtonsEntry : protoInputObject.hydratedButtons()) { 
                if (hydratedButtonsEntry != null) {
                    protoOutputStream.writeMessage(8, it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButtonSpec.sizeOf(hydratedButtonsEntry));
                    it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButtonSpec.encode(hydratedButtonsEntry, protoOutputStream);
                }
            }
        }
        var templateId = protoInputObject.templateId();
        if (templateId != null) {
            var templateId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(templateId);
            if (templateId0 != null) {
                protoOutputStream.writeString(9, templateId0);
            }
        }
    }

    public static HydratedFourRowTemplate decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HydratedFourRowTemplate decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTextTitle> titleText = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.LocationMessage> titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.lang.String body = null;
        java.util.Optional<java.lang.String> footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.List<it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton> hydratedButtons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String templateId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> titleDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.DocumentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> titleText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTextTitle.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString())));
                case 3 -> titleImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> titleVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> titleLocation = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.LocationMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> body = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> footer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 8 -> hydratedButtons.add(it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButtonSpec.decode(protoInputStream.readLengthDelimited()));
                case 9 -> templateId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate(titleDocument, titleText, titleImage, titleVideo, titleLocation, body, footer, hydratedButtons, templateId);
    }

    public static int sizeOf(HydratedFourRowTemplate protoInputObject) {
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
        var titleText = protoInputObject.titleText();
        if (titleText != null) {
            var titleText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(titleText);
            if (titleText0 != null) {
                var titleText1 = titleText0.text();
                if (titleText1 != null) {
                    var titleText2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(titleText1);
                    if (titleText2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(titleText2);
                    }
                }
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
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body);
            if (body0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(body0);
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                var footer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(footer0);
                if (footer1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(footer1);
                }
            }
        }
        if (protoInputObject.hydratedButtons() != null) {
            for (var hydratedButtonsEntry : protoInputObject.hydratedButtons()) { 
                if (hydratedButtonsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    var hydratedButtonsEntrySerializedSize = it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButtonSpec.sizeOf(hydratedButtonsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(hydratedButtonsEntrySerializedSize);
                    protoOutputSize += hydratedButtonsEntrySerializedSize;
                }
            }
        }
        var templateId = protoInputObject.templateId();
        if (templateId != null) {
            var templateId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(templateId);
            if (templateId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(templateId0);
            }
        }
        return protoOutputSize;
    }

}
