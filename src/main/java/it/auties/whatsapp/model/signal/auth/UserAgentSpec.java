package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.UserAgent;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class UserAgentSpec {
    public static byte[] encode(UserAgent protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(UserAgent protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var platform = protoInputObject.platform();
        if (platform != null) {
            var platform0 = it.auties.whatsapp.model.signal.auth.UserAgentPlatformTypeSpec.encode(platform);
            protoOutputStream.writeInt32(1, platform0);
        }
        var appVersion = protoInputObject.appVersion();
        if (appVersion != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(appVersion));
            it.auties.whatsapp.model.signal.auth.VersionSpec.encode(appVersion, protoOutputStream);
        }
        var mcc = protoInputObject.mcc();
        if (mcc != null) {
            var mcc0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mcc);
            if (mcc0 != null) {
                protoOutputStream.writeString(3, mcc0);
            }
        }
        var mnc = protoInputObject.mnc();
        if (mnc != null) {
            var mnc0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mnc);
            if (mnc0 != null) {
                protoOutputStream.writeString(4, mnc0);
            }
        }
        var osVersion = protoInputObject.osVersion();
        if (osVersion != null) {
            var osVersion0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(osVersion);
            if (osVersion0 != null) {
                protoOutputStream.writeString(5, osVersion0);
            }
        }
        var manufacturer = protoInputObject.manufacturer();
        if (manufacturer != null) {
            var manufacturer0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(manufacturer);
            if (manufacturer0 != null) {
                protoOutputStream.writeString(6, manufacturer0);
            }
        }
        var device = protoInputObject.device();
        if (device != null) {
            var device0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(device);
            if (device0 != null) {
                protoOutputStream.writeString(7, device0);
            }
        }
        var osBuildNumber = protoInputObject.osBuildNumber();
        if (osBuildNumber != null) {
            var osBuildNumber0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(osBuildNumber);
            if (osBuildNumber0 != null) {
                protoOutputStream.writeString(8, osBuildNumber0);
            }
        }
        var phoneId = protoInputObject.phoneId();
        if (phoneId != null) {
            var phoneId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phoneId);
            if (phoneId0 != null) {
                protoOutputStream.writeString(9, phoneId0);
            }
        }
        var releaseChannel = protoInputObject.releaseChannel();
        if (releaseChannel != null) {
            var releaseChannel0 = it.auties.whatsapp.model.signal.auth.UserAgentReleaseChannelSpec.encode(releaseChannel);
            protoOutputStream.writeInt32(10, releaseChannel0);
        }
        var localeLanguageIso6391 = protoInputObject.localeLanguageIso6391();
        if (localeLanguageIso6391 != null) {
            var localeLanguageIso63910 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(localeLanguageIso6391);
            if (localeLanguageIso63910 != null) {
                protoOutputStream.writeString(11, localeLanguageIso63910);
            }
        }
        var localeCountryIso31661Alpha2 = protoInputObject.localeCountryIso31661Alpha2();
        if (localeCountryIso31661Alpha2 != null) {
            var localeCountryIso31661Alpha20 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(localeCountryIso31661Alpha2);
            if (localeCountryIso31661Alpha20 != null) {
                protoOutputStream.writeString(12, localeCountryIso31661Alpha20);
            }
        }
        var deviceBoard = protoInputObject.deviceBoard();
        if (deviceBoard != null) {
            var deviceBoard0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceBoard);
            if (deviceBoard0 != null) {
                protoOutputStream.writeString(13, deviceBoard0);
            }
        }
        var deviceType = protoInputObject.deviceType();
        if (deviceType != null) {
            var deviceType0 = it.auties.whatsapp.model.signal.auth.UserAgentDeviceTypeSpec.encode(deviceType);
            protoOutputStream.writeInt32(15, deviceType0);
        }
        var deviceModelType = protoInputObject.deviceModelType();
        if (deviceModelType != null) {
            var deviceModelType0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceModelType);
            if (deviceModelType0 != null) {
                protoOutputStream.writeString(16, deviceModelType0);
            }
        }
    }

    public static UserAgent decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static UserAgent decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.signal.auth.UserAgent.PlatformType platform = null;
        it.auties.whatsapp.model.signal.auth.Version appVersion = null;
        java.lang.String mcc = null;
        java.lang.String mnc = null;
        java.lang.String osVersion = null;
        java.lang.String manufacturer = null;
        java.lang.String device = null;
        java.lang.String osBuildNumber = null;
        java.lang.String phoneId = null;
        it.auties.whatsapp.model.signal.auth.UserAgent.ReleaseChannel releaseChannel = null;
        java.lang.String localeLanguageIso6391 = null;
        java.lang.String localeCountryIso31661Alpha2 = null;
        java.lang.String deviceBoard = null;
        it.auties.whatsapp.model.signal.auth.UserAgent.DeviceType deviceType = null;
        java.lang.String deviceModelType = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> platform = it.auties.whatsapp.model.signal.auth.UserAgentPlatformTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> appVersion = it.auties.whatsapp.model.signal.auth.VersionSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> mcc = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> mnc = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> osVersion = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> manufacturer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> device = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 8 -> osBuildNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> phoneId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 10 -> releaseChannel = it.auties.whatsapp.model.signal.auth.UserAgentReleaseChannelSpec.decode(protoInputStream.readInt32());
                case 11 -> localeLanguageIso6391 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 12 -> localeCountryIso31661Alpha2 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 13 -> deviceBoard = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 15 -> deviceType = it.auties.whatsapp.model.signal.auth.UserAgentDeviceTypeSpec.decode(protoInputStream.readInt32());
                case 16 -> deviceModelType = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.UserAgent(platform, appVersion, mcc, mnc, osVersion, manufacturer, device, osBuildNumber, phoneId, releaseChannel, localeLanguageIso6391, localeCountryIso31661Alpha2, deviceBoard, deviceType, deviceModelType);
    }

    public static int sizeOf(UserAgent protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var platform = protoInputObject.platform();
        if (platform != null) {
            var platform0 = it.auties.whatsapp.model.signal.auth.UserAgentPlatformTypeSpec.encode(platform);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(platform0);
        }
        var appVersion = protoInputObject.appVersion();
        if (appVersion != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var appVersionSerializedSize = it.auties.whatsapp.model.signal.auth.VersionSpec.sizeOf(appVersion);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(appVersionSerializedSize);
            protoOutputSize += appVersionSerializedSize;
        }
        var mcc = protoInputObject.mcc();
        if (mcc != null) {
            var mcc0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mcc);
            if (mcc0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mcc0);
            }
        }
        var mnc = protoInputObject.mnc();
        if (mnc != null) {
            var mnc0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(mnc);
            if (mnc0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(mnc0);
            }
        }
        var osVersion = protoInputObject.osVersion();
        if (osVersion != null) {
            var osVersion0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(osVersion);
            if (osVersion0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(osVersion0);
            }
        }
        var manufacturer = protoInputObject.manufacturer();
        if (manufacturer != null) {
            var manufacturer0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(manufacturer);
            if (manufacturer0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(manufacturer0);
            }
        }
        var device = protoInputObject.device();
        if (device != null) {
            var device0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(device);
            if (device0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(device0);
            }
        }
        var osBuildNumber = protoInputObject.osBuildNumber();
        if (osBuildNumber != null) {
            var osBuildNumber0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(osBuildNumber);
            if (osBuildNumber0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(osBuildNumber0);
            }
        }
        var phoneId = protoInputObject.phoneId();
        if (phoneId != null) {
            var phoneId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(phoneId);
            if (phoneId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(phoneId0);
            }
        }
        var releaseChannel = protoInputObject.releaseChannel();
        if (releaseChannel != null) {
            var releaseChannel0 = it.auties.whatsapp.model.signal.auth.UserAgentReleaseChannelSpec.encode(releaseChannel);
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(releaseChannel0);
        }
        var localeLanguageIso6391 = protoInputObject.localeLanguageIso6391();
        if (localeLanguageIso6391 != null) {
            var localeLanguageIso63910 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(localeLanguageIso6391);
            if (localeLanguageIso63910 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(localeLanguageIso63910);
            }
        }
        var localeCountryIso31661Alpha2 = protoInputObject.localeCountryIso31661Alpha2();
        if (localeCountryIso31661Alpha2 != null) {
            var localeCountryIso31661Alpha20 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(localeCountryIso31661Alpha2);
            if (localeCountryIso31661Alpha20 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(localeCountryIso31661Alpha20);
            }
        }
        var deviceBoard = protoInputObject.deviceBoard();
        if (deviceBoard != null) {
            var deviceBoard0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceBoard);
            if (deviceBoard0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(deviceBoard0);
            }
        }
        var deviceType = protoInputObject.deviceType();
        if (deviceType != null) {
            var deviceType0 = it.auties.whatsapp.model.signal.auth.UserAgentDeviceTypeSpec.encode(deviceType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceType0);
        }
        var deviceModelType = protoInputObject.deviceModelType();
        if (deviceModelType != null) {
            var deviceModelType0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deviceModelType);
            if (deviceModelType0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(deviceModelType0);
            }
        }
        return protoOutputSize;
    }

}
