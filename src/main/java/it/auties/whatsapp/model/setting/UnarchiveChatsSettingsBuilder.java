package it.auties.whatsapp.model.setting;

public class UnarchiveChatsSettingsBuilder {
    private boolean unarchiveChats;

    public UnarchiveChatsSettingsBuilder() {
        unarchiveChats = false;
    }

    public UnarchiveChatsSettingsBuilder unarchiveChats(boolean unarchiveChats) {
        this.unarchiveChats = unarchiveChats;
        return this;
    }

    public it.auties.whatsapp.model.setting.UnarchiveChatsSettings build() {
        return new it.auties.whatsapp.model.setting.UnarchiveChatsSettings(unarchiveChats);
    }

}
