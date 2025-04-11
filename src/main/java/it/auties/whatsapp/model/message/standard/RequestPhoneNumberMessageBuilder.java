package it.auties.whatsapp.model.message.standard;

public class RequestPhoneNumberMessageBuilder {
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public RequestPhoneNumberMessageBuilder() {
        contextInfo = null;
    }

    public RequestPhoneNumberMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessage build() {
        return new it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessage(contextInfo);
    }

}
