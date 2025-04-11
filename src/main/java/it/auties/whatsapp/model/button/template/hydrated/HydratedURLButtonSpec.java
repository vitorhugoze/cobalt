package it.auties.whatsapp.model.button.template.hydrated;

import it.auties.whatsapp.model.button.template.hydrated.HydratedURLButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HydratedURLButtonSpec {
    public static byte[] encode(HydratedURLButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HydratedURLButton protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputStream.writeString(1, text0);
            }
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputStream.writeString(2, url0);
            }
        }
    }

    public static HydratedURLButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HydratedURLButton decode(ProtobufInputStream protoInputStream) {
        java.lang.String text = null;
        java.lang.String url = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedURLButton(text, url);
    }

    public static int sizeOf(HydratedURLButton protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(text0);
            }
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(url0);
            }
        }
        return protoOutputSize;
    }

}
