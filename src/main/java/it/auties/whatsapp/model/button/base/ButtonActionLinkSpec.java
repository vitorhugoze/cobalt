package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.ButtonActionLink;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonActionLinkSpec {
    public static byte[] encode(ButtonActionLink protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonActionLink protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputStream.writeString(1, url0);
            }
        }
        var buttonTitle = protoInputObject.buttonTitle();
        if (buttonTitle != null) {
            var buttonTitle0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonTitle);
            if (buttonTitle0 != null) {
                protoOutputStream.writeString(2, buttonTitle0);
            }
        }
    }

    public static ButtonActionLink decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonActionLink decode(ProtobufInputStream protoInputStream) {
        java.lang.String url = null;
        java.lang.String buttonTitle = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> buttonTitle = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.ButtonActionLink(url, buttonTitle);
    }

    public static int sizeOf(ButtonActionLink protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url);
            if (url0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(url0);
            }
        }
        var buttonTitle = protoInputObject.buttonTitle();
        if (buttonTitle != null) {
            var buttonTitle0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buttonTitle);
            if (buttonTitle0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(buttonTitle0);
            }
        }
        return protoOutputSize;
    }

}
