package it.auties.whatsapp.model.action;

public class AndroidUnsupportedActionsBuilder {
    private boolean allowed;

    public AndroidUnsupportedActionsBuilder() {
        allowed = false;
    }

    public AndroidUnsupportedActionsBuilder allowed(boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    public it.auties.whatsapp.model.action.AndroidUnsupportedActions build() {
        return new it.auties.whatsapp.model.action.AndroidUnsupportedActions(allowed);
    }

}
