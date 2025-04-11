package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.SingleSelectReplyButton;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SingleSelectReplyButtonSpec {
    public static byte[] encode(SingleSelectReplyButton protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SingleSelectReplyButton protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var rowId = protoInputObject.rowId();
        if (rowId != null) {
            var rowId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(rowId);
            if (rowId0 != null) {
                protoOutputStream.writeString(1, rowId0);
            }
        }
    }

    public static SingleSelectReplyButton decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SingleSelectReplyButton decode(ProtobufInputStream protoInputStream) {
        java.lang.String rowId = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> rowId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.SingleSelectReplyButton(rowId);
    }

    public static int sizeOf(SingleSelectReplyButton protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var rowId = protoInputObject.rowId();
        if (rowId != null) {
            var rowId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(rowId);
            if (rowId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(rowId0);
            }
        }
        return protoOutputSize;
    }

}
