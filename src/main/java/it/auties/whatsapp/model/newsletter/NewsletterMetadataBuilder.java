package it.auties.whatsapp.model.newsletter;

public class NewsletterMetadataBuilder {
    private java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterName> name;
    private java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterDescription> description;
    private java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterPicture> picture;
    private java.util.Optional<java.lang.String> handle;
    private java.util.Optional<it.auties.whatsapp.model.newsletter.NewsletterSettings> settings;
    private java.util.Optional<java.lang.String> invite;
    private java.util.Optional<java.lang.Boolean> verification;
    private java.util.OptionalLong creationTimestampSeconds;

    public NewsletterMetadataBuilder() {
        name = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        description = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        picture = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        handle = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        settings = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        invite = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        verification = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        creationTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
    }

    public NewsletterMetadataBuilder name(it.auties.whatsapp.model.newsletter.NewsletterName name) {
        this.name = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(name);
        return this;
    }

    public NewsletterMetadataBuilder description(it.auties.whatsapp.model.newsletter.NewsletterDescription description) {
        this.description = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(description);
        return this;
    }

    public NewsletterMetadataBuilder picture(it.auties.whatsapp.model.newsletter.NewsletterPicture picture) {
        this.picture = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(picture);
        return this;
    }

    public NewsletterMetadataBuilder handle(it.auties.protobuf.model.ProtobufString handle) {
        this.handle = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(handle));
        return this;
    }

    public NewsletterMetadataBuilder handle(java.lang.String handle) {
        this.handle = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(handle);
        return this;
    }

    public NewsletterMetadataBuilder settings(it.auties.whatsapp.model.newsletter.NewsletterSettings settings) {
        this.settings = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(settings);
        return this;
    }

    public NewsletterMetadataBuilder invite(it.auties.protobuf.model.ProtobufString invite) {
        this.invite = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(invite));
        return this;
    }

    public NewsletterMetadataBuilder invite(java.lang.String invite) {
        this.invite = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(invite);
        return this;
    }

    public NewsletterMetadataBuilder verification(java.lang.Boolean verification) {
        this.verification = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(verification);
        return this;
    }

    public NewsletterMetadataBuilder creationTimestampSeconds(java.lang.Long creationTimestampSeconds) {
        this.creationTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(creationTimestampSeconds);
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterMetadata build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterMetadata(name, description, picture, handle, settings, invite, verification, creationTimestampSeconds);
    }

}
