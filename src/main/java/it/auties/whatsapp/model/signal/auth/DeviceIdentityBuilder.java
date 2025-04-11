package it.auties.whatsapp.model.signal.auth;

public class DeviceIdentityBuilder {
    private int rawId;
    private long timestamp;
    private int keyIndex;

    public DeviceIdentityBuilder() {
        rawId = 0;
        timestamp = 0l;
        keyIndex = 0;
    }

    public DeviceIdentityBuilder rawId(int rawId) {
        this.rawId = rawId;
        return this;
    }

    public DeviceIdentityBuilder timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public DeviceIdentityBuilder keyIndex(int keyIndex) {
        this.keyIndex = keyIndex;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.DeviceIdentity build() {
        return new it.auties.whatsapp.model.signal.auth.DeviceIdentity(rawId, timestamp, keyIndex);
    }

}
