package it.auties.whatsapp.model.message.standard;

public class GifMessageSimpleBuilder {
    private byte[] media;
    private java.lang.String mimeType;
    private java.lang.String caption;
    private it.auties.whatsapp.model.message.standard.VideoOrGifMessage.Attribution gifAttribution;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public GifMessageSimpleBuilder() {
    }

    public GifMessageSimpleBuilder media(byte[] media) {
        this.media = media;
        return this;
    }

    public GifMessageSimpleBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public GifMessageSimpleBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public GifMessageSimpleBuilder gifAttribution(it.auties.whatsapp.model.message.standard.VideoOrGifMessage.Attribution gifAttribution) {
        this.gifAttribution = gifAttribution;
        return this;
    }

    public GifMessageSimpleBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public GifMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.VideoOrGifMessage build() {
        return it.auties.whatsapp.model.message.standard.VideoOrGifMessage.gifBuilder(media, mimeType, caption, gifAttribution, thumbnail, contextInfo);
    }

}
