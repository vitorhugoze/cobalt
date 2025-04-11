package it.auties.whatsapp.model.message.standard;

import it.auties.whatsapp.model.message.standard.PollCreationMessage;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class PollCreationMessageSpec {
    public static byte[] encode(PollCreationMessage protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(PollCreationMessage protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var encryptionKey = protoInputObject.encryptionKey();
        if (encryptionKey != null) {
            var encryptionKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encryptionKey);
            if (encryptionKey0 != null) {
                var encryptionKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encryptionKey0);
                if (encryptionKey1 != null) {
                    protoOutputStream.writeBytes(1, encryptionKey1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputStream.writeString(2, title0);
            }
        }
        if (protoInputObject.selectableOptions() != null) {
            for (var selectableOptionsEntry : protoInputObject.selectableOptions()) { 
                if (selectableOptionsEntry != null) {
                    protoOutputStream.writeMessage(3, it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(selectableOptionsEntry));
                    it.auties.whatsapp.model.poll.PollOptionSpec.encode(selectableOptionsEntry, protoOutputStream);
                }
            }
        }
        var selectableOptionsCount = protoInputObject.selectableOptionsCount();
        protoOutputStream.writeUInt32(4, selectableOptionsCount);
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0));
                it.auties.whatsapp.model.info.ContextInfoSpec.encode(contextInfo0, protoOutputStream);
            }
        }
        if (protoInputObject.selectableOptionsMap != null) {
            for (var selectableOptionsMapEntry : protoInputObject.selectableOptionsMap.entrySet()) { 
                protoOutputStream.writeMessage(999, sizeOfSelectableOptionsMap(selectableOptionsMapEntry));
                var selectableOptionsMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(selectableOptionsMapEntry.getKey());
                if (selectableOptionsMapKey0 != null) {
                    protoOutputStream.writeString(1, selectableOptionsMapKey0);
                }
                var selectableOptionsMapValue = selectableOptionsMapEntry.getValue();
                if (selectableOptionsMapValue != null) {
                    protoOutputStream.writeMessage(2, it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(selectableOptionsMapValue));
                    it.auties.whatsapp.model.poll.PollOptionSpec.encode(selectableOptionsMapValue, protoOutputStream);
                }
            }
        }
        if (protoInputObject.selectedOptions != null) {
            for (var selectedOptionsEntry : protoInputObject.selectedOptions) { 
                if (selectedOptionsEntry != null) {
                    protoOutputStream.writeMessage(1000, it.auties.whatsapp.model.poll.SelectedPollOptionSpec.sizeOf(selectedOptionsEntry));
                    it.auties.whatsapp.model.poll.SelectedPollOptionSpec.encode(selectedOptionsEntry, protoOutputStream);
                }
            }
        }
    }

    public static PollCreationMessage decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static PollCreationMessage decode(ProtobufInputStream protoInputStream) {
        byte[] encryptionKey = null;
        java.lang.String title = null;
        java.util.List<it.auties.whatsapp.model.poll.PollOption> selectableOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        int selectableOptionsCount = 0;
        it.auties.whatsapp.model.info.ContextInfo contextInfo = null;
        java.util.Map<java.lang.String,it.auties.whatsapp.model.poll.PollOption> selectableOptionsMap = it.auties.protobuf.builtin.ProtobufMapMixin.newMap();
        java.util.List<it.auties.whatsapp.model.poll.SelectedPollOption> selectedOptions = it.auties.protobuf.builtin.ProtobufRepeatedMixin.newList();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> encryptionKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readBytes());
                case 2 -> title = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString());
                case 3 -> selectableOptions.add(it.auties.whatsapp.model.poll.PollOptionSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> selectableOptionsCount = protoInputStream.readInt32();
                case 5 -> contextInfo = it.auties.whatsapp.model.info.ContextInfoSpec.decode(protoInputStream.readLengthDelimited());
                case 999 -> {
                    var selectableOptionsMapInputStream = protoInputStream.readLengthDelimited();
                    java.lang.String selectableOptionsMapKey = null;
                    it.auties.whatsapp.model.poll.PollOption selectableOptionsMapValue = null;
                    while (selectableOptionsMapInputStream.readTag()) {
                        switch (selectableOptionsMapInputStream.index()) {
                            case 1 -> selectableOptionsMapKey = it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(selectableOptionsMapInputStream.readString());
                            case 2 -> selectableOptionsMapValue = it.auties.whatsapp.model.poll.PollOptionSpec.decode(selectableOptionsMapInputStream.readLengthDelimited());
                        }
                    }
                    selectableOptionsMap.put(selectableOptionsMapKey, selectableOptionsMapValue);
                }
                case 1000 -> selectedOptions.add(it.auties.whatsapp.model.poll.SelectedPollOptionSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.standard.PollCreationMessage(encryptionKey, title, selectableOptions, selectableOptionsCount, contextInfo, selectableOptionsMap, selectedOptions);
    }

    public static int sizeOf(PollCreationMessage protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var encryptionKey = protoInputObject.encryptionKey();
        if (encryptionKey != null) {
            var encryptionKey0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encryptionKey);
            if (encryptionKey0 != null) {
                var encryptionKey1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(encryptionKey0);
                if (encryptionKey1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getBytesSize(encryptionKey1);
                }
            }
        }
        var title = protoInputObject.title();
        if (title != null) {
            var title0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(title);
            if (title0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(title0);
            }
        }
        if (protoInputObject.selectableOptions() != null) {
            for (var selectableOptionsEntry : protoInputObject.selectableOptions()) { 
                if (selectableOptionsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                    var selectableOptionsEntrySerializedSize = it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(selectableOptionsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(selectableOptionsEntrySerializedSize);
                    protoOutputSize += selectableOptionsEntrySerializedSize;
                }
            }
        }
        var selectableOptionsCount = protoInputObject.selectableOptionsCount();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += ProtobufOutputStream.getVarIntSize(selectableOptionsCount);
        var contextInfo = protoInputObject.contextInfo();
        if (contextInfo != null) {
            var contextInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contextInfo);
            if (contextInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var contextInfoSerializedSize = it.auties.whatsapp.model.info.ContextInfoSpec.sizeOf(contextInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contextInfoSerializedSize);
                protoOutputSize += contextInfoSerializedSize;
            }
        }
        var selectableOptionsMapMapField = protoInputObject.selectableOptionsMap;
        if (selectableOptionsMapMapField != null) {
            for (var selectableOptionsMapMapEntry : selectableOptionsMapMapField.entrySet()) { 
                protoOutputSize += ProtobufOutputStream.getFieldSize(999, 2);
                var selectableOptionsMapMapEntrySize = sizeOfSelectableOptionsMap(selectableOptionsMapMapEntry);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(selectableOptionsMapMapEntrySize);
                protoOutputSize += selectableOptionsMapMapEntrySize;
            }
        }
        if (protoInputObject.selectedOptions != null) {
            for (var selectedOptionsEntry : protoInputObject.selectedOptions) { 
                if (selectedOptionsEntry != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1000, 2);
                    var selectedOptionsEntrySerializedSize = it.auties.whatsapp.model.poll.SelectedPollOptionSpec.sizeOf(selectedOptionsEntry);
                    protoOutputSize += ProtobufOutputStream.getVarIntSize(selectedOptionsEntrySerializedSize);
                    protoOutputSize += selectedOptionsEntrySerializedSize;
                }
            }
        }
        return protoOutputSize;
    }

    private static int sizeOfSelectableOptionsMap(java.util.Map.Entry<java.lang.String, it.auties.whatsapp.model.poll.PollOption> protoInputObject) {
        var protoOutputSize = 0;
        var selectableOptionsMapMapKey = protoInputObject.getKey();
        if (selectableOptionsMapMapKey != null) {
            var selectableOptionsMapMapKey0 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(selectableOptionsMapMapKey);
            if (selectableOptionsMapMapKey0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                protoOutputSize += ProtobufOutputStream.getStringSize(selectableOptionsMapMapKey0);
            }
        }
        var selectableOptionsMapMapValue = protoInputObject.getValue();
        if (selectableOptionsMapMapValue != null) {
            protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
            var selectableOptionsMapMapValueSerializedSize = it.auties.whatsapp.model.poll.PollOptionSpec.sizeOf(selectableOptionsMapMapValue);
            protoOutputSize += ProtobufOutputStream.getVarIntSize(selectableOptionsMapMapValueSerializedSize);
            protoOutputSize += selectableOptionsMapMapValueSerializedSize;
        }
        return protoOutputSize;
    }

}
