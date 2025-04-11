package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.DeviceContextInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeviceContextInfoSpec {
    public static byte[] encode(DeviceContextInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeviceContextInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var deviceListMetadata = protoInputObject.deviceListMetadata();
        if (deviceListMetadata != null) {
            var deviceListMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceListMetadata);
            if (deviceListMetadata0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.DeviceListMetadataSpec.sizeOf(deviceListMetadata0));
                it.auties.whatsapp.model.sync.DeviceListMetadataSpec.encode(deviceListMetadata0, protoOutputStream);
            }
        }
        var deviceListMetadataVersion = protoInputObject.deviceListMetadataVersion();
        protoOutputStream.writeInt32(2, deviceListMetadataVersion);
        var paddingBytes = protoInputObject.paddingBytes();
        if (paddingBytes != null) {
            var paddingBytes0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paddingBytes);
            if (paddingBytes0 != null) {
                var paddingBytes1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paddingBytes0);
                if (paddingBytes1 != null) {
                    protoOutputStream.writeBytes(4, paddingBytes1);
                }
            }
        }
        var messageSecret = protoInputObject.messageSecret();
        if (messageSecret != null) {
            var messageSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageSecret);
            if (messageSecret0 != null) {
                var messageSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageSecret0);
                if (messageSecret1 != null) {
                    protoOutputStream.writeBytes(3, messageSecret1);
                }
            }
        }
    }

    public static DeviceContextInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeviceContextInfo decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.DeviceListMetadata deviceListMetadata = null;
        int deviceListMetadataVersion = 0;
        byte[] paddingBytes = null;
        byte[] messageSecret = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> deviceListMetadata = it.auties.whatsapp.model.sync.DeviceListMetadataSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> deviceListMetadataVersion = protoInputStream.readInt32();
                case 4 -> paddingBytes = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> messageSecret = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.DeviceContextInfo(deviceListMetadata, deviceListMetadataVersion, paddingBytes, messageSecret);
    }

    public static int sizeOf(DeviceContextInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var deviceListMetadata = protoInputObject.deviceListMetadata();
        if (deviceListMetadata != null) {
            var deviceListMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceListMetadata);
            if (deviceListMetadata0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var deviceListMetadataSerializedSize = it.auties.whatsapp.model.sync.DeviceListMetadataSpec.sizeOf(deviceListMetadata0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceListMetadataSerializedSize);
                protoOutputSize += deviceListMetadataSerializedSize;
            }
        }
        var deviceListMetadataVersion = protoInputObject.deviceListMetadataVersion();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceListMetadataVersion);
        var paddingBytes = protoInputObject.paddingBytes();
        if (paddingBytes != null) {
            var paddingBytes0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paddingBytes);
            if (paddingBytes0 != null) {
                var paddingBytes1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paddingBytes0);
                if (paddingBytes1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(paddingBytes1);
                }
            }
        }
        var messageSecret = protoInputObject.messageSecret();
        if (messageSecret != null) {
            var messageSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageSecret);
            if (messageSecret0 != null) {
                var messageSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageSecret0);
                if (messageSecret1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(messageSecret1);
                }
            }
        }
        return protoOutputSize;
    }

}
