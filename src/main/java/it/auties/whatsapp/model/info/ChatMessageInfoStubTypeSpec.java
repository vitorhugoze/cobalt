package it.auties.whatsapp.model.info;

import it.auties.whatsapp.model.info.ChatMessageInfo.StubType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class ChatMessageInfoStubTypeSpec {
    private static final Map<Integer, StubType> VALUES = new HashMap<>();
    static {
        VALUES.put(0, StubType.UNKNOWN);
        VALUES.put(1, StubType.REVOKE);
        VALUES.put(2, StubType.CIPHERTEXT);
        VALUES.put(3, StubType.FUTUREPROOF);
        VALUES.put(4, StubType.NON_VERIFIED_TRANSITION);
        VALUES.put(5, StubType.UNVERIFIED_TRANSITION);
        VALUES.put(6, StubType.VERIFIED_TRANSITION);
        VALUES.put(7, StubType.VERIFIED_LOW_UNKNOWN);
        VALUES.put(8, StubType.VERIFIED_HIGH);
        VALUES.put(9, StubType.VERIFIED_INITIAL_UNKNOWN);
        VALUES.put(10, StubType.VERIFIED_INITIAL_LOW);
        VALUES.put(11, StubType.VERIFIED_INITIAL_HIGH);
        VALUES.put(12, StubType.VERIFIED_TRANSITION_ANY_TO_NONE);
        VALUES.put(13, StubType.VERIFIED_TRANSITION_ANY_TO_HIGH);
        VALUES.put(14, StubType.VERIFIED_TRANSITION_HIGH_TO_LOW);
        VALUES.put(15, StubType.VERIFIED_TRANSITION_HIGH_TO_UNKNOWN);
        VALUES.put(16, StubType.VERIFIED_TRANSITION_UNKNOWN_TO_LOW);
        VALUES.put(17, StubType.VERIFIED_TRANSITION_LOW_TO_UNKNOWN);
        VALUES.put(18, StubType.VERIFIED_TRANSITION_NONE_TO_LOW);
        VALUES.put(19, StubType.VERIFIED_TRANSITION_NONE_TO_UNKNOWN);
        VALUES.put(20, StubType.GROUP_CREATE);
        VALUES.put(21, StubType.GROUP_CHANGE_SUBJECT);
        VALUES.put(22, StubType.GROUP_CHANGE_ICON);
        VALUES.put(23, StubType.GROUP_CHANGE_INVITE_LINK);
        VALUES.put(24, StubType.GROUP_CHANGE_DESCRIPTION);
        VALUES.put(25, StubType.GROUP_CHANGE_RESTRICT);
        VALUES.put(26, StubType.GROUP_CHANGE_ANNOUNCE);
        VALUES.put(27, StubType.GROUP_PARTICIPANT_ADD);
        VALUES.put(28, StubType.GROUP_PARTICIPANT_REMOVE);
        VALUES.put(29, StubType.GROUP_PARTICIPANT_PROMOTE);
        VALUES.put(30, StubType.GROUP_PARTICIPANT_DEMOTE);
        VALUES.put(31, StubType.GROUP_PARTICIPANT_INVITE);
        VALUES.put(32, StubType.GROUP_PARTICIPANT_LEAVE);
        VALUES.put(33, StubType.GROUP_PARTICIPANT_CHANGE_NUMBER);
        VALUES.put(34, StubType.BROADCAST_CREATE);
        VALUES.put(35, StubType.BROADCAST_ADD);
        VALUES.put(36, StubType.BROADCAST_REMOVE);
        VALUES.put(37, StubType.GENERIC_NOTIFICATION);
        VALUES.put(38, StubType.E2E_IDENTITY_CHANGED);
        VALUES.put(39, StubType.E2E_ENCRYPTED);
        VALUES.put(40, StubType.CALL_MISSED_VOICE);
        VALUES.put(41, StubType.CALL_MISSED_VIDEO);
        VALUES.put(42, StubType.INDIVIDUAL_CHANGE_NUMBER);
        VALUES.put(43, StubType.GROUP_DELETE);
        VALUES.put(44, StubType.GROUP_ANNOUNCE_MODE_MESSAGE_BOUNCE);
        VALUES.put(45, StubType.CALL_MISSED_GROUP_VOICE);
        VALUES.put(46, StubType.CALL_MISSED_GROUP_VIDEO);
        VALUES.put(47, StubType.PAYMENT_CIPHERTEXT);
        VALUES.put(48, StubType.PAYMENT_FUTUREPROOF);
        VALUES.put(49, StubType.PAYMENT_TRANSACTION_STATUS_UPDATE_FAILED);
        VALUES.put(50, StubType.PAYMENT_TRANSACTION_STATUS_UPDATE_REFUNDED);
        VALUES.put(51, StubType.PAYMENT_TRANSACTION_STATUS_UPDATE_REFUND_FAILED);
        VALUES.put(52, StubType.PAYMENT_TRANSACTION_STATUS_RECEIVER_PENDING_SETUP);
        VALUES.put(53, StubType.PAYMENT_TRANSACTION_STATUS_RECEIVER_SUCCESS_AFTER_HICCUP);
        VALUES.put(54, StubType.PAYMENT_ACTION_ACCOUNT_SETUP_REMINDER);
        VALUES.put(55, StubType.PAYMENT_ACTION_SEND_PAYMENT_REMINDER);
        VALUES.put(56, StubType.PAYMENT_ACTION_SEND_PAYMENT_INVITATION);
        VALUES.put(57, StubType.PAYMENT_ACTION_REQUEST_DECLINED);
        VALUES.put(58, StubType.PAYMENT_ACTION_REQUEST_EXPIRED);
        VALUES.put(59, StubType.PAYMENT_ACTION_REQUEST_CANCELLED);
        VALUES.put(60, StubType.BIZ_VERIFIED_TRANSITION_TOP_TO_BOTTOM);
        VALUES.put(61, StubType.BIZ_VERIFIED_TRANSITION_BOTTOM_TO_TOP);
        VALUES.put(62, StubType.BIZ_INTRO_TOP);
        VALUES.put(63, StubType.BIZ_INTRO_BOTTOM);
        VALUES.put(64, StubType.BIZ_NAME_CHANGE);
        VALUES.put(65, StubType.BIZ_MOVE_TO_CONSUMER_APP);
        VALUES.put(66, StubType.BIZ_TWO_TIER_MIGRATION_TOP);
        VALUES.put(67, StubType.BIZ_TWO_TIER_MIGRATION_BOTTOM);
        VALUES.put(68, StubType.OVERSIZED);
        VALUES.put(69, StubType.GROUP_CHANGE_NO_FREQUENTLY_FORWARDED);
        VALUES.put(70, StubType.GROUP_V4_ADD_INVITE_SENT);
        VALUES.put(71, StubType.GROUP_PARTICIPANT_ADD_REQUEST_JOIN);
        VALUES.put(72, StubType.CHANGE_EPHEMERAL_SETTING);
        VALUES.put(73, StubType.E2E_DEVICE_CHANGED);
        VALUES.put(74, StubType.VIEWED_ONCE);
        VALUES.put(75, StubType.E2E_ENCRYPTED_NOW);
        VALUES.put(76, StubType.BLUE_MSG_BSP_FB_TO_BSP_PREMISE);
        VALUES.put(77, StubType.BLUE_MSG_BSP_FB_TO_SELF_FB);
        VALUES.put(78, StubType.BLUE_MSG_BSP_FB_TO_SELF_PREMISE);
        VALUES.put(79, StubType.BLUE_MSG_BSP_FB_UNVERIFIED);
        VALUES.put(80, StubType.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED);
        VALUES.put(81, StubType.BLUE_MSG_BSP_FB_VERIFIED);
        VALUES.put(82, StubType.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED);
        VALUES.put(83, StubType.BLUE_MSG_BSP_PREMISE_TO_SELF_PREMISE);
        VALUES.put(84, StubType.BLUE_MSG_BSP_PREMISE_UNVERIFIED);
        VALUES.put(85, StubType.BLUE_MSG_BSP_PREMISE_UNVERIFIED_TO_SELF_PREMISE_VERIFIED);
        VALUES.put(86, StubType.BLUE_MSG_BSP_PREMISE_VERIFIED);
        VALUES.put(87, StubType.BLUE_MSG_BSP_PREMISE_VERIFIED_TO_SELF_PREMISE_UNVERIFIED);
        VALUES.put(88, StubType.BLUE_MSG_CONSUMER_TO_BSP_FB_UNVERIFIED);
        VALUES.put(89, StubType.BLUE_MSG_CONSUMER_TO_BSP_PREMISE_UNVERIFIED);
        VALUES.put(90, StubType.BLUE_MSG_CONSUMER_TO_SELF_FB_UNVERIFIED);
        VALUES.put(91, StubType.BLUE_MSG_CONSUMER_TO_SELF_PREMISE_UNVERIFIED);
        VALUES.put(92, StubType.BLUE_MSG_SELF_FB_TO_BSP_PREMISE);
        VALUES.put(93, StubType.BLUE_MSG_SELF_FB_TO_SELF_PREMISE);
        VALUES.put(94, StubType.BLUE_MSG_SELF_FB_UNVERIFIED);
        VALUES.put(95, StubType.BLUE_MSG_SELF_FB_UNVERIFIED_TO_SELF_PREMISE_VERIFIED);
        VALUES.put(96, StubType.BLUE_MSG_SELF_FB_VERIFIED);
        VALUES.put(97, StubType.BLUE_MSG_SELF_FB_VERIFIED_TO_SELF_PREMISE_UNVERIFIED);
        VALUES.put(98, StubType.BLUE_MSG_SELF_PREMISE_TO_BSP_PREMISE);
        VALUES.put(99, StubType.BLUE_MSG_SELF_PREMISE_UNVERIFIED);
        VALUES.put(100, StubType.BLUE_MSG_SELF_PREMISE_VERIFIED);
        VALUES.put(101, StubType.BLUE_MSG_TO_BSP_FB);
        VALUES.put(102, StubType.BLUE_MSG_TO_CONSUMER);
        VALUES.put(103, StubType.BLUE_MSG_TO_SELF_FB);
        VALUES.put(104, StubType.BLUE_MSG_UNVERIFIED_TO_BSP_FB_VERIFIED);
        VALUES.put(105, StubType.BLUE_MSG_UNVERIFIED_TO_BSP_PREMISE_VERIFIED);
        VALUES.put(106, StubType.BLUE_MSG_UNVERIFIED_TO_SELF_FB_VERIFIED);
        VALUES.put(107, StubType.BLUE_MSG_UNVERIFIED_TO_VERIFIED);
        VALUES.put(108, StubType.BLUE_MSG_VERIFIED_TO_BSP_FB_UNVERIFIED);
        VALUES.put(109, StubType.BLUE_MSG_VERIFIED_TO_BSP_PREMISE_UNVERIFIED);
        VALUES.put(110, StubType.BLUE_MSG_VERIFIED_TO_SELF_FB_UNVERIFIED);
        VALUES.put(111, StubType.BLUE_MSG_VERIFIED_TO_UNVERIFIED);
        VALUES.put(112, StubType.BLUE_MSG_BSP_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED);
        VALUES.put(113, StubType.BLUE_MSG_BSP_FB_UNVERIFIED_TO_SELF_FB_VERIFIED);
        VALUES.put(114, StubType.BLUE_MSG_BSP_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED);
        VALUES.put(115, StubType.BLUE_MSG_BSP_FB_VERIFIED_TO_SELF_FB_UNVERIFIED);
        VALUES.put(116, StubType.BLUE_MSG_SELF_FB_UNVERIFIED_TO_BSP_PREMISE_VERIFIED);
        VALUES.put(117, StubType.BLUE_MSG_SELF_FB_VERIFIED_TO_BSP_PREMISE_UNVERIFIED);
        VALUES.put(118, StubType.E2E_IDENTITY_UNAVAILABLE);
        VALUES.put(119, StubType.GROUP_CREATING);
        VALUES.put(120, StubType.GROUP_CREATE_FAILED);
        VALUES.put(121, StubType.GROUP_BOUNCED);
        VALUES.put(122, StubType.BLOCK_CONTACT);
        VALUES.put(123, StubType.EPHEMERAL_SETTING_NOT_APPLIED);
        VALUES.put(124, StubType.SYNC_FAILED);
        VALUES.put(125, StubType.SYNCING);
        VALUES.put(126, StubType.BIZ_PRIVACY_MODE_INIT_FB);
        VALUES.put(127, StubType.BIZ_PRIVACY_MODE_INIT_BSP);
        VALUES.put(128, StubType.BIZ_PRIVACY_MODE_TO_FB);
        VALUES.put(129, StubType.BIZ_PRIVACY_MODE_TO_BSP);
        VALUES.put(130, StubType.DISAPPEARING_MODE);
        VALUES.put(131, StubType.E2E_DEVICE_FETCH_FAILED);
        VALUES.put(132, StubType.ADMIN_REVOKE);
        VALUES.put(133, StubType.GROUP_INVITE_LINK_GROWTH_LOCKED);
        VALUES.put(134, StubType.COMMUNITY_LINK_PARENT_GROUP);
        VALUES.put(135, StubType.COMMUNITY_LINK_SIBLING_GROUP);
        VALUES.put(136, StubType.COMMUNITY_LINK_SUB_GROUP);
        VALUES.put(137, StubType.COMMUNITY_UNLINK_PARENT_GROUP);
        VALUES.put(138, StubType.COMMUNITY_UNLINK_SIBLING_GROUP);
        VALUES.put(139, StubType.COMMUNITY_UNLINK_SUB_GROUP);
        VALUES.put(140, StubType.GROUP_PARTICIPANT_ACCEPT);
        VALUES.put(141, StubType.GROUP_PARTICIPANT_LINKED_GROUP_JOIN);
        VALUES.put(142, StubType.COMMUNITY_CREATE);
        VALUES.put(143, StubType.EPHEMERAL_KEEP_IN_CHAT);
        VALUES.put(144, StubType.GROUP_MEMBERSHIP_JOIN_APPROVAL_REQUEST);
        VALUES.put(145, StubType.GROUP_MEMBERSHIP_JOIN_APPROVAL_MODE);
        VALUES.put(146, StubType.INTEGRITY_UNLINK_PARENT_GROUP);
        VALUES.put(147, StubType.COMMUNITY_PARTICIPANT_PROMOTE);
        VALUES.put(148, StubType.COMMUNITY_PARTICIPANT_DEMOTE);
        VALUES.put(149, StubType.COMMUNITY_PARENT_GROUP_DELETED);
        VALUES.put(150, StubType.COMMUNITY_LINK_PARENT_GROUP_MEMBERSHIP_APPROVAL);
        VALUES.put(151, StubType.GROUP_PARTICIPANT_JOINED_GROUP_AND_PARENT_GROUP);
        VALUES.put(152, StubType.MASKED_THREAD_CREATED);
        VALUES.put(153, StubType.MASKED_THREAD_UNMASKED);
        VALUES.put(154, StubType.BIZ_CHAT_ASSIGNMENT);
        VALUES.put(155, StubType.CHAT_PSA);
        VALUES.put(156, StubType.CHAT_POLL_CREATION_MESSAGE);
        VALUES.put(157, StubType.CAG_MASKED_THREAD_CREATED);
        VALUES.put(158, StubType.COMMUNITY_PARENT_GROUP_SUBJECT_CHANGED);
        VALUES.put(159, StubType.CAG_INVITE_AUTO_ADD);
        VALUES.put(160, StubType.BIZ_CHAT_ASSIGNMENT_UNASSIGN);
        VALUES.put(161, StubType.CAG_INVITE_AUTO_JOINED);
    }

    public static Integer encode(StubType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static StubType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static StubType decode(int protoEnumIndex, StubType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(StubType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
