package it.auties.whatsapp.model.signal.session;

import it.auties.whatsapp.model.signal.session.SessionChain;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SessionChainSpec {
    public static byte[] encode(SessionChain protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SessionChain protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var counter = protoInputObject.counter();
        if (counter != null) {
            var counter0 = it.auties.protobuf.builtin.ProtobufAtomicMixin.toInt(counter);
            protoOutputStream.writeInt32(1, counter0);
        }
        var key = protoInputObject.key();
        if (key != null) {
            var key0 = it.auties.protobuf.builtin.ProtobufAtomicMixin.toValue(key);
            if (key0 != null) {
                var key1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(key0);
                if (key1 != null) {
                    protoOutputStream.writeBytes(2, key1);
                }
            }
        }
        if (protoInputObject.messageKeys() != null) {
            for (var messageKeysEntry : protoInputObject.messageKeys().entrySet()) { 
                protoOutputStream.writeMessage(3, sizeOfMessageKeys(messageKeysEntry));
                protoOutputStream.writeInt32(1, messageKeysEntry.getKey());
                var messageKeysValue = messageKeysEntry.getValue();
                if (messageKeysValue != null) {
                    var messageKeysValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageKeysValue);
                    if (messageKeysValue0 != null) {
                        protoOutputStream.writeBytes(2, messageKeysValue0);
                    }
                }
            }
        }
    }

    public static SessionChain decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SessionChain decode(ProtobufInputStream protoInputStream) {
        java.util.concurrent.atomic.AtomicInteger counter = it.auties.protobuf.builtin.ProtobufAtomicMixin.newAtomicInt();
        java.util.concurrent.atomic.AtomicReference<byte[]> key = it.auties.protobuf.builtin.ProtobufAtomicMixin.newAtomicReference();
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer,byte[]> messageKeys = new java.util.concurrent.ConcurrentHashMap();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> counter = it.auties.protobuf.builtin.ProtobufAtomicMixin.ofAtomic(protoInputStream.readInt32());
                case 2 -> key = it.auties.protobuf.builtin.ProtobufAtomicMixin.ofAtomic(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                case 3 -> {
                    var messageKeysInputStream = protoInputStream.readLengthDelimited();
                    java.lang.Integer messageKeysKey = null;
                    byte[] messageKeysValue = null;
                    while (messageKeysInputStream.readTag()) {
                        switch (messageKeysInputStream.index()) {
                            case 1 -> messageKeysKey = messageKeysInputStream.readInt32();
                            case 2 -> messageKeysValue = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(messageKeysInputStream.readBytes());
                        }
                    }
                    messageKeys.put(messageKeysKey, messageKeysValue);
                }
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.session.SessionChain(counter, key, messageKeys);
    }

    public static int sizeOf(SessionChain protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var counter = protoInputObject.counter();
        if (counter != null) {
            var counter0 = it.auties.protobuf.builtin.ProtobufAtomicMixin.toInt(counter);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(counter0);
        }
        var key = protoInputObject.key();
        if (key != null) {
            var key0 = it.auties.protobuf.builtin.ProtobufAtomicMixin.toValue(key);
            if (key0 != null) {
                var key1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(key0);
                if (key1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(key1);
                }
            }
        }
        var messageKeysMapField = protoInputObject.messageKeys();
        if (messageKeysMapField != null) {
            for (var messageKeysMapEntry : messageKeysMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var messageKeysMapEntrySize = sizeOfMessageKeys(messageKeysMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(messageKeysMapEntrySize);
                protoOutputSize += messageKeysMapEntrySize;
            }
        }
        return protoOutputSize;
    }

    private static int sizeOfMessageKeys(java.util.Map.Entry<java.lang.Integer, byte[]> protoInputObject) {
        var protoOutputSize = 0;
        var messageKeysMapKey = protoInputObject.getKey();
        if (messageKeysMapKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageKeysMapKey);
        }
        var messageKeysMapValue = protoInputObject.getValue();
        if (messageKeysMapValue != null) {
            var messageKeysMapValue0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageKeysMapValue);
            if (messageKeysMapValue0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(messageKeysMapValue0);
            }
        }
        return protoOutputSize;
    }

}
