package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.BusinessAccountLinkInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class BusinessAccountLinkInfoSpec {
    public static byte[] encode(BusinessAccountLinkInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(BusinessAccountLinkInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var businessId = protoInputObject.businessId();
        protoOutputStream.writeUInt64(1, businessId);
        var phoneNumber = protoInputObject.phoneNumber();
        if (phoneNumber != null) {
            var phoneNumber0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phoneNumber);
            if (phoneNumber0 != null) {
                protoOutputStream.writeString(2, phoneNumber0);
            }
        }
        var issueTimeSeconds = protoInputObject.issueTimeSeconds();
        protoOutputStream.writeUInt64(3, issueTimeSeconds);
        var hostStorage = protoInputObject.hostStorage();
        if (hostStorage != null) {
            var hostStorage0 = it.auties.whatsapp.model.info.BusinessAccountLinkInfoHostStorageTypeSpec.encode(hostStorage);
            protoOutputStream.writeInt32(4, hostStorage0);
        }
        var accountType = protoInputObject.accountType();
        if (accountType != null) {
            var accountType0 = it.auties.whatsapp.model.info.BusinessAccountLinkInfoAccountTypeSpec.encode(accountType);
            protoOutputStream.writeInt32(5, accountType0);
        }
    }

    public static BusinessAccountLinkInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static BusinessAccountLinkInfo decode(ProtobufInputStream protoInputStream) {
        long businessId = 0l;
        java.lang.String phoneNumber = null;
        long issueTimeSeconds = 0l;
        it.auties.whatsapp.model.info.BusinessAccountLinkInfo.HostStorageType hostStorage = null;
        it.auties.whatsapp.model.info.BusinessAccountLinkInfo.AccountType accountType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> businessId = protoInputStream.readInt64();
                case 2 -> phoneNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> issueTimeSeconds = protoInputStream.readInt64();
                case 4 -> hostStorage = it.auties.whatsapp.model.info.BusinessAccountLinkInfoHostStorageTypeSpec.decode(protoInputStream.readInt32());
                case 5 -> accountType = it.auties.whatsapp.model.info.BusinessAccountLinkInfoAccountTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.BusinessAccountLinkInfo(businessId, phoneNumber, issueTimeSeconds, hostStorage, accountType);
    }

    public static int sizeOf(BusinessAccountLinkInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var businessId = protoInputObject.businessId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(businessId);
        var phoneNumber = protoInputObject.phoneNumber();
        if (phoneNumber != null) {
            var phoneNumber0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phoneNumber);
            if (phoneNumber0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(phoneNumber0);
            }
        }
        var issueTimeSeconds = protoInputObject.issueTimeSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(issueTimeSeconds);
        var hostStorage = protoInputObject.hostStorage();
        if (hostStorage != null) {
            var hostStorage0 = it.auties.whatsapp.model.info.BusinessAccountLinkInfoHostStorageTypeSpec.encode(hostStorage);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(hostStorage0);
        }
        var accountType = protoInputObject.accountType();
        if (accountType != null) {
            var accountType0 = it.auties.whatsapp.model.info.BusinessAccountLinkInfoAccountTypeSpec.encode(accountType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(accountType0);
        }
        return protoOutputSize;
    }

}
