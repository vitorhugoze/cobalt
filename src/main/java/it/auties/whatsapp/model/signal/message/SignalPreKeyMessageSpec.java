package it.auties.whatsapp.model.signal.message;

import it.auties.whatsapp.model.signal.message.SignalPreKeyMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SignalPreKeyMessageSpec {
    public static byte[] encode(SignalPreKeyMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SignalPreKeyMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var preKeyId = protoInputObject.preKeyId();
        if (preKeyId != null) {
            protoOutputStream.writeUInt32(1, preKeyId);
        }
        var baseKey = protoInputObject.baseKey();
        if (baseKey != null) {
            var baseKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(baseKey);
            if (baseKey0 != null) {
                protoOutputStream.writeBytes(2, baseKey0);
            }
        }
        var identityKey = protoInputObject.identityKey();
        if (identityKey != null) {
            var identityKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(identityKey);
            if (identityKey0 != null) {
                protoOutputStream.writeBytes(3, identityKey0);
            }
        }
        var serializedSignalMessage = protoInputObject.serializedSignalMessage();
        if (serializedSignalMessage != null) {
            var serializedSignalMessage0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(serializedSignalMessage);
            if (serializedSignalMessage0 != null) {
                protoOutputStream.writeBytes(4, serializedSignalMessage0);
            }
        }
        var registrationId = protoInputObject.registrationId();
        if (registrationId != null) {
            protoOutputStream.writeUInt32(5, registrationId);
        }
        var signedPreKeyId = protoInputObject.signedPreKeyId();
        if (signedPreKeyId != null) {
            protoOutputStream.writeUInt32(6, signedPreKeyId);
        }
    }

    public static SignalPreKeyMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SignalPreKeyMessage decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer preKeyId = null;
        byte[] baseKey = null;
        byte[] identityKey = null;
        byte[] serializedSignalMessage = null;
        java.lang.Integer registrationId = null;
        java.lang.Integer signedPreKeyId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> preKeyId = protoInputStream.readInt32();
                case 2 -> baseKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> identityKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> serializedSignalMessage = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> registrationId = protoInputStream.readInt32();
                case 6 -> signedPreKeyId = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.message.SignalPreKeyMessage(preKeyId, baseKey, identityKey, serializedSignalMessage, registrationId, signedPreKeyId);
    }

    public static int sizeOf(SignalPreKeyMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var preKeyId = protoInputObject.preKeyId();
        if (preKeyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(preKeyId);
        }
        var baseKey = protoInputObject.baseKey();
        if (baseKey != null) {
            var baseKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(baseKey);
            if (baseKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(baseKey0);
            }
        }
        var identityKey = protoInputObject.identityKey();
        if (identityKey != null) {
            var identityKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(identityKey);
            if (identityKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(identityKey0);
            }
        }
        var serializedSignalMessage = protoInputObject.serializedSignalMessage();
        if (serializedSignalMessage != null) {
            var serializedSignalMessage0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(serializedSignalMessage);
            if (serializedSignalMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(serializedSignalMessage0);
            }
        }
        var registrationId = protoInputObject.registrationId();
        if (registrationId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(registrationId);
        }
        var signedPreKeyId = protoInputObject.signedPreKeyId();
        if (signedPreKeyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(signedPreKeyId);
        }
        return protoOutputSize;
    }

}
