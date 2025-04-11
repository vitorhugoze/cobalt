package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.NativeFlowResponseMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NativeFlowResponseMessageSpec {
    public static byte[] encode(NativeFlowResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NativeFlowResponseMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(1, name0);
            }
        }
        var paramsJson = protoInputObject.paramsJson();
        if (paramsJson != null) {
            var paramsJson0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paramsJson);
            if (paramsJson0 != null) {
                protoOutputStream.writeString(2, paramsJson0);
            }
        }
        var version = protoInputObject.version();
        protoOutputStream.writeInt32(3, version);
    }

    public static NativeFlowResponseMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NativeFlowResponseMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String name = null;
        java.lang.String paramsJson = null;
        int version = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> paramsJson = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> version = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.NativeFlowResponseMessage(name, paramsJson, version);
    }

    public static int sizeOf(NativeFlowResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        var paramsJson = protoInputObject.paramsJson();
        if (paramsJson != null) {
            var paramsJson0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paramsJson);
            if (paramsJson0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(paramsJson0);
            }
        }
        var version = protoInputObject.version();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        return protoOutputSize;
    }

}
