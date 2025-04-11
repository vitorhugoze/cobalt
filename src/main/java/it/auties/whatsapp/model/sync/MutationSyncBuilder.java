package it.auties.whatsapp.model.sync;

public class MutationSyncBuilder {
    private it.auties.whatsapp.model.sync.RecordSync.Operation operation;
    private it.auties.whatsapp.model.sync.RecordSync record;

    public MutationSyncBuilder() {
        operation = null;
        record = null;
    }

    public MutationSyncBuilder operation(it.auties.whatsapp.model.sync.RecordSync.Operation operation) {
        this.operation = operation;
        return this;
    }

    public MutationSyncBuilder record(it.auties.whatsapp.model.sync.RecordSync record) {
        this.record = record;
        return this;
    }

    public it.auties.whatsapp.model.sync.MutationSync build() {
        return new it.auties.whatsapp.model.sync.MutationSync(operation, record);
    }

}
