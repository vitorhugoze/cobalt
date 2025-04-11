package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.SecurityNotificationSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SecurityNotificationSettingsSpec {
    public static byte[] encode(SecurityNotificationSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SecurityNotificationSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var showNotification = protoInputObject.showNotification();
        protoOutputStream.writeBool(1, showNotification);
    }

    public static SecurityNotificationSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SecurityNotificationSettings decode(ProtobufInputStream protoInputStream) {
        boolean showNotification = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> showNotification = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.SecurityNotificationSettings(showNotification);
    }

    public static int sizeOf(SecurityNotificationSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var showNotification = protoInputObject.showNotification();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
