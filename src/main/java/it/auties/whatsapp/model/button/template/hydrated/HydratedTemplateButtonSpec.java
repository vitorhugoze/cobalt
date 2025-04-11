package it.auties.whatsapp.model.button.template.hydrated;

import it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HydratedTemplateButtonSpec {
    public static byte[] encode(HydratedTemplateButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HydratedTemplateButton protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var quickReplyButton = protoInputObject.quickReplyButton();
        if (quickReplyButton != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButtonSpec.sizeOf(quickReplyButton));
            it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButtonSpec.encode(quickReplyButton, protoOutputStream);
        }
        var urlButton = protoInputObject.urlButton();
        if (urlButton != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.template.hydrated.HydratedURLButtonSpec.sizeOf(urlButton));
            it.auties.whatsapp.model.button.template.hydrated.HydratedURLButtonSpec.encode(urlButton, protoOutputStream);
        }
        var callButton = protoInputObject.callButton();
        if (callButton != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.button.template.hydrated.HydratedCallButtonSpec.sizeOf(callButton));
            it.auties.whatsapp.model.button.template.hydrated.HydratedCallButtonSpec.encode(callButton, protoOutputStream);
        }
        var index = protoInputObject.index();
        protoOutputStream.writeUInt32(4, index);
    }

    public static HydratedTemplateButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HydratedTemplateButton decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButton quickReplyButton = null;
        it.auties.whatsapp.model.button.template.hydrated.HydratedURLButton urlButton = null;
        it.auties.whatsapp.model.button.template.hydrated.HydratedCallButton callButton = null;
        int index = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> quickReplyButton = it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButtonSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> urlButton = it.auties.whatsapp.model.button.template.hydrated.HydratedURLButtonSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> callButton = it.auties.whatsapp.model.button.template.hydrated.HydratedCallButtonSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> index = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton(quickReplyButton, urlButton, callButton, index);
    }

    public static int sizeOf(HydratedTemplateButton protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var quickReplyButton = protoInputObject.quickReplyButton();
        if (quickReplyButton != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var quickReplyButtonSerializedSize = it.auties.whatsapp.model.button.template.hydrated.HydratedQuickReplyButtonSpec.sizeOf(quickReplyButton);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(quickReplyButtonSerializedSize);
            protoOutputSize += quickReplyButtonSerializedSize;
        }
        var urlButton = protoInputObject.urlButton();
        if (urlButton != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var urlButtonSerializedSize = it.auties.whatsapp.model.button.template.hydrated.HydratedURLButtonSpec.sizeOf(urlButton);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(urlButtonSerializedSize);
            protoOutputSize += urlButtonSerializedSize;
        }
        var callButton = protoInputObject.callButton();
        if (callButton != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var callButtonSerializedSize = it.auties.whatsapp.model.button.template.hydrated.HydratedCallButtonSpec.sizeOf(callButton);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(callButtonSerializedSize);
            protoOutputSize += callButtonSerializedSize;
        }
        var index = protoInputObject.index();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(index);
        return protoOutputSize;
    }

}
