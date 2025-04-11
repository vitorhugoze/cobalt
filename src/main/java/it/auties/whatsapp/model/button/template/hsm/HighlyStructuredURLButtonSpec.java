package it.auties.whatsapp.model.button.template.hsm;

import it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredURLButtonSpec {
    public static byte[] encode(HighlyStructuredURLButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredURLButton protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var text = protoInputObject.text();
        if (text != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(text));
            it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(text, protoOutputStream);
        }
        var url = protoInputObject.url();
        if (url != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(url));
            it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(url, protoOutputStream);
        }
    }

    public static HighlyStructuredURLButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredURLButton decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text = null;
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage url = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> text = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> url = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton(text, url);
    }

    public static int sizeOf(HighlyStructuredURLButton protoInputObject) {
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
        var url = protoInputObject.url();
        if (url != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var urlSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(url);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(urlSerializedSize);
            protoOutputSize += urlSerializedSize;
        }
        return protoOutputSize;
    }

}
