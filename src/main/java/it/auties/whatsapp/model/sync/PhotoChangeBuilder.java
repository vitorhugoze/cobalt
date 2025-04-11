package it.auties.whatsapp.model.sync;

public class PhotoChangeBuilder {
    private byte[] oldPhoto;
    private byte[] newPhoto;
    private java.lang.Integer newPhotoId;

    public PhotoChangeBuilder() {
        oldPhoto = null;
        newPhoto = null;
        newPhotoId = null;
    }

    public PhotoChangeBuilder oldPhoto(java.nio.ByteBuffer oldPhoto) {
        this.oldPhoto = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(oldPhoto);
        return this;
    }

    public PhotoChangeBuilder oldPhoto(byte[] oldPhoto) {
        this.oldPhoto = oldPhoto;
        return this;
    }

    public PhotoChangeBuilder newPhoto(java.nio.ByteBuffer newPhoto) {
        this.newPhoto = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(newPhoto);
        return this;
    }

    public PhotoChangeBuilder newPhoto(byte[] newPhoto) {
        this.newPhoto = newPhoto;
        return this;
    }

    public PhotoChangeBuilder newPhotoId(java.lang.Integer newPhotoId) {
        this.newPhotoId = newPhotoId;
        return this;
    }

    public it.auties.whatsapp.model.sync.PhotoChange build() {
        return new it.auties.whatsapp.model.sync.PhotoChange(oldPhoto, newPhoto, newPhotoId);
    }

}
