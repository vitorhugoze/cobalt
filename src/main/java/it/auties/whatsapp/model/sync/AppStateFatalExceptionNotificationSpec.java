package it.auties.whatsapp.model.sync;

import it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AppStateFatalExceptionNotificationSpec {
    public static byte[] encode(AppStateFatalExceptionNotification protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AppStateFatalExceptionNotification protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        if (protoInputObject.collectionNames() != null) {
            for (var collectionNamesEntry : protoInputObject.collectionNames()) { 
                if (collectionNamesEntry != null) {
                    var collectionNames0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(collectionNamesEntry);
                    if (collectionNames0 != null) {
                        protoOutputStream.writeString(1, collectionNames0);
                    }
                }
            }
        }
        var timestamp = protoInputObject.timestamp();
        if (timestamp != null) {
            protoOutputStream.writeInt64(2, timestamp);
        }
    }

    public static AppStateFatalExceptionNotification decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AppStateFatalExceptionNotification decode(ProtobufInputStream protoInputStream) {
        java.util.List<java.lang.String> collectionNames = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        java.lang.Long timestamp = null;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> collectionNames.add(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> timestamp = protoInputStream.readInt64();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.sync.AppStateFatalExceptionNotification(collectionNames, timestamp);
    }

    public static int sizeOf(AppStateFatalExceptionNotification protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        if (protoInputObject.collectionNames() != null) {
            for (var collectionNamesEntry : protoInputObject.collectionNames()) { 
                if (collectionNamesEntry != null) {
                    var collectionNamesEntry0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(collectionNamesEntry);
                    if (collectionNamesEntry0 != null) {
                        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                        protoOutputSize += ProtobufOutputStream.getStringSize(collectionNamesEntry0);
                    }
                }
            }
        }
        var timestamp = protoInputObject.timestamp();
        if (timestamp != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(timestamp);
        }
        return protoOutputSize;
    }

}
