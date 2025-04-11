package it.auties.whatsapp.model.newsletter;

public class NewsletterReactionSettingsBuilder {
    private it.auties.whatsapp.model.newsletter.NewsletterReactionSettings.Type value;
    private java.util.List<java.lang.String> blockedCodes;
    private java.util.OptionalLong enabledTimestampSeconds;

    public NewsletterReactionSettingsBuilder() {
        value = null;
        blockedCodes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        enabledTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
    }

    public NewsletterReactionSettingsBuilder value(it.auties.whatsapp.model.newsletter.NewsletterReactionSettings.Type value) {
        this.value = value;
        return this;
    }

    public NewsletterReactionSettingsBuilder blockedCodes(java.util.List<java.lang.String> blockedCodes) {
        this.blockedCodes = blockedCodes;
        return this;
    }

    public NewsletterReactionSettingsBuilder enabledTimestampSeconds(java.lang.Long enabledTimestampSeconds) {
        this.enabledTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(enabledTimestampSeconds);
        return this;
    }

    public it.auties.whatsapp.model.newsletter.NewsletterReactionSettings build() {
        return new it.auties.whatsapp.model.newsletter.NewsletterReactionSettings(value, blockedCodes, enabledTimestampSeconds);
    }

}
