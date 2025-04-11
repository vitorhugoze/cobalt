package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.DeviceIdentity;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DeviceIdentitySpec {
    public static byte[] encode(DeviceIdentity protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DeviceIdentity protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var rawId = protoInputObject.rawId();
        protoOutputStream.writeUInt32(1, rawId);
        var timestamp = protoInputObject.timestamp();
        protoOutputStream.writeUInt64(2, timestamp);
        var keyIndex = protoInputObject.keyIndex();
        protoOutputStream.writeUInt32(3, keyIndex);
    }

    public static DeviceIdentity decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DeviceIdentity decode(ProtobufInputStream protoInputStream) {
        int rawId = 0;
        long timestamp = 0l;
        int keyIndex = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> rawId = protoInputStream.readInt32();
                case 2 -> timestamp = protoInputStream.readInt64();
                case 3 -> keyIndex = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.DeviceIdentity(rawId, timestamp, keyIndex);
    }

    public static int sizeOf(DeviceIdentity protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var rawId = protoInputObject.rawId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(rawId);
        var timestamp = protoInputObject.timestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestamp);
        var keyIndex = protoInputObject.keyIndex();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(keyIndex);
        return protoOutputSize;
    }

}
