package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.MutationsSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MutationsSyncSpec {
    public static byte[] encode(MutationsSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MutationsSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.mutations() != null) {
            for (var mutationsEntry : protoInputObject.mutations()) { 
                if (mutationsEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.MutationSyncSpec.sizeOf(mutationsEntry));
                    it.auties.whatsapp.model.sync.MutationSyncSpec.encode(mutationsEntry, protoOutputStream);
                }
            }
        }
    }

    public static MutationsSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MutationsSync decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.sync.MutationSync> mutations = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> mutations.add(it.auties.whatsapp.model.sync.MutationSyncSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.MutationsSync(mutations);
    }

    public static int sizeOf(MutationsSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.mutations() != null) {
            for (var mutationsEntry : protoInputObject.mutations()) { 
                if (mutationsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var mutationsEntrySerializedSize = it.auties.whatsapp.model.sync.MutationSyncSpec.sizeOf(mutationsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(mutationsEntrySerializedSize);
                    protoOutputSize += mutationsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
