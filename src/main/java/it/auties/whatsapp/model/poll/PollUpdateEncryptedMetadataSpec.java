package it.auties.whatsapp.model.poll;

import it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PollUpdateEncryptedMetadataSpec {
    public static byte[] encode(PollUpdateEncryptedMetadata protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PollUpdateEncryptedMetadata protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var payload = protoInputObject.payload();
        if (payload != null) {
            var payload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(payload);
            if (payload0 != null) {
                protoOutputStream.writeBytes(1, payload0);
            }
        }
        var iv = protoInputObject.iv();
        if (iv != null) {
            var iv0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(iv);
            if (iv0 != null) {
                protoOutputStream.writeBytes(2, iv0);
            }
        }
    }

    public static PollUpdateEncryptedMetadata decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PollUpdateEncryptedMetadata decode(ProtobufInputStream protoInputStream) {
        byte[] payload = null;
        byte[] iv = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> payload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> iv = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata(payload, iv);
    }

    public static int sizeOf(PollUpdateEncryptedMetadata protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var payload = protoInputObject.payload();
        if (payload != null) {
            var payload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(payload);
            if (payload0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(payload0);
            }
        }
        var iv = protoInputObject.iv();
        if (iv != null) {
            var iv0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(iv);
            if (iv0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(iv0);
            }
        }
        return protoOutputSize;
    }

}
