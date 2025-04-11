package it.auties.whatsapp.model.mobile;

import it.auties.whatsapp.model.mobile.CountryLocale;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CountryLocaleSpec {
    public static byte[] encode(CountryLocale protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CountryLocale protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var languageValue = protoInputObject.languageValue();
        if (languageValue != null) {
            var languageValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(languageValue);
            if (languageValue0 != null) {
                protoOutputStream.writeString(1, languageValue0);
            }
        }
        var languageCode = protoInputObject.languageCode();
        if (languageCode != null) {
            var languageCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(languageCode);
            if (languageCode0 != null) {
                protoOutputStream.writeString(2, languageCode0);
            }
        }
        var separator = protoInputObject.separator();
        if (separator != null) {
            var separator0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(separator);
            if (separator0 != null) {
                protoOutputStream.writeString(3, separator0);
            }
        }
    }

    public static CountryLocale decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CountryLocale decode(ProtobufInputStream protoInputStream) {
        java.lang.String languageValue = null;
        java.lang.String languageCode = null;
        java.lang.String separator = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> languageValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> languageCode = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> separator = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.mobile.CountryLocale(languageValue, languageCode, separator);
    }

    public static int sizeOf(CountryLocale protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var languageValue = protoInputObject.languageValue();
        if (languageValue != null) {
            var languageValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(languageValue);
            if (languageValue0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(languageValue0);
            }
        }
        var languageCode = protoInputObject.languageCode();
        if (languageCode != null) {
            var languageCode0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(languageCode);
            if (languageCode0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(languageCode0);
            }
        }
        var separator = protoInputObject.separator();
        if (separator != null) {
            var separator0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(separator);
            if (separator0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(separator0);
            }
        }
        return protoOutputSize;
    }

}
