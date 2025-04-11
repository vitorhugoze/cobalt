package it.auties.whatsapp.model.poll;

import it.auties.whatsapp.model.poll.PollAdditionalMetadata;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PollAdditionalMetadataSpec {
    public static byte[] encode(PollAdditionalMetadata protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PollAdditionalMetadata protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var pollInvalidated = protoInputObject.pollInvalidated();
        protoOutputStream.writeBool(1, pollInvalidated);
    }

    public static PollAdditionalMetadata decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PollAdditionalMetadata decode(ProtobufInputStream protoInputStream) {
        boolean pollInvalidated = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> pollInvalidated = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.poll.PollAdditionalMetadata(pollInvalidated);
    }

    public static int sizeOf(PollAdditionalMetadata protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var pollInvalidated = protoInputObject.pollInvalidated();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
