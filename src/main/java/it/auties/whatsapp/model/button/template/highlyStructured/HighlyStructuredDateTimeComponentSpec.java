package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class HighlyStructuredDateTimeComponentSpec {
    public static byte[] encode(HighlyStructuredDateTimeComponent protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(HighlyStructuredDateTimeComponent protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var dayOfWeek = protoInputObject.dayOfWeek();
        if (dayOfWeek != null) {
            var dayOfWeek0 = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentDayOfWeekSpec.encode(dayOfWeek);
            protoOutputStream.writeInt32(1, dayOfWeek0);
        }
        var year = protoInputObject.year();
        protoOutputStream.writeUInt32(2, year);
        var month = protoInputObject.month();
        protoOutputStream.writeUInt32(3, month);
        var dayOfMonth = protoInputObject.dayOfMonth();
        protoOutputStream.writeUInt32(4, dayOfMonth);
        var hour = protoInputObject.hour();
        protoOutputStream.writeUInt32(5, hour);
        var minute = protoInputObject.minute();
        protoOutputStream.writeUInt32(6, minute);
        var calendar = protoInputObject.calendar();
        if (calendar != null) {
            var calendar0 = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentCalendarTypeSpec.encode(calendar);
            protoOutputStream.writeInt32(7, calendar0);
        }
    }

    public static HighlyStructuredDateTimeComponent decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static HighlyStructuredDateTimeComponent decode(ProtobufInputStream protoInputStream) {
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.DayOfWeek dayOfWeek = null;
        int year = 0;
        int month = 0;
        int dayOfMonth = 0;
        int hour = 0;
        int minute = 0;
        it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.CalendarType calendar = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> dayOfWeek = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentDayOfWeekSpec.decode(protoInputStream.readInt32());
                case 2 -> year = protoInputStream.readInt32();
                case 3 -> month = protoInputStream.readInt32();
                case 4 -> dayOfMonth = protoInputStream.readInt32();
                case 5 -> hour = protoInputStream.readInt32();
                case 6 -> minute = protoInputStream.readInt32();
                case 7 -> calendar = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentCalendarTypeSpec.decode(protoInputStream.readInt32());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent(dayOfWeek, year, month, dayOfMonth, hour, minute, calendar);
    }

    public static int sizeOf(HighlyStructuredDateTimeComponent protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var dayOfWeek = protoInputObject.dayOfWeek();
        if (dayOfWeek != null) {
            var dayOfWeek0 = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentDayOfWeekSpec.encode(dayOfWeek);
            protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(dayOfWeek0);
        }
        var year = protoInputObject.year();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(year);
        var month = protoInputObject.month();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(month);
        var dayOfMonth = protoInputObject.dayOfMonth();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(dayOfMonth);
        var hour = protoInputObject.hour();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(hour);
        var minute = protoInputObject.minute();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(minute);
        var calendar = protoInputObject.calendar();
        if (calendar != null) {
            var calendar0 = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponentCalendarTypeSpec.encode(calendar);
            protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(calendar0);
        }
        return protoOutputSize;
    }

}
