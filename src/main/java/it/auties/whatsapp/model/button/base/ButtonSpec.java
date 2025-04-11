package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.Button;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonSpec {
    public static byte[] encode(Button protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Button protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var bodyText = protoInputObject.bodyText();
        if (bodyText != null) {
            var bodyText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(bodyText);
            if (bodyText0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.base.ButtonTextSpec.sizeOf(bodyText0));
                it.auties.whatsapp.model.button.base.ButtonTextSpec.encode(bodyText0, protoOutputStream);
            }
        }
        var bodyNativeFlow = protoInputObject.bodyNativeFlow();
        if (bodyNativeFlow != null) {
            var bodyNativeFlow0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(bodyNativeFlow);
            if (bodyNativeFlow0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.info.NativeFlowInfoSpec.sizeOf(bodyNativeFlow0));
                it.auties.whatsapp.model.info.NativeFlowInfoSpec.encode(bodyNativeFlow0, protoOutputStream);
            }
        }
        var bodyType = protoInputObject.bodyType();
        if (bodyType != null) {
            var bodyType0 = it.auties.whatsapp.model.button.base.ButtonBodyTypeSpec.encode(bodyType);
            protoOutputStream.writeInt32(3, bodyType0);
        }
    }

    public static Button decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Button decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        java.util.Optional<it.auties.whatsapp.model.button.base.ButtonText> bodyText = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.info.NativeFlowInfo> bodyNativeFlow = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.button.base.ButtonBody.Type bodyType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> bodyText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.base.ButtonTextSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> bodyNativeFlow = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.info.NativeFlowInfoSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> bodyType = it.auties.whatsapp.model.button.base.ButtonBodyTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.Button(id, bodyText, bodyNativeFlow, bodyType);
    }

    public static int sizeOf(Button protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var bodyText = protoInputObject.bodyText();
        if (bodyText != null) {
            var bodyText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(bodyText);
            if (bodyText0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var bodyTextSerializedSize = it.auties.whatsapp.model.button.base.ButtonTextSpec.sizeOf(bodyText0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(bodyTextSerializedSize);
                protoOutputSize += bodyTextSerializedSize;
            }
        }
        var bodyNativeFlow = protoInputObject.bodyNativeFlow();
        if (bodyNativeFlow != null) {
            var bodyNativeFlow0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(bodyNativeFlow);
            if (bodyNativeFlow0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var bodyNativeFlowSerializedSize = it.auties.whatsapp.model.info.NativeFlowInfoSpec.sizeOf(bodyNativeFlow0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(bodyNativeFlowSerializedSize);
                protoOutputSize += bodyNativeFlowSerializedSize;
            }
        }
        var bodyType = protoInputObject.bodyType();
        if (bodyType != null) {
            var bodyType0 = it.auties.whatsapp.model.button.base.ButtonBodyTypeSpec.encode(bodyType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(bodyType0);
        }
        return protoOutputSize;
    }

}
