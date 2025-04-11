package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.LocaleSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class LocaleSettingsSpec {
    public static byte[] encode(LocaleSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(LocaleSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var locale = protoInputObject.locale();
        if (locale != null) {
            var locale0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(locale);
            if (locale0 != null) {
                protoOutputStream.writeString(1, locale0);
            }
        }
    }

    public static LocaleSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static LocaleSettings decode(ProtobufInputStream protoInputStream) {
        java.lang.String locale = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> locale = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.LocaleSettings(locale);
    }

    public static int sizeOf(LocaleSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var locale = protoInputObject.locale();
        if (locale != null) {
            var locale0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(locale);
            if (locale0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(locale0);
            }
        }
        return protoOutputSize;
    }

}
