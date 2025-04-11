package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.SignedDeviceIdentityHMAC;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignedDeviceIdentityHMACSpec {
    public static byte[] encode(SignedDeviceIdentityHMAC protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignedDeviceIdentityHMAC protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var hmac = protoInputObject.hmac();
        if (hmac != null) {
            var hmac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hmac);
            if (hmac0 != null) {
                protoOutputStream.writeBytes(2, hmac0);
            }
        }
    }

    public static SignedDeviceIdentityHMAC decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignedDeviceIdentityHMAC decode(ProtobufInputStream protoInputStream) {
        byte[] details = null;
        byte[] hmac = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> details = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> hmac = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.SignedDeviceIdentityHMAC(details, hmac);
    }

    public static int sizeOf(SignedDeviceIdentityHMAC protoInputObject) {
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
        var hmac = protoInputObject.hmac();
        if (hmac != null) {
            var hmac0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hmac);
            if (hmac0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(hmac0);
            }
        }
        return protoOutputSize;
    }

}
