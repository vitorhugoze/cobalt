package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.MuteAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MuteActionSpec {
    public static byte[] encode(MuteAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MuteAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var muted = protoInputObject.muted();
        protoOutputStream.writeBool(1, muted);
        var muteEndTimestampSeconds = protoInputObject.muteEndTimestampSeconds();
        if (muteEndTimestampSeconds != null) {
            var muteEndTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(muteEndTimestampSeconds);
            if (muteEndTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(2, muteEndTimestampSeconds0);
            }
        }
        var autoMuted = protoInputObject.autoMuted();
        protoOutputStream.writeBool(3, autoMuted);
    }

    public static MuteAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MuteAction decode(ProtobufInputStream protoInputStream) {
        boolean muted = false;
        java.util.OptionalLong muteEndTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
        boolean autoMuted = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> muted = protoInputStream.readBool();
                case 2 -> muteEndTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(protoInputStream.readInt64());
                case 3 -> autoMuted = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.MuteAction(muted, muteEndTimestampSeconds, autoMuted);
    }

    public static int sizeOf(MuteAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var muted = protoInputObject.muted();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var muteEndTimestampSeconds = protoInputObject.muteEndTimestampSeconds();
        if (muteEndTimestampSeconds != null) {
            var muteEndTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(muteEndTimestampSeconds);
            if (muteEndTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(muteEndTimestampSeconds0);
            }
        }
        var autoMuted = protoInputObject.autoMuted();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
