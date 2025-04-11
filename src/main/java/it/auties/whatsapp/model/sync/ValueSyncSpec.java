package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ValueSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ValueSyncSpec {
    public static byte[] encode(ValueSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ValueSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var blob = protoInputObject.blob();
        if (blob != null) {
            var blob0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(blob);
            if (blob0 != null) {
                protoOutputStream.writeBytes(1, blob0);
            }
        }
    }

    public static ValueSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ValueSync decode(ProtobufInputStream protoInputStream) {
        byte[] blob = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> blob = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ValueSync(blob);
    }

    public static int sizeOf(ValueSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var blob = protoInputObject.blob();
        if (blob != null) {
            var blob0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(blob);
            if (blob0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(blob0);
            }
        }
        return protoOutputSize;
    }

}
