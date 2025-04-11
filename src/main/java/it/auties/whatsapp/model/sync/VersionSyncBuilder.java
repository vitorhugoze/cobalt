package it.auties.whatsapp.model.sync;

public class VersionSyncBuilder {
    private java.lang.Long version;

    public VersionSyncBuilder() {
        version = null;
    }

    public VersionSyncBuilder version(java.lang.Long version) {
        this.version = version;
        return this;
    }

    public it.auties.whatsapp.model.sync.VersionSync build() {
        return new it.auties.whatsapp.model.sync.VersionSync(version);
    }

}
