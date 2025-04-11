package it.auties.whatsapp.model.message.standard;

public class VideoMessageSimpleBuilder {
    private byte[] media;
    private java.lang.String mimeType;
    private java.lang.String caption;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public VideoMessageSimpleBuilder() {
    }

    public VideoMessageSimpleBuilder media(byte[] media) {
        this.media = media;
        return this;
    }

    public VideoMessageSimpleBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public VideoMessageSimpleBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public VideoMessageSimpleBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public VideoMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.VideoOrGifMessage build() {
        return it.auties.whatsapp.model.message.standard.VideoOrGifMessage.videoBuilder(media, mimeType, caption, thumbnail, contextInfo);
    }

}
