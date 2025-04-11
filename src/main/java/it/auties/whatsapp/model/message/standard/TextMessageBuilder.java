package it.auties.whatsapp.model.message.standard;

public class TextMessageBuilder {
    private java.lang.String text;
    private java.lang.String matchedText;
    private java.lang.String canonicalUrl;
    private java.lang.String description;
    private java.lang.String title;
    private java.lang.Integer textArgb;
    private java.lang.Integer backgroundArgb;
    private it.auties.whatsapp.model.message.standard.TextMessage.FontType font;
    private it.auties.whatsapp.model.message.standard.TextMessage.PreviewType previewType;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private boolean doNotPlayInline;
    private java.lang.String thumbnailDirectPath;
    private byte[] thumbnailSha256;
    private byte[] thumbnailEncSha256;
    private byte[] mediaKey;
    private java.lang.Long mediaKeyTimestampSeconds;
    private java.lang.Integer thumbnailHeight;
    private java.lang.Integer thumbnailWidth;
    private it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType inviteLinkGroupType;
    private java.lang.String inviteLinkParentGroupSubjectV2;
    private byte[] inviteLinkParentGroupThumbnailV2;
    private it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType inviteLinkGroupTypeV2;
    private boolean viewOnce;

    public TextMessageBuilder() {
        text = null;
        matchedText = null;
        canonicalUrl = null;
        description = null;
        title = null;
        textArgb = null;
        backgroundArgb = null;
        font = null;
        previewType = null;
        thumbnail = null;
        contextInfo = null;
        doNotPlayInline = false;
        thumbnailDirectPath = null;
        thumbnailSha256 = null;
        thumbnailEncSha256 = null;
        mediaKey = null;
        mediaKeyTimestampSeconds = null;
        thumbnailHeight = null;
        thumbnailWidth = null;
        inviteLinkGroupType = null;
        inviteLinkParentGroupSubjectV2 = null;
        inviteLinkParentGroupThumbnailV2 = null;
        inviteLinkGroupTypeV2 = null;
        viewOnce = false;
    }

    public TextMessageBuilder text(it.auties.protobuf.model.ProtobufString text) {
        this.text = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(text);
        return this;
    }

    public TextMessageBuilder text(java.lang.String text) {
        this.text = text;
        return this;
    }

    public TextMessageBuilder matchedText(it.auties.protobuf.model.ProtobufString matchedText) {
        this.matchedText = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(matchedText);
        return this;
    }

    public TextMessageBuilder matchedText(java.lang.String matchedText) {
        this.matchedText = matchedText;
        return this;
    }

    public TextMessageBuilder canonicalUrl(it.auties.protobuf.model.ProtobufString canonicalUrl) {
        this.canonicalUrl = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(canonicalUrl);
        return this;
    }

    public TextMessageBuilder canonicalUrl(java.lang.String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
        return this;
    }

    public TextMessageBuilder description(it.auties.protobuf.model.ProtobufString description) {
        this.description = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(description);
        return this;
    }

    public TextMessageBuilder description(java.lang.String description) {
        this.description = description;
        return this;
    }

    public TextMessageBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public TextMessageBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public TextMessageBuilder textArgb(java.lang.Integer textArgb) {
        this.textArgb = textArgb;
        return this;
    }

    public TextMessageBuilder backgroundArgb(java.lang.Integer backgroundArgb) {
        this.backgroundArgb = backgroundArgb;
        return this;
    }

    public TextMessageBuilder font(it.auties.whatsapp.model.message.standard.TextMessage.FontType font) {
        this.font = font;
        return this;
    }

    public TextMessageBuilder previewType(it.auties.whatsapp.model.message.standard.TextMessage.PreviewType previewType) {
        this.previewType = previewType;
        return this;
    }

