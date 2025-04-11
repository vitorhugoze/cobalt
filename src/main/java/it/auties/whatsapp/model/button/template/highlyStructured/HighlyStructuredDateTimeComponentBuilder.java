package it.auties.whatsapp.model.button.template.highlyStructured;

public class HighlyStructuredDateTimeComponentBuilder {
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.DayOfWeek dayOfWeek;
    private int year;
    private int month;
    private int dayOfMonth;
    private int hour;
    private int minute;
    private it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.CalendarType calendar;

    public HighlyStructuredDateTimeComponentBuilder() {
        dayOfWeek = null;
        year = 0;
        month = 0;
        dayOfMonth = 0;
        hour = 0;
        minute = 0;
        calendar = null;
    }

    public HighlyStructuredDateTimeComponentBuilder dayOfWeek(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public HighlyStructuredDateTimeComponentBuilder year(int year) {
        this.year = year;
        return this;
    }

    public HighlyStructuredDateTimeComponentBuilder month(int month) {
        this.month = month;
        return this;
    }

    public HighlyStructuredDateTimeComponentBuilder dayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    public HighlyStructuredDateTimeComponentBuilder hour(int hour) {
        this.hour = hour;
        return this;
    }

    public HighlyStructuredDateTimeComponentBuilder minute(int minute) {
        this.minute = minute;
        return this;
    }

    public HighlyStructuredDateTimeComponentBuilder calendar(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.CalendarType calendar) {
        this.calendar = calendar;
        return this;
    }

    public it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent build() {
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent(dayOfWeek, year, month, dayOfMonth, hour, minute, calendar);
    }

}
