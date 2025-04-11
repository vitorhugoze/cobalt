package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.LocationMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class LocationMessageSpec {
    public static byte[] encode(LocationMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(LocationMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var latitude = protoInputObject.latitude();
        protoOutputStream.writeDouble(1, latitude);
        var longitude = protoInputObject.longitude();
        protoOutputStream.writeDouble(2, longitude);
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(name);
            if (name0 != null) {
                var name1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name0);
                if (name1 != null) {
                    protoOutputStream.writeString(3, name1);
                }
            }
        }
        var address = protoInputObject.address();
        if (address != null) {
            var address0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(address);
            if (address0 != null) {
                var address1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(address0);
                if (address1 != null) {
                    protoOutputStream.writeString(4, address1);
                }
            }
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(url);
            if (url0 != null) {
                var url1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url0);
                if (url1 != null) {
                    protoOutputStream.writeString(5, url1);
                }
            }
        }
        var live = protoInputObject.live();
        protoOutputStream.writeBool(6, live);
        var accuracy = protoInputObject.accuracy();
        protoOutputStream.writeUInt32(7, accuracy);
        var speed = protoInputObject.speed();
        protoOutputStream.writeFloat(8, speed);
        var magneticNorthOffset = protoInputObject.magneticNorthOffset();
        protoOutputStream.writeUInt32(9, magneticNorthOffset);
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputStream.writeString(11, caption1);
                }
            }
        }
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

    public static LocationMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static LocationMessage decode(ProtobufInputStream protoInputStream) {
        double latitude = 0d;
        double longitude = 0d;
        java.lang.String name = null;
        java.lang.String address = null;
        java.lang.String url = null;
        boolean live = false;
        int accuracy = 0;
        float speed = 0f;
        int magneticNorthOffset = 0;
        java.lang.String caption = null;
        byte[] thumbnail = null;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> latitude = protoInputStream.readDouble();
                case 2 -> longitude = protoInputStream.readDouble();
                case 3 -> name = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 4 -> address = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 5 -> url = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 6 -> live = protoInputStream.readBool();
                case 7 -> accuracy = protoInputStream.readInt32();
                case 8 -> speed = protoInputStream.readFloat();
                case 9 -> magneticNorthOffset = protoInputStream.readInt32();
                case 11 -> caption = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 16 -> thumbnail = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 17 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.LocationMessage(latitude, longitude, name, address, url, live, accuracy, speed, magneticNorthOffset, caption, thumbnail, contextInfo);
    }

    public static int sizeOf(LocationMessage protoInputObject) {
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
        var name = protoInputObject.name();
        if (name != null) {
            var name0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(name);
            if (name0 != null) {
                var name1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(name0);
                if (name1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(name1);
                }
            }
        }
        var address = protoInputObject.address();
        if (address != null) {
            var address0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(address);
            if (address0 != null) {
                var address1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(address0);
                if (address1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(address1);
                }
            }
        }
        var url = protoInputObject.url();
        if (url != null) {
            var url0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(url);
            if (url0 != null) {
                var url1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(url0);
                if (url1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(url1);
                }
            }
        }
        var live = protoInputObject.live();
        protoOutputSize += ProtobufOutputStream.getFieldSize(6, 0);
        protoOutputSize += 1;
        var accuracy = protoInputObject.accuracy();
        protoOutputSize += ProtobufOutputStream.getFieldSize(7, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(accuracy);
        var speed = protoInputObject.speed();
        protoOutputSize += ProtobufOutputStream.getFieldSize(8, 5);
        protoOutputSize += 4;
        var magneticNorthOffset = protoInputObject.magneticNorthOffset();
        protoOutputSize += ProtobufOutputStream.getFieldSize(9, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(magneticNorthOffset);
        var caption = protoInputObject.caption();
        if (caption != null) {
            var caption0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(caption);
            if (caption0 != null) {
                var caption1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(caption0);
                if (caption1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(11, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(caption1);
                }
            }
        }
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
