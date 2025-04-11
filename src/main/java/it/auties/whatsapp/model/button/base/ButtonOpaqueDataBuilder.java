package it.auties.whatsapp.model.button.base;

public class ButtonOpaqueDataBuilder {
    private java.util.Optional<java.lang.String> body;
    private java.util.Optional<java.lang.String> caption;
    private double longitude;
    private double latitude;
    private int paymentAmount1000;
    private java.util.Optional<java.lang.String> paymentNote;
    private java.util.Optional<java.lang.String> canonicalUrl;
    private java.util.Optional<java.lang.String> matchedText;
    private java.util.Optional<java.lang.String> title;
    private java.util.Optional<java.lang.String> description;
    private boolean isLive;
    private java.util.Optional<byte[]> futureProofBuffer;
    private java.util.Optional<java.lang.String> clientUrl;
    private java.util.Optional<java.lang.String> loc;
    private java.util.Optional<java.lang.String> pollName;
    private java.util.List<it.auties.whatsapp.model.poll.PollOption> pollOptions;
    private int pollSelectableOptionsCount;
    private java.util.Optional<byte[]> messageSecret;
    private java.util.Optional<java.lang.String> originalSelfAuthor;
    private long senderTimestampMs;
    private java.util.Optional<java.lang.String> pollUpdateParentKey;
    private java.util.Optional<it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata> encPollVote;
    private java.util.Optional<java.lang.String> encReactionTargetMessageKey;
    private java.util.Optional<byte[]> encReactionEncPayload;
    private java.util.Optional<byte[]> encReactionEncIv;

    public ButtonOpaqueDataBuilder() {
        body = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        longitude = 0d;
        latitude = 0d;
        paymentAmount1000 = 0;
        paymentNote = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        canonicalUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        matchedText = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        title = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        description = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        isLive = false;
        futureProofBuffer = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        clientUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        loc = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        pollName = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        pollOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        pollSelectableOptionsCount = 0;
        messageSecret = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        originalSelfAuthor = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        senderTimestampMs = 0l;
        pollUpdateParentKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        encPollVote = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        encReactionTargetMessageKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        encReactionEncPayload = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        encReactionEncIv = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ButtonOpaqueDataBuilder body(it.auties.protobuf.model.ProtobufString body) {
        this.body = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(body));
        return this;
    }

    public ButtonOpaqueDataBuilder body(java.lang.String body) {
        this.body = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(body);
        return this;
    }

