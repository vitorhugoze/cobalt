package it.auties.whatsapp.model.newsletter;

import it.auties.whatsapp.model.newsletter.NewsletterMetadata;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class NewsletterMetadataSpec {
    public static byte[] encode(NewsletterMetadata protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(NewsletterMetadata protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(name);
            if (name0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.newsletter.NewsletterNameSpec.sizeOf(name0));
                it.auties.whatsapp.model.newsletter.NewsletterNameSpec.encode(name0, protoOutputStream);
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.newsletter.NewsletterDescriptionSpec.sizeOf(description0));
                it.auties.whatsapp.model.newsletter.NewsletterDescriptionSpec.encode(description0, protoOutputStream);
            }
        }
        var picture = protoInputObject.picture();
        if (picture != null) {
            var picture0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(picture);
            if (picture0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.newsletter.NewsletterPictureSpec.sizeOf(picture0));
                it.auties.whatsapp.model.newsletter.NewsletterPictureSpec.encode(picture0, protoOutputStream);
            }
        }
        var handle = protoInputObject.handle();
        if (handle != null) {
            var handle0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(handle);
            if (handle0 != null) {
                var handle1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(handle0);
                if (handle1 != null) {
                    protoOutputStream.writeString(4, handle1);
                }
            }
        }
        var settings = protoInputObject.settings();
        if (settings != null) {
            var settings0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(settings);
            if (settings0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.newsletter.NewsletterSettingsSpec.sizeOf(settings0));
                it.auties.whatsapp.model.newsletter.NewsletterSettingsSpec.encode(settings0, protoOutputStream);
            }
        }
        var invite = protoInputObject.invite();
        if (invite != null) {
            var invite0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(invite);
            if (invite0 != null) {
                var invite1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(invite0);
                if (invite1 != null) {
                    protoOutputStream.writeString(6, invite1);
                }
            }
        }
        var verification = protoInputObject.verification();
        if (verification != null) {
            var verification0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(verification);
            if (verification0 != null) {
                protoOutputStream.writeBool(7, verification0);
            }
        }
        var creationTimestampSeconds = protoInputObject.creationTimestampSeconds();
        if (creationTimestampSeconds != null) {
            var creationTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(creationTimestampSeconds);
            if (creationTimestampSeconds0 != null) {
                protoOutputStream.writeUInt64(8, creationTimestampSeconds0);
            }
        }
    }

    public static NewsletterMetadata decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static NewsletterMetadata decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterName> name = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterDescription> description = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterPicture> picture = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> handle = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterSettings> settings = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.String> invite = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<java.lang.Boolean> verification = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.OptionalLong creationTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.newsletter.NewsletterNameSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> description = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.newsletter.NewsletterDescriptionSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> picture = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.newsletter.NewsletterPictureSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> handle = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 5 -> settings = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.newsletter.NewsletterSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> invite = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 7 -> verification = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(protoInputStream.readBool());
                case 8 -> creationTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(protoInputStream.readInt64());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.newsletter.NewsletterMetadata(name, description, picture, handle, settings, invite, verification, creationTimestampSeconds);
    }

    public static int sizeOf(NewsletterMetadata protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var nameSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterNameSpec.sizeOf(name0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(nameSerializedSize);
                protoOutputSize += nameSerializedSize;
            }
        }
        var description = protoInputObject.description();
        if (description != null) {
            var description0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(description);
            if (description0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var descriptionSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterDescriptionSpec.sizeOf(description0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(descriptionSerializedSize);
                protoOutputSize += descriptionSerializedSize;
            }
        }
        var picture = protoInputObject.picture();
        if (picture != null) {
            var picture0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(picture);
            if (picture0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var pictureSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterPictureSpec.sizeOf(picture0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pictureSerializedSize);
                protoOutputSize += pictureSerializedSize;
            }
        }
        var handle = protoInputObject.handle();
        if (handle != null) {
            var handle0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(handle);
            if (handle0 != null) {
                var handle1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(handle0);
                if (handle1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(handle1);
                }
            }
        }
        var settings = protoInputObject.settings();
        if (settings != null) {
            var settings0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(settings);
            if (settings0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var settingsSerializedSize = it.auties.whatsapp.model.newsletter.NewsletterSettingsSpec.sizeOf(settings0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(settingsSerializedSize);
                protoOutputSize += settingsSerializedSize;
            }
        }
        var invite = protoInputObject.invite();
        if (invite != null) {
            var invite0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(invite);
            if (invite0 != null) {
                var invite1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(invite0);
                if (invite1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(invite1);
                }
            }
        }
        var verification = protoInputObject.verification();
        if (verification != null) {
            var verification0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(verification);
            if (verification0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
                protoOutputSize += 1;
            }
        }
        var creationTimestampSeconds = protoInputObject.creationTimestampSeconds();
        if (creationTimestampSeconds != null) {
            var creationTimestampSeconds0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(creationTimestampSeconds);
            if (creationTimestampSeconds0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(creationTimestampSeconds0);
            }
        }
        return protoOutputSize;
    }

}
