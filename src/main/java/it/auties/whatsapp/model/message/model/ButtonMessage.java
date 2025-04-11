package it.auties.whatsapp.model.message.model;

/**
 * A model interface that represents a button message
 */
public interface ButtonMessage extends Message {
    @Override
    default MessageCategory category() {
        return MessageCategory.BUTTON;
    }
}
