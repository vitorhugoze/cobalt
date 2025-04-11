package it.auties.whatsapp.model.product;

import it.auties.whatsapp.model.product.ProductSection;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProductSectionSpec {
    public static byte[] encode(ProductSection protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ProductSection protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        if (protoInputObject.products() != null) {
            for (var productsEntry : protoInputObject.products()) { 
                if (productsEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.product.ProductSectionEntrySpec.sizeOf(productsEntry));
                    it.auties.whatsapp.model.product.ProductSectionEntrySpec.encode(productsEntry, protoOutputStream);
                }
            }
        }
    }

    public static ProductSection decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ProductSection decode(ProtobufInputStream protoInputStream) {
        java.lang.String title = null;
        java.util.List<it.auties.whatsapp.model.product.ProductSectionEntry> products = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> products.add(it.auties.whatsapp.model.product.ProductSectionEntrySpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.product.ProductSection(title, products);
    }

    public static int sizeOf(ProductSection protoInputObject) {
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
        if (protoInputObject.products() != null) {
            for (var productsEntry : protoInputObject.products()) { 
                if (productsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var productsEntrySerializedSize = it.auties.whatsapp.model.product.ProductSectionEntrySpec.sizeOf(productsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(productsEntrySerializedSize);
                    protoOutputSize += productsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
