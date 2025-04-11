package it.auties.whatsapp.model.sync;

public class KeyExpirationBuilder {
    private java.lang.Integer expiredKeyEpoch;

    public KeyExpirationBuilder() {
        expiredKeyEpoch = null;
    }

    public KeyExpirationBuilder expiredKeyEpoch(java.lang.Integer expiredKeyEpoch) {
        this.expiredKeyEpoch = expiredKeyEpoch;
        return this;
    }

    public it.auties.whatsapp.model.sync.KeyExpiration build() {
        return new it.auties.whatsapp.model.sync.KeyExpiration(expiredKeyEpoch);
    }

}
