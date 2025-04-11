package it.auties.whatsapp.model.setting;

public class EphemeralSettingsBuilder {
    private int duration;
    private long timestampSeconds;

    public EphemeralSettingsBuilder() {
        duration = 0;
        timestampSeconds = 0l;
    }

    public EphemeralSettingsBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public EphemeralSettingsBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.setting.EphemeralSettings build() {
        return new it.auties.whatsapp.model.setting.EphemeralSettings(duration, timestampSeconds);
    }

}
