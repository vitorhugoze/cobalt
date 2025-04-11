package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.SignedKeyIndexList;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignedKeyIndexListSpec {
    public static byte[] encode(SignedKeyIndexList protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignedKeyIndexList protoInputObject, ProtobufOutputStream protoOutputStream) {
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
        var accountSignature = protoInputObject.accountSignature();
        if (accountSignature != null) {
            var accountSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(accountSignature);
            if (accountSignature0 != null) {
                protoOutputStream.writeBytes(2, accountSignature0);
            }
        }
    }

    public static SignedKeyIndexList decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignedKeyIndexList decode(ProtobufInputStream protoInputStream) {
        byte[] details = null;
        byte[] accountSignature = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> details = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> accountSignature = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.SignedKeyIndexList(details, accountSignature);
    }

    public static int sizeOf(SignedKeyIndexList protoInputObject) {
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
        var accountSignature = protoInputObject.accountSignature();
        if (accountSignature != null) {
            var accountSignature0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(accountSignature);
            if (accountSignature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(accountSignature0);
            }
        }
        return protoOutputSize;
    }

}
