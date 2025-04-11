package it.auties.whatsapp.model.media;

import it.auties.whatsapp.model.media.MediaData;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MediaDataSpec {
    public static byte[] encode(MediaData protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MediaData protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var localPath = protoInputObject.localPath();
        if (localPath != null) {
            var localPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(localPath);
            if (localPath0 != null) {
                protoOutputStream.writeString(1, localPath0);
            }
        }
    }

    public static MediaData decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MediaData decode(ProtobufInputStream protoInputStream) {
        java.lang.String localPath = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> localPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.media.MediaData(localPath);
    }

    public static int sizeOf(MediaData protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var localPath = protoInputObject.localPath();
        if (localPath != null) {
            var localPath0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(localPath);
            if (localPath0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(localPath0);
            }
        }
        return protoOutputSize;
    }

}
