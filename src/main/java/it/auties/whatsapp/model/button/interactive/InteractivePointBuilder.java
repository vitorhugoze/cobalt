package it.auties.whatsapp.model.button.interactive;

public class InteractivePointBuilder {
    private int xDeprecated;
    private int yDeprecated;
    private double x;
    private double y;

    public InteractivePointBuilder() {
        xDeprecated = 0;
        yDeprecated = 0;
        x = 0d;
        y = 0d;
    }

    public InteractivePointBuilder xDeprecated(int xDeprecated) {
        this.xDeprecated = xDeprecated;
        return this;
    }

    public InteractivePointBuilder yDeprecated(int yDeprecated) {
        this.yDeprecated = yDeprecated;
        return this;
    }

    public InteractivePointBuilder x(double x) {
        this.x = x;
        return this;
    }

    public InteractivePointBuilder y(double y) {
        this.y = y;
        return this;
    }

    public it.auties.whatsapp.model.button.interactive.InteractivePoint build() {
        return new it.auties.whatsapp.model.button.interactive.InteractivePoint(xDeprecated, yDeprecated, x, y);
    }

}
