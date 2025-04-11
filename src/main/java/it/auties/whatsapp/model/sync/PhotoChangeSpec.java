package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.PhotoChange;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PhotoChangeSpec {
    public static byte[] encode(PhotoChange protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PhotoChange protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var oldPhoto = protoInputObject.oldPhoto();
        if (oldPhoto != null) {
            var oldPhoto0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(oldPhoto);
            if (oldPhoto0 != null) {
                protoOutputStream.writeBytes(1, oldPhoto0);
            }
        }
        var newPhoto = protoInputObject.newPhoto();
        if (newPhoto != null) {
            var newPhoto0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newPhoto);
            if (newPhoto0 != null) {
                protoOutputStream.writeBytes(2, newPhoto0);
            }
        }
        var newPhotoId = protoInputObject.newPhotoId();
        if (newPhotoId != null) {
            protoOutputStream.writeUInt32(3, newPhotoId);
        }
    }

    public static PhotoChange decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PhotoChange decode(ProtobufInputStream protoInputStream) {
        byte[] oldPhoto = null;
        byte[] newPhoto = null;
        java.lang.Integer newPhotoId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> oldPhoto = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> newPhoto = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> newPhotoId = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.PhotoChange(oldPhoto, newPhoto, newPhotoId);
    }

    public static int sizeOf(PhotoChange protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var oldPhoto = protoInputObject.oldPhoto();
        if (oldPhoto != null) {
            var oldPhoto0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(oldPhoto);
            if (oldPhoto0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(oldPhoto0);
            }
        }
        var newPhoto = protoInputObject.newPhoto();
        if (newPhoto != null) {
            var newPhoto0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(newPhoto);
            if (newPhoto0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(newPhoto0);
            }
        }
        var newPhotoId = protoInputObject.newPhotoId();
        if (newPhotoId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(newPhotoId);
        }
        return protoOutputSize;
    }

}
