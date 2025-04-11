package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.ButtonOpaqueData;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonOpaqueDataSpec {
    public static byte[] encode(ButtonOpaqueData protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonOpaqueData protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputStream.writeString(1, body1);
                }
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(3, caption1);
                }
            }
        }
        var longitude = protoInputObject.longitude();
        protoOutputStream.writeDouble(5, longitude);
        var latitude = protoInputObject.latitude();
        protoOutputStream.writeDouble(7, latitude);
        var paymentAmount1000 = protoInputObject.paymentAmount1000();
        protoOutputStream.writeInt32(8, paymentAmount1000);
        var paymentNote = protoInputObject.paymentNote();
        if (paymentNote != null) {
            var paymentNote0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paymentNote);
            if (paymentNote0 != null) {
                var paymentNote1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paymentNote0);
                if (paymentNote1 != null) {
                    protoOutputStream.writeString(9, paymentNote1);
                }
            }
        }
        var canonicalUrl = protoInputObject.canonicalUrl();
        if (canonicalUrl != null) {
            var canonicalUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(canonicalUrl);
            if (canonicalUrl0 != null) {
                var canonicalUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(canonicalUrl0);
                if (canonicalUrl1 != null) {
                    protoOutputStream.writeString(10, canonicalUrl1);
                }
            }
        }
        var matchedText = protoInputObject.matchedText();
        if (matchedText != null) {
            var matchedText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(matchedText);
            if (matchedText0 != null) {
                var matchedText1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(matchedText0);
                if (matchedText1 != null) {
                    protoOutputStream.writeString(11, matchedText1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputStream.writeString(12, title1);
                }
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputStream.writeString(13, description1);
                }
            }
        }
        var isLive = protoInputObject.isLive();
        protoOutputStream.writeBool(6, isLive);
        var futureProofBuffer = protoInputObject.futureProofBuffer();
        if (futureProofBuffer != null) {
            var futureProofBuffer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(futureProofBuffer);
            if (futureProofBuffer0 != null) {
                var futureProofBuffer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(futureProofBuffer0);
                if (futureProofBuffer1 != null) {
                    protoOutputStream.writeBytes(14, futureProofBuffer1);
                }
            }
        }
        var clientUrl = protoInputObject.clientUrl();
        if (clientUrl != null) {
            var clientUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(clientUrl);
            if (clientUrl0 != null) {
                var clientUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(clientUrl0);
                if (clientUrl1 != null) {
                    protoOutputStream.writeString(15, clientUrl1);
                }
            }
        }
        var loc = protoInputObject.loc();
        if (loc != null) {
            var loc0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(loc);
            if (loc0 != null) {
                var loc1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(loc0);
                if (loc1 != null) {
                    protoOutputStream.writeString(16, loc1);
                }
            }
        }
        var pollName = protoInputObject.pollName();
        if (pollName != null) {
            var pollName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollName);
            if (pollName0 != null) {
                var pollName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pollName0);
                if (pollName1 != null) {
                    protoOutputStream.writeString(17, pollName1);
                }
            }
        }
        if (protoInputObject.pollOptions() != null) {
            for (var pollOptionsEntry : protoInputObject.pollOptions()) { 
                if (pollOptionsEntry != null) {
                    protoOutputStream.writeMessage(18, it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(pollOptionsEntry));
                    it.auties.whatsapp.model.poll.PollOptionSpec.encode(pollOptionsEntry, protoOutputStream);
                }
            }
        }
        var pollSelectableOptionsCount = protoInputObject.pollSelectableOptionsCount();
        protoOutputStream.writeUInt32(20, pollSelectableOptionsCount);
        var messageSecret = protoInputObject.messageSecret();
        if (messageSecret != null) {
            var messageSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageSecret);
            if (messageSecret0 != null) {
                var messageSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageSecret0);
                if (messageSecret1 != null) {
                    protoOutputStream.writeBytes(21, messageSecret1);
                }
            }
        }
        var originalSelfAuthor = protoInputObject.originalSelfAuthor();
        if (originalSelfAuthor != null) {
            var originalSelfAuthor0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(originalSelfAuthor);
            if (originalSelfAuthor0 != null) {
                var originalSelfAuthor1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(originalSelfAuthor0);
                if (originalSelfAuthor1 != null) {
                    protoOutputStream.writeString(51, originalSelfAuthor1);
                }
            }
        }
        var senderTimestampMs = protoInputObject.senderTimestampMs();
        protoOutputStream.writeInt64(22, senderTimestampMs);
        var pollUpdateParentKey = protoInputObject.pollUpdateParentKey();
        if (pollUpdateParentKey != null) {
            var pollUpdateParentKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollUpdateParentKey);
            if (pollUpdateParentKey0 != null) {
                var pollUpdateParentKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pollUpdateParentKey0);
                if (pollUpdateParentKey1 != null) {
                    protoOutputStream.writeString(23, pollUpdateParentKey1);
                }
            }
        }
        var encPollVote = protoInputObject.encPollVote();
        if (encPollVote != null) {
            var encPollVote0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encPollVote);
            if (encPollVote0 != null) {
                protoOutputStream.writeMessage(24, it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.sizeOf(encPollVote0));
                it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.encode(encPollVote0, protoOutputStream);
            }
        }
        var encReactionTargetMessageKey = protoInputObject.encReactionTargetMessageKey();
        if (encReactionTargetMessageKey != null) {
            var encReactionTargetMessageKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encReactionTargetMessageKey);
            if (encReactionTargetMessageKey0 != null) {
                var encReactionTargetMessageKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encReactionTargetMessageKey0);
                if (encReactionTargetMessageKey1 != null) {
                    protoOutputStream.writeString(25, encReactionTargetMessageKey1);
                }
            }
        }
        var encReactionEncPayload = protoInputObject.encReactionEncPayload();
        if (encReactionEncPayload != null) {
            var encReactionEncPayload0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encReactionEncPayload);
            if (encReactionEncPayload0 != null) {
                var encReactionEncPayload1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encReactionEncPayload0);
                if (encReactionEncPayload1 != null) {
                    protoOutputStream.writeBytes(26, encReactionEncPayload1);
                }
            }
        }
        var encReactionEncIv = protoInputObject.encReactionEncIv();
        if (encReactionEncIv != null) {
            var encReactionEncIv0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encReactionEncIv);
            if (encReactionEncIv0 != null) {
                var encReactionEncIv1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encReactionEncIv0);
                if (encReactionEncIv1 != null) {
                    protoOutputStream.writeBytes(27, encReactionEncIv1);
                }
            }
        }
    }

    public static ButtonOpaqueData decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonOpaqueData decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<java.lang.String> body = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        double longitude = 0d;
        double latitude = 0d;
        int paymentAmount1000 = 0;
        java.util.Optional<java.lang.String> paymentNote = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> canonicalUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> matchedText = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> title = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> description = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        boolean isLive = false;
        java.util.Optional<byte[]> futureProofBuffer = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> clientUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> loc = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> pollName = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.List<it.auties.whatsapp.model.poll.PollOption> pollOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        int pollSelectableOptionsCount = 0;
        java.util.Optional<byte[]> messageSecret = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> originalSelfAuthor = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        long senderTimestampMs = 0l;
        java.util.Optional<java.lang.String> pollUpdateParentKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata> encPollVote = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> encReactionTargetMessageKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<byte[]> encReactionEncPayload = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<byte[]> encReactionEncIv = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> body = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 3 -> caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> longitude = protoInputStream.readDouble();
                case 7 -> latitude = protoInputStream.readDouble();
                case 8 -> paymentAmount1000 = protoInputStream.readInt32();
                case 9 -> paymentNote = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 10 -> canonicalUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 11 -> matchedText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 12 -> title = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 13 -> description = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 6 -> isLive = protoInputStream.readBool();
                case 14 -> futureProofBuffer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                case 15 -> clientUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 16 -> loc = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 17 -> pollName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 18 -> pollOptions.add(it.auties.whatsapp.model.poll.PollOptionSpec.decode(protoInputStream.readLengthDelimited()));
                case 20 -> pollSelectableOptionsCount = protoInputStream.readInt32();
                case 21 -> messageSecret = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                case 51 -> originalSelfAuthor = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 22 -> senderTimestampMs = protoInputStream.readInt64();
                case 23 -> pollUpdateParentKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 24 -> encPollVote = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.decode(protoInputStream.readLengthDelimited()));
                case 25 -> encReactionTargetMessageKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 26 -> encReactionEncPayload = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                case 27 -> encReactionEncIv = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.ButtonOpaqueData(body, caption, longitude, latitude, paymentAmount1000, paymentNote, canonicalUrl, matchedText, title, description, isLive, futureProofBuffer, clientUrl, loc, pollName, pollOptions, pollSelectableOptionsCount, messageSecret, originalSelfAuthor, senderTimestampMs, pollUpdateParentKey, encPollVote, encReactionTargetMessageKey, encReactionEncPayload, encReactionEncIv);
    }

    public static int sizeOf(ButtonOpaqueData protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var body = protoInputObject.body();
        if (body != null) {
            var body0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(body);
            if (body0 != null) {
                var body1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(body0);
                if (body1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(body1);
                }
            }
        }
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
        var longitude = protoInputObject.longitude();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 1);
        protoOutputSize += 8;
        var latitude = protoInputObject.latitude();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 1);
        protoOutputSize += 8;
        var paymentAmount1000 = protoInputObject.paymentAmount1000();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(paymentAmount1000);
        var paymentNote = protoInputObject.paymentNote();
        if (paymentNote != null) {
            var paymentNote0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paymentNote);
            if (paymentNote0 != null) {
                var paymentNote1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(paymentNote0);
                if (paymentNote1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(paymentNote1);
                }
            }
        }
        var canonicalUrl = protoInputObject.canonicalUrl();
        if (canonicalUrl != null) {
            var canonicalUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(canonicalUrl);
            if (canonicalUrl0 != null) {
                var canonicalUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(canonicalUrl0);
                if (canonicalUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(canonicalUrl1);
                }
            }
        }
        var matchedText = protoInputObject.matchedText();
        if (matchedText != null) {
            var matchedText0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(matchedText);
            if (matchedText0 != null) {
                var matchedText1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(matchedText0);
                if (matchedText1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(matchedText1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(title);
            if (title0 != null) {
                var title1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title0);
                if (title1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(title1);
                }
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                var description1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(description0);
                if (description1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(description1);
                }
            }
        }
        var isLive = protoInputObject.isLive();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += 1;
        var futureProofBuffer = protoInputObject.futureProofBuffer();
        if (futureProofBuffer != null) {
            var futureProofBuffer0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(futureProofBuffer);
            if (futureProofBuffer0 != null) {
                var futureProofBuffer1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(futureProofBuffer0);
                if (futureProofBuffer1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(futureProofBuffer1);
                }
            }
        }
        var clientUrl = protoInputObject.clientUrl();
        if (clientUrl != null) {
            var clientUrl0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(clientUrl);
            if (clientUrl0 != null) {
                var clientUrl1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(clientUrl0);
                if (clientUrl1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(clientUrl1);
                }
            }
        }
        var loc = protoInputObject.loc();
        if (loc != null) {
            var loc0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(loc);
            if (loc0 != null) {
                var loc1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(loc0);
                if (loc1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(loc1);
                }
            }
        }
        var pollName = protoInputObject.pollName();
        if (pollName != null) {
            var pollName0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollName);
            if (pollName0 != null) {
                var pollName1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pollName0);
                if (pollName1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(pollName1);
                }
            }
        }
        if (protoInputObject.pollOptions() != null) {
            for (var pollOptionsEntry : protoInputObject.pollOptions()) { 
                if (pollOptionsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                    var pollOptionsEntrySerializedSize = it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(pollOptionsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(pollOptionsEntrySerializedSize);
                    protoOutputSize += pollOptionsEntrySerializedSize;
                }
            }
        }
        var pollSelectableOptionsCount = protoInputObject.pollSelectableOptionsCount();
        protoOutputSize += ProtobufOutputStream.getFieldSize(20, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(pollSelectableOptionsCount);
        var messageSecret = protoInputObject.messageSecret();
        if (messageSecret != null) {
            var messageSecret0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(messageSecret);
            if (messageSecret0 != null) {
                var messageSecret1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(messageSecret0);
                if (messageSecret1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(messageSecret1);
                }
            }
        }
        var originalSelfAuthor = protoInputObject.originalSelfAuthor();
        if (originalSelfAuthor != null) {
            var originalSelfAuthor0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(originalSelfAuthor);
            if (originalSelfAuthor0 != null) {
                var originalSelfAuthor1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(originalSelfAuthor0);
                if (originalSelfAuthor1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(51, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(originalSelfAuthor1);
                }
            }
        }
        var senderTimestampMs = protoInputObject.senderTimestampMs();
        protoOutputSize += ProtobufOutputStream.getFieldSize(22, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(senderTimestampMs);
        var pollUpdateParentKey = protoInputObject.pollUpdateParentKey();
        if (pollUpdateParentKey != null) {
            var pollUpdateParentKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollUpdateParentKey);
            if (pollUpdateParentKey0 != null) {
                var pollUpdateParentKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(pollUpdateParentKey0);
                if (pollUpdateParentKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(pollUpdateParentKey1);
                }
            }
        }
        var encPollVote = protoInputObject.encPollVote();
        if (encPollVote != null) {
            var encPollVote0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encPollVote);
            if (encPollVote0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                var encPollVoteSerializedSize = it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadataSpec.sizeOf(encPollVote0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(encPollVoteSerializedSize);
                protoOutputSize += encPollVoteSerializedSize;
            }
        }
        var encReactionTargetMessageKey = protoInputObject.encReactionTargetMessageKey();
        if (encReactionTargetMessageKey != null) {
            var encReactionTargetMessageKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encReactionTargetMessageKey);
            if (encReactionTargetMessageKey0 != null) {
                var encReactionTargetMessageKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encReactionTargetMessageKey0);
                if (encReactionTargetMessageKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(25, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(encReactionTargetMessageKey1);
                }
            }
        }
        var encReactionEncPayload = protoInputObject.encReactionEncPayload();
        if (encReactionEncPayload != null) {
            var encReactionEncPayload0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encReactionEncPayload);
            if (encReactionEncPayload0 != null) {
                var encReactionEncPayload1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encReactionEncPayload0);
                if (encReactionEncPayload1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(encReactionEncPayload1);
                }
            }
        }
        var encReactionEncIv = protoInputObject.encReactionEncIv();
        if (encReactionEncIv != null) {
            var encReactionEncIv0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encReactionEncIv);
            if (encReactionEncIv0 != null) {
                var encReactionEncIv1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encReactionEncIv0);
                if (encReactionEncIv1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(encReactionEncIv1);
                }
            }
        }
        return protoOutputSize;
    }

}
