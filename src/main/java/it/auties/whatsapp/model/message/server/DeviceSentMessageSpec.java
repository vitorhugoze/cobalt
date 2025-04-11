package it.auties.whatsapp.model.message.server;

import it.auties.whatsapp.model.message.server.DeviceSentMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeviceSentMessageSpec {
    public static byte[] encode(DeviceSentMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeviceSentMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var destinationJid = protoInputObject.destinationJid();
        if (destinationJid != null) {
            var destinationJid0 = destinationJid.toString();
            if (destinationJid0 != null) {
                var destinationJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(destinationJid0);
                if (destinationJid1 != null) {
                    protoOutputStream.writeString(1, destinationJid1);
                }
            }
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message));
            it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(message, protoOutputStream);
        }
        var phash = protoInputObject.phash();
        if (phash != null) {
            var phash0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(phash);
            if (phash0 != null) {
                var phash1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phash0);
                if (phash1 != null) {
                    protoOutputStream.writeString(3, phash1);
                }
            }
        }
    }

    public static DeviceSentMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeviceSentMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid destinationJid = null;
        it.auties.whatsapp.model.message.model.MessageContainer message = null;
        java.util.Optional<java.lang.String> phash = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> destinationJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> message = it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> phash = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.server.DeviceSentMessage(destinationJid, message, phash);
    }

    public static int sizeOf(DeviceSentMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var destinationJid = protoInputObject.destinationJid();
        if (destinationJid != null) {
            var destinationJid0 = destinationJid.toString();
            if (destinationJid0 != null) {
                var destinationJid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(destinationJid0);
                if (destinationJid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(destinationJid1);
                }
            }
        }
        var message = protoInputObject.message();
        if (message != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var messageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(message);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageSerializedSize);
            protoOutputSize += messageSerializedSize;
        }
        var phash = protoInputObject.phash();
        if (phash != null) {
            var phash0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(phash);
            if (phash0 != null) {
                var phash1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phash0);
                if (phash1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(phash1);
                }
            }
        }
        return protoOutputSize;
    }

}
