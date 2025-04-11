package it.auties.whatsapp.model.sync;

public class ActionValueSyncBuilder {
    private long timestamp;
    private java.util.Optional<it.auties.whatsapp.model.action.StarAction> starAction;
    private java.util.Optional<it.auties.whatsapp.model.action.ContactAction> contactAction;
    private java.util.Optional<it.auties.whatsapp.model.action.MuteAction> muteAction;
    private java.util.Optional<it.auties.whatsapp.model.action.PinAction> pinAction;
    private java.util.Optional<it.auties.whatsapp.model.action.QuickReplyAction> quickReplyAction;
    private java.util.Optional<it.auties.whatsapp.model.action.RecentEmojiWeightsAction> recentEmojiWeightsAction;
    private java.util.Optional<it.auties.whatsapp.model.action.LabelEditAction> labelEditAction;
    private java.util.Optional<it.auties.whatsapp.model.action.LabelAssociationAction> labelAssociationAction;
    private java.util.Optional<it.auties.whatsapp.model.action.ArchiveChatAction> archiveChatAction;
    private java.util.Optional<it.auties.whatsapp.model.action.DeleteMessageForMeAction> deleteMessageForMeAction;
    private java.util.Optional<it.auties.whatsapp.model.action.MarkChatAsReadAction> markChatAsReadAction;
    private java.util.Optional<it.auties.whatsapp.model.action.ClearChatAction> clearChatAction;
    private java.util.Optional<it.auties.whatsapp.model.action.DeleteChatAction> deleteChatAction;
    private java.util.Optional<it.auties.whatsapp.model.action.StickerAction> favoriteStickerAction;
    private java.util.Optional<it.auties.whatsapp.model.action.AndroidUnsupportedActions> androidUnsupportedActions;
    private java.util.Optional<it.auties.whatsapp.model.action.AgentAction> agentAction;
    private java.util.Optional<it.auties.whatsapp.model.action.SubscriptionAction> subscriptionAction;
    private java.util.Optional<it.auties.whatsapp.model.action.UserStatusMuteAction> userStatusMuteAction;
    private java.util.Optional<it.auties.whatsapp.model.action.TimeFormatAction> timeFormatAction;
    private java.util.Optional<it.auties.whatsapp.model.action.NuxAction> nuxAction;
    private java.util.Optional<it.auties.whatsapp.model.action.PrimaryVersionAction> primaryVersionAction;
    private java.util.Optional<it.auties.whatsapp.model.action.StickerAction> stickerAction;
    private java.util.Optional<it.auties.whatsapp.model.action.RemoveRecentStickerAction> removeRecentStickerAction;
    private java.util.Optional<it.auties.whatsapp.model.action.ChatAssignmentAction> chatAssignmentAction;
    private java.util.Optional<it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction> chatAssignmentOpenedStatusAction;
    private java.util.Optional<it.auties.whatsapp.model.setting.SecurityNotificationSettings> securityNotificationSetting;
    private java.util.Optional<it.auties.whatsapp.model.setting.PushNameSettings> pushNameSetting;
    private java.util.Optional<it.auties.whatsapp.model.setting.LocaleSettings> localeSetting;
    private java.util.Optional<it.auties.whatsapp.model.setting.UnarchiveChatsSettings> unarchiveChatsSetting;
    private java.util.Optional<it.auties.whatsapp.model.sync.StickerMetadata> stickerMetadata;
    private java.util.Optional<it.auties.whatsapp.model.sync.KeyExpiration> keyExpiration;
    private java.util.Optional<it.auties.whatsapp.model.sync.PrimaryFeature> primaryFeature;

