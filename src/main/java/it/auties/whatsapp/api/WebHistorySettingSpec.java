package it.auties.whatsapp.api;

import it.auties.whatsapp.api.WebHistorySetting;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class WebHistorySettingSpec {
    public static byte[] encode(WebHistorySetting protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(WebHistorySetting protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var size = protoInputObject.size;
        protoOutputStream.writeInt32(1, size);
        var newsletters = protoInputObject.newsletters;
        protoOutputStream.writeBool(2, newsletters);
    }

    public static WebHistorySetting decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static WebHistorySetting decode(ProtobufInputStream protoInputStream) {
        int size = 0;
        boolean newsletters = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> size = protoInputStream.readInt32();
                case 2 -> newsletters = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.api.WebHistorySetting(size, newsletters);
    }

    public static int sizeOf(WebHistorySetting protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var size = protoInputObject.size;
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(size);
        var newsletters = protoInputObject.newsletters;
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
