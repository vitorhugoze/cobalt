package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredMessageSpec {
    public static byte[] encode(HighlyStructuredMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var namespace = protoInputObject.namespace();
        if (namespace != null) {
            var namespace0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(namespace);
            if (namespace0 != null) {
                protoOutputStream.writeString(1, namespace0);
            }
        }
        var elementName = protoInputObject.elementName();
        if (elementName != null) {
            var elementName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(elementName);
            if (elementName0 != null) {
                protoOutputStream.writeString(2, elementName0);
            }
        }
        if (protoInputObject.params() != null) {
            for (var paramsEntry : protoInputObject.params()) { 
                if (paramsEntry != null) {
                    var params0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paramsEntry);
                    if (params0 != null) {
                        protoOutputStream.writeString(3, params0);
                    }
                }
            }
        }
        var fallbackLg = protoInputObject.fallbackLg();
        if (fallbackLg != null) {
            var fallbackLg0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fallbackLg);
            if (fallbackLg0 != null) {
                var fallbackLg1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fallbackLg0);
                if (fallbackLg1 != null) {
                    protoOutputStream.writeString(4, fallbackLg1);
                }
            }
        }
        var fallbackLc = protoInputObject.fallbackLc();
        if (fallbackLc != null) {
            var fallbackLc0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fallbackLc);
            if (fallbackLc0 != null) {
                var fallbackLc1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fallbackLc0);
                if (fallbackLc1 != null) {
                    protoOutputStream.writeString(5, fallbackLc1);
                }
            }
        }
        if (protoInputObject.localizableParameters() != null) {
            for (var localizableParametersEntry : protoInputObject.localizableParameters()) { 
                if (localizableParametersEntry != null) {
                    protoOutputStream.writeMessage(6, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameterSpec.sizeOf(localizableParametersEntry));
                    it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameterSpec.encode(localizableParametersEntry, protoOutputStream);
                }
            }
        }
        var deterministicLg = protoInputObject.deterministicLg();
        if (deterministicLg != null) {
            var deterministicLg0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deterministicLg);
            if (deterministicLg0 != null) {
                var deterministicLg1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deterministicLg0);
                if (deterministicLg1 != null) {
                    protoOutputStream.writeString(7, deterministicLg1);
                }
            }
        }
        var deterministicLc = protoInputObject.deterministicLc();
        if (deterministicLc != null) {
            var deterministicLc0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deterministicLc);
            if (deterministicLc0 != null) {
                var deterministicLc1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deterministicLc0);
                if (deterministicLc1 != null) {
                    protoOutputStream.writeString(8, deterministicLc1);
                }
            }
        }
        var templateMessage = protoInputObject.templateMessage();
        if (templateMessage != null) {
            protoOutputStream.writeMessage(9, it.auties.whatsapp.model.message.button.TemplateMessageSpec.sizeOf(templateMessage));
            it.auties.whatsapp.model.message.button.TemplateMessageSpec.encode(templateMessage, protoOutputStream);
        }
    }

    public static HighlyStructuredMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.String namespace = null;
        java.lang.String elementName = null;
        java.util.List<java.lang.String> params = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.util.Optional<java.lang.String> fallbackLg = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> fallbackLc = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.List<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameter> localizableParameters = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.util.Optional<java.lang.String> deterministicLg = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> deterministicLc = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.message.button.TemplateMessage templateMessage = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> namespace = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> elementName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> params.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 4 -> fallbackLg = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> fallbackLc = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 6 -> localizableParameters.add(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameterSpec.decode(protoInputStream.readLengthDelimited()));
                case 7 -> deterministicLg = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 8 -> deterministicLc = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 9 -> templateMessage = it.auties.whatsapp.model.message.button.TemplateMessageSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage(namespace, elementName, params, fallbackLg, fallbackLc, localizableParameters, deterministicLg, deterministicLc, templateMessage);
    }

    public static int sizeOf(HighlyStructuredMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var namespace = protoInputObject.namespace();
        if (namespace != null) {
            var namespace0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(namespace);
            if (namespace0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(namespace0);
            }
        }
        var elementName = protoInputObject.elementName();
        if (elementName != null) {
            var elementName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(elementName);
            if (elementName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(elementName0);
            }
        }
        if (protoInputObject.params() != null) {
            for (var paramsEntry : protoInputObject.params()) { 
                if (paramsEntry != null) {
                    var paramsEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paramsEntry);
                    if (paramsEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(paramsEntry0);
                    }
                }
            }
        }
        var fallbackLg = protoInputObject.fallbackLg();
        if (fallbackLg != null) {
            var fallbackLg0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fallbackLg);
            if (fallbackLg0 != null) {
                var fallbackLg1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fallbackLg0);
                if (fallbackLg1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(fallbackLg1);
                }
            }
        }
        var fallbackLc = protoInputObject.fallbackLc();
        if (fallbackLc != null) {
            var fallbackLc0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(fallbackLc);
            if (fallbackLc0 != null) {
                var fallbackLc1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fallbackLc0);
                if (fallbackLc1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(fallbackLc1);
                }
            }
        }
        if (protoInputObject.localizableParameters() != null) {
            for (var localizableParametersEntry : protoInputObject.localizableParameters()) { 
                if (localizableParametersEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    var localizableParametersEntrySerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredLocalizableParameterSpec.sizeOf(localizableParametersEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(localizableParametersEntrySerializedSize);
                    protoOutputSize += localizableParametersEntrySerializedSize;
                }
            }
        }
        var deterministicLg = protoInputObject.deterministicLg();
        if (deterministicLg != null) {
            var deterministicLg0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deterministicLg);
            if (deterministicLg0 != null) {
                var deterministicLg1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deterministicLg0);
                if (deterministicLg1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(deterministicLg1);
                }
            }
        }
        var deterministicLc = protoInputObject.deterministicLc();
        if (deterministicLc != null) {
            var deterministicLc0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deterministicLc);
            if (deterministicLc0 != null) {
                var deterministicLc1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deterministicLc0);
                if (deterministicLc1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(deterministicLc1);
                }
            }
        }
        var templateMessage = protoInputObject.templateMessage();
        if (templateMessage != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
            var templateMessageSerializedSize = it.auties.whatsapp.model.message.button.TemplateMessageSpec.sizeOf(templateMessage);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(templateMessageSerializedSize);
            protoOutputSize += templateMessageSerializedSize;
        }
        return protoOutputSize;
    }

}
