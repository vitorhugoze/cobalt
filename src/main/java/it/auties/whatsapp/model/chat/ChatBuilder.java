package it.auties.whatsapp.model.chat;

public class ChatBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private it.auties.whatsapp.util.ConcurrentLinkedSet<it.auties.whatsapp.model.sync.HistorySyncMessage> historySyncMessages;
    private it.auties.whatsapp.model.jid.Jid newJid;
    private it.auties.whatsapp.model.jid.Jid oldJid;
    private int unreadMessagesCount;
    private boolean endOfHistoryTransfer;
    private it.auties.whatsapp.model.chat.ChatEphemeralTimer ephemeralMessageDuration;
    private long ephemeralMessagesToggleTimeSeconds;
    private it.auties.whatsapp.model.chat.Chat.EndOfHistoryTransferType endOfHistoryTransferType;
    private long timestampSeconds;
    private java.lang.String name;
    private boolean notSpam;
    private boolean archived;
    private it.auties.whatsapp.model.chat.ChatDisappear disappearInitiator;
    private boolean markedAsUnread;
    private int pinnedTimestampSeconds;
    private it.auties.whatsapp.model.chat.ChatMute mute;
    private it.auties.whatsapp.model.chat.ChatWallpaper wallpaper;
    private it.auties.whatsapp.model.media.MediaVisibility mediaVisibility;
    private boolean suspended;
    private boolean terminated;
    private boolean support;
    private java.lang.String displayName;
    private it.auties.whatsapp.model.jid.Jid phoneJid;
    private boolean shareOwnPhoneNumber;
    private boolean pnhDuplicateLidThread;
    private it.auties.whatsapp.model.jid.Jid lid;
    private java.util.concurrent.ConcurrentHashMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.contact.ContactStatus> presences;

    public ChatBuilder() {
        jid = null;
        historySyncMessages = new it.auties.whatsapp.util.ConcurrentLinkedSet();
        newJid = null;
        oldJid = null;
        unreadMessagesCount = 0;
        endOfHistoryTransfer = false;
        ephemeralMessageDuration = null;
        ephemeralMessagesToggleTimeSeconds = 0l;
        endOfHistoryTransferType = null;
        timestampSeconds = 0l;
        name = null;
        notSpam = false;
        archived = false;
        disappearInitiator = null;
        markedAsUnread = false;
        pinnedTimestampSeconds = 0;
        mute = null;
        wallpaper = null;
        mediaVisibility = null;
        suspended = false;
        terminated = false;
        support = false;
        displayName = null;
        phoneJid = null;
        shareOwnPhoneNumber = false;
        pnhDuplicateLidThread = false;
        lid = null;
        presences = new java.util.concurrent.ConcurrentHashMap();
    }

    public ChatBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public ChatBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public ChatBuilder historySyncMessages(it.auties.whatsapp.util.ConcurrentLinkedSet<it.auties.whatsapp.model.sync.HistorySyncMessage> historySyncMessages) {
        this.historySyncMessages = historySyncMessages;
        return this;
    }

    public ChatBuilder newJid(it.auties.protobuf.model.ProtobufString newJid) {
        this.newJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(newJid));
        return this;
    }

    public ChatBuilder newJid(it.auties.whatsapp.model.jid.Jid newJid) {
        this.newJid = newJid;
        return this;
    }

    public ChatBuilder oldJid(it.auties.protobuf.model.ProtobufString oldJid) {
        this.oldJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(oldJid));
        return this;
    }

    public ChatBuilder oldJid(it.auties.whatsapp.model.jid.Jid oldJid) {
        this.oldJid = oldJid;
        return this;
    }

    public ChatBuilder unreadMessagesCount(int unreadMessagesCount) {
        this.unreadMessagesCount = unreadMessagesCount;
        return this;
    }

    public ChatBuilder endOfHistoryTransfer(boolean endOfHistoryTransfer) {
        this.endOfHistoryTransfer = endOfHistoryTransfer;
        return this;
    }

    public ChatBuilder ephemeralMessageDuration(it.auties.whatsapp.model.chat.ChatEphemeralTimer ephemeralMessageDuration) {
        this.ephemeralMessageDuration = ephemeralMessageDuration;
        return this;
    }

    public ChatBuilder ephemeralMessagesToggleTimeSeconds(long ephemeralMessagesToggleTimeSeconds) {
        this.ephemeralMessagesToggleTimeSeconds = ephemeralMessagesToggleTimeSeconds;
        return this;
    }

    public ChatBuilder endOfHistoryTransferType(it.auties.whatsapp.model.chat.Chat.EndOfHistoryTransferType endOfHistoryTransferType) {
        this.endOfHistoryTransferType = endOfHistoryTransferType;
        return this;
    }

    public ChatBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public ChatBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public ChatBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public ChatBuilder notSpam(boolean notSpam) {
        this.notSpam = notSpam;
        return this;
    }

    public ChatBuilder archived(boolean archived) {
        this.archived = archived;
        return this;
    }

    public ChatBuilder disappearInitiator(it.auties.whatsapp.model.chat.ChatDisappear disappearInitiator) {
        this.disappearInitiator = disappearInitiator;
        return this;
    }

    public ChatBuilder markedAsUnread(boolean markedAsUnread) {
        this.markedAsUnread = markedAsUnread;
        return this;
    }

    public ChatBuilder pinnedTimestampSeconds(int pinnedTimestampSeconds) {
        this.pinnedTimestampSeconds = pinnedTimestampSeconds;
        return this;
    }

    public ChatBuilder mute(it.auties.whatsapp.model.chat.ChatMute mute) {
        this.mute = mute;
        return this;
    }

    public ChatBuilder wallpaper(it.auties.whatsapp.model.chat.ChatWallpaper wallpaper) {
        this.wallpaper = wallpaper;
        return this;
    }

    public ChatBuilder mediaVisibility(it.auties.whatsapp.model.media.MediaVisibility mediaVisibility) {
        this.mediaVisibility = mediaVisibility;
        return this;
    }

    public ChatBuilder suspended(boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    public ChatBuilder terminated(boolean terminated) {
        this.terminated = terminated;
        return this;
    }

    public ChatBuilder support(boolean support) {
        this.support = support;
        return this;
    }

    public ChatBuilder displayName(it.auties.protobuf.model.ProtobufString displayName) {
        this.displayName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(displayName);
        return this;
    }

    public ChatBuilder displayName(java.lang.String displayName) {
        this.displayName = displayName;
        return this;
    }

    public ChatBuilder phoneJid(it.auties.protobuf.model.ProtobufString phoneJid) {
        this.phoneJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(phoneJid));
        return this;
    }

    public ChatBuilder phoneJid(it.auties.whatsapp.model.jid.Jid phoneJid) {
        this.phoneJid = phoneJid;
        return this;
    }

    public ChatBuilder shareOwnPhoneNumber(boolean shareOwnPhoneNumber) {
        this.shareOwnPhoneNumber = shareOwnPhoneNumber;
        return this;
    }

    public ChatBuilder pnhDuplicateLidThread(boolean pnhDuplicateLidThread) {
        this.pnhDuplicateLidThread = pnhDuplicateLidThread;
        return this;
    }

    public ChatBuilder lid(it.auties.protobuf.model.ProtobufString lid) {
        this.lid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(lid));
        return this;
    }

    public ChatBuilder lid(it.auties.whatsapp.model.jid.Jid lid) {
        this.lid = lid;
        return this;
    }

    public ChatBuilder presences(java.util.concurrent.ConcurrentHashMap<it.auties.whatsapp.model.jid.Jid,it.auties.whatsapp.model.contact.ContactStatus> presences) {
        this.presences = presences;
        return this;
    }

    public it.auties.whatsapp.model.chat.Chat build() {
        return new it.auties.whatsapp.model.chat.Chat(jid, historySyncMessages, newJid, oldJid, unreadMessagesCount, endOfHistoryTransfer, ephemeralMessageDuration, ephemeralMessagesToggleTimeSeconds, endOfHistoryTransferType, timestampSeconds, name, notSpam, archived, disappearInitiator, markedAsUnread, pinnedTimestampSeconds, mute, wallpaper, mediaVisibility, suspended, terminated, support, displayName, phoneJid, shareOwnPhoneNumber, pnhDuplicateLidThread, lid, presences);
    }

}
