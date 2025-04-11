package it.auties.whatsapp.model.button.interactive;

public class InteractiveLocationBuilder {
    private double latitude;
    private double longitude;
    private java.lang.String name;

    public InteractiveLocationBuilder() {
        latitude = 0d;
        longitude = 0d;
        name = null;
    }

    public InteractiveLocationBuilder latitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public InteractiveLocationBuilder longitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public InteractiveLocationBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public InteractiveLocationBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveLocation build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveLocation(latitude, longitude, name);
    }

}
