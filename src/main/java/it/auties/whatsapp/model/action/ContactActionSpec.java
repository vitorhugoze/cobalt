package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.ContactAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ContactActionSpec {
    public static byte[] encode(ContactAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ContactAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var fullName = protoInputObject.fullName();
        if (fullName != null) {
            var fullName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fullName);
            if (fullName0 != null) {
                var fullName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fullName0);
                if (fullName1 != null) {
                    protoOutputStream.writeString(1, fullName1);
                }
            }
        }
        var firstName = protoInputObject.firstName();
        if (firstName != null) {
            var firstName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(firstName);
            if (firstName0 != null) {
                var firstName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstName0);
                if (firstName1 != null) {
                    protoOutputStream.writeString(2, firstName1);
                }
            }
        }
        var lidJid = protoInputObject.lidJid();
        if (lidJid != null) {
            var lidJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(lidJid);
            if (lidJid0 != null) {
                var lidJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lidJid0);
                if (lidJid1 != null) {
                    protoOutputStream.writeString(3, lidJid1);
                }
            }
        }
    }

    public static ContactAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ContactAction decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<java.lang.String> fullName = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> firstName = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> lidJid = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> fullName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> firstName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> lidJid = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.ContactAction(fullName, firstName, lidJid);
    }

    public static int sizeOf(ContactAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var fullName = protoInputObject.fullName();
        if (fullName != null) {
            var fullName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fullName);
            if (fullName0 != null) {
                var fullName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fullName0);
                if (fullName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(fullName1);
                }
            }
        }
        var firstName = protoInputObject.firstName();
        if (firstName != null) {
            var firstName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(firstName);
            if (firstName0 != null) {
                var firstName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(firstName0);
                if (firstName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(firstName1);
                }
            }
        }
        var lidJid = protoInputObject.lidJid();
        if (lidJid != null) {
            var lidJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(lidJid);
            if (lidJid0 != null) {
                var lidJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lidJid0);
                if (lidJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(lidJid1);
                }
            }
        }
        return protoOutputSize;
    }

}
