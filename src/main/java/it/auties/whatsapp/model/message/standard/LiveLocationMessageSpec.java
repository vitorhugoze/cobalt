package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.LiveLocationMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class LiveLocationMessageSpec {
    public static byte[] encode(LiveLocationMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(LiveLocationMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var latitude = protoInputObject.latitude();
        protoOutputStream.writeDouble(1, latitude);
        var longitude = protoInputObject.longitude();
        protoOutputStream.writeDouble(2, longitude);
        var accuracy = protoInputObject.accuracy();
        protoOutputStream.writeUInt32(3, accuracy);
        var speed = protoInputObject.speed();
        protoOutputStream.writeFloat(4, speed);
        var magneticNorthOffset = protoInputObject.magneticNorthOffset();
        protoOutputStream.writeUInt32(5, magneticNorthOffset);
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(6, caption1);
                }
            }
        }
        var sequenceNumber = protoInputObject.sequenceNumber();
        protoOutputStream.writeUInt64(7, sequenceNumber);
        var timeOffset = protoInputObject.timeOffset();
        protoOutputStream.writeUInt32(8, timeOffset);
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputStream.writeBytes(16, thumbnail1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(17, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
    }

    public static LiveLocationMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static LiveLocationMessage decode(ProtobufInputStream protoInputStream) {
        double latitude = 0d;
        double longitude = 0d;
        int accuracy = 0;
        float speed = 0f;
        int magneticNorthOffset = 0;
        java.lang.String caption = null;
        long sequenceNumber = 0l;
        int timeOffset = 0;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> latitude = protoInputStream.readDouble();
                case 2 -> longitude = protoInputStream.readDouble();
                case 3 -> accuracy = protoInputStream.readInt32();
                case 4 -> speed = protoInputStream.readFloat();
                case 5 -> magneticNorthOffset = protoInputStream.readInt32();
                case 6 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 7 -> sequenceNumber = protoInputStream.readInt64();
                case 8 -> timeOffset = protoInputStream.readInt32();
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.LiveLocationMessage(latitude, longitude, accuracy, speed, magneticNorthOffset, caption, sequenceNumber, timeOffset, thumbnail, contextInfo);
    }

    public static int sizeOf(LiveLocationMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var latitude = protoInputObject.latitude();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 1);
        protoOutputSize += 8;
        var longitude = protoInputObject.longitude();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 1);
        protoOutputSize += 8;
        var accuracy = protoInputObject.accuracy();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(accuracy);
        var speed = protoInputObject.speed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 5);
        protoOutputSize += 4;
        var magneticNorthOffset = protoInputObject.magneticNorthOffset();
        protoOutputSize += ProtobufOutputStream.getFieldSize(5, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(magneticNorthOffset);
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
        var sequenceNumber = protoInputObject.sequenceNumber();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(sequenceNumber);
        var timeOffset = protoInputObject.timeOffset();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(timeOffset);
        var thumbnail = protoInputObject.thumbnail();
        if (thumbnail != null) {
            var thumbnail0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(thumbnail);
            if (thumbnail0 != null) {
                var thumbnail1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(thumbnail0);
                if (thumbnail1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(thumbnail1);
                }
            }
        }
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(17, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
