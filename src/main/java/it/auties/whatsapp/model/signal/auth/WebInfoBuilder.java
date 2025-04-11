package it.auties.whatsapp.model.signal.auth;

public class WebInfoBuilder {
    private java.lang.String refToken;
    private java.lang.String version;
    private it.auties.whatsapp.model.signal.auth.WebPayload webPayload;
    private it.auties.whatsapp.model.signal.auth.WebInfo.Platform webSubPlatform;

    public WebInfoBuilder() {
        refToken = null;
        version = null;
        webPayload = null;
        webSubPlatform = null;
    }

    public WebInfoBuilder refToken(it.auties.protobuf.model.ProtobufString refToken) {
        this.refToken = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(refToken);
        return this;
    }

    public WebInfoBuilder refToken(java.lang.String refToken) {
        this.refToken = refToken;
        return this;
    }

    public WebInfoBuilder version(it.auties.protobuf.model.ProtobufString version) {
        this.version = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(version);
        return this;
    }

    public WebInfoBuilder version(java.lang.String version) {
        this.version = version;
        return this;
    }

    public WebInfoBuilder webPayload(it.auties.whatsapp.model.signal.auth.WebPayload webPayload) {
        this.webPayload = webPayload;
        return this;
    }

    public WebInfoBuilder webSubPlatform(it.auties.whatsapp.model.signal.auth.WebInfo.Platform webSubPlatform) {
        this.webSubPlatform = webSubPlatform;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.WebInfo build() {
        return new it.auties.whatsapp.model.signal.auth.WebInfo(refToken, version, webPayload, webSubPlatform);
    }

}
