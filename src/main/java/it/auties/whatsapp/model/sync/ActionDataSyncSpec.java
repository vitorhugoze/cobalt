package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ActionDataSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ActionDataSyncSpec {
    public static byte[] encode(ActionDataSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ActionDataSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var index = protoInputObject.index();
        if (index != null) {
            var index0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(index);
            if (index0 != null) {
                protoOutputStream.writeBytes(1, index0);
            }
        }
        var value = protoInputObject.value();
        if (value != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.sync.ActionValueSyncSpec.sizeOf(value));
            it.auties.whatsapp.model.sync.ActionValueSyncSpec.encode(value, protoOutputStream);
        }
        var padding = protoInputObject.padding();
        if (padding != null) {
            var padding0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(padding);
            if (padding0 != null) {
                protoOutputStream.writeBytes(3, padding0);
            }
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputStream.writeInt32(4, version);
        }
    }

    public static ActionDataSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ActionDataSync decode(ProtobufInputStream protoInputStream) {
        byte[] index = null;
        it.auties.whatsapp.model.sync.ActionValueSync value = null;
        byte[] padding = null;
        java.lang.Integer version = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> index = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> value = it.auties.whatsapp.model.sync.ActionValueSyncSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> padding = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> version = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ActionDataSync(index, value, padding, version);
    }

    public static int sizeOf(ActionDataSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var index = protoInputObject.index();
        if (index != null) {
            var index0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(index);
            if (index0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(index0);
            }
        }
        var value = protoInputObject.value();
        if (value != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var valueSerializedSize = it.auties.whatsapp.model.sync.ActionValueSyncSpec.sizeOf(value);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(valueSerializedSize);
            protoOutputSize += valueSerializedSize;
        }
        var padding = protoInputObject.padding();
        if (padding != null) {
            var padding0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(padding);
            if (padding0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(padding0);
            }
        }
        var version = protoInputObject.version();
        if (version != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(version);
        }
        return protoOutputSize;
    }

}
