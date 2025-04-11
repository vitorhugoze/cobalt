package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.PrimaryVersionAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PrimaryVersionActionSpec {
    public static byte[] encode(PrimaryVersionAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PrimaryVersionAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var version = protoInputObject.version();
        if (version != null) {
            var version0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(version);
            if (version0 != null) {
                protoOutputStream.writeString(1, version0);
            }
        }
    }

    public static PrimaryVersionAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PrimaryVersionAction decode(ProtobufInputStream protoInputStream) {
        java.lang.String version = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> version = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.PrimaryVersionAction(version);
    }

    public static int sizeOf(PrimaryVersionAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var version = protoInputObject.version();
        if (version != null) {
            var version0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(version);
            if (version0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(version0);
            }
        }
        return protoOutputSize;
    }

}