    public ActionValueSyncBuilder() {
        timestamp = 0l;
        starAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        contactAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        muteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        pinAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        quickReplyAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        recentEmojiWeightsAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        labelEditAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        labelAssociationAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        archiveChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        deleteMessageForMeAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        markChatAsReadAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        clearChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        deleteChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        favoriteStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        androidUnsupportedActions = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        agentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        subscriptionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        userStatusMuteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        timeFormatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        nuxAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        primaryVersionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        stickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        removeRecentStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        chatAssignmentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        chatAssignmentOpenedStatusAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        securityNotificationSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        pushNameSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        localeSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        unarchiveChatsSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        stickerMetadata = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        keyExpiration = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        primaryFeature = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public ActionValueSyncBuilder timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ActionValueSyncBuilder starAction(it.auties.whatsapp.model.action.StarAction starAction) {
        this.starAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(starAction);
        return this;
    }

    public ActionValueSyncBuilder contactAction(it.auties.whatsapp.model.action.ContactAction contactAction) {
        this.contactAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(contactAction);
        return this;
    }

    public ActionValueSyncBuilder muteAction(it.auties.whatsapp.model.action.MuteAction muteAction) {
        this.muteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(muteAction);
        return this;
    }

    public ActionValueSyncBuilder pinAction(it.auties.whatsapp.model.action.PinAction pinAction) {
        this.pinAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(pinAction);
        return this;
    }

    public ActionValueSyncBuilder quickReplyAction(it.auties.whatsapp.model.action.QuickReplyAction quickReplyAction) {
        this.quickReplyAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(quickReplyAction);
        return this;
    }

    public ActionValueSyncBuilder recentEmojiWeightsAction(it.auties.whatsapp.model.action.RecentEmojiWeightsAction recentEmojiWeightsAction) {
        this.recentEmojiWeightsAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(recentEmojiWeightsAction);
        return this;
    }

    public ActionValueSyncBuilder labelEditAction(it.auties.whatsapp.model.action.LabelEditAction labelEditAction) {
        this.labelEditAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(labelEditAction);
        return this;
    }

    public ActionValueSyncBuilder labelAssociationAction(it.auties.whatsapp.model.action.LabelAssociationAction labelAssociationAction) {
        this.labelAssociationAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(labelAssociationAction);
        return this;
    }

    public ActionValueSyncBuilder archiveChatAction(it.auties.whatsapp.model.action.ArchiveChatAction archiveChatAction) {
        this.archiveChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(archiveChatAction);
        return this;
    }

    public ActionValueSyncBuilder deleteMessageForMeAction(it.auties.whatsapp.model.action.DeleteMessageForMeAction deleteMessageForMeAction) {
        this.deleteMessageForMeAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(deleteMessageForMeAction);
        return this;
    }

    public ActionValueSyncBuilder markChatAsReadAction(it.auties.whatsapp.model.action.MarkChatAsReadAction markChatAsReadAction) {
        this.markChatAsReadAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(markChatAsReadAction);
        return this;
    }

    public ActionValueSyncBuilder clearChatAction(it.auties.whatsapp.model.action.ClearChatAction clearChatAction) {
        this.clearChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(clearChatAction);
        return this;
    }

    public ActionValueSyncBuilder deleteChatAction(it.auties.whatsapp.model.action.DeleteChatAction deleteChatAction) {
        this.deleteChatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(deleteChatAction);
        return this;
    }

    public ActionValueSyncBuilder favoriteStickerAction(it.auties.whatsapp.model.action.StickerAction favoriteStickerAction) {
        this.favoriteStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(favoriteStickerAction);
        return this;
    }

    public ActionValueSyncBuilder androidUnsupportedActions(it.auties.whatsapp.model.action.AndroidUnsupportedActions androidUnsupportedActions) {
        this.androidUnsupportedActions = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(androidUnsupportedActions);
        return this;
    }

    public ActionValueSyncBuilder agentAction(it.auties.whatsapp.model.action.AgentAction agentAction) {
        this.agentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(agentAction);
        return this;
    }

    public ActionValueSyncBuilder subscriptionAction(it.auties.whatsapp.model.action.SubscriptionAction subscriptionAction) {
        this.subscriptionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(subscriptionAction);
        return this;
    }

    public ActionValueSyncBuilder userStatusMuteAction(it.auties.whatsapp.model.action.UserStatusMuteAction userStatusMuteAction) {
        this.userStatusMuteAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(userStatusMuteAction);
        return this;
    }

    public ActionValueSyncBuilder timeFormatAction(it.auties.whatsapp.model.action.TimeFormatAction timeFormatAction) {
        this.timeFormatAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(timeFormatAction);
        return this;
    }

    public ActionValueSyncBuilder nuxAction(it.auties.whatsapp.model.action.NuxAction nuxAction) {
        this.nuxAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(nuxAction);
        return this;
    }

    public ActionValueSyncBuilder primaryVersionAction(it.auties.whatsapp.model.action.PrimaryVersionAction primaryVersionAction) {
        this.primaryVersionAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(primaryVersionAction);
        return this;
    }

    public ActionValueSyncBuilder stickerAction(it.auties.whatsapp.model.action.StickerAction stickerAction) {
        this.stickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(stickerAction);
        return this;
    }

    public ActionValueSyncBuilder removeRecentStickerAction(it.auties.whatsapp.model.action.RemoveRecentStickerAction removeRecentStickerAction) {
        this.removeRecentStickerAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(removeRecentStickerAction);
        return this;
    }

    public ActionValueSyncBuilder chatAssignmentAction(it.auties.whatsapp.model.action.ChatAssignmentAction chatAssignmentAction) {
        this.chatAssignmentAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(chatAssignmentAction);
        return this;
    }

    public ActionValueSyncBuilder chatAssignmentOpenedStatusAction(it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction chatAssignmentOpenedStatusAction) {
        this.chatAssignmentOpenedStatusAction = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(chatAssignmentOpenedStatusAction);
        return this;
    }

    public ActionValueSyncBuilder securityNotificationSetting(it.auties.whatsapp.model.setting.SecurityNotificationSettings securityNotificationSetting) {
        this.securityNotificationSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(securityNotificationSetting);
        return this;
    }

    public ActionValueSyncBuilder pushNameSetting(it.auties.whatsapp.model.setting.PushNameSettings pushNameSetting) {
        this.pushNameSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(pushNameSetting);
        return this;
    }

    public ActionValueSyncBuilder localeSetting(it.auties.whatsapp.model.setting.LocaleSettings localeSetting) {
        this.localeSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(localeSetting);
        return this;
    }

    public ActionValueSyncBuilder unarchiveChatsSetting(it.auties.whatsapp.model.setting.UnarchiveChatsSettings unarchiveChatsSetting) {
        this.unarchiveChatsSetting = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(unarchiveChatsSetting);
        return this;
    }

    public ActionValueSyncBuilder stickerMetadata(it.auties.whatsapp.model.sync.StickerMetadata stickerMetadata) {
        this.stickerMetadata = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(stickerMetadata);
        return this;
    }

    public ActionValueSyncBuilder keyExpiration(it.auties.whatsapp.model.sync.KeyExpiration keyExpiration) {
        this.keyExpiration = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(keyExpiration);
        return this;
    }

    public ActionValueSyncBuilder primaryFeature(it.auties.whatsapp.model.sync.PrimaryFeature primaryFeature) {
        this.primaryFeature = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(primaryFeature);
        return this;
    }

    public it.auties.whatsapp.model.sync.ActionValueSync build() {
        return new it.auties.whatsapp.model.sync.ActionValueSync(timestamp, starAction, contactAction, muteAction, pinAction, quickReplyAction, recentEmojiWeightsAction, labelEditAction, labelAssociationAction, archiveChatAction, deleteMessageForMeAction, markChatAsReadAction, clearChatAction, deleteChatAction, favoriteStickerAction, androidUnsupportedActions, agentAction, subscriptionAction, userStatusMuteAction, timeFormatAction, nuxAction, primaryVersionAction, stickerAction, removeRecentStickerAction, chatAssignmentAction, chatAssignmentOpenedStatusAction, securityNotificationSetting, pushNameSetting, localeSetting, unarchiveChatsSetting, stickerMetadata, keyExpiration, primaryFeature);
    }

}
