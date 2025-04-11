package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.NoiseCertificate;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NoiseCertificateSpec {
    public static byte[] encode(NoiseCertificate protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NoiseCertificate protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var details = protoInputObject.details();
        if (details != null) {
            var details0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(details);
            if (details0 != null) {
                protoOutputStream.writeBytes(1, details0);
            }
        }
        var signature = protoInputObject.signature();
        if (signature != null) {
            var signature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(signature);
            if (signature0 != null) {
                protoOutputStream.writeBytes(2, signature0);
            }
        }
    }

    public static NoiseCertificate decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NoiseCertificate decode(ProtobufInputStream protoInputStream) {
        byte[] details = null;
        byte[] signature = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> details = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> signature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.NoiseCertificate(details, signature);
    }

    public static int sizeOf(NoiseCertificate protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var details = protoInputObject.details();
        if (details != null) {
            var details0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(details);
            if (details0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(details0);
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
        return protoOutputSize;
    }

}
