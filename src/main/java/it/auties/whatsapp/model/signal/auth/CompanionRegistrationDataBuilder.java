package it.auties.whatsapp.model.signal.auth;

public class CompanionRegistrationDataBuilder {
    private byte[] eRegid;
    private byte[] eKeytype;
    private byte[] eIdent;
    private byte[] eSkeyId;
    private byte[] eSkeyVal;
    private byte[] eSkeySig;
    private byte[] buildHash;
    private byte[] companionProps;

    public CompanionRegistrationDataBuilder() {
        eRegid = null;
        eKeytype = null;
        eIdent = null;
        eSkeyId = null;
        eSkeyVal = null;
        eSkeySig = null;
        buildHash = null;
        companionProps = null;
    }

    public CompanionRegistrationDataBuilder eRegid(java.nio.ByteBuffer eRegid) {
        this.eRegid = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(eRegid);
        return this;
    }

    public CompanionRegistrationDataBuilder eRegid(byte[] eRegid) {
        this.eRegid = eRegid;
        return this;
    }

    public CompanionRegistrationDataBuilder eKeytype(java.nio.ByteBuffer eKeytype) {
        this.eKeytype = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(eKeytype);
        return this;
    }

    public CompanionRegistrationDataBuilder eKeytype(byte[] eKeytype) {
        this.eKeytype = eKeytype;
        return this;
    }

    public CompanionRegistrationDataBuilder eIdent(java.nio.ByteBuffer eIdent) {
        this.eIdent = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(eIdent);
        return this;
    }

    public CompanionRegistrationDataBuilder eIdent(byte[] eIdent) {
        this.eIdent = eIdent;
        return this;
    }

    public CompanionRegistrationDataBuilder eSkeyId(java.nio.ByteBuffer eSkeyId) {
        this.eSkeyId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(eSkeyId);
        return this;
    }

    public CompanionRegistrationDataBuilder eSkeyId(byte[] eSkeyId) {
        this.eSkeyId = eSkeyId;
        return this;
    }

    public CompanionRegistrationDataBuilder eSkeyVal(java.nio.ByteBuffer eSkeyVal) {
        this.eSkeyVal = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(eSkeyVal);
        return this;
    }

    public CompanionRegistrationDataBuilder eSkeyVal(byte[] eSkeyVal) {
        this.eSkeyVal = eSkeyVal;
        return this;
    }

    public CompanionRegistrationDataBuilder eSkeySig(java.nio.ByteBuffer eSkeySig) {
        this.eSkeySig = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(eSkeySig);
        return this;
    }

    public CompanionRegistrationDataBuilder eSkeySig(byte[] eSkeySig) {
        this.eSkeySig = eSkeySig;
        return this;
    }

    public CompanionRegistrationDataBuilder buildHash(java.nio.ByteBuffer buildHash) {
        this.buildHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(buildHash);
        return this;
    }

    public CompanionRegistrationDataBuilder buildHash(byte[] buildHash) {
        this.buildHash = buildHash;
        return this;
    }

    public CompanionRegistrationDataBuilder companionProps(java.nio.ByteBuffer companionProps) {
        this.companionProps = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(companionProps);
        return this;
    }

    public CompanionRegistrationDataBuilder companionProps(byte[] companionProps) {
        this.companionProps = companionProps;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.CompanionRegistrationData build() {
        return new it.auties.whatsapp.model.signal.auth.CompanionRegistrationData(eRegid, eKeytype, eIdent, eSkeyId, eSkeyVal, eSkeySig, buildHash, companionProps);
    }

}
