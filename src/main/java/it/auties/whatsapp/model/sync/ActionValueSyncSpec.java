package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.ActionValueSync;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class ActionValueSyncSpec {
    public static byte[] encode(ActionValueSync protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(ActionValueSync protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var timestamp = protoInputObject.timestamp();
        protoOutputStream.writeInt64(1, timestamp);
        var starAction = protoInputObject.starAction();
        if (starAction != null) {
            var starAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(starAction);
            if (starAction0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.action.StarActionSpec.sizeOf(starAction0));
                it.auties.whatsapp.model.action.StarActionSpec.encode(starAction0, protoOutputStream);
            }
        }
        var contactAction = protoInputObject.contactAction();
        if (contactAction != null) {
            var contactAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contactAction);
            if (contactAction0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.action.ContactActionSpec.sizeOf(contactAction0));
                it.auties.whatsapp.model.action.ContactActionSpec.encode(contactAction0, protoOutputStream);
            }
        }
        var muteAction = protoInputObject.muteAction();
        if (muteAction != null) {
            var muteAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(muteAction);
            if (muteAction0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.action.MuteActionSpec.sizeOf(muteAction0));
                it.auties.whatsapp.model.action.MuteActionSpec.encode(muteAction0, protoOutputStream);
            }
        }
        var pinAction = protoInputObject.pinAction();
        if (pinAction != null) {
            var pinAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pinAction);
            if (pinAction0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.action.PinActionSpec.sizeOf(pinAction0));
                it.auties.whatsapp.model.action.PinActionSpec.encode(pinAction0, protoOutputStream);
            }
        }
        var quickReplyAction = protoInputObject.quickReplyAction();
        if (quickReplyAction != null) {
            var quickReplyAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quickReplyAction);
            if (quickReplyAction0 != null) {
                protoOutputStream.writeMessage(8, it.auties.whatsapp.model.action.QuickReplyActionSpec.sizeOf(quickReplyAction0));
                it.auties.whatsapp.model.action.QuickReplyActionSpec.encode(quickReplyAction0, protoOutputStream);
            }
        }
        var recentEmojiWeightsAction = protoInputObject.recentEmojiWeightsAction();
        if (recentEmojiWeightsAction != null) {
            var recentEmojiWeightsAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(recentEmojiWeightsAction);
            if (recentEmojiWeightsAction0 != null) {
                protoOutputStream.writeMessage(11, it.auties.whatsapp.model.action.RecentEmojiWeightsActionSpec.sizeOf(recentEmojiWeightsAction0));
                it.auties.whatsapp.model.action.RecentEmojiWeightsActionSpec.encode(recentEmojiWeightsAction0, protoOutputStream);
            }
        }
        var labelEditAction = protoInputObject.labelEditAction();
        if (labelEditAction != null) {
            var labelEditAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(labelEditAction);
            if (labelEditAction0 != null) {
                protoOutputStream.writeMessage(14, it.auties.whatsapp.model.action.LabelEditActionSpec.sizeOf(labelEditAction0));
                it.auties.whatsapp.model.action.LabelEditActionSpec.encode(labelEditAction0, protoOutputStream);
            }
        }
        var labelAssociationAction = protoInputObject.labelAssociationAction();
        if (labelAssociationAction != null) {
            var labelAssociationAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(labelAssociationAction);
            if (labelAssociationAction0 != null) {
                protoOutputStream.writeMessage(15, it.auties.whatsapp.model.action.LabelAssociationActionSpec.sizeOf(labelAssociationAction0));
                it.auties.whatsapp.model.action.LabelAssociationActionSpec.encode(labelAssociationAction0, protoOutputStream);
            }
        }
        var archiveChatAction = protoInputObject.archiveChatAction();
        if (archiveChatAction != null) {
            var archiveChatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(archiveChatAction);
            if (archiveChatAction0 != null) {
                protoOutputStream.writeMessage(17, it.auties.whatsapp.model.action.ArchiveChatActionSpec.sizeOf(archiveChatAction0));
                it.auties.whatsapp.model.action.ArchiveChatActionSpec.encode(archiveChatAction0, protoOutputStream);
            }
        }
        var deleteMessageForMeAction = protoInputObject.deleteMessageForMeAction();
        if (deleteMessageForMeAction != null) {
            var deleteMessageForMeAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deleteMessageForMeAction);
            if (deleteMessageForMeAction0 != null) {
                protoOutputStream.writeMessage(18, it.auties.whatsapp.model.action.DeleteMessageForMeActionSpec.sizeOf(deleteMessageForMeAction0));
                it.auties.whatsapp.model.action.DeleteMessageForMeActionSpec.encode(deleteMessageForMeAction0, protoOutputStream);
            }
        }
        var markChatAsReadAction = protoInputObject.markChatAsReadAction();
        if (markChatAsReadAction != null) {
            var markChatAsReadAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(markChatAsReadAction);
            if (markChatAsReadAction0 != null) {
                protoOutputStream.writeMessage(20, it.auties.whatsapp.model.action.MarkChatAsReadActionSpec.sizeOf(markChatAsReadAction0));
                it.auties.whatsapp.model.action.MarkChatAsReadActionSpec.encode(markChatAsReadAction0, protoOutputStream);
            }
        }
        var clearChatAction = protoInputObject.clearChatAction();
        if (clearChatAction != null) {
            var clearChatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(clearChatAction);
            if (clearChatAction0 != null) {
                protoOutputStream.writeMessage(21, it.auties.whatsapp.model.action.ClearChatActionSpec.sizeOf(clearChatAction0));
                it.auties.whatsapp.model.action.ClearChatActionSpec.encode(clearChatAction0, protoOutputStream);
            }
        }
        var deleteChatAction = protoInputObject.deleteChatAction();
        if (deleteChatAction != null) {
            var deleteChatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deleteChatAction);
            if (deleteChatAction0 != null) {
                protoOutputStream.writeMessage(22, it.auties.whatsapp.model.action.DeleteChatActionSpec.sizeOf(deleteChatAction0));
                it.auties.whatsapp.model.action.DeleteChatActionSpec.encode(deleteChatAction0, protoOutputStream);
            }
        }
        var favoriteStickerAction = protoInputObject.favoriteStickerAction();
        if (favoriteStickerAction != null) {
            var favoriteStickerAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(favoriteStickerAction);
            if (favoriteStickerAction0 != null) {
                protoOutputStream.writeMessage(25, it.auties.whatsapp.model.action.StickerActionSpec.sizeOf(favoriteStickerAction0));
                it.auties.whatsapp.model.action.StickerActionSpec.encode(favoriteStickerAction0, protoOutputStream);
            }
        }
        var androidUnsupportedActions = protoInputObject.androidUnsupportedActions();
        if (androidUnsupportedActions != null) {
            var androidUnsupportedActions0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(androidUnsupportedActions);
            if (androidUnsupportedActions0 != null) {
                protoOutputStream.writeMessage(26, it.auties.whatsapp.model.action.AndroidUnsupportedActionsSpec.sizeOf(androidUnsupportedActions0));
                it.auties.whatsapp.model.action.AndroidUnsupportedActionsSpec.encode(androidUnsupportedActions0, protoOutputStream);
            }
        }
        var agentAction = protoInputObject.agentAction();
        if (agentAction != null) {
            var agentAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(agentAction);
            if (agentAction0 != null) {
                protoOutputStream.writeMessage(27, it.auties.whatsapp.model.action.AgentActionSpec.sizeOf(agentAction0));
                it.auties.whatsapp.model.action.AgentActionSpec.encode(agentAction0, protoOutputStream);
            }
        }
        var subscriptionAction = protoInputObject.subscriptionAction();
        if (subscriptionAction != null) {
            var subscriptionAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(subscriptionAction);
            if (subscriptionAction0 != null) {
                protoOutputStream.writeMessage(28, it.auties.whatsapp.model.action.SubscriptionActionSpec.sizeOf(subscriptionAction0));
                it.auties.whatsapp.model.action.SubscriptionActionSpec.encode(subscriptionAction0, protoOutputStream);
            }
        }
        var userStatusMuteAction = protoInputObject.userStatusMuteAction();
        if (userStatusMuteAction != null) {
            var userStatusMuteAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(userStatusMuteAction);
            if (userStatusMuteAction0 != null) {
                protoOutputStream.writeMessage(29, it.auties.whatsapp.model.action.UserStatusMuteActionSpec.sizeOf(userStatusMuteAction0));
                it.auties.whatsapp.model.action.UserStatusMuteActionSpec.encode(userStatusMuteAction0, protoOutputStream);
            }
        }
        var timeFormatAction = protoInputObject.timeFormatAction();
        if (timeFormatAction != null) {
            var timeFormatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(timeFormatAction);
            if (timeFormatAction0 != null) {
                protoOutputStream.writeMessage(30, it.auties.whatsapp.model.action.TimeFormatActionSpec.sizeOf(timeFormatAction0));
                it.auties.whatsapp.model.action.TimeFormatActionSpec.encode(timeFormatAction0, protoOutputStream);
            }
        }
        var nuxAction = protoInputObject.nuxAction();
        if (nuxAction != null) {
            var nuxAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(nuxAction);
            if (nuxAction0 != null) {
                protoOutputStream.writeMessage(31, it.auties.whatsapp.model.action.NuxActionSpec.sizeOf(nuxAction0));
                it.auties.whatsapp.model.action.NuxActionSpec.encode(nuxAction0, protoOutputStream);
            }
        }
        var primaryVersionAction = protoInputObject.primaryVersionAction();
        if (primaryVersionAction != null) {
            var primaryVersionAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(primaryVersionAction);
            if (primaryVersionAction0 != null) {
                protoOutputStream.writeMessage(32, it.auties.whatsapp.model.action.PrimaryVersionActionSpec.sizeOf(primaryVersionAction0));
                it.auties.whatsapp.model.action.PrimaryVersionActionSpec.encode(primaryVersionAction0, protoOutputStream);
            }
        }
        var stickerAction = protoInputObject.stickerAction();
        if (stickerAction != null) {
            var stickerAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerAction);
            if (stickerAction0 != null) {
                protoOutputStream.writeMessage(33, it.auties.whatsapp.model.action.StickerActionSpec.sizeOf(stickerAction0));
                it.auties.whatsapp.model.action.StickerActionSpec.encode(stickerAction0, protoOutputStream);
            }
        }
        var removeRecentStickerAction = protoInputObject.removeRecentStickerAction();
        if (removeRecentStickerAction != null) {
            var removeRecentStickerAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(removeRecentStickerAction);
            if (removeRecentStickerAction0 != null) {
                protoOutputStream.writeMessage(34, it.auties.whatsapp.model.action.RemoveRecentStickerActionSpec.sizeOf(removeRecentStickerAction0));
                it.auties.whatsapp.model.action.RemoveRecentStickerActionSpec.encode(removeRecentStickerAction0, protoOutputStream);
            }
        }
        var chatAssignmentAction = protoInputObject.chatAssignmentAction();
        if (chatAssignmentAction != null) {
            var chatAssignmentAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(chatAssignmentAction);
            if (chatAssignmentAction0 != null) {
                protoOutputStream.writeMessage(35, it.auties.whatsapp.model.action.ChatAssignmentActionSpec.sizeOf(chatAssignmentAction0));
                it.auties.whatsapp.model.action.ChatAssignmentActionSpec.encode(chatAssignmentAction0, protoOutputStream);
            }
        }
        var chatAssignmentOpenedStatusAction = protoInputObject.chatAssignmentOpenedStatusAction();
        if (chatAssignmentOpenedStatusAction != null) {
            var chatAssignmentOpenedStatusAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(chatAssignmentOpenedStatusAction);
            if (chatAssignmentOpenedStatusAction0 != null) {
                protoOutputStream.writeMessage(36, it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusActionSpec.sizeOf(chatAssignmentOpenedStatusAction0));
                it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusActionSpec.encode(chatAssignmentOpenedStatusAction0, protoOutputStream);
            }
        }
        var securityNotificationSetting = protoInputObject.securityNotificationSetting();
        if (securityNotificationSetting != null) {
            var securityNotificationSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(securityNotificationSetting);
            if (securityNotificationSetting0 != null) {
                protoOutputStream.writeMessage(6, it.auties.whatsapp.model.setting.SecurityNotificationSettingsSpec.sizeOf(securityNotificationSetting0));
                it.auties.whatsapp.model.setting.SecurityNotificationSettingsSpec.encode(securityNotificationSetting0, protoOutputStream);
            }
        }
        var pushNameSetting = protoInputObject.pushNameSetting();
        if (pushNameSetting != null) {
            var pushNameSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pushNameSetting);
            if (pushNameSetting0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.setting.PushNameSettingsSpec.sizeOf(pushNameSetting0));
                it.auties.whatsapp.model.setting.PushNameSettingsSpec.encode(pushNameSetting0, protoOutputStream);
            }
        }
        var localeSetting = protoInputObject.localeSetting();
        if (localeSetting != null) {
            var localeSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(localeSetting);
            if (localeSetting0 != null) {
                protoOutputStream.writeMessage(16, it.auties.whatsapp.model.setting.LocaleSettingsSpec.sizeOf(localeSetting0));
                it.auties.whatsapp.model.setting.LocaleSettingsSpec.encode(localeSetting0, protoOutputStream);
            }
        }
        var unarchiveChatsSetting = protoInputObject.unarchiveChatsSetting();
        if (unarchiveChatsSetting != null) {
            var unarchiveChatsSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(unarchiveChatsSetting);
            if (unarchiveChatsSetting0 != null) {
                protoOutputStream.writeMessage(23, it.auties.whatsapp.model.setting.UnarchiveChatsSettingsSpec.sizeOf(unarchiveChatsSetting0));
                it.auties.whatsapp.model.setting.UnarchiveChatsSettingsSpec.encode(unarchiveChatsSetting0, protoOutputStream);
            }
        }
        var stickerMetadata = protoInputObject.stickerMetadata();
        if (stickerMetadata != null) {
            var stickerMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerMetadata);
            if (stickerMetadata0 != null) {
                protoOutputStream.writeMessage(10, it.auties.whatsapp.model.sync.StickerMetadataSpec.sizeOf(stickerMetadata0));
                it.auties.whatsapp.model.sync.StickerMetadataSpec.encode(stickerMetadata0, protoOutputStream);
            }
        }
        var keyExpiration = protoInputObject.keyExpiration();
        if (keyExpiration != null) {
            var keyExpiration0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(keyExpiration);
            if (keyExpiration0 != null) {
                protoOutputStream.writeMessage(19, it.auties.whatsapp.model.sync.KeyExpirationSpec.sizeOf(keyExpiration0));
                it.auties.whatsapp.model.sync.KeyExpirationSpec.encode(keyExpiration0, protoOutputStream);
            }
        }
        var primaryFeature = protoInputObject.primaryFeature();
        if (primaryFeature != null) {
            var primaryFeature0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(primaryFeature);
            if (primaryFeature0 != null) {
                protoOutputStream.writeMessage(24, it.auties.whatsapp.model.sync.PrimaryFeatureSpec.sizeOf(primaryFeature0));
                it.auties.whatsapp.model.sync.PrimaryFeatureSpec.encode(primaryFeature0, protoOutputStream);
            }
        }
    }

    public static ActionValueSync decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static ActionValueSync decode(ProtobufInputStream protoInputStream) {
        long timestamp = 0l;
        java.util.Optional<it.auties.whatsapp.model.action.StarAction> starAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.ContactAction> contactAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.MuteAction> muteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.PinAction> pinAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.QuickReplyAction> quickReplyAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.RecentEmojiWeightsAction> recentEmojiWeightsAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.LabelEditAction> labelEditAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.LabelAssociationAction> labelAssociationAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.ArchiveChatAction> archiveChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.DeleteMessageForMeAction> deleteMessageForMeAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.MarkChatAsReadAction> markChatAsReadAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.ClearChatAction> clearChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.DeleteChatAction> deleteChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.StickerAction> favoriteStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.AndroidUnsupportedActions> androidUnsupportedActions = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.AgentAction> agentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.SubscriptionAction> subscriptionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.UserStatusMuteAction> userStatusMuteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.TimeFormatAction> timeFormatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.NuxAction> nuxAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.PrimaryVersionAction> primaryVersionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.StickerAction> stickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.RemoveRecentStickerAction> removeRecentStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.ChatAssignmentAction> chatAssignmentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction> chatAssignmentOpenedStatusAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.SecurityNotificationSettings> securityNotificationSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.PushNameSettings> pushNameSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.LocaleSettings> localeSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.setting.UnarchiveChatsSettings> unarchiveChatsSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.StickerMetadata> stickerMetadata = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.KeyExpiration> keyExpiration = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.sync.PrimaryFeature> primaryFeature = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> timestamp = protoInputStream.readInt64();
                case 2 -> starAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.StarActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> contactAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.ContactActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> muteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.MuteActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> pinAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.PinActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 8 -> quickReplyAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.QuickReplyActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 11 -> recentEmojiWeightsAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.RecentEmojiWeightsActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 14 -> labelEditAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.LabelEditActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 15 -> labelAssociationAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.LabelAssociationActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 17 -> archiveChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.ArchiveChatActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 18 -> deleteMessageForMeAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.DeleteMessageForMeActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 20 -> markChatAsReadAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.MarkChatAsReadActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 21 -> clearChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.ClearChatActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 22 -> deleteChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.DeleteChatActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 25 -> favoriteStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.StickerActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 26 -> androidUnsupportedActions = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.AndroidUnsupportedActionsSpec.decode(protoInputStream.readLengthDelimited()));
                case 27 -> agentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.AgentActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 28 -> subscriptionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.SubscriptionActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 29 -> userStatusMuteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.UserStatusMuteActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 30 -> timeFormatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.TimeFormatActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 31 -> nuxAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.NuxActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 32 -> primaryVersionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.PrimaryVersionActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 33 -> stickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.StickerActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 34 -> removeRecentStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.RemoveRecentStickerActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 35 -> chatAssignmentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.ChatAssignmentActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 36 -> chatAssignmentOpenedStatusAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusActionSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> securityNotificationSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.SecurityNotificationSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 7 -> pushNameSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.PushNameSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 16 -> localeSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.LocaleSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 23 -> unarchiveChatsSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.setting.UnarchiveChatsSettingsSpec.decode(protoInputStream.readLengthDelimited()));
                case 10 -> stickerMetadata = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.StickerMetadataSpec.decode(protoInputStream.readLengthDelimited()));
                case 19 -> keyExpiration = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.KeyExpirationSpec.decode(protoInputStream.readLengthDelimited()));
                case 24 -> primaryFeature = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.sync.PrimaryFeatureSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.ActionValueSync(timestamp, starAction, contactAction, muteAction, pinAction, quickReplyAction, recentEmojiWeightsAction, labelEditAction, labelAssociationAction, archiveChatAction, deleteMessageForMeAction, markChatAsReadAction, clearChatAction, deleteChatAction, favoriteStickerAction, androidUnsupportedActions, agentAction, subscriptionAction, userStatusMuteAction, timeFormatAction, nuxAction, primaryVersionAction, stickerAction, removeRecentStickerAction, chatAssignmentAction, chatAssignmentOpenedStatusAction, securityNotificationSetting, pushNameSetting, localeSetting, unarchiveChatsSetting, stickerMetadata, keyExpiration, primaryFeature);
    }

    public static int sizeOf(ActionValueSync protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var timestamp = protoInputObject.timestamp();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timestamp);
        var starAction = protoInputObject.starAction();
        if (starAction != null) {
            var starAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(starAction);
            if (starAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var starActionSerializedSize = it.auties.whatsapp.model.action.StarActionSpec.sizeOf(starAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(starActionSerializedSize);
                protoOutputSize += starActionSerializedSize;
            }
        }
        var contactAction = protoInputObject.contactAction();
        if (contactAction != null) {
            var contactAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contactAction);
            if (contactAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var contactActionSerializedSize = it.auties.whatsapp.model.action.ContactActionSpec.sizeOf(contactAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contactActionSerializedSize);
                protoOutputSize += contactActionSerializedSize;
            }
        }
        var muteAction = protoInputObject.muteAction();
        if (muteAction != null) {
            var muteAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(muteAction);
            if (muteAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var muteActionSerializedSize = it.auties.whatsapp.model.action.MuteActionSpec.sizeOf(muteAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(muteActionSerializedSize);
                protoOutputSize += muteActionSerializedSize;
            }
        }
        var pinAction = protoInputObject.pinAction();
        if (pinAction != null) {
            var pinAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pinAction);
            if (pinAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var pinActionSerializedSize = it.auties.whatsapp.model.action.PinActionSpec.sizeOf(pinAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pinActionSerializedSize);
                protoOutputSize += pinActionSerializedSize;
            }
        }
        var quickReplyAction = protoInputObject.quickReplyAction();
        if (quickReplyAction != null) {
            var quickReplyAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(quickReplyAction);
            if (quickReplyAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                var quickReplyActionSerializedSize = it.auties.whatsapp.model.action.QuickReplyActionSpec.sizeOf(quickReplyAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(quickReplyActionSerializedSize);
                protoOutputSize += quickReplyActionSerializedSize;
            }
        }
        var recentEmojiWeightsAction = protoInputObject.recentEmojiWeightsAction();
        if (recentEmojiWeightsAction != null) {
            var recentEmojiWeightsAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(recentEmojiWeightsAction);
            if (recentEmojiWeightsAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                var recentEmojiWeightsActionSerializedSize = it.auties.whatsapp.model.action.RecentEmojiWeightsActionSpec.sizeOf(recentEmojiWeightsAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(recentEmojiWeightsActionSerializedSize);
                protoOutputSize += recentEmojiWeightsActionSerializedSize;
            }
        }
        var labelEditAction = protoInputObject.labelEditAction();
        if (labelEditAction != null) {
            var labelEditAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(labelEditAction);
            if (labelEditAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                var labelEditActionSerializedSize = it.auties.whatsapp.model.action.LabelEditActionSpec.sizeOf(labelEditAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(labelEditActionSerializedSize);
                protoOutputSize += labelEditActionSerializedSize;
            }
        }
        var labelAssociationAction = protoInputObject.labelAssociationAction();
        if (labelAssociationAction != null) {
            var labelAssociationAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(labelAssociationAction);
            if (labelAssociationAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
                var labelAssociationActionSerializedSize = it.auties.whatsapp.model.action.LabelAssociationActionSpec.sizeOf(labelAssociationAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(labelAssociationActionSerializedSize);
                protoOutputSize += labelAssociationActionSerializedSize;
            }
        }
        var archiveChatAction = protoInputObject.archiveChatAction();
        if (archiveChatAction != null) {
            var archiveChatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(archiveChatAction);
            if (archiveChatAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                var archiveChatActionSerializedSize = it.auties.whatsapp.model.action.ArchiveChatActionSpec.sizeOf(archiveChatAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(archiveChatActionSerializedSize);
                protoOutputSize += archiveChatActionSerializedSize;
            }
        }
        var deleteMessageForMeAction = protoInputObject.deleteMessageForMeAction();
        if (deleteMessageForMeAction != null) {
            var deleteMessageForMeAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deleteMessageForMeAction);
            if (deleteMessageForMeAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                var deleteMessageForMeActionSerializedSize = it.auties.whatsapp.model.action.DeleteMessageForMeActionSpec.sizeOf(deleteMessageForMeAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deleteMessageForMeActionSerializedSize);
                protoOutputSize += deleteMessageForMeActionSerializedSize;
            }
        }
        var markChatAsReadAction = protoInputObject.markChatAsReadAction();
        if (markChatAsReadAction != null) {
            var markChatAsReadAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(markChatAsReadAction);
            if (markChatAsReadAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
                var markChatAsReadActionSerializedSize = it.auties.whatsapp.model.action.MarkChatAsReadActionSpec.sizeOf(markChatAsReadAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(markChatAsReadActionSerializedSize);
                protoOutputSize += markChatAsReadActionSerializedSize;
            }
        }
        var clearChatAction = protoInputObject.clearChatAction();
        if (clearChatAction != null) {
            var clearChatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(clearChatAction);
            if (clearChatAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
                var clearChatActionSerializedSize = it.auties.whatsapp.model.action.ClearChatActionSpec.sizeOf(clearChatAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(clearChatActionSerializedSize);
                protoOutputSize += clearChatActionSerializedSize;
            }
        }
        var deleteChatAction = protoInputObject.deleteChatAction();
        if (deleteChatAction != null) {
            var deleteChatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deleteChatAction);
            if (deleteChatAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                var deleteChatActionSerializedSize = it.auties.whatsapp.model.action.DeleteChatActionSpec.sizeOf(deleteChatAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deleteChatActionSerializedSize);
                protoOutputSize += deleteChatActionSerializedSize;
            }
        }
        var favoriteStickerAction = protoInputObject.favoriteStickerAction();
        if (favoriteStickerAction != null) {
            var favoriteStickerAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(favoriteStickerAction);
            if (favoriteStickerAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(25, 2);
                var favoriteStickerActionSerializedSize = it.auties.whatsapp.model.action.StickerActionSpec.sizeOf(favoriteStickerAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(favoriteStickerActionSerializedSize);
                protoOutputSize += favoriteStickerActionSerializedSize;
            }
        }
        var androidUnsupportedActions = protoInputObject.androidUnsupportedActions();
        if (androidUnsupportedActions != null) {
            var androidUnsupportedActions0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(androidUnsupportedActions);
            if (androidUnsupportedActions0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                var androidUnsupportedActionsSerializedSize = it.auties.whatsapp.model.action.AndroidUnsupportedActionsSpec.sizeOf(androidUnsupportedActions0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(androidUnsupportedActionsSerializedSize);
                protoOutputSize += androidUnsupportedActionsSerializedSize;
            }
        }
        var agentAction = protoInputObject.agentAction();
        if (agentAction != null) {
            var agentAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(agentAction);
            if (agentAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
                var agentActionSerializedSize = it.auties.whatsapp.model.action.AgentActionSpec.sizeOf(agentAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(agentActionSerializedSize);
                protoOutputSize += agentActionSerializedSize;
            }
        }
        var subscriptionAction = protoInputObject.subscriptionAction();
        if (subscriptionAction != null) {
            var subscriptionAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(subscriptionAction);
            if (subscriptionAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
                var subscriptionActionSerializedSize = it.auties.whatsapp.model.action.SubscriptionActionSpec.sizeOf(subscriptionAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(subscriptionActionSerializedSize);
                protoOutputSize += subscriptionActionSerializedSize;
            }
        }
        var userStatusMuteAction = protoInputObject.userStatusMuteAction();
        if (userStatusMuteAction != null) {
            var userStatusMuteAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(userStatusMuteAction);
            if (userStatusMuteAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
                var userStatusMuteActionSerializedSize = it.auties.whatsapp.model.action.UserStatusMuteActionSpec.sizeOf(userStatusMuteAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(userStatusMuteActionSerializedSize);
                protoOutputSize += userStatusMuteActionSerializedSize;
            }
        }
        var timeFormatAction = protoInputObject.timeFormatAction();
        if (timeFormatAction != null) {
            var timeFormatAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(timeFormatAction);
            if (timeFormatAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(30, 2);
                var timeFormatActionSerializedSize = it.auties.whatsapp.model.action.TimeFormatActionSpec.sizeOf(timeFormatAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(timeFormatActionSerializedSize);
                protoOutputSize += timeFormatActionSerializedSize;
            }
        }
        var nuxAction = protoInputObject.nuxAction();
        if (nuxAction != null) {
            var nuxAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(nuxAction);
            if (nuxAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(31, 2);
                var nuxActionSerializedSize = it.auties.whatsapp.model.action.NuxActionSpec.sizeOf(nuxAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(nuxActionSerializedSize);
                protoOutputSize += nuxActionSerializedSize;
            }
        }
        var primaryVersionAction = protoInputObject.primaryVersionAction();
        if (primaryVersionAction != null) {
            var primaryVersionAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(primaryVersionAction);
            if (primaryVersionAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(32, 2);
                var primaryVersionActionSerializedSize = it.auties.whatsapp.model.action.PrimaryVersionActionSpec.sizeOf(primaryVersionAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(primaryVersionActionSerializedSize);
                protoOutputSize += primaryVersionActionSerializedSize;
            }
        }
        var stickerAction = protoInputObject.stickerAction();
        if (stickerAction != null) {
            var stickerAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerAction);
            if (stickerAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(33, 2);
                var stickerActionSerializedSize = it.auties.whatsapp.model.action.StickerActionSpec.sizeOf(stickerAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stickerActionSerializedSize);
                protoOutputSize += stickerActionSerializedSize;
            }
        }
        var removeRecentStickerAction = protoInputObject.removeRecentStickerAction();
        if (removeRecentStickerAction != null) {
            var removeRecentStickerAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(removeRecentStickerAction);
            if (removeRecentStickerAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(34, 2);
                var removeRecentStickerActionSerializedSize = it.auties.whatsapp.model.action.RemoveRecentStickerActionSpec.sizeOf(removeRecentStickerAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(removeRecentStickerActionSerializedSize);
                protoOutputSize += removeRecentStickerActionSerializedSize;
            }
        }
        var chatAssignmentAction = protoInputObject.chatAssignmentAction();
        if (chatAssignmentAction != null) {
            var chatAssignmentAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(chatAssignmentAction);
            if (chatAssignmentAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(35, 2);
                var chatAssignmentActionSerializedSize = it.auties.whatsapp.model.action.ChatAssignmentActionSpec.sizeOf(chatAssignmentAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(chatAssignmentActionSerializedSize);
                protoOutputSize += chatAssignmentActionSerializedSize;
            }
        }
        var chatAssignmentOpenedStatusAction = protoInputObject.chatAssignmentOpenedStatusAction();
        if (chatAssignmentOpenedStatusAction != null) {
            var chatAssignmentOpenedStatusAction0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(chatAssignmentOpenedStatusAction);
            if (chatAssignmentOpenedStatusAction0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(36, 2);
                var chatAssignmentOpenedStatusActionSerializedSize = it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusActionSpec.sizeOf(chatAssignmentOpenedStatusAction0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(chatAssignmentOpenedStatusActionSerializedSize);
                protoOutputSize += chatAssignmentOpenedStatusActionSerializedSize;
            }
        }
        var securityNotificationSetting = protoInputObject.securityNotificationSetting();
        if (securityNotificationSetting != null) {
            var securityNotificationSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(securityNotificationSetting);
            if (securityNotificationSetting0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                var securityNotificationSettingSerializedSize = it.auties.whatsapp.model.setting.SecurityNotificationSettingsSpec.sizeOf(securityNotificationSetting0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(securityNotificationSettingSerializedSize);
                protoOutputSize += securityNotificationSettingSerializedSize;
            }
        }
        var pushNameSetting = protoInputObject.pushNameSetting();
        if (pushNameSetting != null) {
            var pushNameSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pushNameSetting);
            if (pushNameSetting0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var pushNameSettingSerializedSize = it.auties.whatsapp.model.setting.PushNameSettingsSpec.sizeOf(pushNameSetting0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pushNameSettingSerializedSize);
                protoOutputSize += pushNameSettingSerializedSize;
            }
        }
        var localeSetting = protoInputObject.localeSetting();
        if (localeSetting != null) {
            var localeSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(localeSetting);
            if (localeSetting0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                var localeSettingSerializedSize = it.auties.whatsapp.model.setting.LocaleSettingsSpec.sizeOf(localeSetting0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(localeSettingSerializedSize);
                protoOutputSize += localeSettingSerializedSize;
            }
        }
        var unarchiveChatsSetting = protoInputObject.unarchiveChatsSetting();
        if (unarchiveChatsSetting != null) {
            var unarchiveChatsSetting0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(unarchiveChatsSetting);
            if (unarchiveChatsSetting0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                var unarchiveChatsSettingSerializedSize = it.auties.whatsapp.model.setting.UnarchiveChatsSettingsSpec.sizeOf(unarchiveChatsSetting0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(unarchiveChatsSettingSerializedSize);
                protoOutputSize += unarchiveChatsSettingSerializedSize;
            }
        }
        var stickerMetadata = protoInputObject.stickerMetadata();
        if (stickerMetadata != null) {
            var stickerMetadata0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerMetadata);
            if (stickerMetadata0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                var stickerMetadataSerializedSize = it.auties.whatsapp.model.sync.StickerMetadataSpec.sizeOf(stickerMetadata0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stickerMetadataSerializedSize);
                protoOutputSize += stickerMetadataSerializedSize;
            }
        }
        var keyExpiration = protoInputObject.keyExpiration();
        if (keyExpiration != null) {
            var keyExpiration0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(keyExpiration);
            if (keyExpiration0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
                var keyExpirationSerializedSize = it.auties.whatsapp.model.sync.KeyExpirationSpec.sizeOf(keyExpiration0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(keyExpirationSerializedSize);
                protoOutputSize += keyExpirationSerializedSize;
            }
        }
        var primaryFeature = protoInputObject.primaryFeature();
        if (primaryFeature != null) {
            var primaryFeature0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(primaryFeature);
            if (primaryFeature0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                var primaryFeatureSerializedSize = it.auties.whatsapp.model.sync.PrimaryFeatureSpec.sizeOf(primaryFeature0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(primaryFeatureSerializedSize);
                protoOutputSize += primaryFeatureSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
