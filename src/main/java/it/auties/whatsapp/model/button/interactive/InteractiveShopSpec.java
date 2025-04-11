package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveShop;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveShopSpec {
    public static byte[] encode(InteractiveShop protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveShop protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputStream.writeString(1, id0);
            }
        }
        var surfaceType = protoInputObject.surfaceType();
        if (surfaceType != null) {
            var surfaceType0 = it.auties.whatsapp.model.button.interactive.InteractiveShopSurfaceTypeSpec.encode(surfaceType);
            protoOutputStream.writeInt32(2, surfaceType0);
        }
        var version = protoInputObject.version();
        protoOutputStream.writeInt32(3, version);
    }

    public static InteractiveShop decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveShop decode(ProtobufInputStream protoInputStream) {
        java.lang.String id = null;
        it.auties.whatsapp.model.button.interactive.InteractiveShop.SurfaceType surfaceType = null;
        int version = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> surfaceType = it.auties.whatsapp.model.button.interactive.InteractiveShopSurfaceTypeSpec.decode(protoInputStream.readInt32());
                case 3 -> version = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractiveShop(id, surfaceType, version);
    }

    public static int sizeOf(InteractiveShop protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        if (id != null) {
            var id0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(id);
            if (id0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(id0);
            }
        }
        var surfaceType = protoInputObject.surfaceType();
        if (surfaceType != null) {
            var surfaceType0 = it.auties.whatsapp.model.button.interactive.InteractiveShopSurfaceTypeSpec.encode(surfaceType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(surfaceType0);
        }
        var version = protoInputObject.version();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        return protoOutputSize;
    }

}
