package it.auties.whatsapp.model.message.standard;

public class AudioMessageSimpleBuilder {
    private byte[] media;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.lang.String mimeType;
    private boolean voiceMessage;

    public AudioMessageSimpleBuilder() {
    }

    public AudioMessageSimpleBuilder media(byte[] media) {
        this.media = media;
        return this;
    }

    public AudioMessageSimpleBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public AudioMessageSimpleBuilder mimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public AudioMessageSimpleBuilder voiceMessage(boolean voiceMessage) {
        this.voiceMessage = voiceMessage;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.AudioMessage build() {
        return it.auties.whatsapp.model.message.standard.AudioMessage.customBuilder(media, contextInfo, mimeType, voiceMessage);
    }

}