    public TextMessageBuilder thumbnail(java.nio.ByteBuffer thumbnail) {
        this.thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnail);
        return this;
    }

    public TextMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public TextMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public TextMessageBuilder doNotPlayInline(boolean doNotPlayInline) {
        this.doNotPlayInline = doNotPlayInline;
        return this;
    }

    public TextMessageBuilder thumbnailDirectPath(it.auties.protobuf.model.ProtobufString thumbnailDirectPath) {
        this.thumbnailDirectPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailDirectPath);
        return this;
    }

    public TextMessageBuilder thumbnailDirectPath(java.lang.String thumbnailDirectPath) {
        this.thumbnailDirectPath = thumbnailDirectPath;
        return this;
    }

    public TextMessageBuilder thumbnailSha256(java.nio.ByteBuffer thumbnailSha256) {
        this.thumbnailSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailSha256);
        return this;
    }

    public TextMessageBuilder thumbnailSha256(byte[] thumbnailSha256) {
        this.thumbnailSha256 = thumbnailSha256;
        return this;
    }

    public TextMessageBuilder thumbnailEncSha256(java.nio.ByteBuffer thumbnailEncSha256) {
        this.thumbnailEncSha256 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(thumbnailEncSha256);
        return this;
    }

    public TextMessageBuilder thumbnailEncSha256(byte[] thumbnailEncSha256) {
        this.thumbnailEncSha256 = thumbnailEncSha256;
        return this;
    }

    public TextMessageBuilder mediaKey(java.nio.ByteBuffer mediaKey) {
        this.mediaKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(mediaKey);
        return this;
    }

    public TextMessageBuilder mediaKey(byte[] mediaKey) {
        this.mediaKey = mediaKey;
        return this;
    }

    public TextMessageBuilder mediaKeyTimestampSeconds(java.lang.Long mediaKeyTimestampSeconds) {
        this.mediaKeyTimestampSeconds = mediaKeyTimestampSeconds;
        return this;
    }

    public TextMessageBuilder thumbnailHeight(java.lang.Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }

    public TextMessageBuilder thumbnailWidth(java.lang.Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public TextMessageBuilder inviteLinkGroupType(it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType inviteLinkGroupType) {
        this.inviteLinkGroupType = inviteLinkGroupType;
        return this;
    }

    public TextMessageBuilder inviteLinkParentGroupSubjectV2(it.auties.protobuf.model.ProtobufString inviteLinkParentGroupSubjectV2) {
        this.inviteLinkParentGroupSubjectV2 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(inviteLinkParentGroupSubjectV2);
        return this;
    }

    public TextMessageBuilder inviteLinkParentGroupSubjectV2(java.lang.String inviteLinkParentGroupSubjectV2) {
        this.inviteLinkParentGroupSubjectV2 = inviteLinkParentGroupSubjectV2;
        return this;
    }

    public TextMessageBuilder inviteLinkParentGroupThumbnailV2(java.nio.ByteBuffer inviteLinkParentGroupThumbnailV2) {
        this.inviteLinkParentGroupThumbnailV2 = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(inviteLinkParentGroupThumbnailV2);
        return this;
    }

    public TextMessageBuilder inviteLinkParentGroupThumbnailV2(byte[] inviteLinkParentGroupThumbnailV2) {
        this.inviteLinkParentGroupThumbnailV2 = inviteLinkParentGroupThumbnailV2;
        return this;
    }

    public TextMessageBuilder inviteLinkGroupTypeV2(it.auties.whatsapp.model.message.standard.TextMessage.InviteLinkGroupType inviteLinkGroupTypeV2) {
        this.inviteLinkGroupTypeV2 = inviteLinkGroupTypeV2;
        return this;
    }

    public TextMessageBuilder viewOnce(boolean viewOnce) {
        this.viewOnce = viewOnce;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.TextMessage build() {
        return new it.auties.whatsapp.model.message.standard.TextMessage(text, matchedText, canonicalUrl, description, title, textArgb, backgroundArgb, font, previewType, thumbnail, contextInfo, doNotPlayInline, thumbnailDirectPath, thumbnailSha256, thumbnailEncSha256, mediaKey, mediaKeyTimestampSeconds, thumbnailHeight, thumbnailWidth, inviteLinkGroupType, inviteLinkParentGroupSubjectV2, inviteLinkParentGroupThumbnailV2, inviteLinkGroupTypeV2, viewOnce);
    }

}
