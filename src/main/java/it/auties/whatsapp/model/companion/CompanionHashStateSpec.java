package it.auties.whatsapp.model.companion;

import it.auties.whatsapp.model.companion.CompanionHashState;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CompanionHashStateSpec {
    public static byte[] encode(CompanionHashState protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CompanionHashState protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.whatsapp.model.sync.PatchTypeSpec.encode(type);
            protoOutputStream.writeInt32(1, type0);
        }
        var version = protoInputObject.version();
        protoOutputStream.writeInt64(2, version);
        var hash = protoInputObject.hash();
        if (hash != null) {
            var hash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hash);
            if (hash0 != null) {
                protoOutputStream.writeBytes(3, hash0);
            }
        }
        if (protoInputObject.indexValueMap() != null) {
            for (var indexValueMapEntry : protoInputObject.indexValueMap().entrySet()) { 
                protoOutputStream.writeMessage(4, sizeOfIndexValueMap(indexValueMapEntry));
                var indexValueMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(indexValueMapEntry.getKey());
                if (indexValueMapKey0 != null) {
                    protoOutputStream.writeString(1, indexValueMapKey0);
                }
                var indexValueMapValue = indexValueMapEntry.getValue();
                if (indexValueMapValue != null) {
                    var indexValueMapValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(indexValueMapValue);
                    if (indexValueMapValue0 != null) {
                        protoOutputStream.writeBytes(2, indexValueMapValue0);
                    }
                }
            }
        }
    }

    public static CompanionHashState decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CompanionHashState decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.PatchType type = null;
        long version = 0l;
        byte[] hash = null;
        java.util.Map<java.lang.String,byte[]> indexValueMap = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> type = it.auties.whatsapp.model.sync.PatchTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> version = protoInputStream.readInt64();
                case 3 -> hash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> {
                    var indexValueMapInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String indexValueMapKey = null;
                    byte[] indexValueMapValue = null;
                    while (indexValueMapInputStream.readTag()) {
                        switch (indexValueMapInputStream.index()) {
                            case 1 -> indexValueMapKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(indexValueMapInputStream.readString());
                            case 2 -> indexValueMapValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(indexValueMapInputStream.readBytes());
                        }
                    }
                    indexValueMap.put(indexValueMapKey, indexValueMapValue);
                }
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.companion.CompanionHashState(type, version, hash, indexValueMap);
    }

    public static int sizeOf(CompanionHashState protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var type = protoInputObject.type();
        if (type != null) {
            var type0 = it.auties.whatsapp.model.sync.PatchTypeSpec.encode(type);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(type0);
        }
        var version = protoInputObject.version();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        var hash = protoInputObject.hash();
        if (hash != null) {
            var hash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(hash);
            if (hash0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(hash0);
            }
        }
        var indexValueMapMapField = protoInputObject.indexValueMap();
        if (indexValueMapMapField != null) {
            for (var indexValueMapMapEntry : indexValueMapMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var indexValueMapMapEntrySize = sizeOfIndexValueMap(indexValueMapMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(indexValueMapMapEntrySize);
                protoOutputSize += indexValueMapMapEntrySize;
            }
        }
        return protoOutputSize;
    }

    private static int sizeOfIndexValueMap(java.util.Map.Entry<java.lang.String, byte[]> protoInputObject) {
        var protoOutputSize = 0;
        var indexValueMapMapKey = protoInputObject.getKey();
        if (indexValueMapMapKey != null) {
            var indexValueMapMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(indexValueMapMapKey);
            if (indexValueMapMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(indexValueMapMapKey0);
            }
        }
        var indexValueMapMapValue = protoInputObject.getValue();
        if (indexValueMapMapValue != null) {
            var indexValueMapMapValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(indexValueMapMapValue);
            if (indexValueMapMapValue0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(indexValueMapMapValue0);
            }
        }
        return protoOutputSize;
    }

}
