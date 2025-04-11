package it.auties.whatsapp.model.sync;

public class InitialSecurityNotificationSettingSyncBuilder {
    private boolean securityNotificationEnabled;

    public InitialSecurityNotificationSettingSyncBuilder() {
        securityNotificationEnabled = false;
    }

    public InitialSecurityNotificationSettingSyncBuilder securityNotificationEnabled(boolean securityNotificationEnabled) {
        this.securityNotificationEnabled = securityNotificationEnabled;
        return this;
    }

    public it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync build() {
        return new it.auties.whatsapp.model.sync.InitialSecurityNotificationSettingSync(securityNotificationEnabled);
    }

}
