package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.HandshakeMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HandshakeMessageSpec {
    public static byte[] encode(HandshakeMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HandshakeMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var clientHello = protoInputObject.clientHello();
        if (clientHello != null) {
            protoOutputStream.writeMessage(2, it.auties.whatsapp.model.signal.auth.ClientHelloSpec.sizeOf(clientHello));
            it.auties.whatsapp.model.signal.auth.ClientHelloSpec.encode(clientHello, protoOutputStream);
        }
        var serverHello = protoInputObject.serverHello();
        if (serverHello != null) {
            protoOutputStream.writeMessage(3, it.auties.whatsapp.model.signal.auth.ServerHelloSpec.sizeOf(serverHello));
            it.auties.whatsapp.model.signal.auth.ServerHelloSpec.encode(serverHello, protoOutputStream);
        }
        var clientFinish = protoInputObject.clientFinish();
        if (clientFinish != null) {
            protoOutputStream.writeMessage(4, it.auties.whatsapp.model.signal.auth.ClientFinishSpec.sizeOf(clientFinish));
            it.auties.whatsapp.model.signal.auth.ClientFinishSpec.encode(clientFinish, protoOutputStream);
        }
    }

    public static HandshakeMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HandshakeMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.signal.auth.ClientHello clientHello = null;
        it.auties.whatsapp.model.signal.auth.ServerHello serverHello = null;
        it.auties.whatsapp.model.signal.auth.ClientFinish clientFinish = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 2 -> clientHello = it.auties.whatsapp.model.signal.auth.ClientHelloSpec.decode(protoInputStream.readLengthDelimited());
                case 3 -> serverHello = it.auties.whatsapp.model.signal.auth.ServerHelloSpec.decode(protoInputStream.readLengthDelimited());
                case 4 -> clientFinish = it.auties.whatsapp.model.signal.auth.ClientFinishSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.HandshakeMessage(clientHello, serverHello, clientFinish);
    }

    public static int sizeOf(HandshakeMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var clientHello = protoInputObject.clientHello();
        if (clientHello != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var clientHelloSerializedSize = it.auties.whatsapp.model.signal.auth.ClientHelloSpec.sizeOf(clientHello);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(clientHelloSerializedSize);
            protoOutputSize += clientHelloSerializedSize;
        }
        var serverHello = protoInputObject.serverHello();
        if (serverHello != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            var serverHelloSerializedSize = it.auties.whatsapp.model.signal.auth.ServerHelloSpec.sizeOf(serverHello);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(serverHelloSerializedSize);
            protoOutputSize += serverHelloSerializedSize;
        }
        var clientFinish = protoInputObject.clientFinish();
        if (clientFinish != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            var clientFinishSerializedSize = it.auties.whatsapp.model.signal.auth.ClientFinishSpec.sizeOf(clientFinish);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(clientFinishSerializedSize);
            protoOutputSize += clientFinishSerializedSize;
        }
        return protoOutputSize;
    }

}
