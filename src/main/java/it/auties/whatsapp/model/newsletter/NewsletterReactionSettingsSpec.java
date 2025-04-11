package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterReactionSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterReactionSettingsSpec {
    public static byte[] encode(NewsletterReactionSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterReactionSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var value = protoInputObject.value();
        if (value != null) {
            var value0 = it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsTypeSpec.encode(value);
            protoOutputStream.writeInt32(1, value0);
        }
        if (protoInputObject.blockedCodes() != null) {
            for (var blockedCodesEntry : protoInputObject.blockedCodes()) { 
                if (blockedCodesEntry != null) {
                    var blockedCodes0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(blockedCodesEntry);
                    if (blockedCodes0 != null) {
                        protoOutputStream.writeString(2, blockedCodes0);
                    }
                }
            }
        }
        var enabledTimestampSeconds = protoInputObject.enabledTimestampSeconds();
        if (enabledTimestampSeconds != null) {
            var enabledTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(enabledTimestampSeconds);
            if (enabledTimestampSeconds0 != null) {
                protoOutputStream.writeUInt64(3, enabledTimestampSeconds0);
            }
        }
    }

    public static NewsletterReactionSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterReactionSettings decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.newsletter.NewsletterReactionSettings.Type value = null;
        java.util.List<java.lang.String> blockedCodes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.util.OptionalLong enabledTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> value = it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> blockedCodes.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> enabledTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(protoInputStream.readInt64());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterReactionSettings(value, blockedCodes, enabledTimestampSeconds);
    }

    public static int sizeOf(NewsletterReactionSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var value = protoInputObject.value();
        if (value != null) {
            var value0 = it.auties.whatsapp.model.newsletter.NewsletterReactionSettingsTypeSpec.encode(value);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(value0);
        }
        if (protoInputObject.blockedCodes() != null) {
            for (var blockedCodesEntry : protoInputObject.blockedCodes()) { 
                if (blockedCodesEntry != null) {
                    var blockedCodesEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(blockedCodesEntry);
                    if (blockedCodesEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(blockedCodesEntry0);
                    }
                }
            }
        }
        var enabledTimestampSeconds = protoInputObject.enabledTimestampSeconds();
        if (enabledTimestampSeconds != null) {
            var enabledTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(enabledTimestampSeconds);
            if (enabledTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(enabledTimestampSeconds0);
            }
        }
        return protoOutputSize;
    }

}
