package it.auties.whatsapp.model.message.button;

import it.auties.protobuf.annotation.ProtobufEnum;
import it.auties.protobuf.annotation.ProtobufEnumIndex;

/**
 * A model class that represents a message that can be used as the content of a {@link InteractiveMessage}
 */
public interface InteractiveMessageContent {
    /**
     * Returns the type of this content
     *
     * @return a non-null type
     */
    Type contentType();

    /**
     * The constants of this enumerated type describe the various types of content that an interactive
     * message can wrap
     */
    @ProtobufEnum
    enum Type {
        /**
         * No content
         */
        NONE(0),
        /**
         * Shop
         */
        SHOP(1),
        /**
         * Collection
         */
        COLLECTION(2),
        /**
         * Native flow
         */
        NATIVE_FLOW(3);

        final int index;

        Type(@ProtobufEnumIndex int index) {
            this.index = index;
        }

        public int index() {
            return this.index;
        }
    }
}
