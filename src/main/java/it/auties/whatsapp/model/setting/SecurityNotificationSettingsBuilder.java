package it.auties.whatsapp.model.setting;

public class SecurityNotificationSettingsBuilder {
    private boolean showNotification;

    public SecurityNotificationSettingsBuilder() {
        showNotification = false;
    }

    public SecurityNotificationSettingsBuilder showNotification(boolean showNotification) {
        this.showNotification = showNotification;
        return this;
    }

    public it.auties.whatsapp.model.setting.SecurityNotificationSettings build() {
        return new it.auties.whatsapp.model.setting.SecurityNotificationSettings(showNotification);
    }

}
