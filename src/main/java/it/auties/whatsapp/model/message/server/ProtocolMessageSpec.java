package it.auties.whatsapp.model.message.server;

import it.auties.whatsapp.model.message.server.ProtocolMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ProtocolMessageSpec {
    public static byte[] encode(ProtocolMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ProtocolMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var key = protoInputObject.key();
        if (key != null) {
            var key0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(key);
            if (key0 != null) {
                protoOutputStream.writeMessage(1, it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key0));
                it.auties.whatsapp.model.message.model.ChatMessageKeySpec.encode(key0, protoOutputStream);
            }
        }
        var protocolType = protoInputObject.protocolType();
        if (protocolType != null) {
            var protocolType0 = it.auties.whatsapp.model.message.server.ProtocolMessageTypeSpec.encode(protocolType);
            protoOutputStream.writeInt32(2, protocolType0);
        }
        var ephemeralExpiration = protoInputObject.ephemeralExpiration();
        protoOutputStream.writeUInt64(4, ephemeralExpiration);
        var ephemeralSettingTimestampSeconds = protoInputObject.ephemeralSettingTimestampSeconds();
        protoOutputStream.writeUInt64(5, ephemeralSettingTimestampSeconds);
        var historySyncNotification = protoInputObject.historySyncNotification();
        if (historySyncNotification != null) {
            var historySyncNotification0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(historySyncNotification);
            if (historySyncNotification0 != null) {
                protoOutputStream.writeMessage(6, it.auties.whatsapp.model.sync.HistorySyncNotificationSpec.sizeOf(historySyncNotification0));
                it.auties.whatsapp.model.sync.HistorySyncNotificationSpec.encode(historySyncNotification0, protoOutputStream);
            }
        }
        var appStateSyncKeyShare = protoInputObject.appStateSyncKeyShare();
        if (appStateSyncKeyShare != null) {
            var appStateSyncKeyShare0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appStateSyncKeyShare);
            if (appStateSyncKeyShare0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.sync.AppStateSyncKeyShareSpec.sizeOf(appStateSyncKeyShare0));
                it.auties.whatsapp.model.sync.AppStateSyncKeyShareSpec.encode(appStateSyncKeyShare0, protoOutputStream);
            }
        }
        var appStateSyncKeyRequest = protoInputObject.appStateSyncKeyRequest();
        if (appStateSyncKeyRequest != null) {
            var appStateSyncKeyRequest0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appStateSyncKeyRequest);
            if (appStateSyncKeyRequest0 != null) {
                protoOutputStream.writeMessage(8, it.auties.whatsapp.model.sync.AppStateSyncKeyRequestSpec.sizeOf(appStateSyncKeyRequest0));
                it.auties.whatsapp.model.sync.AppStateSyncKeyRequestSpec.encode(appStateSyncKeyRequest0, protoOutputStream);
            }
        }
        var initialSecurityNotificationSettingSync = protoInputObject.initialSecurityNotificationSettingSync();
        if (initialSecurityNotificationSettingSync != null) {
            var initialSecurityNotificationSettingSync0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(initialSecurityNotificationSettingSync);
            if (initialSecurityNotificationSettingSync0 != null) {
                protoOutputStream.writeMessage(9, it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSyncSpec.sizeOf(initialSecurityNotificationSettingSync0));
                it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSyncSpec.encode(initialSecurityNotificationSettingSync0, protoOutputStream);
            }
        }
        var appStateFatalExceptionNotification = protoInputObject.appStateFatalExceptionNotification();
        if (appStateFatalExceptionNotification != null) {
            var appStateFatalExceptionNotification0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appStateFatalExceptionNotification);
            if (appStateFatalExceptionNotification0 != null) {
                protoOutputStream.writeMessage(10, it.auties.whatsapp.model.sync.AppStateFatalExceptionNotificationSpec.sizeOf(appStateFatalExceptionNotification0));
                it.auties.whatsapp.model.sync.AppStateFatalExceptionNotificationSpec.encode(appStateFatalExceptionNotification0, protoOutputStream);
            }
        }
        var disappearingMode = protoInputObject.disappearingMode();
        if (disappearingMode != null) {
            var disappearingMode0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(disappearingMode);
            if (disappearingMode0 != null) {
                protoOutputStream.writeMessage(11, it.auties.whatsapp.model.chat.ChatDisappearSpec.sizeOf(disappearingMode0));
                it.auties.whatsapp.model.chat.ChatDisappearSpec.encode(disappearingMode0, protoOutputStream);
            }
        }
        var editedMessage = protoInputObject.editedMessage();
        if (editedMessage != null) {
            var editedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(editedMessage);
            if (editedMessage0 != null) {
                protoOutputStream.writeMessage(14, it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(editedMessage0));
                it.auties.whatsapp.model.message.model.MessageContainerSpec.encode(editedMessage0, protoOutputStream);
            }
        }
        var timestampMilliseconds = protoInputObject.timestampMilliseconds();
        protoOutputStream.writeInt64(15, timestampMilliseconds);
    }

    public static ProtocolMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ProtocolMessage decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<it.auties.whatsapp.model.message.model.ChatMessageKey> key = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        it.auties.whatsapp.model.message.server.ProtocolMessage.Type protocolType = null;
        long ephemeralExpiration = 0l;
        long ephemeralSettingTimestampSeconds = 0l;
        java.util.Optional<it.auties.whatsapp.model.sync.HistorySyncNotification> historySyncNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.AppStateSyncKeyShare> appStateSyncKeyShare = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.AppStateSyncKeyRequest> appStateSyncKeyRequest = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync> initialSecurityNotificationSettingSync = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification> appStateFatalExceptionNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.chat.ChatDisappear> disappearingMode = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.MessageContainer> editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        long timestampMilliseconds = 0l;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> key = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.ChatMessageKeySpec.decode(protoInputStream.readLengthDelimited()));
                case 2 -> protocolType = it.auties.whatsapp.model.message.server.ProtocolMessageTypeSpec.decode(protoInputStream.readInt32());
                case 4 -> ephemeralExpiration = protoInputStream.readInt64();
                case 5 -> ephemeralSettingTimestampSeconds = protoInputStream.readInt64();
                case 6 -> historySyncNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.HistorySyncNotificationSpec.decode(protoInputStream.readLengthDelimited()));
                case 7 -> appStateSyncKeyShare = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.AppStateSyncKeyShareSpec.decode(protoInputStream.readLengthDelimited()));
                case 8 -> appStateSyncKeyRequest = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.AppStateSyncKeyRequestSpec.decode(protoInputStream.readLengthDelimited()));
                case 9 -> initialSecurityNotificationSettingSync = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSyncSpec.decode(protoInputStream.readLengthDelimited()));
                case 10 -> appStateFatalExceptionNotification = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.AppStateFatalExceptionNotificationSpec.decode(protoInputStream.readLengthDelimited()));
                case 11 -> disappearingMode = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.chat.ChatDisappearSpec.decode(protoInputStream.readLengthDelimited()));
                case 14 -> editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.MessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 15 -> timestampMilliseconds = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.server.ProtocolMessage(key, protocolType, ephemeralExpiration, ephemeralSettingTimestampSeconds, historySyncNotification, appStateSyncKeyShare, appStateSyncKeyRequest, initialSecurityNotificationSettingSync, appStateFatalExceptionNotification, disappearingMode, editedMessage, timestampMilliseconds);
    }

    public static int sizeOf(ProtocolMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var key = protoInputObject.key();
        if (key != null) {
            var key0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(key);
            if (key0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                var keySerializedSize = it.auties.whatsapp.model.message.model.ChatMessageKeySpec.sizeOf(key0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(keySerializedSize);
                protoOutputSize += keySerializedSize;
            }
        }
        var protocolType = protoInputObject.protocolType();
        if (protocolType != null) {
            var protocolType0 = it.auties.whatsapp.model.message.server.ProtocolMessageTypeSpec.encode(protocolType);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(protocolType0);
        }
        var ephemeralExpiration = protoInputObject.ephemeralExpiration();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralExpiration);
        var ephemeralSettingTimestampSeconds = protoInputObject.ephemeralSettingTimestampSeconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralSettingTimestampSeconds);
        var historySyncNotification = protoInputObject.historySyncNotification();
        if (historySyncNotification != null) {
            var historySyncNotification0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(historySyncNotification);
            if (historySyncNotification0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                var historySyncNotificationSerializedSize = it.auties.whatsapp.model.sync.HistorySyncNotificationSpec.sizeOf(historySyncNotification0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(historySyncNotificationSerializedSize);
                protoOutputSize += historySyncNotificationSerializedSize;
            }
        }
        var appStateSyncKeyShare = protoInputObject.appStateSyncKeyShare();
        if (appStateSyncKeyShare != null) {
            var appStateSyncKeyShare0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appStateSyncKeyShare);
            if (appStateSyncKeyShare0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var appStateSyncKeyShareSerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeyShareSpec.sizeOf(appStateSyncKeyShare0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(appStateSyncKeyShareSerializedSize);
                protoOutputSize += appStateSyncKeyShareSerializedSize;
            }
        }
        var appStateSyncKeyRequest = protoInputObject.appStateSyncKeyRequest();
        if (appStateSyncKeyRequest != null) {
            var appStateSyncKeyRequest0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appStateSyncKeyRequest);
            if (appStateSyncKeyRequest0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                var appStateSyncKeyRequestSerializedSize = it.auties.whatsapp.model.sync.AppStateSyncKeyRequestSpec.sizeOf(appStateSyncKeyRequest0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(appStateSyncKeyRequestSerializedSize);
                protoOutputSize += appStateSyncKeyRequestSerializedSize;
            }
        }
        var initialSecurityNotificationSettingSync = protoInputObject.initialSecurityNotificationSettingSync();
        if (initialSecurityNotificationSettingSync != null) {
            var initialSecurityNotificationSettingSync0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(initialSecurityNotificationSettingSync);
            if (initialSecurityNotificationSettingSync0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                var initialSecurityNotificationSettingSyncSerializedSize = it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSyncSpec.sizeOf(initialSecurityNotificationSettingSync0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(initialSecurityNotificationSettingSyncSerializedSize);
                protoOutputSize += initialSecurityNotificationSettingSyncSerializedSize;
            }
        }
        var appStateFatalExceptionNotification = protoInputObject.appStateFatalExceptionNotification();
        if (appStateFatalExceptionNotification != null) {
            var appStateFatalExceptionNotification0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(appStateFatalExceptionNotification);
            if (appStateFatalExceptionNotification0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                var appStateFatalExceptionNotificationSerializedSize = it.auties.whatsapp.model.sync.AppStateFatalExceptionNotificationSpec.sizeOf(appStateFatalExceptionNotification0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(appStateFatalExceptionNotificationSerializedSize);
                protoOutputSize += appStateFatalExceptionNotificationSerializedSize;
            }
        }
        var disappearingMode = protoInputObject.disappearingMode();
        if (disappearingMode != null) {
            var disappearingMode0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(disappearingMode);
            if (disappearingMode0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                var disappearingModeSerializedSize = it.auties.whatsapp.model.chat.ChatDisappearSpec.sizeOf(disappearingMode0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(disappearingModeSerializedSize);
                protoOutputSize += disappearingModeSerializedSize;
            }
        }
        var editedMessage = protoInputObject.editedMessage();
        if (editedMessage != null) {
            var editedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(editedMessage);
            if (editedMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                var editedMessageSerializedSize = it.auties.whatsapp.model.message.model.MessageContainerSpec.sizeOf(editedMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(editedMessageSerializedSize);
                protoOutputSize += editedMessageSerializedSize;
            }
        }
        var timestampMilliseconds = protoInputObject.timestampMilliseconds();
        protoOutputSize += ProtobufOutputStream.getFieldSize(15, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestampMilliseconds);
        return protoOutputSize;
    }

}
