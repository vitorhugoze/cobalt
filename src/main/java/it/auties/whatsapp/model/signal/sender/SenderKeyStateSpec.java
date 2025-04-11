package it.auties.whatsapp.model.signal.sender;

import it.auties.whatsapp.model.signal.sender.SenderKeyState;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderKeyStateSpec {
    public static byte[] encode(SenderKeyState protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderKeyState protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var id = protoInputObject.id();
        protoOutputStream.writeInt32(1, id);
        var signingKey = protoInputObject.signingKey();
        if (signingKey != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(signingKey));
            it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.encode(signingKey, protoOutputStream);
        }
        if (protoInputObject.messageKeys() != null) {
            for (var messageKeysEntry : protoInputObject.messageKeys().entrySet()) { 
                protoOutputStream.writeMessage(3, sizeOfMessageKeys(messageKeysEntry));
                protoOutputStream.writeInt32(1, messageKeysEntry.getKey());
                var messageKeysValue = messageKeysEntry.getValue();
                if (messageKeysValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.sender.SenderMessageKeySpec.sizeOf(messageKeysValue));
                    it.auties.whatsapp.model.signal.sender.SenderMessageKeySpec.encode(messageKeysValue, protoOutputStream);
                }
            }
        }
        var chainKey = protoInputObject.chainKey();
        if (chainKey != null) {
            protoOutputStream.writeMessage(4, it.auties.whatsapp.model.signal.sender.SenderChainKeySpec.sizeOf(chainKey));
            it.auties.whatsapp.model.signal.sender.SenderChainKeySpec.encode(chainKey, protoOutputStream);
        }
    }

    public static SenderKeyState decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderKeyState decode(ProtobufInputStream protoInputStream) {
        int id = 0;
        it.auties.whatsapp.model.signal.keypair.SignalKeyPair signingKey = null;
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer,it.auties.whatsapp.model.signal.sender.SenderMessageKey> messageKeys = new java.util.concurrent.ConcurrentHashMap();
        it.auties.whatsapp.model.signal.sender.SenderChainKey chainKey = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> id = protoInputStream.readInt32();
                case 2 -> signingKey = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> {
                    var messageKeysInputStream = protoInputStream.readLengthDelimited();
                    java.lang.Integer messageKeysKey = null;
                    it.auties.whatsapp.model.signal.sender.SenderMessageKey messageKeysValue = null;
                    while (messageKeysInputStream.readTag()) {
                        switch (messageKeysInputStream.index()) {
                            case 1 -> messageKeysKey = messageKeysInputStream.readInt32();
                            case 2 -> messageKeysValue = it.auties.whatsapp.model.signal.sender.SenderMessageKeySpec.decode(messageKeysInputStream.readLengthDelimited());
                        }
                    }
                    messageKeys.put(messageKeysKey, messageKeysValue);
                }
                case 4 -> chainKey = it.auties.whatsapp.model.signal.sender.SenderChainKeySpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.sender.SenderKeyState(id, signingKey, messageKeys, chainKey);
    }

    public static int sizeOf(SenderKeyState protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var id = protoInputObject.id();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(id);
        var signingKey = protoInputObject.signingKey();
        if (signingKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var signingKeySerializedSize = it.auties.whatsapp.model.signal.keypair.SignalKeyPairSpec.sizeOf(signingKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(signingKeySerializedSize);
            protoOutputSize += signingKeySerializedSize;
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
        var chainKey = protoInputObject.chainKey();
        if (chainKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            var chainKeySerializedSize = it.auties.whatsapp.model.signal.sender.SenderChainKeySpec.sizeOf(chainKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(chainKeySerializedSize);
            protoOutputSize += chainKeySerializedSize;
        }
        return protoOutputSize;
    }

    private static int sizeOfMessageKeys(java.util.Map.Entry<java.lang.Integer, it.auties.whatsapp.model.signal.sender.SenderMessageKey> protoInputObject) {
        var protoOutputSize = 0;
        var messageKeysMapKey = protoInputObject.getKey();
        if (messageKeysMapKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageKeysMapKey);
        }
        var messageKeysMapValue = protoInputObject.getValue();
        if (messageKeysMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var messageKeysMapValueSerializedSize = it.auties.whatsapp.model.signal.sender.SenderMessageKeySpec.sizeOf(messageKeysMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(messageKeysMapValueSerializedSize);
            protoOutputSize += messageKeysMapValueSerializedSize;
        }
        return protoOutputSize;
    }

}
