package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveLocation;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveLocationSpec {
    public static byte[] encode(InteractiveLocation protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveLocation protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var latitude = protoInputObject.latitude();
        protoOutputStream.writeDouble(1, latitude);
        var longitude = protoInputObject.longitude();
        protoOutputStream.writeDouble(2, longitude);
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(3, name0);
            }
        }
    }

    public static InteractiveLocation decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveLocation decode(ProtobufInputStream protoInputStream) {
        double latitude = 0d;
        double longitude = 0d;
        java.lang.String name = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> latitude = protoInputStream.readDouble();
                case 2 -> longitude = protoInputStream.readDouble();
                case 3 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractiveLocation(latitude, longitude, name);
    }

    public static int sizeOf(InteractiveLocation protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var latitude = protoInputObject.latitude();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 1);
        protoOutputSize += 8;
        var longitude = protoInputObject.longitude();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 1);
        protoOutputSize += 8;
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        return protoOutputSize;
    }

}
