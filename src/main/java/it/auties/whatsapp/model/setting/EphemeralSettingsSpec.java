package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.EphemeralSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class EphemeralSettingsSpec {
    public static byte[] encode(EphemeralSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(EphemeralSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var duration = protoInputObject.duration();
        protoOutputStream.writeFixed32(1, duration);
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputStream.writeFixed64(2, timestampSeconds);
    }

    public static EphemeralSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static EphemeralSettings decode(ProtobufInputStream protoInputStream) {
        int duration = 0;
        long timestampSeconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> duration = protoInputStream.readFixed32();
                case 2 -> timestampSeconds = protoInputStream.readFixed64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.EphemeralSettings(duration, timestampSeconds);
    }

    public static int sizeOf(EphemeralSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var duration = protoInputObject.duration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 5);
        protoOutputSize += 4;
        var timestampSeconds = protoInputObject.timestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 1);
        protoOutputSize += 8;
        return protoOutputSize;
    }

}
