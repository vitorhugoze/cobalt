package it.auties.whatsapp.model.signal.auth;

public class DNSSourceBuilder {
    private it.auties.whatsapp.model.signal.auth.DNSSource.ResolutionMethod dnsMethod;
    private boolean appCached;

    public DNSSourceBuilder() {
        dnsMethod = null;
        appCached = false;
    }

    public DNSSourceBuilder dnsMethod(it.auties.whatsapp.model.signal.auth.DNSSource.ResolutionMethod dnsMethod) {
        this.dnsMethod = dnsMethod;
        return this;
    }

    public DNSSourceBuilder appCached(boolean appCached) {
        this.appCached = appCached;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.DNSSource build() {
        return new it.auties.whatsapp.model.signal.auth.DNSSource(dnsMethod, appCached);
    }

}
