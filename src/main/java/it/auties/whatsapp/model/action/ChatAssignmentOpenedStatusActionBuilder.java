package it.auties.whatsapp.model.action;

public class ChatAssignmentOpenedStatusActionBuilder {
    private boolean chatOpened;

    public ChatAssignmentOpenedStatusActionBuilder() {
        chatOpened = false;
    }

    public ChatAssignmentOpenedStatusActionBuilder chatOpened(boolean chatOpened) {
        this.chatOpened = chatOpened;
        return this;
    }

    public it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction build() {
        return new it.auties.whatsapp.model.action.ChatAssignmentOpenedStatusAction(chatOpened);
    }

}
