package it.auties.whatsapp.model.signal.auth;

public class VersionBuilder {
    private java.lang.Integer primary;
    private java.lang.Integer secondary;
    private java.lang.Integer tertiary;
    private java.lang.Integer quaternary;
    private java.lang.Integer quinary;

    public VersionBuilder() {
        primary = null;
        secondary = null;
        tertiary = null;
        quaternary = null;
        quinary = null;
    }

    public VersionBuilder primary(java.lang.Integer primary) {
        this.primary = primary;
        return this;
    }

    public VersionBuilder secondary(java.lang.Integer secondary) {
        this.secondary = secondary;
        return this;
    }

    public VersionBuilder tertiary(java.lang.Integer tertiary) {
        this.tertiary = tertiary;
        return this;
    }

    public VersionBuilder quaternary(java.lang.Integer quaternary) {
        this.quaternary = quaternary;
        return this;
    }

    public VersionBuilder quinary(java.lang.Integer quinary) {
        this.quinary = quinary;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.Version build() {
        return new it.auties.whatsapp.model.signal.auth.Version(primary, secondary, tertiary, quaternary, quinary);
    }

}
