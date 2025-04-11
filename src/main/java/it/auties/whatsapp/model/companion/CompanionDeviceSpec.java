package it.auties.whatsapp.model.companion;

import it.auties.whatsapp.model.companion.CompanionDevice;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CompanionDeviceSpec {
    public static byte[] encode(CompanionDevice protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CompanionDevice protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var model = protoInputObject.model();
        if (model != null) {
            var model0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(model);
            if (model0 != null) {
                protoOutputStream.writeString(1, model0);
            }
        }
        var manufacturer = protoInputObject.manufacturer();
        if (manufacturer != null) {
            var manufacturer0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(manufacturer);
            if (manufacturer0 != null) {
                protoOutputStream.writeString(2, manufacturer0);
            }
        }
        var platform = protoInputObject.platform();
        if (platform != null) {
            var platform0 = it.auties.whatsapp.model.signal.auth.UserAgentPlatformTypeSpec.encode(platform);
            protoOutputStream.writeInt32(3, platform0);
        }
        var appVersion = protoInputObject.appVersion();
        if (appVersion != null) {
            var appVersion0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appVersion);
            if (appVersion0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(appVersion0));
                it.auties.whatsapp.model.signal.auth.VersionSpec.encode(appVersion0, protoOutputStream);
            }
        }
        var osVersion = protoInputObject.osVersion();
        if (osVersion != null) {
            protoOutputStream.writeMessage(5, it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(osVersion));
            it.auties.whatsapp.model.signal.auth.VersionSpec.encode(osVersion, protoOutputStream);
        }
        var osBuildNumber = protoInputObject.osBuildNumber();
        if (osBuildNumber != null) {
            var osBuildNumber0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(osBuildNumber);
            if (osBuildNumber0 != null) {
                protoOutputStream.writeString(6, osBuildNumber0);
            }
        }
        var address = protoInputObject.address();
        if (address != null) {
            var address0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(address);
            if (address0 != null) {
                var address1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(address0);
                if (address1 != null) {
                    protoOutputStream.writeString(7, address1);
                }
            }
        }
        var modelId = protoInputObject.modelId();
        if (modelId != null) {
            var modelId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(modelId);
            if (modelId0 != null) {
                protoOutputStream.writeString(8, modelId0);
            }
        }
        var clientType = protoInputObject.clientType();
        if (clientType != null) {
            var clientType0 = it.auties.whatsapp.api.ClientTypeSpec.encode(clientType);
            protoOutputStream.writeInt32(9, clientType0);
        }
    }

    public static CompanionDevice decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CompanionDevice decode(ProtobufInputStream protoInputStream) {
        java.lang.String model = null;
        java.lang.String manufacturer = null;
        it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType platform = null;
        it.auties.whatsapp.model.signal.auth.Version appVersion = null;
        it.auties.whatsapp.model.signal.auth.Version osVersion = null;
        java.lang.String osBuildNumber = null;
        java.lang.String address = null;
        java.lang.String modelId = null;
        it.auties.whatsapp.api.ClientType clientType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> model = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> manufacturer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> platform = it.auties.whatsapp.model.signal.auth.UserAgentPlatformTypeSpec.decode(protoInputStream.readInt32());
                case 4 -> appVersion = it.auties.whatsapp.model.signal.auth.VersionSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> osVersion = it.auties.whatsapp.model.signal.auth.VersionSpec.decode(protoInputStream.readLengthDelimited());
                case 6 -> osBuildNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> address = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> modelId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> clientType = it.auties.whatsapp.api.ClientTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.companion.CompanionDevice(model, manufacturer, platform, appVersion, osVersion, osBuildNumber, address, modelId, clientType);
    }

    public static int sizeOf(CompanionDevice protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var model = protoInputObject.model();
        if (model != null) {
            var model0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(model);
            if (model0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(model0);
            }
        }
        var manufacturer = protoInputObject.manufacturer();
        if (manufacturer != null) {
            var manufacturer0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(manufacturer);
            if (manufacturer0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(manufacturer0);
            }
        }
        var platform = protoInputObject.platform();
        if (platform != null) {
            var platform0 = it.auties.whatsapp.model.signal.auth.UserAgentPlatformTypeSpec.encode(platform);
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(platform0);
        }
        var appVersion = protoInputObject.appVersion();
        if (appVersion != null) {
            var appVersion0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appVersion);
            if (appVersion0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var appVersionSerializedSize = it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(appVersion0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(appVersionSerializedSize);
                protoOutputSize += appVersionSerializedSize;
            }
        }
        var osVersion = protoInputObject.osVersion();
        if (osVersion != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            var osVersionSerializedSize = it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(osVersion);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(osVersionSerializedSize);
            protoOutputSize += osVersionSerializedSize;
        }
        var osBuildNumber = protoInputObject.osBuildNumber();
        if (osBuildNumber != null) {
            var osBuildNumber0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(osBuildNumber);
            if (osBuildNumber0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(osBuildNumber0);
            }
        }
        var address = protoInputObject.address();
        if (address != null) {
            var address0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(address);
            if (address0 != null) {
                var address1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(address0);
                if (address1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(address1);
                }
            }
        }
        var modelId = protoInputObject.modelId();
        if (modelId != null) {
            var modelId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(modelId);
            if (modelId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(modelId0);
            }
        }
        var clientType = protoInputObject.clientType();
        if (clientType != null) {
            var clientType0 = it.auties.whatsapp.api.ClientTypeSpec.encode(clientType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(clientType0);
        }
        return protoOutputSize;
    }

}
