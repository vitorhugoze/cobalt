package it.auties.whatsapp.model.chat;

public class ChatWallpaperBuilder {
    private java.lang.String filename;
    private int opacity;

    public ChatWallpaperBuilder() {
        filename = null;
        opacity = 0;
    }

    public ChatWallpaperBuilder filename(it.auties.protobuf.model.ProtobufString filename) {
        this.filename = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(filename);
        return this;
    }

    public ChatWallpaperBuilder filename(java.lang.String filename) {
        this.filename = filename;
        return this;
    }

    public ChatWallpaperBuilder opacity(int opacity) {
        this.opacity = opacity;
        return this;
    }

    public it.auties.whatsapp.model.chat.ChatWallpaper build() {
        return new it.auties.whatsapp.model.chat.ChatWallpaper(filename, opacity);
    }

}
