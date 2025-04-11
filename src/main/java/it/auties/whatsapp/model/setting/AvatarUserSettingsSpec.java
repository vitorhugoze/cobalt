package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.AvatarUserSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AvatarUserSettingsSpec {
    public static byte[] encode(AvatarUserSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AvatarUserSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var facebookId = protoInputObject.facebookId();
        if (facebookId != null) {
            var facebookId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(facebookId);
            if (facebookId0 != null) {
                protoOutputStream.writeString(1, facebookId0);
            }
        }
        var password = protoInputObject.password();
        if (password != null) {
            var password0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(password);
            if (password0 != null) {
                protoOutputStream.writeString(2, password0);
            }
        }
    }

    public static AvatarUserSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AvatarUserSettings decode(ProtobufInputStream protoInputStream) {
        java.lang.String facebookId = null;
        java.lang.String password = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> facebookId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> password = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.AvatarUserSettings(facebookId, password);
    }

    public static int sizeOf(AvatarUserSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var facebookId = protoInputObject.facebookId();
        if (facebookId != null) {
            var facebookId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(facebookId);
            if (facebookId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(facebookId0);
            }
        }
        var password = protoInputObject.password();
        if (password != null) {
            var password0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(password);
            if (password0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(password0);
            }
        }
        return protoOutputSize;
    }

}
