package it.auties.whatsapp.model.message.server;

import it.auties.whatsapp.model.message.server.SenderKeyDistributionMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderKeyDistributionMessageSpec {
    public static byte[] encode(SenderKeyDistributionMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderKeyDistributionMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var groupId = protoInputObject.groupId();
        if (groupId != null) {
            var groupId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupId);
            if (groupId0 != null) {
                protoOutputStream.writeString(1, groupId0);
            }
        }
        var data = protoInputObject.data();
        if (data != null) {
            var data0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(data);
            if (data0 != null) {
                protoOutputStream.writeBytes(2, data0);
            }
        }
    }

    public static SenderKeyDistributionMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderKeyDistributionMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String groupId = null;
        byte[] data = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> groupId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> data = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.server.SenderKeyDistributionMessage(groupId, data);
    }

    public static int sizeOf(SenderKeyDistributionMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var groupId = protoInputObject.groupId();
        if (groupId != null) {
            var groupId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(groupId);
            if (groupId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(groupId0);
            }
        }
        var data = protoInputObject.data();
        if (data != null) {
            var data0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(data);
            if (data0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(data0);
            }
        }
        return protoOutputSize;
    }

}
