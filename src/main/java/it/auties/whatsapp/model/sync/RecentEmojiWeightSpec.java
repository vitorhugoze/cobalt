package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.RecentEmojiWeight;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class RecentEmojiWeightSpec {
    public static byte[] encode(RecentEmojiWeight protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(RecentEmojiWeight protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var emoji = protoInputObject.emoji();
        if (emoji != null) {
            var emoji0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(emoji);
            if (emoji0 != null) {
                protoOutputStream.writeString(1, emoji0);
            }
        }
        var weight = protoInputObject.weight();
        if (weight != null) {
            protoOutputStream.writeFloat(2, weight);
        }
    }

    public static RecentEmojiWeight decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static RecentEmojiWeight decode(ProtobufInputStream protoInputStream) {
        java.lang.String emoji = null;
        java.lang.Float weight = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> emoji = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> weight = protoInputStream.readFloat();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.RecentEmojiWeight(emoji, weight);
    }

    public static int sizeOf(RecentEmojiWeight protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var emoji = protoInputObject.emoji();
        if (emoji != null) {
            var emoji0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(emoji);
            if (emoji0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(emoji0);
            }
        }
        var weight = protoInputObject.weight();
        if (weight != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 5);
            protoOutputSize += 4;
        }
        return protoOutputSize;
    }

}
