package it.auties.whatsapp.model.signal.session;

public class SessionBuilder {
    private java.util.concurrent.ConcurrentHashMap.KeySetView<it.auties.whatsapp.model.signal.session.SessionState,java.lang.Boolean> states;

    public SessionBuilder() {
        states = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newKeySet();
    }

    public SessionBuilder states(java.util.concurrent.ConcurrentHashMap.KeySetView<it.auties.whatsapp.model.signal.session.SessionState,java.lang.Boolean> states) {
        this.states = states;
        return this;
    }

    public it.auties.whatsapp.model.signal.session.Session build() {
        return new it.auties.whatsapp.model.signal.session.Session(states);
    }

}
