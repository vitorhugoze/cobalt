package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.ChatMessageKey;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatMessageKeySpec {
    public static byte[] encode(ChatMessageKey protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ChatMessageKey protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var chatJid = protoInputObject.chatJid();
        if (chatJid != null) {
            var chatJid0 = chatJid.toString();
            if (chatJid0 != null) {
                var chatJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chatJid0);
                if (chatJid1 != null) {
                    protoOutputStream.writeString(1, chatJid1);
                }
            }
        }
        var fromMe = protoInputObject.fromMe();
        protoOutputStream.writeBool(2, fromMe);
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(3, id0);
            }
        }
        var senderJid = protoInputObject.senderJid();
        if (senderJid != null) {
            var senderJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(senderJid);
            if (senderJid0 != null) {
                var senderJid1 = senderJid0.toString();
                if (senderJid1 != null) {
                    var senderJid2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderJid1);
                    if (senderJid2 != null) {
                        protoOutputStream.writeString(4, senderJid2);
                    }
                }
            }
        }
    }

    public static ChatMessageKey decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ChatMessageKey decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid chatJid = null;
        boolean fromMe = false;
        java.lang.String id = null;
        it.auties.whatsapp.model.jid.Jid senderJid = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> chatJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> fromMe = protoInputStream.readBool();
                case 3 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> senderJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.model.ChatMessageKey(chatJid, fromMe, id, senderJid);
    }

    public static int sizeOf(ChatMessageKey protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var chatJid = protoInputObject.chatJid();
        if (chatJid != null) {
            var chatJid0 = chatJid.toString();
            if (chatJid0 != null) {
                var chatJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chatJid0);
                if (chatJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(chatJid1);
                }
            }
        }
        var fromMe = protoInputObject.fromMe();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += 1;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var senderJid = protoInputObject.senderJid();
        if (senderJid != null) {
            var senderJid0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(senderJid);
            if (senderJid0 != null) {
                var senderJid1 = senderJid0.toString();
                if (senderJid1 != null) {
                    var senderJid2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderJid1);
                    if (senderJid2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(senderJid2);
                    }
                }
            }
        }
        return protoOutputSize;
    }

}
