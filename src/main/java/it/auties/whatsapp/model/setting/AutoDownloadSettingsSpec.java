package it.auties.whatsapp.model.setting;

import it.auties.whatsapp.model.setting.AutoDownloadSettings;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class AutoDownloadSettingsSpec {
    public static byte[] encode(AutoDownloadSettings protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(AutoDownloadSettings protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var downloadImages = protoInputObject.downloadImages();
        protoOutputStream.writeBool(1, downloadImages);
        var downloadAudio = protoInputObject.downloadAudio();
        protoOutputStream.writeBool(2, downloadAudio);
        var downloadVideo = protoInputObject.downloadVideo();
        protoOutputStream.writeBool(3, downloadVideo);
        var downloadDocuments = protoInputObject.downloadDocuments();
        protoOutputStream.writeBool(4, downloadDocuments);
    }

    public static AutoDownloadSettings decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static AutoDownloadSettings decode(ProtobufInputStream protoInputStream) {
        boolean downloadImages = false;
        boolean downloadAudio = false;
        boolean downloadVideo = false;
        boolean downloadDocuments = false;
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> downloadImages = protoInputStream.readBool();
                case 2 -> downloadAudio = protoInputStream.readBool();
                case 3 -> downloadVideo = protoInputStream.readBool();
                case 4 -> downloadDocuments = protoInputStream.readBool();
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.setting.AutoDownloadSettings(downloadImages, downloadAudio, downloadVideo, downloadDocuments);
    }

    public static int sizeOf(AutoDownloadSettings protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var downloadImages = protoInputObject.downloadImages();
        protoOutputSize += ProtobufOutputStream.getFieldSize(1, 0);
        protoOutputSize += 1;
        var downloadAudio = protoInputObject.downloadAudio();
        protoOutputSize += ProtobufOutputStream.getFieldSize(2, 0);
        protoOutputSize += 1;
        var downloadVideo = protoInputObject.downloadVideo();
        protoOutputSize += ProtobufOutputStream.getFieldSize(3, 0);
        protoOutputSize += 1;
        var downloadDocuments = protoInputObject.downloadDocuments();
        protoOutputSize += ProtobufOutputStream.getFieldSize(4, 0);
        protoOutputSize += 1;
        return protoOutputSize;
    }

}
