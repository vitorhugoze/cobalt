package it.auties.whatsapp.model.sync;

public class DeviceListMetadataBuilder {
    private byte[] senderKeyHash;
    private java.lang.Long senderTimestamp;
    private java.util.List<java.lang.Integer> senderKeyIndexes;
    private byte[] recipientKeyHash;
    private java.lang.Long recipientTimestamp;
    private java.util.List<java.lang.Integer> recipientKeyIndexes;

    public DeviceListMetadataBuilder() {
        senderKeyHash = null;
        senderTimestamp = null;
        senderKeyIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        recipientKeyHash = null;
        recipientTimestamp = null;
        recipientKeyIndexes = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public DeviceListMetadataBuilder senderKeyHash(java.nio.ByteBuffer senderKeyHash) {
        this.senderKeyHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(senderKeyHash);
        return this;
    }

    public DeviceListMetadataBuilder senderKeyHash(byte[] senderKeyHash) {
        this.senderKeyHash = senderKeyHash;
        return this;
    }

    public DeviceListMetadataBuilder senderTimestamp(java.lang.Long senderTimestamp) {
        this.senderTimestamp = senderTimestamp;
        return this;
    }

    public DeviceListMetadataBuilder senderKeyIndexes(java.util.List<java.lang.Integer> senderKeyIndexes) {
        this.senderKeyIndexes = senderKeyIndexes;
        return this;
    }

    public DeviceListMetadataBuilder recipientKeyHash(java.nio.ByteBuffer recipientKeyHash) {
        this.recipientKeyHash = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(recipientKeyHash);
        return this;
    }

    public DeviceListMetadataBuilder recipientKeyHash(byte[] recipientKeyHash) {
        this.recipientKeyHash = recipientKeyHash;
        return this;
    }

    public DeviceListMetadataBuilder recipientTimestamp(java.lang.Long recipientTimestamp) {
        this.recipientTimestamp = recipientTimestamp;
        return this;
    }

    public DeviceListMetadataBuilder recipientKeyIndexes(java.util.List<java.lang.Integer> recipientKeyIndexes) {
        this.recipientKeyIndexes = recipientKeyIndexes;
        return this;
    }

    public it.auties.whatsapp.model.sync.DeviceListMetadata build() {
        return new it.auties.whatsapp.model.sync.DeviceListMetadata(senderKeyHash, senderTimestamp, senderKeyIndexes, recipientKeyHash, recipientTimestamp, recipientKeyIndexes);
    }

}
