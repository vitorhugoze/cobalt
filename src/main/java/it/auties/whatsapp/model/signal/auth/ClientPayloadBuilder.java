package it.auties.whatsapp.model.signal.auth;

public class ClientPayloadBuilder {
    private java.lang.Long username;
    private java.lang.Boolean passive;
    private it.auties.whatsapp.model.signal.auth.UserAgent userAgent;
    private it.auties.whatsapp.model.signal.auth.WebInfo webInfo;
    private java.lang.String pushName;
    private java.lang.Integer sessionId;
    private java.lang.Boolean shortConnect;
    private it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectType connectType;
    private it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectReason connectReason;
    private java.util.List<java.lang.Integer> shards;
    private it.auties.whatsapp.model.signal.auth.DNSSource dnsSource;
    private java.lang.Integer connectAttemptCount;
    private java.lang.Integer device;
    private it.auties.whatsapp.model.signal.auth.CompanionRegistrationData regData;
    private it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadProduct product;
    private byte[] fbCat;
    private byte[] fbUserAgent;
    private java.lang.Boolean oc;
    private java.lang.Integer lc;
    private it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadIOSAppExtension iosAppExtension;
    private java.lang.Long fbAppId;
    private byte[] fbDeviceId;
    private java.lang.Boolean pull;

    public ClientPayloadBuilder() {
        username = null;
        passive = null;
        userAgent = null;
        webInfo = null;
        pushName = null;
        sessionId = null;
        shortConnect = null;
        connectType = null;
        connectReason = null;
        shards = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        dnsSource = null;
        connectAttemptCount = null;
        device = null;
        regData = null;
        product = null;
        fbCat = null;
        fbUserAgent = null;
        oc = null;
        lc = null;
        iosAppExtension = null;
        fbAppId = null;
        fbDeviceId = null;
        pull = null;
    }

    public ClientPayloadBuilder username(java.lang.Long username) {
        this.username = username;
        return this;
    }

    public ClientPayloadBuilder passive(java.lang.Boolean passive) {
        this.passive = passive;
        return this;
    }

    public ClientPayloadBuilder userAgent(it.auties.whatsapp.model.signal.auth.UserAgent userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public ClientPayloadBuilder webInfo(it.auties.whatsapp.model.signal.auth.WebInfo webInfo) {
        this.webInfo = webInfo;
        return this;
    }

    public ClientPayloadBuilder pushName(it.auties.protobuf.model.ProtobufString pushName) {
        this.pushName = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(pushName);
        return this;
    }

    public ClientPayloadBuilder pushName(java.lang.String pushName) {
        this.pushName = pushName;
        return this;
    }

    public ClientPayloadBuilder sessionId(java.lang.Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public ClientPayloadBuilder shortConnect(java.lang.Boolean shortConnect) {
        this.shortConnect = shortConnect;
        return this;
    }

    public ClientPayloadBuilder connectType(it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectType connectType) {
        this.connectType = connectType;
        return this;
    }

    public ClientPayloadBuilder connectReason(it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadConnectReason connectReason) {
        this.connectReason = connectReason;
        return this;
    }

    public ClientPayloadBuilder shards(java.util.List<java.lang.Integer> shards) {
        this.shards = shards;
        return this;
    }

    public ClientPayloadBuilder dnsSource(it.auties.whatsapp.model.signal.auth.DNSSource dnsSource) {
        this.dnsSource = dnsSource;
        return this;
    }

    public ClientPayloadBuilder connectAttemptCount(java.lang.Integer connectAttemptCount) {
        this.connectAttemptCount = connectAttemptCount;
        return this;
    }

    public ClientPayloadBuilder device(java.lang.Integer device) {
        this.device = device;
        return this;
    }

    public ClientPayloadBuilder regData(it.auties.whatsapp.model.signal.auth.CompanionRegistrationData regData) {
        this.regData = regData;
        return this;
    }

    public ClientPayloadBuilder product(it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadProduct product) {
        this.product = product;
        return this;
    }

    public ClientPayloadBuilder fbCat(java.nio.ByteBuffer fbCat) {
        this.fbCat = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fbCat);
        return this;
    }

    public ClientPayloadBuilder fbCat(byte[] fbCat) {
        this.fbCat = fbCat;
        return this;
    }

    public ClientPayloadBuilder fbUserAgent(java.nio.ByteBuffer fbUserAgent) {
        this.fbUserAgent = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fbUserAgent);
        return this;
    }

    public ClientPayloadBuilder fbUserAgent(byte[] fbUserAgent) {
        this.fbUserAgent = fbUserAgent;
        return this;
    }

    public ClientPayloadBuilder oc(java.lang.Boolean oc) {
        this.oc = oc;
        return this;
    }

    public ClientPayloadBuilder lc(java.lang.Integer lc) {
        this.lc = lc;
        return this;
    }

    public ClientPayloadBuilder iosAppExtension(it.auties.whatsapp.model.signal.auth.ClientPayload.ClientPayloadIOSAppExtension iosAppExtension) {
        this.iosAppExtension = iosAppExtension;
        return this;
    }

    public ClientPayloadBuilder fbAppId(java.lang.Long fbAppId) {
        this.fbAppId = fbAppId;
        return this;
    }

    public ClientPayloadBuilder fbDeviceId(java.nio.ByteBuffer fbDeviceId) {
        this.fbDeviceId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(fbDeviceId);
        return this;
    }

    public ClientPayloadBuilder fbDeviceId(byte[] fbDeviceId) {
        this.fbDeviceId = fbDeviceId;
        return this;
    }

    public ClientPayloadBuilder pull(java.lang.Boolean pull) {
        this.pull = pull;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.ClientPayload build() {
        return new it.auties.whatsapp.model.signal.auth.ClientPayload(username, passive, userAgent, webInfo, pushName, sessionId, shortConnect, connectType, connectReason, shards, dnsSource, connectAttemptCount, device, regData, product, fbCat, fbUserAgent, oc, lc, iosAppExtension, fbAppId, fbDeviceId, pull);
    }

}
