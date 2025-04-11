package it.auties.whatsapp.model.payment;

import it.auties.whatsapp.model.payment.PaymentMediaData;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PaymentMediaDataSpec {
    public static byte[] encode(PaymentMediaData protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PaymentMediaData protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputStream.writeBytes(1, mediaKey0);
            }
        }
        var mediaKeyTimestamp = protoInputObject.mediaKeyTimestamp();
        protoOutputStream.writeInt64(2, mediaKeyTimestamp);
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha256);
            if (mediaSha2560 != null) {
                protoOutputStream.writeBytes(3, mediaSha2560);
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                protoOutputStream.writeBytes(4, mediaEncryptedSha2560);
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                protoOutputStream.writeString(5, mediaDirectPath0);
            }
        }
    }

    public static PaymentMediaData decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PaymentMediaData decode(ProtobufInputStream protoInputStream) {
        byte[] mediaKey = null;
        long mediaKeyTimestamp = 0l;
        byte[] mediaSha256 = null;
        byte[] mediaEncryptedSha256 = null;
        java.lang.String mediaDirectPath = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> mediaKeyTimestamp = protoInputStream.readInt64();
                case 3 -> mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.payment.PaymentMediaData(mediaKey, mediaKeyTimestamp, mediaSha256, mediaEncryptedSha256, mediaDirectPath);
    }

    public static int sizeOf(PaymentMediaData protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var mediaKey = protoInputObject.mediaKey();
        if (mediaKey != null) {
            var mediaKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaKey);
            if (mediaKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaKey0);
            }
        }
        var mediaKeyTimestamp = protoInputObject.mediaKeyTimestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaKeyTimestamp);
        var mediaSha256 = protoInputObject.mediaSha256();
        if (mediaSha256 != null) {
            var mediaSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaSha256);
            if (mediaSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaSha2560);
            }
        }
        var mediaEncryptedSha256 = protoInputObject.mediaEncryptedSha256();
        if (mediaEncryptedSha256 != null) {
            var mediaEncryptedSha2560 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaEncryptedSha256);
            if (mediaEncryptedSha2560 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(mediaEncryptedSha2560);
            }
        }
        var mediaDirectPath = protoInputObject.mediaDirectPath();
        if (mediaDirectPath != null) {
            var mediaDirectPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mediaDirectPath);
            if (mediaDirectPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mediaDirectPath0);
            }
        }
        return protoOutputSize;
    }

}
