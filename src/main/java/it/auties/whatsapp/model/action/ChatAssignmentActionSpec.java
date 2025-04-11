package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.ChatAssignmentAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatAssignmentActionSpec {
    public static byte[] encode(ChatAssignmentAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ChatAssignmentAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var deviceAgentId = protoInputObject.deviceAgentId();
        if (deviceAgentId != null) {
            var deviceAgentId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceAgentId);
            if (deviceAgentId0 != null) {
                var deviceAgentId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceAgentId0);
                if (deviceAgentId1 != null) {
                    protoOutputStream.writeString(1, deviceAgentId1);
                }
            }
        }
    }

    public static ChatAssignmentAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ChatAssignmentAction decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<java.lang.String> deviceAgentId = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> deviceAgentId = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.ChatAssignmentAction(deviceAgentId);
    }

    public static int sizeOf(ChatAssignmentAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var deviceAgentId = protoInputObject.deviceAgentId();
        if (deviceAgentId != null) {
            var deviceAgentId0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceAgentId);
            if (deviceAgentId0 != null) {
                var deviceAgentId1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceAgentId0);
                if (deviceAgentId1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(deviceAgentId1);
                }
            }
        }
        return protoOutputSize;
    }

}
