package it.auties.whatsapp.model.signal.sender;

public class SenderKeyRecordBuilder {
    private java.util.List<it.auties.whatsapp.model.signal.sender.SenderKeyState> states;

    public SenderKeyRecordBuilder() {
        states = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
    }

    public SenderKeyRecordBuilder states(java.util.List<it.auties.whatsapp.model.signal.sender.SenderKeyState> states) {
        this.states = states;
        return this;
    }

    public it.auties.whatsapp.model.signal.sender.SenderKeyRecord build() {
        return new it.auties.whatsapp.model.signal.sender.SenderKeyRecord(states);
    }

}
