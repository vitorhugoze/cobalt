package it.auties.whatsapp.model.action;

public class NuxActionBuilder {
    private boolean acknowledged;

    public NuxActionBuilder() {
        acknowledged = false;
    }

    public NuxActionBuilder acknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
        return this;
    }

    public it.auties.whatsapp.model.action.NuxAction build() {
        return new it.auties.whatsapp.model.action.NuxAction(acknowledged);
    }

}
