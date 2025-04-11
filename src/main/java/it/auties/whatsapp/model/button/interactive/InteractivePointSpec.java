package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractivePoint;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractivePointSpec {
    public static byte[] encode(InteractivePoint protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractivePoint protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var xDeprecated = protoInputObject.xDeprecated();
        protoOutputStream.writeInt32(1, xDeprecated);
        var yDeprecated = protoInputObject.yDeprecated();
        protoOutputStream.writeInt32(2, yDeprecated);
        var x = protoInputObject.x();
        protoOutputStream.writeDouble(3, x);
        var y = protoInputObject.y();
        protoOutputStream.writeDouble(4, y);
    }

    public static InteractivePoint decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractivePoint decode(ProtobufInputStream protoInputStream) {
        int xDeprecated = 0;
        int yDeprecated = 0;
        double x = 0d;
        double y = 0d;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> xDeprecated = protoInputStream.readInt32();
                case 2 -> yDeprecated = protoInputStream.readInt32();
                case 3 -> x = protoInputStream.readDouble();
                case 4 -> y = protoInputStream.readDouble();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractivePoint(xDeprecated, yDeprecated, x, y);
    }

    public static int sizeOf(InteractivePoint protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var xDeprecated = protoInputObject.xDeprecated();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(xDeprecated);
        var yDeprecated = protoInputObject.yDeprecated();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(yDeprecated);
        var x = protoInputObject.x();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 1);
        protoOutputSize += 8;
        var y = protoInputObject.y();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 1);
        protoOutputSize += 8;
        return protoOutputSize;
    }

}
