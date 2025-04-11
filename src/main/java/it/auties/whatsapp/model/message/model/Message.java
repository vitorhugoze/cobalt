package it.auties.whatsapp.model.message.model;

/**
 * A model interface that represents a message sent by a contact or by Whatsapp.
 */
public interface Message {
    /**
     * Return message type
     *
     * @return a non-null message type
     */
    MessageType type();

    /**
     * Return message category
     *
     * @return a non-null message category
     */
    MessageCategory category();
}
