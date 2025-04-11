package it.auties.whatsapp.model.poll;

import it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PollUpdateEncryptedOptionsSpec {
    public static byte[] encode(PollUpdateEncryptedOptions protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PollUpdateEncryptedOptions protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.selectedOptions() != null) {
            for (var selectedOptionsEntry : protoInputObject.selectedOptions()) { 
                if (selectedOptionsEntry != null) {
                    var selectedOptions0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(selectedOptionsEntry);
                    if (selectedOptions0 != null) {
                        protoOutputStream.writeBytes(1, selectedOptions0);
                    }
                }
            }
        }
    }

    public static PollUpdateEncryptedOptions decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PollUpdateEncryptedOptions decode(ProtobufInputStream protoInputStream) {
        java.util.List<byte[]> selectedOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> selectedOptions.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions(selectedOptions);
    }

    public static int sizeOf(PollUpdateEncryptedOptions protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.selectedOptions() != null) {
            for (var selectedOptionsEntry : protoInputObject.selectedOptions()) { 
                if (selectedOptionsEntry != null) {
                    var selectedOptionsEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(selectedOptionsEntry);
                    if (selectedOptionsEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                        protoOutputSize += ProtobufOutputStream.getBytesSize(selectedOptionsEntry0);
                    }
                }
            }
        }
        return protoOutputSize;
    }

}
