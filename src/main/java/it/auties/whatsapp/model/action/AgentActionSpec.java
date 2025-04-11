package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.AgentAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AgentActionSpec {
    public static byte[] encode(AgentAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AgentAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(name);
            if (name0 != null) {
                var name1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name0);
                if (name1 != null) {
                    protoOutputStream.writeString(1, name1);
                }
            }
        }
        var deviceId = protoInputObject.deviceId();
        protoOutputStream.writeInt32(2, deviceId);
        var deleted = protoInputObject.deleted();
        protoOutputStream.writeBool(3, deleted);
    }

    public static AgentAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AgentAction decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<java.lang.String> name = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        int deviceId = 0;
        boolean deleted = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> deviceId = protoInputStream.readInt32();
                case 3 -> deleted = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.AgentAction(name, deviceId, deleted);
    }

    public static int sizeOf(AgentAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(name);
            if (name0 != null) {
                var name1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name0);
                if (name1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(name1);
                }
            }
        }
        var deviceId = protoInputObject.deviceId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceId);
        var deleted = protoInputObject.deleted();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
