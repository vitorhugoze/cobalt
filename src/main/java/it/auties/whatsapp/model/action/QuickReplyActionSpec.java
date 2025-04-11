package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.QuickReplyAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class QuickReplyActionSpec {
    public static byte[] encode(QuickReplyAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(QuickReplyAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var shortcut = protoInputObject.shortcut();
        if (shortcut != null) {
            var shortcut0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(shortcut);
            if (shortcut0 != null) {
                protoOutputStream.writeString(1, shortcut0);
            }
        }
        var message = protoInputObject.message();
        if (message != null) {
            var message0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(message);
            if (message0 != null) {
                protoOutputStream.writeString(2, message0);
            }
        }
        if (protoInputObject.keywords() != null) {
            for (var keywordsEntry : protoInputObject.keywords()) { 
                if (keywordsEntry != null) {
                    var keywords0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(keywordsEntry);
                    if (keywords0 != null) {
                        protoOutputStream.writeString(3, keywords0);
                    }
                }
            }
        }
        var count = protoInputObject.count();
        protoOutputStream.writeInt32(4, count);
        var deleted = protoInputObject.deleted();
        protoOutputStream.writeBool(5, deleted);
    }

    public static QuickReplyAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static QuickReplyAction decode(ProtobufInputStream protoInputStream) {
        java.lang.String shortcut = null;
        java.lang.String message = null;
        java.util.List<java.lang.String> keywords = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        int count = 0;
        boolean deleted = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> shortcut = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> message = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> keywords.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> count = protoInputStream.readInt32();
                case 5 -> deleted = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.QuickReplyAction(shortcut, message, keywords, count, deleted);
    }

    public static int sizeOf(QuickReplyAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var shortcut = protoInputObject.shortcut();
        if (shortcut != null) {
            var shortcut0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(shortcut);
            if (shortcut0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(shortcut0);
            }
        }
        var message = protoInputObject.message();
        if (message != null) {
            var message0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(message);
            if (message0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(message0);
            }
        }
        if (protoInputObject.keywords() != null) {
            for (var keywordsEntry : protoInputObject.keywords()) { 
                if (keywordsEntry != null) {
                    var keywordsEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(keywordsEntry);
                    if (keywordsEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(keywordsEntry0);
                    }
                }
            }
        }
        var count = protoInputObject.count();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(count);
        var deleted = protoInputObject.deleted();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
