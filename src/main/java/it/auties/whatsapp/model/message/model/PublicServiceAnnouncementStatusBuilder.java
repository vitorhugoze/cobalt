package it.auties.whatsapp.model.message.model;

public class PublicServiceAnnouncementStatusBuilder {
    private java.lang.String campaignId;
    private long campaignExpirationTimestampSeconds;

    public PublicServiceAnnouncementStatusBuilder() {
        campaignId = null;
        campaignExpirationTimestampSeconds = 0l;
    }

    public PublicServiceAnnouncementStatusBuilder campaignId(it.auties.protobuf.model.ProtobufString campaignId) {
        this.campaignId = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(campaignId);
        return this;
    }

    public PublicServiceAnnouncementStatusBuilder campaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public PublicServiceAnnouncementStatusBuilder campaignExpirationTimestampSeconds(long campaignExpirationTimestampSeconds) {
        this.campaignExpirationTimestampSeconds = campaignExpirationTimestampSeconds;
        return this;
    }

    public it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus build() {
        return new it.auties.whatsapp.model.message.model.PublicServiceAnnouncementStatus(campaignId, campaignExpirationTimestampSeconds);
    }

}
