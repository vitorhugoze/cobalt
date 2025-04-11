package it.auties.whatsapp.model.message.standard;

public class AudioMessageBuilder {
    private java.lang.String mediaUrl;
    private java.lang.String mimetype;
    private byte[] mediaSha256;
    private java.lang.Long mediaSize;
    private java.lang.Integer duration;
    private boolean voiceMessage;
    private byte[] mediaKey;
    private byte[] mediaEncryptedSha256;
    private java.lang.String mediaDirectPath;
    private java.lang.Long mediaKeyTimestampSeconds;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private byte[] streamingSidecar;
    private byte[] waveform;
    private java.lang.Integer backgroundArgb;

    public AudioMessageBuilder() {
        mediaUrl = null;
        mimetype = null;
        mediaSha256 = null;
        mediaSize = null;
        duration = null;
        voiceMessage = false;
        mediaKey = null;
        mediaEncryptedSha256 = null;
        mediaDirectPath = null;
        mediaKeyTimestampSeconds = null;
        contextInfo = null;
        streamingSidecar = null;
        waveform = null;
        backgroundArgb = null;
    }

    public AudioMessageBuilder mediaUrl(it.auties.protobuf.model.ProtobufString mediaUrl) {
        this.mediaUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaUrl);
        return this;
    }

    public AudioMessageBuilder mediaUrl(java.lang.String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public AudioMessageBuilder mimetype(it.auties.protobuf.model.ProtobufString mimetype) {
        this.mimetype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mimetype);
        return this;
    }

    public AudioMessageBuilder mimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    public AudioMessageBuilder mediaSha256(java.nio.ByteBuffer mediaSha256) {
        this.mediaSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaSha256);
        return this;
    }

    public AudioMessageBuilder mediaSha256(byte[] mediaSha256) {
        this.mediaSha256 = mediaSha256;
        return this;
    }

    public AudioMessageBuilder mediaSize(java.lang.Long mediaSize) {
        this.mediaSize = mediaSize;
        return this;
    }

    public AudioMessageBuilder duration(java.lang.Integer duration) {
        this.duration = duration;
        return this;
    }

    public AudioMessageBuilder voiceMessage(boolean voiceMessage) {
        this.voiceMessage = voiceMessage;
        return this;
    }

    public AudioMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public AudioMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public AudioMessageBuilder mediaEncryptedSha256(java.nio.ByteBuffer mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaEncryptedSha256);
        return this;
    }

    public AudioMessageBuilder mediaEncryptedSha256(byte[] mediaEncryptedSha256) {
        this.mediaEncryptedSha256 = mediaEncryptedSha256;
        return this;
    }

    public AudioMessageBuilder mediaDirectPath(it.auties.protobuf.model.ProtobufString mediaDirectPath) {
        this.mediaDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaDirectPath);
        return this;
    }

    public AudioMessageBuilder mediaDirectPath(java.lang.String mediaDirectPath) {
        this.mediaDirectPath = mediaDirectPath;
        return this;
    }

    public AudioMessageBuilder mediaKeyTimestampSeconds(java.lang.Long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public AudioMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public AudioMessageBuilder streamingSidecar(java.nio.ByteBuffer streamingSidecar) {
        this.streamingSidecar = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(streamingSidecar);
        return this;
    }

    public AudioMessageBuilder streamingSidecar(byte[] streamingSidecar) {
        this.streamingSidecar = streamingSidecar;
        return this;
    }

    public AudioMessageBuilder waveform(java.nio.ByteBuffer waveform) {
        this.waveform = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(waveform);
        return this;
    }

    public AudioMessageBuilder waveform(byte[] waveform) {
        this.waveform = waveform;
        return this;
    }

    public AudioMessageBuilder backgroundArgb(java.lang.Integer backgroundArgb) {
        this.backgroundArgb = backgroundArgb;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.AudioMessage build() {
        return new it.auties.whatsapp.model.message.standard.AudioMessage(mediaUrl, mimetype, mediaSha256, mediaSize, duration, voiceMessage, mediaKey, mediaEncryptedSha256, mediaDirectPath, mediaKeyTimestampSeconds, contextInfo, streamingSidecar, waveform, backgroundArgb);
    }

}
