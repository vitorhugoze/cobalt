package it.auties.whatsapp.model.message.button;

import it.auties.whatsapp.model.message.button.InteractiveResponseMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveResponseMessageSpec {
    public static byte[] encode(InteractiveResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveResponseMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var body = protoInputObject.body();
        if (body != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.sizeOf(body));
            it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.encode(body, protoOutputStream);
        }
        var nativeFlowResponseMessage = protoInputObject.nativeFlowResponseMessage();
        if (nativeFlowResponseMessage != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.button.NativeFlowResponseMessageSpec.sizeOf(nativeFlowResponseMessage));
            it.auties.whatsapp.model.message.button.NativeFlowResponseMessageSpec.encode(nativeFlowResponseMessage, protoOutputStream);
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(15, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
    }

    public static InteractiveResponseMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveResponseMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.interactive.InteractiveBody body = null;
        it.auties.whatsapp.model.message.button.NativeFlowResponseMessage nativeFlowResponseMessage = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> body = it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> nativeFlowResponseMessage = it.auties.whatsapp.model.message.button.NativeFlowResponseMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 15 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.button.InteractiveResponseMessage(body, nativeFlowResponseMessage, contextInfo);
    }

    public static int sizeOf(InteractiveResponseMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var body = protoInputObject.body();
        if (body != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var bodySerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveBodySpec.sizeOf(body);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(bodySerializedSize);
            protoOutputSize += bodySerializedSize;
        }
        var nativeFlowResponseMessage = protoInputObject.nativeFlowResponseMessage();
        if (nativeFlowResponseMessage != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var nativeFlowResponseMessageSerializedSize = it.auties.whatsapp.model.message.button.NativeFlowResponseMessageSpec.sizeOf(nativeFlowResponseMessage);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(nativeFlowResponseMessageSerializedSize);
            protoOutputSize += nativeFlowResponseMessageSerializedSize;
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
