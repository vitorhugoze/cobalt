package it.auties.whatsapp.model.message.server;

import it.auties.whatsapp.model.message.server.DeviceSyncMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeviceSyncMessageSpec {
    public static byte[] encode(DeviceSyncMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeviceSyncMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var serializedXmlBytes = protoInputObject.serializedXmlBytes();
        if (serializedXmlBytes != null) {
            var serializedXmlBytes0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(serializedXmlBytes);
            if (serializedXmlBytes0 != null) {
                protoOutputStream.writeBytes(1, serializedXmlBytes0);
            }
        }
    }

    public static DeviceSyncMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeviceSyncMessage decode(ProtobufInputStream protoInputStream) {
        byte[] serializedXmlBytes = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> serializedXmlBytes = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.server.DeviceSyncMessage(serializedXmlBytes);
    }

    public static int sizeOf(DeviceSyncMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var serializedXmlBytes = protoInputObject.serializedXmlBytes();
        if (serializedXmlBytes != null) {
            var serializedXmlBytes0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(serializedXmlBytes);
            if (serializedXmlBytes0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(serializedXmlBytes0);
            }
        }
        return protoOutputSize;
    }

}
