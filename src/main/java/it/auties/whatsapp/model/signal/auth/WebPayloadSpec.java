package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.WebPayload;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class WebPayloadSpec {
    public static byte[] encode(WebPayload protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(WebPayload protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var usesParticipantInKey = protoInputObject.usesParticipantInKey();
        protoOutputStream.writeBool(1, usesParticipantInKey);
        var supportsStarredMessages = protoInputObject.supportsStarredMessages();
        protoOutputStream.writeBool(2, supportsStarredMessages);
        var supportsDocumentMessages = protoInputObject.supportsDocumentMessages();
        protoOutputStream.writeBool(3, supportsDocumentMessages);
        var supportsUrlMessages = protoInputObject.supportsUrlMessages();
        protoOutputStream.writeBool(4, supportsUrlMessages);
        var supportsMediaRetry = protoInputObject.supportsMediaRetry();
        protoOutputStream.writeBool(5, supportsMediaRetry);
        var supportsE2EImage = protoInputObject.supportsE2EImage();
        protoOutputStream.writeBool(6, supportsE2EImage);
        var supportsE2EVideo = protoInputObject.supportsE2EVideo();
        protoOutputStream.writeBool(7, supportsE2EVideo);
        var supportsE2EAudio = protoInputObject.supportsE2EAudio();
        protoOutputStream.writeBool(8, supportsE2EAudio);
        var supportsE2EDocument = protoInputObject.supportsE2EDocument();
        protoOutputStream.writeBool(9, supportsE2EDocument);
        var documentTypes = protoInputObject.documentTypes();
        if (documentTypes != null) {
            var documentTypes0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(documentTypes);
            if (documentTypes0 != null) {
                protoOutputStream.writeString(10, documentTypes0);
            }
        }
        var features = protoInputObject.features();
        if (features != null) {
            var features0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(features);
            if (features0 != null) {
                protoOutputStream.writeBytes(11, features0);
            }
        }
    }

    public static WebPayload decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static WebPayload decode(ProtobufInputStream protoInputStream) {
        boolean usesParticipantInKey = false;
        boolean supportsStarredMessages = false;
        boolean supportsDocumentMessages = false;
        boolean supportsUrlMessages = false;
        boolean supportsMediaRetry = false;
        boolean supportsE2EImage = false;
        boolean supportsE2EVideo = false;
        boolean supportsE2EAudio = false;
        boolean supportsE2EDocument = false;
        java.lang.String documentTypes = null;
        byte[] features = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> usesParticipantInKey = protoInputStream.readBool();
                case 2 -> supportsStarredMessages = protoInputStream.readBool();
                case 3 -> supportsDocumentMessages = protoInputStream.readBool();
                case 4 -> supportsUrlMessages = protoInputStream.readBool();
                case 5 -> supportsMediaRetry = protoInputStream.readBool();
                case 6 -> supportsE2EImage = protoInputStream.readBool();
                case 7 -> supportsE2EVideo = protoInputStream.readBool();
                case 8 -> supportsE2EAudio = protoInputStream.readBool();
                case 9 -> supportsE2EDocument = protoInputStream.readBool();
                case 10 -> documentTypes = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 11 -> features = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.WebPayload(usesParticipantInKey, supportsStarredMessages, supportsDocumentMessages, supportsUrlMessages, supportsMediaRetry, supportsE2EImage, supportsE2EVideo, supportsE2EAudio, supportsE2EDocument, documentTypes, features);
    }

    public static int sizeOf(WebPayload protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var usesParticipantInKey = protoInputObject.usesParticipantInKey();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var supportsStarredMessages = protoInputObject.supportsStarredMessages();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += 1;
        var supportsDocumentMessages = protoInputObject.supportsDocumentMessages();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += 1;
        var supportsUrlMessages = protoInputObject.supportsUrlMessages();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += 1;
        var supportsMediaRetry = protoInputObject.supportsMediaRetry();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += 1;
        var supportsE2EImage = protoInputObject.supportsE2EImage();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += 1;
        var supportsE2EVideo = protoInputObject.supportsE2EVideo();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += 1;
        var supportsE2EAudio = protoInputObject.supportsE2EAudio();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += 1;
        var supportsE2EDocument = protoInputObject.supportsE2EDocument();
        protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
        protoOutputSize += 1;
        var documentTypes = protoInputObject.documentTypes();
        if (documentTypes != null) {
            var documentTypes0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(documentTypes);
            if (documentTypes0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(documentTypes0);
            }
        }
        var features = protoInputObject.features();
        if (features != null) {
            var features0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(features);
            if (features0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(features0);
            }
        }
        return protoOutputSize;
    }

}
