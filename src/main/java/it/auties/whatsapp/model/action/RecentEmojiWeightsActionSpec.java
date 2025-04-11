package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.RecentEmojiWeightsAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class RecentEmojiWeightsActionSpec {
    public static byte[] encode(RecentEmojiWeightsAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(RecentEmojiWeightsAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.weights() != null) {
            for (var weightsEntry : protoInputObject.weights()) { 
                if (weightsEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.sync.RecentEmojiWeightSpec.sizeOf(weightsEntry));
                    it.auties.whatsapp.model.sync.RecentEmojiWeightSpec.encode(weightsEntry, protoOutputStream);
                }
            }
        }
    }

    public static RecentEmojiWeightsAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static RecentEmojiWeightsAction decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.sync.RecentEmojiWeight> weights = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> weights.add(it.auties.whatsapp.model.sync.RecentEmojiWeightSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.RecentEmojiWeightsAction(weights);
    }

    public static int sizeOf(RecentEmojiWeightsAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.weights() != null) {
            for (var weightsEntry : protoInputObject.weights()) { 
                if (weightsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var weightsEntrySerializedSize = it.auties.whatsapp.model.sync.RecentEmojiWeightSpec.sizeOf(weightsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(weightsEntrySerializedSize);
                    protoOutputSize += weightsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
