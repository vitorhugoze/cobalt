package it.auties.whatsapp.model.setting;

public class AutoDownloadSettingsBuilder {
    private boolean downloadImages;
    private boolean downloadAudio;
    private boolean downloadVideo;
    private boolean downloadDocuments;

    public AutoDownloadSettingsBuilder() {
        downloadImages = false;
        downloadAudio = false;
        downloadVideo = false;
        downloadDocuments = false;
    }

    public AutoDownloadSettingsBuilder downloadImages(boolean downloadImages) {
        this.downloadImages = downloadImages;
        return this;
    }

    public AutoDownloadSettingsBuilder downloadAudio(boolean downloadAudio) {
        this.downloadAudio = downloadAudio;
        return this;
    }

    public AutoDownloadSettingsBuilder downloadVideo(boolean downloadVideo) {
        this.downloadVideo = downloadVideo;
        return this;
    }

    public AutoDownloadSettingsBuilder downloadDocuments(boolean downloadDocuments) {
        this.downloadDocuments = downloadDocuments;
        return this;
    }

    public it.auties.whatsapp.model.setting.AutoDownloadSettings build() {
        return new it.auties.whatsapp.model.setting.AutoDownloadSettings(downloadImages, downloadAudio, downloadVideo, downloadDocuments);
    }

}
