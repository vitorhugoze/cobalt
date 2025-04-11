package it.auties.whatsapp.model.action;

public class StarActionBuilder {
    private boolean starred;

    public StarActionBuilder() {
        starred = false;
    }

    public StarActionBuilder starred(boolean starred) {
        this.starred = starred;
        return this;
    }

    public it.auties.whatsapp.model.action.StarAction build() {
        return new it.auties.whatsapp.model.action.StarAction(starred);
    }

}
