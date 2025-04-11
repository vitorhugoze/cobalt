package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.ProductListInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProductListInfoSpec {
    public static byte[] encode(ProductListInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ProductListInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.productSections() != null) {
            for (var productSectionsEntry : protoInputObject.productSections()) { 
                if (productSectionsEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.product.ProductSectionSpec.sizeOf(productSectionsEntry));
                    it.auties.whatsapp.model.product.ProductSectionSpec.encode(productSectionsEntry, protoOutputStream);
                }
            }
        }
        var headerImage = protoInputObject.headerImage();
        if (headerImage != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.product.ProductListHeaderImageSpec.sizeOf(headerImage));
            it.auties.whatsapp.model.product.ProductListHeaderImageSpec.encode(headerImage, protoOutputStream);
        }
        var seller = protoInputObject.seller();
        if (seller != null) {
            var seller0 = seller.toString();
            if (seller0 != null) {
                var seller1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(seller0);
                if (seller1 != null) {
                    protoOutputStream.writeString(3, seller1);
                }
            }
        }
    }

    public static ProductListInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ProductListInfo decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.product.ProductSection> productSections = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.product.ProductListHeaderImage headerImage = null;
        it.auties.whatsapp.model.jid.Jid seller = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> productSections.add(it.auties.whatsapp.model.product.ProductSectionSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> headerImage = it.auties.whatsapp.model.product.ProductListHeaderImageSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> seller = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.ProductListInfo(productSections, headerImage, seller);
    }

    public static int sizeOf(ProductListInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.productSections() != null) {
            for (var productSectionsEntry : protoInputObject.productSections()) { 
                if (productSectionsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var productSectionsEntrySerializedSize = it.auties.whatsapp.model.product.ProductSectionSpec.sizeOf(productSectionsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(productSectionsEntrySerializedSize);
                    protoOutputSize += productSectionsEntrySerializedSize;
                }
            }
        }
        var headerImage = protoInputObject.headerImage();
        if (headerImage != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var headerImageSerializedSize = it.auties.whatsapp.model.product.ProductListHeaderImageSpec.sizeOf(headerImage);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(headerImageSerializedSize);
            protoOutputSize += headerImageSerializedSize;
        }
        var seller = protoInputObject.seller();
        if (seller != null) {
            var seller0 = seller.toString();
            if (seller0 != null) {
                var seller1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(seller0);
                if (seller1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(seller1);
                }
            }
        }
        return protoOutputSize;
    }

}
