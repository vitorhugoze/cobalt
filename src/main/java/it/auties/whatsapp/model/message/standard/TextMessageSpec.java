package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.TextMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class TextMessageSpec {
    public static byte[] encode(TextMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(TextMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputStream.writeString(1, text0);
            }
        }
        var matchedText = protoInputObject.matchedText();
        if (matchedText != null) {
            var matchedText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(matchedText);
            if (matchedText0 != null) {
                var matchedText1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(matchedText0);
                if (matchedText1 != null) {
                    protoOutputStream.writeString(2, matchedText1);
                }
            }
        }
        var canonicalUrl = protoInputObject.canonicalUrl();
        if (canonicalUrl != null) {
            var canonicalUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(canonicalUrl);
            if (canonicalUrl0 != null) {
                var canonicalUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(canonicalUrl0);
                if (canonicalUrl1 != null) {
                    protoOutputStream.writeString(4, canonicalUrl1);
                }
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputStream.writeString(5, description1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputStream.writeString(6, title1);
                }
            }
        }
        var textArgb = protoInputObject.textArgb();
        if (textArgb != null) {
            protoOutputStream.writeFixed32(7, textArgb);
        }
        var backgroundArgb = protoInputObject.backgroundArgb();
        if (backgroundArgb != null) {
            var backgroundArgb0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(backgroundArgb);
            if (backgroundArgb0 != null) {
                protoOutputStream.writeFixed32(8, backgroundArgb0);
            }
        }
        var font = protoInputObject.font();
        if (font != null) {
            var font0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(font);
            if (font0 != null) {
                var font1 = it.auties.whatsapp.model.message.standard.TextMessageFontTypeSpec.encode(font0);
                protoOutputStream.writeInt32(9, font1);
            }
        }
        var previewType = protoInputObject.previewType();
        if (previewType != null) {
            var previewType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(previewType);
            if (previewType0 != null) {
                var previewType1 = it.auties.whatsapp.model.message.standard.TextMessagePreviewTypeSpec.encode(previewType0);
                protoOutputStream.writeInt32(10, previewType1);
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputStream.writeBytes(16, thumbnail1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(17, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        var doNotPlayInline = protoInputObject.doNotPlayInline();
        protoOutputStream.writeBool(18, doNotPlayInline);
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath();
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                var thumbnailDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath0);
                if (thumbnailDirectPath1 != null) {
                    protoOutputStream.writeString(19, thumbnailDirectPath1);
                }
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256();
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                var thumbnailSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha2560);
                if (thumbnailSha2561 != null) {
                    protoOutputStream.writeBytes(20, thumbnailSha2561);
                }
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256();
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                var thumbnailEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha2560);
                if (thumbnailEncSha2561 != null) {
                    protoOutputStream.writeBytes(21, thumbnailEncSha2561);
                }
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputStream.writeBytes(22, mediaKey1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(23, mediaKeyTimestampSeconds0);
            }
        }
        var thumbnailHeight = protoInputObject.thumbnailHeight();
        if (thumbnailHeight != null) {
            var thumbnailHeight0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(thumbnailHeight);
            if (thumbnailHeight0 != null) {
                protoOutputStream.writeUInt32(24, thumbnailHeight0);
            }
        }
        var thumbnailWidth = protoInputObject.thumbnailWidth();
        if (thumbnailWidth != null) {
            var thumbnailWidth0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(thumbnailWidth);
            if (thumbnailWidth0 != null) {
                protoOutputStream.writeUInt32(25, thumbnailWidth0);
            }
        }
        var inviteLinkGroupType = protoInputObject.inviteLinkGroupType();
        if (inviteLinkGroupType != null) {
            var inviteLinkGroupType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkGroupType);
            if (inviteLinkGroupType0 != null) {
                var inviteLinkGroupType1 = it.auties.whatsapp.model.message.standard.TextMessageInviteLinkGroupTypeSpec.encode(inviteLinkGroupType0);
                protoOutputStream.writeInt32(26, inviteLinkGroupType1);
            }
        }
        var inviteLinkParentGroupSubjectV2 = protoInputObject.inviteLinkParentGroupSubjectV2();
        if (inviteLinkParentGroupSubjectV2 != null) {
            var inviteLinkParentGroupSubjectV20 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkParentGroupSubjectV2);
            if (inviteLinkParentGroupSubjectV20 != null) {
                var inviteLinkParentGroupSubjectV21 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(inviteLinkParentGroupSubjectV20);
                if (inviteLinkParentGroupSubjectV21 != null) {
                    protoOutputStream.writeString(27, inviteLinkParentGroupSubjectV21);
                }
            }
        }
        var inviteLinkParentGroupThumbnailV2 = protoInputObject.inviteLinkParentGroupThumbnailV2();
        if (inviteLinkParentGroupThumbnailV2 != null) {
            var inviteLinkParentGroupThumbnailV20 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkParentGroupThumbnailV2);
            if (inviteLinkParentGroupThumbnailV20 != null) {
                var inviteLinkParentGroupThumbnailV21 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(inviteLinkParentGroupThumbnailV20);
                if (inviteLinkParentGroupThumbnailV21 != null) {
                    protoOutputStream.writeBytes(28, inviteLinkParentGroupThumbnailV21);
                }
            }
        }
        var inviteLinkGroupTypeV2 = protoInputObject.inviteLinkGroupTypeV2();
        if (inviteLinkGroupTypeV2 != null) {
            var inviteLinkGroupTypeV20 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkGroupTypeV2);
            if (inviteLinkGroupTypeV20 != null) {
                var inviteLinkGroupTypeV21 = it.auties.whatsapp.model.message.standard.TextMessageInviteLinkGroupTypeSpec.encode(inviteLinkGroupTypeV20);
                protoOutputStream.writeInt32(29, inviteLinkGroupTypeV21);
            }
        }
        var viewOnce = protoInputObject.viewOnce();
        protoOutputStream.writeBool(30, viewOnce);
    }

    public static TextMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static TextMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String text = null;
        java.lang.String matchedText = null;
        java.lang.String canonicalUrl = null;
        java.lang.String description = null;
        java.lang.String title = null;
        java.lang.Integer textArgb = null;
        java.lang.Integer backgroundArgb = null;
        it.auties.whatsapp.model.message.standard.TextMessage.FontType font = null;
        it.auties.whatsapp.model.message.standard.TextMessage.PreviewType previewType = null;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        boolean doNotPlayInline = false;
        java.lang.String thumbnailDirectPath = null;
        byte[] thumbnailSha256 = null;
        byte[] thumbnailEncSha256 = null;
        byte[] mediaKey = null;
        java.lang.Long mediaKeyTimestampSeconds = null;
        java.lang.Integer thumbnailHeight = null;
        java.lang.Integer thumbnailWidth = null;
        it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType inviteLinkGroupType = null;
        java.lang.String inviteLinkParentGroupSubjectV2 = null;
        byte[] inviteLinkParentGroupThumbnailV2 = null;
        it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType inviteLinkGroupTypeV2 = null;
        boolean viewOnce = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> matchedText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> canonicalUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> textArgb = protoInputStream.readFixed32();
                case 8 -> backgroundArgb = protoInputStream.readFixed32();
                case 9 -> font = it.auties.whatsapp.model.message.standard.TextMessageFontTypeSpec.decode(protoInputStream.readInt32());
                case 10 -> previewType = it.auties.whatsapp.model.message.standard.TextMessagePreviewTypeSpec.decode(protoInputStream.readInt32());
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 18 -> doNotPlayInline = protoInputStream.readBool();
                case 19 -> thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 20 -> thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 21 -> thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 22 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 23 -> mediaKeyTimestampSeconds = protoInputStream.readInt64();
                case 24 -> thumbnailHeight = protoInputStream.readInt32();
                case 25 -> thumbnailWidth = protoInputStream.readInt32();
                case 26 -> inviteLinkGroupType = it.auties.whatsapp.model.message.standard.TextMessageInviteLinkGroupTypeSpec.decode(protoInputStream.readInt32());
                case 27 -> inviteLinkParentGroupSubjectV2 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 28 -> inviteLinkParentGroupThumbnailV2 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 29 -> inviteLinkGroupTypeV2 = it.auties.whatsapp.model.message.standard.TextMessageInviteLinkGroupTypeSpec.decode(protoInputStream.readInt32());
                case 30 -> viewOnce = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.TextMessage(text, matchedText, canonicalUrl, description, title, textArgb, backgroundArgb, font, previewType, thumbnail, contextInfo, doNotPlayInline, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, mediaKey, mediaKeyTimestampSeconds, thumbnailHeight, thumbnailWidth, inviteLinkGroupType, inviteLinkParentGroupSubjectV2, inviteLinkParentGroupThumbnailV2, inviteLinkGroupTypeV2, viewOnce);
    }

    public static int sizeOf(TextMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(text0);
            }
        }
        var matchedText = protoInputObject.matchedText();
        if (matchedText != null) {
            var matchedText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(matchedText);
            if (matchedText0 != null) {
                var matchedText1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(matchedText0);
                if (matchedText1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(matchedText1);
                }
            }
        }
        var canonicalUrl = protoInputObject.canonicalUrl();
        if (canonicalUrl != null) {
            var canonicalUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(canonicalUrl);
            if (canonicalUrl0 != null) {
                var canonicalUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(canonicalUrl0);
                if (canonicalUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(canonicalUrl1);
                }
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(description1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(title1);
                }
            }
        }
        var textArgb = protoInputObject.textArgb();
        if (textArgb != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 5);
            protoOutputSize += 4;
        }
        var backgroundArgb = protoInputObject.backgroundArgb();
        if (backgroundArgb != null) {
            var backgroundArgb0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(backgroundArgb);
            if (backgroundArgb0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 5);
                protoOutputSize += 4;
            }
        }
        var font = protoInputObject.font();
        if (font != null) {
            var font0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(font);
            if (font0 != null) {
                var font1 = it.auties.whatsapp.model.message.standard.TextMessageFontTypeSpec.encode(font0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(font1);
            }
        }
        var previewType = protoInputObject.previewType();
        if (previewType != null) {
            var previewType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(previewType);
            if (previewType0 != null) {
                var previewType1 = it.auties.whatsapp.model.message.standard.TextMessagePreviewTypeSpec.encode(previewType0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(previewType1);
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        var doNotPlayInline = protoInputObject.doNotPlayInline();
        protoOutputSize += ProtobufOutputStream.getFieldSize(18, 0);
        protoOutputSize += 1;
        var thumbnailDirectPath = protoInputObject.thumbnailDirectPath();
        if (thumbnailDirectPath != null) {
            var thumbnailDirectPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailDirectPath);
            if (thumbnailDirectPath0 != null) {
                var thumbnailDirectPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailDirectPath0);
                if (thumbnailDirectPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(thumbnailDirectPath1);
                }
            }
        }
        var thumbnailSha256 = protoInputObject.thumbnailSha256();
        if (thumbnailSha256 != null) {
            var thumbnailSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailSha256);
            if (thumbnailSha2560 != null) {
                var thumbnailSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailSha2560);
                if (thumbnailSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnailSha2561);
                }
            }
        }
        var thumbnailEncSha256 = protoInputObject.thumbnailEncSha256();
        if (thumbnailEncSha256 != null) {
            var thumbnailEncSha2560 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailEncSha256);
            if (thumbnailEncSha2560 != null) {
                var thumbnailEncSha2561 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailEncSha2560);
                if (thumbnailEncSha2561 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnailEncSha2561);
                }
            }
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaKey);
            if (mediaKey0 != null) {
                var mediaKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey0);
                if (mediaKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey1);
                }
            }
        }
        var mediaKeyTimestampSeconds = protoInputObject.mediaKeyTimestampSeconds();
        if (mediaKeyTimestampSeconds != null) {
            var mediaKeyTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(mediaKeyTimestampSeconds);
            if (mediaKeyTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(23, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaKeyTimestampSeconds0);
            }
        }
        var thumbnailHeight = protoInputObject.thumbnailHeight();
        if (thumbnailHeight != null) {
            var thumbnailHeight0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(thumbnailHeight);
            if (thumbnailHeight0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(thumbnailHeight0);
            }
        }
        var thumbnailWidth = protoInputObject.thumbnailWidth();
        if (thumbnailWidth != null) {
            var thumbnailWidth0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableInt(thumbnailWidth);
            if (thumbnailWidth0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(25, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(thumbnailWidth0);
            }
        }
        var inviteLinkGroupType = protoInputObject.inviteLinkGroupType();
        if (inviteLinkGroupType != null) {
            var inviteLinkGroupType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkGroupType);
            if (inviteLinkGroupType0 != null) {
                var inviteLinkGroupType1 = it.auties.whatsapp.model.message.standard.TextMessageInviteLinkGroupTypeSpec.encode(inviteLinkGroupType0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(inviteLinkGroupType1);
            }
        }
        var inviteLinkParentGroupSubjectV2 = protoInputObject.inviteLinkParentGroupSubjectV2();
        if (inviteLinkParentGroupSubjectV2 != null) {
            var inviteLinkParentGroupSubjectV20 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkParentGroupSubjectV2);
            if (inviteLinkParentGroupSubjectV20 != null) {
                var inviteLinkParentGroupSubjectV21 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(inviteLinkParentGroupSubjectV20);
                if (inviteLinkParentGroupSubjectV21 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(inviteLinkParentGroupSubjectV21);
                }
            }
        }
        var inviteLinkParentGroupThumbnailV2 = protoInputObject.inviteLinkParentGroupThumbnailV2();
        if (inviteLinkParentGroupThumbnailV2 != null) {
            var inviteLinkParentGroupThumbnailV20 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkParentGroupThumbnailV2);
            if (inviteLinkParentGroupThumbnailV20 != null) {
                var inviteLinkParentGroupThumbnailV21 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(inviteLinkParentGroupThumbnailV20);
                if (inviteLinkParentGroupThumbnailV21 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(inviteLinkParentGroupThumbnailV21);
                }
            }
        }
        var inviteLinkGroupTypeV2 = protoInputObject.inviteLinkGroupTypeV2();
        if (inviteLinkGroupTypeV2 != null) {
            var inviteLinkGroupTypeV20 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(inviteLinkGroupTypeV2);
            if (inviteLinkGroupTypeV20 != null) {
                var inviteLinkGroupTypeV21 = it.auties.whatsapp.model.message.standard.TextMessageInviteLinkGroupTypeSpec.encode(inviteLinkGroupTypeV20);
                protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(inviteLinkGroupTypeV21);
            }
        }
        var viewOnce = protoInputObject.viewOnce();
        protoOutputSize += ProtobufOutputStream.getFieldSize(30, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
