package it.auties.whatsapp.model.product;

import it.auties.whatsapp.model.product.Product;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProductSpec {
    public static byte[] encode(Product protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Product protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var image = protoInputObject.image();
        if (image != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(image));
            it.auties.whatsapp.model.message.standard.ImageMessageSpec.encode(image, protoOutputStream);
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(2, id0);
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputStream.writeString(3, title0);
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description);
            if (description0 != null) {
                protoOutputStream.writeString(4, description0);
            }
        }
        var currencyCode = protoInputObject.currencyCode();
        if (currencyCode != null) {
            var currencyCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currencyCode);
            if (currencyCode0 != null) {
                protoOutputStream.writeString(5, currencyCode0);
            }
        }
        var priceAmount1000 = protoInputObject.priceAmount1000();
        protoOutputStream.writeInt64(6, priceAmount1000);
        var retailerId = protoInputObject.retailerId();
        if (retailerId != null) {
            var retailerId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(retailerId);
            if (retailerId0 != null) {
                protoOutputStream.writeString(7, retailerId0);
            }
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputStream.writeString(8, url0);
            }
        }
        var productImageCount = protoInputObject.productImageCount();
        protoOutputStream.writeUInt32(9, productImageCount);
        var firstImageId = protoInputObject.firstImageId();
        if (firstImageId != null) {
            var firstImageId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstImageId);
            if (firstImageId0 != null) {
                protoOutputStream.writeString(11, firstImageId0);
            }
        }
        var salePriceAmount1000 = protoInputObject.salePriceAmount1000();
        protoOutputStream.writeInt64(12, salePriceAmount1000);
    }

    public static Product decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Product decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.standard.ImageMessage image = null;
        java.lang.String id = null;
        java.lang.String title = null;
        java.lang.String description = null;
        java.lang.String currencyCode = null;
        long priceAmount1000 = 0l;
        java.lang.String retailerId = null;
        java.lang.String url = null;
        int productImageCount = 0;
        java.lang.String firstImageId = null;
        long salePriceAmount1000 = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> image = it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> currencyCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> priceAmount1000 = protoInputStream.readInt64();
                case 7 -> retailerId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> productImageCount = protoInputStream.readInt32();
                case 11 -> firstImageId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 12 -> salePriceAmount1000 = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.product.Product(image, id, title, description, currencyCode, priceAmount1000, retailerId, url, productImageCount, firstImageId, salePriceAmount1000);
    }

    public static int sizeOf(Product protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var image = protoInputObject.image();
        if (image != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var imageSerializedSize = it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(image);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(imageSerializedSize);
            protoOutputSize += imageSerializedSize;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(title0);
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description);
            if (description0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(description0);
            }
        }
        var currencyCode = protoInputObject.currencyCode();
        if (currencyCode != null) {
            var currencyCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(currencyCode);
            if (currencyCode0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(currencyCode0);
            }
        }
        var priceAmount1000 = protoInputObject.priceAmount1000();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(priceAmount1000);
        var retailerId = protoInputObject.retailerId();
        if (retailerId != null) {
            var retailerId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(retailerId);
            if (retailerId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(retailerId0);
            }
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(url0);
            }
        }
        var productImageCount = protoInputObject.productImageCount();
        protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(productImageCount);
        var firstImageId = protoInputObject.firstImageId();
        if (firstImageId != null) {
            var firstImageId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstImageId);
            if (firstImageId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(firstImageId0);
            }
        }
        var salePriceAmount1000 = protoInputObject.salePriceAmount1000();
        protoOutputSize += ProtobufOutputStream.getFieldSize(12, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(salePriceAmount1000);
        return protoOutputSize;
    }

}
