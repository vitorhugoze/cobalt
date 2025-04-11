package it.auties.whatsapp.model.message.standard;

public class LocationMessageBuilder {
    private double latitude;
    private double longitude;
    private java.lang.String name;
    private java.lang.String address;
    private java.lang.String url;
    private boolean live;
    private int accuracy;
    private float speed;
    private int magneticNorthOffset;
    private java.lang.String caption;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public LocationMessageBuilder() {
        latitude = 0d;
        longitude = 0d;
        name = null;
        address = null;
        url = null;
        live = false;
        accuracy = 0;
        speed = 0f;
        magneticNorthOffset = 0;
        caption = null;
        thumbnail = null;
        contextInfo = null;
    }

    public LocationMessageBuilder latitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public LocationMessageBuilder longitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public LocationMessageBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public LocationMessageBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public LocationMessageBuilder address(it.auties.protobuf.model.ProtobufString address) {
        this.address = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(address);
        return this;
    }

    public LocationMessageBuilder address(java.lang.String address) {
        this.address = address;
        return this;
    }

    public LocationMessageBuilder url(it.auties.protobuf.model.ProtobufString url) {
        this.url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(url);
        return this;
    }

    public LocationMessageBuilder url(java.lang.String url) {
        this.url = url;
        return this;
    }

    public LocationMessageBuilder live(boolean live) {
        this.live = live;
        return this;
    }

    public LocationMessageBuilder accuracy(int accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public LocationMessageBuilder speed(float speed) {
        this.speed = speed;
        return this;
    }

    public LocationMessageBuilder magneticNorthOffset(int magneticNorthOffset) {
        this.magneticNorthOffset = magneticNorthOffset;
        return this;
    }

    public LocationMessageBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption);
        return this;
    }

    public LocationMessageBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public LocationMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public LocationMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public LocationMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.LocationMessage build() {
        return new it.auties.whatsapp.model.message.standard.LocationMessage(latitude, longitude, name, address, url, live, accuracy, speed, magneticNorthOffset, caption, thumbnail, contextInfo);
    }

}
