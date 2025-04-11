package it.auties.whatsapp.model.button.interactive;

import it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class InteractiveLocationAnnotationSpec {
    public static byte[] encode(InteractiveLocationAnnotation protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(InteractiveLocationAnnotation protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.polygonVertices() != null) {
            for (var polygonVerticesEntry : protoInputObject.polygonVertices()) { 
                if (polygonVerticesEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.button.interactive.InteractivePointSpec.sizeOf(polygonVerticesEntry));
                    it.auties.whatsapp.model.button.interactive.InteractivePointSpec.encode(polygonVerticesEntry, protoOutputStream);
                }
            }
        }
        var location = protoInputObject.location();
        if (location != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.interactive.InteractiveLocationSpec.sizeOf(location));
            it.auties.whatsapp.model.button.interactive.InteractiveLocationSpec.encode(location, protoOutputStream);
        }
    }

    public static InteractiveLocationAnnotation decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static InteractiveLocationAnnotation decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.button.interactive.InteractivePoint> polygonVertices = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        it.auties.whatsapp.model.button.interactive.InteractiveLocation location = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> polygonVertices.add(it.auties.whatsapp.model.button.interactive.InteractivePointSpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> location = it.auties.whatsapp.model.button.interactive.InteractiveLocationSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.interactive.InteractiveLocationAnnotation(polygonVertices, location);
    }

    public static int sizeOf(InteractiveLocationAnnotation protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.polygonVertices() != null) {
            for (var polygonVerticesEntry : protoInputObject.polygonVertices()) { 
                if (polygonVerticesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var polygonVerticesEntrySerializedSize = it.auties.whatsapp.model.button.interactive.InteractivePointSpec.sizeOf(polygonVerticesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(polygonVerticesEntrySerializedSize);
                    protoOutputSize += polygonVerticesEntrySerializedSize;
                }
            }
        }
        var location = protoInputObject.location();
        if (location != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var locationSerializedSize = it.auties.whatsapp.model.button.interactive.InteractiveLocationSpec.sizeOf(location);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(locationSerializedSize);
            protoOutputSize += locationSerializedSize;
        }
        return protoOutputSize;
    }

}
