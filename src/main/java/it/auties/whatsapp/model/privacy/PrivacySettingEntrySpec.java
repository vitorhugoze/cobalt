package it.auties.whatsapp.model.privacy;

import it.auties.whatsapp.model.privacy.PrivacySettingEntry;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PrivacySettingEntrySpec {
    public static byte[] encode(PrivacySettingEntry protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PrivacySettingEntry protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.whatsapp.model.privacy.PrivacySettingTypeSpec.encode(type);
            protoOutputStream.writeInt32(1, type0);
        }
        var value = protoInputObject.value();
        if (value != null) {
            var value0 = it.auties.whatsapp.model.privacy.PrivacySettingValueSpec.encode(value);
            protoOutputStream.writeInt32(2, value0);
        }
        if (protoInputObject.excluded() != null) {
            for (var excludedEntry : protoInputObject.excluded()) { 
                if (excludedEntry != null) {
                    var excluded0 = excludedEntry.toString();
                    if (excluded0 != null) {
                        var excluded1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(excluded0);
                        if (excluded1 != null) {
                            protoOutputStream.writeString(3, excluded1);
                        }
                    }
                }
            }
        }
    }

    public static PrivacySettingEntry decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PrivacySettingEntry decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.privacy.PrivacySettingType type = null;
        it.auties.whatsapp.model.privacy.PrivacySettingValue value = null;
        java.util.List<it.auties.whatsapp.model.jid.Jid> excluded = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> type = it.auties.whatsapp.model.privacy.PrivacySettingTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> value = it.auties.whatsapp.model.privacy.PrivacySettingValueSpec.decode(protoInputStream.readInt32());
                case 3 -> excluded.add(it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString())));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.privacy.PrivacySettingEntry(type, value, excluded);
    }

    public static int sizeOf(PrivacySettingEntry protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.whatsapp.model.privacy.PrivacySettingTypeSpec.encode(type);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(type0);
        }
        var value = protoInputObject.value();
        if (value != null) {
            var value0 = it.auties.whatsapp.model.privacy.PrivacySettingValueSpec.encode(value);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(value0);
        }
        if (protoInputObject.excluded() != null) {
            for (var excludedEntry : protoInputObject.excluded()) { 
                if (excludedEntry != null) {
                    var excludedEntry0 = excludedEntry.toString();
                    if (excludedEntry0 != null) {
                        var excludedEntry1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(excludedEntry0);
                        if (excludedEntry1 != null) {
                            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                            protoOutputSize += ProtobufOutputStream.getStringSize(excludedEntry1);
                        }
                    }
                }
            }
        }
        return protoOutputSize;
    }

}
