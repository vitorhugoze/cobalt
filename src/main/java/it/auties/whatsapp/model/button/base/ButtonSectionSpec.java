package it.auties.whatsapp.model.button.base;

import it.auties.whatsapp.model.button.base.ButtonSection;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ButtonSectionSpec {
    public static byte[] encode(ButtonSection protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ButtonSection protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputStream.writeString(1, title0);
            }
        }
        if (protoInputObject.rows() != null) {
            for (var rowsEntry : protoInputObject.rows()) { 
                if (rowsEntry != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.button.base.ButtonRowSpec.sizeOf(rowsEntry));
                    it.auties.whatsapp.model.button.base.ButtonRowSpec.encode(rowsEntry, protoOutputStream);
                }
            }
        }
    }

    public static ButtonSection decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ButtonSection decode(ProtobufInputStream protoInputStream) {
        java.lang.String title = null;
        java.util.List<it.auties.whatsapp.model.button.base.ButtonRow> rows = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> rows.add(it.auties.whatsapp.model.button.base.ButtonRowSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.base.ButtonSection(title, rows);
    }

    public static int sizeOf(ButtonSection protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(title0);
            }
        }
        if (protoInputObject.rows() != null) {
            for (var rowsEntry : protoInputObject.rows()) { 
                if (rowsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                    var rowsEntrySerializedSize = it.auties.whatsapp.model.button.base.ButtonRowSpec.sizeOf(rowsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(rowsEntrySerializedSize);
                    protoOutputSize += rowsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
