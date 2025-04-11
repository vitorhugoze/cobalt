package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.RecordSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class RecordSyncSpec {
    public static byte[] encode(RecordSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(RecordSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var index = protoInputObject.index();
        if (index != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.IndexSyncSpec.sizeOf(index));
            it.auties.whatsapp.model.sync.IndexSyncSpec.encode(index, protoOutputStream);
        }
        var value = protoInputObject.value();
        if (value != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.ValueSyncSpec.sizeOf(value));
            it.auties.whatsapp.model.sync.ValueSyncSpec.encode(value, protoOutputStream);
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.sync.KeyIdSpec.sizeOf(keyId));
            it.auties.whatsapp.model.sync.KeyIdSpec.encode(keyId, protoOutputStream);
        }
    }

    public static RecordSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static RecordSync decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.IndexSync index = null;
        it.auties.whatsapp.model.sync.ValueSync value = null;
        it.auties.whatsapp.model.sync.KeyId keyId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> index = it.auties.whatsapp.model.sync.IndexSyncSpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> value = it.auties.whatsapp.model.sync.ValueSyncSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> keyId = it.auties.whatsapp.model.sync.KeyIdSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.RecordSync(index, value, keyId);
    }

    public static int sizeOf(RecordSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var index = protoInputObject.index();
        if (index != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var indexSerializedSize = it.auties.whatsapp.model.sync.IndexSyncSpec.sizeOf(index);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(indexSerializedSize);
            protoOutputSize += indexSerializedSize;
        }
        var value = protoInputObject.value();
        if (value != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var valueSerializedSize = it.auties.whatsapp.model.sync.ValueSyncSpec.sizeOf(value);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(valueSerializedSize);
            protoOutputSize += valueSerializedSize;
        }
        var keyId = protoInputObject.keyId();
        if (keyId != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var keyIdSerializedSize = it.auties.whatsapp.model.sync.KeyIdSpec.sizeOf(keyId);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(keyIdSerializedSize);
            protoOutputSize += keyIdSerializedSize;
        }
        return protoOutputSize;
    }

}
