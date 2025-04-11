package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.CompanionProperties;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CompanionPropertiesSpec {
    public static byte[] encode(CompanionProperties protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CompanionProperties protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var os = protoInputObject.os();
        if (os != null) {
            var os0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(os);
            if (os0 != null) {
                protoOutputStream.writeString(1, os0);
            }
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(version));
            it.auties.whatsapp.model.signal.auth.VersionSpec.encode(version, protoOutputStream);
        }
        var platformType = protoInputObject.platformType();
        if (platformType != null) {
            var platformType0 = it.auties.whatsapp.model.signal.auth.CompanionPropertiesPlatformTypeSpec.encode(platformType);
            protoOutputStream.writeInt32(3, platformType0);
        }
        var requireFullSync = protoInputObject.requireFullSync();
        protoOutputStream.writeBool(4, requireFullSync);
        var historySyncConfig = protoInputObject.historySyncConfig();
        if (historySyncConfig != null) {
            protoOutputStream.writeMessage(5, it.auties.whatsapp.model.sync.HistorySyncConfigSpec.sizeOf(historySyncConfig));
            it.auties.whatsapp.model.sync.HistorySyncConfigSpec.encode(historySyncConfig, protoOutputStream);
        }
    }

    public static CompanionProperties decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CompanionProperties decode(ProtobufInputStream protoInputStream) {
        java.lang.String os = null;
        it.auties.whatsapp.model.signal.auth.Version version = null;
        it.auties.whatsapp.model.signal.auth.CompanionProperties.PlatformType platformType = null;
        boolean requireFullSync = false;
        it.auties.whatsapp.model.sync.HistorySyncConfig historySyncConfig = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> os = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> version = it.auties.whatsapp.model.signal.auth.VersionSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> platformType = it.auties.whatsapp.model.signal.auth.CompanionPropertiesPlatformTypeSpec.decode(protoInputStream.readInt32());
                case 4 -> requireFullSync = protoInputStream.readBool();
                case 5 -> historySyncConfig = it.auties.whatsapp.model.sync.HistorySyncConfigSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.CompanionProperties(os, version, platformType, requireFullSync, historySyncConfig);
    }

    public static int sizeOf(CompanionProperties protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var os = protoInputObject.os();
        if (os != null) {
            var os0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(os);
            if (os0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(os0);
            }
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var versionSerializedSize = it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(version);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(versionSerializedSize);
            protoOutputSize += versionSerializedSize;
        }
        var platformType = protoInputObject.platformType();
        if (platformType != null) {
            var platformType0 = it.auties.whatsapp.model.signal.auth.CompanionPropertiesPlatformTypeSpec.encode(platformType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(platformType0);
        }
        var requireFullSync = protoInputObject.requireFullSync();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += 1;
        var historySyncConfig = protoInputObject.historySyncConfig();
        if (historySyncConfig != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            var historySyncConfigSerializedSize = it.auties.whatsapp.model.sync.HistorySyncConfigSpec.sizeOf(historySyncConfig);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(historySyncConfigSerializedSize);
            protoOutputSize += historySyncConfigSerializedSize;
        }
        return protoOutputSize;
    }

}
