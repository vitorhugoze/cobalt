package it.auties.whatsapp.model.action;

public class UserStatusMuteActionBuilder {
    private boolean muted;

    public UserStatusMuteActionBuilder() {
        muted = false;
    }

    public UserStatusMuteActionBuilder muted(boolean muted) {
        this.muted = muted;
        return this;
    }

    public it.auties.whatsapp.model.action.UserStatusMuteAction build() {
        return new it.auties.whatsapp.model.action.UserStatusMuteAction(muted);
    }

}
