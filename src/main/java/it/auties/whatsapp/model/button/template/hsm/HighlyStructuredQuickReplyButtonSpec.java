package it.auties.whatsapp.model.button.template.hsm;

import it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredQuickReplyButtonSpec {
    public static byte[] encode(HighlyStructuredQuickReplyButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredQuickReplyButton protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var text = protoInputObject.text();
        if (text != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(text));
            it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(text, protoOutputStream);
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(2, id0);
            }
        }
    }

    public static HighlyStructuredQuickReplyButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredQuickReplyButton decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text = null;
        java.lang.String id = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> text = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredQuickReplyButton(text, id);
    }

    public static int sizeOf(HighlyStructuredQuickReplyButton protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var text = protoInputObject.text();
        if (text != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var textSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(text);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(textSerializedSize);
            protoOutputSize += textSerializedSize;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        return protoOutputSize;
    }

}
