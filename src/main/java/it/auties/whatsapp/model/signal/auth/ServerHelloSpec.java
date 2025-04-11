package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ServerHello;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ServerHelloSpec {
    public static byte[] encode(ServerHello protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ServerHello protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var ephemeral = protoInputObject.ephemeral();
        if (ephemeral != null) {
            var ephemeral0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ephemeral);
            if (ephemeral0 != null) {
                protoOutputStream.writeBytes(1, ephemeral0);
            }
        }
        var staticText = protoInputObject.staticText();
        if (staticText != null) {
            var staticText0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(staticText);
            if (staticText0 != null) {
                protoOutputStream.writeBytes(2, staticText0);
            }
        }
        var payload = protoInputObject.payload();
        if (payload != null) {
            var payload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(payload);
            if (payload0 != null) {
                protoOutputStream.writeBytes(3, payload0);
            }
        }
    }

    public static ServerHello decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ServerHello decode(ProtobufInputStream protoInputStream) {
        byte[] ephemeral = null;
        byte[] staticText = null;
        byte[] payload = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> ephemeral = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> staticText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> payload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.ServerHello(ephemeral, staticText, payload);
    }

    public static int sizeOf(ServerHello protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var ephemeral = protoInputObject.ephemeral();
        if (ephemeral != null) {
            var ephemeral0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(ephemeral);
            if (ephemeral0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(ephemeral0);
            }
        }
        var staticText = protoInputObject.staticText();
        if (staticText != null) {
            var staticText0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(staticText);
            if (staticText0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(staticText0);
            }
        }
        var payload = protoInputObject.payload();
        if (payload != null) {
            var payload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(payload);
            if (payload0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(payload0);
            }
        }
        return protoOutputSize;
    }

}
