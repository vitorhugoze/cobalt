package it.auties.whatsapp.model.button.base;

import it.auties.protobuf.annotation.ProtobufEnum;
import it.auties.protobuf.annotation.ProtobufEnumIndex;

/**
 * A model that represents the body of a button
 */
public interface ButtonBody {
    /**
     * Returns the type of this body
     *
     * @return a non-null type
     */
    Type bodyType();

    @ProtobufEnum(name = "Message.ButtonsMessage.Button.Type")
    enum Type {
        UNKNOWN(0),
        TEXT(1),
        NATIVE_FLOW(2);

        final int index;

        Type(@ProtobufEnumIndex int index) {
            this.index = index;
        }

        public int index() {
            return index;
        }
    }
}
