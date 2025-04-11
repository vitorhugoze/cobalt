package it.auties.whatsapp.model.signal.auth;

public class WebFeaturesBuilder {
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag labelsDisplay;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualOutgoing;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV3;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV3Create;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag changeNumberV2;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag queryStatusV3Thumbnail;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag liveLocations;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag queryVname;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualIncoming;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag quickRepliesQuery;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag payments;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag stickerPackQuery;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag liveLocationsFinal;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag labelsEdit;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mediaUpload;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mediaUploadRichQuickReplies;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag vnameV2;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag videoPlaybackUrl;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag statusRanking;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualVideo;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag thirdPartyStickers;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag frequentlyForwardedSetting;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV4JoinPermission;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickers;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag catalog;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag starredStickers;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipGroupCall;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag templateMessage;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag templateMessageInteractivity;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeralMessages;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag e2ENotificationSync;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickersV2;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickersV3;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag userNotice;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag support;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupUiiCleanup;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupDogfoodingInternalOnly;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag settingsSync;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag archiveV2;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeralAllowGroupMembers;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeral24HDuration;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mdForceUpgrade;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag disappearingMode;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag externalMdOptInAvailable;
    private it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag noDeleteMessageTimeLimit;

    public WebFeaturesBuilder() {
        labelsDisplay = null;
        voipIndividualOutgoing = null;
        groupsV3 = null;
        groupsV3Create = null;
        changeNumberV2 = null;
        queryStatusV3Thumbnail = null;
        liveLocations = null;
        queryVname = null;
        voipIndividualIncoming = null;
        quickRepliesQuery = null;
        payments = null;
        stickerPackQuery = null;
        liveLocationsFinal = null;
        labelsEdit = null;
        mediaUpload = null;
        mediaUploadRichQuickReplies = null;
        vnameV2 = null;
        videoPlaybackUrl = null;
        statusRanking = null;
        voipIndividualVideo = null;
        thirdPartyStickers = null;
        frequentlyForwardedSetting = null;
        groupsV4JoinPermission = null;
        recentStickers = null;
        catalog = null;
        starredStickers = null;
        voipGroupCall = null;
        templateMessage = null;
        templateMessageInteractivity = null;
        ephemeralMessages = null;
        e2ENotificationSync = null;
        recentStickersV2 = null;
        recentStickersV3 = null;
        userNotice = null;
        support = null;
        groupUiiCleanup = null;
        groupDogfoodingInternalOnly = null;
        settingsSync = null;
        archiveV2 = null;
        ephemeralAllowGroupMembers = null;
        ephemeral24HDuration = null;
        mdForceUpgrade = null;
        disappearingMode = null;
        externalMdOptInAvailable = null;
        noDeleteMessageTimeLimit = null;
    }

    public WebFeaturesBuilder labelsDisplay(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag labelsDisplay) {
        this.labelsDisplay = labelsDisplay;
        return this;
    }

    public WebFeaturesBuilder voipIndividualOutgoing(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualOutgoing) {
        this.voipIndividualOutgoing = voipIndividualOutgoing;
        return this;
    }

    public WebFeaturesBuilder groupsV3(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV3) {
        this.groupsV3 = groupsV3;
        return this;
    }

    public WebFeaturesBuilder groupsV3Create(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV3Create) {
        this.groupsV3Create = groupsV3Create;
        return this;
    }

    public WebFeaturesBuilder changeNumberV2(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag changeNumberV2) {
        this.changeNumberV2 = changeNumberV2;
        return this;
    }

    public WebFeaturesBuilder queryStatusV3Thumbnail(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag queryStatusV3Thumbnail) {
        this.queryStatusV3Thumbnail = queryStatusV3Thumbnail;
        return this;
    }

    public WebFeaturesBuilder liveLocations(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag liveLocations) {
        this.liveLocations = liveLocations;
        return this;
    }

    public WebFeaturesBuilder queryVname(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag queryVname) {
        this.queryVname = queryVname;
        return this;
    }

    public WebFeaturesBuilder voipIndividualIncoming(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualIncoming) {
        this.voipIndividualIncoming = voipIndividualIncoming;
        return this;
    }

    public WebFeaturesBuilder quickRepliesQuery(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag quickRepliesQuery) {
        this.quickRepliesQuery = quickRepliesQuery;
        return this;
    }

    public WebFeaturesBuilder payments(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag payments) {
        this.payments = payments;
        return this;
    }

    public WebFeaturesBuilder stickerPackQuery(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag stickerPackQuery) {
        this.stickerPackQuery = stickerPackQuery;
        return this;
    }

    public WebFeaturesBuilder liveLocationsFinal(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag liveLocationsFinal) {
        this.liveLocationsFinal = liveLocationsFinal;
        return this;
    }

    public WebFeaturesBuilder labelsEdit(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag labelsEdit) {
        this.labelsEdit = labelsEdit;
        return this;
    }

    public WebFeaturesBuilder mediaUpload(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mediaUpload) {
        this.mediaUpload = mediaUpload;
        return this;
    }

    public WebFeaturesBuilder mediaUploadRichQuickReplies(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mediaUploadRichQuickReplies) {
        this.mediaUploadRichQuickReplies = mediaUploadRichQuickReplies;
        return this;
    }

    public WebFeaturesBuilder vnameV2(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag vnameV2) {
        this.vnameV2 = vnameV2;
        return this;
    }