    public ButtonOpaqueDataBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption));
        return this;
    }

    public ButtonOpaqueDataBuilder caption(java.lang.String caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(caption);
        return this;
    }

    public ButtonOpaqueDataBuilder longitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public ButtonOpaqueDataBuilder latitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public ButtonOpaqueDataBuilder paymentAmount1000(int paymentAmount1000) {
        this.paymentAmount1000 = paymentAmount1000;
        return this;
    }

    public ButtonOpaqueDataBuilder paymentNote(it.auties.protobuf.model.ProtobufString paymentNote) {
        this.paymentNote = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(paymentNote));
        return this;
    }

    public ButtonOpaqueDataBuilder paymentNote(java.lang.String paymentNote) {
        this.paymentNote = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(paymentNote);
        return this;
    }

    public ButtonOpaqueDataBuilder canonicalUrl(it.auties.protobuf.model.ProtobufString canonicalUrl) {
        this.canonicalUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(canonicalUrl));
        return this;
    }

    public ButtonOpaqueDataBuilder canonicalUrl(java.lang.String canonicalUrl) {
        this.canonicalUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(canonicalUrl);
        return this;
    }

    public ButtonOpaqueDataBuilder matchedText(it.auties.protobuf.model.ProtobufString matchedText) {
        this.matchedText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(matchedText));
        return this;
    }

    public ButtonOpaqueDataBuilder matchedText(java.lang.String matchedText) {
        this.matchedText = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(matchedText);
        return this;
    }

    public ButtonOpaqueDataBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title));
        return this;
    }

    public ButtonOpaqueDataBuilder title(java.lang.String title) {
        this.title = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(title);
        return this;
    }

    public ButtonOpaqueDataBuilder description(it.auties.protobuf.model.ProtobufString description) {
        this.description = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(description));
        return this;
    }

    public ButtonOpaqueDataBuilder description(java.lang.String description) {
        this.description = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(description);
        return this;
    }

    public ButtonOpaqueDataBuilder isLive(boolean isLive) {
        this.isLive = isLive;
        return this;
    }

    public ButtonOpaqueDataBuilder futureProofBuffer(java.nio.ByteBuffer futureProofBuffer) {
        this.futureProofBuffer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(futureProofBuffer));
        return this;
    }

    public ButtonOpaqueDataBuilder futureProofBuffer(byte[] futureProofBuffer) {
        this.futureProofBuffer = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(futureProofBuffer);
        return this;
    }

    public ButtonOpaqueDataBuilder clientUrl(it.auties.protobuf.model.ProtobufString clientUrl) {
        this.clientUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(clientUrl));
        return this;
    }

    public ButtonOpaqueDataBuilder clientUrl(java.lang.String clientUrl) {
        this.clientUrl = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(clientUrl);
        return this;
    }

    public ButtonOpaqueDataBuilder loc(it.auties.protobuf.model.ProtobufString loc) {
        this.loc = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(loc));
        return this;
    }

    public ButtonOpaqueDataBuilder loc(java.lang.String loc) {
        this.loc = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(loc);
        return this;
    }

    public ButtonOpaqueDataBuilder pollName(it.auties.protobuf.model.ProtobufString pollName) {
        this.pollName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(pollName));
        return this;
    }

    public ButtonOpaqueDataBuilder pollName(java.lang.String pollName) {
        this.pollName = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(pollName);
        return this;
    }

    public ButtonOpaqueDataBuilder pollOptions(java.util.List<it.auties.whatsapp.model.poll.PollOption> pollOptions) {
        this.pollOptions = pollOptions;
        return this;
    }

    public ButtonOpaqueDataBuilder pollSelectableOptionsCount(int pollSelectableOptionsCount) {
        this.pollSelectableOptionsCount = pollSelectableOptionsCount;
        return this;
    }

    public ButtonOpaqueDataBuilder messageSecret(java.nio.ByteBuffer messageSecret) {
        this.messageSecret = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(messageSecret));
        return this;
    }

    public ButtonOpaqueDataBuilder messageSecret(byte[] messageSecret) {
        this.messageSecret = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(messageSecret);
        return this;
    }

    public ButtonOpaqueDataBuilder originalSelfAuthor(it.auties.protobuf.model.ProtobufString originalSelfAuthor) {
        this.originalSelfAuthor = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(originalSelfAuthor));
        return this;
    }

    public ButtonOpaqueDataBuilder originalSelfAuthor(java.lang.String originalSelfAuthor) {
        this.originalSelfAuthor = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(originalSelfAuthor);
        return this;
    }

    public ButtonOpaqueDataBuilder senderTimestampMs(long senderTimestampMs) {
        this.senderTimestampMs = senderTimestampMs;
        return this;
    }

    public ButtonOpaqueDataBuilder pollUpdateParentKey(it.auties.protobuf.model.ProtobufString pollUpdateParentKey) {
        this.pollUpdateParentKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(pollUpdateParentKey));
        return this;
    }

    public ButtonOpaqueDataBuilder pollUpdateParentKey(java.lang.String pollUpdateParentKey) {
        this.pollUpdateParentKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(pollUpdateParentKey);
        return this;
    }

    public ButtonOpaqueDataBuilder encPollVote(it.auties.whatsapp.model.poll.PollUpdateEncryptedMetadata encPollVote) {
        this.encPollVote = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(encPollVote);
        return this;
    }

    public ButtonOpaqueDataBuilder encReactionTargetMessageKey(it.auties.protobuf.model.ProtobufString encReactionTargetMessageKey) {
        this.encReactionTargetMessageKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(encReactionTargetMessageKey));
        return this;
    }

    public ButtonOpaqueDataBuilder encReactionTargetMessageKey(java.lang.String encReactionTargetMessageKey) {
        this.encReactionTargetMessageKey = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(encReactionTargetMessageKey);
        return this;
    }

    public ButtonOpaqueDataBuilder encReactionEncPayload(java.nio.ByteBuffer encReactionEncPayload) {
        this.encReactionEncPayload = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(encReactionEncPayload));
        return this;
    }

    public ButtonOpaqueDataBuilder encReactionEncPayload(byte[] encReactionEncPayload) {
        this.encReactionEncPayload = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(encReactionEncPayload);
        return this;
    }

    public ButtonOpaqueDataBuilder encReactionEncIv(java.nio.ByteBuffer encReactionEncIv) {
        this.encReactionEncIv = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(encReactionEncIv));
        return this;
    }

    public ButtonOpaqueDataBuilder encReactionEncIv(byte[] encReactionEncIv) {
        this.encReactionEncIv = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(encReactionEncIv);
        return this;
    }

    public it.auties.whatsapp.model.button.base.ButtonOpaqueData build() {
        return new it.auties.whatsapp.model.button.base.ButtonOpaqueData(body, caption, longitude, latitude, paymentAmount1000, paymentNote, canonicalUrl, matchedText, title, description, isLive, futureProofBuffer, clientUrl, loc, pollName, pollOptions, pollSelectableOptionsCount, messageSecret, originalSelfAuthor, senderTimestampMs, pollUpdateParentKey, encPollVote, encReactionTargetMessageKey, encReactionEncPayload, encReactionEncIv);
    }

}
