package it.auties.whatsapp.model.chat;

public class ChatDisappearBuilder {
    private it.auties.whatsapp.model.chat.ChatDisappear.Initiator initiator;

    public ChatDisappearBuilder() {
        initiator = null;
    }

    public ChatDisappearBuilder initiator(it.auties.whatsapp.model.chat.ChatDisappear.Initiator initiator) {
        this.initiator = initiator;
        return this;
    }

    public it.auties.whatsapp.model.chat.ChatDisappear build() {
        return new it.auties.whatsapp.model.chat.ChatDisappear(initiator);
    }

}
