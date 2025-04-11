package it.auties.whatsapp.model.message.standard;

public class ImageMessageSimpleBuilder {
    private byte[] media;
    private java.lang.String mimeType;
    private java.lang.String caption;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public ImageMessageSimpleBuilder() {
    }

    public ImageMessageSimpleBuilder media(byte[] media) {
        this.media = media;
        return this;
    }

    public ImageMessageSimpleBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public ImageMessageSimpleBuilder caption(java.lang.String caption) {
        this.caption = caption;
        return this;
    }

    public ImageMessageSimpleBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public ImageMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.ImageMessage build() {
        return it.auties.whatsapp.model.message.standard.ImageMessage.simpleBuilder(media, mimeType, caption, thumbnail, contextInfo);
    }

}
