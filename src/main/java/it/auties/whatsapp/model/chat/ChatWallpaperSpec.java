package it.auties.whatsapp.model.chat;

import it.auties.whatsapp.model.chat.ChatWallpaper;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ChatWallpaperSpec {
    public static byte[] encode(ChatWallpaper protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ChatWallpaper protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var filename = protoInputObject.filename();
        if (filename != null) {
            var filename0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(filename);
            if (filename0 != null) {
                protoOutputStream.writeString(1, filename0);
            }
        }
        var opacity = protoInputObject.opacity();
        protoOutputStream.writeUInt32(2, opacity);
    }

    public static ChatWallpaper decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ChatWallpaper decode(ProtobufInputStream protoInputStream) {
        java.lang.String filename = null;
        int opacity = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> filename = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> opacity = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.chat.ChatWallpaper(filename, opacity);
    }

    public static int sizeOf(ChatWallpaper protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var filename = protoInputObject.filename();
        if (filename != null) {
            var filename0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(filename);
            if (filename0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(filename0);
            }
        }
        var opacity = protoInputObject.opacity();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(opacity);
        return protoOutputSize;
    }

}
