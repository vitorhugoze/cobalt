package it.auties.whatsapp.model.contact;

public class ContactBuilder {
    private it.auties.whatsapp.model.jid.Jid jid;
    private java.lang.String chosenName;
    private java.lang.String fullName;
    private java.lang.String shortName;
    private it.auties.whatsapp.model.contact.ContactStatus lastKnownPresence;
    private java.lang.Long lastSeenSeconds;
    private boolean blocked;

    public ContactBuilder() {
        jid = null;
        chosenName = null;
        fullName = null;
        shortName = null;
        lastKnownPresence = null;
        lastSeenSeconds = null;
        blocked = false;
    }

    public ContactBuilder jid(it.auties.protobuf.model.ProtobufString jid) {
        this.jid = it.auties.whatsapp.model.jid.Jid.of(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(jid));
        return this;
    }

    public ContactBuilder jid(it.auties.whatsapp.model.jid.Jid jid) {
        this.jid = jid;
        return this;
    }

    public ContactBuilder chosenName(it.auties.protobuf.model.ProtobufString chosenName) {
        this.chosenName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(chosenName);
        return this;
    }

    public ContactBuilder chosenName(java.lang.String chosenName) {
        this.chosenName = chosenName;
        return this;
    }

    public ContactBuilder fullName(it.auties.protobuf.model.ProtobufString fullName) {
        this.fullName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fullName);
        return this;
    }

    public ContactBuilder fullName(java.lang.String fullName) {
        this.fullName = fullName;
        return this;
    }

    public ContactBuilder shortName(it.auties.protobuf.model.ProtobufString shortName) {
        this.shortName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(shortName);
        return this;
    }

    public ContactBuilder shortName(java.lang.String shortName) {
        this.shortName = shortName;
        return this;
    }

    public ContactBuilder lastKnownPresence(it.auties.whatsapp.model.contact.ContactStatus lastKnownPresence) {
        this.lastKnownPresence = lastKnownPresence;
        return this;
    }

    public ContactBuilder lastSeenSeconds(java.lang.Long lastSeenSeconds) {
        this.lastSeenSeconds = lastSeenSeconds;
        return this;
    }

    public ContactBuilder blocked(boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    public it.auties.whatsapp.model.contact.Contact build() {
        return new it.auties.whatsapp.model.contact.Contact(jid, chosenName, fullName, shortName, lastKnownPresence, lastSeenSeconds, blocked);
    }

}
