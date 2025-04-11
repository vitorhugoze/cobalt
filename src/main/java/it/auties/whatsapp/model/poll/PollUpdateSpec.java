package it.auties.whatsapp.model.poll;

import it.auties.whatsapp.model.poll.PollUpdate;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PollUpdateSpec {
    public static byte[] encode(PollUpdate protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PollUpdate protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var pollUpdateMessageKey = protoInputObject.pollUpdateMessageKey();
        if (pollUpdateMessageKey != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(pollUpdateMessageKey));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(pollUpdateMessageKey, protoOutputStream);
        }
        var vote = protoInputObject.vote();
        if (vote != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.poll.PollUpdateEncryptedOptionsSpec.sizeOf(vote));
            it.auties.whatsapp.model.poll.PollUpdateEncryptedOptionsSpec.encode(vote, protoOutputStream);
        }
        var senderTimestampMilliseconds = protoInputObject.senderTimestampMilliseconds();
        protoOutputStream.writeInt64(3, senderTimestampMilliseconds);
    }

    public static PollUpdate decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PollUpdate decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey pollUpdateMessageKey = null;
        it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions vote = null;
        long senderTimestampMilliseconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> pollUpdateMessageKey = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> vote = it.auties.whatsapp.model.poll.PollUpdateEncryptedOptionsSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> senderTimestampMilliseconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.poll.PollUpdate(pollUpdateMessageKey, vote, senderTimestampMilliseconds);
    }

    public static int sizeOf(PollUpdate protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var pollUpdateMessageKey = protoInputObject.pollUpdateMessageKey();
        if (pollUpdateMessageKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var pollUpdateMessageKeySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(pollUpdateMessageKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(pollUpdateMessageKeySerializedSize);
            protoOutputSize += pollUpdateMessageKeySerializedSize;
        }
        var vote = protoInputObject.vote();
        if (vote != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var voteSerializedSize = it.auties.whatsapp.model.poll.PollUpdateEncryptedOptionsSpec.sizeOf(vote);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(voteSerializedSize);
            protoOutputSize += voteSerializedSize;
        }
        var senderTimestampMilliseconds = protoInputObject.senderTimestampMilliseconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(senderTimestampMilliseconds);
        return protoOutputSize;
    }

}
