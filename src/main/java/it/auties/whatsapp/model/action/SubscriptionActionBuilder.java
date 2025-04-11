package it.auties.whatsapp.model.action;

public class SubscriptionActionBuilder {
    private boolean deactivated;
    private boolean autoRenewing;
    private long expirationDateSeconds;

    public SubscriptionActionBuilder() {
        deactivated = false;
        autoRenewing = false;
        expirationDateSeconds = 0l;
    }

    public SubscriptionActionBuilder deactivated(boolean deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    public SubscriptionActionBuilder autoRenewing(boolean autoRenewing) {
        this.autoRenewing = autoRenewing;
        return this;
    }

    public SubscriptionActionBuilder expirationDateSeconds(long expirationDateSeconds) {
        this.expirationDateSeconds = expirationDateSeconds;
        return this;
    }

    public it.auties.whatsapp.model.action.SubscriptionAction build() {
        return new it.auties.whatsapp.model.action.SubscriptionAction(deactivated, autoRenewing, expirationDateSeconds);
    }

}
