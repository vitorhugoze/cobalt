package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.PaymentInfo.TransactionStatus;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class PaymentInfoTransactionStatusSpec {
    private static final Map<Integer, TransactionStatus> VALUES = new HashMap<>();
    static {
        VALUES.put(0, TransactionStatus.UNKNOWN);
        VALUES.put(1, TransactionStatus.PENDING_SETUP);
        VALUES.put(2, TransactionStatus.PENDING_RECEIVER_SETUP);
        VALUES.put(3, TransactionStatus.INIT);
        VALUES.put(4, TransactionStatus.SUCCESS);
        VALUES.put(5, TransactionStatus.COMPLETED);
        VALUES.put(6, TransactionStatus.FAILED);
        VALUES.put(7, TransactionStatus.FAILED_RISK);
        VALUES.put(8, TransactionStatus.FAILED_PROCESSING);
        VALUES.put(9, TransactionStatus.FAILED_RECEIVER_PROCESSING);
        VALUES.put(10, TransactionStatus.FAILED_DA);
        VALUES.put(11, TransactionStatus.FAILED_DA_FINAL);
        VALUES.put(12, TransactionStatus.REFUNDED_TXN);
        VALUES.put(13, TransactionStatus.REFUND_FAILED);
        VALUES.put(14, TransactionStatus.REFUND_FAILED_PROCESSING);
        VALUES.put(15, TransactionStatus.REFUND_FAILED_DA);
        VALUES.put(16, TransactionStatus.EXPIRED_TXN);
        VALUES.put(17, TransactionStatus.AUTH_CANCELED);
        VALUES.put(18, TransactionStatus.AUTH_CANCEL_FAILED_PROCESSING);
        VALUES.put(19, TransactionStatus.AUTH_CANCEL_FAILED);
        VALUES.put(20, TransactionStatus.COLLECT_INIT);
        VALUES.put(21, TransactionStatus.COLLECT_SUCCESS);
        VALUES.put(22, TransactionStatus.COLLECT_FAILED);
        VALUES.put(23, TransactionStatus.COLLECT_FAILED_RISK);
        VALUES.put(24, TransactionStatus.COLLECT_REJECTED);
        VALUES.put(25, TransactionStatus.COLLECT_EXPIRED);
        VALUES.put(26, TransactionStatus.COLLECT_CANCELED);
        VALUES.put(27, TransactionStatus.COLLECT_CANCELLING);
        VALUES.put(28, TransactionStatus.IN_REVIEW);
        VALUES.put(29, TransactionStatus.REVERSAL_SUCCESS);
        VALUES.put(30, TransactionStatus.REVERSAL_PENDING);
        VALUES.put(31, TransactionStatus.REFUND_PENDING);
    }

    public static Integer encode(TransactionStatus protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static TransactionStatus decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static TransactionStatus decode(int protoEnumIndex, TransactionStatus defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(TransactionStatus protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
