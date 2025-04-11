package it.auties.whatsapp.model.business;

import it.auties.whatsapp.model.business.BusinessVerifiedNameDetails;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class BusinessVerifiedNameDetailsSpec {
    public static byte[] encode(BusinessVerifiedNameDetails protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(BusinessVerifiedNameDetails protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var serial = protoInputObject.serial();
        protoOutputStream.writeUInt64(1, serial);
        var issuer = protoInputObject.issuer();
        if (issuer != null) {
            var issuer0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(issuer);
            if (issuer0 != null) {
                protoOutputStream.writeString(2, issuer0);
            }
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(4, name0);
            }
        }
        if (protoInputObject.localizedNames() != null) {
            for (var localizedNamesEntry : protoInputObject.localizedNames()) { 
                if (localizedNamesEntry != null) {
                    protoOutputStream.writeMessage(8, it.auties.whatsapp.model.business.BusinessLocalizedNameSpec.sizeOf(localizedNamesEntry));
                    it.auties.whatsapp.model.business.BusinessLocalizedNameSpec.encode(localizedNamesEntry, protoOutputStream);
                }
            }
        }
        var issueTimeSeconds = protoInputObject.issueTimeSeconds();
        protoOutputStream.writeUInt64(10, issueTimeSeconds);
    }

    public static BusinessVerifiedNameDetails decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static BusinessVerifiedNameDetails decode(ProtobufInputStream protoInputStream) {
        long serial = 0l;
        java.lang.String issuer = null;
        java.lang.String name = null;
        java.util.List<it.auties.whatsapp.model.business.BusinessLocalizedName> localizedNames = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        long issueTimeSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> serial = protoInputStream.readInt64();
                case 2 -> issuer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> localizedNames.add(it.auties.whatsapp.model.business.BusinessLocalizedNameSpec.decode(protoInputStream.readLengthDelimited()));
                case 10 -> issueTimeSeconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.business.BusinessVerifiedNameDetails(serial, issuer, name, localizedNames, issueTimeSeconds);
    }

    public static int sizeOf(BusinessVerifiedNameDetails protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var serial = protoInputObject.serial();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(serial);
        var issuer = protoInputObject.issuer();
        if (issuer != null) {
            var issuer0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(issuer);
            if (issuer0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(issuer0);
            }
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        if (protoInputObject.localizedNames() != null) {
            for (var localizedNamesEntry : protoInputObject.localizedNames()) { 
                if (localizedNamesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                    var localizedNamesEntrySerializedSize = it.auties.whatsapp.model.business.BusinessLocalizedNameSpec.sizeOf(localizedNamesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(localizedNamesEntrySerializedSize);
                    protoOutputSize += localizedNamesEntrySerializedSize;
                }
            }
        }
        var issueTimeSeconds = protoInputObject.issueTimeSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(issueTimeSeconds);
        return protoOutputSize;
    }

}
