package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.MessageReceipt;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MessageReceiptSpec {
    public static byte[] encode(MessageReceipt protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MessageReceipt protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var deliveredTimestampSeconds = protoInputObject.deliveredTimestampSeconds();
        if (deliveredTimestampSeconds != null) {
            var deliveredTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(deliveredTimestampSeconds);
            if (deliveredTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(2, deliveredTimestampSeconds0);
            }
        }
        var readTimestampSeconds = protoInputObject.readTimestampSeconds();
        if (readTimestampSeconds != null) {
            var readTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(readTimestampSeconds);
            if (readTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(3, readTimestampSeconds0);
            }
        }
        var playedTimestampSeconds = protoInputObject.playedTimestampSeconds();
        if (playedTimestampSeconds != null) {
            var playedTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(playedTimestampSeconds);
            if (playedTimestampSeconds0 != null) {
                protoOutputStream.writeInt64(4, playedTimestampSeconds0);
            }
        }
        if (protoInputObject.deliveredJids() != null) {
            for (var deliveredJidsEntry : protoInputObject.deliveredJids()) { 
                if (deliveredJidsEntry != null) {
                    var deliveredJids0 = deliveredJidsEntry.toString();
                    if (deliveredJids0 != null) {
                        var deliveredJids1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deliveredJids0);
                        if (deliveredJids1 != null) {
                            protoOutputStream.writeString(5, deliveredJids1);
                        }
                    }
                }
            }
        }
        if (protoInputObject.readJids() != null) {
            for (var readJidsEntry : protoInputObject.readJids()) { 
                if (readJidsEntry != null) {
                    var readJids0 = readJidsEntry.toString();
                    if (readJids0 != null) {
                        var readJids1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(readJids0);
                        if (readJids1 != null) {
                            protoOutputStream.writeString(6, readJids1);
                        }
                    }
                }
            }
        }
    }

    public static MessageReceipt decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MessageReceipt decode(ProtobufInputStream protoInputStream) {
        java.lang.Long deliveredTimestampSeconds = null;
        java.lang.Long readTimestampSeconds = null;
        java.lang.Long playedTimestampSeconds = null;
        java.util.Set<it.auties.whatsapp.model.jid.Jid> deliveredJids = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newSet();
        java.util.Set<it.auties.whatsapp.model.jid.Jid> readJids = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newSet();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 2 -> deliveredTimestampSeconds = protoInputStream.readInt64();
                case 3 -> readTimestampSeconds = protoInputStream.readInt64();
                case 4 -> playedTimestampSeconds = protoInputStream.readInt64();
                case 5 -> deliveredJids.add(it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString())));
                case 6 -> readJids.add(it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString())));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.model.MessageReceipt(deliveredTimestampSeconds, readTimestampSeconds, playedTimestampSeconds, deliveredJids, readJids);
    }

    public static int sizeOf(MessageReceipt protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var deliveredTimestampSeconds = protoInputObject.deliveredTimestampSeconds();
        if (deliveredTimestampSeconds != null) {
            var deliveredTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(deliveredTimestampSeconds);
            if (deliveredTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deliveredTimestampSeconds0);
            }
        }
        var readTimestampSeconds = protoInputObject.readTimestampSeconds();
        if (readTimestampSeconds != null) {
            var readTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(readTimestampSeconds);
            if (readTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(readTimestampSeconds0);
            }
        }
        var playedTimestampSeconds = protoInputObject.playedTimestampSeconds();
        if (playedTimestampSeconds != null) {
            var playedTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(playedTimestampSeconds);
            if (playedTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(playedTimestampSeconds0);
            }
        }
        if (protoInputObject.deliveredJids() != null) {
            for (var deliveredJidsEntry : protoInputObject.deliveredJids()) { 
                if (deliveredJidsEntry != null) {
                    var deliveredJidsEntry0 = deliveredJidsEntry.toString();
                    if (deliveredJidsEntry0 != null) {
                        var deliveredJidsEntry1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(deliveredJidsEntry0);
                        if (deliveredJidsEntry1 != null) {
                            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                            protoOutputSize += ProtobufOutputStream.getStringSize(deliveredJidsEntry1);
                        }
                    }
                }
            }
        }
        if (protoInputObject.readJids() != null) {
            for (var readJidsEntry : protoInputObject.readJids()) { 
                if (readJidsEntry != null) {
                    var readJidsEntry0 = readJidsEntry.toString();
                    if (readJidsEntry0 != null) {
                        var readJidsEntry1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(readJidsEntry0);
                        if (readJidsEntry1 != null) {
                            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                            protoOutputSize += ProtobufOutputStream.getStringSize(readJidsEntry1);
                        }
                    }
                }
            }
        }
        return protoOutputSize;
    }

}
