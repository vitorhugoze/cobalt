package it.auties.whatsapp.model.message.standard;

public class NewsletterAdminInviteMessageBuilder {
    private it.auties.whatsapp.model.jid.Jid newsletterJid;
    private java.lang.String newsletterName;
    private byte[] jpegThumbnail;
    private java.lang.String caption;
    private long inviteExpirationTimestampSeconds;

    public NewsletterAdminInviteMessageBuilder() {
        newsletterJid = null;
        newsletterName = null;
        jpegThumbnail = null;
        caption = null;
        inviteExpirationTimestampSeconds = 0l;
    }

    public NewsletterAdminInviteMessageBuilder newsletterJid(it.auties.protobuf.model.ProtobufString newsletterJid) {
        this.newsletterJid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(newsletterJid));
        return this;
    }

    public NewsletterAdminInviteMessageBuilder newsletterJid(it.auties.whatsapp.model.jid.Jid newsletterJid) {
        this.newsletterJid = newsletterJid;
        return this;
    }

    public NewsletterAdminInviteMessageBuilder newsletterName(it.auties.protobuf.model.ProtobufString newsletterName) {
        this.newsletterName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(newsletterName);
        return this;
    }

    public NewsletterAdminInviteMessageBuilder newsletterName(java.lang.String newsletterName) {
        this.newsletterName = newsletterName;
        return this;
    }

    public NewsletterAdminInviteMessageBuilder jpegThumbnail(java.nio.ByteBuffer jpegThumbnail) {
        this.jpegThumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jpegThumbnail);
        return this;
    }

    public NewsletterAdminInviteMessageBuilder jpegThumbnail(byte[] jpegThumbnail) {
        this.jpegThumbnail = jpegThumbnail;
        return this;
    }

    public NewsletterAdminInviteMessageBuilder caption(it.auties.protobuf.model.ProtobufString caption) {
        this.caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(caption);
        return this;
    }

    public NewsletterAdminInviteMessageBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public NewsletterAdminInviteMessageBuilder inviteExpirationTimestampSeconds(long inviteExpirationTimestampSeconds) {
        this.inviteExpirationTimestampSeconds = inviteExpirationTimestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage build() {
        return new it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage(newsletterJid, newsletterName, jpegThumbnail, caption, inviteExpirationTimestampSeconds);
    }

}
