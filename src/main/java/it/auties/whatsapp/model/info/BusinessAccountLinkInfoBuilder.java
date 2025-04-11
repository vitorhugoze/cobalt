package it.auties.whatsapp.model.info;

public class BusinessAccountLinkInfoBuilder {
    private long businessId;
    private java.lang.String phoneNumber;
    private long issueTimeSeconds;
    private it.auties.whatsapp.model.info.BusinessAccountLinkInfo.HostStorageType hostStorage;
    private it.auties.whatsapp.model.info.BusinessAccountLinkInfo.AccountType accountType;

    public BusinessAccountLinkInfoBuilder() {
        businessId = 0l;
        phoneNumber = null;
        issueTimeSeconds = 0l;
        hostStorage = null;
        accountType = null;
    }

    public BusinessAccountLinkInfoBuilder businessId(long businessId) {
        this.businessId = businessId;
        return this;
    }

    public BusinessAccountLinkInfoBuilder phoneNumber(it.auties.protobuf.model.ProtobufString phoneNumber) {
        this.phoneNumber = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(phoneNumber);
        return this;
    }

    public BusinessAccountLinkInfoBuilder phoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public BusinessAccountLinkInfoBuilder issueTimeSeconds(long issueTimeSeconds) {
        this.issueTimeSeconds = issueTimeSeconds;
        return this;
    }

    public BusinessAccountLinkInfoBuilder hostStorage(it.auties.whatsapp.model.info.BusinessAccountLinkInfo.HostStorageType hostStorage) {
        this.hostStorage = hostStorage;
        return this;
    }

    public BusinessAccountLinkInfoBuilder accountType(it.auties.whatsapp.model.info.BusinessAccountLinkInfo.AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    public it.auties.whatsapp.model.info.BusinessAccountLinkInfo build() {
        return new it.auties.whatsapp.model.info.BusinessAccountLinkInfo(businessId, phoneNumber, issueTimeSeconds, hostStorage, accountType);
    }

}
