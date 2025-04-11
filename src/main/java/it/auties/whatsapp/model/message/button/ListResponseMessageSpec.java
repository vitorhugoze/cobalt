package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.ListResponseMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ListResponseMessageSpec {
    public static byte[] encode(ListResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ListResponseMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var listType = protoInputObject.listType();
        if (listType != null) {
            var listType0 = it.auties.whatsapp.model.message.button.ListResponseMessageTypeSpec.encode(listType);
            protoOutputStream.writeInt32(2, listType0);
        }
        var reply = protoInputObject.reply();
        if (reply != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.button.base.SingleSelectReplyButtonSpec.sizeOf(reply));
            it.auties.whatsapp.model.button.base.SingleSelectReplyButtonSpec.encode(reply, protoOutputStream);
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputStream.writeString(5, description1);
                }
            }
        }
    }

    public static ListResponseMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ListResponseMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String title = null;
        it.auties.whatsapp.model.message.button.ListResponseMessage.Type listType = null;
        it.auties.whatsapp.model.button.base.SingleSelectReplyButton reply = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        java.lang.String description = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> listType = it.auties.whatsapp.model.message.button.ListResponseMessageTypeSpec.decode(protoInputStream.readInt32());
                case 3 -> reply = it.auties.whatsapp.model.button.base.SingleSelectReplyButtonSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.ListResponseMessage(title, listType, reply, contextInfo, description);
    }

    public static int sizeOf(ListResponseMessage protoInputObject) {
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
        var listType = protoInputObject.listType();
        if (listType != null) {
            var listType0 = it.auties.whatsapp.model.message.button.ListResponseMessageTypeSpec.encode(listType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(listType0);
        }
        var reply = protoInputObject.reply();
        if (reply != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var replySerializedSize = it.auties.whatsapp.model.button.base.SingleSelectReplyButtonSpec.sizeOf(reply);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(replySerializedSize);
            protoOutputSize += replySerializedSize;
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(description1);
                }
            }
        }
        return protoOutputSize;
    }

}
