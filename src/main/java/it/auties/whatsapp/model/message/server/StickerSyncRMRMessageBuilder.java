package it.auties.whatsapp.model.message.server;

public class StickerSyncRMRMessageBuilder {
    private java.util.List<java.lang.String> hash;
    private java.lang.String rmrSource;
    private long requestTimestamp;

    public StickerSyncRMRMessageBuilder() {
        hash = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        rmrSource = null;
        requestTimestamp = 0l;
    }

    public StickerSyncRMRMessageBuilder hash(java.util.List<java.lang.String> hash) {
        this.hash = hash;
        return this;
    }

    public StickerSyncRMRMessageBuilder rmrSource(it.auties.protobuf.model.ProtobufString rmrSource) {
        this.rmrSource = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(rmrSource);
        return this;
    }

    public StickerSyncRMRMessageBuilder rmrSource(java.lang.String rmrSource) {
        this.rmrSource = rmrSource;
        return this;
    }

    public StickerSyncRMRMessageBuilder requestTimestamp(long requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
        return this;
    }

    public it.auties.whatsapp.model.message.server.StickerSyncRMRMessage build() {
        return new it.auties.whatsapp.model.message.server.StickerSyncRMRMessage(hash, rmrSource, requestTimestamp);
    }

}
