package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredDateTimeSpec {
    public static byte[] encode(HighlyStructuredDateTime protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredDateTime protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var dateComponent = protoInputObject.dateComponent();
        if (dateComponent != null) {
            var dateComponent0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(dateComponent);
            if (dateComponent0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentSpec.sizeOf(dateComponent0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentSpec.encode(dateComponent0, protoOutputStream);
            }
        }
        var dateUnixEpoch = protoInputObject.dateUnixEpoch();
        if (dateUnixEpoch != null) {
            var dateUnixEpoch0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(dateUnixEpoch);
            if (dateUnixEpoch0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpochSpec.sizeOf(dateUnixEpoch0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpochSpec.encode(dateUnixEpoch0, protoOutputStream);
            }
        }
    }

    public static HighlyStructuredDateTime decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredDateTime decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent> dateComponent = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpoch> dateUnixEpoch = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> dateComponent = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> dateUnixEpoch = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpochSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTime(dateComponent, dateUnixEpoch);
    }

    public static int sizeOf(HighlyStructuredDateTime protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var dateComponent = protoInputObject.dateComponent();
        if (dateComponent != null) {
            var dateComponent0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(dateComponent);
            if (dateComponent0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var dateComponentSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentSpec.sizeOf(dateComponent0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(dateComponentSerializedSize);
                protoOutputSize += dateComponentSerializedSize;
            }
        }
        var dateUnixEpoch = protoInputObject.dateUnixEpoch();
        if (dateUnixEpoch != null) {
            var dateUnixEpoch0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(dateUnixEpoch);
            if (dateUnixEpoch0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var dateUnixEpochSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpochSpec.sizeOf(dateUnixEpoch0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(dateUnixEpochSerializedSize);
                protoOutputSize += dateUnixEpochSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
