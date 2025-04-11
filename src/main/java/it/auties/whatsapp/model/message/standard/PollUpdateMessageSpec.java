package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.PollUpdateMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PollUpdateMessageSpec {
    public static byte[] encode(PollUpdateMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PollUpdateMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var pollCreationMessageKey = protoInputObject.pollCreationMessageKey();
        if (pollCreationMessageKey != null) {
            protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(pollCreationMessageKey));
            it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(pollCreationMessageKey, protoOutputStream);
        }
        var encryptedMetadata = protoInputObject.encryptedMetadata();
        if (encryptedMetadata != null) {
            var encryptedMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encryptedMetadata);
            if (encryptedMetadata0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.sizeOf(encryptedMetadata0));
                it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.encode(encryptedMetadata0, protoOutputStream);
            }
        }
        var metadata = protoInputObject.metadata();
        if (metadata != null) {
            var metadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(metadata);
            if (metadata0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.poll.PollUpdateMessageMetadataSpec.sizeOf(metadata0));
                it.auties.whatsapp.model.poll.PollUpdateMessageMetadataSpec.encode(metadata0, protoOutputStream);
            }
        }
        var senderTimestampMilliseconds = protoInputObject.senderTimestampMilliseconds();
        protoOutputStream.writeInt64(4, senderTimestampMilliseconds);
        var voter = protoInputObject.voter();
        if (voter != null) {
            var voter0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(voter);
            if (voter0 != null) {
                var voter1 = voter0.toString();
                if (voter1 != null) {
                    var voter2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(voter1);
                    if (voter2 != null) {
                        protoOutputStream.writeString(999, voter2);
                    }
                }
            }
        }
        var pollCreationMessage = protoInputObject.pollCreationMessage();
        if (pollCreationMessage != null) {
            var pollCreationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollCreationMessage);
            if (pollCreationMessage0 != null) {
                protoOutputStream.writeMessage(1000, it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.sizeOf(pollCreationMessage0));
                it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.encode(pollCreationMessage0, protoOutputStream);
            }
        }
        if (protoInputObject.votes() != null) {
            for (var votesEntry : protoInputObject.votes()) { 
                if (votesEntry != null) {
                    protoOutputStream.writeMessage(1001, it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(votesEntry));
                    it.auties.whatsapp.model.poll.PollOptionSpec.encode(votesEntry, protoOutputStream);
                }
            }
        }
    }

    public static PollUpdateMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PollUpdateMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.model.ChatMessageKey pollCreationMessageKey = null;
        it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata encryptedMetadata = null;
        it.auties.whatsapp.model.poll.PollUpdateMessageMetadata metadata = null;
        long senderTimestampMilliseconds = 0l;
        it.auties.whatsapp.model.jid.Jid voter = null;
        it.auties.whatsapp.model.message.standard.PollCreationMessage pollCreationMessage = null;
        java.util.List<it.auties.whatsapp.model.poll.PollOption> votes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> pollCreationMessageKey = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited());
                case 2 -> encryptedMetadata = it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> metadata = it.auties.whatsapp.model.poll.PollUpdateMessageMetadataSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> senderTimestampMilliseconds = protoInputStream.readInt64();
                case 999 -> voter = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 1000 -> pollCreationMessage = it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.decode(protoInputStream.readLengthDelimited());
                case 1001 -> votes.add(it.auties.whatsapp.model.poll.PollOptionSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.PollUpdateMessage(pollCreationMessageKey, encryptedMetadata, metadata, senderTimestampMilliseconds, voter, pollCreationMessage, votes);
    }

    public static int sizeOf(PollUpdateMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var pollCreationMessageKey = protoInputObject.pollCreationMessageKey();
        if (pollCreationMessageKey != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            var pollCreationMessageKeySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(pollCreationMessageKey);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(pollCreationMessageKeySerializedSize);
            protoOutputSize += pollCreationMessageKeySerializedSize;
        }
        var encryptedMetadata = protoInputObject.encryptedMetadata();
        if (encryptedMetadata != null) {
            var encryptedMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encryptedMetadata);
            if (encryptedMetadata0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var encryptedMetadataSerializedSize = it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.sizeOf(encryptedMetadata0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(encryptedMetadataSerializedSize);
                protoOutputSize += encryptedMetadataSerializedSize;
            }
        }
        var metadata = protoInputObject.metadata();
        if (metadata != null) {
            var metadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(metadata);
            if (metadata0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var metadataSerializedSize = it.auties.whatsapp.model.poll.PollUpdateMessageMetadataSpec.sizeOf(metadata0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(metadataSerializedSize);
                protoOutputSize += metadataSerializedSize;
            }
        }
        var senderTimestampMilliseconds = protoInputObject.senderTimestampMilliseconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(senderTimestampMilliseconds);
        var voter = protoInputObject.voter();
        if (voter != null) {
            var voter0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(voter);
            if (voter0 != null) {
                var voter1 = voter0.toString();
                if (voter1 != null) {
                    var voter2 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(voter1);
                    if (voter2 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(999, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(voter2);
                    }
                }
            }
        }
        var pollCreationMessage = protoInputObject.pollCreationMessage();
        if (pollCreationMessage != null) {
            var pollCreationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollCreationMessage);
            if (pollCreationMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1000, 2);
                var pollCreationMessageSerializedSize = it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.sizeOf(pollCreationMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pollCreationMessageSerializedSize);
                protoOutputSize += pollCreationMessageSerializedSize;
            }
        }
        if (protoInputObject.votes() != null) {
            for (var votesEntry : protoInputObject.votes()) { 
                if (votesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1001, 2);
                    var votesEntrySerializedSize = it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(votesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(votesEntrySerializedSize);
                    protoOutputSize += votesEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
