package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.ProductMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProductMessageSpec {
    public static byte[] encode(ProductMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ProductMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var product = protoInputObject.product();
        if (product != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.product.ProductSpec.sizeOf(product));
            it.auties.whatsapp.model.product.ProductSpec.encode(product, protoOutputStream);
        }
        var businessOwnerJid = protoInputObject.businessOwnerJid();
        if (businessOwnerJid != null) {
            var businessOwnerJid0 = businessOwnerJid.toString();
            if (businessOwnerJid0 != null) {
                var businessOwnerJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessOwnerJid0);
                if (businessOwnerJid1 != null) {
                    protoOutputStream.writeString(2, businessOwnerJid1);
                }
            }
        }
        var catalog = protoInputObject.catalog();
        if (catalog != null) {
            protoOutputStream.writeMessage(4, it.auties.whatsapp.model.product.ProductCatalogSpec.sizeOf(catalog));
            it.auties.whatsapp.model.product.ProductCatalogSpec.encode(catalog, protoOutputStream);
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputStream.writeString(5, body1);
                }
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                var footer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(footer0);
                if (footer1 != null) {
                    protoOutputStream.writeString(6, footer1);
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
    }

    public static ProductMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ProductMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.product.Product product = null;
        it.auties.whatsapp.model.jid.Jid businessOwnerJid = null;
        it.auties.whatsapp.model.product.ProductCatalog catalog = null;
        java.lang.String body = null;
        java.lang.String footer = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> product = it.auties.whatsapp.model.product.ProductSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> businessOwnerJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> catalog = it.auties.whatsapp.model.product.ProductCatalogSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> body = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> footer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.ProductMessage(product, businessOwnerJid, catalog, body, footer, contextInfo);
    }

    public static int sizeOf(ProductMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var product = protoInputObject.product();
        if (product != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var productSerializedSize = it.auties.whatsapp.model.product.ProductSpec.sizeOf(product);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(productSerializedSize);
            protoOutputSize += productSerializedSize;
        }
        var businessOwnerJid = protoInputObject.businessOwnerJid();
        if (businessOwnerJid != null) {
            var businessOwnerJid0 = businessOwnerJid.toString();
            if (businessOwnerJid0 != null) {
                var businessOwnerJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(businessOwnerJid0);
                if (businessOwnerJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(businessOwnerJid1);
                }
            }
        }
        var catalog = protoInputObject.catalog();
        if (catalog != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            var catalogSerializedSize = it.auties.whatsapp.model.product.ProductCatalogSpec.sizeOf(catalog);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(catalogSerializedSize);
            protoOutputSize += catalogSerializedSize;
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(body1);
                }
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                var footer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(footer0);
                if (footer1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(footer1);
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
        return protoOutputSize;
    }

}
