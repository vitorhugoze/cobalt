package it.auties.whatsapp.model.business;

public class BusinessVerifiedNameDetailsBuilder {
    private long serial;
    private java.lang.String issuer;
    private java.lang.String name;
    private java.util.List<it.auties.whatsapp.model.business.BusinessLocalizedName> localizedNames;
    private long issueTimeSeconds;

    public BusinessVerifiedNameDetailsBuilder() {
        serial = 0l;
        issuer = null;
        name = null;
        localizedNames = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        issueTimeSeconds = 0l;
    }

    public BusinessVerifiedNameDetailsBuilder serial(long serial) {
        this.serial = serial;
        return this;
    }

    public BusinessVerifiedNameDetailsBuilder issuer(it.auties.protobuf.model.ProtobufString issuer) {
        this.issuer = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(issuer);
        return this;
    }

    public BusinessVerifiedNameDetailsBuilder issuer(java.lang.String issuer) {
        this.issuer = issuer;
        return this;
    }

    public BusinessVerifiedNameDetailsBuilder name(it.auties.protobuf.model.ProtobufString name) {
        this.name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(name);
        return this;
    }

    public BusinessVerifiedNameDetailsBuilder name(java.lang.String name) {
        this.name = name;
        return this;
    }

    public BusinessVerifiedNameDetailsBuilder localizedNames(java.util.List<it.auties.whatsapp.model.business.BusinessLocalizedName> localizedNames) {
        this.localizedNames = localizedNames;
        return this;
    }

    public BusinessVerifiedNameDetailsBuilder issueTimeSeconds(long issueTimeSeconds) {
        this.issueTimeSeconds = issueTimeSeconds;
        return this;
    }

    public it.auties.whatsapp.model.business.BusinessVerifiedNameDetails build() {
        return new it.auties.whatsapp.model.business.BusinessVerifiedNameDetails(serial, issuer, name, localizedNames, issueTimeSeconds);
    }

}
