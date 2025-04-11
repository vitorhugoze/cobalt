package it.auties.whatsapp.model.button.interactive;

public class InteractiveLocationAnnotationBuilder {
    private java.util.List<it.auties.whatsapp.model.button.interactive.InteractivePoint> polygonVertices;
    private it.auties.whatsapp.model.button.interactive.InteractiveLocation location;

    public InteractiveLocationAnnotationBuilder() {
        polygonVertices = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        location = null;
    }

    public InteractiveLocationAnnotationBuilder polygonVertices(java.util.List<it.auties.whatsapp.model.button.interactive.InteractivePoint> polygonVertices) {
        this.polygonVertices = polygonVertices;
        return this;
    }

    public InteractiveLocationAnnotationBuilder location(it.auties.whatsapp.model.button.interactive.InteractiveLocation location) {
        this.location = location;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation build() {
        return new it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation(polygonVertices, location);
    }

}
