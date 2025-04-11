package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ExitCode;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ExitCodeSpec {
    public static byte[] encode(ExitCode protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ExitCode protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var code = protoInputObject.code();
        protoOutputStream.writeUInt64(1, code);
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputStream.writeString(2, text0);
            }
        }
    }

    public static ExitCode decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ExitCode decode(ProtobufInputStream protoInputStream) {
        long code = 0l;
        java.lang.String text = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> code = protoInputStream.readInt64();
                case 2 -> text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ExitCode(code, text);
    }

    public static int sizeOf(ExitCode protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var code = protoInputObject.code();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(code);
        var text = protoInputObject.text();
        if (text != null) {
            var text0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(text);
            if (text0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(text0);
            }
        }
        return protoOutputSize;
    }

}
