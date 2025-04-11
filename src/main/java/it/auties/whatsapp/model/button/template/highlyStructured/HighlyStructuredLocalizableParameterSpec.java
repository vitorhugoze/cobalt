package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameter;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredLocalizableParameterSpec {
    public static byte[] encode(HighlyStructuredLocalizableParameter protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredLocalizableParameter protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var defaultValue = protoInputObject.defaultValue();
        if (defaultValue != null) {
            var defaultValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(defaultValue);
            if (defaultValue0 != null) {
                protoOutputStream.writeString(1, defaultValue0);
            }
        }
        var parameterCurrency = protoInputObject.parameterCurrency();
        if (parameterCurrency != null) {
            var parameterCurrency0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parameterCurrency);
            if (parameterCurrency0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrencySpec.sizeOf(parameterCurrency0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrencySpec.encode(parameterCurrency0, protoOutputStream);
            }
        }
        var parameterDateTime = protoInputObject.parameterDateTime();
        if (parameterDateTime != null) {
            var parameterDateTime0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parameterDateTime);
            if (parameterDateTime0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeSpec.sizeOf(parameterDateTime0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeSpec.encode(parameterDateTime0, protoOutputStream);
            }
        }
    }

    public static HighlyStructuredLocalizableParameter decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredLocalizableParameter decode(ProtobufInputStream protoInputStream) {
        java.lang.String defaultValue = null;
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrency> parameterCurrency = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime> parameterDateTime = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> defaultValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> parameterCurrency = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrencySpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> parameterDateTime = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameter(defaultValue, parameterCurrency, parameterDateTime);
    }

    public static int sizeOf(HighlyStructuredLocalizableParameter protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var defaultValue = protoInputObject.defaultValue();
        if (defaultValue != null) {
            var defaultValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(defaultValue);
            if (defaultValue0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(defaultValue0);
            }
        }
        var parameterCurrency = protoInputObject.parameterCurrency();
        if (parameterCurrency != null) {
            var parameterCurrency0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parameterCurrency);
            if (parameterCurrency0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var parameterCurrencySerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredCurrencySpec.sizeOf(parameterCurrency0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(parameterCurrencySerializedSize);
                protoOutputSize += parameterCurrencySerializedSize;
            }
        }
        var parameterDateTime = protoInputObject.parameterDateTime();
        if (parameterDateTime != null) {
            var parameterDateTime0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(parameterDateTime);
            if (parameterDateTime0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var parameterDateTimeSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeSpec.sizeOf(parameterDateTime0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(parameterDateTimeSerializedSize);
                protoOutputSize += parameterDateTimeSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
