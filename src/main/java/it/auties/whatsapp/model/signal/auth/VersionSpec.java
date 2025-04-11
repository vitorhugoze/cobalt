package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.Version;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class VersionSpec {
    public static byte[] encode(Version protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(Version protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var primary = protoInputObject.primary();
        if (primary != null) {
            protoOutputStream.writeUInt32(1, primary);
        }
        var secondary = protoInputObject.secondary();
        if (secondary != null) {
            protoOutputStream.writeUInt32(2, secondary);
        }
        var tertiary = protoInputObject.tertiary();
        if (tertiary != null) {
            protoOutputStream.writeUInt32(3, tertiary);
        }
        var quaternary = protoInputObject.quaternary();
        if (quaternary != null) {
            protoOutputStream.writeUInt32(4, quaternary);
        }
        var quinary = protoInputObject.quinary();
        if (quinary != null) {
            protoOutputStream.writeUInt32(5, quinary);
        }
    }

    public static Version decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static Version decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer primary = null;
        java.lang.Integer secondary = null;
        java.lang.Integer tertiary = null;
        java.lang.Integer quaternary = null;
        java.lang.Integer quinary = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> primary = protoInputStream.readInt32();
                case 2 -> secondary = protoInputStream.readInt32();
                case 3 -> tertiary = protoInputStream.readInt32();
                case 4 -> quaternary = protoInputStream.readInt32();
                case 5 -> quinary = protoInputStream.readInt32();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.Version(primary, secondary, tertiary, quaternary, quinary);
    }

    public static int sizeOf(Version protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var primary = protoInputObject.primary();
        if (primary != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(primary);
        }
        var secondary = protoInputObject.secondary();
        if (secondary != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(secondary);
        }
        var tertiary = protoInputObject.tertiary();
        if (tertiary != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(tertiary);
        }
        var quaternary = protoInputObject.quaternary();
        if (quaternary != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(quaternary);
        }
        var quinary = protoInputObject.quinary();
        if (quinary != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(quinary);
        }
        return protoOutputSize;
    }

}
