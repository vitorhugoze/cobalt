package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.ContactMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ContactMessageSpec {
    public static byte[] encode(ContactMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ContactMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(1, name0);
            }
        }
        var vcard = protoInputObject.vcard();
        if (vcard != null) {
            var vcard0 = vcard.toVcard();
            if (vcard0 != null) {
                var vcard1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(vcard0);
                if (vcard1 != null) {
                    protoOutputStream.writeString(16, vcard1);
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

    public static ContactMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ContactMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String name = null;
        it.auties.whatsapp.model.contact.ContactCard vcard = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 16 -> vcard = it.auties.whatsapp.model.contact.ContactCard.ofNullable(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.ContactMessage(name, vcard, contextInfo);
    }

    public static int sizeOf(ContactMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        var vcard = protoInputObject.vcard();
        if (vcard != null) {
            var vcard0 = vcard.toVcard();
            if (vcard0 != null) {
                var vcard1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(vcard0);
                if (vcard1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(vcard1);
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
