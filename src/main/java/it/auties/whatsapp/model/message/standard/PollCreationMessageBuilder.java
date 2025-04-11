package it.auties.whatsapp.model.message.standard;

public class PollCreationMessageBuilder {
    private byte[] encryptionKey;
    private java.lang.String title;
    private java.util.List<it.auties.whatsapp.model.poll.PollOption> selectableOptions;
    private int selectableOptionsCount;
    private it.auties.whatsapp.model.info.ContextInfo contextInfo;
    private java.util.Map<java.lang.String,it.auties.whatsapp.model.poll.PollOption> selectableOptionsMap;
    private java.util.List<it.auties.whatsapp.model.poll.SelectedPollOption> selectedOptions;

    public PollCreationMessageBuilder() {
        encryptionKey = null;
        title = null;
        selectableOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        selectableOptionsCount = 0;
        contextInfo = null;
        selectableOptionsMap = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        selectedOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public PollCreationMessageBuilder encryptionKey(java.nio.ByteBuffer encryptionKey) {
        this.encryptionKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(encryptionKey);
        return this;
    }

    public PollCreationMessageBuilder encryptionKey(byte[] encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    public PollCreationMessageBuilder title(it.auties.protobuf.model.ProtobufString title) {
        this.title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(title);
        return this;
    }

    public PollCreationMessageBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public PollCreationMessageBuilder selectableOptions(java.util.List<it.auties.whatsapp.model.poll.PollOption> selectableOptions) {
        this.selectableOptions = selectableOptions;
        return this;
    }

    public PollCreationMessageBuilder selectableOptionsCount(int selectableOptionsCount) {
        this.selectableOptionsCount = selectableOptionsCount;
        return this;
    }

    public PollCreationMessageBuilder contextInfo(it.auties.whatsapp.model.info.ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }

    public PollCreationMessageBuilder selectableOptionsMap(java.util.Map<java.lang.String,it.auties.whatsapp.model.poll.PollOption> selectableOptionsMap) {
        this.selectableOptionsMap = selectableOptionsMap;
        return this;
    }

    public PollCreationMessageBuilder selectedOptions(java.util.List<it.auties.whatsapp.model.poll.SelectedPollOption> selectedOptions) {
        this.selectedOptions = selectedOptions;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.PollCreationMessage build() {
        return new it.auties.whatsapp.model.message.standard.PollCreationMessage(encryptionKey, title, selectableOptions, selectableOptionsCount, contextInfo, selectableOptionsMap, selectedOptions);
    }

}
