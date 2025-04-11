package it.auties.whatsapp.model.call;

import it.auties.whatsapp.model.call.Call;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CallSpec {
    public static byte[] encode(Call protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Call protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var chat = protoInputObject.chat();
        if (chat != null) {
            var chat0 = chat.toString();
            if (chat0 != null) {
                var chat1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chat0);
                if (chat1 != null) {
                    protoOutputStream.writeString(1, chat1);
                }
            }
        }
        var caller = protoInputObject.caller();
        if (caller != null) {
            var caller0 = caller.toString();
            if (caller0 != null) {
                var caller1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caller0);
                if (caller1 != null) {
                    protoOutputStream.writeString(2, caller1);
                }
            }
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(3, id0);
            }
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputStream.writeUInt64(4, timestampSeconds);
        var video = protoInputObject.video();
        protoOutputStream.writeBool(5, video);
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.call.CallStatusSpec.encode(status);
            protoOutputStream.writeInt32(6, status0);
        }
        var offline = protoInputObject.offline();
        protoOutputStream.writeBool(7, offline);
    }

    public static Call decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Call decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid chat = null;
        it.auties.whatsapp.model.jid.Jid caller = null;
        java.lang.String id = null;
        long timestampSeconds = 0l;
        boolean video = false;
        it.auties.whatsapp.model.call.CallStatus status = null;
        boolean offline = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> chat = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> caller = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> timestampSeconds = protoInputStream.readInt64();
                case 5 -> video = protoInputStream.readBool();
                case 6 -> status = it.auties.whatsapp.model.call.CallStatusSpec.decode(protoInputStream.readInt32());
                case 7 -> offline = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.call.Call(chat, caller, id, timestampSeconds, video, status, offline);
    }

    public static int sizeOf(Call protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var chat = protoInputObject.chat();
        if (chat != null) {
            var chat0 = chat.toString();
            if (chat0 != null) {
                var chat1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(chat0);
                if (chat1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(chat1);
                }
            }
        }
        var caller = protoInputObject.caller();
        if (caller != null) {
            var caller0 = caller.toString();
            if (caller0 != null) {
                var caller1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caller0);
                if (caller1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caller1);
                }
            }
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampSeconds);
        var video = protoInputObject.video();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += 1;
        var status = protoInputObject.status();
        if (status != null) {
            var status0 = it.auties.whatsapp.model.call.CallStatusSpec.encode(status);
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(status0);
        }
        var offline = protoInputObject.offline();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
