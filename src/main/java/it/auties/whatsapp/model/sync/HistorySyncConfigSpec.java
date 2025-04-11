package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.HistorySyncConfig;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HistorySyncConfigSpec {
    public static byte[] encode(HistorySyncConfig protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HistorySyncConfig protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var fullSyncDaysLimit = protoInputObject.fullSyncDaysLimit();
        if (fullSyncDaysLimit != null) {
            protoOutputStream.writeUInt32(1, fullSyncDaysLimit);
        }
        var fullSyncSizeMbLimit = protoInputObject.fullSyncSizeMbLimit();
        if (fullSyncSizeMbLimit != null) {
            protoOutputStream.writeUInt32(2, fullSyncSizeMbLimit);
        }
        var storageQuotaMb = protoInputObject.storageQuotaMb();
        if (storageQuotaMb != null) {
            protoOutputStream.writeUInt32(3, storageQuotaMb);
        }
        var inlineInitialPayloadInE2EeMsg = protoInputObject.inlineInitialPayloadInE2EeMsg();
        if (inlineInitialPayloadInE2EeMsg != null) {
            protoOutputStream.writeBool(4, inlineInitialPayloadInE2EeMsg);
        }
        var recentSyncDaysLimit = protoInputObject.recentSyncDaysLimit();
        if (recentSyncDaysLimit != null) {
            protoOutputStream.writeUInt32(5, recentSyncDaysLimit);
        }
        var supportCallLogHistory = protoInputObject.supportCallLogHistory();
        if (supportCallLogHistory != null) {
            protoOutputStream.writeBool(6, supportCallLogHistory);
        }
        var supportBotUserAgentChatHistory = protoInputObject.supportBotUserAgentChatHistory();
        if (supportBotUserAgentChatHistory != null) {
            protoOutputStream.writeBool(7, supportBotUserAgentChatHistory);
        }
    }

    public static HistorySyncConfig decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HistorySyncConfig decode(ProtobufInputStream protoInputStream) {
        java.lang.Integer fullSyncDaysLimit = null;
        java.lang.Integer fullSyncSizeMbLimit = null;
        java.lang.Integer storageQuotaMb = null;
        java.lang.Boolean inlineInitialPayloadInE2EeMsg = null;
        java.lang.Integer recentSyncDaysLimit = null;
        java.lang.Boolean supportCallLogHistory = null;
        java.lang.Boolean supportBotUserAgentChatHistory = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> fullSyncDaysLimit = protoInputStream.readInt32();
                case 2 -> fullSyncSizeMbLimit = protoInputStream.readInt32();
                case 3 -> storageQuotaMb = protoInputStream.readInt32();
                case 4 -> inlineInitialPayloadInE2EeMsg = protoInputStream.readBool();
                case 5 -> recentSyncDaysLimit = protoInputStream.readInt32();
                case 6 -> supportCallLogHistory = protoInputStream.readBool();
                case 7 -> supportBotUserAgentChatHistory = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.HistorySyncConfig(fullSyncDaysLimit, fullSyncSizeMbLimit, storageQuotaMb, inlineInitialPayloadInE2EeMsg, recentSyncDaysLimit, supportCallLogHistory, supportBotUserAgentChatHistory);
    }

    public static int sizeOf(HistorySyncConfig protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var fullSyncDaysLimit = protoInputObject.fullSyncDaysLimit();
        if (fullSyncDaysLimit != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(fullSyncDaysLimit);
        }
        var fullSyncSizeMbLimit = protoInputObject.fullSyncSizeMbLimit();
        if (fullSyncSizeMbLimit != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(fullSyncSizeMbLimit);
        }
        var storageQuotaMb = protoInputObject.storageQuotaMb();
        if (storageQuotaMb != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(storageQuotaMb);
        }
        var inlineInitialPayloadInE2EeMsg = protoInputObject.inlineInitialPayloadInE2EeMsg();
        if (inlineInitialPayloadInE2EeMsg != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
            protoOutputSize += 1;
        }
        var recentSyncDaysLimit = protoInputObject.recentSyncDaysLimit();
        if (recentSyncDaysLimit != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(recentSyncDaysLimit);
        }
        var supportCallLogHistory = protoInputObject.supportCallLogHistory();
        if (supportCallLogHistory != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
            protoOutputSize += 1;
        }
        var supportBotUserAgentChatHistory = protoInputObject.supportBotUserAgentChatHistory();
        if (supportBotUserAgentChatHistory != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
            protoOutputSize += 1;
        }
        return protoOutputSize;
    }

}
