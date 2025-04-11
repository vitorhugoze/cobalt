package it.auties.whatsapp.model.message.standard;

public class LiveLocationMessageBuilder {
    private double latitude;
    private double longitude;
    private int accuracy;
    private float speed;
    private int magneticNorthOffset;
    private java.lang.String caption;
    private long sequenceNumber;
    private int timeOffset;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public LiveLocationMessageBuilder() {
        latitude = 0d;
        longitude = 0d;
        accuracy = 0;
        speed = 0f;
        magneticNorthOffset = 0;
        caption = null;
        sequenceNumber = 0l;
        timeOffset = 0;
        thumbnail = null;
        contextInfo = null;
    }

    public LiveLocationMessageBuilder latitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public LiveLocationMessageBuilder longitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public LiveLocationMessageBuilder accuracy(int accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public LiveLocationMessageBuilder speed(float speed) {
        this.speed = speed;
        return this;
    }

    public LiveLocationMessageBuilder magneticNorthOffset(int magneticNorthOffset) {
        this.magneticNorthOffset = magneticNorthOffset;
        return this;
    }

    public LiveLocationMessageBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption);
        return this;
    }

    public LiveLocationMessageBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public LiveLocationMessageBuilder sequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public LiveLocationMessageBuilder timeOffset(int timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    public LiveLocationMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public LiveLocationMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public LiveLocationMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.LiveLocationMessage build() {
        return new it.auties.whatsapp.model.message.standard.LiveLocationMessage(latitude, longitude, accuracy, speed, magneticNorthOffset, caption, sequenceNumber, timeOffset, thumbnail, contextInfo);
    }

}
