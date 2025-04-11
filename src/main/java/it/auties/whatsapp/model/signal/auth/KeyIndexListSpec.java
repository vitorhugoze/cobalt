package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.KeyIndexList;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class KeyIndexListSpec {
    public static byte[] encode(KeyIndexList protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(KeyIndexList protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var rawId = protoInputObject.rawId();
        protoOutputStream.writeUInt32(1, rawId);
        var timestamp = protoInputObject.timestamp();
        protoOutputStream.writeUInt64(2, timestamp);
        var currentIndex = protoInputObject.currentIndex();
        protoOutputStream.writeUInt32(3, currentIndex);
        if (protoInputObject.validIndexes() != null) {
            for (var validIndexesEntry : protoInputObject.validIndexes()) { 
                if (validIndexesEntry != null) {
                    protoOutputStream.writeUInt32(4, validIndexesEntry);
                }
            }
        }
    }

    public static KeyIndexList decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static KeyIndexList decode(ProtobufInputStream protoInputStream) {
        int rawId = 0;
        long timestamp = 0l;
        int currentIndex = 0;
        java.util.List<java.lang.Integer> validIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> rawId = protoInputStream.readInt32();
                case 2 -> timestamp = protoInputStream.readInt64();
                case 3 -> currentIndex = protoInputStream.readInt32();
                case 4 -> validIndexes.add(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.KeyIndexList(rawId, timestamp, currentIndex, validIndexes);
    }

    public static int sizeOf(KeyIndexList protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var rawId = protoInputObject.rawId();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(rawId);
        var timestamp = protoInputObject.timestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestamp);
        var currentIndex = protoInputObject.currentIndex();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(currentIndex);
        if (protoInputObject.validIndexes() != null) {
            for (var validIndexesEntry : protoInputObject.validIndexes()) { 
                if (validIndexesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(validIndexesEntry);
                }
            }
        }
        return protoOutputSize;
    }

}
