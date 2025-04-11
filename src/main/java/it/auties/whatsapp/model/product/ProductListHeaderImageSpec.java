package it.auties.whatsapp.model.product;

import it.auties.whatsapp.model.product.ProductListHeaderImage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProductListHeaderImageSpec {
    public static byte[] encode(ProductListHeaderImage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ProductListHeaderImage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail);
            if (thumbnail0 != null) {
                protoOutputStream.writeBytes(2, thumbnail0);
            }
        }
    }

    public static ProductListHeaderImage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ProductListHeaderImage decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        byte[] thumbnail = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.product.ProductListHeaderImage(id, thumbnail);
    }

    public static int sizeOf(ProductListHeaderImage protoInputObject) {
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
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail);
            if (thumbnail0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail0);
            }
        }
        return protoOutputSize;
    }

}
