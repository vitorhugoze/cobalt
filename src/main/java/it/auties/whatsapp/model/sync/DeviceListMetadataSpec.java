package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.DeviceListMetadata;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeviceListMetadataSpec {
    public static byte[] encode(DeviceListMetadata protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeviceListMetadata protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var senderKeyHash = protoInputObject.senderKeyHash();
        if (senderKeyHash != null) {
            var senderKeyHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderKeyHash);
            if (senderKeyHash0 != null) {
                protoOutputStream.writeBytes(1, senderKeyHash0);
            }
        }
        var senderTimestamp = protoInputObject.senderTimestamp();
        if (senderTimestamp != null) {
            protoOutputStream.writeUInt64(2, senderTimestamp);
        }
        protoOutputStream.writeUInt32Packed(3, protoInputObject.senderKeyIndexes());
        var recipientKeyHash = protoInputObject.recipientKeyHash();
        if (recipientKeyHash != null) {
            var recipientKeyHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(recipientKeyHash);
            if (recipientKeyHash0 != null) {
                protoOutputStream.writeBytes(8, recipientKeyHash0);
            }
        }
        var recipientTimestamp = protoInputObject.recipientTimestamp();
        if (recipientTimestamp != null) {
            protoOutputStream.writeUInt64(9, recipientTimestamp);
        }
        protoOutputStream.writeUInt32Packed(10, protoInputObject.recipientKeyIndexes());
    }

    public static DeviceListMetadata decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeviceListMetadata decode(ProtobufInputStream protoInputStream) {
        byte[] senderKeyHash = null;
        java.lang.Long senderTimestamp = null;
        java.util.List<java.lang.Integer> senderKeyIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        byte[] recipientKeyHash = null;
        java.lang.Long recipientTimestamp = null;
        java.util.List<java.lang.Integer> recipientKeyIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> senderKeyHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> senderTimestamp = protoInputStream.readInt64();
                case 3 -> senderKeyIndexes.addAll(protoInputStream.readInt32Packed());
                case 8 -> recipientKeyHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 9 -> recipientTimestamp = protoInputStream.readInt64();
                case 10 -> recipientKeyIndexes.addAll(protoInputStream.readInt32Packed());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.DeviceListMetadata(senderKeyHash, senderTimestamp, senderKeyIndexes, recipientKeyHash, recipientTimestamp, recipientKeyIndexes);
    }

    public static int sizeOf(DeviceListMetadata protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var senderKeyHash = protoInputObject.senderKeyHash();
        if (senderKeyHash != null) {
            var senderKeyHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(senderKeyHash);
            if (senderKeyHash0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(senderKeyHash0);
            }
        }
        var senderTimestamp = protoInputObject.senderTimestamp();
        if (senderTimestamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(senderTimestamp);
        }
        protoOutputSize += ProtobufOutputStream.getVarIntPackedSize(3, protoInputObject.senderKeyIndexes());
        var recipientKeyHash = protoInputObject.recipientKeyHash();
        if (recipientKeyHash != null) {
            var recipientKeyHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(recipientKeyHash);
            if (recipientKeyHash0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(recipientKeyHash0);
            }
        }
        var recipientTimestamp = protoInputObject.recipientTimestamp();
        if (recipientTimestamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(recipientTimestamp);
        }
        protoOutputSize += ProtobufOutputStream.getVarIntPackedSize(10, protoInputObject.recipientKeyIndexes());
        return protoOutputSize;
    }

}