    public WebFeaturesBuilder videoPlaybackUrl(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag videoPlaybackUrl) {
        this.videoPlaybackUrl = videoPlaybackUrl;
        return this;
    }

    public WebFeaturesBuilder statusRanking(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag statusRanking) {
        this.statusRanking = statusRanking;
        return this;
    }

    public WebFeaturesBuilder voipIndividualVideo(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualVideo) {
        this.voipIndividualVideo = voipIndividualVideo;
        return this;
    }

    public WebFeaturesBuilder thirdPartyStickers(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag thirdPartyStickers) {
        this.thirdPartyStickers = thirdPartyStickers;
        return this;
    }

    public WebFeaturesBuilder frequentlyForwardedSetting(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag frequentlyForwardedSetting) {
        this.frequentlyForwardedSetting = frequentlyForwardedSetting;
        return this;
    }

    public WebFeaturesBuilder groupsV4JoinPermission(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV4JoinPermission) {
        this.groupsV4JoinPermission = groupsV4JoinPermission;
        return this;
    }

    public WebFeaturesBuilder recentStickers(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickers) {
        this.recentStickers = recentStickers;
        return this;
    }

    public WebFeaturesBuilder catalog(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag catalog) {
        this.catalog = catalog;
        return this;
    }

    public WebFeaturesBuilder starredStickers(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag starredStickers) {
        this.starredStickers = starredStickers;
        return this;
    }

    public WebFeaturesBuilder voipGroupCall(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipGroupCall) {
        this.voipGroupCall = voipGroupCall;
        return this;
    }

    public WebFeaturesBuilder templateMessage(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag templateMessage) {
        this.templateMessage = templateMessage;
        return this;
    }

    public WebFeaturesBuilder templateMessageInteractivity(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag templateMessageInteractivity) {
        this.templateMessageInteractivity = templateMessageInteractivity;
        return this;
    }

    public WebFeaturesBuilder ephemeralMessages(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeralMessages) {
        this.ephemeralMessages = ephemeralMessages;
        return this;
    }

    public WebFeaturesBuilder e2ENotificationSync(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag e2ENotificationSync) {
        this.e2ENotificationSync = e2ENotificationSync;
        return this;
    }

    public WebFeaturesBuilder recentStickersV2(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickersV2) {
        this.recentStickersV2 = recentStickersV2;
        return this;
    }

    public WebFeaturesBuilder recentStickersV3(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickersV3) {
        this.recentStickersV3 = recentStickersV3;
        return this;
    }

    public WebFeaturesBuilder userNotice(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag userNotice) {
        this.userNotice = userNotice;
        return this;
    }

    public WebFeaturesBuilder support(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag support) {
        this.support = support;
        return this;
    }

    public WebFeaturesBuilder groupUiiCleanup(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupUiiCleanup) {
        this.groupUiiCleanup = groupUiiCleanup;
        return this;
    }

    public WebFeaturesBuilder groupDogfoodingInternalOnly(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupDogfoodingInternalOnly) {
        this.groupDogfoodingInternalOnly = groupDogfoodingInternalOnly;
        return this;
    }

    public WebFeaturesBuilder settingsSync(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag settingsSync) {
        this.settingsSync = settingsSync;
        return this;
    }

    public WebFeaturesBuilder archiveV2(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag archiveV2) {
        this.archiveV2 = archiveV2;
        return this;
    }

    public WebFeaturesBuilder ephemeralAllowGroupMembers(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeralAllowGroupMembers) {
        this.ephemeralAllowGroupMembers = ephemeralAllowGroupMembers;
        return this;
    }

    public WebFeaturesBuilder ephemeral24HDuration(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeral24HDuration) {
        this.ephemeral24HDuration = ephemeral24HDuration;
        return this;
    }

    public WebFeaturesBuilder mdForceUpgrade(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mdForceUpgrade) {
        this.mdForceUpgrade = mdForceUpgrade;
        return this;
    }

    public WebFeaturesBuilder disappearingMode(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag disappearingMode) {
        this.disappearingMode = disappearingMode;
        return this;
    }

    public WebFeaturesBuilder externalMdOptInAvailable(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag externalMdOptInAvailable) {
        this.externalMdOptInAvailable = externalMdOptInAvailable;
        return this;
    }

    public WebFeaturesBuilder noDeleteMessageTimeLimit(it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag noDeleteMessageTimeLimit) {
        this.noDeleteMessageTimeLimit = noDeleteMessageTimeLimit;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.WebFeatures build() {
        return new it.auties.whatsapp.model.signal.auth.WebFeatures(labelsDisplay, voipIndividualOutgoing, groupsV3, groupsV3Create, changeNumberV2, queryStatusV3Thumbnail, liveLocations, queryVname, voipIndividualIncoming, quickRepliesQuery, payments, stickerPackQuery, liveLocationsFinal, labelsEdit, mediaUpload, mediaUploadRichQuickReplies, vnameV2, videoPlaybackUrl, statusRanking, voipIndividualVideo, thirdPartyStickers, frequentlyForwardedSetting, groupsV4JoinPermission, recentStickers, catalog, starredStickers, voipGroupCall, templateMessage, templateMessageInteractivity, ephemeralMessages, e2ENotificationSync, recentStickersV2, recentStickersV3, userNotice, support, groupUiiCleanup, groupDogfoodingInternalOnly, settingsSync, archiveV2, ephemeralAllowGroupMembers, ephemeral24HDuration, mdForceUpgrade, disappearingMode, externalMdOptInAvailable, noDeleteMessageTimeLimit);
    }

}
