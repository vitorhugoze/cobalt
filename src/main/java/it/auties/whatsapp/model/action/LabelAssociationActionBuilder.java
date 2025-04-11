package it.auties.whatsapp.model.action;

public class LabelAssociationActionBuilder {
    private boolean labeled;

    public LabelAssociationActionBuilder() {
        labeled = false;
    }

    public LabelAssociationActionBuilder labeled(boolean labeled) {
        this.labeled = labeled;
        return this;
    }

    public it.auties.whatsapp.model.action.LabelAssociationAction build() {
        return new it.auties.whatsapp.model.action.LabelAssociationAction(labeled);
    }

}
