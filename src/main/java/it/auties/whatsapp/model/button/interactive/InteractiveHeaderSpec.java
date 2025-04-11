package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveHeader;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveHeaderSpec {
    public static byte[] encode(InteractiveHeader protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveHeader protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputStream.writeString(1, title0);
            }
        }
        var subtitle = protoInputObject.subtitle();
        if (subtitle != null) {
            var subtitle0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(subtitle);
            if (subtitle0 != null) {
                var subtitle1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(subtitle0);
                if (subtitle1 != null) {
                    protoOutputStream.writeString(2, subtitle1);
                }
            }
        }
        var attachmentDocument = protoInputObject.attachmentDocument();
        if (attachmentDocument != null) {
            var attachmentDocument0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentDocument);
            if (attachmentDocument0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(attachmentDocument0));
                it.auties.whatsapp.model.message.standard.DocumentMessageSpec.encode(attachmentDocument0, protoOutputStream);
            }
        }
        var attachmentImage = protoInputObject.attachmentImage();
        if (attachmentImage != null) {
            var attachmentImage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentImage);
            if (attachmentImage0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(attachmentImage0));
                it.auties.whatsapp.model.message.standard.ImageMessageSpec.encode(attachmentImage0, protoOutputStream);
            }
        }
        var mediaAttachment = protoInputObject.mediaAttachment();
        protoOutputStream.writeBool(5, mediaAttachment);
        var attachmentThumbnail = protoInputObject.attachmentThumbnail();
        if (attachmentThumbnail != null) {
            var attachmentThumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentThumbnail);
            if (attachmentThumbnail0 != null) {
                var attachmentThumbnail1 = attachmentThumbnail0.thumbnail();
                if (attachmentThumbnail1 != null) {
                    var attachmentThumbnail2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(attachmentThumbnail1);
                    if (attachmentThumbnail2 != null) {
                        protoOutputStream.writeBytes(6, attachmentThumbnail2);
                    }
                }
            }
        }
        var attachmentVideo = protoInputObject.attachmentVideo();
        if (attachmentVideo != null) {
            var attachmentVideo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentVideo);
            if (attachmentVideo0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(attachmentVideo0));
                it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.encode(attachmentVideo0, protoOutputStream);
            }
        }
    }

    public static InteractiveHeader decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveHeader decode(ProtobufInputStream protoInputStream) {
        java.lang.String title = null;
        java.util.Optional<java.lang.String> subtitle = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> attachmentDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> attachmentImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        boolean mediaAttachment = false;
        java.util.Optional<it.auties.whatsapp.model.button.interactive.InteractiveHeaderThumbnail> attachmentThumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> attachmentVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> subtitle = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> attachmentDocument = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.DocumentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> attachmentImage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> mediaAttachment = protoInputStream.readBool();
                case 6 -> attachmentThumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.interactive.InteractiveHeaderThumbnail.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes())));
                case 7 -> attachmentVideo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractiveHeader(title, subtitle, attachmentDocument, attachmentImage, mediaAttachment, attachmentThumbnail, attachmentVideo);
    }

    public static int sizeOf(InteractiveHeader protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(title0);
            }
        }
        var subtitle = protoInputObject.subtitle();
        if (subtitle != null) {
            var subtitle0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(subtitle);
            if (subtitle0 != null) {
                var subtitle1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(subtitle0);
                if (subtitle1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(subtitle1);
                }
            }
        }
        var attachmentDocument = protoInputObject.attachmentDocument();
        if (attachmentDocument != null) {
            var attachmentDocument0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentDocument);
            if (attachmentDocument0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var attachmentDocumentSerializedSize = it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(attachmentDocument0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(attachmentDocumentSerializedSize);
                protoOutputSize += attachmentDocumentSerializedSize;
            }
        }
        var attachmentImage = protoInputObject.attachmentImage();
        if (attachmentImage != null) {
            var attachmentImage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentImage);
            if (attachmentImage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var attachmentImageSerializedSize = it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(attachmentImage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(attachmentImageSerializedSize);
                protoOutputSize += attachmentImageSerializedSize;
            }
        }
        var mediaAttachment = protoInputObject.mediaAttachment();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += 1;
        var attachmentThumbnail = protoInputObject.attachmentThumbnail();
        if (attachmentThumbnail != null) {
            var attachmentThumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentThumbnail);
            if (attachmentThumbnail0 != null) {
                var attachmentThumbnail1 = attachmentThumbnail0.thumbnail();
                if (attachmentThumbnail1 != null) {
                    var attachmentThumbnail2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(attachmentThumbnail1);
                    if (attachmentThumbnail2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                        protoOutputSize += ProtobufOutputStream.getBytesSize(attachmentThumbnail2);
                    }
                }
            }
        }
        var attachmentVideo = protoInputObject.attachmentVideo();
        if (attachmentVideo != null) {
            var attachmentVideo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(attachmentVideo);
            if (attachmentVideo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var attachmentVideoSerializedSize = it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(attachmentVideo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(attachmentVideoSerializedSize);
                protoOutputSize += attachmentVideoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
