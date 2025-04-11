package it.auties.whatsapp.model.business;

import it.auties.whatsapp.model.business.BusinessLocalizedName;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class BusinessLocalizedNameSpec {
    public static byte[] encode(BusinessLocalizedName protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(BusinessLocalizedName protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var lg = protoInputObject.lg();
        if (lg != null) {
            var lg0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lg);
            if (lg0 != null) {
                protoOutputStream.writeString(1, lg0);
            }
        }
        var lc = protoInputObject.lc();
        if (lc != null) {
            var lc0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lc);
            if (lc0 != null) {
                protoOutputStream.writeString(2, lc0);
            }
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputStream.writeString(3, name0);
            }
        }
    }

    public static BusinessLocalizedName decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static BusinessLocalizedName decode(ProtobufInputStream protoInputStream) {
        java.lang.String lg = null;
        java.lang.String lc = null;
        java.lang.String name = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> lg = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 2 -> lc = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.business.BusinessLocalizedName(lg, lc, name);
    }

    public static int sizeOf(BusinessLocalizedName protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var lg = protoInputObject.lg();
        if (lg != null) {
            var lg0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lg);
            if (lg0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(lg0);
            }
        }
        var lc = protoInputObject.lc();
        if (lc != null) {
            var lc0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(lc);
            if (lc0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(lc0);
            }
        }
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name);
            if (name0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(name0);
            }
        }
        return protoOutputSize;
    }

}
