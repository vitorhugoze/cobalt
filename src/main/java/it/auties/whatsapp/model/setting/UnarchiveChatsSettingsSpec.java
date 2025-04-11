package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.UnarchiveChatsSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class UnarchiveChatsSettingsSpec {
    public static byte[] encode(UnarchiveChatsSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(UnarchiveChatsSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var unarchiveChats = protoInputObject.unarchiveChats();
        protoOutputStream.writeBool(1, unarchiveChats);
    }

    public static UnarchiveChatsSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static UnarchiveChatsSettings decode(ProtobufInputStream protoInputStream) {
        boolean unarchiveChats = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> unarchiveChats = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.UnarchiveChatsSettings(unarchiveChats);
    }

    public static int sizeOf(UnarchiveChatsSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var unarchiveChats = protoInputObject.unarchiveChats();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
