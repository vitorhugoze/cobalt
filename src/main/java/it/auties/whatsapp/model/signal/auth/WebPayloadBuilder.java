package it.auties.whatsapp.model.signal.auth;

public class WebPayloadBuilder {
    private boolean usesParticipantInKey;
    private boolean supportsStarredMessages;
    private boolean supportsDocumentMessages;
    private boolean supportsUrlMessages;
    private boolean supportsMediaRetry;
    private boolean supportsE2EImage;
    private boolean supportsE2EVideo;
    private boolean supportsE2EAudio;
    private boolean supportsE2EDocument;
    private java.lang.String documentTypes;
    private byte[] features;

    public WebPayloadBuilder() {
        usesParticipantInKey = false;
        supportsStarredMessages = false;
        supportsDocumentMessages = false;
        supportsUrlMessages = false;
        supportsMediaRetry = false;
        supportsE2EImage = false;
        supportsE2EVideo = false;
        supportsE2EAudio = false;
        supportsE2EDocument = false;
        documentTypes = null;
        features = null;
    }

    public WebPayloadBuilder usesParticipantInKey(boolean usesParticipantInKey) {
        this.usesParticipantInKey = usesParticipantInKey;
        return this;
    }

    public WebPayloadBuilder supportsStarredMessages(boolean supportsStarredMessages) {
        this.supportsStarredMessages = supportsStarredMessages;
        return this;
    }

    public WebPayloadBuilder supportsDocumentMessages(boolean supportsDocumentMessages) {
        this.supportsDocumentMessages = supportsDocumentMessages;
        return this;
    }

    public WebPayloadBuilder supportsUrlMessages(boolean supportsUrlMessages) {
        this.supportsUrlMessages = supportsUrlMessages;
        return this;
    }

    public WebPayloadBuilder supportsMediaRetry(boolean supportsMediaRetry) {
        this.supportsMediaRetry = supportsMediaRetry;
        return this;
    }

    public WebPayloadBuilder supportsE2EImage(boolean supportsE2EImage) {
        this.supportsE2EImage = supportsE2EImage;
        return this;
    }

    public WebPayloadBuilder supportsE2EVideo(boolean supportsE2EVideo) {
        this.supportsE2EVideo = supportsE2EVideo;
        return this;
    }

    public WebPayloadBuilder supportsE2EAudio(boolean supportsE2EAudio) {
        this.supportsE2EAudio = supportsE2EAudio;
        return this;
    }

    public WebPayloadBuilder supportsE2EDocument(boolean supportsE2EDocument) {
        this.supportsE2EDocument = supportsE2EDocument;
        return this;
    }

    public WebPayloadBuilder documentTypes(it.auties.protobuf.model.ProtobufString documentTypes) {
        this.documentTypes = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(documentTypes);
        return this;
    }

    public WebPayloadBuilder documentTypes(java.lang.String documentTypes) {
        this.documentTypes = documentTypes;
        return this;
    }

    public WebPayloadBuilder features(java.nio.ByteBuffer features) {
        this.features = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(features);
        return this;
    }

    public WebPayloadBuilder features(byte[] features) {
        this.features = features;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.WebPayload build() {
        return new it.auties.whatsapp.model.signal.auth.WebPayload(usesParticipantInKey, supportsStarredMessages, supportsDocumentMessages, supportsUrlMessages, supportsMediaRetry, supportsE2EImage, supportsE2EVideo, supportsE2EAudio, supportsE2EDocument, documentTypes, features);
    }

}
