package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.GroupInviteMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class GroupInviteMessageSpec {
    public static byte[] encode(GroupInviteMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(GroupInviteMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var group = protoInputObject.group();
        if (group != null) {
            var group0 = group.toString();
            if (group0 != null) {
                var group1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(group0);
                if (group1 != null) {
                    protoOutputStream.writeString(1, group1);
                }
            }
        }
        var code = protoInputObject.code();
        if (code != null) {
            var code0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(code);
            if (code0 != null) {
                protoOutputStream.writeString(2, code0);
            }
        }
        var expirationSeconds = protoInputObject.expirationSeconds();
        protoOutputStream.writeUInt64(3, expirationSeconds);
        var groupName = protoInputObject.groupName();
        if (groupName != null) {
            var groupName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupName);
            if (groupName0 != null) {
                protoOutputStream.writeString(4, groupName0);
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputStream.writeBytes(5, thumbnail1);
                }
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(6, caption1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        var groupType = protoInputObject.groupType();
        if (groupType != null) {
            var groupType0 = it.auties.whatsapp.model.message.standard.GroupInviteMessageTypeSpec.encode(groupType);
            protoOutputStream.writeInt32(8, groupType0);
        }
    }

    public static GroupInviteMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static GroupInviteMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid group = null;
        java.lang.String code = null;
        long expirationSeconds = 0l;
        java.lang.String groupName = null;
        byte[] thumbnail = null;
        java.lang.String caption = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        it.auties.whatsapp.model.message.standard.GroupInviteMessage.Type groupType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> group = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> code = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> expirationSeconds = protoInputStream.readInt64();
                case 4 -> groupName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 6 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 8 -> groupType = it.auties.whatsapp.model.message.standard.GroupInviteMessageTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.GroupInviteMessage(group, code, expirationSeconds, groupName, thumbnail, caption, contextInfo, groupType);
    }

    public static int sizeOf(GroupInviteMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var group = protoInputObject.group();
        if (group != null) {
            var group0 = group.toString();
            if (group0 != null) {
                var group1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(group0);
                if (group1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(group1);
                }
            }
        }
        var code = protoInputObject.code();
        if (code != null) {
            var code0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(code);
            if (code0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(code0);
            }
        }
        var expirationSeconds = protoInputObject.expirationSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(expirationSeconds);
        var groupName = protoInputObject.groupName();
        if (groupName != null) {
            var groupName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupName);
            if (groupName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(groupName0);
            }
        }
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail1);
                }
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        var groupType = protoInputObject.groupType();
        if (groupType != null) {
            var groupType0 = it.auties.whatsapp.model.message.standard.GroupInviteMessageTypeSpec.encode(groupType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupType0);
        }
        return protoOutputSize;
    }

}
