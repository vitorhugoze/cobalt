package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.PaymentInviteMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PaymentInviteMessageSpec {
    public static byte[] encode(PaymentInviteMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PaymentInviteMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var serviceType = protoInputObject.serviceType();
        if (serviceType != null) {
            var serviceType0 = it.auties.whatsapp.model.message.payment.PaymentInviteMessageServiceTypeSpec.encode(serviceType);
            protoOutputStream.writeInt32(1, serviceType0);
        }
        var expiryTimestamp = protoInputObject.expiryTimestamp();
        if (expiryTimestamp != null) {
            var expiryTimestamp0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(expiryTimestamp);
            if (expiryTimestamp0 != null) {
                protoOutputStream.writeUInt64(2, expiryTimestamp0);
            }
        }
    }

    public static PaymentInviteMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PaymentInviteMessage decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.message.payment.PaymentInviteMessage.ServiceType serviceType = null;
        java.util.OptionalLong expiryTimestamp = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> serviceType = it.auties.whatsapp.model.message.payment.PaymentInviteMessageServiceTypeSpec.decode(protoInputStream.readInt32());
                case 2 -> expiryTimestamp = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(protoInputStream.readInt64());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.payment.PaymentInviteMessage(serviceType, expiryTimestamp);
    }

    public static int sizeOf(PaymentInviteMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var serviceType = protoInputObject.serviceType();
        if (serviceType != null) {
            var serviceType0 = it.auties.whatsapp.model.message.payment.PaymentInviteMessageServiceTypeSpec.encode(serviceType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(serviceType0);
        }
        var expiryTimestamp = protoInputObject.expiryTimestamp();
        if (expiryTimestamp != null) {
            var expiryTimestamp0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableLong(expiryTimestamp);
            if (expiryTimestamp0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(expiryTimestamp0);
            }
        }
        return protoOutputSize;
    }

}
