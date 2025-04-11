package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.ExternalAdReplyInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ExternalAdReplyInfoSpec {
    public static byte[] encode(ExternalAdReplyInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ExternalAdReplyInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputStream.writeString(1, title1);
                }
            }
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputStream.writeString(2, body1);
                }
            }
        }
        var mediaType = protoInputObject.mediaType();
        if (mediaType != null) {
            var mediaType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaType);
            if (mediaType0 != null) {
                var mediaType1 = it.auties.whatsapp.model.info.ExternalAdReplyInfoMediaTypeSpec.encode(mediaType0);
                protoOutputStream.writeInt32(3, mediaType1);
            }
        }
        var thumbnailUrl = protoInputObject.thumbnailUrl();
        if (thumbnailUrl != null) {
            var thumbnailUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailUrl);
            if (thumbnailUrl0 != null) {
                var thumbnailUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailUrl0);
                if (thumbnailUrl1 != null) {
                    protoOutputStream.writeString(4, thumbnailUrl1);
                }
            }
        }
        var mediaUrl = protoInputObject.mediaUrl();
        if (mediaUrl != null) {
            var mediaUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaUrl);
            if (mediaUrl0 != null) {
                var mediaUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaUrl0);
                if (mediaUrl1 != null) {
                    protoOutputStream.writeString(5, mediaUrl1);
                }
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputStream.writeBytes(6, thumbnail1);
                }
            }
        }
        var sourceType = protoInputObject.sourceType();
        if (sourceType != null) {
            var sourceType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sourceType);
            if (sourceType0 != null) {
                var sourceType1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sourceType0);
                if (sourceType1 != null) {
                    protoOutputStream.writeString(7, sourceType1);
                }
            }
        }
        var sourceId = protoInputObject.sourceId();
        if (sourceId != null) {
            var sourceId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sourceId);
            if (sourceId0 != null) {
                var sourceId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sourceId0);
                if (sourceId1 != null) {
                    protoOutputStream.writeString(8, sourceId1);
                }
            }
        }
        var sourceUrl = protoInputObject.sourceUrl();
        if (sourceUrl != null) {
            var sourceUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sourceUrl);
            if (sourceUrl0 != null) {
                var sourceUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sourceUrl0);
                if (sourceUrl1 != null) {
                    protoOutputStream.writeString(9, sourceUrl1);
                }
            }
        }
        var containsAutoReply = protoInputObject.containsAutoReply();
        protoOutputStream.writeBool(10, containsAutoReply);
        var renderLargerThumbnail = protoInputObject.renderLargerThumbnail();
        protoOutputStream.writeBool(11, renderLargerThumbnail);
        var showAdAttribution = protoInputObject.showAdAttribution();
        protoOutputStream.writeBool(12, showAdAttribution);
        var ctwaClid = protoInputObject.ctwaClid();
        if (ctwaClid != null) {
            var ctwaClid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(ctwaClid);
            if (ctwaClid0 != null) {
                var ctwaClid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ctwaClid0);
                if (ctwaClid1 != null) {
                    protoOutputStream.writeString(13, ctwaClid1);
                }
            }
        }
    }

    public static ExternalAdReplyInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ExternalAdReplyInfo decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<java.lang.String> title = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> body = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.info.ExternalAdReplyInfo.MediaType> mediaType = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> thumbnailUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> mediaUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<byte[]> thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> sourceType = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> sourceId = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> sourceUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        boolean containsAutoReply = false;
        boolean renderLargerThumbnail = false;
        boolean showAdAttribution = false;
        java.util.Optional<java.lang.String> ctwaClid = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> title = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> body = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> mediaType = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.info.ExternalAdReplyInfoMediaTypeSpec.decode(protoInputStream.readInt32()));
                case 4 -> thumbnailUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> mediaUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 6 -> thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                case 7 -> sourceType = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 8 -> sourceId = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 9 -> sourceUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 10 -> containsAutoReply = protoInputStream.readBool();
                case 11 -> renderLargerThumbnail = protoInputStream.readBool();
                case 12 -> showAdAttribution = protoInputStream.readBool();
                case 13 -> ctwaClid = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.ExternalAdReplyInfo(title, body, mediaType, thumbnailUrl, mediaUrl, thumbnail, sourceType, sourceId, sourceUrl, containsAutoReply, renderLargerThumbnail, showAdAttribution, ctwaClid);
    }

    public static int sizeOf(ExternalAdReplyInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(title1);
                }
            }
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(body1);
                }
            }
        }
        var mediaType = protoInputObject.mediaType();
        if (mediaType != null) {
            var mediaType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaType);
            if (mediaType0 != null) {
                var mediaType1 = it.auties.whatsapp.model.info.ExternalAdReplyInfoMediaTypeSpec.encode(mediaType0);
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaType1);
            }
        }
        var thumbnailUrl = protoInputObject.thumbnailUrl();
        if (thumbnailUrl != null) {
            var thumbnailUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnailUrl);
            if (thumbnailUrl0 != null) {
                var thumbnailUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnailUrl0);
                if (thumbnailUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(thumbnailUrl1);
                }
            }
        }
        var mediaUrl = protoInputObject.mediaUrl();
        if (mediaUrl != null) {
            var mediaUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaUrl);
            if (mediaUrl0 != null) {
                var mediaUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaUrl0);
                if (mediaUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(mediaUrl1);
                }
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail1);
                }
            }
        }
        var sourceType = protoInputObject.sourceType();
        if (sourceType != null) {
            var sourceType0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sourceType);
            if (sourceType0 != null) {
                var sourceType1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sourceType0);
                if (sourceType1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(sourceType1);
                }
            }
        }
        var sourceId = protoInputObject.sourceId();
        if (sourceId != null) {
            var sourceId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sourceId);
            if (sourceId0 != null) {
                var sourceId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sourceId0);
                if (sourceId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(sourceId1);
                }
            }
        }
        var sourceUrl = protoInputObject.sourceUrl();
        if (sourceUrl != null) {
            var sourceUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sourceUrl);
            if (sourceUrl0 != null) {
                var sourceUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(sourceUrl0);
                if (sourceUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(sourceUrl1);
                }
            }
        }
        var containsAutoReply = protoInputObject.containsAutoReply();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += 1;
        var renderLargerThumbnail = protoInputObject.renderLargerThumbnail();
        protoOutputSize += ProtobufOutputStream.getFieldSize(11, 0);
        protoOutputSize += 1;
        var showAdAttribution = protoInputObject.showAdAttribution();
        protoOutputSize += ProtobufOutputStream.getFieldSize(12, 0);
        protoOutputSize += 1;
        var ctwaClid = protoInputObject.ctwaClid();
        if (ctwaClid != null) {
            var ctwaClid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(ctwaClid);
            if (ctwaClid0 != null) {
                var ctwaClid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ctwaClid0);
                if (ctwaClid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(ctwaClid1);
                }
            }
        }
        return protoOutputSize;
    }

}
