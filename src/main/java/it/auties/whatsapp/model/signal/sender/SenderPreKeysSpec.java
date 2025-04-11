package it.auties.whatsapp.model.signal.sender;

import it.auties.whatsapp.model.signal.sender.SenderPreKeys;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderPreKeysSpec {
    public static byte[] encode(SenderPreKeys protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderPreKeys protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.preKeys() != null) {
            for (var preKeysEntry : protoInputObject.preKeys()) { 
                if (preKeysEntry != null) {
                    var preKeys0 = preKeysEntry.toString();
                    if (preKeys0 != null) {
                        var preKeys1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(preKeys0);
                        if (preKeys1 != null) {
                            protoOutputStream.writeString(1, preKeys1);
                        }
                    }
                }
            }
        }
    }

    public static SenderPreKeys decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderPreKeys decode(ProtobufInputStream protoInputStream) {
        java.util.Collection<it.auties.whatsapp.model.jid.Jid> preKeys = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newCollection();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> preKeys.add(it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString())));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.sender.SenderPreKeys(preKeys);
    }

    public static int sizeOf(SenderPreKeys protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.preKeys() != null) {
            for (var preKeysEntry : protoInputObject.preKeys()) { 
                if (preKeysEntry != null) {
                    var preKeysEntry0 = preKeysEntry.toString();
                    if (preKeysEntry0 != null) {
                        var preKeysEntry1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(preKeysEntry0);
                        if (preKeysEntry1 != null) {
                            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                            protoOutputSize += ProtobufOutputStream.getStringSize(preKeysEntry1);
                        }
                    }
                }
            }
        }
        return protoOutputSize;
    }

}
