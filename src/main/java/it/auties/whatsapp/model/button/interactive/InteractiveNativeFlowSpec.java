package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveNativeFlowSpec {
    public static byte[] encode(InteractiveNativeFlow protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveNativeFlow protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.buttons() != null) {
            for (var buttonsEntry : protoInputObject.buttons()) { 
                if (buttonsEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.interactive.InteractiveButtonSpec.sizeOf(buttonsEntry));
                    it.auties.whatsapp.model.button.interactive.InteractiveButtonSpec.encode(buttonsEntry, protoOutputStream);
                }
            }
        }
        var parameters = protoInputObject.parameters();
        if (parameters != null) {
            var parameters0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(parameters);
            if (parameters0 != null) {
                protoOutputStream.writeString(2, parameters0);
            }
        }
        var version = protoInputObject.version();
        protoOutputStream.writeInt32(3, version);
    }

    public static InteractiveNativeFlow decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveNativeFlow decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.button.interactive.InteractiveButton> buttons = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.String parameters = null;
        int version = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> buttons.add(it.auties.whatsapp.model.button.interactive.InteractiveButtonSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> parameters = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> version = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractiveNativeFlow(buttons, parameters, version);
    }

    public static int sizeOf(InteractiveNativeFlow protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.buttons() != null) {
            for (var buttonsEntry : protoInputObject.buttons()) { 
                if (buttonsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var buttonsEntrySerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveButtonSpec.sizeOf(buttonsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(buttonsEntrySerializedSize);
                    protoOutputSize += buttonsEntrySerializedSize;
                }
            }
        }
        var parameters = protoInputObject.parameters();
        if (parameters != null) {
            var parameters0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(parameters);
            if (parameters0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(parameters0);
            }
        }
        var version = protoInputObject.version();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        return protoOutputSize;
    }

}
