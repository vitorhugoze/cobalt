package it.auties.whatsapp.model.contact;

import it.auties.whatsapp.model.contact.Contact;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ContactSpec {
    public static byte[] encode(Contact protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Contact protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var jid = protoInputObject.jid();
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputStream.writeString(1, jid1);
                }
            }
        }
        var chosenName = protoInputObject.chosenName();
        if (chosenName != null) {
            var chosenName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(chosenName);
            if (chosenName0 != null) {
                var chosenName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chosenName0);
                if (chosenName1 != null) {
                    protoOutputStream.writeString(2, chosenName1);
                }
            }
        }
        var fullName = protoInputObject.fullName();
        if (fullName != null) {
            var fullName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fullName);
            if (fullName0 != null) {
                var fullName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fullName0);
                if (fullName1 != null) {
                    protoOutputStream.writeString(3, fullName1);
                }
            }
        }
        var shortName = protoInputObject.shortName();
        if (shortName != null) {
            var shortName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(shortName);
            if (shortName0 != null) {
                var shortName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(shortName0);
                if (shortName1 != null) {
                    protoOutputStream.writeString(4, shortName1);
                }
            }
        }
        var lastKnownPresence = protoInputObject.lastKnownPresence();
        if (lastKnownPresence != null) {
            var lastKnownPresence0 = it.auties.whatsapp.model.contact.ContactStatusSpec.encode(lastKnownPresence);
            protoOutputStream.writeInt32(5, lastKnownPresence0);
        }
        var lastSeenSeconds = protoInputObject.lastSeenSeconds();
        if (lastSeenSeconds != null) {
            var lastSeenSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(lastSeenSeconds);
            if (lastSeenSeconds0 != null) {
                protoOutputStream.writeUInt64(6, lastSeenSeconds0);
            }
        }
        var blocked = protoInputObject.blocked();
        protoOutputStream.writeBool(7, blocked);
    }

    public static Contact decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Contact decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid jid = null;
        java.lang.String chosenName = null;
        java.lang.String fullName = null;
        java.lang.String shortName = null;
        it.auties.whatsapp.model.contact.ContactStatus lastKnownPresence = null;
        java.lang.Long lastSeenSeconds = null;
        boolean blocked = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> chosenName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> fullName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> shortName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> lastKnownPresence = it.auties.whatsapp.model.contact.ContactStatusSpec.decode(protoInputStream.readInt32());
                case 6 -> lastSeenSeconds = protoInputStream.readInt64();
                case 7 -> blocked = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.contact.Contact(jid, chosenName, fullName, shortName, lastKnownPresence, lastSeenSeconds, blocked);
    }

    public static int sizeOf(Contact protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var jid = protoInputObject.jid();
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(jid1);
                }
            }
        }
        var chosenName = protoInputObject.chosenName();
        if (chosenName != null) {
            var chosenName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(chosenName);
            if (chosenName0 != null) {
                var chosenName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chosenName0);
                if (chosenName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(chosenName1);
                }
            }
        }
        var fullName = protoInputObject.fullName();
        if (fullName != null) {
            var fullName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fullName);
            if (fullName0 != null) {
                var fullName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fullName0);
                if (fullName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(fullName1);
                }
            }
        }
        var shortName = protoInputObject.shortName();
        if (shortName != null) {
            var shortName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(shortName);
            if (shortName0 != null) {
                var shortName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(shortName0);
                if (shortName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(shortName1);
                }
            }
        }
        var lastKnownPresence = protoInputObject.lastKnownPresence();
        if (lastKnownPresence != null) {
            var lastKnownPresence0 = it.auties.whatsapp.model.contact.ContactStatusSpec.encode(lastKnownPresence);
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(lastKnownPresence0);
        }
        var lastSeenSeconds = protoInputObject.lastSeenSeconds();
        if (lastSeenSeconds != null) {
            var lastSeenSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(lastSeenSeconds);
            if (lastSeenSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(lastSeenSeconds0);
            }
        }
        var blocked = protoInputObject.blocked();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
