package it.auties.whatsapp.model.action;

import it.auties.whatsapp.model.action.LabelEditAction;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class LabelEditActionSpec {
    public static byte[] encode(LabelEditAction protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(LabelEditAction protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(1, name0);
            }
        }
        var color = protoInputObject.color();
        protoOutputStream.writeInt32(2, color);
        var id = protoInputObject.id();
        protoOutputStream.writeInt32(3, id);
        var deleted = protoInputObject.deleted();
        protoOutputStream.writeBool(4, deleted);
    }

    public static LabelEditAction decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static LabelEditAction decode(ProtobufInputStream protoInputStream) {
        java.lang.String name = null;
        int color = 0;
        int id = 0;
        boolean deleted = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> color = protoInputStream.readInt32();
                case 3 -> id = protoInputStream.readInt32();
                case 4 -> deleted = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.action.LabelEditAction(name, color, id, deleted);
    }

    public static int sizeOf(LabelEditAction protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        var color = protoInputObject.color();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(color);
        var id = protoInputObject.id();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(id);
        var deleted = protoInputObject.deleted();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
