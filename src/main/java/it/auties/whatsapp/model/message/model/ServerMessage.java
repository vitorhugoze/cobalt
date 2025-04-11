package it.auties.whatsapp.model.message.model;

/**
 * A model interface that represents a message sent by a WhatsappWeb's server
 */
public interface ServerMessage extends Message {
    @Override
    default MessageCategory category() {
        return MessageCategory.SERVER;
    }
}
