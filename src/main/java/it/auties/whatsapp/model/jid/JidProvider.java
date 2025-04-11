package it.auties.whatsapp.model.jid;

/**
 * Utility interface to make providing a jid easier
 */
public interface JidProvider {
    /**
     * Returns this object as a jid
     *
     * @return a non-null jid
     */
    Jid toJid();
}
