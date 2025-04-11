package it.auties.whatsapp.model.business;

import it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class BusinessVerifiedNameCertificateSpec {
    public static byte[] encode(BusinessVerifiedNameCertificate protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(BusinessVerifiedNameCertificate protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var encodedDetails = protoInputObject.encodedDetails();
        if (encodedDetails != null) {
            var encodedDetails0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encodedDetails);
            if (encodedDetails0 != null) {
                protoOutputStream.writeBytes(1, encodedDetails0);
            }
        }
        var signature = protoInputObject.signature();
        if (signature != null) {
            var signature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signature);
            if (signature0 != null) {
                protoOutputStream.writeBytes(2, signature0);
            }
        }
        var serverSignature = protoInputObject.serverSignature();
        if (serverSignature != null) {
            var serverSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(serverSignature);
            if (serverSignature0 != null) {
                protoOutputStream.writeBytes(3, serverSignature0);
            }
        }
    }

    public static BusinessVerifiedNameCertificate decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static BusinessVerifiedNameCertificate decode(ProtobufInputStream protoInputStream) {
        byte[] encodedDetails = null;
        byte[] signature = null;
        byte[] serverSignature = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> encodedDetails = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> signature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> serverSignature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate(encodedDetails, signature, serverSignature);
    }

    public static int sizeOf(BusinessVerifiedNameCertificate protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var encodedDetails = protoInputObject.encodedDetails();
        if (encodedDetails != null) {
            var encodedDetails0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encodedDetails);
            if (encodedDetails0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(encodedDetails0);
            }
        }
        var signature = protoInputObject.signature();
        if (signature != null) {
            var signature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signature);
            if (signature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(signature0);
            }
        }
        var serverSignature = protoInputObject.serverSignature();
        if (serverSignature != null) {
            var serverSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(serverSignature);
            if (serverSignature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(serverSignature0);
            }
        }
        return protoOutputSize;
    }

}
