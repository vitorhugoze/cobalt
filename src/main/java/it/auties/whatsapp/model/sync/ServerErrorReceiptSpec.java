package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ServerErrorReceipt;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ServerErrorReceiptSpec {
    public static byte[] encode(ServerErrorReceipt protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ServerErrorReceipt protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var stanzaId = protoInputObject.stanzaId();
        if (stanzaId != null) {
            var stanzaId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(stanzaId);
            if (stanzaId0 != null) {
                protoOutputStream.writeString(1, stanzaId0);
            }
        }
    }

    public static ServerErrorReceipt decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ServerErrorReceipt decode(ProtobufInputStream protoInputStream) {
        java.lang.String stanzaId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> stanzaId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ServerErrorReceipt(stanzaId);
    }

    public static int sizeOf(ServerErrorReceipt protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var stanzaId = protoInputObject.stanzaId();
        if (stanzaId != null) {
            var stanzaId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(stanzaId);
            if (stanzaId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(stanzaId0);
            }
        }
        return protoOutputSize;
    }

}
