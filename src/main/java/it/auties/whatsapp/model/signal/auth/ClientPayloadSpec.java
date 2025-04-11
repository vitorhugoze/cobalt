package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ClientPayload;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ClientPayloadSpec {
    public static byte[] encode(ClientPayload protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ClientPayload protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var username = protoInputObject.username();
        if (username != null) {
            protoOutputStream.writeUInt64(1, username);
        }
        var passive = protoInputObject.passive();
        if (passive != null) {
            protoOutputStream.writeBool(3, passive);
        }
        var userAgent = protoInputObject.userAgent();
        if (userAgent != null) {
            protoOutputStream.writeMessage(5, it.auties.whatsapp.model.signal.auth.UserAgentSpec.sizeOf(userAgent));
            it.auties.whatsapp.model.signal.auth.UserAgentSpec.encode(userAgent, protoOutputStream);
        }
        var webInfo = protoInputObject.webInfo();
        if (webInfo != null) {
            protoOutputStream.writeMessage(6, it.auties.whatsapp.model.signal.auth.WebInfoSpec.sizeOf(webInfo));
            it.auties.whatsapp.model.signal.auth.WebInfoSpec.encode(webInfo, protoOutputStream);
        }
        var pushName = protoInputObject.pushName();
        if (pushName != null) {
            var pushName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pushName);
            if (pushName0 != null) {
                protoOutputStream.writeString(7, pushName0);
            }
        }
        var sessionId = protoInputObject.sessionId();
        if (sessionId != null) {
            protoOutputStream.writeFixed32(9, sessionId);
        }
        var shortConnect = protoInputObject.shortConnect();
        if (shortConnect != null) {
            protoOutputStream.writeBool(10, shortConnect);
        }
        var connectType = protoInputObject.connectType();
        if (connectType != null) {
            var connectType0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadConnectTypeSpec.encode(connectType);
            protoOutputStream.writeInt32(12, connectType0);
        }
        var connectReason = protoInputObject.connectReason();
        if (connectReason != null) {
            var connectReason0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadConnectReasonSpec.encode(connectReason);
            protoOutputStream.writeInt32(13, connectReason0);
        }
        if (protoInputObject.shards() != null) {
            for (var shardsEntry : protoInputObject.shards()) { 
                if (shardsEntry != null) {
                    protoOutputStream.writeInt32(14, shardsEntry);
                }
            }
        }
        var dnsSource = protoInputObject.dnsSource();
        if (dnsSource != null) {
            protoOutputStream.writeMessage(15, it.auties.whatsapp.model.signal.auth.DNSSourceSpec.sizeOf(dnsSource));
            it.auties.whatsapp.model.signal.auth.DNSSourceSpec.encode(dnsSource, protoOutputStream);
        }
        var connectAttemptCount = protoInputObject.connectAttemptCount();
        if (connectAttemptCount != null) {
            protoOutputStream.writeUInt32(16, connectAttemptCount);
        }
        var device = protoInputObject.device();
        if (device != null) {
            protoOutputStream.writeUInt32(18, device);
        }
        var regData = protoInputObject.regData();
        if (regData != null) {
            protoOutputStream.writeMessage(19, it.auties.whatsapp.model.signal.auth.CompanionRegistrationDataSpec.sizeOf(regData));
            it.auties.whatsapp.model.signal.auth.CompanionRegistrationDataSpec.encode(regData, protoOutputStream);
        }
        var product = protoInputObject.product();
        if (product != null) {
            var product0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadProductSpec.encode(product);
            protoOutputStream.writeInt32(20, product0);
        }
        var fbCat = protoInputObject.fbCat();
        if (fbCat != null) {
            var fbCat0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fbCat);
            if (fbCat0 != null) {
                protoOutputStream.writeBytes(21, fbCat0);
            }
        }
        var fbUserAgent = protoInputObject.fbUserAgent();
        if (fbUserAgent != null) {
            var fbUserAgent0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fbUserAgent);
            if (fbUserAgent0 != null) {
                protoOutputStream.writeBytes(22, fbUserAgent0);
            }
        }
        var oc = protoInputObject.oc();
        if (oc != null) {
            protoOutputStream.writeBool(23, oc);
        }
        var lc = protoInputObject.lc();
        if (lc != null) {
            protoOutputStream.writeInt32(24, lc);
        }
        var iosAppExtension = protoInputObject.iosAppExtension();
        if (iosAppExtension != null) {
            var iosAppExtension0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadIOSAppExtensionSpec.encode(iosAppExtension);
            protoOutputStream.writeInt32(30, iosAppExtension0);
        }
        var fbAppId = protoInputObject.fbAppId();
        if (fbAppId != null) {
            protoOutputStream.writeUInt64(31, fbAppId);
        }
        var fbDeviceId = protoInputObject.fbDeviceId();
        if (fbDeviceId != null) {
            var fbDeviceId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fbDeviceId);
            if (fbDeviceId0 != null) {
                protoOutputStream.writeBytes(32, fbDeviceId0);
            }
        }
        var pull = protoInputObject.pull();
        if (pull != null) {
            protoOutputStream.writeBool(33, pull);
        }
    }

    public static ClientPayload decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ClientPayload decode(ProtobufInputStream protoInputStream) {
        java.lang.Long username = null;
        java.lang.Boolean passive = null;
        it.auties.whatsapp.model.signal.auth.UserAgent userAgent = null;
        it.auties.whatsapp.model.signal.auth.WebInfo webInfo = null;
        java.lang.String pushName = null;
        java.lang.Integer sessionId = null;
        java.lang.Boolean shortConnect = null;
        it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectType connectType = null;
        it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectReason connectReason = null;
        java.util.List<java.lang.Integer> shards = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.signal.auth.DNSSource dnsSource = null;
        java.lang.Integer connectAttemptCount = null;
        java.lang.Integer device = null;
        it.auties.whatsapp.model.signal.auth.CompanionRegistrationData regData = null;
        it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadProduct product = null;
        byte[] fbCat = null;
        byte[] fbUserAgent = null;
        java.lang.Boolean oc = null;
        java.lang.Integer lc = null;
        it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadIOSAppExtension iosAppExtension = null;
        java.lang.Long fbAppId = null;
        byte[] fbDeviceId = null;
        java.lang.Boolean pull = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> username = protoInputStream.readInt64();
                case 3 -> passive = protoInputStream.readBool();
                case 5 -> userAgent = it.auties.whatsapp.model.signal.auth.UserAgentSpec.decode(protoInputStream.readLengthDelimited());
                case 6 -> webInfo = it.auties.whatsapp.model.signal.auth.WebInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 7 -> pushName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 9 -> sessionId = protoInputStream.readFixed32();
                case 10 -> shortConnect = protoInputStream.readBool();
                case 12 -> connectType = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadConnectTypeSpec.decode(protoInputStream.readInt32());
                case 13 -> connectReason = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadConnectReasonSpec.decode(protoInputStream.readInt32());
                case 14 -> shards.add(protoInputStream.readInt32());
                case 15 -> dnsSource = it.auties.whatsapp.model.signal.auth.DNSSourceSpec.decode(protoInputStream.readLengthDelimited());
                case 16 -> connectAttemptCount = protoInputStream.readInt32();
                case 18 -> device = protoInputStream.readInt32();
                case 19 -> regData = it.auties.whatsapp.model.signal.auth.CompanionRegistrationDataSpec.decode(protoInputStream.readLengthDelimited());
                case 20 -> product = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadProductSpec.decode(protoInputStream.readInt32());
                case 21 -> fbCat = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 22 -> fbUserAgent = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 23 -> oc = protoInputStream.readBool();
                case 24 -> lc = protoInputStream.readInt32();
                case 30 -> iosAppExtension = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadIOSAppExtensionSpec.decode(protoInputStream.readInt32());
                case 31 -> fbAppId = protoInputStream.readInt64();
                case 32 -> fbDeviceId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 33 -> pull = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.ClientPayload(username, passive, userAgent, webInfo, pushName, sessionId, shortConnect, connectType, connectReason, shards, dnsSource, connectAttemptCount, device, regData, product, fbCat, fbUserAgent, oc, lc, iosAppExtension, fbAppId, fbDeviceId, pull);
    }

    public static int sizeOf(ClientPayload protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var username = protoInputObject.username();
        if (username != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(username);
        }
        var passive = protoInputObject.passive();
        if (passive != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
            protoOutputSize += 1;
        }
        var userAgent = protoInputObject.userAgent();
        if (userAgent != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            var userAgentSerializedSize = it.auties.whatsapp.model.signal.auth.UserAgentSpec.sizeOf(userAgent);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(userAgentSerializedSize);
            protoOutputSize += userAgentSerializedSize;
        }
        var webInfo = protoInputObject.webInfo();
        if (webInfo != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            var webInfoSerializedSize = it.auties.whatsapp.model.signal.auth.WebInfoSpec.sizeOf(webInfo);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(webInfoSerializedSize);
            protoOutputSize += webInfoSerializedSize;
        }
        var pushName = protoInputObject.pushName();
        if (pushName != null) {
            var pushName0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pushName);
            if (pushName0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(pushName0);
            }
        }
        var sessionId = protoInputObject.sessionId();
        if (sessionId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 5);
            protoOutputSize += 4;
        }
        var shortConnect = protoInputObject.shortConnect();
        if (shortConnect != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 0);
            protoOutputSize += 1;
        }
        var connectType = protoInputObject.connectType();
        if (connectType != null) {
            var connectType0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadConnectTypeSpec.encode(connectType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(connectType0);
        }
        var connectReason = protoInputObject.connectReason();
        if (connectReason != null) {
            var connectReason0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadConnectReasonSpec.encode(connectReason);
            protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(connectReason0);
        }
        if (protoInputObject.shards() != null) {
            for (var shardsEntry : protoInputObject.shards()) { 
                if (shardsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(14, 0);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(shardsEntry);
                }
            }
        }
        var dnsSource = protoInputObject.dnsSource();
        if (dnsSource != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
            var dnsSourceSerializedSize = it.auties.whatsapp.model.signal.auth.DNSSourceSpec.sizeOf(dnsSource);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(dnsSourceSerializedSize);
            protoOutputSize += dnsSourceSerializedSize;
        }
        var connectAttemptCount = protoInputObject.connectAttemptCount();
        if (connectAttemptCount != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(16, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(connectAttemptCount);
        }
        var device = protoInputObject.device();
        if (device != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(18, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(device);
        }
        var regData = protoInputObject.regData();
        if (regData != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
            var regDataSerializedSize = it.auties.whatsapp.model.signal.auth.CompanionRegistrationDataSpec.sizeOf(regData);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(regDataSerializedSize);
            protoOutputSize += regDataSerializedSize;
        }
        var product = protoInputObject.product();
        if (product != null) {
            var product0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadProductSpec.encode(product);
            protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(product0);
        }
        var fbCat = protoInputObject.fbCat();
        if (fbCat != null) {
            var fbCat0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fbCat);
            if (fbCat0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(fbCat0);
            }
        }
        var fbUserAgent = protoInputObject.fbUserAgent();
        if (fbUserAgent != null) {
            var fbUserAgent0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fbUserAgent);
            if (fbUserAgent0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(fbUserAgent0);
            }
        }
        var oc = protoInputObject.oc();
        if (oc != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(23, 0);
            protoOutputSize += 1;
        }
        var lc = protoInputObject.lc();
        if (lc != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(24, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(lc);
        }
        var iosAppExtension = protoInputObject.iosAppExtension();
        if (iosAppExtension != null) {
            var iosAppExtension0 = it.auties.whatsapp.model.signal.auth.ClientPayloadClientPayloadIOSAppExtensionSpec.encode(iosAppExtension);
            protoOutputSize += ProtobufOutputStream.getFieldSize(30, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(iosAppExtension0);
        }
        var fbAppId = protoInputObject.fbAppId();
        if (fbAppId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(31, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(fbAppId);
        }
        var fbDeviceId = protoInputObject.fbDeviceId();
        if (fbDeviceId != null) {
            var fbDeviceId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(fbDeviceId);
            if (fbDeviceId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(32, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(fbDeviceId0);
            }
        }
        var pull = protoInputObject.pull();
        if (pull != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(33, 0);
            protoOutputSize += 1;
        }
        return protoOutputSize;
    }

}
