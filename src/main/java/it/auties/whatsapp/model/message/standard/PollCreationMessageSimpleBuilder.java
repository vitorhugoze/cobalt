package it.auties.whatsapp.model.message.standard;

public class PollCreationMessageSimpleBuilder {
    private java.lang.String title;
    private java.util.List<it.auties.whatsapp.model.poll.PollOption> selectableOptions;

    public PollCreationMessageSimpleBuilder() {
    }

    public PollCreationMessageSimpleBuilder title(java.lang.String title) {
        this.title = title;
        return this;
    }

    public PollCreationMessageSimpleBuilder selectableOptions(java.util.List<it.auties.whatsapp.model.poll.PollOption> selectableOptions) {
        this.selectableOptions = selectableOptions;
        return this;
    }

    public it.auties.whatsapp.model.message.standard.PollCreationMessage build() {
        return it.auties.whatsapp.model.message.standard.PollCreationMessage.simpleBuilder(title, selectableOptions);
    }

}
