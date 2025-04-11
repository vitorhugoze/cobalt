package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.SignedDeviceIdentity;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignedDeviceIdentitySpec {
    public static byte[] encode(SignedDeviceIdentity protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignedDeviceIdentity protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var accountSignatureKey = protoInputObject.accountSignatureKey();
        if (accountSignatureKey != null) {
            var accountSignatureKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(accountSignatureKey);
            if (accountSignatureKey0 != null) {
                protoOutputStream.writeBytes(2, accountSignatureKey0);
            }
        }
        var accountSignature = protoInputObject.accountSignature();
        if (accountSignature != null) {
            var accountSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(accountSignature);
            if (accountSignature0 != null) {
                protoOutputStream.writeBytes(3, accountSignature0);
            }
        }
        var deviceSignature = protoInputObject.deviceSignature();
        if (deviceSignature != null) {
            var deviceSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceSignature);
            if (deviceSignature0 != null) {
                protoOutputStream.writeBytes(4, deviceSignature0);
            }
        }
    }

    public static SignedDeviceIdentity decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignedDeviceIdentity decode(ProtobufInputStream protoInputStream) {
        byte[] details = null;
        byte[] accountSignatureKey = null;
        byte[] accountSignature = null;
        byte[] deviceSignature = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> details = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> accountSignatureKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> accountSignature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> deviceSignature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.SignedDeviceIdentity(details, accountSignatureKey, accountSignature, deviceSignature);
    }

    public static int sizeOf(SignedDeviceIdentity protoInputObject) {
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
        var accountSignatureKey = protoInputObject.accountSignatureKey();
        if (accountSignatureKey != null) {
            var accountSignatureKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(accountSignatureKey);
            if (accountSignatureKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(accountSignatureKey0);
            }
        }
        var accountSignature = protoInputObject.accountSignature();
        if (accountSignature != null) {
            var accountSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(accountSignature);
            if (accountSignature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(accountSignature0);
            }
        }
        var deviceSignature = protoInputObject.deviceSignature();
        if (deviceSignature != null) {
            var deviceSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceSignature);
            if (deviceSignature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(deviceSignature0);
            }
        }
        return protoOutputSize;
    }

}
