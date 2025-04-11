package it.auties.whatsapp.model.signal.sender;

import it.auties.whatsapp.model.signal.sender.SenderKeyRecord;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SenderKeyRecordSpec {
    public static byte[] encode(SenderKeyRecord protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(SenderKeyRecord protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.states() != null) {
            for (var statesEntry : protoInputObject.states()) { 
                if (statesEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.signal.sender.SenderKeyStateSpec.sizeOf(statesEntry));
                    it.auties.whatsapp.model.signal.sender.SenderKeyStateSpec.encode(statesEntry, protoOutputStream);
                }
            }
        }
    }

    public static SenderKeyRecord decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static SenderKeyRecord decode(ProtobufInputStream protoInputStream) {
        java.util.List<it.auties.whatsapp.model.signal.sender.SenderKeyState> states = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> states.add(it.auties.whatsapp.model.signal.sender.SenderKeyStateSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.sender.SenderKeyRecord(states);
    }

    public static int sizeOf(SenderKeyRecord protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.states() != null) {
            for (var statesEntry : protoInputObject.states()) { 
                if (statesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var statesEntrySerializedSize = it.auties.whatsapp.model.signal.sender.SenderKeyStateSpec.sizeOf(statesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(statesEntrySerializedSize);
                    protoOutputSize += statesEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
