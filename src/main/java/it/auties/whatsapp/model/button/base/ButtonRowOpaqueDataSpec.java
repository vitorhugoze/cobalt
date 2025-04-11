package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.ButtonRowOpaqueData;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonRowOpaqueDataSpec {
    public static byte[] encode(ButtonRowOpaqueData protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonRowOpaqueData protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var currentMessage = protoInputObject.currentMessage();
        if (currentMessage != null) {
            var currentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(currentMessage);
            if (currentMessage0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.sizeOf(currentMessage0));
                it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.encode(currentMessage0, protoOutputStream);
            }
        }
        var quotedMessage = protoInputObject.quotedMessage();
        if (quotedMessage != null) {
            var quotedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessage);
            if (quotedMessage0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.sizeOf(quotedMessage0));
                it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.encode(quotedMessage0, protoOutputStream);
            }
        }
    }

    public static ButtonRowOpaqueData decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonRowOpaqueData decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.button.base.ButtonOpaqueData> currentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.base.ButtonOpaqueData> quotedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> currentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> quotedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.ButtonRowOpaqueData(currentMessage, quotedMessage);
    }

    public static int sizeOf(ButtonRowOpaqueData protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var currentMessage = protoInputObject.currentMessage();
        if (currentMessage != null) {
            var currentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(currentMessage);
            if (currentMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var currentMessageSerializedSize = it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.sizeOf(currentMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(currentMessageSerializedSize);
                protoOutputSize += currentMessageSerializedSize;
            }
        }
        var quotedMessage = protoInputObject.quotedMessage();
        if (quotedMessage != null) {
            var quotedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quotedMessage);
            if (quotedMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var quotedMessageSerializedSize = it.auties.whatsapp.model.button.base.ButtonOpaqueDataSpec.sizeOf(quotedMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(quotedMessageSerializedSize);
                protoOutputSize += quotedMessageSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
