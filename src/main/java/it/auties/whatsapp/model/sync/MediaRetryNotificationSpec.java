package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.MediaRetryNotification;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MediaRetryNotificationSpec {
    public static byte[] encode(MediaRetryNotification protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MediaRetryNotification protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var stanzaId = protoInputObject.stanzaId();
        if (stanzaId != null) {
            var stanzaId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(stanzaId);
            if (stanzaId0 != null) {
                protoOutputStream.writeString(1, stanzaId0);
            }
        }
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(directPath);
            if (directPath0 != null) {
                var directPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath0);
                if (directPath1 != null) {
                    protoOutputStream.writeString(2, directPath1);
                }
            }
        }
        var result = protoInputObject.result();
        if (result != null) {
            var result0 = it.auties.whatsapp.model.sync.MediaRetryNotificationMediaRetryNotificationResultTypeSpec.encode(result);
            protoOutputStream.writeInt32(3, result0);
        }
    }

    public static MediaRetryNotification decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MediaRetryNotification decode(ProtobufInputStream protoInputStream) {
        java.lang.String stanzaId = null;
        java.util.Optional<java.lang.String> directPath = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.sync.MediaRetryNotification.MediaRetryNotificationResultType result = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> stanzaId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> directPath = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> result = it.auties.whatsapp.model.sync.MediaRetryNotificationMediaRetryNotificationResultTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.MediaRetryNotification(stanzaId, directPath, result);
    }

    public static int sizeOf(MediaRetryNotification protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var stanzaId = protoInputObject.stanzaId();
        if (stanzaId != null) {
            var stanzaId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(stanzaId);
            if (stanzaId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(stanzaId0);
            }
        }
        var directPath = protoInputObject.directPath();
        if (directPath != null) {
            var directPath0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(directPath);
            if (directPath0 != null) {
                var directPath1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(directPath0);
                if (directPath1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(directPath1);
                }
            }
        }
        var result = protoInputObject.result();
        if (result != null) {
            var result0 = it.auties.whatsapp.model.sync.MediaRetryNotificationMediaRetryNotificationResultTypeSpec.encode(result);
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(result0);
        }
        return protoOutputSize;
    }

}
