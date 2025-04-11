package it.auties.whatsapp.model.privacy;

public class PrivacySettingEntryBuilder {
    private it.auties.whatsapp.model.privacy.PrivacySettingType type;
    private it.auties.whatsapp.model.privacy.PrivacySettingValue value;
    private java.util.List<it.auties.whatsapp.model.jid.Jid> excluded;

    public PrivacySettingEntryBuilder() {
        type = null;
        value = null;
        excluded = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public PrivacySettingEntryBuilder type(it.auties.whatsapp.model.privacy.PrivacySettingType type) {
        this.type = type;
        return this;
    }

    public PrivacySettingEntryBuilder value(it.auties.whatsapp.model.privacy.PrivacySettingValue value) {
        this.value = value;
        return this;
    }

    public PrivacySettingEntryBuilder excluded(java.util.List<it.auties.whatsapp.model.jid.Jid> excluded) {
        this.excluded = excluded;
        return this;
    }

    public it.auties.whatsapp.model.privacy.PrivacySettingEntry build() {
        return new it.auties.whatsapp.model.privacy.PrivacySettingEntry(type, value, excluded);
    }

}
