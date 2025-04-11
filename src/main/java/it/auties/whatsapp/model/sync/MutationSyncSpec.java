package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.MutationSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MutationSyncSpec {
    public static byte[] encode(MutationSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MutationSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var operation = protoInputObject.operation();
        if (operation != null) {
            var operation0 = it.auties.whatsapp.model.sync.RecordSyncOperationSpec.encode(operation);
            protoOutputStream.writeInt32(1, operation0);
        }
        var record = protoInputObject.record();
        if (record != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.RecordSyncSpec.sizeOf(record));
            it.auties.whatsapp.model.sync.RecordSyncSpec.encode(record, protoOutputStream);
        }
    }

    public static MutationSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MutationSync decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.sync.RecordSync.Operation operation = null;
        it.auties.whatsapp.model.sync.RecordSync record = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> operation = it.auties.whatsapp.model.sync.RecordSyncOperationSpec.decode(protoInputStream.readInt32());
                case 2 -> record = it.auties.whatsapp.model.sync.RecordSyncSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.MutationSync(operation, record);
    }

    public static int sizeOf(MutationSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var operation = protoInputObject.operation();
        if (operation != null) {
            var operation0 = it.auties.whatsapp.model.sync.RecordSyncOperationSpec.encode(operation);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(operation0);
        }
        var record = protoInputObject.record();
        if (record != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var recordSerializedSize = it.auties.whatsapp.model.sync.RecordSyncSpec.sizeOf(record);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(recordSerializedSize);
            protoOutputSize += recordSerializedSize;
        }
        return protoOutputSize;
    }

}
