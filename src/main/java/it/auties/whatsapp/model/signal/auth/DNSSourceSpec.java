package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.DNSSource;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class DNSSourceSpec {
    public static byte[] encode(DNSSource protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(DNSSource protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var dnsMethod = protoInputObject.dnsMethod();
        if (dnsMethod != null) {
            var dnsMethod0 = it.auties.whatsapp.model.signal.auth.DNSSourceResolutionMethodSpec.encode(dnsMethod);
            protoOutputStream.writeInt32(15, dnsMethod0);
        }
        var appCached = protoInputObject.appCached();
        protoOutputStream.writeBool(16, appCached);
    }

    public static DNSSource decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static DNSSource decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.signal.auth.DNSSource.ResolutionMethod dnsMethod = null;
        boolean appCached = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 15 -> dnsMethod = it.auties.whatsapp.model.signal.auth.DNSSourceResolutionMethodSpec.decode(protoInputStream.readInt32());
                case 16 -> appCached = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.DNSSource(dnsMethod, appCached);
    }

    public static int sizeOf(DNSSource protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var dnsMethod = protoInputObject.dnsMethod();
        if (dnsMethod != null) {
            var dnsMethod0 = it.auties.whatsapp.model.signal.auth.DNSSourceResolutionMethodSpec.encode(dnsMethod);
            protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(dnsMethod0);
        }
        var appCached = protoInputObject.appCached();
        protoOutputSize += ProtobufOutputStream.getFieldSize(16, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
