package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.ButtonText;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonTextSpec {
    public static byte[] encode(ButtonText protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonText protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var content = protoInputObject.content();
        if (content != null) {
            var content0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(content);
            if (content0 != null) {
                protoOutputStream.writeString(1, content0);
            }
        }
    }

    public static ButtonText decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonText decode(ProtobufInputStream protoInputStream) {
        java.lang.String content = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> content = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.ButtonText(content);
    }

    public static int sizeOf(ButtonText protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var content = protoInputObject.content();
        if (content != null) {
            var content0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(content);
            if (content0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(content0);
            }
        }
        return protoOutputSize;
    }

}
