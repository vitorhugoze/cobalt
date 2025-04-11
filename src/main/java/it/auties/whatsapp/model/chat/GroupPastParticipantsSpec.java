package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.GroupPastParticipants;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class GroupPastParticipantsSpec {
    public static byte[] encode(GroupPastParticipants protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(GroupPastParticipants protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var groupJid = protoInputObject.groupJid();
        if (groupJid != null) {
            var groupJid0 = groupJid.toString();
            if (groupJid0 != null) {
                var groupJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupJid0);
                if (groupJid1 != null) {
                    protoOutputStream.writeString(1, groupJid1);
                }
            }
        }
        if (protoInputObject.pastParticipants() != null) {
            for (var pastParticipantsEntry : protoInputObject.pastParticipants()) { 
                if (pastParticipantsEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.chat.ChatPastParticipantSpec.sizeOf(pastParticipantsEntry));
                    it.auties.whatsapp.model.chat.ChatPastParticipantSpec.encode(pastParticipantsEntry, protoOutputStream);
                }
            }
        }
    }

    public static GroupPastParticipants decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static GroupPastParticipants decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid groupJid = null;
        java.util.List<it.auties.whatsapp.model.chat.ChatPastParticipant> pastParticipants = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> groupJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> pastParticipants.add(it.auties.whatsapp.model.chat.ChatPastParticipantSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.chat.GroupPastParticipants(groupJid, pastParticipants);
    }

    public static int sizeOf(GroupPastParticipants protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var groupJid = protoInputObject.groupJid();
        if (groupJid != null) {
            var groupJid0 = groupJid.toString();
            if (groupJid0 != null) {
                var groupJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupJid0);
                if (groupJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(groupJid1);
                }
            }
        }
        if (protoInputObject.pastParticipants() != null) {
            for (var pastParticipantsEntry : protoInputObject.pastParticipants()) { 
                if (pastParticipantsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var pastParticipantsEntrySerializedSize = it.auties.whatsapp.model.chat.ChatPastParticipantSpec.sizeOf(pastParticipantsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(pastParticipantsEntrySerializedSize);
                    protoOutputSize += pastParticipantsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
