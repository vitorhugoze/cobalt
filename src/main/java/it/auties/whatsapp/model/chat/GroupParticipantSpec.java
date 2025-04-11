package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.GroupParticipant;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class GroupParticipantSpec {
    public static byte[] encode(GroupParticipant protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(GroupParticipant protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var role = protoInputObject.role();
        if (role != null) {
            var role0 = it.auties.whatsapp.model.chat.GroupRoleSpec.encode(role);
            protoOutputStream.writeInt32(2, role0);
        }
    }

    public static GroupParticipant decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static GroupParticipant decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid jid = null;
        it.auties.whatsapp.model.chat.GroupRole role = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> role = it.auties.whatsapp.model.chat.GroupRoleSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.chat.GroupParticipant(jid, role);
    }

    public static int sizeOf(GroupParticipant protoInputObject) {
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
        var role = protoInputObject.role();
        if (role != null) {
            var role0 = it.auties.whatsapp.model.chat.GroupRoleSpec.encode(role);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(role0);
        }
        return protoOutputSize;
    }

}
