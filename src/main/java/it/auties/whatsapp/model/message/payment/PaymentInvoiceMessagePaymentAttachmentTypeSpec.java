package it.auties.whatsapp.model.message.payment;

import it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage.PaymentAttachmentType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentInvoiceMessagePaymentAttachmentTypeSpec {
    private static final Map<Integer, PaymentAttachmentType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, PaymentAttachmentType.IMAGE);
        VALUES.put(1, PaymentAttachmentType.PDF);
    }

    public static Integer encode(PaymentAttachmentType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static PaymentAttachmentType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static PaymentAttachmentType decode(int protoEnumIndex, PaymentAttachmentType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(PaymentAttachmentType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
