package it.auties.whatsapp.model.message.standard;

public class ContactsMessageBuilder {
    private java.lang.String name;
    private java.util.List<it.auties.whatsapp.model.message.standard.ContactMessage> contacts;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;

    public ContactsMessageBuilder() {
        name = null;
        contacts = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        contextInfo = null;
    }

    public ContactsMessageBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public ContactsMessageBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public ContactsMessageBuilder contacts(java.util.List<it.auties.whatsapp.model.message.standard.ContactMessage> contacts) {
        this.contacts = contacts;
        return this;
    }

    public ContactsMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.ContactsMessage build() {
        return new it.auties.whatsapp.model.message.standard.ContactsMessage(name, contacts, contextInfo);
    }

}
