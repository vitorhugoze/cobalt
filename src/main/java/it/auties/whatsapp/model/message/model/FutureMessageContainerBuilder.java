package it.auties.whatsapp.model.message.model;

public class FutureMessageContainerBuilder {
    private it.auties.whatsapp.model.message.model.MessageContainer content;

    public FutureMessageContainerBuilder() {
        content = null;
    }

    public FutureMessageContainerBuilder content(it.auties.whatsapp.model.message.model.MessageContainer content) {
        this.content = content;
        return this;
    }

    public it.auties.whatsapp.model.message.model.FutureMessageContainer build() {
        return new it.auties.whatsapp.model.message.model.FutureMessageContainer(content);
    }

}
