package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredDateTimeUnixEpochBuilder {
    private long timestampSeconds;

    public HighlyStructuredDateTimeUnixEpochBuilder() {
        timestampSeconds = 0l;
    }

    public HighlyStructuredDateTimeUnixEpochBuilder timestampSeconds(long timestampSeconds) {
        this.timestampSeconds = timestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpoch build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeUnixEpoch(timestampSeconds);
    }

}
