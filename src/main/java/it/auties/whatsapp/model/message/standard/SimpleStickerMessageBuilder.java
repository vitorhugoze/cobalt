package it.auties.whatsapp.model.message.standard;

public class SimpleStickerMessageBuilder {
    private byte[] media;
    private java.lang.String mimeType;
    private byte[] thumbnail;
    private boolean animated;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public SimpleStickerMessageBuilder() {
    }

    public SimpleStickerMessageBuilder media(byte[] media) {
        this.media = media;
        return this;
    }

    public SimpleStickerMessageBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public SimpleStickerMessageBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public SimpleStickerMessageBuilder animated(boolean animated) {
        this.animated = animated;
        return this;
    }

    public SimpleStickerMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.StickerMessage build() {
        return it.auties.whatsapp.model.message.standard.StickerMessage.simpleBuilder(media, mimeType, thumbnail, animated, contextInfo);
    }

}
