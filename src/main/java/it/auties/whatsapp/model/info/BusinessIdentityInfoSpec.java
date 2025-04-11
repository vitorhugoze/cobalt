package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.BusinessIdentityInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class BusinessIdentityInfoSpec {
    public static byte[] encode(BusinessIdentityInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(BusinessIdentityInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var level = protoInputObject.level();
        if (level != null) {
            var level0 = it.auties.whatsapp.model.info.BusinessIdentityInfoVerifiedLevelSpec.encode(level);
            protoOutputStream.writeInt32(1, level0);
        }
        var certificate = protoInputObject.certificate();
        if (certificate != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.sizeOf(certificate));
            it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.encode(certificate, protoOutputStream);
        }
        var signed = protoInputObject.signed();
        protoOutputStream.writeBool(3, signed);
        var revoked = protoInputObject.revoked();
        protoOutputStream.writeBool(4, revoked);
        var hostStorage = protoInputObject.hostStorage();
        if (hostStorage != null) {
            var hostStorage0 = it.auties.whatsapp.model.info.BusinessIdentityInfoHostStorageTypeSpec.encode(hostStorage);
            protoOutputStream.writeInt32(5, hostStorage0);
        }
        var actualActors = protoInputObject.actualActors();
        if (actualActors != null) {
            var actualActors0 = it.auties.whatsapp.model.info.BusinessIdentityInfoActorsTypeSpec.encode(actualActors);
            protoOutputStream.writeInt32(6, actualActors0);
        }
        var privacyModeTimestampSeconds = protoInputObject.privacyModeTimestampSeconds();
        protoOutputStream.writeUInt64(7, privacyModeTimestampSeconds);
        var featureControls = protoInputObject.featureControls();
        protoOutputStream.writeUInt64(8, featureControls);
    }

    public static BusinessIdentityInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static BusinessIdentityInfo decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.info.BusinessIdentityInfo.VerifiedLevel level = null;
        it.auties.whatsapp.model.business.BusinessVerifiedNameCertificate certificate = null;
        boolean signed = false;
        boolean revoked = false;
        it.auties.whatsapp.model.info.BusinessIdentityInfo.HostStorageType hostStorage = null;
        it.auties.whatsapp.model.info.BusinessIdentityInfo.ActorsType actualActors = null;
        long privacyModeTimestampSeconds = 0l;
        long featureControls = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> level = it.auties.whatsapp.model.info.BusinessIdentityInfoVerifiedLevelSpec.decode(protoInputStream.readInt32());
                case 2 -> certificate = it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> signed = protoInputStream.readBool();
                case 4 -> revoked = protoInputStream.readBool();
                case 5 -> hostStorage = it.auties.whatsapp.model.info.BusinessIdentityInfoHostStorageTypeSpec.decode(protoInputStream.readInt32());
                case 6 -> actualActors = it.auties.whatsapp.model.info.BusinessIdentityInfoActorsTypeSpec.decode(protoInputStream.readInt32());
                case 7 -> privacyModeTimestampSeconds = protoInputStream.readInt64();
                case 8 -> featureControls = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.info.BusinessIdentityInfo(level, certificate, signed, revoked, hostStorage, actualActors, privacyModeTimestampSeconds, featureControls);
    }

    public static int sizeOf(BusinessIdentityInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var level = protoInputObject.level();
        if (level != null) {
            var level0 = it.auties.whatsapp.model.info.BusinessIdentityInfoVerifiedLevelSpec.encode(level);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(level0);
        }
        var certificate = protoInputObject.certificate();
        if (certificate != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var certificateSerializedSize = it.auties.whatsapp.model.business.BusinessVerifiedNameCertificateSpec.sizeOf(certificate);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(certificateSerializedSize);
            protoOutputSize += certificateSerializedSize;
        }
        var signed = protoInputObject.signed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += 1;
        var revoked = protoInputObject.revoked();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += 1;
        var hostStorage = protoInputObject.hostStorage();
        if (hostStorage != null) {
            var hostStorage0 = it.auties.whatsapp.model.info.BusinessIdentityInfoHostStorageTypeSpec.encode(hostStorage);
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(hostStorage0);
        }
        var actualActors = protoInputObject.actualActors();
        if (actualActors != null) {
            var actualActors0 = it.auties.whatsapp.model.info.BusinessIdentityInfoActorsTypeSpec.encode(actualActors);
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(actualActors0);
        }
        var privacyModeTimestampSeconds = protoInputObject.privacyModeTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(privacyModeTimestampSeconds);
        var featureControls = protoInputObject.featureControls();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(featureControls);
        return protoOutputSize;
    }

}
