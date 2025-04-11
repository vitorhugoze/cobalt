package it.auties.whatsapp.model.sync;

public class AppStateFatalExceptionNotificationBuilder {
    private java.util.List<java.lang.String> collectionNames;
    private java.lang.Long timestamp;

    public AppStateFatalExceptionNotificationBuilder() {
        collectionNames = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        timestamp = null;
    }

    public AppStateFatalExceptionNotificationBuilder collectionNames(java.util.List<java.lang.String> collectionNames) {
        this.collectionNames = collectionNames;
        return this;
    }

    public AppStateFatalExceptionNotificationBuilder timestamp(java.lang.Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification build() {
        return new it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification(collectionNames, timestamp);
    }

}
