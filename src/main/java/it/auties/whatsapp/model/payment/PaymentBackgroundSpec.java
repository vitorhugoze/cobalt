package it.auties.whatsapp.model.payment;

import it.auties.whatsapp.model.payment.PaymentBackground;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PaymentBackgroundSpec {
    public static byte[] encode(PaymentBackground protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PaymentBackground protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        protoOutputStream.writeUInt64(2, mediaSize);
        var width = protoInputObject.width();
        protoOutputStream.writeUInt32(3, width);
        var height = protoInputObject.height();
        protoOutputStream.writeUInt32(4, height);
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputStream.writeString(5, mimetype0);
            }
        }
        var placeholderArgb = protoInputObject.placeholderArgb();
        protoOutputStream.writeFixed32(6, placeholderArgb);
        var textArgb = protoInputObject.textArgb();
        protoOutputStream.writeFixed32(7, textArgb);
        var subtextArgb = protoInputObject.subtextArgb();
        protoOutputStream.writeFixed32(8, subtextArgb);
        var mediaData = protoInputObject.mediaData();
        if (mediaData != null) {
            var mediaData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaData);
            if (mediaData0 != null) {
                protoOutputStream.writeMessage(9, it.auties.whatsapp.model.payment.PaymentMediaDataSpec.sizeOf(mediaData0));
                it.auties.whatsapp.model.payment.PaymentMediaDataSpec.encode(mediaData0, protoOutputStream);
            }
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.whatsapp.model.payment.PaymentBackgroundPaymentBackgroundTypeSpec.encode(type);
            protoOutputStream.writeInt32(10, type0);
        }
    }

    public static PaymentBackground decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PaymentBackground decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        long mediaSize = 0l;
        int width = 0;
        int height = 0;
        java.lang.String mimetype = null;
        int placeholderArgb = 0;
        int textArgb = 0;
        int subtextArgb = 0;
        java.util.Optional<it.auties.whatsapp.model.payment.PaymentMediaData> mediaData = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.payment.PaymentBackground.PaymentBackgroundType type = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> mediaSize = protoInputStream.readInt64();
                case 3 -> width = protoInputStream.readInt32();
                case 4 -> height = protoInputStream.readInt32();
                case 5 -> mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> placeholderArgb = protoInputStream.readFixed32();
                case 7 -> textArgb = protoInputStream.readFixed32();
                case 8 -> subtextArgb = protoInputStream.readFixed32();
                case 9 -> mediaData = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.payment.PaymentMediaDataSpec.decode(protoInputStream.readLengthDelimited()));
                case 10 -> type = it.auties.whatsapp.model.payment.PaymentBackgroundPaymentBackgroundTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.payment.PaymentBackground(id, mediaSize, width, height, mimetype, placeholderArgb, textArgb, subtextArgb, mediaData, type);
    }

    public static int sizeOf(PaymentBackground protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var mediaSize = protoInputObject.mediaSize();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaSize);
        var width = protoInputObject.width();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(width);
        var height = protoInputObject.height();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(height);
        var mimetype = protoInputObject.mimetype();
        if (mimetype != null) {
            var mimetype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mimetype);
            if (mimetype0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mimetype0);
            }
        }
        var placeholderArgb = protoInputObject.placeholderArgb();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 5);
        protoOutputSize += 4;
        var textArgb = protoInputObject.textArgb();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 5);
        protoOutputSize += 4;
        var subtextArgb = protoInputObject.subtextArgb();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 5);
        protoOutputSize += 4;
        var mediaData = protoInputObject.mediaData();
        if (mediaData != null) {
            var mediaData0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(mediaData);
            if (mediaData0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                var mediaDataSerializedSize = it.auties.whatsapp.model.payment.PaymentMediaDataSpec.sizeOf(mediaData0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaDataSerializedSize);
                protoOutputSize += mediaDataSerializedSize;
            }
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.whatsapp.model.payment.PaymentBackgroundPaymentBackgroundTypeSpec.encode(type);
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(type0);
        }
        return protoOutputSize;
    }

}
