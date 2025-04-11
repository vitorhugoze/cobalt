package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.ClientFinish;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ClientFinishSpec {
    public static byte[] encode(ClientFinish protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ClientFinish protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var _static = protoInputObject._static();
        if (_static != null) {
            var _static0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(_static);
            if (_static0 != null) {
                protoOutputStream.writeBytes(1, _static0);
            }
        }
        var payload = protoInputObject.payload();
        if (payload != null) {
            var payload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(payload);
            if (payload0 != null) {
                protoOutputStream.writeBytes(2, payload0);
            }
        }
    }

    public static ClientFinish decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ClientFinish decode(ProtobufInputStream protoInputStream) {
        byte[] _static = null;
        byte[] payload = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> _static = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> payload = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.ClientFinish(_static, payload);
    }

    public static int sizeOf(ClientFinish protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var _static = protoInputObject._static();
        if (_static != null) {
            var _static0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(_static);
            if (_static0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(_static0);
            }
        }
        var payload = protoInputObject.payload();
        if (payload != null) {
            var payload0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(payload);
            if (payload0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(payload0);
            }
        }
        return protoOutputSize;
    }

}
