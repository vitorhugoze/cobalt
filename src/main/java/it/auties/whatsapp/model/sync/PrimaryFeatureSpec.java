package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.PrimaryFeature;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PrimaryFeatureSpec {
    public static byte[] encode(PrimaryFeature protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PrimaryFeature protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.flags() != null) {
            for (var flagsEntry : protoInputObject.flags()) { 
                if (flagsEntry != null) {
                    var flags0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(flagsEntry);
                    if (flags0 != null) {
                        protoOutputStream.writeString(1, flags0);
                    }
                }
            }
        }
    }

    public static PrimaryFeature decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PrimaryFeature decode(ProtobufInputStream protoInputStream) {
        java.util.List<java.lang.String> flags = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> flags.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.PrimaryFeature(flags);
    }

    public static int sizeOf(PrimaryFeature protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.flags() != null) {
            for (var flagsEntry : protoInputObject.flags()) { 
                if (flagsEntry != null) {
                    var flagsEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(flagsEntry);
                    if (flagsEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(flagsEntry0);
                    }
                }
            }
        }
        return protoOutputSize;
    }

}
