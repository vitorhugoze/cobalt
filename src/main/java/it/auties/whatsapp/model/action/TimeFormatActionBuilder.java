package it.auties.whatsapp.model.action;

public class TimeFormatActionBuilder {
    private boolean twentyFourHourFormatEnabled;

    public TimeFormatActionBuilder() {
        twentyFourHourFormatEnabled = false;
    }

    public TimeFormatActionBuilder twentyFourHourFormatEnabled(boolean twentyFourHourFormatEnabled) {
        this.twentyFourHourFormatEnabled = twentyFourHourFormatEnabled;
        return this;
    }

    public it.auties.whatsapp.model.action.TimeFormatAction build() {
        return new it.auties.whatsapp.model.action.TimeFormatAction(twentyFourHourFormatEnabled);
    }

}
