package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.InteractiveMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveMessageSpec {
    public static byte[] encode(InteractiveMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var header = protoInputObject.header();
        if (header != null) {
            var header0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(header);
            if (header0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.interactive.InteractiveHeaderSpec.sizeOf(header0));
                it.auties.whatsapp.model.button.interactive.InteractiveHeaderSpec.encode(header0, protoOutputStream);
            }
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.sizeOf(body0));
                it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.encode(body0, protoOutputStream);
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.button.interactive.InteractiveFooterSpec.sizeOf(footer0));
                it.auties.whatsapp.model.button.interactive.InteractiveFooterSpec.encode(footer0, protoOutputStream);
            }
        }
        var contentShop = protoInputObject.contentShop();
        if (contentShop != null) {
            var contentShop0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contentShop);
            if (contentShop0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.button.interactive.InteractiveShopSpec.sizeOf(contentShop0));
                it.auties.whatsapp.model.button.interactive.InteractiveShopSpec.encode(contentShop0, protoOutputStream);
            }
        }
        var contentCollection = protoInputObject.contentCollection();
        if (contentCollection != null) {
            var contentCollection0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contentCollection);
            if (contentCollection0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.button.interactive.InteractiveCollectionSpec.sizeOf(contentCollection0));
                it.auties.whatsapp.model.button.interactive.InteractiveCollectionSpec.encode(contentCollection0, protoOutputStream);
            }
        }
        var contentNativeFlow = protoInputObject.contentNativeFlow();
        if (contentNativeFlow != null) {
            var contentNativeFlow0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contentNativeFlow);
            if (contentNativeFlow0 != null) {
                protoOutputStream.writeMessage(6, it.auties.whatsapp.model.button.interactive.InteractiveNativeFlowSpec.sizeOf(contentNativeFlow0));
                it.auties.whatsapp.model.button.interactive.InteractiveNativeFlowSpec.encode(contentNativeFlow0, protoOutputStream);
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(15, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
    }

    public static InteractiveMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.interactive.InteractiveHeader header = null;
        it.auties.whatsapp.model.button.interactive.InteractiveBody body = null;
        it.auties.whatsapp.model.button.interactive.InteractiveFooter footer = null;
        it.auties.whatsapp.model.button.interactive.InteractiveShop contentShop = null;
        it.auties.whatsapp.model.button.interactive.InteractiveCollection contentCollection = null;
        it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow contentNativeFlow = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> header = it.auties.whatsapp.model.button.interactive.InteractiveHeaderSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> body = it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> footer = it.auties.whatsapp.model.button.interactive.InteractiveFooterSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> contentShop = it.auties.whatsapp.model.button.interactive.InteractiveShopSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> contentCollection = it.auties.whatsapp.model.button.interactive.InteractiveCollectionSpec.decode(protoInputStream.readLengthDelimited());
                case 6 -> contentNativeFlow = it.auties.whatsapp.model.button.interactive.InteractiveNativeFlowSpec.decode(protoInputStream.readLengthDelimited());
                case 15 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.InteractiveMessage(header, body, footer, contentShop, contentCollection, contentNativeFlow, contextInfo);
    }

    public static int sizeOf(InteractiveMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var header = protoInputObject.header();
        if (header != null) {
            var header0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(header);
            if (header0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var headerSerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveHeaderSpec.sizeOf(header0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(headerSerializedSize);
                protoOutputSize += headerSerializedSize;
            }
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var bodySerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.sizeOf(body0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(bodySerializedSize);
                protoOutputSize += bodySerializedSize;
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var footerSerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveFooterSpec.sizeOf(footer0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(footerSerializedSize);
                protoOutputSize += footerSerializedSize;
            }
        }
        var contentShop = protoInputObject.contentShop();
        if (contentShop != null) {
            var contentShop0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contentShop);
            if (contentShop0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var contentShopSerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveShopSpec.sizeOf(contentShop0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contentShopSerializedSize);
                protoOutputSize += contentShopSerializedSize;
            }
        }
        var contentCollection = protoInputObject.contentCollection();
        if (contentCollection != null) {
            var contentCollection0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contentCollection);
            if (contentCollection0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var contentCollectionSerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveCollectionSpec.sizeOf(contentCollection0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contentCollectionSerializedSize);
                protoOutputSize += contentCollectionSerializedSize;
            }
        }
        var contentNativeFlow = protoInputObject.contentNativeFlow();
        if (contentNativeFlow != null) {
            var contentNativeFlow0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contentNativeFlow);
            if (contentNativeFlow0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                var contentNativeFlowSerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveNativeFlowSpec.sizeOf(contentNativeFlow0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contentNativeFlowSerializedSize);
                protoOutputSize += contentNativeFlowSerializedSize;
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
