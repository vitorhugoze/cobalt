package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.ButtonsMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonsMessageSpec {
    public static byte[] encode(ButtonsMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonsMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var headerText = protoInputObject.headerText();
        if (headerText != null) {
            var headerText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerText);
            if (headerText0 != null) {
                var headerText1 = headerText0.text();
                if (headerText1 != null) {
                    var headerText2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(headerText1);
                    if (headerText2 != null) {
                        protoOutputStream.writeString(1, headerText2);
                    }
                }
            }
        }
        var headerDocument = protoInputObject.headerDocument();
        if (headerDocument != null) {
            var headerDocument0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerDocument);
            if (headerDocument0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(headerDocument0));
                it.auties.whatsapp.model.message.standard.DocumentMessageSpec.encode(headerDocument0, protoOutputStream);
            }
        }
        var headerImage = protoInputObject.headerImage();
        if (headerImage != null) {
            var headerImage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerImage);
            if (headerImage0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(headerImage0));
                it.auties.whatsapp.model.message.standard.ImageMessageSpec.encode(headerImage0, protoOutputStream);
            }
        }
        var headerVideo = protoInputObject.headerVideo();
        if (headerVideo != null) {
            var headerVideo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerVideo);
            if (headerVideo0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(headerVideo0));
                it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.encode(headerVideo0, protoOutputStream);
            }
        }
        var headerLocation = protoInputObject.headerLocation();
        if (headerLocation != null) {
            var headerLocation0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerLocation);
            if (headerLocation0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.message.standard.LocationMessageSpec.sizeOf(headerLocation0));
                it.auties.whatsapp.model.message.standard.LocationMessageSpec.encode(headerLocation0, protoOutputStream);
            }
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputStream.writeString(6, body1);
                }
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
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(8, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        if (protoInputObject.buttons() != null) {
            for (var buttonsEntry : protoInputObject.buttons()) { 
                if (buttonsEntry != null) {
                    protoOutputStream.writeMessage(9, it.auties.whatsapp.model.button.base.ButtonSpec.sizeOf(buttonsEntry));
                    it.auties.whatsapp.model.button.base.ButtonSpec.encode(buttonsEntry, protoOutputStream);
                }
            }
        }
        var headerType = protoInputObject.headerType();
        if (headerType != null) {
            var headerType0 = it.auties.whatsapp.model.message.button.ButtonsMessageHeaderTypeSpec.encode(headerType);
            protoOutputStream.writeInt32(10, headerType0);
        }
    }

    public static ButtonsMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonsMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.button.ButtonsMessageHeaderText headerText = null;
        it.auties.whatsapp.model.message.standard.DocumentMessage headerDocument = null;
        it.auties.whatsapp.model.message.standard.ImageMessage headerImage = null;
        it.auties.whatsapp.model.message.standard.VideoOrGifMessage headerVideo = null;
        it.auties.whatsapp.model.message.standard.LocationMessage headerLocation = null;
        java.lang.String body = null;
        java.lang.String footer = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        java.util.List<it.auties.whatsapp.model.button.base.Button> buttons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.message.button.ButtonsMessageHeader.Type headerType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> headerText = it.auties.whatsapp.model.message.button.ButtonsMessageHeaderText.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> headerDocument = it.auties.whatsapp.model.message.standard.DocumentMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> headerImage = it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> headerVideo = it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> headerLocation = it.auties.whatsapp.model.message.standard.LocationMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 6 -> body = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> footer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 9 -> buttons.add(it.auties.whatsapp.model.button.base.ButtonSpec.decode(protoInputStream.readLengthDelimited()));
                case 10 -> headerType = it.auties.whatsapp.model.message.button.ButtonsMessageHeaderTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.ButtonsMessage(headerText, headerDocument, headerImage, headerVideo, headerLocation, body, footer, contextInfo, buttons, headerType);
    }

    public static int sizeOf(ButtonsMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var headerText = protoInputObject.headerText();
        if (headerText != null) {
            var headerText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerText);
            if (headerText0 != null) {
                var headerText1 = headerText0.text();
                if (headerText1 != null) {
                    var headerText2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(headerText1);
                    if (headerText2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(headerText2);
                    }
                }
            }
        }
        var headerDocument = protoInputObject.headerDocument();
        if (headerDocument != null) {
            var headerDocument0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerDocument);
            if (headerDocument0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var headerDocumentSerializedSize = it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(headerDocument0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(headerDocumentSerializedSize);
                protoOutputSize += headerDocumentSerializedSize;
            }
        }
        var headerImage = protoInputObject.headerImage();
        if (headerImage != null) {
            var headerImage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerImage);
            if (headerImage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var headerImageSerializedSize = it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(headerImage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(headerImageSerializedSize);
                protoOutputSize += headerImageSerializedSize;
            }
        }
        var headerVideo = protoInputObject.headerVideo();
        if (headerVideo != null) {
            var headerVideo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerVideo);
            if (headerVideo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var headerVideoSerializedSize = it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(headerVideo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(headerVideoSerializedSize);
                protoOutputSize += headerVideoSerializedSize;
            }
        }
        var headerLocation = protoInputObject.headerLocation();
        if (headerLocation != null) {
            var headerLocation0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(headerLocation);
            if (headerLocation0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var headerLocationSerializedSize = it.auties.whatsapp.model.message.standard.LocationMessageSpec.sizeOf(headerLocation0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(headerLocationSerializedSize);
                protoOutputSize += headerLocationSerializedSize;
            }
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(body1);
                }
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
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        if (protoInputObject.buttons() != null) {
            for (var buttonsEntry : protoInputObject.buttons()) { 
                if (buttonsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                    var buttonsEntrySerializedSize = it.auties.whatsapp.model.button.base.ButtonSpec.sizeOf(buttonsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(buttonsEntrySerializedSize);
                    protoOutputSize += buttonsEntrySerializedSize;
                }
            }
        }
        var headerType = protoInputObject.headerType();
        if (headerType != null) {
            var headerType0 = it.auties.whatsapp.model.message.button.ButtonsMessageHeaderTypeSpec.encode(headerType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(headerType0);
        }
        return protoOutputSize;
    }

}
