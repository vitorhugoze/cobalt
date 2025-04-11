package it.auties.whatsapp.model.action;

public class PinActionBuilder {
    private boolean pinned;

    public PinActionBuilder() {
        pinned = false;
    }

    public PinActionBuilder pinned(boolean pinned) {
        this.pinned = pinned;
        return this;
    }

    public it.auties.whatsapp.model.action.PinAction build() {
        return new it.auties.whatsapp.model.action.PinAction(pinned);
    }

}
