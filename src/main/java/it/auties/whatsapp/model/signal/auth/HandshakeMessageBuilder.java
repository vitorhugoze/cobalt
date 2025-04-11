package it.auties.whatsapp.model.signal.auth;

public class HandshakeMessageBuilder {
    private it.auties.whatsapp.model.signal.auth.ClientHello clientHello;
    private it.auties.whatsapp.model.signal.auth.ServerHello serverHello;
    private it.auties.whatsapp.model.signal.auth.ClientFinish clientFinish;

    public HandshakeMessageBuilder() {
        clientHello = null;
        serverHello = null;
        clientFinish = null;
    }

    public HandshakeMessageBuilder clientHello(it.auties.whatsapp.model.signal.auth.ClientHello clientHello) {
        this.clientHello = clientHello;
        return this;
    }

    public HandshakeMessageBuilder serverHello(it.auties.whatsapp.model.signal.auth.ServerHello serverHello) {
        this.serverHello = serverHello;
        return this;
    }

    public HandshakeMessageBuilder clientFinish(it.auties.whatsapp.model.signal.auth.ClientFinish clientFinish) {
        this.clientFinish = clientFinish;
        return this;
    }

    public it.auties.whatsapp.model.signal.auth.HandshakeMessage build() {
        return new it.auties.whatsapp.model.signal.auth.HandshakeMessage(clientHello, serverHello, clientFinish);
    }

}
