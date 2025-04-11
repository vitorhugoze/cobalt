package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.CallMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CallMessageSpec {
    public static byte[] encode(CallMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CallMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            var key0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(key);
            if (key0 != null) {
                protoOutputStream.writeBytes(1, key0);
            }
        }
        var source = protoInputObject.source();
        if (source != null) {
            var source0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(source);
            if (source0 != null) {
                protoOutputStream.writeString(2, source0);
            }
        }
        var data = protoInputObject.data();
        if (data != null) {
            var data0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(data);
            if (data0 != null) {
                protoOutputStream.writeBytes(3, data0);
            }
        }
        var delay = protoInputObject.delay();
        protoOutputStream.writeUInt32(4, delay);
    }

    public static CallMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CallMessage decode(ProtobufInputStream protoInputStream) {
        byte[] key = null;
        java.lang.String source = null;
        byte[] data = null;
        int delay = 0;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> source = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> data = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> delay = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.CallMessage(key, source, data, delay);
    }

    public static int sizeOf(CallMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var key = protoInputObject.key();
        if (key != null) {
            var key0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(key);
            if (key0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(key0);
            }
        }
        var source = protoInputObject.source();
        if (source != null) {
            var source0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(source);
            if (source0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(source0);
            }
        }
        var data = protoInputObject.data();
        if (data != null) {
            var data0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(data);
            if (data0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(data0);
            }
        }
        var delay = protoInputObject.delay();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(delay);
        return protoOutputSize;
    }

}
