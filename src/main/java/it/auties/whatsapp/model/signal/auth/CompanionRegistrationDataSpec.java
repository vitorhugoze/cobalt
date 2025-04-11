package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.CompanionRegistrationData;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class CompanionRegistrationDataSpec {
    public static byte[] encode(CompanionRegistrationData protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(CompanionRegistrationData protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var eRegid = protoInputObject.eRegid();
        if (eRegid != null) {
            var eRegid0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eRegid);
            if (eRegid0 != null) {
                protoOutputStream.writeBytes(1, eRegid0);
            }
        }
        var eKeytype = protoInputObject.eKeytype();
        if (eKeytype != null) {
            var eKeytype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eKeytype);
            if (eKeytype0 != null) {
                protoOutputStream.writeBytes(2, eKeytype0);
            }
        }
        var eIdent = protoInputObject.eIdent();
        if (eIdent != null) {
            var eIdent0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eIdent);
            if (eIdent0 != null) {
                protoOutputStream.writeBytes(3, eIdent0);
            }
        }
        var eSkeyId = protoInputObject.eSkeyId();
        if (eSkeyId != null) {
            var eSkeyId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eSkeyId);
            if (eSkeyId0 != null) {
                protoOutputStream.writeBytes(4, eSkeyId0);
            }
        }
        var eSkeyVal = protoInputObject.eSkeyVal();
        if (eSkeyVal != null) {
            var eSkeyVal0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eSkeyVal);
            if (eSkeyVal0 != null) {
                protoOutputStream.writeBytes(5, eSkeyVal0);
            }
        }
        var eSkeySig = protoInputObject.eSkeySig();
        if (eSkeySig != null) {
            var eSkeySig0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eSkeySig);
            if (eSkeySig0 != null) {
                protoOutputStream.writeBytes(6, eSkeySig0);
            }
        }
        var buildHash = protoInputObject.buildHash();
        if (buildHash != null) {
            var buildHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buildHash);
            if (buildHash0 != null) {
                protoOutputStream.writeBytes(7, buildHash0);
            }
        }
        var companionProps = protoInputObject.companionProps();
        if (companionProps != null) {
            var companionProps0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(companionProps);
            if (companionProps0 != null) {
                protoOutputStream.writeBytes(8, companionProps0);
            }
        }
    }

    public static CompanionRegistrationData decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static CompanionRegistrationData decode(ProtobufInputStream protoInputStream) {
        byte[] eRegid = null;
        byte[] eKeytype = null;
        byte[] eIdent = null;
        byte[] eSkeyId = null;
        byte[] eSkeyVal = null;
        byte[] eSkeySig = null;
        byte[] buildHash = null;
        byte[] companionProps = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> eRegid = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> eKeytype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 3 -> eIdent = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 4 -> eSkeyId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 5 -> eSkeyVal = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 6 -> eSkeySig = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 7 -> buildHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 8 -> companionProps = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.CompanionRegistrationData(eRegid, eKeytype, eIdent, eSkeyId, eSkeyVal, eSkeySig, buildHash, companionProps);
    }

    public static int sizeOf(CompanionRegistrationData protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var eRegid = protoInputObject.eRegid();
        if (eRegid != null) {
            var eRegid0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eRegid);
            if (eRegid0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(eRegid0);
            }
        }
        var eKeytype = protoInputObject.eKeytype();
        if (eKeytype != null) {
            var eKeytype0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eKeytype);
            if (eKeytype0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(eKeytype0);
            }
        }
        var eIdent = protoInputObject.eIdent();
        if (eIdent != null) {
            var eIdent0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eIdent);
            if (eIdent0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(eIdent0);
            }
        }
        var eSkeyId = protoInputObject.eSkeyId();
        if (eSkeyId != null) {
            var eSkeyId0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eSkeyId);
            if (eSkeyId0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(eSkeyId0);
            }
        }
        var eSkeyVal = protoInputObject.eSkeyVal();
        if (eSkeyVal != null) {
            var eSkeyVal0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eSkeyVal);
            if (eSkeyVal0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(eSkeyVal0);
            }
        }
        var eSkeySig = protoInputObject.eSkeySig();
        if (eSkeySig != null) {
            var eSkeySig0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(eSkeySig);
            if (eSkeySig0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(eSkeySig0);
            }
        }
        var buildHash = protoInputObject.buildHash();
        if (buildHash != null) {
            var buildHash0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(buildHash);
            if (buildHash0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(buildHash0);
            }
        }
        var companionProps = protoInputObject.companionProps();
        if (companionProps != null) {
            var companionProps0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(companionProps);
            if (companionProps0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                protoOutputSize += ProtobufOutputStream.getBytesSize(companionProps0);
            }
        }
        return protoOutputSize;
    }

}
