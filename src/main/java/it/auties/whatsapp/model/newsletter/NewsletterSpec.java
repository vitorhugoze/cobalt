package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.Newsletter;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterSpec {
    public static byte[] encode(Newsletter protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Newsletter protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var jid = protoInputObject.jid();
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputStream.writeString(1, jid1);
                }
            }
        }
        var state = protoInputObject.state();
        if (state != null) {
            var state0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(state);
            if (state0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.newsletter.NewsletterStateSpec.sizeOf(state0));
                it.auties.whatsapp.model.newsletter.NewsletterStateSpec.encode(state0, protoOutputStream);
            }
        }
        var metadata = protoInputObject.metadata();
        if (metadata != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.newsletter.NewsletterMetadataSpec.sizeOf(metadata));
            it.auties.whatsapp.model.newsletter.NewsletterMetadataSpec.encode(metadata, protoOutputStream);
        }
        var viewerMetadata = protoInputObject.viewerMetadata();
        if (viewerMetadata != null) {
            var viewerMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewerMetadata);
            if (viewerMetadata0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.newsletter.NewsletterViewerMetadataSpec.sizeOf(viewerMetadata0));
                it.auties.whatsapp.model.newsletter.NewsletterViewerMetadataSpec.encode(viewerMetadata0, protoOutputStream);
            }
        }
        if (protoInputObject.messages() != null) {
            for (var messagesEntry : protoInputObject.messages()) { 
                if (messagesEntry != null) {
                    protoOutputStream.writeMessage(5, it.auties.whatsapp.model.info.NewsletterMessageInfoSpec.sizeOf(messagesEntry));
                    it.auties.whatsapp.model.info.NewsletterMessageInfoSpec.encode(messagesEntry, protoOutputStream);
                }
            }
        }
    }

    public static Newsletter decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Newsletter decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.jid.Jid jid = null;
        it.auties.whatsapp.model.newsletter.NewsletterState state = null;
        it.auties.whatsapp.model.newsletter.NewsletterMetadata metadata = null;
        it.auties.whatsapp.model.newsletter.NewsletterViewerMetadata viewerMetadata = null;
        it.auties.whatsapp.util.ConcurrentLinkedSet<it.auties.whatsapp.model.info.NewsletterMessageInfo> messages = new it.auties.whatsapp.util.ConcurrentLinkedSet();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> state = it.auties.whatsapp.model.newsletter.NewsletterStateSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> metadata = it.auties.whatsapp.model.newsletter.NewsletterMetadataSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> viewerMetadata = it.auties.whatsapp.model.newsletter.NewsletterViewerMetadataSpec.decode(protoInputStream.readLengthDelimited());
                case 5 -> messages.add(it.auties.whatsapp.model.info.NewsletterMessageInfoSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.Newsletter(jid, state, metadata, viewerMetadata, messages);
    }

    public static int sizeOf(Newsletter protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var jid = protoInputObject.jid();
        if (jid != null) {
            var jid0 = jid.toString();
            if (jid0 != null) {
                var jid1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(jid0);
                if (jid1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(jid1);
                }
            }
        }
        var state = protoInputObject.state();
        if (state != null) {
            var state0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(state);
            if (state0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var stateSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterStateSpec.sizeOf(state0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stateSerializedSize);
                protoOutputSize += stateSerializedSize;
            }
        }
        var metadata = protoInputObject.metadata();
        if (metadata != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var metadataSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterMetadataSpec.sizeOf(metadata);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(metadataSerializedSize);
            protoOutputSize += metadataSerializedSize;
        }
        var viewerMetadata = protoInputObject.viewerMetadata();
        if (viewerMetadata != null) {
            var viewerMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewerMetadata);
            if (viewerMetadata0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var viewerMetadataSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterViewerMetadataSpec.sizeOf(viewerMetadata0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(viewerMetadataSerializedSize);
                protoOutputSize += viewerMetadataSerializedSize;
            }
        }
        if (protoInputObject.messages() != null) {
            for (var messagesEntry : protoInputObject.messages()) { 
                if (messagesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    var messagesEntrySerializedSize = it.auties.whatsapp.model.info.NewsletterMessageInfoSpec.sizeOf(messagesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(messagesEntrySerializedSize);
                    protoOutputSize += messagesEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
