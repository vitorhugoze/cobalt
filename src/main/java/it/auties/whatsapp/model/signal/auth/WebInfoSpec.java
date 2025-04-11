package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.WebInfo;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class WebInfoSpec {
    public static byte[] encode(WebInfo protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(WebInfo protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var refToken = protoInputObject.refToken();
        if (refToken != null) {
            var refToken0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(refToken);
            if (refToken0 != null) {
                protoOutputStream.writeString(1, refToken0);
            }
        }
        var version = protoInputObject.version();
        if (version != null) {
            var version0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(version);
            if (version0 != null) {
                protoOutputStream.writeString(2, version0);
            }
        }
        var webPayload = protoInputObject.webPayload();
        if (webPayload != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.signal.auth.WebPayloadSpec.sizeOf(webPayload));
            it.auties.whatsapp.model.signal.auth.WebPayloadSpec.encode(webPayload, protoOutputStream);
        }
        var webSubPlatform = protoInputObject.webSubPlatform();
        if (webSubPlatform != null) {
            var webSubPlatform0 = it.auties.whatsapp.model.signal.auth.WebInfoPlatformSpec.encode(webSubPlatform);
            protoOutputStream.writeInt32(4, webSubPlatform0);
        }
    }

    public static WebInfo decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static WebInfo decode(ProtobufInputStream protoInputStream) {
        java.lang.String refToken = null;
        java.lang.String version = null;
        it.auties.whatsapp.model.signal.auth.WebPayload webPayload = null;
        it.auties.whatsapp.model.signal.auth.WebInfo.Platform webSubPlatform = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> refToken = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> version = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> webPayload = it.auties.whatsapp.model.signal.auth.WebPayloadSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> webSubPlatform = it.auties.whatsapp.model.signal.auth.WebInfoPlatformSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.WebInfo(refToken, version, webPayload, webSubPlatform);
    }

    public static int sizeOf(WebInfo protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var refToken = protoInputObject.refToken();
        if (refToken != null) {
            var refToken0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(refToken);
            if (refToken0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(refToken0);
            }
        }
        var version = protoInputObject.version();
        if (version != null) {
            var version0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(version);
            if (version0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(version0);
            }
        }
        var webPayload = protoInputObject.webPayload();
        if (webPayload != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var webPayloadSerializedSize = it.auties.whatsapp.model.signal.auth.WebPayloadSpec.sizeOf(webPayload);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(webPayloadSerializedSize);
            protoOutputSize += webPayloadSerializedSize;
        }
        var webSubPlatform = protoInputObject.webSubPlatform();
        if (webSubPlatform != null) {
            var webSubPlatform0 = it.auties.whatsapp.model.signal.auth.WebInfoPlatformSpec.encode(webSubPlatform);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(webSubPlatform0);
        }
        return protoOutputSize;
    }

}
