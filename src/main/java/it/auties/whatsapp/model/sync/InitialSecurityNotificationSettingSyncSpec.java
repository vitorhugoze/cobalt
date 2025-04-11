package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InitialSecurityNotificationSettingSyncSpec {
    public static byte[] encode(InitialSecurityNotificationSettingSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InitialSecurityNotificationSettingSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var securityNotificationEnabled = protoInputObject.securityNotificationEnabled();
        protoOutputStream.writeBool(1, securityNotificationEnabled);
    }

    public static InitialSecurityNotificationSettingSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InitialSecurityNotificationSettingSync decode(ProtobufInputStream protoInputStream) {
        boolean securityNotificationEnabled = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> securityNotificationEnabled = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync(securityNotificationEnabled);
    }

    public static int sizeOf(InitialSecurityNotificationSettingSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var securityNotificationEnabled = protoInputObject.securityNotificationEnabled();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
