package it.auties.whatsapp.model.button.template.highlyStructured;

import it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredDateTimeComponent.CalendarType;
import java.util.Arrays;
import java.util.Optional;
import it.auties.protobuf.stream.ProtobufOutputStream;
import java.util.Map;
import java.util.HashMap;

public class HighlyStructuredDateTimeComponentCalendarTypeSpec {
    private static final Map<Integer, CalendarType> VALUES = new HashMap<>();
    static {
        VALUES.put(1, CalendarType.GREGORIAN);
        VALUES.put(2, CalendarType.SOLAR_HIJRI);
    }

    public static Integer encode(CalendarType protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return protoInputObject.index;
    }

    public static CalendarType decode(int protoEnumIndex) {
        return decode(protoEnumIndex, null);
    }

    public static CalendarType decode(int protoEnumIndex, CalendarType defaultValue) {
        return VALUES.getOrDefault(protoEnumIndex, defaultValue);
    }

    public static int sizeOf(CalendarType protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        return ProtobufOutputStream.getVarIntSize(protoInputObject.index);
    }

}
