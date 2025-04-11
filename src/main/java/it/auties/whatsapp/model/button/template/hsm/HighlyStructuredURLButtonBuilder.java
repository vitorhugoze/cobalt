package it.auties.whatsapp.model.button.template.hsm;

public class HighlyStructuredURLButtonBuilder {
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text;
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage url;

    public HighlyStructuredURLButtonBuilder() {
        text = null;
        url = null;
    }

    public HighlyStructuredURLButtonBuilder text(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage text) {
        this.text = text;
        return this;
    }

    public HighlyStructuredURLButtonBuilder url(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage url) {
        this.url = url;
        return this;
    }

    public it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton build() {
        return new it.auties.whatsapp.model.button.template.hsm.HighlyStructuredURLButton(text, url);
    }

}
