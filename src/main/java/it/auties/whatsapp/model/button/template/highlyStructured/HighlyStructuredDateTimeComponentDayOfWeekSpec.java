package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.DayOfWeek;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class HighlyStructuredDateTimeComponentDayOfWeekSpec {
    private static final Map<Integer, DayOfWeek> VALUES = new HashMap<>();
    static {
        VALUES.put(1, DayOfWeek.MONDAY);
        VALUES.put(2, DayOfWeek.TUESDAY);
        VALUES.put(3, DayOfWeek.WEDNESDAY);
        VALUES.put(4, DayOfWeek.THURSDAY);
        VALUES.put(5, DayOfWeek.FRIDAY);
        VALUES.put(6, DayOfWeek.SATURDAY);
        VALUES.put(7, DayOfWeek.SUNDAY);
    }

    public static Integer encode(DayOfWeek protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static DayOfWeek decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static DayOfWeek decode(int protoEnumIndex, DayOfWeek defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(DayOfWeek protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
