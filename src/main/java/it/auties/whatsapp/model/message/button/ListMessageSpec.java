package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.ListMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ListMessageSpec {
    public static byte[] encode(ListMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ListMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputStream.writeString(2, description1);
                }
            }
        }
        var button = protoInputObject.button();
        if (button != null) {
            var button0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(button);
            if (button0 != null) {
                protoOutputStream.writeString(3, button0);
            }
        }
        var listType = protoInputObject.listType();
        if (listType != null) {
            var listType0 = it.auties.whatsapp.model.message.button.ListMessageTypeSpec.encode(listType);
            protoOutputStream.writeInt32(4, listType0);
        }
        if (protoInputObject.sections() != null) {
            for (var sectionsEntry : protoInputObject.sections()) { 
                if (sectionsEntry != null) {
                    protoOutputStream.writeMessage(5, it.auties.whatsapp.model.button.base.ButtonSectionSpec.sizeOf(sectionsEntry));
                    it.auties.whatsapp.model.button.base.ButtonSectionSpec.encode(sectionsEntry, protoOutputStream);
                }
            }
        }
        var productListInfo = protoInputObject.productListInfo();
        if (productListInfo != null) {
            var productListInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(productListInfo);
            if (productListInfo0 != null) {
                protoOutputStream.writeMessage(6, it.auties.whatsapp.model.info.ProductListInfoSpec.sizeOf(productListInfo0));
                it.auties.whatsapp.model.info.ProductListInfoSpec.encode(productListInfo0, protoOutputStream);
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                var footer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(footer0);
                if (footer1 != null) {
                    protoOutputStream.writeString(7, footer1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(8, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
    }

    public static ListMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ListMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String title = null;
        java.lang.String description = null;
        java.lang.String button = null;
        it.auties.whatsapp.model.message.button.ListMessage.Type listType = null;
        java.util.List<it.auties.whatsapp.model.button.base.ButtonSection> sections = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.info.ProductListInfo productListInfo = null;
        java.lang.String footer = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> button = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> listType = it.auties.whatsapp.model.message.button.ListMessageTypeSpec.decode(protoInputStream.readInt32());
                case 5 -> sections.add(it.auties.whatsapp.model.button.base.ButtonSectionSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> productListInfo = it.auties.whatsapp.model.info.ProductListInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> footer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.ListMessage(title, description, button, listType, sections, productListInfo, footer, contextInfo);
    }

    public static int sizeOf(ListMessage protoInputObject) {
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
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(description1);
                }
            }
        }
        var button = protoInputObject.button();
        if (button != null) {
            var button0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(button);
            if (button0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(button0);
            }
        }
        var listType = protoInputObject.listType();
        if (listType != null) {
            var listType0 = it.auties.whatsapp.model.message.button.ListMessageTypeSpec.encode(listType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(listType0);
        }
        if (protoInputObject.sections() != null) {
            for (var sectionsEntry : protoInputObject.sections()) { 
                if (sectionsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    var sectionsEntrySerializedSize = it.auties.whatsapp.model.button.base.ButtonSectionSpec.sizeOf(sectionsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(sectionsEntrySerializedSize);
                    protoOutputSize += sectionsEntrySerializedSize;
                }
            }
        }
        var productListInfo = protoInputObject.productListInfo();
        if (productListInfo != null) {
            var productListInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(productListInfo);
            if (productListInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                var productListInfoSerializedSize = it.auties.whatsapp.model.info.ProductListInfoSpec.sizeOf(productListInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(productListInfoSerializedSize);
                protoOutputSize += productListInfoSerializedSize;
            }
        }
        var footer = protoInputObject.footer();
        if (footer != null) {
            var footer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(footer);
            if (footer0 != null) {
                var footer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(footer0);
                if (footer1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(footer1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
