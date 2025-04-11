package it.auties.whatsapp.api;

public class WebHistorySettingBuilder {
    private int size;
    private boolean newsletters;

    public WebHistorySettingBuilder() {
        size = 0;
        newsletters = false;
    }

    public WebHistorySettingBuilder size(int size) {
        this.size = size;
        return this;
    }

    public WebHistorySettingBuilder newsletters(boolean newsletters) {
        this.newsletters = newsletters;
        return this;
    }

    public it.auties.whatsapp.api.WebHistorySetting build() {
        return new it.auties.whatsapp.api.WebHistorySetting(size, newsletters);
    }

}
