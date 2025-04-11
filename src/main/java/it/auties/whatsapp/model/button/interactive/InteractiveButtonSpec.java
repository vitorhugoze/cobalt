package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveButtonSpec {
    public static byte[] encode(InteractiveButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveButton protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var parameters = protoInputObject.parameters();
        if (parameters != null) {
            var parameters0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parameters);
            if (parameters0 != null) {
                var parameters1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(parameters0);
                if (parameters1 != null) {
                    protoOutputStream.writeString(2, parameters1);
                }
            }
        }
    }

    public static InteractiveButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveButton decode(ProtobufInputStream protoInputStream) {
        java.lang.String name = null;
        java.util.Optional<java.lang.String> parameters = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> parameters = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractiveButton(name, parameters);
    }

    public static int sizeOf(InteractiveButton protoInputObject) {
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
        var parameters = protoInputObject.parameters();
        if (parameters != null) {
            var parameters0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parameters);
            if (parameters0 != null) {
                var parameters1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(parameters0);
                if (parameters1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(parameters1);
                }
            }
        }
        return protoOutputSize;
    }

}
