package it.auties.whatsapp.model.poll;

public class PollUpdateEncryptedOptionsBuilder {
    private java.util.List<byte[]> selectedOptions;

    public PollUpdateEncryptedOptionsBuilder() {
        selectedOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public PollUpdateEncryptedOptionsBuilder selectedOptions(java.util.List<byte[]> selectedOptions) {
        this.selectedOptions = selectedOptions;
        return this;
    }

    public it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions build() {
        return new it.auties.whatsapp.model.poll.PollUpdateEncryptedOptions(selectedOptions);
    }

}
