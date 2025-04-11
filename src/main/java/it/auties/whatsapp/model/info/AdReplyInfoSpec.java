package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.AdReplyInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AdReplyInfoSpec {
    public static byte[] encode(AdReplyInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AdReplyInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var advertiserName = protoInputObject.advertiserName();
        if (advertiserName != null) {
            var advertiserName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(advertiserName);
            if (advertiserName0 != null) {
                protoOutputStream.writeString(1, advertiserName0);
            }
        }
        var mediaType = protoInputObject.mediaType();
        if (mediaType != null) {
            var mediaType0 = it.auties.whatsapp.model.info.AdReplyInfoMediaTypeSpec.encode(mediaType);
            protoOutputStream.writeInt32(2, mediaType0);
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
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(17, caption1);
                }
            }
        }
    }

    public static AdReplyInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AdReplyInfo decode(ProtobufInputStream protoInputStream) {
        java.lang.String advertiserName = null;
        it.auties.whatsapp.model.info.AdReplyInfo.MediaType mediaType = null;
        java.util.Optional<byte[]> thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> advertiserName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> mediaType = it.auties.whatsapp.model.info.AdReplyInfoMediaTypeSpec.decode(protoInputStream.readInt32());
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                case 17 -> caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.AdReplyInfo(advertiserName, mediaType, thumbnail, caption);
    }

    public static int sizeOf(AdReplyInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var advertiserName = protoInputObject.advertiserName();
        if (advertiserName != null) {
            var advertiserName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(advertiserName);
            if (advertiserName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(advertiserName0);
            }
        }
        var mediaType = protoInputObject.mediaType();
        if (mediaType != null) {
            var mediaType0 = it.auties.whatsapp.model.info.AdReplyInfoMediaTypeSpec.encode(mediaType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaType0);
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
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
        return protoOutputSize;
    }

}
