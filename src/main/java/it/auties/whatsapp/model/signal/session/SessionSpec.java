package it.auties.whatsapp.model.signal.session;

import it.auties.whatsapp.model.signal.session.Session;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class SessionSpec {
    public static byte[] encode(Session protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Session protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.states() != null) {
            for (var statesEntry : protoInputObject.states()) { 
                if (statesEntry != null) {
                    protoOutputStream.writeMessage(1, it.auties.whatsapp.model.signal.session.SessionStateSpec.sizeOf(statesEntry));
                    it.auties.whatsapp.model.signal.session.SessionStateSpec.encode(statesEntry, protoOutputStream);
                }
            }
        }
    }

    public static Session decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Session decode(ProtobufInputStream protoInputStream) {
        java.util.concurrent.ConcurrentHashMap.KeySetView<it.auties.whatsapp.model.signal.session.SessionState,java.lang.Boolean> states = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newKeySet();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> states.add(it.auties.whatsapp.model.signal.session.SessionStateSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.session.Session(states);
    }

    public static int sizeOf(Session protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.states() != null) {
            for (var statesEntry : protoInputObject.states()) { 
                if (statesEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    var statesEntrySerializedSize = it.auties.whatsapp.model.signal.session.SessionStateSpec.sizeOf(statesEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(statesEntrySerializedSize);
                    protoOutputSize += statesEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

}
