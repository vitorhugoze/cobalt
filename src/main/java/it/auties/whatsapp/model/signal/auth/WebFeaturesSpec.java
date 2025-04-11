package it.auties.whatsapp.model.signal.auth;

import it.auties.whatsapp.model.signal.auth.WebFeatures;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class WebFeaturesSpec {
    public static byte[] encode(WebFeatures protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(WebFeatures protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var labelsDisplay = protoInputObject.labelsDisplay();
        if (labelsDisplay != null) {
            var labelsDisplay0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(labelsDisplay);
            protoOutputStream.writeInt32(1, labelsDisplay0);
        }
        var voipIndividualOutgoing = protoInputObject.voipIndividualOutgoing();
        if (voipIndividualOutgoing != null) {
            var voipIndividualOutgoing0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipIndividualOutgoing);
            protoOutputStream.writeInt32(2, voipIndividualOutgoing0);
        }
        var groupsV3 = protoInputObject.groupsV3();
        if (groupsV3 != null) {
            var groupsV30 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupsV3);
            protoOutputStream.writeInt32(3, groupsV30);
        }
        var groupsV3Create = protoInputObject.groupsV3Create();
        if (groupsV3Create != null) {
            var groupsV3Create0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupsV3Create);
            protoOutputStream.writeInt32(4, groupsV3Create0);
        }
        var changeNumberV2 = protoInputObject.changeNumberV2();
        if (changeNumberV2 != null) {
            var changeNumberV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(changeNumberV2);
            protoOutputStream.writeInt32(5, changeNumberV20);
        }
        var queryStatusV3Thumbnail = protoInputObject.queryStatusV3Thumbnail();
        if (queryStatusV3Thumbnail != null) {
            var queryStatusV3Thumbnail0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(queryStatusV3Thumbnail);
            protoOutputStream.writeInt32(6, queryStatusV3Thumbnail0);
        }
        var liveLocations = protoInputObject.liveLocations();
        if (liveLocations != null) {
            var liveLocations0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(liveLocations);
            protoOutputStream.writeInt32(7, liveLocations0);
        }
        var queryVname = protoInputObject.queryVname();
        if (queryVname != null) {
            var queryVname0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(queryVname);
            protoOutputStream.writeInt32(8, queryVname0);
        }
        var voipIndividualIncoming = protoInputObject.voipIndividualIncoming();
        if (voipIndividualIncoming != null) {
            var voipIndividualIncoming0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipIndividualIncoming);
            protoOutputStream.writeInt32(9, voipIndividualIncoming0);
        }
        var quickRepliesQuery = protoInputObject.quickRepliesQuery();
        if (quickRepliesQuery != null) {
            var quickRepliesQuery0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(quickRepliesQuery);
            protoOutputStream.writeInt32(10, quickRepliesQuery0);
        }
        var payments = protoInputObject.payments();
        if (payments != null) {
            var payments0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(payments);
            protoOutputStream.writeInt32(11, payments0);
        }
        var stickerPackQuery = protoInputObject.stickerPackQuery();
        if (stickerPackQuery != null) {
            var stickerPackQuery0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(stickerPackQuery);
            protoOutputStream.writeInt32(12, stickerPackQuery0);
        }
        var liveLocationsFinal = protoInputObject.liveLocationsFinal();
        if (liveLocationsFinal != null) {
            var liveLocationsFinal0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(liveLocationsFinal);
            protoOutputStream.writeInt32(13, liveLocationsFinal0);
        }
        var labelsEdit = protoInputObject.labelsEdit();
        if (labelsEdit != null) {
            var labelsEdit0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(labelsEdit);
            protoOutputStream.writeInt32(14, labelsEdit0);
        }
        var mediaUpload = protoInputObject.mediaUpload();
        if (mediaUpload != null) {
            var mediaUpload0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(mediaUpload);
            protoOutputStream.writeInt32(15, mediaUpload0);
        }
        var mediaUploadRichQuickReplies = protoInputObject.mediaUploadRichQuickReplies();
        if (mediaUploadRichQuickReplies != null) {
            var mediaUploadRichQuickReplies0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(mediaUploadRichQuickReplies);
            protoOutputStream.writeInt32(18, mediaUploadRichQuickReplies0);
        }
        var vnameV2 = protoInputObject.vnameV2();
        if (vnameV2 != null) {
            var vnameV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(vnameV2);
            protoOutputStream.writeInt32(19, vnameV20);
        }
        var videoPlaybackUrl = protoInputObject.videoPlaybackUrl();
        if (videoPlaybackUrl != null) {
            var videoPlaybackUrl0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(videoPlaybackUrl);
            protoOutputStream.writeInt32(20, videoPlaybackUrl0);
        }
        var statusRanking = protoInputObject.statusRanking();
        if (statusRanking != null) {
            var statusRanking0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(statusRanking);
            protoOutputStream.writeInt32(21, statusRanking0);
        }
        var voipIndividualVideo = protoInputObject.voipIndividualVideo();
        if (voipIndividualVideo != null) {
            var voipIndividualVideo0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipIndividualVideo);
            protoOutputStream.writeInt32(22, voipIndividualVideo0);
        }
        var thirdPartyStickers = protoInputObject.thirdPartyStickers();
        if (thirdPartyStickers != null) {
            var thirdPartyStickers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(thirdPartyStickers);
            protoOutputStream.writeInt32(23, thirdPartyStickers0);
        }
        var frequentlyForwardedSetting = protoInputObject.frequentlyForwardedSetting();
        if (frequentlyForwardedSetting != null) {
            var frequentlyForwardedSetting0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(frequentlyForwardedSetting);
            protoOutputStream.writeInt32(24, frequentlyForwardedSetting0);
        }
        var groupsV4JoinPermission = protoInputObject.groupsV4JoinPermission();
        if (groupsV4JoinPermission != null) {
            var groupsV4JoinPermission0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupsV4JoinPermission);
            protoOutputStream.writeInt32(25, groupsV4JoinPermission0);
        }
        var recentStickers = protoInputObject.recentStickers();
        if (recentStickers != null) {
            var recentStickers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(recentStickers);
            protoOutputStream.writeInt32(26, recentStickers0);
        }
        var catalog = protoInputObject.catalog();
        if (catalog != null) {
            var catalog0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(catalog);
            protoOutputStream.writeInt32(27, catalog0);
        }
        var starredStickers = protoInputObject.starredStickers();
        if (starredStickers != null) {
            var starredStickers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(starredStickers);
            protoOutputStream.writeInt32(28, starredStickers0);
        }
        var voipGroupCall = protoInputObject.voipGroupCall();
        if (voipGroupCall != null) {
            var voipGroupCall0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipGroupCall);
            protoOutputStream.writeInt32(29, voipGroupCall0);
        }
        var templateMessage = protoInputObject.templateMessage();
        if (templateMessage != null) {
            var templateMessage0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(templateMessage);
            protoOutputStream.writeInt32(30, templateMessage0);
        }
        var templateMessageInteractivity = protoInputObject.templateMessageInteractivity();
        if (templateMessageInteractivity != null) {
            var templateMessageInteractivity0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(templateMessageInteractivity);
            protoOutputStream.writeInt32(31, templateMessageInteractivity0);
        }
        var ephemeralMessages = protoInputObject.ephemeralMessages();
        if (ephemeralMessages != null) {
            var ephemeralMessages0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(ephemeralMessages);
            protoOutputStream.writeInt32(32, ephemeralMessages0);
        }
        var e2ENotificationSync = protoInputObject.e2ENotificationSync();
        if (e2ENotificationSync != null) {
            var e2ENotificationSync0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(e2ENotificationSync);
            protoOutputStream.writeInt32(33, e2ENotificationSync0);
        }
        var recentStickersV2 = protoInputObject.recentStickersV2();
        if (recentStickersV2 != null) {
            var recentStickersV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(recentStickersV2);
            protoOutputStream.writeInt32(34, recentStickersV20);
        }
        var recentStickersV3 = protoInputObject.recentStickersV3();
        if (recentStickersV3 != null) {
            var recentStickersV30 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(recentStickersV3);
            protoOutputStream.writeInt32(36, recentStickersV30);
        }
        var userNotice = protoInputObject.userNotice();
        if (userNotice != null) {
            var userNotice0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(userNotice);
            protoOutputStream.writeInt32(37, userNotice0);
        }
        var support = protoInputObject.support();
        if (support != null) {
            var support0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(support);
            protoOutputStream.writeInt32(39, support0);
        }
        var groupUiiCleanup = protoInputObject.groupUiiCleanup();
        if (groupUiiCleanup != null) {
            var groupUiiCleanup0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupUiiCleanup);
            protoOutputStream.writeInt32(40, groupUiiCleanup0);
        }
        var groupDogfoodingInternalOnly = protoInputObject.groupDogfoodingInternalOnly();
        if (groupDogfoodingInternalOnly != null) {
            var groupDogfoodingInternalOnly0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupDogfoodingInternalOnly);
            protoOutputStream.writeInt32(41, groupDogfoodingInternalOnly0);
        }
        var settingsSync = protoInputObject.settingsSync();
        if (settingsSync != null) {
            var settingsSync0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(settingsSync);
            protoOutputStream.writeInt32(42, settingsSync0);
        }
        var archiveV2 = protoInputObject.archiveV2();
        if (archiveV2 != null) {
            var archiveV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(archiveV2);
            protoOutputStream.writeInt32(43, archiveV20);
        }
        var ephemeralAllowGroupMembers = protoInputObject.ephemeralAllowGroupMembers();
        if (ephemeralAllowGroupMembers != null) {
            var ephemeralAllowGroupMembers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(ephemeralAllowGroupMembers);
            protoOutputStream.writeInt32(44, ephemeralAllowGroupMembers0);
        }
        var ephemeral24HDuration = protoInputObject.ephemeral24HDuration();
        if (ephemeral24HDuration != null) {
            var ephemeral24HDuration0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(ephemeral24HDuration);
            protoOutputStream.writeInt32(45, ephemeral24HDuration0);
        }
        var mdForceUpgrade = protoInputObject.mdForceUpgrade();
        if (mdForceUpgrade != null) {
            var mdForceUpgrade0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(mdForceUpgrade);
            protoOutputStream.writeInt32(46, mdForceUpgrade0);
        }
        var disappearingMode = protoInputObject.disappearingMode();
        if (disappearingMode != null) {
            var disappearingMode0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(disappearingMode);
            protoOutputStream.writeInt32(47, disappearingMode0);
        }
        var externalMdOptInAvailable = protoInputObject.externalMdOptInAvailable();
        if (externalMdOptInAvailable != null) {
            var externalMdOptInAvailable0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(externalMdOptInAvailable);
            protoOutputStream.writeInt32(48, externalMdOptInAvailable0);
        }
        var noDeleteMessageTimeLimit = protoInputObject.noDeleteMessageTimeLimit();
        if (noDeleteMessageTimeLimit != null) {
            var noDeleteMessageTimeLimit0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(noDeleteMessageTimeLimit);
            protoOutputStream.writeInt32(49, noDeleteMessageTimeLimit0);
        }
    }

    public static WebFeatures decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static WebFeatures decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag labelsDisplay = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualOutgoing = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV3 = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV3Create = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag changeNumberV2 = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag queryStatusV3Thumbnail = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag liveLocations = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag queryVname = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualIncoming = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag quickRepliesQuery = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag payments = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag stickerPackQuery = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag liveLocationsFinal = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag labelsEdit = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mediaUpload = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mediaUploadRichQuickReplies = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag vnameV2 = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag videoPlaybackUrl = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag statusRanking = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipIndividualVideo = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag thirdPartyStickers = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag frequentlyForwardedSetting = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupsV4JoinPermission = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickers = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag catalog = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag starredStickers = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag voipGroupCall = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag templateMessage = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag templateMessageInteractivity = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeralMessages = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag e2ENotificationSync = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickersV2 = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag recentStickersV3 = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag userNotice = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag support = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupUiiCleanup = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag groupDogfoodingInternalOnly = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag settingsSync = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag archiveV2 = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeralAllowGroupMembers = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag ephemeral24HDuration = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag mdForceUpgrade = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag disappearingMode = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag externalMdOptInAvailable = null;
        it.auties.whatsapp.model.signal.auth.WebFeatures.WebFeaturesFlag noDeleteMessageTimeLimit = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> labelsDisplay = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 2 -> voipIndividualOutgoing = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 3 -> groupsV3 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 4 -> groupsV3Create = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 5 -> changeNumberV2 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 6 -> queryStatusV3Thumbnail = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 7 -> liveLocations = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 8 -> queryVname = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 9 -> voipIndividualIncoming = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 10 -> quickRepliesQuery = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 11 -> payments = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 12 -> stickerPackQuery = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 13 -> liveLocationsFinal = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 14 -> labelsEdit = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 15 -> mediaUpload = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 18 -> mediaUploadRichQuickReplies = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 19 -> vnameV2 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 20 -> videoPlaybackUrl = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 21 -> statusRanking = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 22 -> voipIndividualVideo = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 23 -> thirdPartyStickers = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 24 -> frequentlyForwardedSetting = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 25 -> groupsV4JoinPermission = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 26 -> recentStickers = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 27 -> catalog = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 28 -> starredStickers = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 29 -> voipGroupCall = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 30 -> templateMessage = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 31 -> templateMessageInteractivity = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 32 -> ephemeralMessages = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 33 -> e2ENotificationSync = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 34 -> recentStickersV2 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 36 -> recentStickersV3 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 37 -> userNotice = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 39 -> support = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 40 -> groupUiiCleanup = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 41 -> groupDogfoodingInternalOnly = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 42 -> settingsSync = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 43 -> archiveV2 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 44 -> ephemeralAllowGroupMembers = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 45 -> ephemeral24HDuration = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 46 -> mdForceUpgrade = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 47 -> disappearingMode = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 48 -> externalMdOptInAvailable = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                case 49 -> noDeleteMessageTimeLimit = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.signal.auth.WebFeatures(labelsDisplay, voipIndividualOutgoing, groupsV3, groupsV3Create, changeNumberV2, queryStatusV3Thumbnail, liveLocations, queryVname, voipIndividualIncoming, quickRepliesQuery, payments, stickerPackQuery, liveLocationsFinal, labelsEdit, mediaUpload, mediaUploadRichQuickReplies, vnameV2, videoPlaybackUrl, statusRanking, voipIndividualVideo, thirdPartyStickers, frequentlyForwardedSetting, groupsV4JoinPermission, recentStickers, catalog, starredStickers, voipGroupCall, templateMessage, templateMessageInteractivity, ephemeralMessages, e2ENotificationSync, recentStickersV2, recentStickersV3, userNotice, support, groupUiiCleanup, groupDogfoodingInternalOnly, settingsSync, archiveV2, ephemeralAllowGroupMembers, ephemeral24HDuration, mdForceUpgrade, disappearingMode, externalMdOptInAvailable, noDeleteMessageTimeLimit);
    }

    public static int sizeOf(WebFeatures protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var labelsDisplay = protoInputObject.labelsDisplay();
        if (labelsDisplay != null) {
            var labelsDisplay0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(labelsDisplay);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(labelsDisplay0);
        }
        var voipIndividualOutgoing = protoInputObject.voipIndividualOutgoing();
        if (voipIndividualOutgoing != null) {
            var voipIndividualOutgoing0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipIndividualOutgoing);
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(voipIndividualOutgoing0);
        }
        var groupsV3 = protoInputObject.groupsV3();
        if (groupsV3 != null) {
            var groupsV30 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupsV3);
            protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupsV30);
        }
        var groupsV3Create = protoInputObject.groupsV3Create();
        if (groupsV3Create != null) {
            var groupsV3Create0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupsV3Create);
            protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupsV3Create0);
        }
        var changeNumberV2 = protoInputObject.changeNumberV2();
        if (changeNumberV2 != null) {
            var changeNumberV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(changeNumberV2);
            protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(changeNumberV20);
        }
        var queryStatusV3Thumbnail = protoInputObject.queryStatusV3Thumbnail();
        if (queryStatusV3Thumbnail != null) {
            var queryStatusV3Thumbnail0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(queryStatusV3Thumbnail);
            protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(queryStatusV3Thumbnail0);
        }
        var liveLocations = protoInputObject.liveLocations();
        if (liveLocations != null) {
            var liveLocations0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(liveLocations);
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(liveLocations0);
        }
        var queryVname = protoInputObject.queryVname();
        if (queryVname != null) {
            var queryVname0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(queryVname);
            protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(queryVname0);
        }
        var voipIndividualIncoming = protoInputObject.voipIndividualIncoming();
        if (voipIndividualIncoming != null) {
            var voipIndividualIncoming0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipIndividualIncoming);
            protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(voipIndividualIncoming0);
        }
        var quickRepliesQuery = protoInputObject.quickRepliesQuery();
        if (quickRepliesQuery != null) {
            var quickRepliesQuery0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(quickRepliesQuery);
            protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(quickRepliesQuery0);
        }
        var payments = protoInputObject.payments();
        if (payments != null) {
            var payments0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(payments);
            protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(payments0);
        }
        var stickerPackQuery = protoInputObject.stickerPackQuery();
        if (stickerPackQuery != null) {
            var stickerPackQuery0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(stickerPackQuery);
            protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(stickerPackQuery0);
        }
        var liveLocationsFinal = protoInputObject.liveLocationsFinal();
        if (liveLocationsFinal != null) {
            var liveLocationsFinal0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(liveLocationsFinal);
            protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(liveLocationsFinal0);
        }
        var labelsEdit = protoInputObject.labelsEdit();
        if (labelsEdit != null) {
            var labelsEdit0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(labelsEdit);
            protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(labelsEdit0);
        }
        var mediaUpload = protoInputObject.mediaUpload();
        if (mediaUpload != null) {
            var mediaUpload0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(mediaUpload);
            protoOutputSize += ProtobufOutputStream.getFieldSize(15, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaUpload0);
        }
        var mediaUploadRichQuickReplies = protoInputObject.mediaUploadRichQuickReplies();
        if (mediaUploadRichQuickReplies != null) {
            var mediaUploadRichQuickReplies0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(mediaUploadRichQuickReplies);
            protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mediaUploadRichQuickReplies0);
        }
        var vnameV2 = protoInputObject.vnameV2();
        if (vnameV2 != null) {
            var vnameV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(vnameV2);
            protoOutputSize += ProtobufOutputStream.getFieldSize(19, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(vnameV20);
        }
        var videoPlaybackUrl = protoInputObject.videoPlaybackUrl();
        if (videoPlaybackUrl != null) {
            var videoPlaybackUrl0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(videoPlaybackUrl);
            protoOutputSize += ProtobufOutputStream.getFieldSize(20, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(videoPlaybackUrl0);
        }
        var statusRanking = protoInputObject.statusRanking();
        if (statusRanking != null) {
            var statusRanking0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(statusRanking);
            protoOutputSize += ProtobufOutputStream.getFieldSize(21, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(statusRanking0);
        }
        var voipIndividualVideo = protoInputObject.voipIndividualVideo();
        if (voipIndividualVideo != null) {
            var voipIndividualVideo0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipIndividualVideo);
            protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(voipIndividualVideo0);
        }
        var thirdPartyStickers = protoInputObject.thirdPartyStickers();
        if (thirdPartyStickers != null) {
            var thirdPartyStickers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(thirdPartyStickers);
            protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(thirdPartyStickers0);
        }
        var frequentlyForwardedSetting = protoInputObject.frequentlyForwardedSetting();
        if (frequentlyForwardedSetting != null) {
            var frequentlyForwardedSetting0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(frequentlyForwardedSetting);
            protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(frequentlyForwardedSetting0);
        }
        var groupsV4JoinPermission = protoInputObject.groupsV4JoinPermission();
        if (groupsV4JoinPermission != null) {
            var groupsV4JoinPermission0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupsV4JoinPermission);
            protoOutputSize += ProtobufOutputStream.getFieldSize(25, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupsV4JoinPermission0);
        }
        var recentStickers = protoInputObject.recentStickers();
        if (recentStickers != null) {
            var recentStickers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(recentStickers);
            protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(recentStickers0);
        }
        var catalog = protoInputObject.catalog();
        if (catalog != null) {
            var catalog0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(catalog);
            protoOutputSize += ProtobufOutputStream.getFieldSize(27, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(catalog0);
        }
        var starredStickers = protoInputObject.starredStickers();
        if (starredStickers != null) {
            var starredStickers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(starredStickers);
            protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(starredStickers0);
        }
        var voipGroupCall = protoInputObject.voipGroupCall();
        if (voipGroupCall != null) {
            var voipGroupCall0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(voipGroupCall);
            protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(voipGroupCall0);
        }
        var templateMessage = protoInputObject.templateMessage();
        if (templateMessage != null) {
            var templateMessage0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(templateMessage);
            protoOutputSize += ProtobufOutputStream.getFieldSize(30, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(templateMessage0);
        }
        var templateMessageInteractivity = protoInputObject.templateMessageInteractivity();
        if (templateMessageInteractivity != null) {
            var templateMessageInteractivity0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(templateMessageInteractivity);
            protoOutputSize += ProtobufOutputStream.getFieldSize(31, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(templateMessageInteractivity0);
        }
        var ephemeralMessages = protoInputObject.ephemeralMessages();
        if (ephemeralMessages != null) {
            var ephemeralMessages0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(ephemeralMessages);
            protoOutputSize += ProtobufOutputStream.getFieldSize(32, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralMessages0);
        }
        var e2ENotificationSync = protoInputObject.e2ENotificationSync();
        if (e2ENotificationSync != null) {
            var e2ENotificationSync0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(e2ENotificationSync);
            protoOutputSize += ProtobufOutputStream.getFieldSize(33, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(e2ENotificationSync0);
        }
        var recentStickersV2 = protoInputObject.recentStickersV2();
        if (recentStickersV2 != null) {
            var recentStickersV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(recentStickersV2);
            protoOutputSize += ProtobufOutputStream.getFieldSize(34, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(recentStickersV20);
        }
        var recentStickersV3 = protoInputObject.recentStickersV3();
        if (recentStickersV3 != null) {
            var recentStickersV30 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(recentStickersV3);
            protoOutputSize += ProtobufOutputStream.getFieldSize(36, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(recentStickersV30);
        }
        var userNotice = protoInputObject.userNotice();
        if (userNotice != null) {
            var userNotice0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(userNotice);
            protoOutputSize += ProtobufOutputStream.getFieldSize(37, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(userNotice0);
        }
        var support = protoInputObject.support();
        if (support != null) {
            var support0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(support);
            protoOutputSize += ProtobufOutputStream.getFieldSize(39, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(support0);
        }
        var groupUiiCleanup = protoInputObject.groupUiiCleanup();
        if (groupUiiCleanup != null) {
            var groupUiiCleanup0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupUiiCleanup);
            protoOutputSize += ProtobufOutputStream.getFieldSize(40, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupUiiCleanup0);
        }
        var groupDogfoodingInternalOnly = protoInputObject.groupDogfoodingInternalOnly();
        if (groupDogfoodingInternalOnly != null) {
            var groupDogfoodingInternalOnly0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(groupDogfoodingInternalOnly);
            protoOutputSize += ProtobufOutputStream.getFieldSize(41, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(groupDogfoodingInternalOnly0);
        }
        var settingsSync = protoInputObject.settingsSync();
        if (settingsSync != null) {
            var settingsSync0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(settingsSync);
            protoOutputSize += ProtobufOutputStream.getFieldSize(42, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(settingsSync0);
        }
        var archiveV2 = protoInputObject.archiveV2();
        if (archiveV2 != null) {
            var archiveV20 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(archiveV2);
            protoOutputSize += ProtobufOutputStream.getFieldSize(43, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(archiveV20);
        }
        var ephemeralAllowGroupMembers = protoInputObject.ephemeralAllowGroupMembers();
        if (ephemeralAllowGroupMembers != null) {
            var ephemeralAllowGroupMembers0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(ephemeralAllowGroupMembers);
            protoOutputSize += ProtobufOutputStream.getFieldSize(44, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralAllowGroupMembers0);
        }
        var ephemeral24HDuration = protoInputObject.ephemeral24HDuration();
        if (ephemeral24HDuration != null) {
            var ephemeral24HDuration0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(ephemeral24HDuration);
            protoOutputSize += ProtobufOutputStream.getFieldSize(45, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeral24HDuration0);
        }
        var mdForceUpgrade = protoInputObject.mdForceUpgrade();
        if (mdForceUpgrade != null) {
            var mdForceUpgrade0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(mdForceUpgrade);
            protoOutputSize += ProtobufOutputStream.getFieldSize(46, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(mdForceUpgrade0);
        }
        var disappearingMode = protoInputObject.disappearingMode();
        if (disappearingMode != null) {
            var disappearingMode0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(disappearingMode);
            protoOutputSize += ProtobufOutputStream.getFieldSize(47, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(disappearingMode0);
        }
        var externalMdOptInAvailable = protoInputObject.externalMdOptInAvailable();
        if (externalMdOptInAvailable != null) {
            var externalMdOptInAvailable0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(externalMdOptInAvailable);
            protoOutputSize += ProtobufOutputStream.getFieldSize(48, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(externalMdOptInAvailable0);
        }
        var noDeleteMessageTimeLimit = protoInputObject.noDeleteMessageTimeLimit();
        if (noDeleteMessageTimeLimit != null) {
            var noDeleteMessageTimeLimit0 = it.auties.whatsapp.model.signal.auth.WebFeaturesWebFeaturesFlagSpec.encode(noDeleteMessageTimeLimit);
            protoOutputSize += ProtobufOutputStream.getFieldSize(49, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(noDeleteMessageTimeLimit0);
        }
        return protoOutputSize;
    }

}
