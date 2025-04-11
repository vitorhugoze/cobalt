package it.auties.whatsapp.model.message.standard;

public class DocumentMessageSimpleBuilder {
    private byte[] media;
    private java.lang.String fileName;
    private java.lang.String mimeType;
    private java.lang.String title;
    private int pageCount;
    private byte[] thumbnail;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public DocumentMessageSimpleBuilder() {
    }

    public DocumentMessageSimpleBuilder media(byte[] media) {
        this.media = media;
        return this;
    }

    public DocumentMessageSimpleBuilder fileName(java.lang.String fileName) {
        this.fileName = fileName;
        return this;
    }

    public DocumentMessageSimpleBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public DocumentMessageSimpleBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public DocumentMessageSimpleBuilder pageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public DocumentMessageSimpleBuilder thumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public DocumentMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.DocumentMessage build() {
        return it.auties.whatsapp.model.message.standard.DocumentMessage.customBuilder(media, fileName, mimeType, title, pageCount, thumbnail, contextInfo);
    }

}
