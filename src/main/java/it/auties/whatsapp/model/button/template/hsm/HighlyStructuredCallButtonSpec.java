package it.auties.whatsapp.model.button.template.hsm;

import it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredCallButtonSpec {
    public static byte[] encode(HighlyStructuredCallButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredCallButton protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var text = protoInputObject.text();
        if (text != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(text));
            it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(text, protoOutputStream);
        }
        var phoneNumber = protoInputObject.phoneNumber();
        if (phoneNumber != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(phoneNumber));
            it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(phoneNumber, protoOutputStream);
        }
    }

    public static HighlyStructuredCallButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredCallButton decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text = null;
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage phoneNumber = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> text = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> phoneNumber = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredCallButton(text, phoneNumber);
    }

    public static int sizeOf(HighlyStructuredCallButton protoInputObject) {
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
        var phoneNumber = protoInputObject.phoneNumber();
        if (phoneNumber != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var phoneNumberSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(phoneNumber);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(phoneNumberSerializedSize);
            protoOutputSize += phoneNumberSerializedSize;
        }
        return protoOutputSize;
    }

}
