package it.auties.whatsapp.model.product;

import it.auties.whatsapp.model.product.ProductCatalog;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProductCatalogSpec {
    public static byte[] encode(ProductCatalog protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ProductCatalog protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var catalogImage = protoInputObject.catalogImage();
        if (catalogImage != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(catalogImage));
            it.auties.whatsapp.model.message.standard.ImageMessageSpec.encode(catalogImage, protoOutputStream);
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputStream.writeString(2, title0);
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description);
            if (description0 != null) {
                protoOutputStream.writeString(3, description0);
            }
        }
    }

    public static ProductCatalog decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ProductCatalog decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.standard.ImageMessage catalogImage = null;
        java.lang.String title = null;
        java.lang.String description = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> catalogImage = it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.product.ProductCatalog(catalogImage, title, description);
    }

    public static int sizeOf(ProductCatalog protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var catalogImage = protoInputObject.catalogImage();
        if (catalogImage != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var catalogImageSerializedSize = it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(catalogImage);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(catalogImageSerializedSize);
            protoOutputSize += catalogImageSerializedSize;
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(title0);
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description);
            if (description0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(description0);
            }
        }
        return protoOutputSize;
    }

}
