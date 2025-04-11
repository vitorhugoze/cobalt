package it.auties.whatsapp.model.business;

import it.auties.whatsapp.model.business.BusinessAccountPayload;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class BusinessAccountPayloadSpec {
    public static byte[] encode(BusinessAccountPayload protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(BusinessAccountPayload protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var certificate = protoInputObject.certificate();
        if (certificate != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.sizeOf(certificate));
            it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.encode(certificate, protoOutputStream);
        }
        var info = protoInputObject.info();
        if (info != null) {
            var info0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(info);
            if (info0 != null) {
                protoOutputStream.writeBytes(2, info0);
            }
        }
    }

    public static BusinessAccountPayload decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static BusinessAccountPayload decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate certificate = null;
        byte[] info = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> certificate = it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> info = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.business.BusinessAccountPayload(certificate, info);
    }

    public static int sizeOf(BusinessAccountPayload protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var certificate = protoInputObject.certificate();
        if (certificate != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var certificateSerializedSize = it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.sizeOf(certificate);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(certificateSerializedSize);
            protoOutputSize += certificateSerializedSize;
        }
        var info = protoInputObject.info();
        if (info != null) {
            var info0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(info);
            if (info0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(info0);
            }
        }
        return protoOutputSize;
    }

}
