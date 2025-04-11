package it.auties.whatsapp.model.media;

public class MediaDataBuilder {
    private java.lang.String localPath;

    public MediaDataBuilder() {
        localPath = null;
    }

    public MediaDataBuilder localPath(it.auties.protobuf.model.ProtobufString localPath) {
        this.localPath = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(localPath);
        return this;
    }

    public MediaDataBuilder localPath(java.lang.String localPath) {
        this.localPath = localPath;
        return this;
    }

    public it.auties.whatsapp.model.media.MediaData build() {
        return new it.auties.whatsapp.model.media.MediaData(localPath);
    }

}
