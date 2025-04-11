package it.auties.whatsapp.model.button.template.hydrated;

public class HydratedFourRowTemplateSimpleBuilder {
    private it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTitle title;
    private java.lang.String body;
    private java.lang.String footer;
    private java.util.List<it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton> buttons;
    private java.lang.String templateId;

    public HydratedFourRowTemplateSimpleBuilder() {
    }

    public HydratedFourRowTemplateSimpleBuilder title(it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplateTitle title) {
        this.title = title;
        return this;
    }

    public HydratedFourRowTemplateSimpleBuilder body(java.lang.String body) {
        this.body = body;
        return this;
    }

    public HydratedFourRowTemplateSimpleBuilder footer(java.lang.String footer) {
        this.footer = footer;
        return this;
    }

    public HydratedFourRowTemplateSimpleBuilder buttons(java.util.List<it.auties.whatsapp.model.button.template.hydrated.HydratedTemplateButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    public HydratedFourRowTemplateSimpleBuilder templateId(java.lang.String templateId) {
        this.templateId = templateId;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate build() {
        return it.auties.whatsapp.model.button.template.hydrated.HydratedFourRowTemplate.customBuilder(title, body, footer, buttons, templateId);
    }

}
