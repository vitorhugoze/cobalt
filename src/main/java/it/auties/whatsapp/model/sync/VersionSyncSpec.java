package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.VersionSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class VersionSyncSpec {
    public static byte[] encode(VersionSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(VersionSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputStream.writeUInt64(1, version);
        }
    }

    public static VersionSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static VersionSync decode(ProtobufInputStream protoInputStream) {
        java.lang.Long version = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> version = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.VersionSync(version);
    }

    public static int sizeOf(VersionSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        }
        return protoOutputSize;
    }

}
